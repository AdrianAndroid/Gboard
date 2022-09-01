package com.google.android.libraries.performance.primes.metrics.crash;

import com.google.android.libraries.performance.primes.metrics.crash.NativeCrashHandlerImpl;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class NativeCrashHandlerImpl implements kel {
    private static final ltg c = ltg.j("com/google/android/libraries/performance/primes/metrics/crash/NativeCrashHandlerImpl");
    final CountDownLatch a = new CountDownLatch(1);
    final CountDownLatch b = new CountDownLatch(1);
    private boolean d;
    private final lfb e;

    public NativeCrashHandlerImpl(lfb lfbVar) {
        this.e = lfbVar;
    }

    private static native ByteBuffer awaitSignal();

    static native void doDiscardNativeCrashes();

    private static native boolean initializeSignalHandler();

    private static native void unblockSignalHandler();

    @Override // defpackage.kel
    public final synchronized void a(final kee keeVar) {
        if (this.d) {
            return;
        }
        this.d = true;
        Thread thread = new Thread(new Runnable() { // from class: kem
            @Override // java.lang.Runnable
            public final void run() {
                NativeCrashHandlerImpl.this.b(keeVar);
            }
        }, "Primes-nativecrash-sidecar");
        thread.setDaemon(true);
        thread.setPriority(10);
        thread.start();
    }

    public final /* synthetic */ void b(kee keeVar) {
        if (!this.e.e() || ((Boolean) ((oiy) this.e.a()).a()).booleanValue()) {
            try {
                System.loadLibrary("native_crash_handler_jni");
                if (!initializeSignalHandler()) {
                    ((ltd) ((ltd) c.d()).k("com/google/android/libraries/performance/primes/metrics/crash/NativeCrashHandlerImpl", "lambda$initialize$0", 62, "NativeCrashHandlerImpl.java")).t("unable to initialize signal handler");
                    return;
                }
                try {
                    this.a.countDown();
                    ByteBuffer awaitSignal = awaitSignal();
                    njm njmVar = null;
                    if (awaitSignal != null) {
                        try {
                            njmVar = (njm) nfm.y(njm.a, awaitSignal, nfb.a());
                        } catch (Throwable unused) {
                        }
                    }
                    nfh g = ((keh) keeVar).g();
                    if (g.c) {
                        g.cD();
                        g.c = false;
                    }
                    oog oogVar = (oog) g.b;
                    oog oogVar2 = oog.j;
                    oogVar.f = 5;
                    oogVar.a |= 16;
                    if (njmVar != null) {
                        if (g.c) {
                            g.cD();
                            g.c = false;
                        }
                        oog oogVar3 = (oog) g.b;
                        oogVar3.i = njmVar;
                        oogVar3.a |= 512;
                    }
                    ((keh) keeVar).e((oog) g.cz());
                    return;
                } finally {
                    unblockSignalHandler();
                }
            } catch (UnsatisfiedLinkError e) {
                ((ltd) ((ltd) ((ltd) c.d()).i(e)).k("com/google/android/libraries/performance/primes/metrics/crash/NativeCrashHandlerImpl", "lambda$initialize$0", ':', "NativeCrashHandlerImpl.java")).t("unable to load native_crash_handler_jni");
                return;
            }
        }
        this.b.countDown();
    }
}
