package defpackage;

/* compiled from: PG */
/* renamed from: kcz  reason: default package */
/* loaded from: classes.dex */
final class kcz extends kdc {
    public static final kcz a = new kcz();

    private kcz() {
    }

    @Override // defpackage.kdc
    public final /* bridge */ /* synthetic */ ngz a(String str, Object obj) {
        int intValue = ((Long) obj).intValue();
        if (intValue == 0) {
            return null;
        }
        nfh t = one.d.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        one oneVar = (one) t.b;
        oneVar.a |= 1;
        oneVar.b = intValue;
        if (str != null) {
            onf g = kcu.g(str);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            one oneVar2 = (one) t.b;
            g.getClass();
            oneVar2.c = g;
            oneVar2.a |= 2;
        }
        return (one) t.cz();
    }

    @Override // defpackage.kdc
    public final /* synthetic */ ngz b(ngz ngzVar, ngz ngzVar2) {
        int i;
        one oneVar = (one) ngzVar;
        one oneVar2 = (one) ngzVar2;
        if (oneVar == null || oneVar2 == null) {
            return oneVar;
        }
        if ((oneVar.a & 1) == 0 || (i = oneVar.b - oneVar2.b) == 0) {
            return null;
        }
        nfh t = one.d.t();
        if ((oneVar.a & 2) != 0) {
            onf onfVar = oneVar.c;
            if (onfVar == null) {
                onfVar = onf.d;
            }
            if (t.c) {
                t.cD();
                t.c = false;
            }
            one oneVar3 = (one) t.b;
            onfVar.getClass();
            oneVar3.c = onfVar;
            oneVar3.a |= 2;
        }
        if (t.c) {
            t.cD();
            t.c = false;
        }
        one oneVar4 = (one) t.b;
        oneVar4.a |= 1;
        oneVar4.b = i;
        return (one) t.cz();
    }

    @Override // defpackage.kdc
    public final /* bridge */ /* synthetic */ String c(ngz ngzVar) {
        onf onfVar = ((one) ngzVar).c;
        if (onfVar == null) {
            onfVar = onf.d;
        }
        return onfVar.c;
    }
}
