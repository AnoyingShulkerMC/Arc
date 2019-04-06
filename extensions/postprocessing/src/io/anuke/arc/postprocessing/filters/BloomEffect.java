package io.anuke.arc.postprocessing.filters;

import io.anuke.arc.Core;
import io.anuke.arc.graphics.*;
import io.anuke.arc.graphics.glutils.FrameBuffer;
import io.anuke.arc.input.KeyCode;
import io.anuke.arc.postprocessing.PostEffect;
import io.anuke.arc.postprocessing.PostProcessor;
import io.anuke.arc.postprocessing.filters.Blur.BlurType;
import io.anuke.arc.postprocessing.utils.PingPongBuffer;
import io.anuke.arc.util.ScreenUtils;

public final class BloomEffect extends PostEffect{
    private PingPongBuffer pingPongBuffer;

    public Blur blur;
    public Threshold threshold;
    public Combine combine;
    public Blending blending = Blending.disabled;
    public float scaling = 1/4f;

    public BloomEffect(){
        int width = Core.graphics.getWidth(), height = Core.graphics.getHeight();

        pingPongBuffer = PostProcessor.newPingPongBuffer((int)(width * scaling), (int)(height * scaling));
        blur = new Blur((int)(width * scaling), (int)(height * scaling));
        threshold = new Threshold();
        combine = new Combine();

        blur.type = BlurType.Gaussian5x5b;
        blur.passes = 2;
        threshold.threshold = 0.277f;
        combine.baseIntensity = 1f;
        combine.baseSaturation = 1f;
        combine.effectIntensity = 1.1f;
        combine.effectSaturation = 0.85f;
    }

    @Override
    public void resize(int width, int height){
        pingPongBuffer.resize((int)(width * scaling), (int)(height * scaling));
        blur.resize((int)(width * scaling), (int)(height * scaling));

        rebind();
    }

    @Override
    public void dispose(){
        combine.dispose();
        threshold.dispose();
        blur.dispose();
        pingPongBuffer.dispose();
    }

    @Override
    public void render(final FrameBuffer src, final FrameBuffer dest){
        Texture texsrc = src.getTexture();

        Core.gl.glDisable(GL20.GL_BLEND);

        pingPongBuffer.begin();

        // threshold / high-pass filter
        // only areas with pixels >= threshold are blit to smaller fbo
        threshold.setInput(texsrc).setOutput(pingPongBuffer.getSourceBuffer()).render();

        // blur pass
        blur.render(pingPongBuffer);

        if(Core.input.keyTap(KeyCode.T)){
            ScreenUtils.saveScreenshot(Core.files.external("b.png"));
        }

        pingPongBuffer.end();

        if(blending != Blending.disabled){
            Core.gl.glEnable(GL20.GL_BLEND);
            Core.gl.glBlendFunc(blending.src, blending.dst);
        }

        combine.setOutput(dest);
        combine.setInput(texsrc, pingPongBuffer.getResultTexture()).render();

        if(Core.input.keyTap(KeyCode.T)){
            ScreenUtils.saveScreenshot(Core.files.external("c.png"));
        }
    }

    @Override
    public void rebind(){
        blur.rebind();
        threshold.rebind();
        combine.rebind();
        pingPongBuffer.rebind();
    }
}