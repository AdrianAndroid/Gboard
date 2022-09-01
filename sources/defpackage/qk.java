package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qk  reason: default package */
/* loaded from: classes2.dex */
public final class qk implements Set {
    final /* synthetic */ qo a;

    public qk(qo qoVar) {
        this.a = qoVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        qo qoVar = this.a;
        for (Object obj : collection) {
            if (!qoVar.containsKey(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int i = 0;
        for (int i2 = this.a.d - 1; i2 >= 0; i2--) {
            Object c = this.a.c(i2);
            i += c == null ? 0 : c.hashCode();
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new qj(this.a);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int b = this.a.b(obj);
        if (b >= 0) {
            this.a.d(b);
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        qo qoVar = this.a;
        int i = qoVar.d;
        for (Object obj : collection) {
            qoVar.remove(obj);
        }
        return i != qoVar.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        qo qoVar = this.a;
        int i = qoVar.d;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(qoVar.c(i2))) {
                qoVar.d(i2);
            }
        }
        return i != qoVar.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        int i = this.a.d;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = this.a.c(i2);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        int size = size();
        if (objArr.length < size) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        }
        for (int i = 0; i < size; i++) {
            objArr[i] = this.a.c(i);
        }
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }
}
