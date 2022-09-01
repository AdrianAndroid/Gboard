package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* renamed from: nxb  reason: default package */
/* loaded from: classes2.dex */
final class nxb implements nyu {
    private final nwu a;
    private final nxg b;

    public nxb(nwu nwuVar, nxg nxgVar) {
        this.a = nwuVar;
        this.b = nxgVar;
    }

    @Override // defpackage.nyu
    public final nry a() {
        throw null;
    }

    @Override // defpackage.nyu
    public final void b(oau oauVar) {
    }

    @Override // defpackage.nyu
    public final void c(nvu nvuVar) {
        synchronized (this.a) {
            this.a.i(nvuVar);
        }
    }

    @Override // defpackage.ofh
    public final void d() {
    }

    @Override // defpackage.nyu
    public final void e() {
        try {
            synchronized (this.b) {
                nxg nxgVar = this.b;
                nxgVar.f();
                nxgVar.g();
            }
        } catch (nvv e) {
            synchronized (this.a) {
                this.a.h(e.a);
            }
        }
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

    @Override // defpackage.nyu
    public final void i(nsv nsvVar) {
        synchronized (this.b) {
            this.b.c(nsvVar);
        }
    }

    @Override // defpackage.nyu
    public final void j(nsy nsyVar) {
    }

    @Override // defpackage.nyu
    public final void k(int i) {
    }

    @Override // defpackage.nyu
    public final void l(int i) {
    }

    @Override // defpackage.nyu
    public final void m(nyw nywVar) {
        synchronized (this.a) {
            this.a.l(this.b, nywVar);
        }
        if (this.b.h()) {
            nywVar.e();
        }
        try {
            synchronized (this.b) {
                this.b.e();
                this.b.g();
            }
        } catch (nvv e) {
            synchronized (this.a) {
                this.a.h(e.a);
            }
        }
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
        return this.b.h();
    }

    public final String toString() {
        String obj = this.a.toString();
        String obj2 = this.b.toString();
        return "MultiMessageClientStream[" + obj + "/" + obj2 + "]";
    }
}
