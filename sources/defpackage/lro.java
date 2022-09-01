package defpackage;

/* compiled from: PG */
/* renamed from: lro  reason: default package */
/* loaded from: classes.dex */
final class lro extends lmz {
    private final transient llw a;
    private final transient llp b;

    public lro(llw llwVar, llp llpVar) {
        this.a = llwVar;
        this.b = llpVar;
    }

    @Override // defpackage.llg
    public final int b(Object[] objArr, int i) {
        return this.b.b(objArr, i);
    }

    @Override // defpackage.llg, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.get(obj) != null;
    }

    @Override // defpackage.lmz, defpackage.llg
    public final llp k() {
        return this.b;
    }

    @Override // defpackage.lmz, defpackage.llg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public final lsz iterator() {
        return this.b.listIterator();
    }

    @Override // defpackage.llg
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
