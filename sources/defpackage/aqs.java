package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: aqs  reason: default package */
/* loaded from: classes.dex */
public final class aqs {
    private static final azp a = azp.k("k", "x", "y");

    public static aph a(arw arwVar, amp ampVar) {
        ArrayList arrayList = new ArrayList();
        if (arwVar.q() == 1) {
            arwVar.h();
            while (arwVar.o()) {
                arrayList.add(new aon(ampVar, arf.a(arwVar, ampVar, ash.a(), aqy.d, arwVar.q() == 3, false)));
            }
            arwVar.j();
            arg.b(arrayList);
        } else {
            arrayList.add(new asi(are.c(arwVar, ash.a())));
        }
        return new aph(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static apo b(arw arwVar, amp ampVar) {
        arwVar.i();
        aph aphVar = null;
        ape apeVar = null;
        ape apeVar2 = null;
        boolean z = false;
        while (arwVar.q() != 4) {
            int r = arwVar.r(a);
            if (r == 0) {
                aphVar = a(arwVar, ampVar);
            } else if (r != 1) {
                if (r == 2) {
                    if (arwVar.q() == 6) {
                        arwVar.n();
                        z = true;
                    } else {
                        apeVar2 = xk.e(arwVar, ampVar);
                    }
                } else {
                    arwVar.m();
                    arwVar.n();
                }
            } else if (arwVar.q() == 6) {
                arwVar.n();
                z = true;
            } else {
                apeVar = xk.e(arwVar, ampVar);
            }
        }
        arwVar.k();
        if (z) {
            ampVar.d("Lottie doesn't support expressions.");
        }
        return aphVar != null ? aphVar : new apl(apeVar, apeVar2);
    }
}
