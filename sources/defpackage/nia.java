package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: nia  reason: default package */
/* loaded from: classes2.dex */
public final class nia {
    public static final nia a = new nia(0, new int[0], new Object[0], false);
    public int b;
    public int[] c;
    public Object[] d;
    public int e;
    private boolean f;

    private nia() {
        this(0, new int[8], new Object[8], true);
    }

    public nia(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    public static nia b() {
        return new nia(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int ae;
        int i = this.e;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.b; i3++) {
                int i4 = this.c[i3];
                int a2 = nim.a(i4);
                int b = nim.b(i4);
                if (b == 0) {
                    ae = Cnew.ae(a2, ((Long) this.d[i3]).longValue());
                } else if (b == 1) {
                    ((Long) this.d[i3]).longValue();
                    ae = Cnew.az(a2);
                } else if (b == 2) {
                    ae = Cnew.H(a2, (nem) this.d[i3]);
                } else if (b == 3) {
                    int ab = Cnew.ab(a2);
                    ae = ab + ab + ((nia) this.d[i3]).a();
                } else if (b == 5) {
                    ((Integer) this.d[i3]).intValue();
                    ae = Cnew.ay(a2);
                } else {
                    throw new IllegalStateException(ngd.a());
                }
                i2 += ae;
            }
            this.e = i2;
            return i2;
        }
        return i;
    }

    public final void c() {
        this.f = false;
    }

    public final void d(int i, Object obj) {
        if (this.f) {
            int i2 = this.b;
            int[] iArr = this.c;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.c = Arrays.copyOf(iArr, i3);
                this.d = Arrays.copyOf(this.d, i3);
            }
            int[] iArr2 = this.c;
            int i4 = this.b;
            iArr2[i4] = i;
            this.d[i4] = obj;
            this.b = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void e(mlu mluVar) {
        if (this.b != 0) {
            for (int i = 0; i < this.b; i++) {
                int i2 = this.c[i];
                Object obj = this.d[i];
                int a2 = nim.a(i2);
                int b = nim.b(i2);
                if (b == 0) {
                    mluVar.o(a2, ((Long) obj).longValue());
                } else if (b == 1) {
                    mluVar.k(a2, ((Long) obj).longValue());
                } else if (b == 2) {
                    mluVar.g(a2, (nem) obj);
                } else if (b == 3) {
                    ((Cnew) mluVar.a).A(a2, 3);
                    ((nia) obj).e(mluVar);
                    ((Cnew) mluVar.a).A(a2, 4);
                } else if (b == 5) {
                    mluVar.j(a2, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(ngd.a());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof nia)) {
            return false;
        }
        nia niaVar = (nia) obj;
        int i = this.b;
        if (i == niaVar.b) {
            int[] iArr = this.c;
            int[] iArr2 = niaVar.c;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.d;
                    Object[] objArr2 = niaVar.d;
                    int i3 = this.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                } else if (iArr[i2] != iArr2[i2]) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = (i + 527) * 31;
        int[] iArr = this.c;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.d;
        int i7 = this.b;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
