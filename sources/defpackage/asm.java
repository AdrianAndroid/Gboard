package defpackage;

/* compiled from: PG */
/* renamed from: asm  reason: default package */
/* loaded from: classes.dex */
final class asm extends hqi {
    final /* synthetic */ asp a;

    public asm(asp aspVar) {
        this.a = aspVar;
    }

    @Override // defpackage.hqi
    public final void a(hpy hpyVar) {
        asp aspVar = this.a;
        if (!aspVar.b) {
            aspVar.a(hpyVar);
        }
    }

    @Override // defpackage.hqi
    public final void b(hpy hpyVar) {
        asp aspVar = this.a;
        if (aspVar.b) {
            aspVar.a(hpyVar);
        }
    }
}
