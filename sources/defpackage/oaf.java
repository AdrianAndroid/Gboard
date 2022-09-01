package defpackage;

import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oaf  reason: default package */
/* loaded from: classes2.dex */
public abstract class oaf implements nyu {
    @Override // defpackage.nyu
    public final nry a() {
        throw null;
    }

    @Override // defpackage.nyu
    public final void b(oau oauVar) {
        p().b(oauVar);
    }

    @Override // defpackage.nyu
    public final void c(nvu nvuVar) {
        p().c(nvuVar);
    }

    @Override // defpackage.ofh
    public final void d() {
        p().d();
    }

    @Override // defpackage.nyu
    public final void e() {
        p().e();
    }

    @Override // defpackage.ofh
    public final void f() {
        p().f();
    }

    @Override // defpackage.ofh
    public final void g(int i) {
        p().g(i);
    }

    @Override // defpackage.ofh
    public final void h(nsj nsjVar) {
        p().h(nsjVar);
    }

    @Override // defpackage.nyu
    public final void i(nsv nsvVar) {
        p().i(nsvVar);
    }

    @Override // defpackage.nyu
    public final void j(nsy nsyVar) {
        p().j(nsyVar);
    }

    @Override // defpackage.nyu
    public final void k(int i) {
        p().k(i);
    }

    @Override // defpackage.nyu
    public final void l(int i) {
        p().l(i);
    }

    @Override // defpackage.nyu
    public void m(nyw nywVar) {
        throw null;
    }

    @Override // defpackage.ofh
    public final void n(InputStream inputStream) {
        p().n(inputStream);
    }

    @Override // defpackage.ofh
    public final boolean o() {
        return p().o();
    }

    protected abstract nyu p();

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("delegate", p());
        return S.toString();
    }
}
