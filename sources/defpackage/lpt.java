package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: lpt  reason: default package */
/* loaded from: classes.dex */
final class lpt extends AbstractCollection {
    final /* synthetic */ lqc a;

    public lpt(lqc lqcVar) {
        this.a = lqcVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new lps(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return lqc.d(this).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return lqc.d(this).toArray(objArr);
    }
}
