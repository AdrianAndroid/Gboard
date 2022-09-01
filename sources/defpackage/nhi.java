package defpackage;

import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: nhi  reason: default package */
/* loaded from: classes2.dex */
public final class nhi extends ndx implements RandomAccess {
    public static final nhi b;
    private Object[] c;
    private int d;

    static {
        nhi nhiVar = new nhi(new Object[0], 0);
        b = nhiVar;
        nhiVar.b();
    }

    public nhi() {
        this(new Object[10], 0);
    }

    private final String d(int i) {
        int i2 = this.d;
        return "Index:" + i + ", Size:" + i2;
    }

    private final void f(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(d(i));
        }
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        ij();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(d(i));
        }
        Object[] objArr = this.c;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.c, i, objArr2, i + 1, this.d - i);
            this.c = objArr2;
        }
        this.c[i] = obj;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.nga
    public final /* bridge */ /* synthetic */ nga e(int i) {
        if (i < this.d) {
            throw new IllegalArgumentException();
        }
        return new nhi(Arrays.copyOf(this.c, i), this.d);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        f(i);
        return this.c[i];
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        ij();
        f(i);
        Object[] objArr = this.c;
        Object obj = objArr[i];
        if (i < this.d - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return obj;
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        ij();
        f(i);
        Object[] objArr = this.c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    private nhi(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ij();
        int i = this.d;
        Object[] objArr = this.c;
        if (i == objArr.length) {
            this.c = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        objArr2[i2] = obj;
        this.modCount++;
        return true;
    }
}
