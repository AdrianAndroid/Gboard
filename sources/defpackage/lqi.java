package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* compiled from: PG */
/* renamed from: lqi  reason: default package */
/* loaded from: classes.dex */
abstract class lqi extends lse {
    public abstract Map a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        a().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object o = lre.o(a(), key);
            if (!jdg.W(o, entry.getValue())) {
                return false;
            }
            return o != null || a().containsKey(key);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return a().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!contains(obj) || !(obj instanceof Map.Entry)) {
            return false;
        }
        return a().keySet().remove(((Map.Entry) obj).getKey());
    }

    @Override // defpackage.lse, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            jdg.u(collection);
            return lvw.q(this, collection);
        } catch (UnsupportedOperationException unused) {
            return lvw.r(this, collection.iterator());
        }
    }

    @Override // defpackage.lse, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        try {
            jdg.u(collection);
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet m = lvw.m(collection.size());
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    m.add(((Map.Entry) obj).getKey());
                }
            }
            return a().keySet().retainAll(m);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return a().size();
    }
}
