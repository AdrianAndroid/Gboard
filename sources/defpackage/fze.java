package defpackage;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.RemoteException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* renamed from: fze  reason: default package */
/* loaded from: classes.dex */
public final class fze {
    static final jns a = jnl.b("brella", "TrainingJob");
    public static final Object b = new Object();
    public fzd c = null;
    public mkr d;
    public jnk e;
    public fwe f;
    public gbx g;
    public fwo h;
    public jnp i;
    public final fyp j;
    private jpb k;
    private fxa l;

    /* JADX WARN: Finally extract failed */
    public fze(fyp fypVar, mkr mkrVar) {
        try {
            this.j = fypVar;
            this.d = mkrVar;
            jnk b2 = jnk.b(fypVar.a.getApplicationContext());
            this.e = b2;
            this.f = (fwe) b2.c(fwe.class);
            this.k = (jpb) this.e.c(jpb.class);
            this.g = (gbx) this.e.c(gbx.class);
            this.h = (fwo) this.e.c(fwo.class);
            this.i = (jnp) this.e.c(jnp.class);
            this.l = (fxa) this.e.c(fxa.class);
            this.h.e(job.IN_APP_TRAINING_JOB_SERVICE_CREATE);
        } catch (Throwable th) {
            fwo fwoVar = this.h;
            if (fwoVar != null) {
                fwoVar.e(job.IN_APP_TRAINING_JOB_SERVICE_CREATE_ERROR);
            }
            fyb.y(fypVar.a.getApplicationContext(), th);
            throw th;
        }
    }

    public static fzf a(joe joeVar) {
        joa joaVar;
        int i = joeVar.a;
        if (i == 4) {
            return fyb.b((jnz) joeVar.b);
        }
        if (i == 13) {
            joaVar = (joa) joeVar.b;
        } else {
            joaVar = joa.f;
        }
        return fyb.c(joaVar);
    }

    public static void b(mko mkoVar, Context context) {
        try {
            kcu.S(mkoVar);
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            a.j(e, "Training failed");
            mll mllVar = new mll(e);
            fyb.y(context, mllVar);
            throw mllVar;
        }
    }

    private final void f(fzd fzdVar, mzh mzhVar, int i, boolean z) {
        if (this.c != fzdVar) {
            return;
        }
        this.c = null;
        if (mzhVar == null) {
            jns jnsVar = a;
            String valueOf = String.valueOf(fzdVar.f);
            jnsVar.h("Cancelling: " + valueOf + " - " + z);
            fyh fyhVar = fzdVar.f;
            if (fyhVar != null) {
                try {
                    fyhVar.e();
                } catch (RemoteException unused) {
                }
            }
            if (z) {
                fzdVar.d.cancel(true);
            }
        }
        ServiceConnection serviceConnection = fzdVar.e;
        if (serviceConnection != null) {
            this.j.a.unbindService(serviceConnection);
        }
        joe joeVar = fzdVar.b;
        kcu.T(this.g.f(fzdVar.a, joeVar.d, a(joeVar), mzhVar, i));
        this.j.a.jobFinished((JobParameters) fzdVar.c, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:126|127|(1:129)(3:349|350|(2:353|354)(1:352))|130|(1:132)(1:348)|133|(3:(3:(4:(5:(1:136)|137|(1:139)|140|(10:142|143|144|145|(11:147|(2:325|326)(1:149)|150|(1:152)|153|(1:155)(1:324)|156|(1:158)|208|209|210)(9:327|(1:329)(1:342)|330|(1:332)(1:341)|333|(1:335)(1:340)|336|(1:338)|339)|211|212|213|214|329))|213|214|329)|211|212)|145|(0)(0))|347|143|144) */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0418, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0419, code lost:
        r17 = r13;
        r15 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x027d A[Catch: RemoteException -> 0x0418, all -> 0x0444, TRY_LEAVE, TryCatch #15 {all -> 0x0444, blocks: (B:130:0x024c, B:133:0x025d, B:144:0x0273, B:147:0x027d, B:150:0x0295, B:153:0x029e, B:156:0x02ac, B:208:0x02b2, B:149:0x0293, B:350:0x0233, B:352:0x0247), top: B:349:0x0233 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0439 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x032a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x02ca A[Catch: RemoteException -> 0x0416, all -> 0x0442, TryCatch #14 {all -> 0x0442, blocks: (B:210:0x02c6, B:212:0x030e, B:195:0x041d, B:196:0x042b, B:162:0x0477, B:327:0x02ca, B:329:0x02d8, B:330:0x02df, B:332:0x02e7, B:333:0x02ee, B:335:0x02f2, B:336:0x02f9, B:338:0x02ff, B:339:0x0301, B:340:0x02f7, B:341:0x02ec, B:342:0x02dd), top: B:121:0x0204 }] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:436:0x04e1 -> B:437:0x04da). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.fzd r21) {
        /*
            Method dump skipped, instructions count: 1306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fze.c(fzd):void");
    }

    public final void d(fzd fzdVar, boolean z) {
        f(fzdVar, null, 1, z);
    }

    public final boolean e(boolean z, String str, joc jocVar) {
        Set<jpa> b2;
        if (z) {
            b2 = this.k.a(jocVar, str);
        } else {
            b2 = this.k.b(jocVar, str);
        }
        for (jpa jpaVar : b2) {
            jpa jpaVar2 = jpa.BATTERY_NOT_OK;
            int ordinal = jpaVar.ordinal();
            if (ordinal == 0) {
                this.h.e(job.IN_APP_TRAINING_JOB_SERVICE_INTERRUPT_BATTERY_NOT_OK);
            } else if (ordinal == 1) {
                this.h.e(job.IN_APP_TRAINING_JOB_SERVICE_INTERRUPT_NETWORK_NOT_OK);
            } else if (ordinal == 2) {
                this.h.e(job.IN_APP_TRAINING_JOB_SERVICE_INTERRUPT_NOT_IDLE);
            } else if (ordinal == 3) {
                this.h.e(job.IN_APP_TRAINING_JOB_SERVICE_INTERRUPT_THERMALS_NOT_OK);
            }
        }
        return b2.isEmpty();
    }
}
