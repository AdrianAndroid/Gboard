package j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.k1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC0041k1 extends AbstractC0021e implements Iterable {
    Object d = newArray(16);
    Object[] e;

    public Object b() {
        long count = count();
        if (count < 2147483639) {
            Object newArray = newArray((int) count);
            f(0, newArray);
            return newArray;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // j$.util.stream.AbstractC0021e
    public final void clear() {
        Object[] objArr = this.e;
        if (objArr != null) {
            this.d = objArr[0];
            this.e = null;
            this.c = null;
        }
        this.a = 0;
        this.b = 0;
    }

    public void f(int i, Object obj) {
        long j = i;
        long count = count() + j;
        if (count > o(obj) || count < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.b == 0) {
            System.arraycopy(this.d, 0, obj, i, this.a);
            return;
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            Object obj2 = this.e[i2];
            System.arraycopy(obj2, 0, obj, i, o(obj2));
            i += o(this.e[i2]);
        }
        int i3 = this.a;
        if (i3 <= 0) {
            return;
        }
        System.arraycopy(this.d, 0, obj, i, i3);
    }

    public void g(Object obj) {
        for (int i = 0; i < this.b; i++) {
            Object obj2 = this.e[i];
            n(obj2, 0, o(obj2), obj);
        }
        n(this.d, 0, this.a, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void n(Object obj, int i, int i2, Object obj2);

    public abstract Object newArray(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int o(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void p(long j) {
        long o;
        int i;
        int i2;
        int i3 = this.b;
        if (i3 == 0) {
            o = o(this.d);
        } else {
            o = o(this.e[i3]) + this.c[i3];
        }
        if (j > o) {
            if (this.e == null) {
                Object[] q = q();
                this.e = q;
                this.c = new long[8];
                q[0] = this.d;
            }
            int i4 = this.b;
            while (true) {
                i4++;
                if (j > o) {
                    Object[] objArr = this.e;
                    if (i4 >= objArr.length) {
                        int length = objArr.length * 2;
                        this.e = Arrays.copyOf(objArr, length);
                        this.c = Arrays.copyOf(this.c, length);
                    }
                    if (i4 != 0 && i4 != 1) {
                        i = Math.min((i4 + 4) - 1, 30);
                    } else {
                        i = 4;
                    }
                    int i5 = 1 << i;
                    this.e[i4] = newArray(i5);
                    long[] jArr = this.c;
                    jArr[i4] = jArr[i4 - 1] + o(this.e[i2]);
                    o += i5;
                } else {
                    return;
                }
            }
        }
    }

    protected abstract Object[] q();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r() {
        long o;
        if (this.a == o(this.d)) {
            if (this.e == null) {
                Object[] q = q();
                this.e = q;
                this.c = new long[8];
                q[0] = this.d;
            }
            int i = this.b;
            int i2 = i + 1;
            Object[] objArr = this.e;
            if (i2 >= objArr.length || objArr[i2] == null) {
                if (i == 0) {
                    o = o(this.d);
                } else {
                    o = o(objArr[i]) + this.c[i];
                }
                p(o + 1);
            }
            this.a = 0;
            int i3 = this.b + 1;
            this.b = i3;
            this.d = this.e[i3];
        }
    }
}
