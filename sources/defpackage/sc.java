package defpackage;

/* compiled from: PG */
/* renamed from: sc  reason: default package */
/* loaded from: classes2.dex */
public final class sc extends rz {
    private boolean as;
    public float a = -1.0f;
    public int b = -1;
    public int c = -1;
    public ry d = this.K;
    public int ar = 0;

    public sc() {
        this.S.clear();
        this.S.add(this.d);
        int length = this.R.length;
        for (int i = 0; i < 6; i++) {
            this.R[i] = this.d;
        }
    }

    @Override // defpackage.rz
    public final ry K(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return null;
                    }
                }
            }
            if (this.ar == 0) {
                return this.d;
            }
            return null;
        }
        if (this.ar == 1) {
            return this.d;
        }
        return null;
    }

    @Override // defpackage.rz
    public final void R(boolean z) {
        if (this.U == null) {
            return;
        }
        int o = rr.o(this.d);
        if (this.ar != 1) {
            this.Z = 0;
            this.aa = o;
            C(this.U.j());
            x(0);
            return;
        }
        this.Z = o;
        this.aa = 0;
        x(this.U.h());
        C(0);
    }

    public final void a(int i) {
        this.d.e(i);
        this.as = true;
    }

    @Override // defpackage.rz
    public final void b(rr rrVar, boolean z) {
        rz rzVar = this.U;
        if (rzVar == null) {
            return;
        }
        Object K = rzVar.K(2);
        Object K2 = rzVar.K(4);
        rz rzVar2 = this.U;
        boolean z2 = true;
        boolean z3 = rzVar2 != null && rzVar2.aq[0] == 2;
        if (this.ar == 0) {
            K = rzVar.K(3);
            K2 = rzVar.K(5);
            if (rzVar2 == null || rzVar2.aq[1] != 2) {
                z2 = false;
            }
            z3 = z2;
        }
        if (this.as) {
            ry ryVar = this.d;
            if (ryVar.c) {
                ru b = rrVar.b(ryVar);
                rrVar.f(b, this.d.a());
                if (this.b != -1) {
                    if (z3) {
                        rrVar.g(rrVar.b(K2), b, 0, 5);
                    }
                } else if (this.c != -1 && z3) {
                    ru b2 = rrVar.b(K2);
                    rrVar.g(b, rrVar.b(K), 0, 5);
                    rrVar.g(b2, b, 0, 5);
                }
                this.as = false;
                return;
            }
        }
        if (this.b != -1) {
            ru b3 = rrVar.b(this.d);
            rrVar.m(b3, rrVar.b(K), this.b, 8);
            if (!z3) {
                return;
            }
            rrVar.g(rrVar.b(K2), b3, 0, 5);
        } else if (this.c != -1) {
            ru b4 = rrVar.b(this.d);
            ru b5 = rrVar.b(K2);
            rrVar.m(b4, b5, -this.c, 8);
            if (!z3) {
                return;
            }
            rrVar.g(b4, rrVar.b(K), 0, 5);
            rrVar.g(b5, b4, 0, 5);
        } else if (this.a == -1.0f) {
        } else {
            ru b6 = rrVar.b(this.d);
            ru b7 = rrVar.b(K2);
            float f = this.a;
            rq a = rrVar.a();
            a.e.g(b6, -1.0f);
            a.e.g(b7, f);
            rrVar.e(a);
        }
    }

    public final void c(int i) {
        if (this.ar == i) {
            return;
        }
        this.ar = i;
        this.S.clear();
        if (this.ar == 1) {
            this.d = this.J;
        } else {
            this.d = this.K;
        }
        this.S.add(this.d);
        int length = this.R.length;
        for (int i2 = 0; i2 < 6; i2++) {
            this.R[i2] = this.d;
        }
    }

    @Override // defpackage.rz
    public final boolean d() {
        return true;
    }

    @Override // defpackage.rz
    public final boolean e() {
        return this.as;
    }

    @Override // defpackage.rz
    public final boolean f() {
        return this.as;
    }
}
