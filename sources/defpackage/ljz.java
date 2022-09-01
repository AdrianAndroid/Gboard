package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ljz  reason: default package */
/* loaded from: classes.dex */
final class ljz extends AbstractSet {
    final /* synthetic */ lkc a;

    public ljz(lkc lkcVar) {
        this.a = lkcVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        lkc lkcVar = this.a;
        Map o = lkcVar.o();
        if (o != null) {
            return o.keySet().iterator();
        }
        return new lju(lkcVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map o = this.a.o();
        if (o != null) {
            return o.keySet().remove(obj);
        }
        return this.a.i(obj) != lkc.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
