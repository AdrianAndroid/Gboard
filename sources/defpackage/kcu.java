package defpackage;

import android.os.health.HealthStats;
import android.os.health.TimerStat;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: kcu  reason: default package */
/* loaded from: classes.dex */
public class kcu {
    public kcu() {
    }

    public kcu(byte[] bArr) {
    }

    public static void A(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    public static mkr B(ExecutorService executorService) {
        mkr mkvVar;
        if (executorService instanceof mkr) {
            return (mkr) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            mkvVar = new mky((ScheduledExecutorService) executorService);
        } else {
            mkvVar = new mkv(executorService);
        }
        return mkvVar;
    }

    public static mkr C() {
        return new mku();
    }

    public static mks D(ScheduledExecutorService scheduledExecutorService) {
        if (scheduledExecutorService instanceof mks) {
            return (mks) scheduledExecutorService;
        }
        return new mky(scheduledExecutorService);
    }

    public static Executor E(Executor executor) {
        return new mlc(executor);
    }

    public static Executor F(Executor executor, mik mikVar) {
        jdg.u(executor);
        return executor == mjl.a ? executor : new mkt(executor, mikVar, 0);
    }

    public static mko G(Iterable iterable) {
        return new mjg(llp.i(iterable), true);
    }

    @SafeVarargs
    public static mko H(mko... mkoVarArr) {
        return new mjg(llp.p(mkoVarArr), true);
    }

    public static mko I() {
        mki mkiVar = mki.a;
        return mkiVar != null ? mkiVar : new mki();
    }

    public static mko J(Throwable th) {
        jdg.u(th);
        return new mkj(th);
    }

    public static mko K(Object obj) {
        if (obj == null) {
            return mkk.a;
        }
        return new mkk(obj);
    }

    public static mko L(mko mkoVar) {
        if (mkoVar.isDone()) {
            return mkoVar;
        }
        mkd mkdVar = new mkd(mkoVar);
        mkoVar.d(mkdVar, mjl.a);
        return mkdVar;
    }

    public static mko M(mix mixVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        mlk e = mlk.e(mixVar);
        e.d(new kvl(scheduledExecutorService.schedule(e, j, timeUnit), 10), mjl.a);
        return e;
    }

    public static mko N(Runnable runnable, Executor executor) {
        mlk g = mlk.g(runnable, null);
        executor.execute(g);
        return g;
    }

    public static mko O(Callable callable, Executor executor) {
        mlk f = mlk.f(callable);
        executor.execute(f);
        return f;
    }

    public static mko P(mix mixVar, Executor executor) {
        mlk e = mlk.e(mixVar);
        executor.execute(e);
        return e;
    }

    public static mko Q(Iterable iterable) {
        return new mjg(llp.i(iterable), false);
    }

    public static mko R(mko mkoVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (mkoVar.isDone()) {
            return mkoVar;
        }
        mlh mlhVar = new mlh(mkoVar);
        mlf mlfVar = new mlf(mlhVar, 0);
        mlhVar.b = scheduledExecutorService.schedule(mlfVar, j, timeUnit);
        mkoVar.d(mlfVar, mjl.a);
        return mlhVar;
    }

    public static Object S(Future future) {
        jdg.J(future.isDone(), "Future was expected to be done: %s", future);
        return z(future);
    }

    public static Object T(Future future) {
        try {
            return z(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new mjm((Error) cause);
            }
            throw new mll(cause);
        }
    }

    public static void U(mko mkoVar, mka mkaVar, Executor executor) {
        jdg.u(mkaVar);
        mkoVar.d(new mkb(mkoVar, mkaVar), executor);
    }

    public static void V(mko mkoVar, Future future) {
        if (mkoVar instanceof mik) {
            ((mik) mkoVar).m(future);
        } else if (mkoVar == null || !mkoVar.isCancelled() || future == null) {
        } else {
            future.cancel(false);
        }
    }

    public static nsx W(Iterable iterable) {
        return new nsx(false, llp.i(iterable));
    }

    @SafeVarargs
    public static nsx X(mko... mkoVarArr) {
        return new nsx(false, llp.p(mkoVarArr));
    }

    public static nsx Y(Iterable iterable) {
        return new nsx(true, llp.i(iterable));
    }

    @SafeVarargs
    public static nsx Z(mko... mkoVarArr) {
        return new nsx(true, llp.p(mkoVarArr));
    }

    public static long d(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasMeasurement(i)) {
            return 0L;
        }
        return healthStats.getMeasurement(i);
    }

    public static List e(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasTimers(i)) {
            return Collections.emptyList();
        }
        return kde.a.d(healthStats.getTimers(i));
    }

    public static Map f(HealthStats healthStats, int i) {
        return (healthStats == null || !healthStats.hasStats(i)) ? Collections.emptyMap() : healthStats.getStats(i);
    }

    public static onf g(String str) {
        nfh t = onf.d.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        onf onfVar = (onf) t.b;
        onfVar.a |= 2;
        onfVar.c = str;
        return (onf) t.cz();
    }

    public static onk h(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasTimer(i)) {
            return null;
        }
        return j(null, healthStats.getTimer(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static onk i(onk onkVar, onk onkVar2) {
        if (onkVar == null || onkVar2 == null) {
            return onkVar;
        }
        int i = onkVar.b - onkVar2.b;
        long j = onkVar.c - onkVar2.c;
        if (i == 0) {
            if (j == 0) {
                return null;
            }
            i = 0;
        }
        nfh t = onk.e.t();
        if ((onkVar.a & 4) != 0) {
            onf onfVar = onkVar.d;
            if (onfVar == null) {
                onfVar = onf.d;
            }
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onk onkVar3 = (onk) t.b;
            onfVar.getClass();
            onkVar3.d = onfVar;
            onkVar3.a |= 4;
        }
        if (t.c) {
            t.cD();
            t.c = false;
        }
        onk onkVar4 = (onk) t.b;
        int i2 = onkVar4.a | 1;
        onkVar4.a = i2;
        onkVar4.b = i;
        onkVar4.a = i2 | 2;
        onkVar4.c = j;
        return (onk) t.cz();
    }

    public static onk j(String str, TimerStat timerStat) {
        nfh t = onk.e.t();
        int count = timerStat.getCount();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        onk onkVar = (onk) t.b;
        onkVar.a |= 1;
        onkVar.b = count;
        long time = timerStat.getTime();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        onk onkVar2 = (onk) t.b;
        int i = onkVar2.a | 2;
        onkVar2.a = i;
        onkVar2.c = time;
        if (onkVar2.b < 0) {
            onkVar2.a = i | 1;
            onkVar2.b = 0;
        }
        if (str != null) {
            onf g = g(str);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onk onkVar3 = (onk) t.b;
            g.getClass();
            onkVar3.d = g;
            onkVar3.a |= 4;
        }
        onk onkVar4 = (onk) t.b;
        if (onkVar4.b == 0 && onkVar4.c == 0) {
            return null;
        }
        return (onk) t.cz();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static onl k(onl onlVar, onl onlVar2) {
        onk onkVar;
        onk onkVar2;
        onk onkVar3;
        onk onkVar4;
        onk onkVar5;
        onk onkVar6;
        onk onkVar7;
        onk onkVar8;
        onk onkVar9;
        onk onkVar10;
        onk onkVar11;
        onk onkVar12;
        onk onkVar13;
        onk onkVar14;
        onk onkVar15;
        onk onkVar16;
        onk onkVar17;
        onk onkVar18;
        onk onkVar19;
        onk onkVar20;
        onk onkVar21;
        onk onkVar22;
        onk onkVar23;
        onk onkVar24;
        onk onkVar25;
        onk onkVar26;
        onk onkVar27;
        onk onkVar28;
        onk onkVar29;
        onk onkVar30;
        if (onlVar != null && onlVar2 != null) {
            nfh t = onl.an.t();
            if ((onlVar.a & 1) != 0) {
                long j = onlVar.c - onlVar2.c;
                if (j != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    onl onlVar3 = (onl) t.b;
                    onlVar3.a |= 1;
                    onlVar3.c = j;
                }
            }
            if ((onlVar.a & 2) != 0) {
                long j2 = onlVar.d - onlVar2.d;
                if (j2 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    onl onlVar4 = (onl) t.b;
                    onlVar4.a |= 2;
                    onlVar4.d = j2;
                }
            }
            if ((onlVar.a & 4) != 0) {
                long j3 = onlVar.e - onlVar2.e;
                if (j3 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    onl onlVar5 = (onl) t.b;
                    onlVar5.a |= 4;
                    onlVar5.e = j3;
                }
            }
            if ((onlVar.a & 8) != 0) {
                long j4 = onlVar.f - onlVar2.f;
                if (j4 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    onl onlVar6 = (onl) t.b;
                    onlVar6.a |= 8;
                    onlVar6.f = j4;
                }
            }
            t.ex(kde.a.e(onlVar.g, onlVar2.g));
            t.ey(kde.a.e(onlVar.h, onlVar2.h));
            t.ez(kde.a.e(onlVar.i, onlVar2.i));
            t.ew(kde.a.e(onlVar.j, onlVar2.j));
            t.ev(kde.a.e(onlVar.k, onlVar2.k));
            t.er(kde.a.e(onlVar.l, onlVar2.l));
            if ((onlVar.a & 16) != 0) {
                onkVar = onlVar.m;
                if (onkVar == null) {
                    onkVar = onk.e;
                }
            } else {
                onkVar = null;
            }
            if ((onlVar2.a & 16) != 0) {
                onkVar2 = onlVar2.m;
                if (onkVar2 == null) {
                    onkVar2 = onk.e;
                }
            } else {
                onkVar2 = null;
            }
            onk i = i(onkVar, onkVar2);
            if (i != null) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                onl onlVar7 = (onl) t.b;
                onlVar7.m = i;
                onlVar7.a |= 16;
            }
            t.es(kde.a.e(onlVar.n, onlVar2.n));
            t.eu(kdb.a.e(onlVar.p, onlVar2.p));
            t.et(kda.a.e(onlVar.q, onlVar2.q));
            if ((onlVar.a & 32) != 0) {
                long j5 = onlVar.r - onlVar2.r;
                if (j5 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    onl onlVar8 = (onl) t.b;
                    onlVar8.a |= 32;
                    onlVar8.r = j5;
                }
            }
            if ((onlVar.a & 64) != 0) {
                long j6 = onlVar.s - onlVar2.s;
                if (j6 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    onl onlVar9 = (onl) t.b;
                    onlVar9.a |= 64;
                    onlVar9.s = j6;
                }
            }
            if ((onlVar.a & 128) != 0) {
                long j7 = onlVar.t - onlVar2.t;
                if (j7 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    onl onlVar10 = (onl) t.b;
                    onlVar10.a |= 128;
                    onlVar10.t = j7;
                }
            }
            if ((onlVar.a & 256) != 0) {
                long j8 = onlVar.u - onlVar2.u;
                if (j8 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    onl onlVar11 = (onl) t.b;
                    onlVar11.a |= 256;
                    onlVar11.u = j8;
                }
            }
            if ((onlVar.a & 512) != 0) {
                long j9 = onlVar.v - onlVar2.v;
                if (j9 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    onl onlVar12 = (onl) t.b;
                    onlVar12.a |= 512;
                    onlVar12.v = j9;
                }
            }
            if ((onlVar.a & 1024) != 0) {
                long j10 = onlVar.w - onlVar2.w;
                if (j10 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    ((onl) t.b).k(j10);
                }
            }
            if ((onlVar.a & 2048) != 0) {
                long j11 = onlVar.x - onlVar2.x;
                if (j11 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    ((onl) t.b).l(j11);
                }
            }
            if ((onlVar.a & 4096) != 0) {
                long j12 = onlVar.y - onlVar2.y;
                if (j12 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    ((onl) t.b).Q(j12);
                }
            }
            if ((onlVar.a & 8192) != 0) {
                long j13 = onlVar.z - onlVar2.z;
                if (j13 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    ((onl) t.b).R(j13);
                }
            }
            if ((onlVar.a & 16384) != 0) {
                long j14 = onlVar.A - onlVar2.A;
                if (j14 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    ((onl) t.b).S(j14);
                }
            }
            if ((onlVar.a & 32768) != 0) {
                long j15 = onlVar.B - onlVar2.B;
                if (j15 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    ((onl) t.b).T(j15);
                }
            }
            if ((onlVar.a & 65536) != 0) {
                long j16 = onlVar.C - onlVar2.C;
                if (j16 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    ((onl) t.b).U(j16);
                }
            }
            if ((onlVar.a & 131072) != 0) {
                long j17 = onlVar.D - onlVar2.D;
                if (j17 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    ((onl) t.b).V(j17);
                }
            }
            if ((onlVar.a & 262144) != 0) {
                long j18 = onlVar.E - onlVar2.E;
                if (j18 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    ((onl) t.b).W(j18);
                }
            }
            if ((onlVar.a & 524288) != 0) {
                onkVar3 = onlVar.F;
                if (onkVar3 == null) {
                    onkVar3 = onk.e;
                }
            } else {
                onkVar3 = null;
            }
            if ((524288 & onlVar2.a) != 0) {
                onkVar4 = onlVar2.F;
                if (onkVar4 == null) {
                    onkVar4 = onk.e;
                }
            } else {
                onkVar4 = null;
            }
            onk i2 = i(onkVar3, onkVar4);
            if (i2 != null) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                ((onl) t.b).X(i2);
            }
            if ((onlVar.a & 1048576) != 0) {
                long j19 = onlVar.G - onlVar2.G;
                if (j19 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    ((onl) t.b).Y(j19);
                }
            }
            if ((onlVar.a & 2097152) != 0) {
                onkVar5 = onlVar.H;
                if (onkVar5 == null) {
                    onkVar5 = onk.e;
                }
            } else {
                onkVar5 = null;
            }
            if ((2097152 & onlVar2.a) != 0) {
                onkVar6 = onlVar2.H;
                if (onkVar6 == null) {
                    onkVar6 = onk.e;
                }
            } else {
                onkVar6 = null;
            }
            onk i3 = i(onkVar5, onkVar6);
            if (i3 != null) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                ((onl) t.b).Z(i3);
            }
            if ((onlVar.a & 4194304) != 0) {
                onkVar7 = onlVar.I;
                if (onkVar7 == null) {
                    onkVar7 = onk.e;
                }
            } else {
                onkVar7 = null;
            }
            if ((onlVar2.a & 4194304) != 0) {
                onkVar8 = onlVar2.I;
                if (onkVar8 == null) {
                    onkVar8 = onk.e;
                }
            } else {
                onkVar8 = null;
            }
            onk i4 = i(onkVar7, onkVar8);
            if (i4 != null) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                ((onl) t.b).aa(i4);
            }
            if ((onlVar.a & 8388608) != 0) {
                onkVar9 = onlVar.J;
                if (onkVar9 == null) {
                    onkVar9 = onk.e;
                }
            } else {
                onkVar9 = null;
            }
            if ((onlVar2.a & 8388608) != 0) {
                onkVar10 = onlVar2.J;
                if (onkVar10 == null) {
                    onkVar10 = onk.e;
                }
            } else {
                onkVar10 = null;
            }
            onk i5 = i(onkVar9, onkVar10);
            if (i5 != null) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                ((onl) t.b).ab(i5);
            }
            if ((onlVar.a & 16777216) != 0) {
                onkVar11 = onlVar.K;
                if (onkVar11 == null) {
                    onkVar11 = onk.e;
                }
            } else {
                onkVar11 = null;
            }
            if ((onlVar2.a & 16777216) != 0) {
                onkVar12 = onlVar2.K;
                if (onkVar12 == null) {
                    onkVar12 = onk.e;
                }
            } else {
                onkVar12 = null;
            }
            onk i6 = i(onkVar11, onkVar12);
            if (i6 != null) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                ((onl) t.b).ac(i6);
            }
            if ((onlVar.a & 33554432) != 0) {
                onkVar13 = onlVar.L;
                if (onkVar13 == null) {
                    onkVar13 = onk.e;
                }
            } else {
                onkVar13 = null;
            }
            if ((onlVar2.a & 33554432) != 0) {
                onkVar14 = onlVar2.L;
                if (onkVar14 == null) {
                    onkVar14 = onk.e;
                }
            } else {
                onkVar14 = null;
            }
            onk i7 = i(onkVar13, onkVar14);
            if (i7 != null) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                ((onl) t.b).ad(i7);
            }
            if ((onlVar.a & 67108864) != 0) {
                onkVar15 = onlVar.M;
                if (onkVar15 == null) {
                    onkVar15 = onk.e;
                }
            } else {
                onkVar15 = null;
            }
            if ((onlVar2.a & 67108864) != 0) {
                onkVar16 = onlVar2.M;
                if (onkVar16 == null) {
                    onkVar16 = onk.e;
                }
            } else {
                onkVar16 = null;
            }
            onk i8 = i(onkVar15, onkVar16);
            if (i8 != null) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                ((onl) t.b).ae(i8);
            }
            if ((onlVar.a & 134217728) != 0) {
                onkVar17 = onlVar.N;
                if (onkVar17 == null) {
                    onkVar17 = onk.e;
                }
            } else {
                onkVar17 = null;
            }
            if ((onlVar2.a & 134217728) != 0) {
                onkVar18 = onlVar2.N;
                if (onkVar18 == null) {
                    onkVar18 = onk.e;
                }
            } else {
                onkVar18 = null;
            }
            onk i9 = i(onkVar17, onkVar18);
            if (i9 != null) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                ((onl) t.b).af(i9);
            }
            if ((onlVar.a & 268435456) != 0) {
                onkVar19 = onlVar.O;
                if (onkVar19 == null) {
                    onkVar19 = onk.e;
                }
            } else {
                onkVar19 = null;
            }
            if ((onlVar2.a & 268435456) != 0) {
                onkVar20 = onlVar2.O;
                if (onkVar20 == null) {
                    onkVar20 = onk.e;
                }
            } else {
                onkVar20 = null;
            }
            onk i10 = i(onkVar19, onkVar20);
            if (i10 != null) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                ((onl) t.b).ag(i10);
            }
            if ((onlVar.a & 536870912) != 0) {
                onkVar21 = onlVar.P;
                if (onkVar21 == null) {
                    onkVar21 = onk.e;
                }
            } else {
                onkVar21 = null;
            }
            if ((onlVar2.a & 536870912) != 0) {
                onkVar22 = onlVar2.P;
                if (onkVar22 == null) {
                    onkVar22 = onk.e;
                }
            } else {
                onkVar22 = null;
            }
            onk i11 = i(onkVar21, onkVar22);
            if (i11 != null) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                ((onl) t.b).ah(i11);
            }
            if ((onlVar.a & 1073741824) != 0) {
                onkVar23 = onlVar.Q;
                if (onkVar23 == null) {
                    onkVar23 = onk.e;
                }
            } else {
                onkVar23 = null;
            }
            if ((onlVar2.a & 1073741824) != 0) {
                onkVar24 = onlVar2.Q;
                if (onkVar24 == null) {
                    onkVar24 = onk.e;
                }
            } else {
                onkVar24 = null;
            }
            onk i12 = i(onkVar23, onkVar24);
            if (i12 != null) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                ((onl) t.b).ai(i12);
            }
            if ((onlVar.a & Integer.MIN_VALUE) != 0) {
                onkVar25 = onlVar.R;
                if (onkVar25 == null) {
                    onkVar25 = onk.e;
                }
            } else {
                onkVar25 = null;
            }
            if ((onlVar2.a & Integer.MIN_VALUE) != 0) {
                onkVar26 = onlVar2.R;
                if (onkVar26 == null) {
                    onkVar26 = onk.e;
                }
            } else {
                onkVar26 = null;
            }
            onk i13 = i(onkVar25, onkVar26);
            if (i13 != null) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                ((onl) t.b).aj(i13);
            }
            if ((onlVar.b & 1) != 0) {
                onkVar27 = onlVar.S;
                if (onkVar27 == null) {
                    onkVar27 = onk.e;
                }
            } else {
                onkVar27 = null;
            }
            if ((onlVar2.b & 1) != 0) {
                onkVar28 = onlVar2.S;
                if (onkVar28 == null) {
                    onkVar28 = onk.e;
                }
            } else {
                onkVar28 = null;
            }
            onk i14 = i(onkVar27, onkVar28);
            if (i14 != null) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                ((onl) t.b).ak(i14);
            }
            if ((onlVar.b & 2) != 0) {
                onkVar29 = onlVar.T;
                if (onkVar29 == null) {
                    onkVar29 = onk.e;
                }
            } else {
                onkVar29 = null;
            }
            if ((onlVar2.b & 2) != 0) {
                onkVar30 = onlVar2.T;
                if (onkVar30 == null) {
                    onkVar30 = onk.e;
                }
            } else {
                onkVar30 = null;
            }
            onk i15 = i(onkVar29, onkVar30);
            if (i15 != null) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                ((onl) t.b).al(i15);
            }
            if ((onlVar.b & 4) != 0) {
                long j20 = onlVar.U - onlVar2.U;
                if (j20 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    ((onl) t.b).am(j20);
                }
            }
            if ((onlVar.b & 8) != 0) {
                long j21 = onlVar.V - onlVar2.V;
                if (j21 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    ((onl) t.b).an(j21);
                }
            }
            if ((onlVar.b & 16) != 0) {
                long j22 = onlVar.W - onlVar2.W;
                if (j22 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    ((onl) t.b).ao(j22);
                }
            }
            if ((onlVar.b & 32) != 0) {
                long j23 = onlVar.X - onlVar2.X;
                if (j23 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    ((onl) t.b).ap(j23);
                }
            }
            if ((onlVar.b & 64) != 0) {
                long j24 = onlVar.Y - onlVar2.Y;
                if (j24 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    ((onl) t.b).aq(j24);
                }
            }
            if ((onlVar.b & 128) != 0) {
                long j25 = onlVar.Z - onlVar2.Z;
                if (j25 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    ((onl) t.b).ar(j25);
                }
            }
            if ((onlVar.b & 256) != 0) {
                long j26 = onlVar.aa - onlVar2.aa;
                if (j26 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    ((onl) t.b).as(j26);
                }
            }
            if ((onlVar.b & 512) != 0) {
                long j27 = onlVar.ab - onlVar2.ab;
                if (j27 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    ((onl) t.b).at(j27);
                }
            }
            if ((onlVar.b & 1024) != 0) {
                long j28 = onlVar.ac - onlVar2.ac;
                if (j28 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    ((onl) t.b).au(j28);
                }
            }
            if ((onlVar.b & 2048) != 0) {
                long j29 = onlVar.ad - onlVar2.ad;
                if (j29 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    ((onl) t.b).av(j29);
                }
            }
            if ((onlVar.b & 4096) != 0) {
                long j30 = onlVar.ae - onlVar2.ae;
                if (j30 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    onl onlVar13 = (onl) t.b;
                    onlVar13.b |= 4096;
                    onlVar13.ae = j30;
                }
            }
            if ((onlVar.b & 8192) != 0) {
                long j31 = onlVar.af - onlVar2.af;
                if (j31 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    onl onlVar14 = (onl) t.b;
                    onlVar14.b |= 8192;
                    onlVar14.af = j31;
                }
            }
            if ((onlVar.b & 16384) != 0) {
                long j32 = onlVar.ag - onlVar2.ag;
                if (j32 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    onl onlVar15 = (onl) t.b;
                    onlVar15.b |= 16384;
                    onlVar15.ag = j32;
                }
            }
            if ((onlVar.b & 32768) != 0) {
                long j33 = onlVar.ah - onlVar2.ah;
                if (j33 != 0) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    onl onlVar16 = (onl) t.b;
                    onlVar16.b |= 32768;
                    onlVar16.ah = j33;
                }
            }
            if ((onlVar.b & 65536) != 0) {
                long j34 = onlVar.ai - onlVar2.ai;
                if (j34 != 0) {
                    t.eA(j34);
                }
            }
            onk i16 = i(onlVar.aw() ? onlVar.ax() : null, onlVar2.aw() ? onlVar2.ax() : null);
            if (i16 != null) {
                t.eD(i16);
            }
            if (onlVar.ay()) {
                long j35 = onlVar.ak - onlVar2.ak;
                if (j35 != 0) {
                    t.eH(j35);
                }
            }
            if (onlVar.az()) {
                long j36 = onlVar.al - onlVar2.al;
                if (j36 != 0) {
                    t.eG(j36);
                }
            }
            if (onlVar.aA()) {
                long j37 = onlVar.am - onlVar2.am;
                if (j37 != 0) {
                    t.eB(j37);
                }
            }
            onlVar = (onl) t.cz();
            if (o(onlVar)) {
                return null;
            }
        }
        return onlVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean l(ong ongVar) {
        if (ongVar != null) {
            return ongVar.b.size() == 0 && ongVar.c.size() == 0;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean m(oni oniVar) {
        if (oniVar != null) {
            return oniVar.b <= 0 && oniVar.c <= 0 && oniVar.d <= 0 && oniVar.e <= 0 && oniVar.f <= 0 && oniVar.g <= 0;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean n(onj onjVar) {
        if (onjVar != null) {
            return ((long) onjVar.b) <= 0 && ((long) onjVar.c) <= 0;
        }
        return true;
    }

    static boolean o(onl onlVar) {
        if (onlVar != null) {
            return onlVar.c <= 0 && onlVar.d <= 0 && onlVar.e <= 0 && onlVar.f <= 0 && onlVar.g.size() == 0 && onlVar.h.size() == 0 && onlVar.i.size() == 0 && onlVar.j.size() == 0 && onlVar.k.size() == 0 && onlVar.l.size() == 0 && onlVar.n.size() == 0 && onlVar.o.size() == 0 && onlVar.p.size() == 0 && onlVar.q.size() == 0 && onlVar.r <= 0 && onlVar.s <= 0 && onlVar.t <= 0 && onlVar.u <= 0 && onlVar.v <= 0 && onlVar.w <= 0 && onlVar.x <= 0 && onlVar.y <= 0 && onlVar.z <= 0 && onlVar.A <= 0 && onlVar.B <= 0 && onlVar.C <= 0 && onlVar.D <= 0 && onlVar.E <= 0 && onlVar.G <= 0 && onlVar.U <= 0 && onlVar.V <= 0 && onlVar.W <= 0 && onlVar.X <= 0 && onlVar.Y <= 0 && onlVar.Z <= 0 && onlVar.aa <= 0 && onlVar.ab <= 0 && onlVar.ac <= 0 && onlVar.ad <= 0 && onlVar.ae <= 0 && onlVar.af <= 0 && onlVar.ag <= 0 && onlVar.ah <= 0 && onlVar.ai <= 0 && onlVar.ak <= 0 && onlVar.al <= 0 && onlVar.am <= 0;
        }
        return true;
    }

    public static long q(juc jucVar) {
        return jucVar.k() == null ? jucVar.d() : jucVar.c();
    }

    public static void s(List list, List list2) {
        list2.addAll(list);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static jwg t(String str) {
        char c;
        switch (str.hashCode()) {
            case -1140680715:
                if (str.equals("adler32")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -903629273:
                if (str.equals("sha256")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 107902:
                if (str.equals("md5")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 94921523:
                if (str.equals("crc32")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c == 1) {
                return jwi.a;
            }
            if (c == 2) {
                return jwj.a;
            }
            if (c == 3) {
                return jwl.a;
            }
            return null;
        }
        return jwh.a;
    }

    public static int u(int i) {
        return i - 2;
    }

    public static int v(int i) {
        return i - 2;
    }

    public static int w(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int x(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return 14;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return 15;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 16;
            default:
                return 0;
        }
    }

    public static int y(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public static Object z(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static jws r(ScheduledExecutorService scheduledExecutorService, List list) {
        if (scheduledExecutorService == null) {
            throw new IllegalStateException("Control executor must be set.");
        }
        if (list.isEmpty()) {
            throw new IllegalStateException("At least one download protocol must be added.");
        }
        return new jws(scheduledExecutorService, list);
    }
}
