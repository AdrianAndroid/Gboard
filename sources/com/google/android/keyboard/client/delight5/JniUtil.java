package com.google.android.keyboard.client.delight5;

import com.google.android.libraries.inputmethod.nativelib.NativeLibHelper;
import java.io.UnsupportedEncodingException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class JniUtil {
    private static final lug logger = lug.i("Delight5");
    private static volatile boolean nativeLibraryLoaded = false;

    private JniUtil() {
    }

    private static native int init(byte[] bArr);

    public static void loadLibrary(String str) {
        if (nativeLibraryLoaded) {
            return;
        }
        synchronized (JniUtil.class) {
            if (nativeLibraryLoaded) {
                return;
            }
            if (!NativeLibHelper.a("jni_delight5decoder", false)) {
                return;
            }
            try {
                if (init(str.getBytes("UTF-8")) == 0) {
                    ((luc) logger.a(hip.a).k("com/google/android/keyboard/client/delight5/JniUtil", "loadLibrary", 40, "JniUtil.java")).w("Failed to init native crash dir: %s", str);
                } else {
                    nativeLibraryLoaded = true;
                }
            } catch (UnsupportedEncodingException e) {
                ((luc) ((luc) logger.a(hip.a).i(e)).k("com/google/android/keyboard/client/delight5/JniUtil", "loadLibrary", 45, "JniUtil.java")).w("Failed to init native crash dir: %s", str);
            }
        }
    }
}
