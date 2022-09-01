package defpackage;

/* compiled from: PG */
/* renamed from: qw  reason: default package */
/* loaded from: classes2.dex */
public final class qw implements Cloneable {
    @Deprecated
    public static final Object a = new Object();
    public boolean b;
    public int[] c;
    public Object[] d;
    public int e;

    public qw() {
        int d = qx.d(10);
        this.c = new int[d];
        this.d = new Object[d];
    }

    public final int a(int i) {
        if (this.b) {
            g();
        }
        return this.c[i];
    }

    public final int b() {
        if (this.b) {
            g();
        }
        return this.e;
    }

    /* renamed from: c */
    public final qw clone() {
        qw qwVar = (qw) super.clone();
        qwVar.c = (int[]) this.c.clone();
        qwVar.d = (Object[]) this.d.clone();
        return qwVar;
    }

    public final Object d(int i) {
        Object obj;
        int a2 = qx.a(this.c, this.e, i);
        if (a2 < 0 || (obj = this.d[a2]) == a) {
            return null;
        }
        return obj;
    }

    public final Object e(int i) {
        if (this.b) {
            g();
        }
        return this.d[i];
    }

    public final void f(int i, Object obj) {
        int i2 = this.e;
        if (i2 == 0 || i > this.c[i2 - 1]) {
            if (this.b && i2 >= this.c.length) {
                g();
            }
            int i3 = this.e;
            int[] iArr = this.c;
            int length = iArr.length;
            if (i3 >= length) {
                int d = qx.d(i3 + 1);
                int[] iArr2 = new int[d];
                Object[] objArr = new Object[d];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                Object[] objArr2 = this.d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.c = iArr2;
                this.d = objArr;
            }
            this.c[i3] = i;
            this.d[i3] = obj;
            this.e = i3 + 1;
            return;
        }
        h(i, obj);
    }

    public final void g() {
        int i = this.e;
        int[] iArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    public final void h(int i, Object obj) {
        int a2 = qx.a(this.c, this.e, i);
        if (a2 >= 0) {
            this.d[a2] = obj;
            return;
        }
        int i2 = a2 ^ (-1);
        int i3 = this.e;
        if (i2 < i3) {
            Object[] objArr = this.d;
            if (objArr[i2] == a) {
                this.c[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.b && i3 >= this.c.length) {
            g();
            i2 = qx.a(this.c, this.e, i) ^ (-1);
        }
        int i4 = this.e;
        int[] iArr = this.c;
        int length = iArr.length;
        if (i4 >= length) {
            int d = qx.d(i4 + 1);
            int[] iArr2 = new int[d];
            Object[] objArr2 = new Object[d];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            Object[] objArr3 = this.d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.c = iArr2;
            this.d = objArr2;
        }
        int i5 = this.e - i2;
        if (i5 != 0) {
            int[] iArr3 = this.c;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5);
            Object[] objArr4 = this.d;
            System.arraycopy(objArr4, i2, objArr4, i6, this.e - i2);
        }
        this.c[i2] = i;
        this.d[i2] = obj;
        this.e++;
    }

    public final String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        int i = this.e;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(a(i2));
            sb.append('=');
            Object e = e(i2);
            if (e != this) {
                sb.append(e);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
