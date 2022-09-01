package defpackage;

/* compiled from: PG */
/* renamed from: bex  reason: default package */
/* loaded from: classes.dex */
public final class bex implements ber, bep {
    public volatile bep a;
    public volatile bep b;
    private final ber c;
    private final Object d;
    private beq e = beq.CLEARED;
    private beq f = beq.CLEARED;
    private boolean g;

    public bex(Object obj, ber berVar) {
        this.d = obj;
        this.c = berVar;
    }

    @Override // defpackage.ber
    public final ber a() {
        ber a;
        synchronized (this.d) {
            ber berVar = this.c;
            a = berVar != null ? berVar.a() : this;
        }
        return a;
    }

    @Override // defpackage.bep
    public final void b() {
        synchronized (this.d) {
            this.g = true;
            if (this.e != beq.SUCCESS) {
                beq beqVar = this.f;
                beq beqVar2 = beq.RUNNING;
                if (beqVar != beqVar2) {
                    this.f = beqVar2;
                    this.b.b();
                }
            }
            if (this.g) {
                beq beqVar3 = this.e;
                beq beqVar4 = beq.RUNNING;
                if (beqVar3 != beqVar4) {
                    this.e = beqVar4;
                    this.a.b();
                }
            }
            this.g = false;
        }
    }

    @Override // defpackage.bep
    public final void c() {
        synchronized (this.d) {
            this.g = false;
            this.e = beq.CLEARED;
            this.f = beq.CLEARED;
            this.b.c();
            this.a.c();
        }
    }

    @Override // defpackage.ber
    public final void d(bep bepVar) {
        synchronized (this.d) {
            if (!bepVar.equals(this.a)) {
                this.f = beq.FAILED;
                return;
            }
            this.e = beq.FAILED;
            ber berVar = this.c;
            if (berVar != null) {
                berVar.d(this);
            }
        }
    }

    @Override // defpackage.ber
    public final void e(bep bepVar) {
        synchronized (this.d) {
            if (bepVar.equals(this.b)) {
                this.f = beq.SUCCESS;
                return;
            }
            this.e = beq.SUCCESS;
            ber berVar = this.c;
            if (berVar != null) {
                berVar.e(this);
            }
            if (!this.f.f) {
                this.b.c();
            }
        }
    }

    @Override // defpackage.bep
    public final void f() {
        synchronized (this.d) {
            if (!this.f.f) {
                this.f = beq.PAUSED;
                this.b.f();
            }
            if (!this.e.f) {
                this.e = beq.PAUSED;
                this.a.f();
            }
        }
    }

    @Override // defpackage.ber
    public final boolean g(bep bepVar) {
        boolean z;
        synchronized (this.d) {
            ber berVar = this.c;
            z = false;
            if ((berVar == null || berVar.g(this)) && bepVar.equals(this.a) && this.e != beq.PAUSED) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.ber
    public final boolean h(bep bepVar) {
        boolean z;
        synchronized (this.d) {
            ber berVar = this.c;
            z = false;
            if ((berVar == null || berVar.h(this)) && bepVar.equals(this.a) && !j()) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.ber
    public final boolean i(bep bepVar) {
        boolean z;
        synchronized (this.d) {
            ber berVar = this.c;
            z = false;
            if ((berVar == null || berVar.i(this)) && (bepVar.equals(this.a) || this.e != beq.SUCCESS)) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.ber, defpackage.bep
    public final boolean j() {
        boolean z;
        synchronized (this.d) {
            z = true;
            if (!this.b.j() && !this.a.j()) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.bep
    public final boolean k() {
        boolean z;
        synchronized (this.d) {
            z = this.e == beq.CLEARED;
        }
        return z;
    }

    @Override // defpackage.bep
    public final boolean l() {
        boolean z;
        synchronized (this.d) {
            z = this.e == beq.SUCCESS;
        }
        return z;
    }

    @Override // defpackage.bep
    public final boolean m(bep bepVar) {
        if (bepVar instanceof bex) {
            bex bexVar = (bex) bepVar;
            if (this.a != null ? this.a.m(bexVar.a) : bexVar.a == null) {
                if (this.b == null) {
                    if (bexVar.b == null) {
                        return true;
                    }
                } else if (this.b.m(bexVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.bep
    public final boolean n() {
        boolean z;
        synchronized (this.d) {
            z = this.e == beq.RUNNING;
        }
        return z;
    }
}
