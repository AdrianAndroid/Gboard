package defpackage;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: PG */
/* renamed from: qv  reason: default package */
/* loaded from: classes2.dex */
public class qv {
    private int[] a;
    private Object[] b;
    public int d;

    public qv() {
        this(0);
    }

    private final int i(Object obj, int i) {
        int i2 = this.d;
        if (i2 == 0) {
            return -1;
        }
        int a = qx.a(this.a, i2, i);
        if (a < 0 || oll.g(obj, this.b[a + a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.a[i3] == i) {
            if (oll.g(obj, this.b[i3 + i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a - 1; i4 >= 0 && this.a[i4] == i; i4--) {
            if (oll.g(obj, this.b[i4 + i4])) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    private final int j() {
        int i = this.d;
        if (i == 0) {
            return -1;
        }
        int a = qx.a(this.a, i, 0);
        if (a < 0 || this.b[a + a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.a[i2] == 0) {
            if (this.b[i2 + i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = a - 1; i3 >= 0 && this.a[i3] == 0; i3--) {
            if (this.b[i3 + i3] == null) {
                return i3;
            }
        }
        return i2 ^ (-1);
    }

    public final int b(Object obj) {
        if (obj == null) {
            return j();
        }
        return i(obj, obj.hashCode());
    }

    public final Object c(int i) {
        if (i < 0 || i >= this.d) {
            throw new IllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
        }
        return this.b[i + i];
    }

    public void clear() {
        if (this.d > 0) {
            this.a = qx.a;
            this.b = qx.c;
            this.d = 0;
        }
    }

    public final boolean containsKey(Object obj) {
        return b(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public Object e(int i, Object obj) {
        if (i < 0 || i >= this.d) {
            throw new IllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
        }
        int i2 = i + i + 1;
        Object[] objArr = this.b;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof qv) {
                int i = this.d;
                qv qvVar = (qv) obj;
                if (i != qvVar.d) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    Object c = c(i2);
                    Object f = f(i2);
                    Object obj2 = qvVar.get(c);
                    if (f == null) {
                        if (obj2 != null || !qvVar.containsKey(c)) {
                            return false;
                        }
                    } else if (!oll.g(f, obj2)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this.d != ((Map) obj).size()) {
                return false;
            } else {
                int i3 = this.d;
                for (int i4 = 0; i4 < i3; i4++) {
                    Object c2 = c(i4);
                    Object f2 = f(i4);
                    Map map = (Map) obj;
                    Object obj3 = map.get(c2);
                    if (f2 == null) {
                        if (obj3 != null || !map.containsKey(c2)) {
                            return false;
                        }
                    } else if (!oll.g(f2, obj3)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        if (i < 0 || i >= this.d) {
            throw new IllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
        }
        return this.b[i + i + 1];
    }

    public final void g(int i) {
        int i2 = this.d;
        int[] iArr = this.a;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, i);
            oll.d(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.b, i + i);
            oll.d(copyOf2, "copyOf(this, newSize)");
            this.b = copyOf2;
        }
        if (this.d == i2) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final Object get(Object obj) {
        int b = b(obj);
        if (b >= 0) {
            return this.b[b + b + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int b = b(obj);
        return b >= 0 ? this.b[b + b + 1] : obj2;
    }

    public void h(qv qvVar) {
        oll.e(qvVar, "map");
        int i = qvVar.d;
        g(this.d + i);
        if (this.d != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(qvVar.c(i2), qvVar.f(i2));
            }
        } else if (i > 0) {
            nxp.B(qvVar.a, this.a, 0, 0, i);
            nxp.C(qvVar.b, this.b, 0, 0, i + i);
            this.d = i;
        }
    }

    public int hashCode() {
        int[] iArr = this.a;
        Object[] objArr = this.b;
        int i = this.d;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final boolean isEmpty() {
        return this.d <= 0;
    }

    public Object put(Object obj, Object obj2) {
        int i = this.d;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int i2 = obj != null ? i(obj, hashCode) : j();
        if (i2 >= 0) {
            int i3 = i2 + i2 + 1;
            Object[] objArr = this.b;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = i2 ^ (-1);
        int[] iArr = this.a;
        if (i >= iArr.length) {
            int i5 = 8;
            if (i >= 8) {
                i5 = (i >> 1) + i;
            } else if (i < 4) {
                i5 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i5);
            oll.d(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.b, i5 + i5);
            oll.d(copyOf2, "copyOf(this, newSize)");
            this.b = copyOf2;
            if (i != this.d) {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i) {
            int[] iArr2 = this.a;
            int i6 = i4 + 1;
            nxp.B(iArr2, iArr2, i6, i4, i);
            Object[] objArr2 = this.b;
            int i7 = this.d;
            nxp.C(objArr2, objArr2, i6 + i6, i4 + i4, i7 + i7);
        }
        int i8 = this.d;
        if (i == i8) {
            int[] iArr3 = this.a;
            if (i4 < iArr3.length) {
                iArr3[i4] = hashCode;
                Object[] objArr3 = this.b;
                int i9 = i4 + i4;
                objArr3[i9] = obj;
                objArr3[i9 + 1] = obj2;
                this.d = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final Object remove(Object obj) {
        int b = b(obj);
        if (b >= 0) {
            return d(b);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int b = b(obj);
        if (b >= 0) {
            return e(b, obj2);
        }
        return null;
    }

    public final int size() {
        return this.d;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object c = c(i2);
            if (c != sb) {
                sb.append(c);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object f = f(i2);
            if (f != sb) {
                sb.append(f);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final int a(Object obj) {
        int i = this.d;
        int i2 = i + i;
        Object[] objArr = this.b;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (oll.g(obj, objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public qv(int i) {
        this.a = i == 0 ? qx.a : new int[i];
        this.b = i == 0 ? qx.c : new Object[i + i];
    }

    public Object d(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.d)) {
            throw new IllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
        }
        Object[] objArr = this.b;
        int i3 = i + i;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
        } else {
            int i4 = i2 - 1;
            int[] iArr = this.a;
            int length = iArr.length;
            int i5 = 8;
            if (length <= 8 || i2 >= length / 3) {
                if (i < i4) {
                    int i6 = i + 1;
                    int i7 = i4 + 1;
                    nxp.B(iArr, iArr, i, i6, i7);
                    Object[] objArr2 = this.b;
                    nxp.C(objArr2, objArr2, i3, i6 + i6, i7 + i7);
                }
                Object[] objArr3 = this.b;
                int i8 = i4 + i4;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                if (i2 > 8) {
                    i5 = i2 + (i2 >> 1);
                }
                int[] copyOf = Arrays.copyOf(iArr, i5);
                oll.d(copyOf, "copyOf(this, newSize)");
                this.a = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.b, i5 + i5);
                oll.d(copyOf2, "copyOf(this, newSize)");
                this.b = copyOf2;
                if (i2 != this.d) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    nxp.B(iArr, this.a, 0, 0, i);
                    nxp.C(objArr, this.b, 0, 0, i3);
                }
                if (i < i4) {
                    int i9 = i + 1;
                    int i10 = i4 + 1;
                    nxp.B(iArr, this.a, i, i9, i10);
                    nxp.C(objArr, this.b, i3, i9 + i9, i10 + i10);
                }
            }
            if (i2 == this.d) {
                this.d = i4;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return obj;
    }

    public final boolean remove(Object obj, Object obj2) {
        int b = b(obj);
        if (b < 0 || !oll.g(obj2, f(b))) {
            return false;
        }
        d(b);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int b = b(obj);
        if (b < 0 || !oll.g(obj2, f(b))) {
            return false;
        }
        e(b, obj3);
        return true;
    }
}
