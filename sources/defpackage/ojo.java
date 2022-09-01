package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: ojo  reason: default package */
/* loaded from: classes2.dex */
public final class ojo implements Collection {
    private final Object[] a;
    private final boolean b;

    public ojo(Object[] objArr, boolean z) {
        oll.e(objArr, "values");
        this.a = objArr;
        this.b = z;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c A[RETURN] */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean contains(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object[] r0 = r5.a
            java.lang.String r1 = "<this>"
            defpackage.oll.e(r0, r1)
            defpackage.oll.e(r0, r1)
            r1 = 0
            if (r6 != 0) goto L18
            int r6 = r0.length
            r2 = 0
        Lf:
            if (r2 >= r6) goto L2c
            r3 = r0[r2]
            if (r3 == 0) goto L28
            int r2 = r2 + 1
            goto Lf
        L18:
            int r2 = r0.length
            r3 = 0
        L1a:
            if (r3 >= r2) goto L2c
            r4 = r0[r3]
            boolean r4 = defpackage.oll.g(r6, r4)
            if (r4 != 0) goto L27
            int r3 = r3 + 1
            goto L1a
        L27:
            r2 = r3
        L28:
            if (r2 < 0) goto L2c
            r6 = 1
            return r6
        L2c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ojo.contains(java.lang.Object):boolean");
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        oll.e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return oli.a(this.a);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return this.a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.a;
        boolean z = this.b;
        oll.e(objArr, "<this>");
        if (!z || !oll.g(objArr.getClass(), Object[].class)) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
            oll.d(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
            return copyOf;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        oll.e(objArr, "array");
        return olh.b(this, objArr);
    }
}
