package com.google.android.apps.inputmethod.libs.hmmgesture;

/* compiled from: PG */
/* loaded from: classes.dex */
public class HmmGestureDecoder implements AutoCloseable {
    public long a;

    static {
        lug lugVar = hin.a;
    }

    public HmmGestureDecoder(long j) {
        this.a = j;
    }

    public static long b(long j, long j2, String str) {
        if (JniUtil.a) {
            return nativeCreate(j, j2, str, "");
        }
        return 0L;
    }

    private static native long nativeCreate(long j, long j2, String str, String str2);

    private native void nativeRelease(long j);

    private native void nativeReloadOnDataOrSettingChanged(long j);

    private native void nativeReset(long j);

    private native boolean nativeSetKeyboardLayout(long j, int i, byte[] bArr);

    private static native void nativeStartProfiling();

    private static native void nativeStopProfiling();

    public final void a() {
        if (JniUtil.a) {
            nativeReset(this.a);
        }
    }

    public final void c(int i, mrm mrmVar) {
        if (JniUtil.a) {
            nativeSetKeyboardLayout(this.a, i, mrmVar.q());
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (JniUtil.a) {
            long j = this.a;
            if (j != 0) {
                nativeRelease(j);
            }
            this.a = 0L;
        }
    }

    public native long nativeDecode(long j, byte[] bArr);

    public native long nativeGetFilteredResults(long j, String[] strArr);
}
