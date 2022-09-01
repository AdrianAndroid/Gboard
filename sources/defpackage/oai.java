package defpackage;

/* compiled from: PG */
/* renamed from: oai  reason: default package */
/* loaded from: classes2.dex */
class oai extends nuf {
    private final nuf a;

    public oai(nuf nufVar) {
        this.a = nufVar;
    }

    @Override // defpackage.nsb
    public final nsd a(nuq nuqVar, nsa nsaVar) {
        return this.a.a(nuqVar, nsaVar);
    }

    @Override // defpackage.nsb
    public final String b() {
        return this.a.b();
    }

    @Override // defpackage.nuf
    public final void d() {
        this.a.d();
    }

    @Override // defpackage.nuf
    public final nsl e() {
        return this.a.e();
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("delegate", this.a);
        return S.toString();
    }
}
