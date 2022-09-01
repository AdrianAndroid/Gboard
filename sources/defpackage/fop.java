package defpackage;

/* compiled from: PG */
/* renamed from: fop  reason: default package */
/* loaded from: classes.dex */
public final class fop extends fol {
    public final fps b;

    public fop(fps fpsVar, fxa fxaVar, byte[] bArr) {
        super(4, fxaVar, null);
        this.b = fpsVar;
    }

    @Override // defpackage.fok
    public final boolean a(fpg fpgVar) {
        return ((fws) fpgVar.d.get(this.b)) != null;
    }

    @Override // defpackage.fok
    public final fmv[] b(fpg fpgVar) {
        fws fwsVar = (fws) fpgVar.d.get(this.b);
        if (fwsVar == null) {
            return null;
        }
        return ((fpx) fwsVar.b).b;
    }

    @Override // defpackage.fol
    public final void c(fpg fpgVar) {
        fws fwsVar = (fws) fpgVar.d.remove(this.b);
        if (fwsVar != null) {
            Object obj = fwsVar.a;
            ((fpy) ((opu) obj).a).b.a(fpgVar.b, this.a);
            fpt fptVar = ((fpx) fwsVar.b).a;
            fptVar.b = null;
            fptVar.c = null;
            return;
        }
        this.a.f(false);
    }

    @Override // defpackage.fol, defpackage.foq
    public final /* bridge */ /* synthetic */ void g(ijk ijkVar, boolean z) {
    }
}
