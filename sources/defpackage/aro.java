package defpackage;

import android.graphics.Path;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aro  reason: default package */
/* loaded from: classes.dex */
public final class aro {
    private static final azp a = azp.k("nm", "c", "o", "fillEnabled", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static apz a(arw arwVar, amp ampVar) {
        apg apgVar = null;
        String str = null;
        apd apdVar = null;
        int i = 1;
        boolean z = false;
        boolean z2 = false;
        while (arwVar.o()) {
            int r = arwVar.r(a);
            if (r == 0) {
                str = arwVar.g();
            } else if (r == 1) {
                apdVar = xk.d(arwVar, ampVar);
            } else if (r == 2) {
                apgVar = xk.h(arwVar, ampVar);
            } else if (r == 3) {
                z = arwVar.p();
            } else if (r == 4) {
                i = arwVar.b();
            } else if (r == 5) {
                z2 = arwVar.p();
            } else {
                arwVar.m();
                arwVar.n();
            }
        }
        if (apgVar == null) {
            apgVar = new apg(Collections.singletonList(new asi(100)));
        }
        return new apz(str, z, i == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, apdVar, apgVar, z2);
    }
}
