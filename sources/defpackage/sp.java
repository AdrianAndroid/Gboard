package defpackage;

/* compiled from: PG */
/* renamed from: sp  reason: default package */
/* loaded from: classes2.dex */
public final class sp extends st {
    public sp(rz rzVar) {
        super(rzVar);
    }

    private final void g(sl slVar) {
        this.h.j.add(slVar);
        slVar.k.add(this.h);
    }

    @Override // defpackage.st
    public final void b() {
        rz rzVar = this.d;
        if (rzVar instanceof rw) {
            sl slVar = this.h;
            slVar.b = true;
            rw rwVar = (rw) rzVar;
            int i = rwVar.a;
            boolean z = rwVar.b;
            int i2 = 0;
            if (i == 0) {
                slVar.l = 4;
                while (i2 < rwVar.as) {
                    rz rzVar2 = rwVar.ar[i2];
                    if (z || rzVar2.ah != 8) {
                        sl slVar2 = rzVar2.h.h;
                        slVar2.j.add(this.h);
                        this.h.k.add(slVar2);
                    }
                    i2++;
                }
                g(this.d.h.h);
                g(this.d.h.i);
            } else if (i == 1) {
                slVar.l = 5;
                while (i2 < rwVar.as) {
                    rz rzVar3 = rwVar.ar[i2];
                    if (z || rzVar3.ah != 8) {
                        sl slVar3 = rzVar3.h.i;
                        slVar3.j.add(this.h);
                        this.h.k.add(slVar3);
                    }
                    i2++;
                }
                g(this.d.h.h);
                g(this.d.h.i);
            } else if (i == 2) {
                slVar.l = 6;
                while (i2 < rwVar.as) {
                    rz rzVar4 = rwVar.ar[i2];
                    if (z || rzVar4.ah != 8) {
                        sl slVar4 = rzVar4.i.h;
                        slVar4.j.add(this.h);
                        this.h.k.add(slVar4);
                    }
                    i2++;
                }
                g(this.d.i.h);
                g(this.d.i.i);
            } else if (i != 3) {
            } else {
                slVar.l = 7;
                while (i2 < rwVar.as) {
                    rz rzVar5 = rwVar.ar[i2];
                    if (z || rzVar5.ah != 8) {
                        sl slVar5 = rzVar5.i.i;
                        slVar5.j.add(this.h);
                        this.h.k.add(slVar5);
                    }
                    i2++;
                }
                g(this.d.i.h);
                g(this.d.i.i);
            }
        }
    }

    @Override // defpackage.st
    public final void c() {
        rz rzVar = this.d;
        if (rzVar instanceof rw) {
            int i = ((rw) rzVar).a;
            if (i == 0 || i == 1) {
                rzVar.Z = this.h.f;
            } else {
                rzVar.aa = this.h.f;
            }
        }
    }

    @Override // defpackage.st
    public final void d() {
        this.l = null;
        this.h.b();
    }

    @Override // defpackage.st
    public final boolean e() {
        return false;
    }

    @Override // defpackage.st, defpackage.sj
    public final void f() {
        rw rwVar = (rw) this.d;
        int i = rwVar.a;
        int i2 = 0;
        int i3 = -1;
        for (sl slVar : this.h.k) {
            int i4 = slVar.f;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            this.h.c(i3 + rwVar.c);
        } else {
            this.h.c(i2 + rwVar.c);
        }
    }
}
