package defpackage;

/* compiled from: PG */
/* renamed from: lnp  reason: default package */
/* loaded from: classes.dex */
final class lnp extends llp {
    final /* synthetic */ lnq a;

    public lnp(lnq lnqVar) {
        this.a = lnqVar;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.a.a(i);
    }

    @Override // defpackage.llg
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
