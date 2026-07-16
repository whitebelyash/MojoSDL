package git.mojo.sdl;

import android.app.Activity;
import android.view.Surface;

import java.util.Locale;

public class SDLActivity {

    protected static Surface mSurface;

    public static void initialize() {
        mSurface = null;
    }

    public static void setNativeSurface(Surface surface){
        SDLActivity.mSurface = surface;
    }

    // Native method declarations
    public static native String nativeGetVersion();
    public static native void nativeSetupJNI();
    public static native int nativeGetCompiledSubsystems();
    public static native boolean nativeIsHIDAPIEnabled();
    public static native void nativeInitMainThread();
    public static native void nativeCleanupMainThread();
    public static native int nativeRunMain(String library, String function, Object arguments);
    public static native void nativeLowMemory();
    public static native void nativeSendQuit();
    public static native void nativeQuit();
    public static native void nativePause();
    public static native void nativeResume();
    public static native void nativeFocusChanged(boolean hasFocus);
    public static native void onNativeDropFile(String filename);
    public static native void nativeSetScreenResolution(int surfaceWidth, int surfaceHeight, int deviceWidth, int deviceHeight, float density, float rate);
    public static native void onNativeResize();
    public static native void onNativeKeyDown(int keycode);
    public static native void onNativeKeyUp(int keycode);
    public static native boolean onNativeSoftReturnKey();
    public static native void onNativeKeyboardFocusLost();
    public static native void onNativeMouse(int button, int action, float x, float y, boolean relative);
    public static native void onNativeTouch(int touchDevId, int pointerFingerId,
                                            int action, float x,
                                            float y, float p);
    public static native void onNativePen(int penId, int device_type, int button, int action, float x, float y, float p);
    public static native void onNativeClipboardChanged();
    public static native void onNativeSurfaceCreated();
    public static native void onNativeSurfaceChanged();
    public static native void onNativeSurfaceDestroyed();
    public static native void onNativeScreenKeyboardShown();
    public static native void onNativeScreenKeyboardHidden();
    public static native String nativeGetHint(String name);
    public static native boolean nativeGetHintBoolean(String name, boolean default_value);
    public static native void nativeSetenv(String name, String value);
    public static native void nativeSetNaturalOrientation(int orientation);
    public static native void onNativeRotationChanged(int rotation);
    public static native void onNativeInsetsChanged(int left, int right, int top, int bottom);
    public static native void nativeAddTouch(int touchId, String name);
    public static native void nativePermissionResult(int requestCode, boolean result);
    public static native void onNativeLocaleChanged();
    public static native void onNativeDarkModeChanged(boolean enabled);
    public static native boolean nativeAllowRecreateActivity();
    public static native int nativeCheckSDLThreadCounter();
    public static native void onNativeFileDialog(int requestCode, String[] filelist, int filter);
    public static native void onNativePinchStart(float span_x, float span_y, float focus_x, float focus_y);
    public static native void onNativePinchUpdate(float scale, float span_x, float span_y, float focus_x, float focus_y);
    public static native void onNativePinchEnd();

    public static Surface getNativeSurface() {
        return mSurface;
    }

    public static Activity getContext() {
        // TODO: return the activity context
        return null;
    }

    public static void manualBackButton() {
        // TODO
    }

    public static void setOrientation(int w, int h, boolean resizable, String hint) {
        // TODO
    }

    public static boolean shouldMinimizeOnFocusLoss() {
        // TODO
        return false;
    }

    public static boolean supportsRelativeMouse() {
        // TODO
        return false;
    }

    public static boolean setRelativeMouseEnabled(boolean enabled) {
        // TODO
        return false;
    }

    public static void initTouch() {
        // TODO
    }

    public static boolean clipboardHasText() {
        // TODO
        return false;
    }

    public static String clipboardGetText() {
        // TODO
        return null;
    }

    public static void clipboardSetText(String string) {
        // TODO
    }

    public static int createCustomCursor(int[] colors, int width, int height, int hotSpotX, int hotSpotY) {
        // TODO
        return 0;
    }

    public static void destroyCustomCursor(int cursorID) {
        // TODO
    }

    public static boolean setCustomCursor(int cursorID) {
        // TODO
        return false;
    }

    public static boolean setSystemCursor(int cursorID) {
        // TODO
        return false;
    }

    public static void requestPermission(String permission, int requestCode) {
        // TODO
    }

    public static boolean openURL(String url) {
        // TODO
        return false;
    }

    public static boolean showToast(String message, int duration, int gravity, int xOffset, int yOffset) {
        // TODO
        return false;
    }

    public static int openFileDescriptor(String uri, String mode) {
        // TODO
        return -1;
    }

    public static boolean showFileDialog(String[] filters, boolean allowMultiple, int type, String initialPath, int requestCode) {
        // TODO
        return false;
    }

    public static String getPreferredLocales() {
        // TODO
        return "";
    }

    public static String formatLocale(Locale locale) {
        // TODO
        return locale.toString();
    }
}
