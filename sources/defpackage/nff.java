package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: nff  reason: default package */
/* loaded from: classes2.dex */
public final class nff extends ndx implements RandomAccess, nfr, nhg {
    public static final nff b;
    private float[] c;
    private int d;

    static {
        nff nffVar = new nff(new float[0], 0);
        b = nffVar;
        nffVar.b();
    }

    public nff() {
        this(new float[10], 0);
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
        float floatValue = ((Float) obj).floatValue();
        ij();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        float[] fArr = this.c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.c, i, fArr2, i + 1, this.d - i);
            this.c = fArr2;
        }
        this.c[i] = floatValue;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.ndx, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ij();
        ngb.h(collection);
        if (!(collection instanceof nff)) {
            return super.addAll(collection);
        }
        nff nffVar = (nff) collection;
        int i = nffVar.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.c;
            if (i3 > fArr.length) {
                this.c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(nffVar.c, 0, this.c, this.d, nffVar.d);
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

    @Override // defpackage.nfr
    public final float d(int i) {
        i(i);
        return this.c[i];
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nff)) {
            return super.equals(obj);
        }
        nff nffVar = (nff) obj;
        if (this.d != nffVar.d) {
            return false;
        }
        float[] fArr = nffVar.c;
        for (int i = 0; i < this.d; i++) {
            if (Float.floatToIntBits(this.c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.nga
    /* renamed from: f */
    public final nfr e(int i) {
        if (i < this.d) {
            throw new IllegalArgumentException();
        }
        return new nff(Arrays.copyOf(this.c, i), this.d);
    }

    @Override // defpackage.nfr
    public final void g(float f) {
        ij();
        int i = this.d;
        float[] fArr = this.c;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.c = fArr2;
        }
        float[] fArr3 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Float.valueOf(d(i));
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == floatValue) {
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
        float[] fArr = this.c;
        float f = fArr[i];
        if (i < this.d - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        ij();
        if (i2 >= i) {
            float[] fArr = this.c;
            System.arraycopy(fArr, i2, fArr, i, this.d - i2);
            this.d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        ij();
        i(i);
        float[] fArr = this.c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    private nff(float[] fArr, int i) {
        this.c = fArr;
        this.d = i;
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Float) obj).floatValue());
        return true;
    }
}
