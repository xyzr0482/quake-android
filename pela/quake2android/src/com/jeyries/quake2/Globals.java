
package com.jeyries.quake2;

import android.view.KeyEvent;

class Globals {
	public static String ApplicationName = "quake2";

	public static String AppLibraries[] = { "sdl-1.2"};

	public static final boolean Using_SDL_1_3 = false;

	// Should be zip fileshare_pak.zip
	//public static String DataDownloadUrl = "Share pak(8M)|http://quake-android.googlecode.com/files/share_pak.zip";
    public static String DataDownloadUrl = "Share pak(48M)|data.zip";

	// Set this value to true if you're planning to render 3D using OpenGL - it 
//eats some GFX resources, so disabled for 2D
	public static boolean NeedDepthBuffer = false;

	public static boolean SwVideoMode = true;

	public static boolean HorizontalOrientation = true;

	// prevent device from going to suspend mode
	public static boolean InhibitSuspend = true;

	// Readme text to be shown on download page
	public static String ReadmeText = "^You may press \"Home\" now - the data will be downloaded in background".replace("^","\n");

	public static String CommandLine = "";

	public static boolean AppUsesMouse = true;
	
	public static boolean AppNeedsTwoButtonMouse = true;

	public static boolean AppNeedsArrowKeys = true;

	public static boolean AppNeedsTextInput = true;

	public static boolean AppUsesJoystick = false;

	public static boolean AppHandlesJoystickSensitivity = true;

	public static boolean AppUsesMultitouch = false;

	public static boolean NonBlockingSwapBuffers = false;

	public static int AppTouchscreenKeyboardKeysAmount = 0;

	public static int AppTouchscreenKeyboardKeysAmountAutoFire = 0;

	// Phone-specific config, TODO: move this to settings
	public static boolean DownloadToSdcard = true;
	public static boolean PhoneHasTrackball = false;
	public static boolean PhoneHasArrowKeys = false;
	public static boolean UseAccelerometerAsArrowKeys = false;
	public static boolean UseTouchscreenKeyboard = true;
	public static int TouchscreenKeyboardSize = 1;
	public static int TouchscreenKeyboardTheme = 2;
	public static int TouchscreenKeyboardTransparency = 2;
	public static int AccelerometerSensitivity = 2;
	public static int AccelerometerCenterPos = 2;
	public static int TrackballDampening = 0;
	public static int AudioBufferConfig = 0;
	public static boolean OptionalDataDownload[] = null;
	public static final int LEFT_CLICK_NORMAL = 0;
	public static final int LEFT_CLICK_NEAR_CURSOR = 1;
	public static final int LEFT_CLICK_WITH_MULTITOUCH = 2;
	public static final int LEFT_CLICK_WITH_PRESSURE = 3;
	public static final int LEFT_CLICK_WITH_KEY = 4;
	public static final int LEFT_CLICK_WITH_TIMEOUT = 5;
	public static final int LEFT_CLICK_WITH_TAP = 6;
	public static final int LEFT_CLICK_WITH_TAP_OR_TIMEOUT = 7;
	public static int LeftClickMethod = AppNeedsTwoButtonMouse ? LEFT_CLICK_WITH_TAP_OR_TIMEOUT : LEFT_CLICK_NORMAL;
	public static int LeftClickKey = KeyEvent.KEYCODE_DPAD_CENTER;
	public static int LeftClickTimeout = 3;
	public static final int RIGHT_CLICK_NONE = 0;
	public static final int RIGHT_CLICK_WITH_MULTITOUCH = 1;
	public static final int RIGHT_CLICK_WITH_PRESSURE = 2;
	public static final int RIGHT_CLICK_WITH_KEY = 3;
	public static final int RIGHT_CLICK_WITH_TIMEOUT = 4;
	public static int RightClickTimeout = 4;
	public static int RightClickMethod = AppNeedsTwoButtonMouse ? RIGHT_CLICK_WITH_MULTITOUCH : RIGHT_CLICK_NONE;
	public static int RightClickKey = KeyEvent.KEYCODE_MENU;
	public static boolean MoveMouseWithJoystick = false;
	public static int MoveMouseWithJoystickSpeed = 0;
	public static int MoveMouseWithJoystickAccel = 0;
	public static boolean ClickMouseWithDpad = false;
	public static boolean RelativeMouseMovement = AppNeedsTwoButtonMouse; // Laptop touchpad mode
	public static int RelativeMouseMovementSpeed = 2;
	public static int RelativeMouseMovementAccel = 0;
	public static boolean ShowScreenUnderFinger = false;
	public static boolean KeepAspectRatio = false;
	public static int ClickScreenPressure = 0;
	public static int ClickScreenTouchspotSize = 0;
	//public static int RemapHwKeycode[] = new int[SDL_Keys.JAVA_KEYCODE_LAST];
	public static int RemapScreenKbKeycode[] = new int[6];
	public static boolean ScreenKbControlsShown[] = new boolean[8]; /* Also joystick and text input button added */
	public static int ScreenKbControlsLayout[][] = new int[8][4];
	public static int RemapMultitouchGestureKeycode[] = new int[4];
	public static boolean MultitouchGesturesUsed[] = new boolean[4];
	public static int MultitouchGestureSensitivity = 1;
	public static int TouchscreenCalibration[] = new int[4];
	public static String DataDir ="/sdcard/baseq2";
	public static boolean SmoothVideo = false;
	public static boolean MultiThreadedVideo = false;
	public static int leftKey;
	public static int rightKey;
	public static int upKey;
	public static int downKey;
	public static int fireKey;
	public static int doorKey;
	public static int tleftKey;
	public static int trightKey;
	
	public static int current_key = KeyEvent.KEYCODE_1;
    public static boolean keyBindingUseVolumeButton(){
       if(leftKey == KeyEvent.KEYCODE_VOLUME_DOWN ||
        leftKey == KeyEvent.KEYCODE_VOLUME_UP) {
            return true;
       } else if(rightKey == KeyEvent.KEYCODE_VOLUME_DOWN ||
        rightKey == KeyEvent.KEYCODE_VOLUME_UP) {
            return true;
       } else if(upKey == KeyEvent.KEYCODE_VOLUME_DOWN ||
        upKey == KeyEvent.KEYCODE_VOLUME_UP) {
            return true;
       } else if(downKey == KeyEvent.KEYCODE_VOLUME_DOWN ||
        downKey == KeyEvent.KEYCODE_VOLUME_UP) {
            return true;
       } else if(fireKey == KeyEvent.KEYCODE_VOLUME_DOWN ||
        fireKey == KeyEvent.KEYCODE_VOLUME_UP) {
            return true;
       } else if(doorKey == KeyEvent.KEYCODE_VOLUME_DOWN ||
        doorKey == KeyEvent.KEYCODE_VOLUME_UP) {
            return true;
       } else if(tleftKey == KeyEvent.KEYCODE_VOLUME_DOWN ||
        tleftKey == KeyEvent.KEYCODE_VOLUME_UP) {
            return true;
       } else if(trightKey == KeyEvent.KEYCODE_VOLUME_DOWN ||
        trightKey == KeyEvent.KEYCODE_VOLUME_UP) {
            return true;
       }
       return false;
    }
	public static int TranslateScancode(int code, boolean pressed) {
		int ret = code;
		/*do not remap back key*/
		if(code == KeyEvent.KEYCODE_BACK ||
            code == KeyEvent.KEYCODE_MENU)
			return code;
		if(code == Globals.leftKey)
			ret = KeyEvent.KEYCODE_DPAD_LEFT;
		else if(code == Globals.rightKey)
			ret =  KeyEvent.KEYCODE_DPAD_RIGHT;
		else if(code == Globals.upKey)
			ret =  KeyEvent.KEYCODE_DPAD_UP;
		else if(code == Globals.downKey)
			ret = KeyEvent.KEYCODE_DPAD_DOWN;
		else if(code == Globals.fireKey)
			ret = 133;//KeyEvent.KEYCODE_J;
		else if(code == Globals.doorKey) {
			if(!pressed) {
			ret =  current_key++;
			} else {
				ret = current_key;
			}
			if(current_key > KeyEvent.KEYCODE_9)
				current_key = KeyEvent.KEYCODE_1;
		}else if(code == Globals.tleftKey)
			ret = 23;//KeyEvent.KEYCODE_A; //used for return
		else if(code == Globals.trightKey)
			ret =  KeyEvent.KEYCODE_D;
		
		if(ret != code) {
//			Log.v("doom", "origin code:"+ code + "tran:"+ret);
		}
		return ret;
	}

}

