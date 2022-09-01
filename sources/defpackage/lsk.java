package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: lsk  reason: default package */
/* loaded from: classes.dex */
class lsk extends lsl implements Collection {
    private static final long serialVersionUID = 0;

    public lsk(Collection collection) {
        super(collection);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Collection, java.lang.Object] */
    public Collection a() {
        return this.a;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        boolean add;
        synchronized (this.b) {
            add = a().add(obj);
        }
        return add;
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        boolean addAll;
        synchronized (this.b) {
            addAll = a().addAll(collection);
        }
        return addAll;
    }

    @Override // java.util.Collection
    public final void clear() {
        synchronized (this.b) {
            a().clear();
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        boolean contains;
        synchronized (this.b) {
            contains = a().contains(obj);
        }
        return contains;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        boolean containsAll;
        synchronized (this.b) {
            containsAll = a().containsAll(collection);
        }
        return containsAll;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.b) {
            isEmpty = a().isEmpty();
        }
        return isEmpty;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return a().iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        boolean remove;
        synchronized (this.b) {
            remove = a().remove(obj);
        }
        return remove;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        boolean removeAll;
        synchronized (this.b) {
            removeAll = a().removeAll(collection);
        }
        return removeAll;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        boolean retainAll;
        synchronized (this.b) {
            retainAll = a().retainAll(collection);
        }
        return retainAll;
    }

    @Override // java.util.Collection
    public final int size() {
        int size;
        synchronized (this.b) {
            size = a().size();
        }
        return size;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] array;
        synchronized (this.b) {
            array = a().toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.b) {
            array = a().toArray(objArr);
        }
        return array;
    }
}
