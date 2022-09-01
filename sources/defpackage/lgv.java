package defpackage;

/* compiled from: PG */
/* renamed from: lgv  reason: default package */
/* loaded from: classes.dex */
final class lgv extends ljk {
    final /* synthetic */ lgw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lgv(lgw lgwVar, lih lihVar) {
        super(lihVar);
        this.a = lgwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ljk
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        lih f = obj.f();
        if (f == this.a.a) {
            return null;
        }
        return f;
    }
}
