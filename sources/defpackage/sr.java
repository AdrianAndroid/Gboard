package defpackage;

/* compiled from: PG */
/* renamed from: sr  reason: default package */
/* loaded from: classes2.dex */
public final class sr extends st {
    public final sl a;
    sm b = null;

    public sr(rz rzVar) {
        super(rzVar);
        sl slVar = new sl(this);
        this.a = slVar;
        this.h.l = 6;
        this.i.l = 7;
        slVar.l = 8;
        this.f = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0411  */
    @Override // defpackage.st
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sr.b():void");
    }

    @Override // defpackage.st
    public final void c() {
        sl slVar = this.h;
        if (slVar.i) {
            this.d.aa = slVar.f;
        }
    }

    @Override // defpackage.st
    public final void d() {
        this.l = null;
        this.h.b();
        this.i.b();
        this.a.b();
        this.e.b();
        this.g = false;
    }

    @Override // defpackage.st
    public final boolean e() {
        return this.j != 3 || this.d.t == 0;
    }

    public final void g() {
        this.g = false;
        this.h.b();
        this.h.i = false;
        this.i.b();
        this.i.i = false;
        this.a.b();
        this.a.i = false;
        this.e.i = false;
    }

    public final String toString() {
        return "VerticalRun ".concat(String.valueOf(this.d.ai));
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
                m(rzVar.K, rzVar.M, 1);
                return;
            }
            sm smVar2 = this.e;
            if (smVar2.c && !smVar2.i && this.j == 3) {
                rz rzVar2 = this.d;
                int i3 = rzVar2.t;
                if (i3 == 2) {
                    rz rzVar3 = rzVar2.U;
                    if (rzVar3 != null) {
                        if (rzVar3.i.e.i) {
                            smVar2.c((int) ((smVar.f * rzVar2.A) + 0.5f));
                        }
                    }
                } else if (i3 == 3) {
                    sm smVar3 = rzVar2.h.e;
                    if (smVar3.i) {
                        int i4 = rzVar2.Y;
                        if (i4 == -1) {
                            f = smVar3.f;
                            f2 = rzVar2.X;
                        } else if (i4 != 0) {
                            f = smVar3.f;
                            f2 = rzVar2.X;
                        } else {
                            f3 = smVar3.f * rzVar2.X;
                            smVar2.c((int) (f3 + 0.5f));
                        }
                        f3 = f / f2;
                        smVar2.c((int) (f3 + 0.5f));
                    }
                }
            }
            sl slVar = this.h;
            if (!slVar.c) {
                return;
            }
            sl slVar2 = this.i;
            if (!slVar2.c) {
                return;
            }
            if (slVar.i && slVar2.i && this.e.i) {
                return;
            }
            if (!this.e.i && this.j == 3) {
                rz rzVar4 = this.d;
                if (rzVar4.s == 0 && !rzVar4.I()) {
                    int i5 = ((sl) this.h.k.get(0)).f;
                    sl slVar3 = this.h;
                    int i6 = i5 + slVar3.e;
                    int i7 = ((sl) this.i.k.get(0)).f + this.i.e;
                    slVar3.c(i6);
                    this.i.c(i7);
                    this.e.c(i7 - i6);
                    return;
                }
            }
            if (!this.e.i && this.j == 3 && this.c == 1 && this.h.k.size() > 0 && this.i.k.size() > 0) {
                int i8 = (((sl) this.i.k.get(0)).f + this.i.e) - (((sl) this.h.k.get(0)).f + this.h.e);
                sm smVar4 = this.e;
                int i9 = smVar4.m;
                if (i8 < i9) {
                    smVar4.c(i8);
                } else {
                    smVar4.c(i9);
                }
            }
            if (!this.e.i || this.h.k.size() <= 0 || this.i.k.size() <= 0) {
                return;
            }
            sl slVar4 = (sl) this.h.k.get(0);
            sl slVar5 = (sl) this.i.k.get(0);
            int i10 = slVar4.f;
            sl slVar6 = this.h;
            int i11 = slVar6.e + i10;
            int i12 = slVar5.f;
            int i13 = this.i.e + i12;
            float f4 = this.d.af;
            if (slVar4 == slVar5) {
                f4 = 0.5f;
            }
            if (slVar4 != slVar5) {
                i12 = i13;
            }
            if (slVar4 != slVar5) {
                i10 = i11;
            }
            slVar6.c((int) (i10 + 0.5f + (((i12 - i10) - this.e.f) * f4)));
            this.i.c(this.h.f + this.e.f);
            return;
        }
        throw null;
    }
}
