package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: jyy  reason: default package */
/* loaded from: classes.dex */
public final class jyy implements jzm {
    public static final int a = (int) TimeUnit.HOURS.toMillis(4);
    public static final int b = (int) TimeUnit.HOURS.toMillis(1);
    public static final jlr c = new jlr(TimeUnit.MINUTES.toMillis(5), jqp.b);
    private final JobScheduler d;
    private final Context e;
    private final Class f;
    private final int g;
    private final int h;

    public jyy(jyx jyxVar) {
        JobScheduler jobScheduler = jyxVar.a;
        jdg.u(jobScheduler);
        this.d = jobScheduler;
        Context context = jyxVar.b;
        jdg.u(context);
        this.e = context;
        this.f = jyxVar.c;
        this.g = jyxVar.d;
        this.h = jyxVar.e;
    }

    public static jyx f() {
        return new jyx();
    }

    @Override // defpackage.jzm
    public final void a(jsz jszVar) {
        if (jszVar.b()) {
            return;
        }
        c.e(jszVar.a());
        this.d.cancel(lxj.p(jszVar.a(), 0));
        this.d.cancel(lxj.p(jszVar.a(), 1));
        this.d.cancel(lxj.p(jszVar.a(), 2));
    }

    @Override // defpackage.jzm
    public final void b() {
        c.f();
        this.d.cancelAll();
    }

    @Override // defpackage.jzm
    public final /* synthetic */ void c(jsz jszVar) {
    }

    @Override // defpackage.jzm
    public final void d(jsz jszVar, int i) {
        if (!jszVar.b()) {
            jsx a2 = jszVar.a();
            if (i == 0) {
                jlr jlrVar = c;
                if (!jlrVar.g(a2, new jyw(this, a2))) {
                    lug lugVar = jsh.a;
                    jlrVar.d(a2);
                }
            } else {
                g(a2, i);
            }
            int i2 = 2;
            jrk jrkVar = (jrk) a2;
            JobInfo.Builder requiresCharging = new JobInfo.Builder(lxj.p(a2, 2), new ComponentName(this.e, this.f)).setRequiresCharging(jrkVar.b);
            if (true != jrkVar.a) {
                i2 = 1;
            }
            JobInfo.Builder persisted = requiresCharging.setRequiredNetworkType(i2).setRequiresDeviceIdle(jrkVar.c).setPersisted(true);
            if (Build.VERSION.SDK_INT >= 24) {
                persisted.setPeriodic(this.g, this.h);
            } else {
                persisted.setPeriodic(this.g);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                persisted.setRequiresBatteryNotLow(jrkVar.d);
            }
            if (this.d.schedule(persisted.build()) != 1) {
                throw new jyz();
            }
            return;
        }
        throw new UnsupportedOperationException("This scheduler does not support running in foreground");
    }

    @Override // defpackage.jzm
    public final boolean e(jsz jszVar) {
        return !jszVar.b();
    }

    public final void g(jsx jsxVar, int i) {
        long j = i * 1000;
        int i2 = i == 0 ? 0 : 1;
        lug lugVar = jsh.a;
        jrk jrkVar = (jrk) jsxVar;
        JobInfo.Builder persisted = new JobInfo.Builder(lxj.p(jsxVar, i2), new ComponentName(this.e, this.f)).setMinimumLatency(j).setRequiresCharging(jrkVar.b).setRequiresDeviceIdle(jrkVar.c).setRequiredNetworkType(true != jrkVar.a ? 1 : 2).setPersisted(true);
        if (Build.VERSION.SDK_INT >= 26) {
            persisted.setRequiresBatteryNotLow(jrkVar.d);
        }
        if (this.d.schedule(persisted.build()) != 1) {
            throw new jyz();
        }
        jrz a2 = jsf.a("scheduling");
        jsy c2 = jsz.c();
        c2.b = jsxVar;
        c2.b(false);
        a2.a(c2.a().toString(), "scheduled", Integer.valueOf(i));
    }
}
