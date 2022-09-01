package defpackage;

/* compiled from: PG */
/* renamed from: lme  reason: default package */
/* loaded from: classes.dex */
final class lme extends llg {
    public final llw a;

    public lme(llw llwVar) {
        this.a = llwVar;
    }

    @Override // defpackage.llg, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return obj != null && lre.V(iterator(), obj);
    }

    @Override // defpackage.llg
    public final llp k() {
        return new lmc(this.a.entrySet().k());
    }

    @Override // defpackage.llg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public final lsz iterator() {
        return new lmb(this);
    }

    @Override // defpackage.llg
    public final boolean m() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.llg
    Object writeReplace() {
        return new lmd(this.a);
    }
}
