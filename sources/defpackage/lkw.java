package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: lkw  reason: default package */
/* loaded from: classes.dex */
public abstract class lkw extends lkz implements Collection {
    public boolean add(Object obj) {
        return b().add(obj);
    }

    public boolean addAll(Collection collection) {
        return b().addAll(collection);
    }

    protected abstract Collection b();

    @Override // java.util.Collection
    public final void clear() {
        b().clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return b().contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return b().containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return b().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return b().iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return b().remove(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return b().removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return b().retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return b().size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return b().toArray();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return b().toArray(objArr);
    }
}
