package com.google.android.apps.inputmethod.libs.latin5;

import android.content.Context;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PeriodicStatsRunner implements Callable, isc {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/latin5/PeriodicStatsRunner");
    public static final long b = TimeUnit.HOURS.toMillis(8);
    public static boolean c = false;
    public final List d = lre.A();
    private final Context e;
    private final idk f;
    private final mkr g;

    public PeriodicStatsRunner(Context context) {
        ieh j = ieh.j();
        mks c2 = gxo.c(11);
        this.e = context;
        this.f = j;
        this.g = c2;
    }

    public static void d(isa isaVar, long j) {
        ieh.j().e(isk.a, "PeriodicStats", Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - j)), isaVar, ise.MANUAL_RUN);
    }

    public static boolean e(Context context) {
        long c2 = ino.M(context).c("periodic_stats_last_run", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        return c2 != 0 && currentTimeMillis >= c2 && TimeUnit.MILLISECONDS.toHours(currentTimeMillis - c2) < 8;
    }

    @Override // defpackage.isc
    public final isb a(jls jlsVar) {
        return isb.FINISHED;
    }

    @Override // defpackage.isc
    public final mko b(jls jlsVar) {
        if (e(this.e)) {
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/latin5/PeriodicStatsRunner", "onRunTask", 178, "PeriodicStatsRunner.java")).t("Skip to run PeriodicStats since already run once within 8 hours.");
            return isc.o;
        } else if (irx.b()) {
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/latin5/PeriodicStatsRunner", "onRunTask", 184, "PeriodicStatsRunner.java")).t("Skip to run PeriodicStats since screen is on.");
            return isc.o;
        } else {
            return this.g.hQ(this);
        }
    }

    public final void c(List list) {
        this.f.e(idd.PERIODIC_TASK_SERVICE_RUN, list);
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        long currentTimeMillis = System.currentTimeMillis();
        ltg ltgVar = a;
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/latin5/PeriodicStatsRunner", "call", 202, "PeriodicStatsRunner.java")).t("call()");
        ino.M(this.e).i("periodic_stats_last_run", System.currentTimeMillis());
        if (hjk.a()) {
            gen a2 = fyb.e(this.e).a(fyb.f());
            a2.k(new dop(this, 0));
            a2.j(new doq(this, 0));
            a2.f(gep.a, new hrl(this, 1));
        } else {
            this.d.clear();
            c(this.d);
        }
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/latin5/PeriodicStatsRunner", "call", 249, "PeriodicStatsRunner.java")).v("call() : Finished in %d ms", System.currentTimeMillis() - currentTimeMillis);
        return isb.FINISHED;
    }
}
