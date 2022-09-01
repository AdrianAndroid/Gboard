package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aqv  reason: default package */
/* loaded from: classes.dex */
public final class aqv {
    private static final azp a = azp.k("nm", "p", "s", "hd", "d");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static apq a(arw arwVar, amp ampVar, int i) {
        boolean z = i == 3;
        String str = null;
        apo apoVar = null;
        api apiVar = null;
        boolean z2 = false;
        while (arwVar.o()) {
            int r = arwVar.r(a);
            if (r == 0) {
                str = arwVar.g();
            } else if (r == 1) {
                apoVar = aqs.b(arwVar, ampVar);
            } else if (r == 2) {
                apiVar = xk.i(arwVar, ampVar);
            } else if (r == 3) {
                z2 = arwVar.p();
            } else if (r == 4) {
                z = arwVar.b() == 3;
            } else {
                arwVar.m();
                arwVar.n();
            }
        }
        return new apq(str, apoVar, apiVar, z, z2);
    }
}
