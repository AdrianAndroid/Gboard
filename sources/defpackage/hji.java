package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: hji  reason: default package */
/* loaded from: classes.dex */
public final class hji {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/future/MoreFutures");
    public static final Callable b = hcb.c;
    public static final hix c = new hje();

    public static Object a(Future future, Object obj) {
        Object S;
        if (future == null) {
            return obj;
        }
        try {
            S = kcu.S(future);
        } catch (IllegalStateException | ExecutionException unused) {
        }
        return S != null ? S : obj;
    }

    public static Object b(Future future) {
        return a(future, null);
    }

    public static void c(mko mkoVar, hiu hiuVar, hiu hiuVar2, Executor executor) {
        kcu.U(mkoVar, new gnr(hiuVar, hiuVar2, 2), executor);
    }

    public static boolean d(Future future) {
        int g = g(future);
        return g == 2 || g == 3;
    }

    public static boolean e(Future future) {
        return future != null && !future.isDone();
    }

    public static boolean f(Future future) {
        return future != null && g(future) == 4;
    }

    public static int g(Future future) {
        if (!future.isDone()) {
            return 1;
        }
        if (future.isCancelled()) {
            return 2;
        }
        try {
            kcu.S(future);
            return 4;
        } catch (ExecutionException unused) {
            return 3;
        }
    }

    public static void h(Future future) {
        if (future != null) {
            future.cancel(true);
        }
    }
}
