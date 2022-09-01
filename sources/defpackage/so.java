package defpackage;

/* compiled from: PG */
/* renamed from: so  reason: default package */
/* loaded from: classes2.dex */
public final class so extends st {
    public so(rz rzVar) {
        super(rzVar);
        rzVar.h.d();
        rzVar.i.d();
        this.f = ((sc) rzVar).ar;
    }

    private final void g(sl slVar) {
        this.h.j.add(slVar);
        slVar.k.add(this.h);
    }

    @Override // defpackage.st
    public final void b() {
        rz rzVar = this.d;
        sc scVar = (sc) rzVar;
        int i = scVar.b;
        int i2 = scVar.c;
        float f = scVar.a;
        if (scVar.ar == 1) {
            if (i != -1) {
                this.h.k.add(rzVar.U.h.h);
                this.d.U.h.h.j.add(this.h);
                this.h.e = i;
            } else if (i2 != -1) {
                this.h.k.add(rzVar.U.h.i);
                this.d.U.h.i.j.add(this.h);
                this.h.e = -i2;
            } else {
                sl slVar = this.h;
                slVar.b = true;
                slVar.k.add(rzVar.U.h.i);
                this.d.U.h.i.j.add(this.h);
            }
            g(this.d.h.h);
            g(this.d.h.i);
            return;
        }
        if (i != -1) {
            this.h.k.add(rzVar.U.i.h);
            this.d.U.i.h.j.add(this.h);
            this.h.e = i;
        } else if (i2 != -1) {
            this.h.k.add(rzVar.U.i.i);
            this.d.U.i.i.j.add(this.h);
            this.h.e = -i2;
        } else {
            sl slVar2 = this.h;
            slVar2.b = true;
            slVar2.k.add(rzVar.U.i.i);
            this.d.U.i.i.j.add(this.h);
        }
        g(this.d.i.h);
        g(this.d.i.i);
    }

    @Override // defpackage.st
    public final void c() {
        rz rzVar = this.d;
        if (((sc) rzVar).ar == 1) {
            rzVar.Z = this.h.f;
        } else {
            rzVar.aa = this.h.f;
        }
    }

    @Override // defpackage.st
    public final void d() {
        this.h.b();
    }

    @Override // defpackage.st
    public final boolean e() {
        return false;
    }

    @Override // defpackage.st, defpackage.sj
    public final void f() {
        sl slVar = this.h;
        if (slVar.c && !slVar.i) {
            int i = ((sl) slVar.k.get(0)).f;
            this.h.c((int) ((i * ((sc) this.d).a) + 0.5f));
        }
    }
}
