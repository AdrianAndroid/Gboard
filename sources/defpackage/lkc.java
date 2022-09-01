package defpackage;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lkc  reason: default package */
/* loaded from: classes.dex */
public class lkc extends AbstractMap implements Serializable {
    public static final Object a = new Object();
    transient int[] b;
    transient Object[] c;
    transient Object[] d;
    public transient int e;
    public transient int f;
    private transient Object g;
    private transient Set h;
    private transient Set i;
    private transient Collection j;

    public lkc() {
        q(3);
    }

    private final void A(int i) {
        this.e = jez.K(this.e, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    public static lkc g() {
        return new lkc();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Invalid size: " + readInt);
        }
        q(readInt);
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator l = l();
        while (l.hasNext()) {
            Map.Entry entry = (Map.Entry) l.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    private final int z(int i, int i2, int i3, int i4) {
        Object P = jez.P(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            jez.R(P, i3 & i5, i4 + 1);
        }
        Object j = j();
        int[] w = w();
        for (int i6 = 0; i6 <= i; i6++) {
            int N = jez.N(j, i6);
            while (N != 0) {
                int i7 = N - 1;
                int i8 = w[i7];
                int J = jez.J(i8, i) | i6;
                int i9 = J & i5;
                int N2 = jez.N(P, i9);
                jez.R(P, i9, N);
                w[i7] = jez.K(J, N2, i5);
                N = i8 & i;
            }
        }
        this.g = P;
        A(i5);
        return i5;
    }

    public int a(int i, int i2) {
        return i - 1;
    }

    public int b() {
        jdg.G(v(), "Arrays already allocated");
        int i = this.e;
        int O = jez.O(i);
        this.g = jez.P(O);
        A(O - 1);
        this.b = new int[i];
        this.c = new Object[i];
        this.d = new Object[i];
        return i;
    }

    public int c() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (v()) {
            return;
        }
        p();
        Map o = o();
        if (o != null) {
            this.e = mhq.i(size(), 3, 1073741823);
            o.clear();
            this.g = null;
            this.f = 0;
            return;
        }
        Arrays.fill(x(), 0, this.f, (Object) null);
        Arrays.fill(y(), 0, this.f, (Object) null);
        jez.Q(j());
        Arrays.fill(w(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map o = o();
        if (o != null) {
            return o.containsKey(obj);
        }
        return f(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map o = o();
        if (o == null) {
            for (int i = 0; i < this.f; i++) {
                if (jdg.W(obj, k(i))) {
                    return true;
                }
            }
            return false;
        }
        return o.containsValue(obj);
    }

    public int d(int i) {
        int i2 = i + 1;
        if (i2 < this.f) {
            return i2;
        }
        return -1;
    }

    public final int e() {
        return (1 << (this.e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.i;
        if (set == null) {
            ljx ljxVar = new ljx(this);
            this.i = ljxVar;
            return ljxVar;
        }
        return set;
    }

    public final int f(Object obj) {
        if (v()) {
            return -1;
        }
        int H = jez.H(obj);
        int e = e();
        int N = jez.N(j(), H & e);
        if (N == 0) {
            return -1;
        }
        int J = jez.J(H, e);
        do {
            int i = N - 1;
            int i2 = w()[i];
            if (jez.J(i2, e) == J && jdg.W(obj, h(i))) {
                return i;
            }
            N = i2 & e;
        } while (N != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map o = o();
        if (o != null) {
            return o.get(obj);
        }
        int f = f(obj);
        if (f != -1) {
            return k(f);
        }
        return null;
    }

    public final Object h(int i) {
        return x()[i];
    }

    public final Object i(Object obj) {
        if (v()) {
            return a;
        }
        int e = e();
        int M = jez.M(obj, null, e, j(), w(), x(), null);
        if (M == -1) {
            return a;
        }
        Object k = k(M);
        s(M, e);
        this.f--;
        p();
        return k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object j() {
        return Objects.requireNonNull(this.g);
    }

    public final Object k(int i) {
        return y()[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.h;
        if (set == null) {
            ljz ljzVar = new ljz(this);
            this.h = ljzVar;
            return ljzVar;
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Iterator l() {
        Map o = o();
        if (o != null) {
            return o.entrySet().iterator();
        }
        return new ljv(this);
    }

    public Map m() {
        Map n = n(e() + 1);
        int c = c();
        while (c >= 0) {
            n.put(h(c), k(c));
            c = d(c);
        }
        this.g = n;
        this.b = null;
        this.c = null;
        this.d = null;
        p();
        return n;
    }

    public Map n(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map o() {
        Object obj = this.g;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p() {
        this.e += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int z;
        int min;
        if (v()) {
            b();
        }
        Map o = o();
        if (o != null) {
            return o.put(obj, obj2);
        }
        int[] w = w();
        Object[] x = x();
        Object[] y = y();
        int i = this.f;
        int i2 = i + 1;
        int H = jez.H(obj);
        int e = e();
        int i3 = H & e;
        int N = jez.N(j(), i3);
        if (N != 0) {
            int J = jez.J(H, e);
            int i4 = 0;
            while (true) {
                int i5 = N - 1;
                int i6 = w[i5];
                if (jez.J(i6, e) == J && jdg.W(obj, x[i5])) {
                    Object obj3 = y[i5];
                    y[i5] = obj2;
                    return obj3;
                }
                int i7 = i6 & e;
                i4++;
                if (i7 != 0) {
                    N = i7;
                } else if (i4 >= 9) {
                    return m().put(obj, obj2);
                } else {
                    if (i2 > e) {
                        z = z(e, jez.L(e), H, i);
                    } else {
                        w[i5] = jez.K(i6, i2, e);
                    }
                }
            }
            z = e;
        } else if (i2 > e) {
            z = z(e, jez.L(e), H, i);
        } else {
            jez.R(j(), i3, i2);
            z = e;
        }
        int length = w().length;
        if (i2 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            t(min);
        }
        r(i, obj, obj2, H, z);
        this.f = i2;
        p();
        return null;
    }

    public void q(int i) {
        jdg.w(true, "Expected size must be >= 0");
        this.e = mhq.i(i, 1, 1073741823);
    }

    public void r(int i, Object obj, Object obj2, int i2, int i3) {
        w()[i] = jez.K(i2, 0, i3);
        x()[i] = obj;
        u(i, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map o = o();
        if (o != null) {
            return o.remove(obj);
        }
        Object i = i(obj);
        if (i != a) {
            return i;
        }
        return null;
    }

    public void s(int i, int i2) {
        Object j = j();
        int[] w = w();
        Object[] x = x();
        Object[] y = y();
        int size = size() - 1;
        if (i < size) {
            Object obj = x[size];
            x[i] = obj;
            y[i] = y[size];
            x[size] = null;
            y[size] = null;
            w[i] = w[size];
            w[size] = 0;
            int H = jez.H(obj) & i2;
            int N = jez.N(j, H);
            int i3 = size + 1;
            if (N == i3) {
                jez.R(j, H, i + 1);
                return;
            }
            while (true) {
                int i4 = N - 1;
                int i5 = w[i4];
                int i6 = i5 & i2;
                if (i6 == i3) {
                    w[i4] = jez.K(i5, i + 1, i2);
                    return;
                }
                N = i6;
            }
        } else {
            x[i] = null;
            y[i] = null;
            w[i] = 0;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map o = o();
        return o != null ? o.size() : this.f;
    }

    public void t(int i) {
        this.b = Arrays.copyOf(w(), i);
        this.c = Arrays.copyOf(x(), i);
        this.d = Arrays.copyOf(y(), i);
    }

    public final void u(int i, Object obj) {
        y()[i] = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean v() {
        return this.g == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.j;
        if (collection == null) {
            lkb lkbVar = new lkb(this);
            this.j = lkbVar;
            return lkbVar;
        }
        return collection;
    }

    public final int[] w() {
        return (int[]) Objects.requireNonNull(this.b);
    }

    public final Object[] x() {
        return (Object[]) Objects.requireNonNull(this.c);
    }

    public final Object[] y() {
        return (Object[]) Objects.requireNonNull(this.d);
    }

    public lkc(int i) {
        q(i);
    }
}
