package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: lma  reason: default package */
/* loaded from: classes.dex */
final class lma extends lnq {
    private final llw a;

    public lma(llw llwVar) {
        this.a = llwVar;
    }

    @Override // defpackage.lnq
    public final Object a(int i) {
        return ((Map.Entry) this.a.entrySet().k().get(i)).getKey();
    }

    @Override // defpackage.llg, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.lnq, defpackage.lmz, defpackage.llg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // defpackage.lnq, defpackage.lmz, defpackage.llg
    public final lsz l() {
        return this.a.mo66if();
    }

    @Override // defpackage.llg
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.lmz, defpackage.llg
    Object writeReplace() {
        return new llz(this.a);
    }
}
