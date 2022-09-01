package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: arm  reason: default package */
/* loaded from: classes.dex */
public final class arm {
    private static final azp a = azp.k("nm", "c", "o", "tr", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static apx a(arw arwVar, amp ampVar) {
        String str = null;
        ape apeVar = null;
        ape apeVar2 = null;
        apn apnVar = null;
        boolean z = false;
        while (arwVar.o()) {
            int r = arwVar.r(a);
            if (r == 0) {
                str = arwVar.g();
            } else if (r == 1) {
                apeVar = xk.f(arwVar, ampVar, false);
            } else if (r == 2) {
                apeVar2 = xk.f(arwVar, ampVar, false);
            } else if (r == 3) {
                apnVar = aqu.a(arwVar, ampVar);
            } else if (r == 4) {
                z = arwVar.p();
            } else {
                arwVar.n();
            }
        }
        return new apx(str, apeVar, apeVar2, apnVar, z);
    }
}
