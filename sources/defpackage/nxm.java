package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* renamed from: nxm  reason: default package */
/* loaded from: classes2.dex */
final class nxm implements nyu {
    private final nwu a;
    private final nxg b;
    private InputStream c;
    private nsv d;

    public nxm(nwu nwuVar, nxg nxgVar) {
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
                nsv nsvVar = this.d;
                if (nsvVar != null) {
                    this.b.c(nsvVar);
                }
                this.b.e();
                nxg nxgVar = this.b;
                InputStream inputStream = this.c;
                if (inputStream != null) {
                    nxgVar.d(inputStream);
                }
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
        this.d = nsvVar;
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
    }

    @Override // defpackage.ofh
    public final void n(InputStream inputStream) {
        if (this.c == null) {
            this.c = inputStream;
            return;
        }
        synchronized (this.a) {
            this.a.h(nvu.k.f("too many messages"));
        }
    }

    @Override // defpackage.ofh
    public final boolean o() {
        return this.b.h();
    }

    public final String toString() {
        String obj = this.a.toString();
        String obj2 = this.b.toString();
        return "SingleMessageClientStream[" + obj + "/" + obj2 + "]";
    }
}
