package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: gbs  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gbs implements gbw {
    public final /* synthetic */ gbx a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ gbs(gbx gbxVar, int i, int i2) {
        this.c = i2;
        this.a = gbxVar;
        this.b = i;
    }

    @Override // defpackage.gbw
    public final lfc a(jof jofVar) {
        boolean z;
        boolean z2 = true;
        if (this.c != 0) {
            gbx gbxVar = this.a;
            int i = this.b;
            nfh nfhVar = (nfh) jofVar.N(5);
            nfhVar.cG(jofVar);
            joe q = gbx.q(nfhVar, i);
            if (q == null) {
                return lfc.a(jofVar, null);
            }
            if (!gbxVar.f.az(gbxVar.e.getPackageName())) {
                gbxVar.g.e(job.IN_APP_TRAINING_JOB_REMOVED_BECAUSE_DISABLED);
                z = true;
            } else {
                z = false;
            }
            long millis = TimeUnit.SECONDS.toMillis(gbxVar.f.z());
            long a = gbxVar.h.a();
            nhy nhyVar = q.g;
            if (nhyVar == null) {
                nhyVar = nhy.c;
            }
            long a2 = niu.a(nhyVar);
            if (millis <= 0 || a - a2 <= millis) {
                z2 = z;
            } else {
                gbxVar.g.e(job.IN_APP_TRAINING_JOB_REMOVED_BECAUSE_TTLD);
            }
            if (q.a == 13 && ((joa) q.b).c.isEmpty()) {
                gbxVar.g.e(job.IN_APP_TRAINING_JOB_REMOVED_BECAUSE_EMPTY_OUTPUT_DIRECTORY);
            } else if (!z2) {
                nfh nfhVar2 = (nfh) q.N(5);
                nfhVar2.cG(q);
                nhy b = niu.b(gbxVar.h.a());
                if (nfhVar2.c) {
                    nfhVar2.cD();
                    nfhVar2.c = false;
                }
                b.getClass();
                ((joe) nfhVar2.b).h = b;
                joe joeVar = (joe) nfhVar2.cz();
                nfhVar.dd(joeVar);
                return lfc.a((jof) nfhVar.cz(), joeVar);
            }
            return lfc.a((jof) nfhVar.cz(), null);
        }
        gbx gbxVar2 = this.a;
        int i2 = this.b;
        nfh nfhVar3 = (nfh) jofVar.N(5);
        nfhVar3.cG(jofVar);
        List<joe> arrayList = new ArrayList();
        if (i2 == 0) {
            arrayList = gbx.u(nfhVar3, dyv.i);
        } else if (i2 == 1) {
            arrayList = gbx.u(nfhVar3, dyv.j);
        } else if (i2 == 2) {
            arrayList = gbx.u(nfhVar3, dyv.k);
        } else if (i2 == 3) {
            arrayList = gbx.u(nfhVar3, dyv.l);
        }
        for (joe joeVar2 : arrayList) {
            gbxVar2.i.a(joeVar2);
        }
        for (joe joeVar3 : arrayList) {
            if (joeVar3.a == 13) {
                z2 &= gbxVar2.k((joa) joeVar3.b);
            }
        }
        if (!z2) {
            gbxVar2.g.e(job.OUTPUT_DIR_DELETION_ERROR_WHEN_CANCELING_TASK);
        }
        return lfc.a((jof) nfhVar3.cz(), Boolean.valueOf(z2));
    }
}
