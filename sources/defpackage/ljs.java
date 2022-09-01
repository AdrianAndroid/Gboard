package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: ljs  reason: default package */
/* loaded from: classes.dex */
public final class ljs extends AbstractCollection {
    final Collection a;
    final lfe b;

    public ljs(Collection collection, lfe lfeVar) {
        this.a = collection;
        this.b = lfeVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        jdg.v(this.b.a(obj));
        return this.a.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        for (Object obj : collection) {
            jdg.v(this.b.a(obj));
        }
        return this.a.addAll(collection);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.util.Collection, java.lang.Iterable] */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        ?? r0 = this.a;
        lfe lfeVar = this.b;
        if (!(r0 instanceof RandomAccess) || !(r0 instanceof List)) {
            Iterator it = r0.iterator();
            jdg.u(lfeVar);
            while (it.hasNext()) {
                if (lfeVar.a(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        jdg.u(lfeVar);
        lre.aq(r0, lfeVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (jez.T(this.a, obj)) {
            return this.b.a(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return !lre.ah(this.a, this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return lre.M(this.a.iterator(), this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = this.a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.b.a(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = this.a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.b.a(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = 0;
        for (Object obj : this.a) {
            if (this.b.a(obj)) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return lre.C(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return lre.C(iterator()).toArray(objArr);
    }
}
