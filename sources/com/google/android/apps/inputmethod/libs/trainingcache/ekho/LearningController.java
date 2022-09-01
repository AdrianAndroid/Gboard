package com.google.android.apps.inputmethod.libs.trainingcache.ekho;

import com.google.android.libraries.inputmethod.nativelib.NativeLibHelper;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LearningController {
    private boolean a = false;
    private boolean b = false;

    public static native void nativeOnInputContextSnapshot(byte[] bArr);

    public static native void nativeSetEnableSpeechCaching(boolean z);

    public final synchronized void a() {
        if (this.a) {
            return;
        }
        if (this.b) {
            throw new UnsatisfiedLinkError("Previously failed to load native library.");
        }
        try {
            NativeLibHelper.a("gboard_soda_jni", true);
            this.a = true;
        } catch (UnsatisfiedLinkError e) {
            this.b = true;
            throw e;
        }
    }
}
