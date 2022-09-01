package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ery  reason: default package */
/* loaded from: classes.dex */
public final class ery implements eqy {
    private final /* synthetic */ int a;
    private final Object b;

    public ery(List list, int i) {
        this.a = i;
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        hashSet.addAll(list);
    }

    public ery(Set set, int i) {
        this.a = i;
        this.b = set;
    }

    public ery(llw llwVar, int i) {
        this.a = i;
        this.b = llwVar;
    }

    public ery(eqy[] eqyVarArr, int i) {
        this.a = i;
        this.b = eqyVarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection, java.lang.Object] */
    @Override // defpackage.eqy
    public final euw a(euw euwVar, Set set) {
        int i = this.a;
        if (i == 0) {
            nfh nfhVar = (nfh) euwVar.N(5);
            nfhVar.cG(euwVar);
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            euw euwVar2 = euw.c;
            ((euw) nfhVar.b).a = euw.G();
            for (euv euvVar : euwVar.a) {
                if (!this.b.contains(euvVar)) {
                    nfhVar.cN(euvVar);
                }
            }
            return (euw) nfhVar.cz();
        } else if (i == 1) {
            for (eqy eqyVar : (eqy[]) this.b) {
                euwVar = eqyVar.a(euwVar, set);
            }
            return euwVar;
        } else if (i == 2) {
            nfh nfhVar2 = (nfh) euwVar.N(5);
            nfhVar2.cG(euwVar);
            if (nfhVar2.c) {
                nfhVar2.cD();
                nfhVar2.c = false;
            }
            euw euwVar3 = euw.c;
            ((euw) nfhVar2.b).a = euw.G();
            for (euv euvVar2 : euwVar.a) {
                ArrayList arrayList = new ArrayList(euvVar2.b);
                if (arrayList.removeAll(this.b)) {
                    if (!arrayList.isEmpty()) {
                        nfh nfhVar3 = (nfh) euvVar2.N(5);
                        nfhVar3.cG(euvVar2);
                        if (nfhVar3.c) {
                            nfhVar3.cD();
                            nfhVar3.c = false;
                        }
                        ((euv) nfhVar3.b).b = nfm.G();
                        nfhVar3.cL(arrayList);
                        nfhVar2.dJ(nfhVar3);
                    }
                } else {
                    nfhVar2.cN(euvVar2);
                }
            }
            return (euw) nfhVar2.cz();
        } else {
            nfh nfhVar4 = (nfh) euwVar.N(5);
            nfhVar4.cG(euwVar);
            if (nfhVar4.c) {
                nfhVar4.cD();
                nfhVar4.c = false;
            }
            euw euwVar4 = euw.c;
            ((euw) nfhVar4.b).a = euw.G();
            for (euv euvVar3 : euwVar.a) {
                ArrayList arrayList2 = new ArrayList(euvVar3.b.size());
                for (String str : euvVar3.b) {
                    String str2 = (String) ((llw) this.b).get(str);
                    if (str2 != null) {
                        str = str2;
                    }
                    arrayList2.add(str);
                }
                nfh nfhVar5 = (nfh) euvVar3.N(5);
                nfhVar5.cG(euvVar3);
                if (nfhVar5.c) {
                    nfhVar5.cD();
                    nfhVar5.c = false;
                }
                ((euv) nfhVar5.b).b = nfm.G();
                nfhVar5.cL(arrayList2);
                nfhVar4.cN((euv) nfhVar5.cz());
            }
            return (euw) nfhVar4.cz();
        }
    }
}
