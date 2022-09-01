package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: keh  reason: default package */
/* loaded from: classes.dex */
public final class keh extends kee implements kdt, kca, kch, kcf {
    public static final ltg a = ltg.j("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricServiceImpl");
    volatile kbh b;
    public final nox c;
    public final nox d;
    private final boolean f;
    private final Context g;
    private final Executor h;
    private final kdq i;
    private final lfb j;
    private final kcl k;
    private final oiy p;
    private final jlt q;
    private final AtomicBoolean e = new AtomicBoolean();
    private final AtomicInteger l = new AtomicInteger();
    private final AtomicInteger m = new AtomicInteger();
    private final AtomicInteger n = new AtomicInteger();
    private final AtomicBoolean o = new AtomicBoolean(false);

    public keh(kdr kdrVar, Context context, Executor executor, nox noxVar, lfb lfbVar, kcl kclVar, jlt jltVar, nox noxVar2, lfb lfbVar2, oiy oiyVar, byte[] bArr, byte[] bArr2) {
        this.c = noxVar;
        this.j = lfbVar;
        this.k = kclVar;
        this.q = jltVar;
        this.d = noxVar2;
        this.i = kdrVar.a(mjl.a, noxVar, null);
        this.g = context;
        this.h = executor;
        this.f = ((Boolean) lfbVar2.c(Boolean.FALSE)).booleanValue();
        this.p = oiyVar;
    }

    private final void h(int i, AtomicInteger atomicInteger) {
        atomicInteger.getAndIncrement();
        kcu.P(new kef(this, atomicInteger, i, 0), this.h);
    }

    @Override // defpackage.kca
    public final void a(Activity activity, Bundle bundle) {
        if (!this.o.getAndSet(true)) {
            h(4, this.m);
        }
    }

    @Override // defpackage.kdt
    public final void ad() {
        ((kel) ((oiy) ((lfm) this.j).a).a()).a(this);
        this.k.a(this);
        h(3, this.l);
        if (this.f) {
            d();
        }
    }

    @Override // defpackage.kcf
    public final void b(Activity activity) {
        kbh kbhVar;
        Class<?> cls = activity.getClass();
        if (!lfd.e(null)) {
            kbhVar = new kbh("null".concat(String.valueOf(cls.getSimpleName())));
        } else {
            kbhVar = new kbh(cls.getSimpleName());
        }
        this.b = kbhVar;
    }

    @Override // defpackage.kch
    public final void c(Activity activity) {
        this.b = null;
    }

    @Override // defpackage.kee
    public final void d() {
        if (this.e.compareAndSet(false, true)) {
            Thread.setDefaultUncaughtExceptionHandler(new keg(this, Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    public final void e(oog oogVar) {
        kby kbyVar;
        int i;
        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        ked kedVar = (ked) this.c.a();
        if (!kedVar.b()) {
            return;
        }
        lfb lfbVar = this.i.e;
        if (lfbVar.e()) {
            kbyVar = ((kbz) lfbVar.a()).a();
        } else {
            kbyVar = kby.a;
        }
        try {
            if (kki.l()) {
                i = ((kej) this.p.a()).a;
            } else {
                i = ((kej) this.p.a()).b;
            }
            long j = i;
            kdq kdqVar = this.i;
            kdl a2 = kdm.a();
            nfh t = oos.u.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            oos oosVar = (oos) t.b;
            oogVar.getClass();
            oosVar.g = oogVar;
            oosVar.a |= 64;
            a2.d((oos) t.cz());
            a2.b = null;
            a2.e = kbyVar;
            kdqVar.b(a2.a()).get(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Throwable unused2) {
        }
        while (this.l.getAndDecrement() > 0) {
            f(3, kedVar);
        }
        while (this.m.getAndDecrement() > 0) {
            f(4, kedVar);
        }
        while (this.n.getAndDecrement() > 0) {
            f(5, kedVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final mko f(int i, ked kedVar) {
        if (kedVar.b()) {
            float f = kedVar.a;
            khn d = this.q.d(f / 100.0f);
            if (d.b.nextFloat() >= d.a) {
                return mkk.a;
            }
            kdq kdqVar = this.i;
            kdl a2 = kdm.a();
            nfh t = oos.u.t();
            nfh t2 = ooq.d.t();
            int i2 = (int) (100.0f / f);
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            ooq ooqVar = (ooq) t2.b;
            int i3 = ooqVar.a | 2;
            ooqVar.a = i3;
            ooqVar.c = i2;
            ooqVar.b = i - 1;
            ooqVar.a = i3 | 1;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            oos oosVar = (oos) t.b;
            ooq ooqVar2 = (ooq) t2.cz();
            ooqVar2.getClass();
            oosVar.q = ooqVar2;
            oosVar.a |= 33554432;
            a2.d((oos) t.cz());
            return kdqVar.b(a2.a());
        }
        return mkk.a;
    }

    public final nfh g() {
        nfh t = oog.j.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        oog oogVar = (oog) t.b;
        oogVar.a |= 1;
        oogVar.b = true;
        kbh kbhVar = this.b;
        String str = kbhVar == null ? null : kbhVar.a;
        if (str != null) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            oog oogVar2 = (oog) t.b;
            oogVar2.a |= 4;
            oogVar2.d = str;
        }
        try {
            nfh t2 = ooc.c.t();
            oob j = mhb.j(this.g);
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            ooc oocVar = (ooc) t2.b;
            j.getClass();
            oocVar.b = j;
            oocVar.a |= 1;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            oog oogVar3 = (oog) t.b;
            ooc oocVar2 = (ooc) t2.cz();
            oocVar2.getClass();
            oogVar3.c = oocVar2;
            oogVar3.a |= 2;
        } catch (RuntimeException e) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricServiceImpl", "createCrashMetric", (char) 232, "CrashMetricServiceImpl.java")).t("Failed to get process stats.");
        }
        return t;
    }
}
