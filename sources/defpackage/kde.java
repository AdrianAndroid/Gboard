package defpackage;

import android.os.health.TimerStat;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kde  reason: default package */
/* loaded from: classes.dex */
public final class kde extends kdc {
    public static final kde a = new kde();

    private kde() {
    }

    @Override // defpackage.kdc
    public final /* synthetic */ ngz a(String str, Object obj) {
        return kcu.j(str, (TimerStat) obj);
    }

    @Override // defpackage.kdc
    public final /* synthetic */ ngz b(ngz ngzVar, ngz ngzVar2) {
        return kcu.i((onk) ngzVar, (onk) ngzVar2);
    }

    @Override // defpackage.kdc
    public final /* bridge */ /* synthetic */ String c(ngz ngzVar) {
        onk onkVar = (onk) ngzVar;
        onf onfVar = onkVar.d;
        if (onfVar == null) {
            onfVar = onf.d;
        }
        int i = onfVar.a & 2;
        onf onfVar2 = onkVar.d;
        if (i != 0) {
            if (onfVar2 == null) {
                onfVar2 = onf.d;
            }
            return onfVar2.c;
        }
        if (onfVar2 == null) {
            onfVar2 = onf.d;
        }
        return Long.toHexString(onfVar2.b);
    }
}
