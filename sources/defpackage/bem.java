package defpackage;

/* compiled from: PG */
/* renamed from: bem  reason: default package */
/* loaded from: classes.dex */
public final class bem implements ber, bep {
    public volatile bep a;
    public volatile bep b;
    private final Object c;
    private final ber d;
    private beq e = beq.CLEARED;
    private beq f = beq.CLEARED;

    public bem(Object obj, ber berVar) {
        this.c = obj;
        this.d = berVar;
    }

    private final boolean o(bep bepVar) {
        if (!bepVar.equals(this.a)) {
            return this.e == beq.FAILED && bepVar.equals(this.b);
        }
        return true;
    }

    @Override // defpackage.ber
    public final ber a() {
        ber a;
        synchronized (this.c) {
            ber berVar = this.d;
            a = berVar != null ? berVar.a() : this;
        }
        return a;
    }

    @Override // defpackage.bep
    public final void b() {
        synchronized (this.c) {
            if (this.e != beq.RUNNING) {
                this.e = beq.RUNNING;
                this.a.b();
            }
        }
    }

    @Override // defpackage.bep
    public final void c() {
        synchronized (this.c) {
            this.e = beq.CLEARED;
            this.a.c();
            beq beqVar = this.f;
            beq beqVar2 = beq.CLEARED;
            if (beqVar != beqVar2) {
                this.f = beqVar2;
                this.b.c();
            }
        }
    }

    @Override // defpackage.ber
    public final void d(bep bepVar) {
        synchronized (this.c) {
            if (!bepVar.equals(this.b)) {
                this.e = beq.FAILED;
                beq beqVar = this.f;
                beq beqVar2 = beq.RUNNING;
                if (beqVar != beqVar2) {
                    this.f = beqVar2;
                    this.b.b();
                }
                return;
            }
            this.f = beq.FAILED;
            ber berVar = this.d;
            if (berVar != null) {
                berVar.d(this);
            }
        }
    }

    @Override // defpackage.ber
    public final void e(bep bepVar) {
        synchronized (this.c) {
            if (bepVar.equals(this.a)) {
                this.e = beq.SUCCESS;
            } else if (bepVar.equals(this.b)) {
                this.f = beq.SUCCESS;
            }
            ber berVar = this.d;
            if (berVar != null) {
                berVar.e(this);
            }
        }
    }

    @Override // defpackage.bep
    public final void f() {
        synchronized (this.c) {
            if (this.e == beq.RUNNING) {
                this.e = beq.PAUSED;
                this.a.f();
            }
            if (this.f == beq.RUNNING) {
                this.f = beq.PAUSED;
                this.b.f();
            }
        }
    }

    @Override // defpackage.ber
    public final boolean g(bep bepVar) {
        boolean z;
        synchronized (this.c) {
            ber berVar = this.d;
            z = false;
            if ((berVar == null || berVar.g(this)) && o(bepVar)) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.ber
    public final boolean h(bep bepVar) {
        boolean z;
        synchronized (this.c) {
            ber berVar = this.d;
            z = false;
            if ((berVar == null || berVar.h(this)) && o(bepVar)) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.ber
    public final boolean i(bep bepVar) {
        boolean z;
        synchronized (this.c) {
            ber berVar = this.d;
            z = false;
            if ((berVar == null || berVar.i(this)) && o(bepVar)) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.ber, defpackage.bep
    public final boolean j() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (!this.a.j() && !this.b.j()) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.bep
    public final boolean k() {
        boolean z;
        synchronized (this.c) {
            z = false;
            if (this.e == beq.CLEARED && this.f == beq.CLEARED) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.bep
    public final boolean l() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (this.e != beq.SUCCESS && this.f != beq.SUCCESS) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.bep
    public final boolean m(bep bepVar) {
        if (bepVar instanceof bem) {
            bem bemVar = (bem) bepVar;
            if (this.a.m(bemVar.a) && this.b.m(bemVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bep
    public final boolean n() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (this.e != beq.RUNNING && this.f != beq.RUNNING) {
                z = false;
            }
        }
        return z;
    }
}
