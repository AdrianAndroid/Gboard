package defpackage;

import android.os.health.HealthStats;

/* compiled from: PG */
/* renamed from: kdd  reason: default package */
/* loaded from: classes.dex */
final class kdd extends kdc {
    public static final kdd a = new kdd();

    private kdd() {
    }

    @Override // defpackage.kdc
    public final /* synthetic */ ngz a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        nfh t = onj.e.t();
        int d = (int) kcu.d(healthStats, 50001);
        if (d != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onj onjVar = (onj) t.b;
            onjVar.a |= 1;
            onjVar.b = d;
        }
        int d2 = (int) kcu.d(healthStats, 50002);
        if (d2 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onj onjVar2 = (onj) t.b;
            onjVar2.a |= 2;
            onjVar2.c = d2;
        }
        if (str != null) {
            onf g = kcu.g(str);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onj onjVar3 = (onj) t.b;
            g.getClass();
            onjVar3.d = g;
            onjVar3.a |= 4;
        }
        onj onjVar4 = (onj) t.cz();
        if (kcu.n(onjVar4)) {
            return null;
        }
        return onjVar4;
    }

    @Override // defpackage.kdc
    public final /* synthetic */ ngz b(ngz ngzVar, ngz ngzVar2) {
        int i;
        int i2;
        onj onjVar = (onj) ngzVar;
        onj onjVar2 = (onj) ngzVar2;
        if (onjVar == null || onjVar2 == null) {
            return onjVar;
        }
        nfh t = onj.e.t();
        if ((onjVar.a & 1) != 0 && (i2 = onjVar.b - onjVar2.b) != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onj onjVar3 = (onj) t.b;
            onjVar3.a |= 1;
            onjVar3.b = i2;
        }
        if ((onjVar.a & 2) != 0 && (i = onjVar.c - onjVar2.c) != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onj onjVar4 = (onj) t.b;
            onjVar4.a |= 2;
            onjVar4.c = i;
        }
        onf onfVar = onjVar.d;
        if (onfVar == null) {
            onfVar = onf.d;
        }
        if (t.c) {
            t.cD();
            t.c = false;
        }
        onj onjVar5 = (onj) t.b;
        onfVar.getClass();
        onjVar5.d = onfVar;
        onjVar5.a |= 4;
        onj onjVar6 = (onj) t.cz();
        if (!kcu.n(onjVar6)) {
            return onjVar6;
        }
        return null;
    }

    @Override // defpackage.kdc
    public final /* bridge */ /* synthetic */ String c(ngz ngzVar) {
        onf onfVar = ((onj) ngzVar).d;
        if (onfVar == null) {
            onfVar = onf.d;
        }
        return onfVar.c;
    }
}
