package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: esb  reason: default package */
/* loaded from: classes.dex */
public final class esb implements eqy {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/theme/core/converter/Uint32ToDoubleValueConverter");

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
            eut eutVar = euvVar.d;
            if (eutVar == null) {
                eutVar = eut.j;
            }
            if ((eutVar.a & 4) != 0) {
                eut eutVar2 = euvVar.d;
                if (eutVar2 == null) {
                    eutVar2 = eut.j;
                }
                nfh nfhVar2 = (nfh) eutVar2.N(5);
                nfhVar2.cG(eutVar2);
                eut eutVar3 = euvVar.d;
                if (eutVar3 == null) {
                    eutVar3 = eut.j;
                }
                long j = eutVar3.d;
                euu euuVar = euu.NONE;
                euu b = euu.b(euvVar.c);
                if (b == null) {
                    b = euu.NONE;
                }
                int ordinal = b.ordinal();
                if (ordinal == 3 || ordinal == 9 || ordinal == 10) {
                    double d = j;
                    Double.isNaN(d);
                    double d2 = d / 255.0d;
                    if (nfhVar2.c) {
                        nfhVar2.cD();
                        nfhVar2.c = false;
                    }
                    eut eutVar4 = (eut) nfhVar2.b;
                    eutVar4.a |= 16;
                    eutVar4.i = d2;
                } else if (ordinal != 12 && ordinal != 13) {
                    ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/theme/core/converter/Uint32ToDoubleValueConverter", "convertUint32Rule", 44, "Uint32ToDoubleValueConverter.java")).v("Unexpected rule with deprecated uint32 value: %d", j);
                } else {
                    double d3 = j;
                    if (nfhVar2.c) {
                        nfhVar2.cD();
                        nfhVar2.c = false;
                    }
                    eut eutVar5 = (eut) nfhVar2.b;
                    eutVar5.a |= 16;
                    eutVar5.i = d3;
                }
                if (nfhVar2.c) {
                    nfhVar2.cD();
                    nfhVar2.c = false;
                }
                eut eutVar6 = (eut) nfhVar2.b;
                eutVar6.a &= -5;
                eutVar6.d = 0;
                nfh nfhVar3 = (nfh) euvVar.N(5);
                nfhVar3.cG(euvVar);
                if (nfhVar3.c) {
                    nfhVar3.cD();
                    nfhVar3.c = false;
                }
                euv euvVar2 = (euv) nfhVar3.b;
                eut eutVar7 = (eut) nfhVar2.cz();
                eutVar7.getClass();
                euvVar2.d = eutVar7;
                euvVar2.a |= 2;
                euvVar = (euv) nfhVar3.cz();
            }
            nfhVar.cN(euvVar);
        }
        return (euw) nfhVar.cz();
    }
}
