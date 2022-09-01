package com.google.android.libraries.assistant.trainingcache.bindings;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EkhoTraining implements AutoCloseable {
    private static final ltg a = ltg.j("com/google/android/libraries/assistant/trainingcache/bindings/EkhoTraining");
    private final AtomicLong b = new AtomicLong(nativeCreate());

    private static native long nativeCreate();

    public static native long nativeCreateMaterializer(long j, String str);

    private static native void nativeDestroy(long j);

    private static native String[] nativeGetRegisteredCollections(long j);

    public static native void nativeInit(long j, byte[] bArr, byte[] bArr2);

    public final long a() {
        return this.b.get();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        long andSet = this.b.getAndSet(0L);
        if (andSet == 0) {
            ((ltd) ((ltd) a.d()).k("com/google/android/libraries/assistant/trainingcache/bindings/EkhoTraining", "close", 33, "EkhoTraining.java")).t("Already closed.");
        } else {
            nativeDestroy(andSet);
        }
    }
}
