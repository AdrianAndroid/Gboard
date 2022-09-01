package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lsg  reason: default package */
/* loaded from: classes.dex */
public final class lsg extends lmz {
    final transient Object a;

    public lsg(Object obj) {
        jdg.u(obj);
        this.a = obj;
    }

    @Override // defpackage.llg
    public final int b(Object[] objArr, int i) {
        objArr[i] = this.a;
        return i + 1;
    }

    @Override // defpackage.llg, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.equals(obj);
    }

    @Override // defpackage.lmz, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.lmz, defpackage.llg
    public final llp k() {
        return llp.r(this.a);
    }

    @Override // defpackage.lmz, defpackage.llg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public final lsz iterator() {
        return lre.N(this.a);
    }

    @Override // defpackage.llg
    public final boolean m() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.a.toString() + ']';
    }
}
