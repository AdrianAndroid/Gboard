package defpackage;

import android.os.health.HealthStats;
import java.util.Collections;

/* compiled from: PG */
/* renamed from: kda  reason: default package */
/* loaded from: classes.dex */
public final class kda extends kdc {
    public static final kda a = new kda();

    private kda() {
    }

    @Override // defpackage.kdc
    public final /* synthetic */ ngz a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        nfh t = ong.e.t();
        t.ei(kdd.a.d(kcu.f(healthStats, 40001)));
        t.ej(kcz.a.d((healthStats == null || !healthStats.hasMeasurements(40002)) ? Collections.emptyMap() : healthStats.getMeasurements(40002)));
        if (str != null) {
            onf g = kcu.g(str);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            ong ongVar = (ong) t.b;
            g.getClass();
            ongVar.d = g;
            ongVar.a |= 1;
        }
        ong ongVar2 = (ong) t.cz();
        if (kcu.l(ongVar2)) {
            return null;
        }
        return ongVar2;
    }

    @Override // defpackage.kdc
    public final /* synthetic */ ngz b(ngz ngzVar, ngz ngzVar2) {
        ong ongVar = (ong) ngzVar;
        ong ongVar2 = (ong) ngzVar2;
        if (ongVar == null || ongVar2 == null) {
            return ongVar;
        }
        nfh t = ong.e.t();
        t.ei(kdd.a.e(ongVar.b, ongVar2.b));
        t.ej(kcz.a.e(ongVar.c, ongVar2.c));
        onf onfVar = ongVar.d;
        if (onfVar == null) {
            onfVar = onf.d;
        }
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ong ongVar3 = (ong) t.b;
        onfVar.getClass();
        ongVar3.d = onfVar;
        ongVar3.a |= 1;
        ong ongVar4 = (ong) t.cz();
        if (!kcu.l(ongVar4)) {
            return ongVar4;
        }
        return null;
    }

    @Override // defpackage.kdc
    public final /* bridge */ /* synthetic */ String c(ngz ngzVar) {
        onf onfVar = ((ong) ngzVar).d;
        if (onfVar == null) {
            onfVar = onf.d;
        }
        return onfVar.c;
    }
}
