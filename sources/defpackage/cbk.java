package defpackage;

import android.os.SystemClock;
import android.util.Printer;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: cbk  reason: default package */
/* loaded from: classes.dex */
public final class cbk implements gzv {
    private static final ltg d = ltg.j("com/google/android/apps/inputmethod/libs/delight5/InputContextLock");
    public static final cbk a = new cbk();
    public static volatile int b = 0;
    public static final hhl c = hhq.f("input_context_lock_version", 0);

    private cbk() {
        gzt.a.a(this);
    }

    public static Object a(Callable callable) {
        Object call;
        try {
            if (d()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                synchronized (a) {
                    c(SystemClock.elapsedRealtime() - elapsedRealtime, true);
                    call = callable.call();
                }
                return call;
            }
            return callable.call();
        } catch (Exception e) {
            ((ltd) ((ltd) ((ltd) d.c()).i(e)).k("com/google/android/apps/inputmethod/libs/delight5/InputContextLock", "mayLockAndRun", '~', "InputContextLock.java")).t("Failed to run");
            return null;
        }
    }

    public static void b(Runnable runnable) {
        if (d()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            synchronized (a) {
                c(SystemClock.elapsedRealtime() - elapsedRealtime, true);
                runnable.run();
            }
            return;
        }
        runnable.run();
    }

    public static void c(long j, boolean z) {
        caq caqVar;
        if (j >= 3) {
            ((ltd) ((ltd) d.c()).k("com/google/android/apps/inputmethod/libs/delight5/InputContextLock", "maybeTrackAcquireLockTime", 64, "InputContextLock.java")).Y(j, z);
            ieh j2 = ieh.j();
            if (z) {
                caqVar = caq.INPUT_CONTEXT_LONG_LOCK_MAIN_THREAD;
            } else {
                caqVar = caq.INPUT_CONTEXT_LONG_LOCK_ANY_THREAD;
            }
            j2.g(caqVar, j);
        }
    }

    private static boolean d() {
        return b == 0;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        int i = b;
        printer.println("inputContextLockVersion=" + i);
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "InputContextLock";
    }
}
