package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: liy  reason: default package */
/* loaded from: classes.dex */
public class liy extends AbstractCollection {
    final Object a;
    Collection b;
    final liy c;
    final Collection d;
    final /* synthetic */ ljc e;

    public liy(ljc ljcVar, Object obj, Collection collection, liy liyVar) {
        this.e = ljcVar;
        this.a = obj;
        this.b = collection;
        this.c = liyVar;
        this.d = liyVar == null ? null : liyVar.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        liy liyVar = this.c;
        if (liyVar != null) {
            liyVar.a();
        } else {
            this.e.a.put(this.a, this.b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        b();
        boolean isEmpty = this.b.isEmpty();
        boolean add = this.b.add(obj);
        if (add) {
            ljc.r(this.e);
            if (!isEmpty) {
                return add;
            }
            a();
            return true;
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.b.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        ljc.t(this.e, this.b.size() - size);
        if (size != 0) {
            return addAll;
        }
        a();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        Collection collection;
        liy liyVar = this.c;
        if (liyVar != null) {
            liyVar.b();
            if (this.c.b != this.d) {
                throw new ConcurrentModificationException();
            }
        } else if (!this.b.isEmpty() || (collection = (Collection) this.e.a.get(this.a)) == null) {
        } else {
            this.b = collection;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        liy liyVar = this.c;
        if (liyVar != null) {
            liyVar.c();
        } else if (!this.b.isEmpty()) {
        } else {
            this.e.a.remove(this.a);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.b.clear();
        ljc.u(this.e, size);
        c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        b();
        return this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        b();
        return this.b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        b();
        return this.b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        b();
        return new lix(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        b();
        boolean remove = this.b.remove(obj);
        if (remove) {
            ljc.s(this.e);
            c();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.b.removeAll(collection);
        if (removeAll) {
            ljc.t(this.e, this.b.size() - size);
            c();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        jdg.u(collection);
        int size = size();
        boolean retainAll = this.b.retainAll(collection);
        if (retainAll) {
            ljc.t(this.e, this.b.size() - size);
            c();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        b();
        return this.b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        b();
        return this.b.toString();
    }
}
