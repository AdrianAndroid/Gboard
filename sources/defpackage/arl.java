package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: arl  reason: default package */
/* loaded from: classes.dex */
public final class arl {
    private static final azp a = azp.k("nm", "p", "s", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static apw a(arw arwVar, amp ampVar) {
        String str = null;
        apo apoVar = null;
        api apiVar = null;
        ape apeVar = null;
        boolean z = false;
        while (arwVar.o()) {
            int r = arwVar.r(a);
            if (r == 0) {
                str = arwVar.g();
            } else if (r == 1) {
                apoVar = aqs.b(arwVar, ampVar);
            } else if (r == 2) {
                apiVar = xk.i(arwVar, ampVar);
            } else if (r == 3) {
                apeVar = xk.e(arwVar, ampVar);
            } else if (r == 4) {
                z = arwVar.p();
            } else {
                arwVar.n();
            }
        }
        return new apw(str, apoVar, apiVar, apeVar, z);
    }
}
