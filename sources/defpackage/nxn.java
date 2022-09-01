package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* renamed from: nxn  reason: default package */
/* loaded from: classes2.dex */
final class nxn implements oew {
    private final nwv a;
    private final nxh b;
    private final nry c;
    private num d;
    private InputStream e;

    public nxn(nwv nwvVar, nxh nxhVar, nry nryVar) {
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
        this.d = numVar;
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
        if (this.e == null) {
            this.e = inputStream;
            return;
        }
        synchronized (this.a) {
            this.a.h(nvu.k.f("too many messages"));
        }
    }

    @Override // defpackage.ofh
    public final boolean o() {
        throw null;
    }

    public final String toString() {
        String obj = this.a.toString();
        String obj2 = this.b.toString();
        return "SingleMessageServerStream[" + obj + "/" + obj2 + "]";
    }

    @Override // defpackage.oew
    public final void e(nvu nvuVar, num numVar) {
        try {
            synchronized (this.b) {
                nxh nxhVar = this.b;
                num numVar2 = this.d;
                InputStream inputStream = this.e;
                if (nxhVar.b == null) {
                    if (numVar2 != null) {
                        nxhVar.a = numVar2;
                    }
                    nxhVar.e();
                    if (inputStream != null) {
                        nxhVar.d(inputStream);
                    }
                    jdg.F(nxhVar.c == null);
                    nxhVar.b = nvuVar;
                    nxhVar.c = numVar;
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
