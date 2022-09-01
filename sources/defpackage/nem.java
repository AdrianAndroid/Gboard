package defpackage;

import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: nem  reason: default package */
/* loaded from: classes2.dex */
public abstract class nem implements Iterable, Serializable {
    public static final nem b = new nek(ngb.b);
    public int c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void B(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
        }
    }

    public static nel s() {
        return new nel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static nem t(Iterable iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = iterable.size();
        }
        if (size == 0) {
            return b;
        }
        return c(iterable.iterator(), size);
    }

    public static nem u(byte[] bArr) {
        return v(bArr, 0, bArr.length);
    }

    public static nem v(byte[] bArr, int i, int i2) {
        q(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new nek(bArr2);
    }

    public static nem w(String str) {
        return new nek(str.getBytes(ngb.a));
    }

    public static nem x(InputStream inputStream) {
        ArrayList arrayList = new ArrayList();
        int i = 256;
        while (true) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            nem v = i2 == 0 ? null : v(bArr, 0, i2);
            if (v != null) {
                arrayList.add(v);
                i = Math.min(i + i, 8192);
            } else {
                return t(arrayList);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static nem y(byte[] bArr) {
        return new nek(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static nem z(byte[] bArr, int i, int i2) {
        return new neh(bArr, i, i2);
    }

    public final String A() {
        return d() == 0 ? "" : m(ngb.a);
    }

    public final boolean C() {
        return d() == 0;
    }

    public final byte[] D() {
        int d = d();
        if (d == 0) {
            return ngb.b;
        }
        byte[] bArr = new byte[d];
        e(bArr, 0, 0, d);
        return bArr;
    }

    @Deprecated
    public final void E(byte[] bArr, int i, int i2) {
        q(0, i2, d());
        q(i, i + i2, bArr.length);
        if (i2 > 0) {
            e(bArr, 0, i, i2);
        }
    }

    public abstract byte a(int i);

    public abstract byte b(int i);

    public abstract int d();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void e(byte[] bArr, int i, int i2, int i3);

    public abstract boolean equals(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int f();

    public abstract boolean h();

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            int d = d();
            i = i(d, 0, d);
            if (i == 0) {
                i = 1;
            }
            this.c = i;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int i(int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int j(int i, int i2, int i3);

    public abstract nem k(int i, int i2);

    public abstract ner l();

    protected abstract String m(Charset charset);

    public abstract ByteBuffer n();

    public abstract void o(nee neeVar);

    public abstract boolean p();

    @Override // java.lang.Iterable
    /* renamed from: r */
    public nei iterator() {
        return new nef(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(d());
        objArr[2] = d() <= 50 ? ndb.D(this) : ndb.D(k(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    private static nem c(Iterator it, int i) {
        nhn nhnVar;
        if (i > 0) {
            if (i == 1) {
                return (nem) it.next();
            }
            int i2 = i >>> 1;
            nem c = c(it, i2);
            nem c2 = c(it, i - i2);
            if (Integer.MAX_VALUE - c.d() < c2.d()) {
                int d = c.d();
                int d2 = c2.d();
                throw new IllegalArgumentException("ByteString would be too long: " + d + "+" + d2);
            }
            int[] iArr = nhn.a;
            if (c2.d() == 0) {
                return c;
            }
            if (c.d() == 0) {
                return c2;
            }
            int d3 = c.d() + c2.d();
            if (d3 < 128) {
                return nhn.g(c, c2);
            }
            if (c instanceof nhn) {
                nhn nhnVar2 = (nhn) c;
                if (nhnVar2.f.d() + c2.d() < 128) {
                    nhnVar = new nhn(nhnVar2.e, nhn.g(nhnVar2.f, c2));
                    return nhnVar;
                } else if (nhnVar2.e.f() > nhnVar2.f.f() && nhnVar2.g > c2.f()) {
                    return new nhn(nhnVar2.e, new nhn(nhnVar2.f, c2));
                }
            }
            if (d3 < nhn.c(Math.max(c.f(), c2.f()) + 1)) {
                ArrayDeque arrayDeque = new ArrayDeque();
                ndb.E(c, arrayDeque);
                ndb.E(c2, arrayDeque);
                nem nemVar = (nem) arrayDeque.pop();
                while (!arrayDeque.isEmpty()) {
                    nemVar = new nhn((nem) arrayDeque.pop(), nemVar);
                }
                return nemVar;
            }
            nhnVar = new nhn(c, c2);
            return nhnVar;
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int q(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
            } else if (i2 < i) {
                throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
            } else {
                throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
            }
        }
        return i4;
    }
}
