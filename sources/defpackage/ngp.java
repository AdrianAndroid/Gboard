package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: ngp  reason: default package */
/* loaded from: classes2.dex */
public final class ngp extends ndx implements RandomAccess, nfv, nhg {
    public static final ngp b;
    private long[] c;
    private int d;

    static {
        ngp ngpVar = new ngp(new long[0], 0);
        b = ngpVar;
        ngpVar.b();
    }

    public ngp() {
        this(new long[10], 0);
    }

    private final String g(int i) {
        int i2 = this.d;
        return "Index:" + i + ", Size:" + i2;
    }

    private final void h(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(g(i));
        }
    }

    @Override // defpackage.nfv
    public final long a(int i) {
        h(i);
        return this.c[i];
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        ij();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        long[] jArr = this.c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.c, i, jArr2, i + 1, this.d - i);
            this.c = jArr2;
        }
        this.c[i] = longValue;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.ndx, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ij();
        ngb.h(collection);
        if (!(collection instanceof ngp)) {
            return super.addAll(collection);
        }
        ngp ngpVar = (ngp) collection;
        int i = ngpVar.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.c;
            if (i3 > jArr.length) {
                this.c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(ngpVar.c, 0, this.c, this.d, ngpVar.d);
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

    @Override // defpackage.nga
    /* renamed from: d */
    public final nfv e(int i) {
        if (i < this.d) {
            throw new IllegalArgumentException();
        }
        return new ngp(Arrays.copyOf(this.c, i), this.d);
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ngp)) {
            return super.equals(obj);
        }
        ngp ngpVar = (ngp) obj;
        if (this.d != ngpVar.d) {
            return false;
        }
        long[] jArr = ngpVar.c;
        for (int i = 0; i < this.d; i++) {
            if (this.c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.nfv
    public final void f(long j) {
        ij();
        int i = this.d;
        long[] jArr = this.c;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.c = jArr2;
        }
        long[] jArr3 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Long.valueOf(a(i));
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + ngb.c(this.c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        ij();
        h(i);
        long[] jArr = this.c;
        long j = jArr[i];
        if (i < this.d - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        ij();
        if (i2 >= i) {
            long[] jArr = this.c;
            System.arraycopy(jArr, i2, jArr, i, this.d - i2);
            this.d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        ij();
        h(i);
        long[] jArr = this.c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    private ngp(long[] jArr, int i) {
        this.c = jArr;
        this.d = i;
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Long) obj).longValue());
        return true;
    }
}
