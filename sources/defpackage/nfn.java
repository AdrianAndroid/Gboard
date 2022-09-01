package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: nfn  reason: default package */
/* loaded from: classes2.dex */
public final class nfn extends ndx implements RandomAccess, nfs, nhg {
    public static final nfn b;
    private int[] c;
    private int d;

    static {
        nfn nfnVar = new nfn(new int[0], 0);
        b = nfnVar;
        nfnVar.b();
    }

    public nfn() {
        this(new int[10], 0);
    }

    private final String h(int i) {
        int i2 = this.d;
        return "Index:" + i + ", Size:" + i2;
    }

    private final void i(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(h(i));
        }
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        ij();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        int[] iArr = this.c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.c, i, iArr2, i + 1, this.d - i);
            this.c = iArr2;
        }
        this.c[i] = intValue;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.ndx, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ij();
        ngb.h(collection);
        if (!(collection instanceof nfn)) {
            return super.addAll(collection);
        }
        nfn nfnVar = (nfn) collection;
        int i = nfnVar.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.c;
            if (i3 > iArr.length) {
                this.c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(nfnVar.c, 0, this.c, this.d, nfnVar.d);
            this.d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.nfs
    public final int d(int i) {
        i(i);
        return this.c[i];
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfn)) {
            return super.equals(obj);
        }
        nfn nfnVar = (nfn) obj;
        if (this.d != nfnVar.d) {
            return false;
        }
        int[] iArr = nfnVar.c;
        for (int i = 0; i < this.d; i++) {
            if (this.c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.nga
    /* renamed from: f */
    public final nfs e(int i) {
        if (i < this.d) {
            throw new IllegalArgumentException();
        }
        return new nfn(Arrays.copyOf(this.c, i), this.d);
    }

    @Override // defpackage.nfs
    public final void g(int i) {
        ij();
        int i2 = this.d;
        int[] iArr = this.c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.c = iArr2;
        }
        int[] iArr3 = this.c;
        int i3 = this.d;
        this.d = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Integer.valueOf(d(i));
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + this.c[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        ij();
        i(i);
        int[] iArr = this.c;
        int i3 = iArr[i];
        if (i < this.d - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        ij();
        if (i2 >= i) {
            int[] iArr = this.c;
            System.arraycopy(iArr, i2, iArr, i, this.d - i2);
            this.d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        ij();
        i(i);
        int[] iArr = this.c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    private nfn(int[] iArr, int i) {
        this.c = iArr;
        this.d = i;
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Integer) obj).intValue());
        return true;
    }
}
