package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: PG */
/* renamed from: erw  reason: default package */
/* loaded from: classes.dex */
public final class erw implements eqy {
    private static final llw a = llw.o(eur.GRAVITY_BOTTOM, "bottom", eur.GRAVITY_LEFT, "left", eur.GRAVITY_RIGHT, "right", eur.GRAVITY_TOP, "top");
    private static final llw b = llw.m(eus.SCALE_MODE_FILL_HORIZONTAL, "fill_horizontal", eus.SCALE_MODE_FILL_VERTICAL, "fill_vertical");

    @Override // defpackage.eqy
    public final euw a(euw euwVar, Set set) {
        nfh nfhVar = (nfh) euwVar.N(5);
        nfhVar.cG(euwVar);
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        euw euwVar2 = euw.c;
        ((euw) nfhVar.b).a = euw.G();
        for (euv euvVar : euwVar.a) {
            if ((euvVar.a & 2) != 0) {
                eut eutVar = euvVar.d;
                if (eutVar == null) {
                    eutVar = eut.j;
                }
                if (eutVar.e.size() == 0) {
                    eut eutVar2 = euvVar.d;
                    if (eutVar2 == null) {
                        eutVar2 = eut.j;
                    }
                    if (eutVar2.g.size() == 0) {
                    }
                }
                eut eutVar3 = euvVar.d;
                if (eutVar3 == null) {
                    eutVar3 = eut.j;
                }
                nfh nfhVar2 = (nfh) eutVar3.N(5);
                nfhVar2.cG(eutVar3);
                eut eutVar4 = euvVar.d;
                if (eutVar4 == null) {
                    eutVar4 = eut.j;
                }
                if (eutVar4.e.size() > 0) {
                    eut eutVar5 = euvVar.d;
                    if (eutVar5 == null) {
                        eutVar5 = eut.j;
                    }
                    ArrayList arrayList = new ArrayList(eutVar5.e.size());
                    for (eur eurVar : new nfu(eutVar5.e, eut.f)) {
                        arrayList.add((String) a.get(eurVar));
                    }
                    String f = lex.c('|').e().f(arrayList);
                    if (nfhVar2.c) {
                        nfhVar2.cD();
                        nfhVar2.c = false;
                    }
                    eut eutVar6 = (eut) nfhVar2.b;
                    eutVar6.a |= 2;
                    eutVar6.c = f;
                    eutVar6.e = eut.C();
                }
                eut eutVar7 = euvVar.d;
                if (eutVar7 == null) {
                    eutVar7 = eut.j;
                }
                if (eutVar7.g.size() > 0) {
                    eut eutVar8 = euvVar.d;
                    if (eutVar8 == null) {
                        eutVar8 = eut.j;
                    }
                    ArrayList arrayList2 = new ArrayList(eutVar8.g.size());
                    for (eus eusVar : new nfu(eutVar8.g, eut.h)) {
                        arrayList2.add((String) b.get(eusVar));
                    }
                    String f2 = lex.c('|').e().f(arrayList2);
                    if (nfhVar2.c) {
                        nfhVar2.cD();
                        nfhVar2.c = false;
                    }
                    eut eutVar9 = (eut) nfhVar2.b;
                    eutVar9.a |= 2;
                    eutVar9.c = f2;
                    eutVar9.g = eut.C();
                }
                nfh nfhVar3 = (nfh) euvVar.N(5);
                nfhVar3.cG(euvVar);
                if (nfhVar3.c) {
                    nfhVar3.cD();
                    nfhVar3.c = false;
                }
                euv euvVar2 = (euv) nfhVar3.b;
                eut eutVar10 = (eut) nfhVar2.cz();
                eutVar10.getClass();
                euvVar2.d = eutVar10;
                euvVar2.a |= 2;
                euvVar = (euv) nfhVar3.cz();
            }
            nfhVar.cN(euvVar);
        }
        return (euw) nfhVar.cz();
    }
}
