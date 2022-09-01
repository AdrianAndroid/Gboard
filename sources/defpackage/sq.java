package defpackage;

/* compiled from: PG */
/* renamed from: sq  reason: default package */
/* loaded from: classes2.dex */
public final class sq extends st {
    private static final int[] a = new int[2];

    public sq(rz rzVar) {
        super(rzVar);
        this.h.l = 4;
        this.i.l = 5;
        this.f = 0;
    }

    private static final void n(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 != 0) {
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
            iArr[0] = (int) ((i7 * f) + 0.5f);
            iArr[1] = i7;
            return;
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 > i7) {
        } else {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    @Override // defpackage.st
    public final void b() {
        rz rzVar;
        rz rzVar2;
        rz rzVar3;
        rz rzVar4 = this.d;
        if (rzVar4.e) {
            this.e.c(rzVar4.j());
        }
        if (!this.e.i) {
            int M = this.d.M();
            this.j = M;
            if (M != 3) {
                if (this.j != 4 || (rzVar3 = this.d.U) == null || (rzVar3.M() != 1 && rzVar3.M() != 4)) {
                    if (this.j == 1) {
                        this.e.c(this.d.j());
                    }
                } else {
                    int j = rzVar3.j();
                    int b = this.d.J.b();
                    int b2 = this.d.L.b();
                    j(this.h, rzVar3.h.h, this.d.J.b());
                    j(this.i, rzVar3.h.i, -this.d.L.b());
                    this.e.c((j - b) - b2);
                    return;
                }
            }
        } else if (this.j == 4 && (rzVar = this.d.U) != null && (rzVar.M() == 1 || rzVar.M() == 4)) {
            j(this.h, rzVar.h.h, this.d.J.b());
            j(this.i, rzVar.h.i, -this.d.L.b());
            return;
        }
        sm smVar = this.e;
        if (smVar.i) {
            rz rzVar5 = this.d;
            if (rzVar5.e) {
                ry[] ryVarArr = rzVar5.R;
                ry ryVar = ryVarArr[0];
                ry ryVar2 = ryVar.e;
                if (ryVar2 != null && ryVarArr[1].e != null) {
                    if (rzVar5.H()) {
                        this.h.e = this.d.R[0].b();
                        this.i.e = -this.d.R[1].b();
                        return;
                    }
                    sl k = k(this.d.R[0]);
                    if (k != null) {
                        j(this.h, k, this.d.R[0].b());
                    }
                    sl k2 = k(this.d.R[1]);
                    if (k2 != null) {
                        j(this.i, k2, -this.d.R[1].b());
                    }
                    this.h.b = true;
                    this.i.b = true;
                    return;
                } else if (ryVar2 != null) {
                    sl k3 = k(ryVar);
                    if (k3 == null) {
                        return;
                    }
                    j(this.h, k3, this.d.R[0].b());
                    j(this.i, this.h, this.e.f);
                    return;
                } else {
                    ry ryVar3 = ryVarArr[1];
                    if (ryVar3.e != null) {
                        sl k4 = k(ryVar3);
                        if (k4 == null) {
                            return;
                        }
                        j(this.i, k4, -this.d.R[1].b());
                        j(this.h, this.i, -this.e.f);
                        return;
                    } else if ((rzVar5 instanceof sd) || rzVar5.U == null || rzVar5.K(7).e != null) {
                        return;
                    } else {
                        rz rzVar6 = this.d;
                        j(this.h, rzVar6.U.h.h, rzVar6.k());
                        j(this.i, this.h, this.e.f);
                        return;
                    }
                }
            }
        }
        if (this.j == 3) {
            rz rzVar7 = this.d;
            int i = rzVar7.s;
            if (i == 2) {
                rz rzVar8 = rzVar7.U;
                if (rzVar8 != null) {
                    sm smVar2 = rzVar8.i.e;
                    smVar.k.add(smVar2);
                    smVar2.j.add(this.e);
                    sm smVar3 = this.e;
                    smVar3.b = true;
                    smVar3.j.add(this.h);
                    this.e.j.add(this.i);
                }
            } else if (i == 3) {
                if (rzVar7.t == 3) {
                    this.h.a = this;
                    this.i.a = this;
                    sr srVar = rzVar7.i;
                    srVar.h.a = this;
                    srVar.i.a = this;
                    smVar.a = this;
                    if (rzVar7.I()) {
                        this.e.k.add(this.d.i.e);
                        this.d.i.e.j.add(this.e);
                        sr srVar2 = this.d.i;
                        srVar2.e.a = this;
                        this.e.k.add(srVar2.h);
                        this.e.k.add(this.d.i.i);
                        this.d.i.h.j.add(this.e);
                        this.d.i.i.j.add(this.e);
                    } else if (this.d.H()) {
                        this.d.i.e.k.add(this.e);
                        this.e.j.add(this.d.i.e);
                    } else {
                        this.d.i.e.k.add(this.e);
                    }
                } else {
                    sm smVar4 = rzVar7.i.e;
                    smVar.k.add(smVar4);
                    smVar4.j.add(this.e);
                    this.d.i.h.j.add(this.e);
                    this.d.i.i.j.add(this.e);
                    sm smVar5 = this.e;
                    smVar5.b = true;
                    smVar5.j.add(this.h);
                    this.e.j.add(this.i);
                    this.h.k.add(this.e);
                    this.i.k.add(this.e);
                }
            }
        }
        rz rzVar9 = this.d;
        ry[] ryVarArr2 = rzVar9.R;
        ry ryVar4 = ryVarArr2[0];
        ry ryVar5 = ryVar4.e;
        if (ryVar5 != null && ryVarArr2[1].e != null) {
            if (rzVar9.H()) {
                this.h.e = this.d.R[0].b();
                this.i.e = -this.d.R[1].b();
                return;
            }
            sl k5 = k(this.d.R[0]);
            sl k6 = k(this.d.R[1]);
            if (k5 != null) {
                k5.a(this);
            }
            if (k6 != null) {
                k6.a(this);
            }
            this.k = 4;
        } else if (ryVar5 != null) {
            sl k7 = k(ryVar4);
            if (k7 == null) {
                return;
            }
            j(this.h, k7, this.d.R[0].b());
            i(this.i, this.h, 1, this.e);
        } else {
            ry ryVar6 = ryVarArr2[1];
            if (ryVar6.e != null) {
                sl k8 = k(ryVar6);
                if (k8 == null) {
                    return;
                }
                j(this.i, k8, -this.d.R[1].b());
                i(this.h, this.i, -1, this.e);
            } else if ((rzVar9 instanceof sd) || (rzVar2 = rzVar9.U) == null) {
            } else {
                j(this.h, rzVar2.h.h, rzVar9.k());
                i(this.i, this.h, 1, this.e);
            }
        }
    }

    @Override // defpackage.st
    public final void c() {
        sl slVar = this.h;
        if (slVar.i) {
            this.d.Z = slVar.f;
        }
    }

    @Override // defpackage.st
    public final void d() {
        this.l = null;
        this.h.b();
        this.i.b();
        this.e.b();
        this.g = false;
    }

    @Override // defpackage.st
    public final boolean e() {
        return this.j != 3 || this.d.s == 0;
    }

    public final void g() {
        this.g = false;
        this.h.b();
        this.h.i = false;
        this.i.b();
        this.i.i = false;
        this.e.i = false;
    }

    public final String toString() {
        return "HorizontalRun ".concat(String.valueOf(this.d.ai));
    }

    @Override // defpackage.st, defpackage.sj
    public final void f() {
        sm smVar;
        float f;
        float f2;
        float f3;
        int i = this.k;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 3) {
                rz rzVar = this.d;
                m(rzVar.J, rzVar.L, 0);
                return;
            }
            sm smVar2 = this.e;
            if (!smVar2.i && this.j == 3) {
                rz rzVar2 = this.d;
                int i3 = rzVar2.s;
                if (i3 == 2) {
                    rz rzVar3 = rzVar2.U;
                    if (rzVar3 != null) {
                        if (rzVar3.h.e.i) {
                            smVar2.c((int) ((smVar.f * rzVar2.x) + 0.5f));
                        }
                    }
                } else if (i3 == 3) {
                    int i4 = rzVar2.t;
                    if (i4 == 0 || i4 == 3) {
                        sr srVar = rzVar2.i;
                        sl slVar = srVar.h;
                        sl slVar2 = srVar.i;
                        ry ryVar = rzVar2.J.e;
                        ry ryVar2 = rzVar2.K.e;
                        ry ryVar3 = rzVar2.L.e;
                        ry ryVar4 = rzVar2.M.e;
                        int i5 = rzVar2.Y;
                        if (ryVar != null && ryVar2 != null && ryVar3 != null && ryVar4 != null) {
                            float f4 = rzVar2.X;
                            if (!slVar.i || !slVar2.i) {
                                sl slVar3 = this.h;
                                if (slVar3.i) {
                                    sl slVar4 = this.i;
                                    if (slVar4.i) {
                                        if (!slVar.c || !slVar2.c) {
                                            return;
                                        }
                                        int i6 = slVar3.f;
                                        int i7 = slVar3.e;
                                        int i8 = slVar4.f;
                                        int i9 = slVar4.e;
                                        int i10 = ((sl) slVar.k.get(0)).f;
                                        int i11 = slVar.e;
                                        int i12 = ((sl) slVar2.k.get(0)).f;
                                        int i13 = slVar2.e;
                                        int[] iArr = a;
                                        n(iArr, i7 + i6, i8 - i9, i10 + i11, i12 - i13, f4, i5);
                                        this.e.c(iArr[0]);
                                        this.d.i.e.c(iArr[1]);
                                    }
                                }
                                sl slVar5 = this.h;
                                if (!slVar5.c || !this.i.c || !slVar.c || !slVar2.c) {
                                    return;
                                }
                                int i14 = ((sl) slVar5.k.get(0)).f;
                                int i15 = this.h.e;
                                int i16 = ((sl) this.i.k.get(0)).f;
                                int i17 = this.i.e;
                                int i18 = ((sl) slVar.k.get(0)).f;
                                int i19 = slVar.e;
                                int i20 = ((sl) slVar2.k.get(0)).f;
                                int i21 = slVar2.e;
                                int[] iArr2 = a;
                                n(iArr2, i14 + i15, i16 - i17, i18 + i19, i20 - i21, f4, i5);
                                this.e.c(iArr2[0]);
                                this.d.i.e.c(iArr2[1]);
                            } else {
                                sl slVar6 = this.h;
                                if (!slVar6.c || !this.i.c) {
                                    return;
                                }
                                int i22 = ((sl) slVar6.k.get(0)).f;
                                int i23 = this.h.e;
                                int i24 = ((sl) this.i.k.get(0)).f;
                                int i25 = this.i.e;
                                int i26 = slVar.f;
                                int i27 = slVar.e;
                                int i28 = slVar2.f;
                                int i29 = slVar2.e;
                                int[] iArr3 = a;
                                n(iArr3, i22 + i23, i24 - i25, i26 + i27, i28 - i29, f4, i5);
                                this.e.c(iArr3[0]);
                                this.d.i.e.c(iArr3[1]);
                                return;
                            }
                        } else if (ryVar != null && ryVar3 != null) {
                            sl slVar7 = this.h;
                            if (!slVar7.c || !this.i.c) {
                                return;
                            }
                            float f5 = rzVar2.X;
                            int i30 = ((sl) slVar7.k.get(0)).f + this.h.e;
                            int i31 = ((sl) this.i.k.get(0)).f - this.i.e;
                            if (i5 != -1 && i5 != 0) {
                                int h = h(i31 - i30, 0);
                                int i32 = (int) ((h / f5) + 0.5f);
                                int h2 = h(i32, 1);
                                if (i32 != h2) {
                                    h = (int) ((h2 * f5) + 0.5f);
                                }
                                this.e.c(h);
                                this.d.i.e.c(h2);
                            } else {
                                int h3 = h(i31 - i30, 0);
                                int i33 = (int) ((h3 * f5) + 0.5f);
                                int h4 = h(i33, 1);
                                if (i33 != h4) {
                                    h3 = (int) ((h4 / f5) + 0.5f);
                                }
                                this.e.c(h3);
                                this.d.i.e.c(h4);
                            }
                        } else if (ryVar2 != null && ryVar4 != null) {
                            if (!slVar.c || !slVar2.c) {
                                return;
                            }
                            float f6 = rzVar2.X;
                            int i34 = ((sl) slVar.k.get(0)).f + slVar.e;
                            int i35 = ((sl) slVar2.k.get(0)).f - slVar2.e;
                            if (i5 == 0) {
                                int h5 = h(i35 - i34, 1);
                                int i36 = (int) ((h5 * f6) + 0.5f);
                                int h6 = h(i36, 0);
                                if (i36 != h6) {
                                    h5 = (int) ((h6 / f6) + 0.5f);
                                }
                                this.e.c(h6);
                                this.d.i.e.c(h5);
                            } else {
                                int h7 = h(i35 - i34, 1);
                                int i37 = (int) ((h7 / f6) + 0.5f);
                                int h8 = h(i37, 0);
                                if (i37 != h8) {
                                    h7 = (int) ((h8 * f6) + 0.5f);
                                }
                                this.e.c(h8);
                                this.d.i.e.c(h7);
                            }
                        }
                    } else {
                        int i38 = rzVar2.Y;
                        if (i38 == -1) {
                            f = rzVar2.i.e.f;
                            f2 = rzVar2.X;
                        } else if (i38 != 0) {
                            f = rzVar2.i.e.f;
                            f2 = rzVar2.X;
                        } else {
                            f3 = rzVar2.i.e.f / rzVar2.X;
                            smVar2.c((int) (f3 + 0.5f));
                        }
                        f3 = f * f2;
                        smVar2.c((int) (f3 + 0.5f));
                    }
                }
            }
            sl slVar8 = this.h;
            if (!slVar8.c) {
                return;
            }
            sl slVar9 = this.i;
            if (!slVar9.c) {
                return;
            }
            if (slVar8.i && slVar9.i && this.e.i) {
                return;
            }
            if (!this.e.i && this.j == 3) {
                rz rzVar4 = this.d;
                if (rzVar4.s == 0 && !rzVar4.H()) {
                    int i39 = ((sl) this.h.k.get(0)).f;
                    sl slVar10 = this.h;
                    int i40 = i39 + slVar10.e;
                    int i41 = ((sl) this.i.k.get(0)).f + this.i.e;
                    slVar10.c(i40);
                    this.i.c(i41);
                    this.e.c(i41 - i40);
                    return;
                }
            }
            if (!this.e.i && this.j == 3 && this.c == 1 && this.h.k.size() > 0 && this.i.k.size() > 0) {
                int min = Math.min((((sl) this.i.k.get(0)).f + this.i.e) - (((sl) this.h.k.get(0)).f + this.h.e), this.e.m);
                rz rzVar5 = this.d;
                int i42 = rzVar5.w;
                int max = Math.max(rzVar5.v, min);
                if (i42 > 0) {
                    max = Math.min(i42, max);
                }
                this.e.c(max);
            }
            if (!this.e.i) {
                return;
            }
            sl slVar11 = (sl) this.h.k.get(0);
            sl slVar12 = (sl) this.i.k.get(0);
            int i43 = slVar11.f;
            sl slVar13 = this.h;
            int i44 = slVar13.e + i43;
            int i45 = slVar12.f;
            int i46 = this.i.e + i45;
            float f7 = this.d.ae;
            if (slVar11 == slVar12) {
                f7 = 0.5f;
            }
            if (slVar11 != slVar12) {
                i45 = i46;
            }
            if (slVar11 != slVar12) {
                i43 = i44;
            }
            slVar13.c((int) (i43 + 0.5f + (((i45 - i43) - this.e.f) * f7)));
            this.i.c(this.h.f + this.e.f);
            return;
        }
        throw null;
    }
}
