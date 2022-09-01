package defpackage;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aqz  reason: default package */
/* loaded from: classes.dex */
public final class aqz {
    private static final azp a = azp.k("ch", "size", "w", "style", "fFamily", "data");
    private static final azp b = azp.k("shapes");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aoy a(arw arwVar, amp ampVar) {
        ArrayList arrayList = new ArrayList();
        arwVar.i();
        String str = null;
        String str2 = null;
        double d = 0.0d;
        char c = 0;
        while (arwVar.o()) {
            int r = arwVar.r(a);
            if (r == 0) {
                c = arwVar.g().charAt(0);
            } else if (r == 1) {
                arwVar.a();
            } else if (r == 2) {
                d = arwVar.a();
            } else if (r == 3) {
                str = arwVar.g();
            } else if (r == 4) {
                str2 = arwVar.g();
            } else if (r == 5) {
                arwVar.i();
                while (arwVar.o()) {
                    if (arwVar.r(b) == 0) {
                        arwVar.h();
                        while (arwVar.o()) {
                            arrayList.add((aqa) aqw.a(arwVar, ampVar));
                        }
                        arwVar.j();
                    } else {
                        arwVar.m();
                        arwVar.n();
                    }
                }
                arwVar.k();
            } else {
                arwVar.m();
                arwVar.n();
            }
        }
        arwVar.k();
        return new aoy(arrayList, c, d, str, str2);
    }
}
