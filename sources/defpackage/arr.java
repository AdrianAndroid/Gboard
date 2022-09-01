package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: arr  reason: default package */
/* loaded from: classes.dex */
public final class arr {
    private static final azp a = azp.k("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");
    private static final azp b = azp.k("n", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aqc a(arw arwVar, amp ampVar) {
        char c;
        ArrayList arrayList = new ArrayList();
        String str = null;
        ape apeVar = null;
        apd apdVar = null;
        ape apeVar2 = null;
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        boolean z = false;
        apg apgVar = null;
        while (true) {
            int i3 = 100;
            if (!arwVar.o()) {
                if (apgVar == null) {
                    apgVar = new apg(Collections.singletonList(new asi(100)));
                }
                return new aqc(str, apeVar, arrayList, apdVar, apgVar, apeVar2, i, i2, f, z);
            }
            switch (arwVar.r(a)) {
                case 0:
                    str = arwVar.g();
                    break;
                case 1:
                    apdVar = xk.d(arwVar, ampVar);
                    break;
                case 2:
                    apeVar2 = xk.e(arwVar, ampVar);
                    break;
                case 3:
                    apgVar = xk.h(arwVar, ampVar);
                    break;
                case 4:
                    i = wt.e()[arwVar.b() - 1];
                    break;
                case 5:
                    i2 = xa.c()[arwVar.b() - 1];
                    break;
                case 6:
                    f = (float) arwVar.a();
                    break;
                case 7:
                    z = arwVar.p();
                    break;
                case 8:
                    arwVar.h();
                    while (arwVar.o()) {
                        arwVar.i();
                        ape apeVar3 = null;
                        String str2 = null;
                        while (arwVar.o()) {
                            int r = arwVar.r(b);
                            if (r == 0) {
                                str2 = arwVar.g();
                            } else if (r == 1) {
                                apeVar3 = xk.e(arwVar, ampVar);
                            } else {
                                arwVar.m();
                                arwVar.n();
                            }
                        }
                        arwVar.k();
                        int hashCode = str2.hashCode();
                        if (hashCode == i3) {
                            if (str2.equals("d")) {
                                c = 1;
                            }
                            c = 65535;
                        } else if (hashCode != 103) {
                            if (hashCode == 111 && str2.equals("o")) {
                                c = 0;
                            }
                            c = 65535;
                        } else {
                            if (str2.equals("g")) {
                                c = 2;
                            }
                            c = 65535;
                        }
                        if (c == 0) {
                            apeVar = apeVar3;
                        } else if (c == 1 || c == 2) {
                            ampVar.f();
                            arrayList.add(apeVar3);
                        }
                        i3 = 100;
                    }
                    arwVar.j();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add((ape) arrayList.get(0));
                        break;
                    }
                default:
                    arwVar.n();
                    break;
            }
        }
    }
}
