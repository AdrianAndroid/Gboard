package defpackage;

/* compiled from: PG */
/* renamed from: oia  reason: default package */
/* loaded from: classes2.dex */
final class oia extends mik {
    public final nsd a;

    public oia(nsd nsdVar) {
        this.a = nsdVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mik
    public final String b() {
        lfa S = jdg.S(this);
        S.b("clientCall", this.a);
        return S.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mik
    public final boolean c(Object obj) {
        return super.c(obj);
    }

    @Override // defpackage.mik
    protected final void l() {
        this.a.b("GrpcFuture was cancelled", null);
    }
}
