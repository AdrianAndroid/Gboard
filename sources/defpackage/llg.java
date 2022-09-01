package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: PG */
/* renamed from: llg  reason: default package */
/* loaded from: classes.dex */
public abstract class llg extends AbstractCollection implements Serializable {
    private static final Object[] fl = new Object[0];

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public int b(Object[] objArr, int i) {
        lsz it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    public int c() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    public int j() {
        throw new UnsupportedOperationException();
    }

    public llp k() {
        return isEmpty() ? llp.q() : llp.g(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public abstract lsz iterator();

    public abstract boolean m();

    public Object[] n() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(fl);
    }

    Object writeReplace() {
        return new lln(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        jdg.u(objArr);
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] n = n();
            if (n == null) {
                objArr = lre.b(objArr, size);
            } else {
                return Arrays.copyOfRange(n, j(), c(), objArr.getClass());
            }
        } else if (length > size) {
            objArr[size] = null;
        }
        b(objArr, 0);
        return objArr;
    }
}
