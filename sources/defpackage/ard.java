package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ard  reason: default package */
/* loaded from: classes.dex */
public final class ard {
    private static final azp a = azp.k("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");
    private static final azp b = azp.k("p", "k");
    private static final azp c = azp.k("n", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static apt a(arw arwVar, amp ampVar) {
        apf apfVar;
        ArrayList arrayList = new ArrayList();
        String str = null;
        int i = 0;
        apf apfVar2 = null;
        api apiVar = null;
        api apiVar2 = null;
        ape apeVar = null;
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        ape apeVar2 = null;
        boolean z = false;
        apg apgVar = null;
        while (arwVar.o()) {
            switch (arwVar.r(a)) {
                case 0:
                    str = arwVar.g();
                    break;
                case 1:
                    arwVar.i();
                    int i4 = -1;
                    while (arwVar.o()) {
                        int r = arwVar.r(b);
                        if (r != 0) {
                            apfVar = apfVar2;
                            if (r == 1) {
                                apfVar = xk.g(arwVar, ampVar, i4);
                            } else {
                                arwVar.m();
                                arwVar.n();
                            }
                        } else {
                            apfVar = apfVar2;
                            i4 = arwVar.b();
                        }
                        apfVar2 = apfVar;
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
                    apeVar = xk.e(arwVar, ampVar);
                    break;
                case 7:
                    i2 = wt.e()[arwVar.b() - 1];
                    break;
                case 8:
                    i3 = xa.c()[arwVar.b() - 1];
                    break;
                case 9:
                    f = (float) arwVar.a();
                    break;
                case 10:
                    z = arwVar.p();
                    break;
                case 11:
                    arwVar.h();
                    while (arwVar.o()) {
                        arwVar.i();
                        ape apeVar3 = null;
                        String str2 = null;
                        while (arwVar.o()) {
                            int r2 = arwVar.r(c);
                            if (r2 != 0) {
                                ape apeVar4 = apeVar2;
                                if (r2 == 1) {
                                    apeVar3 = xk.e(arwVar, ampVar);
                                } else {
                                    arwVar.m();
                                    arwVar.n();
                                }
                                apeVar2 = apeVar4;
                            } else {
                                str2 = arwVar.g();
                            }
                        }
                        ape apeVar5 = apeVar2;
                        arwVar.k();
                        String str3 = str2;
                        if (str3.equals("o")) {
                            apeVar2 = apeVar3;
                        } else {
                            if (str3.equals("d") || str3.equals("g")) {
                                ampVar.f();
                                arrayList.add(apeVar3);
                            }
                            apeVar2 = apeVar5;
                        }
                    }
                    ape apeVar6 = apeVar2;
                    arwVar.j();
                    if (arrayList.size() == 1) {
                        arrayList.add((ape) arrayList.get(0));
                    }
                    apeVar2 = apeVar6;
                    break;
                default:
                    arwVar.m();
                    arwVar.n();
                    break;
            }
        }
        if (apgVar == null) {
            apgVar = new apg(Collections.singletonList(new asi(100)));
        }
        return new apt(str, i, apfVar2, apgVar, apiVar, apiVar2, apeVar, i2, i3, f, arrayList, apeVar2, z);
    }
}
