package defpackage;

/* compiled from: PG */
/* renamed from: gvy  reason: default package */
/* loaded from: classes.dex */
public final class gvy {
    public int a;
    private int[] b;
    private final int c;
    private boolean d;

    public gvy(int i) {
        i = i <= 0 ? 1 : i;
        this.c = i;
        this.d = false;
        this.b = new int[i];
        this.a = 0;
    }

    private final void f(int i) {
        int[] iArr = this.b;
        int length = iArr.length;
        if (i > length) {
            while (length < i) {
                length += length;
            }
            this.d = false;
            int[] iArr2 = new int[length];
            this.b = iArr2;
            System.arraycopy(iArr, 0, iArr2, 0, this.a);
        }
    }

    public final int a(int i) {
        if (i < 0 || i >= this.a) {
            throw new IndexOutOfBoundsException();
        }
        return this.b[i];
    }

    public final void b(int i) {
        f(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        iArr[i2] = i;
    }

    public final void c(int[] iArr) {
        int i = this.a;
        int length = iArr.length;
        f(i + length);
        System.arraycopy(iArr, 0, this.b, this.a, length);
        this.a += length;
    }

    public final void d() {
        if (this.d) {
            this.b = new int[this.c];
            this.d = false;
        }
        this.a = 0;
    }

    public final int[] e() {
        int i = this.a;
        int[] iArr = this.b;
        if (i == iArr.length) {
            this.d = true;
            return iArr;
        } else if (i == 0) {
            return gvw.b;
        } else {
            int[] iArr2 = new int[i];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            return iArr2;
        }
    }
}
