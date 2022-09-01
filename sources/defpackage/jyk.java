package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: jyk  reason: default package */
/* loaded from: classes.dex */
public class jyk extends JobService {
    private jyh a;

    private static jsz f(JobParameters jobParameters) {
        jsy c = jsz.c();
        c.b = lxj.n(jobParameters.getJobId());
        c.b(false);
        return c.a();
    }

    protected jzm a(Context context) {
        jyx f = jyy.f();
        f.b = context;
        f.c = getClass();
        return f.a();
    }

    protected mks b() {
        return jtd.a;
    }

    protected List c() {
        jxd f = jxg.f();
        f.a = getApplicationContext();
        f.b = jte.a;
        return llp.r(f.a());
    }

    final jyh d() {
        if (this.a == null) {
            this.a = jyh.a(e(), new jym(this, 1));
        }
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final jyj e() {
        Context applicationContext = getApplicationContext();
        lzh lzhVar = jws.a;
        ArrayList arrayList = new ArrayList();
        mks b = b();
        kcu.s(c(), arrayList);
        jws r = kcu.r(b, arrayList);
        r.e.c(jyt.a(jzg.d));
        osr a = jyj.a();
        a.a = jvi.e(jvl.b(applicationContext));
        a.i(b());
        a.b = jza.a;
        a.j(a(applicationContext));
        a.c = r;
        return a.h();
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        d().c(f(jobParameters), lxj.o(jobParameters.getJobId()), jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        d().d(f(jobParameters));
        return false;
    }
}
