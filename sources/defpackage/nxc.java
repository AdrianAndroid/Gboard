package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* renamed from: nxc  reason: default package */
/* loaded from: classes2.dex */
final class nxc implements oew {
    private final nwv a;
    private final nxh b;
    private final nry c;

    public nxc(nwv nwvVar, nxh nxhVar, nry nryVar) {
        this.a = nwvVar;
        this.b = nxhVar;
        this.c = nryVar;
    }

    @Override // defpackage.oew
    public final nry a() {
        return this.c;
    }

    @Override // defpackage.oew
    public final ofg b() {
        return this.b.f;
    }

    @Override // defpackage.oew
    public final void c(nvu nvuVar) {
        synchronized (this.a) {
            this.a.i(nvuVar);
        }
    }

    @Override // defpackage.ofh
    public final void d() {
    }

    @Override // defpackage.ofh
    public final void f() {
    }

    @Override // defpackage.ofh
    public final void g(int i) {
        synchronized (this.a) {
            this.a.n(i);
        }
    }

    @Override // defpackage.ofh
    public final void h(nsj nsjVar) {
    }

    @Override // defpackage.oew
    public final void i(oex oexVar) {
        synchronized (this.a) {
            this.a.l(this.b, oexVar);
        }
    }

    @Override // defpackage.oew
    public final void j(num numVar) {
        try {
            synchronized (this.b) {
                nxh nxhVar = this.b;
                nxhVar.a = numVar;
                nxhVar.e();
                nxhVar.g();
            }
        } catch (nvv e) {
            synchronized (this.a) {
                this.a.h(e.a);
            }
        }
    }

    @Override // defpackage.oew
    public final void k() {
    }

    @Override // defpackage.oew
    public final void l() {
    }

    @Override // defpackage.oew
    public final void m() {
        String str = (String) this.c.c(nwn.g);
    }

    @Override // defpackage.ofh
    public final void n(InputStream inputStream) {
        try {
            synchronized (this.b) {
                this.b.d(inputStream);
                this.b.g();
            }
        } catch (nvv e) {
            synchronized (this.a) {
                this.a.h(e.a);
            }
        }
    }

    @Override // defpackage.ofh
    public final boolean o() {
        throw null;
    }

    public final String toString() {
        String obj = this.a.toString();
        String obj2 = this.b.toString();
        return "MultiMessageServerStream[" + obj + "/" + obj2 + "]";
    }

    @Override // defpackage.oew
    public final void e(nvu nvuVar, num numVar) {
        try {
            synchronized (this.b) {
                nxh nxhVar = this.b;
                if (nxhVar.b == null) {
                    jdg.F(nxhVar.c == null);
                    nxhVar.b = nvuVar;
                    nxhVar.c = numVar;
                    nxhVar.e();
                    nxhVar.f();
                    nxhVar.g();
                }
            }
            synchronized (this.a) {
                this.a.f(nvuVar);
            }
        } catch (nvv e) {
            synchronized (this.a) {
                this.a.h(e.a);
            }
        }
    }
}
