package io.anuke.arc.audio.mock;

import io.anuke.arc.audio.*;

/**
 * The headless backend does its best to mock elements. This is intended to make code-sharing between
 * server and client as simple as possible.
 */
public class MockSound implements Sound{

    @Override
    public int at(float x, float y, float pitch){
        return 0;
    }

    @Override
    public int play(float volume, float pitch, float pan, boolean looping){
        return 0;
    }

    @Override
    public void stop(){

    }

    @Override
    public void pause(){

    }

    @Override
    public void resume(){

    }

    @Override
    public void dispose(){

    }

    @Override
    public void stop(int soundId){

    }

    @Override
    public void pause(int soundId){

    }

    @Override
    public void resume(int soundId){

    }

    @Override
    public void setLooping(int soundId, boolean looping){

    }

    @Override
    public void setPitch(int soundId, float pitch){

    }

    @Override
    public void setVolume(int soundId, float volume){

    }

    @Override
    public void setPan(int soundId, float pan, float volume){

    }
}
