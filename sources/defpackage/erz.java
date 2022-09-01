package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: erz  reason: default package */
/* loaded from: classes.dex */
public final class erz implements eqy {
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
            euu b = euu.b(euvVar.c);
            if (b == null) {
                b = euu.NONE;
            }
            if (b != euu.DEPRECATED_BACKGROUND_IMAGE) {
                nfhVar.cN(euvVar);
            } else if ((euvVar.a & 2) != 0) {
                eut eutVar = euvVar.d;
                if (eutVar == null) {
                    eutVar = eut.j;
                }
                if (!eutVar.c.isEmpty()) {
                    nga ngaVar = euvVar.b;
                    nfh t = euv.g.t();
                    euu euuVar = euu.BACKGROUND_IMAGE_REF;
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    euv euvVar2 = (euv) t.b;
                    euvVar2.c = euuVar.ae;
                    euvVar2.a |= 1;
                    nfh t2 = eut.j.t();
                    eut eutVar2 = euvVar.d;
                    if (eutVar2 == null) {
                        eutVar2 = eut.j;
                    }
                    String str = eutVar2.c;
                    if (t2.c) {
                        t2.cD();
                        t2.c = false;
                    }
                    eut eutVar3 = (eut) t2.b;
                    str.getClass();
                    eutVar3.a |= 2;
                    eutVar3.c = str;
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    euv euvVar3 = (euv) t.b;
                    eut eutVar4 = (eut) t2.cz();
                    eutVar4.getClass();
                    euvVar3.d = eutVar4;
                    euvVar3.a |= 2;
                    t.cL(ngaVar);
                    nfhVar.dJ(t);
                    nfh t3 = euv.g.t();
                    euu euuVar2 = euu.BACKGROUND_IMAGE_GRAVITY;
                    if (t3.c) {
                        t3.cD();
                        t3.c = false;
                    }
                    euv euvVar4 = (euv) t3.b;
                    euvVar4.c = euuVar2.ae;
                    euvVar4.a |= 1;
                    nfh t4 = eut.j.t();
                    eut eutVar5 = euvVar.d;
                    if (eutVar5 == null) {
                        eutVar5 = eut.j;
                    }
                    nfu<eur> nfuVar = new nfu(eutVar5.e, eut.f);
                    if (t4.c) {
                        t4.cD();
                        t4.c = false;
                    }
                    eut eutVar6 = (eut) t4.b;
                    nfs nfsVar = eutVar6.e;
                    if (!nfsVar.c()) {
                        eutVar6.e = nfm.D(nfsVar);
                    }
                    for (eur eurVar : nfuVar) {
                        eutVar6.e.g(eurVar.e);
                    }
                    if (t3.c) {
                        t3.cD();
                        t3.c = false;
                    }
                    euv euvVar5 = (euv) t3.b;
                    eut eutVar7 = (eut) t4.cz();
                    eutVar7.getClass();
                    euvVar5.d = eutVar7;
                    euvVar5.a |= 2;
                    t3.cL(ngaVar);
                    nfhVar.dJ(t3);
                    nfh t5 = euv.g.t();
                    euu euuVar3 = euu.BACKGROUND_IMAGE_SCALE_MODE;
                    if (t5.c) {
                        t5.cD();
                        t5.c = false;
                    }
                    euv euvVar6 = (euv) t5.b;
                    euvVar6.c = euuVar3.ae;
                    euvVar6.a |= 1;
                    nfh t6 = eut.j.t();
                    eut eutVar8 = euvVar.d;
                    if (eutVar8 == null) {
                        eutVar8 = eut.j;
                    }
                    nfu<eus> nfuVar2 = new nfu(eutVar8.g, eut.h);
                    if (t6.c) {
                        t6.cD();
                        t6.c = false;
                    }
                    eut eutVar9 = (eut) t6.b;
                    nfs nfsVar2 = eutVar9.g;
                    if (!nfsVar2.c()) {
                        eutVar9.g = nfm.D(nfsVar2);
                    }
                    for (eus eusVar : nfuVar2) {
                        eutVar9.g.g(eusVar.c);
                    }
                    if (t5.c) {
                        t5.cD();
                        t5.c = false;
                    }
                    euv euvVar7 = (euv) t5.b;
                    eut eutVar10 = (eut) t6.cz();
                    eutVar10.getClass();
                    euvVar7.d = eutVar10;
                    euvVar7.a |= 2;
                    t5.cL(ngaVar);
                    nfhVar.dJ(t5);
                    String str2 = true != "background_image_size".equals(euvVar.e) ? "" : "mirror";
                    nfh t7 = euv.g.t();
                    euu euuVar4 = euu.BACKGROUND_IMAGE_TILE_MODE;
                    if (t7.c) {
                        t7.cD();
                        t7.c = false;
                    }
                    euv euvVar8 = (euv) t7.b;
                    euvVar8.c = euuVar4.ae;
                    euvVar8.a |= 1;
                    nfh t8 = eut.j.t();
                    if (t8.c) {
                        t8.cD();
                        t8.c = false;
                    }
                    eut eutVar11 = (eut) t8.b;
                    eutVar11.a |= 2;
                    eutVar11.c = str2;
                    if (t7.c) {
                        t7.cD();
                        t7.c = false;
                    }
                    euv euvVar9 = (euv) t7.b;
                    eut eutVar12 = (eut) t8.cz();
                    eutVar12.getClass();
                    euvVar9.d = eutVar12;
                    euvVar9.a |= 2;
                    t7.cL(ngaVar);
                    nfhVar.dJ(t7);
                    if (!"background_image_size".equals(euvVar.e)) {
                        nfh t9 = euv.g.t();
                        euu euuVar5 = euu.BACKGROUND_IMAGE_WIDTH;
                        if (t9.c) {
                            t9.cD();
                            t9.c = false;
                        }
                        euv euvVar10 = (euv) t9.b;
                        euvVar10.c = euuVar5.ae;
                        euvVar10.a |= 1;
                        nfh t10 = eut.j.t();
                        if (t10.c) {
                            t10.cD();
                            t10.c = false;
                        }
                        eut eutVar13 = (eut) t10.b;
                        eutVar13.a |= 16;
                        eutVar13.i = 0.0d;
                        if (t9.c) {
                            t9.cD();
                            t9.c = false;
                        }
                        euv euvVar11 = (euv) t9.b;
                        eut eutVar14 = (eut) t10.cz();
                        eutVar14.getClass();
                        euvVar11.d = eutVar14;
                        euvVar11.a |= 2;
                        t9.cL(ngaVar);
                        nfhVar.dJ(t9);
                        nfh t11 = euv.g.t();
                        euu euuVar6 = euu.BACKGROUND_IMAGE_HEIGHT;
                        if (t11.c) {
                            t11.cD();
                            t11.c = false;
                        }
                        euv euvVar12 = (euv) t11.b;
                        euvVar12.c = euuVar6.ae;
                        euvVar12.a |= 1;
                        nfh t12 = eut.j.t();
                        if (t12.c) {
                            t12.cD();
                            t12.c = false;
                        }
                        eut eutVar15 = (eut) t12.b;
                        eutVar15.a |= 16;
                        eutVar15.i = 0.0d;
                        if (t11.c) {
                            t11.cD();
                            t11.c = false;
                        }
                        euv euvVar13 = (euv) t11.b;
                        eut eutVar16 = (eut) t12.cz();
                        eutVar16.getClass();
                        euvVar13.d = eutVar16;
                        euvVar13.a |= 2;
                        t11.cL(ngaVar);
                        nfhVar.dJ(t11);
                    } else {
                        nfh t13 = euv.g.t();
                        euu euuVar7 = euu.BACKGROUND_IMAGE_WIDTH;
                        if (t13.c) {
                            t13.cD();
                            t13.c = false;
                        }
                        euv euvVar14 = (euv) t13.b;
                        euvVar14.c = euuVar7.ae;
                        int i = euvVar14.a | 1;
                        euvVar14.a = i;
                        euvVar14.a = i | 4;
                        euvVar14.e = "background_image_width";
                        t13.cL(ngaVar);
                        nfhVar.dJ(t13);
                        nfh t14 = euv.g.t();
                        euu euuVar8 = euu.BACKGROUND_IMAGE_HEIGHT;
                        if (t14.c) {
                            t14.cD();
                            t14.c = false;
                        }
                        euv euvVar15 = (euv) t14.b;
                        euvVar15.c = euuVar8.ae;
                        int i2 = euvVar15.a | 1;
                        euvVar15.a = i2;
                        euvVar15.a = i2 | 4;
                        euvVar15.e = "background_image_height";
                        t14.cL(ngaVar);
                        nfhVar.dJ(t14);
                    }
                }
            }
        }
        return (euw) nfhVar.cz();
    }
}
