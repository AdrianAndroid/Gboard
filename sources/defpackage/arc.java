package defpackage;

import android.graphics.Path;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: arc  reason: default package */
/* loaded from: classes.dex */
public final class arc {
    private static final azp a = azp.k("nm", "g", "o", "t", "s", "e", "r", "hd");
    private static final azp b = azp.k("p", "k");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aps a(arw arwVar, amp ampVar) {
        apg apgVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        apf apfVar = null;
        api apiVar = null;
        api apiVar2 = null;
        int i = 0;
        boolean z = false;
        while (arwVar.o()) {
            switch (arwVar.r(a)) {
                case 0:
                    str = arwVar.g();
                    break;
                case 1:
                    arwVar.i();
                    int i2 = -1;
                    while (arwVar.o()) {
                        int r = arwVar.r(b);
                        if (r == 0) {
                            i2 = arwVar.b();
                        } else if (r == 1) {
                            apfVar = xk.g(arwVar, ampVar, i2);
                        } else {
                            arwVar.m();
                            arwVar.n();
                        }
                    }
                    arwVar.k();
                    break;
                case 2:
                    apgVar = xk.h(arwVar, ampVar);
                    break;
                case 3:
                    if (arwVar.b() != 1) {
                        i = 2;
                        break;
                    } else {
                        i = 1;
                        break;
                    }
                case 4:
                    apiVar = xk.i(arwVar, ampVar);
                    break;
                case 5:
                    apiVar2 = xk.i(arwVar, ampVar);
                    break;
                case 6:
                    if (arwVar.b() != 1) {
                        fillType = Path.FillType.EVEN_ODD;
                        break;
                    } else {
                        fillType = Path.FillType.WINDING;
                        break;
                    }
                case 7:
                    z = arwVar.p();
                    break;
                default:
                    arwVar.m();
                    arwVar.n();
                    break;
            }
        }
        return new aps(str, i, fillType, apfVar, apgVar == null ? new apg(Collections.singletonList(new asi(100))) : apgVar, apiVar, apiVar2, z);
    }
}
