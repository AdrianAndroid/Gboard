package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ara  reason: default package */
/* loaded from: classes.dex */
public final class ara {
    private static final azp a = azp.k("fFamily", "fName", "fStyle", "ascent");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static fws a(arw arwVar) {
        arwVar.i();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (arwVar.o()) {
            int r = arwVar.r(a);
            if (r == 0) {
                str = arwVar.g();
            } else if (r == 1) {
                str2 = arwVar.g();
            } else if (r == 2) {
                str3 = arwVar.g();
            } else if (r == 3) {
                arwVar.a();
            } else {
                arwVar.m();
                arwVar.n();
            }
        }
        arwVar.k();
        return new fws(str, str2, str3);
    }
}
