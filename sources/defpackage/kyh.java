package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: lqp  reason: default package */
/* loaded from: classes.dex */
class lqp extends AbstractCollection {
    final Map a;

    public lqp(Map map) {
        this.a = map;
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
        return lre.s(this.a.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            for (Map.Entry entry : this.a.entrySet()) {
                if (jdg.W(obj, entry.getValue())) {
                    this.a.remove(entry.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        try {
            jdg.u(collection);
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet l = lvw.l();
            for (Map.Entry entry : this.a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    l.add(entry.getKey());
                }
            }
            return this.a.keySet().removeAll(l);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        try {
            jdg.u(collection);
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet l = lvw.l();
            for (Map.Entry entry : this.a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    l.add(entry.getKey());
                }
            }
            return this.a.keySet().retainAll(l);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }
}
