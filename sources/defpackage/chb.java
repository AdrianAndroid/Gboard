package defpackage;

/* compiled from: PG */
/* renamed from: chb  reason: default package */
/* loaded from: classes.dex */
final class chb implements cgz {
    final /* synthetic */ Object a;
    final /* synthetic */ chc b;

    public chb(chc chcVar, Object obj) {
        this.b = chcVar;
        this.a = obj;
    }

    @Override // defpackage.cgz
    public final boolean a(int i) {
        return this.b.I(this.a);
    }

    @Override // defpackage.cgz
    public final boolean b(int i, Object obj) {
        this.b.J(i, this.a);
        return false;
    }
}
