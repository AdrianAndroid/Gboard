package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lji  reason: default package */
/* loaded from: classes.dex */
public abstract class lji extends AbstractCollection implements lqx {
    private transient Set a;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        g();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        jdg.u(collection);
        if (collection instanceof lqx) {
            lqx lqxVar = (lqx) collection;
            if (lqxVar instanceof ljd) {
                if (!((ljd) lqxVar).isEmpty()) {
                    throw null;
                }
                return false;
            } else if (lqxVar.isEmpty()) {
                return false;
            } else {
                for (lqw lqwVar : lqxVar.f()) {
                    lqwVar.b();
                    lqwVar.a();
                    g();
                }
                return true;
            }
        } else if (collection.isEmpty()) {
            return false;
        } else {
            return lre.U(this, collection.iterator());
        }
    }

    public abstract int b();

    public abstract Iterator c();

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return a(obj) > 0;
    }

    @Override // defpackage.lqx
    public int d(Object obj, int i) {
        throw null;
    }

    @Override // defpackage.lqx
    public Set e() {
        throw null;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return lre.k(this, obj);
    }

    @Override // defpackage.lqx
    public final Set f() {
        Set set = this.a;
        if (set == null) {
            lqz lqzVar = new lqz(this);
            this.a = lqzVar;
            return lqzVar;
        }
        return set;
    }

    @Override // defpackage.lqx
    public final void g() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.lqx
    public final void h(Object obj) {
        jez.W(0, "count");
        int a = a(obj);
        int i = -a;
        if (i > 0) {
            g();
        } else if (i >= 0) {
        } else {
            d(obj, a);
        }
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return f().hashCode();
    }

    @Override // defpackage.lqx
    public final boolean i(Object obj, int i) {
        jez.W(i, "oldCount");
        jez.W(0, "newCount");
        if (a(obj) == i) {
            h(obj);
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return f().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return d(obj, 1) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection instanceof lqx) {
            collection = ((lqx) collection).e();
        }
        return e().removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        jdg.u(collection);
        if (collection instanceof lqx) {
            collection = ((lqx) collection).e();
        }
        return e().retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return f().toString();
    }
}
