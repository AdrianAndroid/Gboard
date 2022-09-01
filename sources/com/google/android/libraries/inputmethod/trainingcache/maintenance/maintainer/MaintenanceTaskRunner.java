package com.google.android.libraries.inputmethod.trainingcache.maintenance.maintainer;

import android.content.Context;
import android.os.Build;
import j$.util.function.Supplier;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MaintenanceTaskRunner implements isc {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/trainingcache/maintenance/maintainer/MaintenanceTaskRunner");
    public static final String[] b = {"trainingcachev2.db", "trainingcachev2.db-journal"};
    public static final hhl c = hhq.a("cleanup_micore_training_cache_legacy", false);
    public final Supplier d;
    public final gjz e;
    public final jls f;
    private final Context g;
    private final Executor h;
    private mko i;

    public MaintenanceTaskRunner(Context context) {
        gjz gjzVar = gvs.a;
        gxp a2 = gxp.a();
        mks c2 = a2.c(a2.b);
        dpt dptVar = new dpt(context, 5);
        this.g = context;
        this.e = gjzVar;
        this.h = c2;
        this.f = new jls(context, c2);
        this.d = dptVar;
    }

    public static iso c() {
        isn a2 = iso.a("TRAINING_CACHE_STORAGE_MAINTENANCE_TASK", MaintenanceTaskRunner.class.getName());
        a2.d(1, TimeUnit.MINUTES.toMillis(15L), TimeUnit.HOURS.toMillis(4L));
        a2.m = true;
        a2.j = false;
        a2.b();
        a2.c(TimeUnit.HOURS.toMillis(12L), TimeUnit.HOURS.toMillis(6L));
        return a2.a();
    }

    public static void d(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            context.deleteSharedPreferences(str);
        } else {
            context.getSharedPreferences(str, 0).edit().clear().apply();
        }
    }

    public static mko e(Context context, Executor executor) {
        long currentTimeMillis = System.currentTimeMillis();
        kcu.U(kcu.N(new ihi(context, 10), executor), new ivq(5), executor);
        return mio.g(mio.g(iwy.a.b(), iuu.h, executor), new cxo(context, currentTimeMillis, 3), mjl.a);
    }

    @Override // defpackage.isc
    public final isb a(jls jlsVar) {
        mko mkoVar = this.i;
        if (mkoVar == null || mkoVar.isDone()) {
            return isb.FINISHED;
        }
        this.i.cancel(false);
        return isb.FINISHED_NEED_RESCHEDULE;
    }

    @Override // defpackage.isc
    public final mko b(jls jlsVar) {
        final long currentTimeMillis = System.currentTimeMillis();
        if (!jai.b.b()) {
            return kcu.K(isb.FINISHED_NEED_RESCHEDULE);
        }
        if (its.e().c()) {
            ieh.j().e(iwc.MAINTENANCE_TASK_RESULT, 1);
            return kcu.K(isb.FINISHED_NEED_RESCHEDULE);
        }
        mko g = mio.g(mio.h(mkh.q(e(this.g, this.h)), new hzb(this, jlsVar, 2, (byte[]) null, (byte[]) null, (byte[]) null), this.h), new leq() { // from class: ivz
            @Override // defpackage.leq
            public final Object a(Object obj) {
                Void r6 = (Void) obj;
                ieh.j().g(iwe.MAINTENANCE_ALL_DURATION, System.currentTimeMillis() - currentTimeMillis);
                return isb.FINISHED;
            }
        }, this.h);
        this.i = g;
        return g;
    }
}
