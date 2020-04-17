package arc.input;

import arc.KeyBinds.KeybindValue;

/** Enum for storing input codes of mouse, keyboard and controllers. */
public enum KeyCode implements KeybindValue{
    //controller general
    CONTROLLER_A(KeyType.controller, "A"),
    CONTROLLER_B(KeyType.controller, "B"),
    CONTROLLER_X(KeyType.controller, "X"),
    CONTROLLER_Y(KeyType.controller, "Y"),
    CONTROLLER_GUIDE(KeyType.controller, "Guide"),
    CONTROLLER_L_BUMPER(KeyType.controller, "L Bumper"),
    CONTROLLER_R_BUMPER(KeyType.controller, "R Bumper"),
    CONTROLLER_BACK(KeyType.controller, "Back"),
    CONTROLLER_START(KeyType.controller, "Start"),
    CONTROLLER_L_STICK(KeyType.controller, "L Stick"),
    CONTROLLER_R_STICK(KeyType.controller, "R Stick"),
    //pov
    CONTROLLER_DPAD_UP(KeyType.controller, "D-Pad Up"),
    CONTROLLER_DPAD_DOWN(KeyType.controller, "D-Pad Down"),
    CONTROLLER_DPAD_LEFT(KeyType.controller, "D-Pad Left"),
    CONTROLLER_DPAD_RIGHT(KeyType.controller, "D-Pad Right"),
    //controller axes
    CONTROLLER_L_TRIGGER(KeyType.controller, "L Trigger", true),
    CONTROLLER_R_TRIGGER(KeyType.controller, "R Trigger", true),
    CONTROLLER_L_STICK_VERTICAL_AXIS(KeyType.controller, "L Stick Y Axis", true),
    CONTROLLER_L_STICK_HORIZONTAL_AXIS(KeyType.controller, "L Stick X Axis", true),
    CONTROLLER_R_STICK_VERTICAL_AXIS(KeyType.controller, "R Stick Y Axis", true),
    CONTROLLER_R_STICK_HORIZONTAL_AXIS(KeyType.controller, "R Stick X Axis", true),
    //mouse
    MOUSE_LEFT(KeyType.mouse, "Mouse Left"),
    MOUSE_RIGHT(KeyType.mouse, "Mouse Right"),
    MOUSE_MIDDLE(KeyType.mouse, "Mouse Middle"),
    MOUSE_BACK(KeyType.mouse, "Mouse Back"),
    MOUSE_FORWARD(KeyType.mouse, "Mouse Forward"),
    //scroll
    SCROLL(KeyType.scroll, "Scrollwheel", true),
    //keyboard
    ANY_KEY(KeyType.key, "Any Key"),
    NUM_0(KeyType.key, "0"),
    NUM_1(KeyType.key, "1"),
    NUM_2(KeyType.key, "2"),
    NUM_3(KeyType.key, "3"),
    NUM_4(KeyType.key, "4"),
    NUM_5(KeyType.key, "5"),
    NUM_6(KeyType.key, "6"),
    NUM_7(KeyType.key, "7"),
    NUM_8(KeyType.key, "8"),
    NUM_9(KeyType.key, "9"),
    A(KeyType.key, "A"),
    ALT_LEFT(KeyType.key, "L-Alt"),
    ALT_RIGHT(KeyType.key, "R-Alt"),
    APOSTROPHE(KeyType.key, "'"),
    AT(KeyType.key, "@"),
    B(KeyType.key, "B"),
    BACK(KeyType.key, "Back"),
    BACKSLASH(KeyType.key, "\\"),
    C(KeyType.key, "C"),
    CALL(KeyType.key, "Call"),
    CAMERA(KeyType.key, "Camera"),
    CLEAR(KeyType.key, "Clear"),
    COMMA(KeyType.key, ","),
    D(KeyType.key, "D"),
    DEL(KeyType.key, "Delete"),
    BACKSPACE(KeyType.key, "Delete"),
    FORWARD_DEL(KeyType.key, "Forward Delete"),
    DPAD_CENTER(KeyType.key, "Center"),
    DPAD_DOWN(KeyType.key, "Down"),
    DPAD_LEFT(KeyType.key, "Left"),
    DPAD_RIGHT(KeyType.key, "Right"),
    DPAD_UP(KeyType.key, "Up"),
    CENTER(KeyType.key, "Center"),
    DOWN(KeyType.key, "Down"),
    LEFT(KeyType.key, "Left"),
    RIGHT(KeyType.key, "Right"),
    UP(KeyType.key, "Up"),
    E(KeyType.key, "E"),
    ENDCALL(KeyType.key, "End Call"),
    ENTER(KeyType.key, "Enter"),
    ENVELOPE(KeyType.key, "Envelope"),
    EQUALS(KeyType.key, "="),
    EXPLORER(KeyType.key, "Explorer"),
    F(KeyType.key, "F"),
    FOCUS(KeyType.key, "Focus"),
    G(KeyType.key, "G"),
    BACKTICK(KeyType.key, "`"),
    H(KeyType.key, "H"),
    HEADSETHOOK(KeyType.key, "Headset Hook"),
    HOME(KeyType.key, "Home"),
    I(KeyType.key, "I"),
    J(KeyType.key, "J"),
    K(KeyType.key, "K"),
    L(KeyType.key, "L"),
    LEFT_BRACKET(KeyType.key, "["),
    M(KeyType.key, "M"),
    MEDIA_FAST_FORWARD(KeyType.key, "Fast Forward"),
    MEDIA_NEXT(KeyType.key, "Next Media"),
    MEDIA_PLAY_PAUSE(KeyType.key, "Play/Pause"),
    MEDIA_PREVIOUS(KeyType.key, "Prev Media"),
    MEDIA_REWIND(KeyType.key, "Rewind"),
    MEDIA_STOP(KeyType.key, "Stop Media"),
    MENU(KeyType.key, "Menu"),
    MINUS(KeyType.key, "-"),
    MUTE(KeyType.key, "Mute"),
    N(KeyType.key, "N"),
    NOTIFICATION(KeyType.key, "Notification"),
    NUM(KeyType.key, "Num"),
    O(KeyType.key, "O"),
    P(KeyType.key, "P"),
    PERIOD(KeyType.key, "."),
    PLUS(KeyType.key, "Plus"),
    POUND(KeyType.key, "#"),
    POWER(KeyType.key, "Power"),
    Q(KeyType.key, "Q"),
    R(KeyType.key, "R"),
    RIGHT_BRACKET(KeyType.key, "]"),
    S(KeyType.key, "S"),
    SEARCH(KeyType.key, "Search"),
    SEMICOLON(KeyType.key, ";"),
    SHIFT_LEFT(KeyType.key, "L-Shift"),
    SHIFT_RIGHT(KeyType.key, "R-Shift"),
    SLASH(KeyType.key, "/"),
    SOFT_LEFT(KeyType.key, "Soft Left"),
    SOFT_RIGHT(KeyType.key, "Soft Right"),
    SPACE(KeyType.key, "Space"),
    STAR(KeyType.key, "*"),
    SYM(KeyType.key, "SYM"),
    T(KeyType.key, "T"),
    TAB(KeyType.key, "Tab"),
    U(KeyType.key, "U"),
    UNKNOWN(KeyType.key, "Unknown"),
    V(KeyType.key, "V"),
    VOLUME_DOWN(KeyType.key, "Volume Down"),
    VOLUME_UP(KeyType.key, "Volume Up"),
    W(KeyType.key, "W"),
    X(KeyType.key, "X"),
    Y(KeyType.key, "Y"),
    Z(KeyType.key, "Z"),
    META_ALT_LEFT_ON(KeyType.key, "9"),
    META_ALT_ON(KeyType.key, "Soft Right"),
    META_ALT_RIGHT_ON(KeyType.key, "D"),
    META_SHIFT_LEFT_ON(KeyType.key, "Explorer"),
    META_SHIFT_ON(KeyType.key, "Soft Left"),
    META_SHIFT_RIGHT_ON(KeyType.key, "null"),
    META_SYM_ON(KeyType.key, "Back"),
    CONTROL_LEFT(KeyType.key, "L-Ctrl"),
    CONTROL_RIGHT(KeyType.key, "R-Ctrl"),
    ESCAPE(KeyType.key, "Escape"),
    END(KeyType.key, "End"),
    INSERT(KeyType.key, "Insert"),
    PAGE_UP(KeyType.key, "Page Up"),
    PAGE_DOWN(KeyType.key, "Page Down"),
    PICTSYMBOLS(KeyType.key, "PICTSYMBOLS"),
    SWITCH_CHARSET(KeyType.key, "SWITCH_CHARSET"),
    BUTTON_CIRCLE(KeyType.key, "F12"),
    BUTTON_A(KeyType.key, "A Button"),
    BUTTON_B(KeyType.key, "B Button"),
    BUTTON_C(KeyType.key, "C Button"),
    BUTTON_X(KeyType.key, "X Button"),
    BUTTON_Y(KeyType.key, "Y Button"),
    BUTTON_Z(KeyType.key, "Z Button"),
    BUTTON_L1(KeyType.key, "L1 Button"),
    BUTTON_R1(KeyType.key, "R1 Button"),
    BUTTON_L2(KeyType.key, "L2 Button"),
    BUTTON_R2(KeyType.key, "R2 Button"),
    BUTTON_THUMBL(KeyType.key, "Left Thumb"),
    BUTTON_THUMBR(KeyType.key, "Right Thumb"),
    BUTTON_START(KeyType.key, "Start"),
    BUTTON_SELECT(KeyType.key, "Select"),
    BUTTON_MODE(KeyType.key, "Button Mode"),
    NUMPAD_0(KeyType.key, "Numpad 0"),
    NUMPAD_1(KeyType.key, "Numpad 1"),
    NUMPAD_2(KeyType.key, "Numpad 2"),
    NUMPAD_3(KeyType.key, "Numpad 3"),
    NUMPAD_4(KeyType.key, "Numpad 4"),
    NUMPAD_5(KeyType.key, "Numpad 5"),
    NUMPAD_6(KeyType.key, "Numpad 6"),
    NUMPAD_7(KeyType.key, "Numpad 7"),
    NUMPAD_8(KeyType.key, "Numpad 8"),
    NUMPAD_9(KeyType.key, "Numpad 9"),
    COLON(KeyType.key, ":"),
    F1(KeyType.key, "F1"),
    F2(KeyType.key, "F2"),
    F3(KeyType.key, "F3"),
    F4(KeyType.key, "F4"),
    F5(KeyType.key, "F5"),
    F6(KeyType.key, "F6"),
    F7(KeyType.key, "F7"),
    F8(KeyType.key, "F8"),
    F9(KeyType.key, "F9"),
    F10(KeyType.key, "F10"),
    F11(KeyType.key, "F11"),
    F12(KeyType.key, "F12"),
    UNSET(KeyType.key, "Unset"),
    APPLICATION(KeyType.key, "Application"),
    ASTERISK(KeyType.key, "*"),
    CAPS_LOCK(KeyType.key, "Caps Lock"),
    PAUSE(KeyType.key, "Pause"),
    PRINT_SCREEN(KeyType.key, "Print Screen"),
    scrollLock(KeyType.key, "Scroll Lock");

    public static final KeyCode[] all = values();
    public final KeyType type;
    public final String value;
    public final boolean axis;

    KeyCode(KeyType type, String value){
        this(type, value, false);
    }

    KeyCode(KeyType type, String value, boolean axis){
        this.type = type;
        this.value = value;
        this.axis = axis;
    }

    public static KeyCode byOrdinal(int id){
        if(id < 0 || id >= all.length) throw new ArrayIndexOutOfBoundsException("Invalid key code: " + id);
        return all[id];
    }

    @Override
    public String toString(){
        return value;
    }

    public enum KeyType{
        key, mouse, controller, scroll
    }
}
