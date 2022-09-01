package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* renamed from: qq  reason: default package */
/* loaded from: classes2.dex */
public final class qq implements Collection, Set {
    Object[] a;
    public int b;
    private int[] c;

    public qq() {
        this(0);
    }

    private final int f(int i) {
        try {
            return qx.a(this.c, this.b, i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private final int g(Object obj, int i) {
        int i2 = this.b;
        if (i2 == 0) {
            return -1;
        }
        int f = f(i);
        if (f < 0 || obj.equals(this.a[f])) {
            return f;
        }
        int i3 = f + 1;
        while (i3 < i2 && this.c[i3] == i) {
            if (obj.equals(this.a[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = f - 1; i4 >= 0 && this.c[i4] == i; i4--) {
            if (obj.equals(this.a[i4])) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    private final int h() {
        int i = this.b;
        if (i == 0) {
            return -1;
        }
        int f = f(0);
        if (f < 0 || this.a[f] == null) {
            return f;
        }
        int i2 = f + 1;
        while (i2 < i && this.c[i2] == 0) {
            if (this.a[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = f - 1; i3 >= 0 && this.c[i3] == 0; i3--) {
            if (this.a[i3] == null) {
                return i3;
            }
        }
        return i2 ^ (-1);
    }

    private final void i(int i) {
        this.c = new int[i];
        this.a = new Object[i];
    }

    public final int a(Object obj) {
        return obj == null ? h() : g(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int g;
        int i2 = this.b;
        if (obj == null) {
            g = h();
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            g = g(obj, hashCode);
        }
        if (g >= 0) {
            return false;
        }
        int i3 = g ^ (-1);
        int[] iArr = this.c;
        int length = iArr.length;
        if (i2 >= length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.a;
            i(i4);
            if (i2 == this.b) {
                int[] iArr2 = this.c;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                    System.arraycopy(objArr, 0, this.a, 0, objArr.length);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.c;
            int i5 = i3 + 1;
            int i6 = i2 - i3;
            System.arraycopy(iArr3, i3, iArr3, i5, i6);
            Object[] objArr2 = this.a;
            System.arraycopy(objArr2, i3, objArr2, i5, i6);
        }
        int i7 = this.b;
        if (i2 == i7) {
            int[] iArr4 = this.c;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.a[i3] = obj;
                this.b = i7 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        d(this.b + collection.size());
        boolean z = false;
        for (Object obj : collection) {
            z |= add(obj);
        }
        return z;
    }

    public final Object b(int i) {
        return this.a[i];
    }

    public final void c(qq qqVar) {
        int i = qqVar.b;
        d(this.b + i);
        if (this.b != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                add(qqVar.b(i2));
            }
        } else if (i > 0) {
            System.arraycopy(qqVar.c, 0, this.c, 0, i);
            System.arraycopy(qqVar.a, 0, this.a, 0, i);
            if (this.b == 0) {
                this.b = i;
                return;
            }
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.b != 0) {
            this.c = qx.a;
            this.a = qx.c;
            this.b = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return a(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public final void d(int i) {
        int i2 = this.b;
        int[] iArr = this.c;
        if (iArr.length < i) {
            Object[] objArr = this.a;
            i(i);
            int i3 = this.b;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.c, 0, i3);
                System.arraycopy(objArr, 0, this.a, 0, this.b);
            }
        }
        if (this.b == i2) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final void e(int i) {
        int i2 = this.b;
        Object[] objArr = this.a;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return;
        }
        int i3 = i2 - 1;
        int[] iArr = this.c;
        int length = iArr.length;
        int i4 = 8;
        if (length <= 8 || i2 >= length / 3) {
            if (i < i3) {
                int i5 = i + 1;
                int i6 = i3 - i;
                System.arraycopy(iArr, i5, iArr, i, i6);
                Object[] objArr2 = this.a;
                System.arraycopy(objArr2, i5, objArr2, i, i6);
            }
            this.a[i3] = null;
        } else {
            if (i2 > 8) {
                i4 = i2 + (i2 >> 1);
            }
            i(i4);
            if (i > 0) {
                System.arraycopy(iArr, 0, this.c, 0, i);
                System.arraycopy(objArr, 0, this.a, 0, i);
            }
            if (i < i3) {
                int i7 = i + 1;
                int i8 = i3 - i;
                System.arraycopy(iArr, i7, this.c, i, i8);
                System.arraycopy(objArr, i7, this.a, i, i8);
            }
        }
        if (i2 == this.b) {
            this.b = i3;
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.b == set.size()) {
                for (int i = 0; i < this.b; i++) {
                    try {
                        if (!set.contains(b(i))) {
                            return false;
                        }
                    } catch (ClassCastException | NullPointerException unused) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.c;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.b <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new qp(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int a = a(obj);
        if (a >= 0) {
            e(a);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        boolean z = false;
        for (Object obj : collection) {
            z |= remove(obj);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.b - 1; i >= 0; i--) {
            if (!collection.contains(this.a[i])) {
                e(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.b;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.b;
        Object[] objArr = new Object[i];
        System.arraycopy(this.a, 0, objArr, 0, i);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.b * 14);
        sb.append('{');
        for (int i = 0; i < this.b; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b = b(i);
            if (b != this) {
                sb.append(b);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public qq(int i) {
        if (i == 0) {
            this.c = qx.a;
            this.a = qx.c;
        } else {
            i(i);
        }
        this.b = 0;
    }

    public qq(Collection collection) {
        this();
        addAll(collection);
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.b) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.b);
        }
        System.arraycopy(this.a, 0, objArr, 0, this.b);
        int length = objArr.length;
        int i = this.b;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
