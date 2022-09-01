package defpackage;

/* compiled from: PG */
/* renamed from: fon  reason: default package */
/* loaded from: classes.dex */
public final class fon extends fol {
    public final fws b;

    public fon(fws fwsVar, fxa fxaVar, byte[] bArr, byte[] bArr2) {
        super(3, fxaVar, null);
        this.b = fwsVar;
    }

    @Override // defpackage.fok
    public final boolean a(fpg fpgVar) {
        return true;
    }

    @Override // defpackage.fok
    public final fmv[] b(fpg fpgVar) {
        return ((fpx) this.b.b).b;
    }

    @Override // defpackage.fol
    public final void c(fpg fpgVar) {
        ((fpx) this.b.b).b(fpgVar.b, this.a);
        fps a = ((fpx) this.b.b).a();
        if (a != null) {
            fpgVar.d.put(a, this.b);
        }
    }

    @Override // defpackage.fol, defpackage.foq
    public final /* bridge */ /* synthetic */ void g(ijk ijkVar, boolean z) {
    }
}
