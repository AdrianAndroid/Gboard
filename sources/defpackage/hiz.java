package defpackage;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: hiz  reason: default package */
/* loaded from: classes.dex */
public final class hiz extends mjy {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/future/FluentFuture");
    public static final hiz b = k(kcu.K(null));

    public hiz(mko mkoVar) {
        super(mkoVar);
    }

    public static void G(Runnable runnable, Executor executor) {
        k(kcu.N(runnable, executor));
    }

    public static hek K(Iterable iterable) {
        return new hek(kcu.W(iterable), (byte[]) null);
    }

    public static hek L(mko... mkoVarArr) {
        return new hek(kcu.X(mkoVarArr), (byte[]) null);
    }

    public static hek M(mko... mkoVarArr) {
        return new hek(kcu.Z(mkoVarArr), (byte[]) null);
    }

    public static hiz j(rl rlVar) {
        return k(iq.b(rlVar));
    }

    public static hiz k(mko mkoVar) {
        return mkoVar instanceof hiz ? (hiz) mkoVar : new hiz(mkoVar);
    }

    public static hiz l() {
        return k(kcu.I());
    }

    public static hiz m(Throwable th) {
        return k(kcu.J(th));
    }

    public static hiz n(Object obj) {
        return obj == null ? b : k(kcu.K(obj));
    }

    public static hiz p(Callable callable, Executor executor) {
        if (executor instanceof mkr) {
            return k(((mkr) executor).hQ(callable));
        }
        return k(kcu.O(callable, executor));
    }

    public static hiz q(mix mixVar, Executor executor) {
        return k(kcu.P(mixVar, executor));
    }

    public static hiz r(Map map) {
        llw k = llw.k(map);
        return K(k.values()).d(new evl(k, 15), mjl.a);
    }

    public final Object A(Object obj) {
        return hji.a(this.c, obj);
    }

    public final Object B() {
        return hji.b(this.c);
    }

    public final boolean C() {
        return hji.e(this.c);
    }

    public final boolean D() {
        return hji.f(this.c);
    }

    public final void E(hix hixVar) {
        hixVar.c(this.c);
    }

    public final void F(mka mkaVar, Executor executor) {
        kcu.U(this.c, mkaVar, executor);
    }

    public final void H(Level level, String str, Object... objArr) {
        if (!a.a(level).P()) {
            return;
        }
        F(new hiy(level, str, objArr, 3), mjl.a);
    }

    public final void I(Level level, String str, leq leqVar) {
        if (!a.a(level).P()) {
            return;
        }
        F(new hiy(level, str, leqVar, 0), mjl.a);
    }

    public final void J(Level level, String str, Object... objArr) {
        if (!a.a(level).P()) {
            return;
        }
        F(new hiy(level, str, objArr, 2), mjl.a);
    }

    public final hiz a(Class cls, leq leqVar, Executor executor) {
        return new hiz(mhu.g(this.c, cls, leqVar, executor));
    }

    public final hiz b(Class cls, miy miyVar, Executor executor) {
        return new hiz(mhu.h(this.c, cls, miyVar, executor));
    }

    public final hiz c(Object obj) {
        return a(Throwable.class, new hdp(obj, 8), mjl.a);
    }

    public final hiz e(miy miyVar, Executor executor) {
        return b(Throwable.class, miyVar, executor);
    }

    public final hiz g(hiu hiuVar, Executor executor) {
        return u(new hdp(hiuVar, 10), executor);
    }

    public final hiz h(lfe lfeVar, Executor executor) {
        return u(new hdp(lfeVar, 9), executor);
    }

    public final hiz i() {
        return h(dyv.q, mjl.a);
    }

    public final hiz o() {
        return new hiz(kcu.L(this.c));
    }

    public final hiz s(hiv hivVar, Executor executor) {
        return new hiz(mio.h(this.c, new eoi(hivVar, 18), executor));
    }

    public final hiz t() {
        return u(hht.d, mjl.a);
    }

    public final hiz u(leq leqVar, Executor executor) {
        return new hiz(mio.g(this.c, leqVar, executor));
    }

    public final hiz v(miy miyVar, Executor executor) {
        return new hiz(mio.h(this.c, miyVar, executor));
    }

    public final hiz w(long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return j <= 0 ? this : new hiz(kcu.R(this.c, j, timeUnit, scheduledExecutorService));
    }

    public final hiz x(hhl hhlVar, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return w(((Long) hhlVar.c()).longValue(), timeUnit, scheduledExecutorService);
    }

    public final lfb y() {
        return lfb.f(hji.b(this.c));
    }

    public final Object z() {
        return kcu.S(this.c);
    }
}
