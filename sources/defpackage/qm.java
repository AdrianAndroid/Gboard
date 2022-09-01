package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qm  reason: default package */
/* loaded from: classes2.dex */
public final class qm implements Collection {
    final /* synthetic */ qo a;

    public qm(qo qoVar) {
        this.a = qoVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new qn(this.a);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        int a = this.a.a(obj);
        if (a >= 0) {
            this.a.d(a);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.a.d;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(this.a.f(i2))) {
                this.a.d(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.a.d;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(this.a.f(i2))) {
                this.a.d(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.a.d;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        int i = this.a.d;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = this.a.f(i2);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        int size = size();
        if (objArr.length < size) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        }
        for (int i = 0; i < size; i++) {
            objArr[i] = this.a.f(i);
        }
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }
}
