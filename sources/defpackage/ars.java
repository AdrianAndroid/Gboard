package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ars  reason: default package */
/* loaded from: classes.dex */
public final class ars {
    private static final azp a = azp.k("s", "e", "o", "nm", "m", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aqd a(arw arwVar, amp ampVar) {
        ape apeVar = null;
        ape apeVar2 = null;
        ape apeVar3 = null;
        int i = 0;
        boolean z = false;
        while (arwVar.o()) {
            int r = arwVar.r(a);
            if (r == 0) {
                apeVar = xk.f(arwVar, ampVar, false);
            } else if (r == 1) {
                apeVar2 = xk.f(arwVar, ampVar, false);
            } else if (r == 2) {
                apeVar3 = xk.f(arwVar, ampVar, false);
            } else if (r == 3) {
                arwVar.g();
            } else if (r == 4) {
                int b = arwVar.b();
                if (b == 1) {
                    i = 1;
                } else if (b != 2) {
                    throw new IllegalArgumentException("Unknown trim path type " + b);
                } else {
                    i = 2;
                }
            } else if (r == 5) {
                z = arwVar.p();
            } else {
                arwVar.n();
            }
        }
        return new aqd(i, apeVar, apeVar2, apeVar3, z);
    }
}
