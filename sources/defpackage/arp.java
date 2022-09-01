package defpackage;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: arp  reason: default package */
/* loaded from: classes.dex */
public final class arp {
    private static final azp a = azp.k("nm", "hd", "it");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aqa a(arw arwVar, amp ampVar) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (arwVar.o()) {
            int r = arwVar.r(a);
            if (r == 0) {
                str = arwVar.g();
            } else if (r == 1) {
                z = arwVar.p();
            } else if (r == 2) {
                arwVar.h();
                while (arwVar.o()) {
                    apr a2 = aqw.a(arwVar, ampVar);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                arwVar.j();
            } else {
                arwVar.n();
            }
        }
        return new aqa(str, arrayList, z);
    }
}
