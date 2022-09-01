package defpackage;

/* compiled from: PG */
/* renamed from: qs  reason: default package */
/* loaded from: classes2.dex */
public final class qs implements Cloneable {
    public boolean a;
    public long[] b;
    public Object[] c;
    public int d;

    public qs() {
        this(10);
    }

    public final int a() {
        if (this.a) {
            i();
        }
        return this.d;
    }

    /* renamed from: c */
    public final qs clone() {
        qs qsVar = (qs) super.clone();
        qsVar.b = (long[]) this.b.clone();
        qsVar.c = (Object[]) this.c.clone();
        return qsVar;
    }

    public final Object d(long j) {
        Object obj;
        int b = qx.b(this.b, this.d, j);
        if (b < 0 || (obj = this.c[b]) == qt.a) {
            return null;
        }
        return obj;
    }

    public final Object e(long j, Object obj) {
        Object obj2;
        int b = qx.b(this.b, this.d, j);
        return (b < 0 || (obj2 = this.c[b]) == qt.a) ? obj : obj2;
    }

    public final void g(long j, Object obj) {
        int i = this.d;
        if (i == 0 || j > this.b[i - 1]) {
            if (this.a && i >= this.b.length) {
                i();
            }
            int i2 = this.d;
            long[] jArr = this.b;
            int length = jArr.length;
            if (i2 >= length) {
                int e = qx.e(i2 + 1);
                long[] jArr2 = new long[e];
                Object[] objArr = new Object[e];
                System.arraycopy(jArr, 0, jArr2, 0, length);
                Object[] objArr2 = this.c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.b = jArr2;
                this.c = objArr;
            }
            this.b[i2] = j;
            this.c[i2] = obj;
            this.d = i2 + 1;
            return;
        }
        j(j, obj);
    }

    public final void h() {
        int i = this.d;
        Object[] objArr = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.d = 0;
        this.a = false;
    }

    public final void i() {
        int i = this.d;
        long[] jArr = this.b;
        Object[] objArr = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != qt.a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.a = false;
        this.d = i2;
    }

    public final void j(long j, Object obj) {
        int b = qx.b(this.b, this.d, j);
        if (b >= 0) {
            this.c[b] = obj;
            return;
        }
        int i = b ^ (-1);
        int i2 = this.d;
        if (i < i2) {
            Object[] objArr = this.c;
            if (objArr[i] == qt.a) {
                this.b[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.a && i2 >= this.b.length) {
            i();
            i = qx.b(this.b, this.d, j) ^ (-1);
        }
        int i3 = this.d;
        long[] jArr = this.b;
        int length = jArr.length;
        if (i3 >= length) {
            int e = qx.e(i3 + 1);
            long[] jArr2 = new long[e];
            Object[] objArr2 = new Object[e];
            System.arraycopy(jArr, 0, jArr2, 0, length);
            Object[] objArr3 = this.c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.b = jArr2;
            this.c = objArr2;
        }
        int i4 = this.d - i;
        if (i4 != 0) {
            long[] jArr3 = this.b;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4);
            Object[] objArr4 = this.c;
            System.arraycopy(objArr4, i, objArr4, i5, this.d - i);
        }
        this.b[i] = j;
        this.c[i] = obj;
        this.d++;
    }

    public final String toString() {
        if (a() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(b(i2));
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

    public qs(int i) {
        if (i == 0) {
            this.b = qx.b;
            this.c = qx.c;
            return;
        }
        int e = qx.e(i);
        this.b = new long[e];
        this.c = new Object[e];
    }

    public final long b(int i) {
        if (i < 0 || i >= this.d) {
            throw new IllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
        }
        if (this.a) {
            i();
        }
        return this.b[i];
    }

    public final Object f(int i) {
        if (i < 0 || i >= this.d) {
            throw new IllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
        }
        if (this.a) {
            i();
        }
        return this.c[i];
    }
}
