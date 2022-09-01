package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: arq  reason: default package */
/* loaded from: classes.dex */
public final class arq {
    static final azp a = azp.k("nm", "ind", "ks", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aqb a(arw arwVar, amp ampVar) {
        String str = null;
        apk apkVar = null;
        int i = 0;
        boolean z = false;
        while (arwVar.o()) {
            int r = arwVar.r(a);
            if (r == 0) {
                str = arwVar.g();
            } else if (r == 1) {
                i = arwVar.b();
            } else if (r == 2) {
                apkVar = xk.j(arwVar, ampVar);
            } else if (r == 3) {
                z = arwVar.p();
            } else {
                arwVar.n();
            }
        }
        return new aqb(str, i, apkVar, z);
    }
}
