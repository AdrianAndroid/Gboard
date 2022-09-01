package com.google.android.libraries.assistant.trainingcache.bindings;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EkhoMaintenance implements AutoCloseable {
    private static final ltg a = ltg.j("com/google/android/libraries/assistant/trainingcache/bindings/EkhoMaintenance");
    private final AtomicLong b = new AtomicLong(nativeCreate());

    public static ngz b(byte[] bArr, ngz ngzVar) {
        ngy fj = ngzVar.fj();
        try {
            fj.cr(bArr, nfb.b());
        } catch (ngd e) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/libraries/assistant/trainingcache/bindings/EkhoMaintenance", "parseMessage", 'T', "EkhoMaintenance.java")).t("Failed to parse message.");
        }
        return fj.cz();
    }

    public static native byte[] nativeCleanUp(long j);

    private static native void nativeClear(long j);

    private static native long nativeCreate();

    private static native void nativeDestroy(long j);

    public static native byte[] nativeGetCacheMetrics(long j);

    private static native byte[] nativeGetLastCleanupCycleSummary(long j);

    private static native void nativeInit(long j, byte[] bArr);

    public final long a() {
        return this.b.get();
    }

    public final void c(nnf nnfVar) {
        nativeInit(a(), nnfVar.q());
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        long andSet = this.b.getAndSet(0L);
        if (andSet == 0) {
            ((ltd) ((ltd) a.d()).k("com/google/android/libraries/assistant/trainingcache/bindings/EkhoMaintenance", "close", 38, "EkhoMaintenance.java")).t("Already closed.");
        } else {
            nativeDestroy(andSet);
        }
    }
}
