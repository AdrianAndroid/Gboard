package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bt  reason: default package */
/* loaded from: classes.dex */
public final class bt implements ajc, agq {
    public afq a = null;
    public bdz b = null;
    private final aqr c;

    public bt(aqr aqrVar, byte[] bArr, byte[] bArr2) {
        this.c = aqrVar;
    }

    @Override // defpackage.afv
    public final afq I() {
        b();
        return this.a;
    }

    @Override // defpackage.ajc
    public final ajb J() {
        b();
        return (ajb) this.b.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(afo afoVar) {
        this.a.c(afoVar);
    }

    @Override // defpackage.agq
    public final aqr at() {
        b();
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (this.a == null) {
            this.a = new afq(this);
            this.b = bdz.g(this);
        }
    }
}
