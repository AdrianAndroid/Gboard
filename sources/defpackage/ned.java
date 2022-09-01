package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: ned  reason: default package */
/* loaded from: classes2.dex */
public final class ned extends ndx implements RandomAccess, nfo, nhg {
    public static final ned b;
    private boolean[] c;
    private int d;

    static {
        ned nedVar = new ned(new boolean[0], 0);
        b = nedVar;
        nedVar.b();
    }

    public ned() {
        this(new boolean[10], 0);
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

    @Override // defpackage.ndx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ij();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        boolean[] zArr = this.c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.c, i, zArr2, i + 1, this.d - i);
            this.c = zArr2;
        }
        this.c[i] = booleanValue;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.ndx, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ij();
        ngb.h(collection);
        if (!(collection instanceof ned)) {
            return super.addAll(collection);
        }
        ned nedVar = (ned) collection;
        int i = nedVar.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.c;
            if (i3 > zArr.length) {
                this.c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(nedVar.c, 0, this.c, this.d, nedVar.d);
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
    public final nfo e(int i) {
        if (i < this.d) {
            throw new IllegalArgumentException();
        }
        return new ned(Arrays.copyOf(this.c, i), this.d);
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ned)) {
            return super.equals(obj);
        }
        ned nedVar = (ned) obj;
        if (this.d != nedVar.d) {
            return false;
        }
        boolean[] zArr = nedVar.c;
        for (int i = 0; i < this.d; i++) {
            if (this.c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.nfo
    public final void f(boolean z) {
        ij();
        int i = this.d;
        boolean[] zArr = this.c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.c = zArr2;
        }
        boolean[] zArr3 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        h(i);
        return Boolean.valueOf(this.c[i]);
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + ngb.a(this.c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == booleanValue) {
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
        boolean[] zArr = this.c;
        boolean z = zArr[i];
        if (i < this.d - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        ij();
        if (i2 >= i) {
            boolean[] zArr = this.c;
            System.arraycopy(zArr, i2, zArr, i, this.d - i2);
            this.d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ij();
        h(i);
        boolean[] zArr = this.c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    private ned(boolean[] zArr, int i) {
        this.c = zArr;
        this.d = i;
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Boolean) obj).booleanValue());
        return true;
    }
}
