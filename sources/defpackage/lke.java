package defpackage;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lke  reason: default package */
/* loaded from: classes.dex */
public class lke extends AbstractSet implements Serializable {
    transient Object[] a;
    public transient int b;
    private transient Object c;
    private transient int[] d;
    private transient int e;

    public lke() {
        i(3);
    }

    private final int n() {
        return (1 << (this.b & 31)) - 1;
    }

    private final int o(int i, int i2, int i3, int i4) {
        Object P = jez.P(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            jez.R(P, i3 & i5, i4 + 1);
        }
        Object p = p();
        int[] r = r();
        for (int i6 = 0; i6 <= i; i6++) {
            int N = jez.N(p, i6);
            while (N != 0) {
                int i7 = N - 1;
                int i8 = r[i7];
                int J = jez.J(i8, i) | i6;
                int i9 = J & i5;
                int N2 = jez.N(P, i9);
                jez.R(P, i9, N);
                r[i7] = jez.K(J, N2, i5);
                N = i8 & i;
            }
        }
        this.c = P;
        q(i5);
        return i5;
    }

    private final Object p() {
        return Objects.requireNonNull(this.c);
    }

    private final void q(int i) {
        this.b = jez.K(this.b, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    private final int[] r() {
        return (int[]) Objects.requireNonNull(this.d);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Invalid size: " + readInt);
        }
        i(readInt);
        for (int i = 0; i < readInt; i++) {
            add(objectInputStream.readObject());
        }
    }

    private final Object[] s() {
        return (Object[]) Objects.requireNonNull(this.a);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    public int a(int i, int i2) {
        return i - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int min;
        if (m()) {
            b();
        }
        Set g = g();
        if (g != null) {
            return g.add(obj);
        }
        int[] r = r();
        Object[] s = s();
        int i = this.e;
        int i2 = i + 1;
        int H = jez.H(obj);
        int n = n();
        int i3 = H & n;
        int N = jez.N(p(), i3);
        if (N != 0) {
            int J = jez.J(H, n);
            int i4 = 0;
            while (true) {
                int i5 = N - 1;
                int i6 = r[i5];
                if (jez.J(i6, n) == J && jdg.W(obj, s[i5])) {
                    return false;
                }
                int i7 = i6 & n;
                i4++;
                if (i7 != 0) {
                    N = i7;
                } else if (i4 >= 9) {
                    return f().add(obj);
                } else {
                    if (i2 > n) {
                        n = o(n, jez.L(n), H, i);
                    } else {
                        r[i5] = jez.K(i6, i2, n);
                    }
                }
            }
        } else if (i2 > n) {
            n = o(n, jez.L(n), H, i);
        } else {
            jez.R(p(), i3, i2);
        }
        int length = r().length;
        if (i2 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            l(min);
        }
        j(i, obj, H, n);
        this.e = i2;
        h();
        return true;
    }

    public int b() {
        jdg.G(m(), "Arrays already allocated");
        int i = this.b;
        int O = jez.O(i);
        this.c = jez.P(O);
        q(O - 1);
        this.d = new int[i];
        this.a = new Object[i];
        return i;
    }

    public int c() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (m()) {
            return;
        }
        h();
        Set g = g();
        if (g != null) {
            this.b = mhq.i(size(), 3, 1073741823);
            g.clear();
            this.c = null;
            this.e = 0;
            return;
        }
        Arrays.fill(s(), 0, this.e, (Object) null);
        jez.Q(p());
        Arrays.fill(r(), 0, this.e, 0);
        this.e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (m()) {
            return false;
        }
        Set g = g();
        if (g != null) {
            return g.contains(obj);
        }
        int H = jez.H(obj);
        int n = n();
        int N = jez.N(p(), H & n);
        if (N == 0) {
            return false;
        }
        int J = jez.J(H, n);
        do {
            int i = N - 1;
            int i2 = r()[i];
            if (jez.J(i2, n) == J && jdg.W(obj, e(i))) {
                return true;
            }
            N = i2 & n;
        } while (N != 0);
        return false;
    }

    public int d(int i) {
        int i2 = i + 1;
        if (i2 < this.e) {
            return i2;
        }
        return -1;
    }

    public final Object e(int i) {
        return s()[i];
    }

    public Set f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(n() + 1, 1.0f);
        int c = c();
        while (c >= 0) {
            linkedHashSet.add(e(c));
            c = d(c);
        }
        this.c = linkedHashSet;
        this.d = null;
        this.a = null;
        h();
        return linkedHashSet;
    }

    final Set g() {
        Object obj = this.c;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    final void h() {
        this.b += 32;
    }

    public void i(int i) {
        jdg.w(true, "Expected size must be >= 0");
        this.b = mhq.i(i, 1, 1073741823);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Set g = g();
        if (g != null) {
            return g.iterator();
        }
        return new lkd(this);
    }

    public void j(int i, Object obj, int i2, int i3) {
        r()[i] = jez.K(i2, 0, i3);
        s()[i] = obj;
    }

    public void k(int i, int i2) {
        Object p = p();
        int[] r = r();
        Object[] s = s();
        int size = size() - 1;
        if (i < size) {
            Object obj = s[size];
            s[i] = obj;
            s[size] = null;
            r[i] = r[size];
            r[size] = 0;
            int H = jez.H(obj) & i2;
            int N = jez.N(p, H);
            int i3 = size + 1;
            if (N == i3) {
                jez.R(p, H, i + 1);
                return;
            }
            while (true) {
                int i4 = N - 1;
                int i5 = r[i4];
                int i6 = i5 & i2;
                if (i6 == i3) {
                    r[i4] = jez.K(i5, i + 1, i2);
                    return;
                }
                N = i6;
            }
        } else {
            s[i] = null;
            r[i] = 0;
        }
    }

    public void l(int i) {
        this.d = Arrays.copyOf(r(), i);
        this.a = Arrays.copyOf(s(), i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m() {
        return this.c == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (m()) {
            return false;
        }
        Set g = g();
        if (g != null) {
            return g.remove(obj);
        }
        int n = n();
        int M = jez.M(obj, null, n, p(), r(), s(), null);
        if (M == -1) {
            return false;
        }
        k(M, n);
        this.e--;
        h();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set g = g();
        return g != null ? g.size() : this.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (m()) {
            return new Object[0];
        }
        Set g = g();
        return g != null ? g.toArray() : Arrays.copyOf(s(), this.e);
    }

    public lke(int i) {
        i(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        if (m()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set g = g();
        if (g != null) {
            return g.toArray(objArr);
        }
        Object[] s = s();
        int i = this.e;
        jdg.E(0, i, s.length);
        int length = objArr.length;
        if (length < i) {
            objArr = lre.b(objArr, i);
        } else if (length > i) {
            objArr[i] = null;
        }
        System.arraycopy(s, 0, objArr, 0, i);
        return objArr;
    }
}
