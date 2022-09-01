package defpackage;

/* compiled from: PG */
/* renamed from: lmm  reason: default package */
/* loaded from: classes.dex */
final class lmm extends llg {
    private static final long serialVersionUID = 0;
    private final transient lmn a;

    public lmm(lmn lmnVar) {
        this.a = lmnVar;
    }

    @Override // defpackage.llg
    public final int b(Object[] objArr, int i) {
        lsz it = this.a.map.values().iterator();
        while (it.hasNext()) {
            i = ((llg) it.next()).b(objArr, i);
        }
        return i;
    }

    @Override // defpackage.llg, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.C(obj);
    }

    @Override // defpackage.llg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public final lsz iterator() {
        return new lmg(this.a);
    }

    @Override // defpackage.llg
    public final boolean m() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size;
    }
}
