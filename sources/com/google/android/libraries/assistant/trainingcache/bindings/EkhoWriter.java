package com.google.android.libraries.assistant.trainingcache.bindings;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EkhoWriter implements AutoCloseable {
    private static final ltg a = ltg.j("com/google/android/libraries/assistant/trainingcache/bindings/EkhoWriter");
    private final AtomicLong b = new AtomicLong(nativeCreate());

    public static native void nativeBeginSession(long j, int i);

    public static native void nativeCacheEvent(long j, int i, int i2, byte[] bArr, String str, byte[] bArr2);

    public static native void nativeClearAsync(long j);

    private static native long nativeCreate();

    private static native void nativeDestroy(long j);

    private static native void nativeDisableWriting(long j);

    public static native void nativeEnableWriting(long j);

    private static native void nativeEndSession(long j, int i);

    private static native void nativeFlushAndWait(long j);

    private static native void nativeFlushAsync(long j);

    private static native String[] nativeGetSchemaNames(long j);

    public static native void nativeInit(long j, byte[] bArr);

    private static native boolean nativeIsInitialized(long j);

    private static native boolean nativeIsWritingEnabled(long j);

    private static native void nativeResetPolicyConfig(long j, byte[] bArr);

    private static native void nativeResetRuntimeParams(long j, byte[] bArr);

    public final long a() {
        return this.b.get();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        long andSet = this.b.getAndSet(0L);
        if (andSet == 0) {
            ((ltd) ((ltd) a.d()).k("com/google/android/libraries/assistant/trainingcache/bindings/EkhoWriter", "close", 38, "EkhoWriter.java")).t("Already closed.");
        } else {
            nativeDestroy(andSet);
        }
    }
}
