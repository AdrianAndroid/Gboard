package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: m  reason: default package */
/* loaded from: classes.dex */
public final class m extends q {
    int ag;
    int ah;
    private p am;
    protected final i af = new i();
    private int an = 0;
    private int ao = 0;
    private l[] ap = new l[4];
    private l[] aq = new l[4];
    private l[] ar = new l[4];
    public int ai = 2;
    private final boolean[] as = new boolean[3];
    private final l[] at = new l[4];
    public boolean aj = false;
    public boolean ak = false;

    private final int G(i iVar, l[] lVarArr, l lVar, int i, boolean[] zArr) {
        int i2;
        char c;
        char c2;
        zArr[0] = true;
        zArr[1] = false;
        l lVar2 = null;
        lVarArr[0] = null;
        lVarArr[2] = null;
        lVarArr[1] = null;
        lVarArr[3] = null;
        float f = 0.0f;
        int i3 = 5;
        if (i == 0) {
            k kVar = lVar.i.b;
            boolean z = kVar == null || kVar.a == this;
            lVar.ab = null;
            l lVar3 = lVar.K != 8 ? lVar : null;
            l lVar4 = lVar;
            l lVar5 = null;
            l lVar6 = lVar3;
            i2 = 0;
            while (lVar4.k.b != null) {
                lVar4.ab = lVar2;
                if (lVar4.K != 8) {
                    if (lVar3 == null) {
                        lVar3 = lVar4;
                    }
                    if (lVar6 != null && lVar6 != lVar4) {
                        lVar6.ab = lVar4;
                    }
                    lVar6 = lVar4;
                } else {
                    k kVar2 = lVar4.i;
                    iVar.n(kVar2.f, kVar2.b.f, 0, 5);
                    iVar.n(lVar4.k.f, lVar4.i.f, 0, 5);
                }
                if (lVar4.K != 8 && lVar4.ad == 3) {
                    if (lVar4.ae == 3) {
                        zArr[0] = false;
                    }
                    if (lVar4.u <= f) {
                        zArr[0] = false;
                        int i4 = i2 + 1;
                        l[] lVarArr2 = this.ap;
                        int length = lVarArr2.length;
                        if (i4 >= length) {
                            this.ap = (l[]) Arrays.copyOf(lVarArr2, length + length);
                        }
                        this.ap[i2] = lVar4;
                        i2 = i4;
                    }
                }
                l lVar7 = lVar4.k.b.a;
                k kVar3 = lVar7.i.b;
                if (kVar3 == null || kVar3.a != lVar4 || lVar7 == lVar4) {
                    break;
                }
                lVar5 = lVar7;
                lVar4 = lVar5;
                lVar2 = null;
                f = 0.0f;
            }
            k kVar4 = lVar4.k.b;
            if (kVar4 != null && kVar4.a != this) {
                z = false;
            }
            if (lVar.i.b == null || lVar5.k.b == null) {
                c2 = 1;
                zArr[1] = true;
            } else {
                c2 = 1;
            }
            lVar.X = z;
            lVar5.ab = null;
            lVarArr[0] = lVar;
            lVarArr[2] = lVar3;
            lVarArr[c2] = lVar5;
            lVarArr[3] = lVar6;
        } else {
            k kVar5 = lVar.j.b;
            boolean z2 = kVar5 == null || kVar5.a == this;
            l lVar8 = null;
            lVar.ac = null;
            l lVar9 = lVar;
            l lVar10 = null;
            l lVar11 = lVar.K != 8 ? lVar : null;
            l lVar12 = lVar11;
            int i5 = 0;
            while (lVar9.l.b != null) {
                lVar9.ac = lVar8;
                if (lVar9.K != 8) {
                    if (lVar11 == null) {
                        lVar11 = lVar9;
                    }
                    if (lVar12 != null && lVar12 != lVar9) {
                        lVar12.ac = lVar9;
                    }
                    lVar12 = lVar9;
                } else {
                    k kVar6 = lVar9.j;
                    iVar.n(kVar6.f, kVar6.b.f, 0, i3);
                    iVar.n(lVar9.l.f, lVar9.j.f, 0, i3);
                }
                if (lVar9.K != 8 && lVar9.ae == 3) {
                    if (lVar9.ad == 3) {
                        zArr[0] = false;
                    }
                    if (lVar9.u <= 0.0f) {
                        zArr[0] = false;
                        int i6 = i5 + 1;
                        l[] lVarArr3 = this.ap;
                        int length2 = lVarArr3.length;
                        if (i6 >= length2) {
                            this.ap = (l[]) Arrays.copyOf(lVarArr3, length2 + length2);
                        }
                        this.ap[i5] = lVar9;
                        i5 = i6;
                    }
                }
                l lVar13 = lVar9.l.b.a;
                k kVar7 = lVar13.j.b;
                if (kVar7 == null || kVar7.a != lVar9 || lVar13 == lVar9) {
                    break;
                }
                lVar10 = lVar13;
                lVar9 = lVar10;
                lVar8 = null;
                i3 = 5;
            }
            i2 = i5;
            k kVar8 = lVar9.l.b;
            if (kVar8 != null && kVar8.a != this) {
                z2 = false;
            }
            if (lVar.j.b == null || lVar10.l.b == null) {
                c = 1;
                zArr[1] = true;
            } else {
                c = 1;
            }
            lVar.Y = z2;
            lVar10.ac = null;
            lVarArr[0] = lVar;
            lVarArr[2] = lVar11;
            lVarArr[c] = lVar10;
            lVarArr[3] = lVar12;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:270:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x050f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void H(defpackage.i r31) {
        /*
            Method dump skipped, instructions count: 1380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m.H(i):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:280:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x052e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void I(defpackage.i r31) {
        /*
            Method dump skipped, instructions count: 1411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m.I(i):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0043, code lost:
        if (r12 != (-1)) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(defpackage.l r11, boolean[] r12) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m.B(l, boolean[]):void");
    }

    public final void C(l lVar, boolean[] zArr) {
        int i;
        l lVar2;
        int i2;
        k kVar;
        k kVar2;
        k kVar3;
        int i3;
        boolean z;
        k kVar4;
        k kVar5;
        k kVar6;
        k kVar7;
        l lVar3;
        boolean z2 = false;
        r1 = 0;
        int i4 = 0;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        if (lVar.ae != 3 || lVar.ad == 3 || lVar.u <= 0.0f) {
            int e = lVar.e();
            lVar.U = true;
            if (lVar instanceof n) {
                n nVar = (n) lVar;
                if (nVar.ai == 0) {
                    e = nVar.ag;
                    if (e == -1) {
                        int i5 = nVar.ah;
                        if (i5 != -1) {
                            i4 = i5;
                        }
                        e = 0;
                    }
                } else {
                    i4 = e;
                }
                i = e;
                e = i4;
            } else {
                k kVar8 = lVar.m;
                if (kVar8.b == null && lVar.j.b == null && lVar.l.b == null) {
                    i = lVar.x + e;
                } else {
                    k kVar9 = lVar.l.b;
                    if (kVar9 == null || (kVar7 = lVar.j.b) == null || (kVar9 != kVar7 && ((lVar3 = kVar9.a) != kVar7.a || lVar3 == lVar.r))) {
                        if (kVar8.c()) {
                            l lVar4 = lVar.m.b.a;
                            if (!lVar4.U) {
                                C(lVar4, zArr);
                            }
                            int max = Math.max((lVar4.L - lVar4.t) + e, e);
                            int max2 = Math.max((lVar4.O - lVar4.t) + e, e);
                            if (lVar.K == 8) {
                                int i6 = lVar.t;
                                max -= i6;
                                max2 -= i6;
                            }
                            lVar.L = max;
                            lVar.O = max2;
                            return;
                        }
                        l lVar5 = null;
                        if (lVar.j.c()) {
                            k kVar10 = lVar.j;
                            lVar2 = kVar10.b.a;
                            i = kVar10.a() + e;
                            if (!lVar2.s() && !lVar2.U) {
                                C(lVar2, zArr);
                            }
                        } else {
                            i = e;
                            lVar2 = null;
                        }
                        if (lVar.l.c()) {
                            k kVar11 = lVar.l;
                            l lVar6 = kVar11.b.a;
                            e += kVar11.a();
                            if (!lVar6.s() && !lVar6.U) {
                                C(lVar6, zArr);
                            }
                            lVar5 = lVar6;
                        }
                        if (lVar.j.b != null && !lVar2.s()) {
                            int i7 = lVar.j.b.g;
                            if (i7 == 3) {
                                i3 = lVar2.L - lVar2.e();
                            } else {
                                if (i7 == 5) {
                                    i3 = lVar2.L;
                                }
                                z = !lVar2.R || !((kVar5 = lVar2.j.b) == null || kVar5.a == lVar || (kVar6 = lVar2.l.b) == null || kVar6.a == lVar || lVar2.ae == 3);
                                lVar.R = z;
                                if (z && ((kVar4 = lVar2.l.b) == null || kVar4.a != lVar)) {
                                    i += i - lVar2.L;
                                }
                            }
                            i += i3;
                            if (!lVar2.R) {
                            }
                            lVar.R = z;
                            if (z) {
                                i += i - lVar2.L;
                            }
                        }
                        if (lVar.l.b != null && !lVar5.s()) {
                            int i8 = lVar.l.b.g;
                            if (i8 == 5) {
                                i2 = lVar5.O - lVar5.e();
                            } else {
                                if (i8 == 3) {
                                    i2 = lVar5.O;
                                }
                                if (!lVar5.S || ((kVar2 = lVar5.j.b) != null && kVar2.a != lVar && (kVar3 = lVar5.l.b) != null && kVar3.a != lVar && lVar5.ae != 3)) {
                                    z2 = true;
                                }
                                lVar.S = z2;
                                if (z2 && ((kVar = lVar5.j.b) == null || kVar.a != lVar)) {
                                    e += e - lVar5.O;
                                }
                            }
                            e += i2;
                            if (!lVar5.S) {
                            }
                            z2 = true;
                            lVar.S = z2;
                            if (z2) {
                                e += e - lVar5.O;
                            }
                        }
                    } else {
                        zArr[0] = false;
                        return;
                    }
                }
            }
            if (lVar.K == 8) {
                int i9 = lVar.t;
                i -= i9;
                e -= i9;
            }
            lVar.L = i;
            lVar.O = e;
            return;
        }
        zArr[0] = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05e3 A[LOOP:16: B:268:0x05e1->B:269:0x05e3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:275:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x051c  */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v21 */
    @Override // defpackage.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D() {
        /*
            Method dump skipped, instructions count: 1521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m.D():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x06b7, code lost:
        if (r3.K != 8) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean E(defpackage.i r21) {
        /*
            Method dump skipped, instructions count: 1774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m.E(i):boolean");
    }

    @Override // defpackage.q, defpackage.l
    public final void i() {
        this.af.l();
        super.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void A(l lVar, int i) {
        int i2 = 0;
        if (i == 0) {
            while (true) {
                k kVar = lVar.i;
                k kVar2 = kVar.b;
                if (kVar2 == null) {
                    break;
                }
                l lVar2 = kVar2.a;
                k kVar3 = lVar2.k.b;
                if (kVar3 == null || kVar3 != kVar || lVar2 == lVar) {
                    break;
                }
                lVar = lVar2;
            }
            while (true) {
                int i3 = this.an;
                if (i2 < i3) {
                    if (this.ar[i2] == lVar) {
                        return;
                    }
                    i2++;
                } else {
                    l[] lVarArr = this.ar;
                    int length = lVarArr.length;
                    if (i3 + 1 >= length) {
                        this.ar = (l[]) Arrays.copyOf(lVarArr, length + length);
                    }
                    l[] lVarArr2 = this.ar;
                    int i4 = this.an;
                    lVarArr2[i4] = lVar;
                    this.an = i4 + 1;
                    return;
                }
            }
        } else {
            while (true) {
                k kVar4 = lVar.j;
                k kVar5 = kVar4.b;
                if (kVar5 == null) {
                    break;
                }
                l lVar3 = kVar5.a;
                k kVar6 = lVar3.l.b;
                if (kVar6 == null || kVar6 != kVar4 || lVar3 == lVar) {
                    break;
                }
                lVar = lVar3;
            }
            while (true) {
                int i5 = this.ao;
                if (i2 < i5) {
                    if (this.aq[i2] == lVar) {
                        return;
                    }
                    i2++;
                } else {
                    l[] lVarArr3 = this.aq;
                    int length2 = lVarArr3.length;
                    if (i5 + 1 >= length2) {
                        this.aq = (l[]) Arrays.copyOf(lVarArr3, length2 + length2);
                    }
                    l[] lVarArr4 = this.aq;
                    int i6 = this.ao;
                    lVarArr4[i6] = lVar;
                    this.ao = i6 + 1;
                    return;
                }
            }
        }
    }
}
