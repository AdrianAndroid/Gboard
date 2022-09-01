package defpackage;

import android.app.Service;
import android.app.job.JobParameters;

/* compiled from: PG */
/* renamed from: jym  reason: default package */
/* loaded from: classes.dex */
final class jym implements jyi {
    final /* synthetic */ Service a;
    private final /* synthetic */ int b;

    public jym(jyk jykVar, int i) {
        this.b = i;
        this.a = jykVar;
    }

    public jym(jyn jynVar, int i) {
        this.b = i;
        this.a = jynVar;
    }

    @Override // defpackage.jyi
    public final /* synthetic */ void b(Object obj) {
        jyy jyyVar;
        if (this.b == 0) {
            Void r7 = (Void) obj;
            return;
        }
        jzm jzmVar = ((jyk) this.a).e().a;
        if (jzmVar instanceof jyy) {
            jyyVar = (jyy) jzmVar;
        } else {
            jyy jyyVar2 = null;
            if (jzmVar instanceof jyv) {
                llp llpVar = ((jyv) jzmVar).a;
                int i = ((lrl) llpVar).c;
                for (int i2 = 0; i2 < i; i2++) {
                    Object obj2 = ((jma) llpVar.get(i2)).a;
                    if (obj2 instanceof jyy) {
                        jyyVar2 = (jyy) obj2;
                    }
                }
            }
            jyyVar = jyyVar2;
        }
        if (jyyVar != null) {
            JobParameters jobParameters = (JobParameters) obj;
            int jobId = jobParameters.getJobId();
            if (!lxj.o(jobParameters.getJobId())) {
                return;
            }
            jyy.c.e(lxj.n(jobId));
            return;
        }
        throw new IllegalStateException("Could not find the job task scheduler for this service");
    }

    @Override // defpackage.jyi
    public final /* synthetic */ void a(Object obj) {
        if (this.b == 0) {
            Void r3 = (Void) obj;
            ((jyb) this.a).f();
            return;
        }
        ((jyk) this.a).jobFinished((JobParameters) obj, false);
    }
}
