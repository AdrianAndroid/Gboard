package com.google.android.apps.inputmethod.libs.mozc.session;

import com.google.android.libraries.inputmethod.nativelib.NativeLibHelper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class MozcJNI {
    private static final lug a = hin.a;
    private static volatile boolean b = false;

    private MozcJNI() {
    }

    public static boolean a(String str, String str2) {
        jdg.u(str);
        if (b) {
            return true;
        }
        synchronized (MozcJNI.class) {
            if (b) {
                return true;
            }
            System.nanoTime();
            NativeLibHelper.a("mozc", true);
            if (!initialize()) {
                ((luc) ((luc) a.c()).k("com/google/android/apps/inputmethod/libs/mozc/session/MozcJNI", "load", 49, "MozcJNI.java")).t("initialize fails");
                return false;
            } else if (!onPostLoad(str, str2)) {
                ((luc) ((luc) a.c()).k("com/google/android/apps/inputmethod/libs/mozc/session/MozcJNI", "load", 53, "MozcJNI.java")).t("onPostLoad fails");
                return false;
            } else {
                b = true;
                System.nanoTime();
                return true;
            }
        }
    }

    public static native synchronized byte[] evalCommand(byte[] bArr);

    public static native String getDataVersion();

    private static native boolean initialize();

    private static native synchronized boolean onPostLoad(String str, String str2);
}
