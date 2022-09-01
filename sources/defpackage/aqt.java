package defpackage;

/* compiled from: PG */
/* renamed from: aqt  reason: default package */
/* loaded from: classes.dex */
public final class aqt {
    private static final azp a = azp.k("a");
    private static final azp b = azp.k("fc", "sc", "sw", "t");

    public static bhc a(arw arwVar, amp ampVar) {
        arwVar.i();
        bhc bhcVar = null;
        while (arwVar.o()) {
            if (arwVar.r(a) == 0) {
                arwVar.i();
                apd apdVar = null;
                apd apdVar2 = null;
                ape apeVar = null;
                ape apeVar2 = null;
                while (arwVar.o()) {
                    int r = arwVar.r(b);
                    if (r == 0) {
                        apdVar = xk.d(arwVar, ampVar);
                    } else if (r == 1) {
                        apdVar2 = xk.d(arwVar, ampVar);
                    } else if (r == 2) {
                        apeVar = xk.e(arwVar, ampVar);
                    } else if (r == 3) {
                        apeVar2 = xk.e(arwVar, ampVar);
                    } else {
                        arwVar.m();
                        arwVar.n();
                    }
                }
                arwVar.k();
                bhcVar = new bhc(apdVar, apdVar2, apeVar, apeVar2);
            } else {
                arwVar.m();
                arwVar.n();
            }
        }
        arwVar.k();
        return bhcVar == null ? new bhc((apd) null, (apd) null, (ape) null, (ape) null) : bhcVar;
    }
}
