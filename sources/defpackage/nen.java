package defpackage;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nen  reason: default package */
/* loaded from: classes2.dex */
public final class nen extends ner {
    private final byte[] f;
    private int g;
    private int h;
    private int i;
    private final int j;
    private int k;
    private int l = Integer.MAX_VALUE;

    public nen(byte[] bArr, int i, int i2) {
        this.f = bArr;
        this.g = i2 + i;
        this.i = i;
        this.j = i;
    }

    private final void L() {
        int i = this.g + this.h;
        this.g = i;
        int i2 = i - this.j;
        int i3 = this.l;
        if (i2 <= i3) {
            this.h = 0;
            return;
        }
        int i4 = i2 - i3;
        this.h = i4;
        this.g = i - i4;
    }

    @Override // defpackage.ner
    public final void A(int i) {
        this.l = i;
        L();
    }

    public final void B(int i) {
        if (i >= 0) {
            int i2 = this.g;
            int i3 = this.i;
            if (i <= i2 - i3) {
                this.i = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw ngd.f();
        }
        throw ngd.i();
    }

    @Override // defpackage.ner
    public final boolean C() {
        return this.i == this.g;
    }

    @Override // defpackage.ner
    public final boolean D() {
        return r() != 0;
    }

    public final byte a() {
        int i = this.i;
        if (i == this.g) {
            throw ngd.i();
        }
        byte[] bArr = this.f;
        this.i = i + 1;
        return bArr[i];
    }

    @Override // defpackage.ner
    public final double b() {
        return Double.longBitsToDouble(q());
    }

    @Override // defpackage.ner
    public final float c() {
        return Float.intBitsToFloat(i());
    }

    @Override // defpackage.ner
    public final int d() {
        return this.i - this.j;
    }

    @Override // defpackage.ner
    public final int e(int i) {
        if (i >= 0) {
            int d = i + d();
            if (d >= 0) {
                int i2 = this.l;
                if (d <= i2) {
                    this.l = d;
                    L();
                    return i2;
                }
                throw ngd.i();
            }
            throw ngd.g();
        }
        throw ngd.f();
    }

    @Override // defpackage.ner
    public final int f() {
        return j();
    }

    @Override // defpackage.ner
    public final int g() {
        return i();
    }

    @Override // defpackage.ner
    public final int h() {
        return j();
    }

    public final int i() {
        int i = this.i;
        if (this.g - i < 4) {
            throw ngd.i();
        }
        byte[] bArr = this.f;
        this.i = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // defpackage.ner
    public final int k() {
        return i();
    }

    @Override // defpackage.ner
    public final int l() {
        return F(j());
    }

    @Override // defpackage.ner
    public final int m() {
        if (C()) {
            this.k = 0;
            return 0;
        }
        int j = j();
        this.k = j;
        if (nim.a(j) == 0) {
            throw ngd.c();
        }
        return j;
    }

    @Override // defpackage.ner
    public final int n() {
        return j();
    }

    @Override // defpackage.ner
    public final long o() {
        return q();
    }

    @Override // defpackage.ner
    public final long p() {
        return r();
    }

    public final long q() {
        int i = this.i;
        if (this.g - i < 8) {
            throw ngd.i();
        }
        byte[] bArr = this.f;
        this.i = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    final long s() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte a = a();
            j |= (a & Byte.MAX_VALUE) << i;
            if ((a & 128) == 0) {
                return j;
            }
        }
        throw ngd.e();
    }

    @Override // defpackage.ner
    public final long t() {
        return q();
    }

    @Override // defpackage.ner
    public final long u() {
        return G(r());
    }

    @Override // defpackage.ner
    public final long v() {
        return r();
    }

    @Override // defpackage.ner
    public final nem w() {
        int j = j();
        if (j > 0) {
            int i = this.g;
            int i2 = this.i;
            if (j <= i - i2) {
                nem v = nem.v(this.f, i2, j);
                this.i += j;
                return v;
            }
        }
        if (j != 0) {
            if (j > 0) {
                int i3 = this.g;
                int i4 = this.i;
                if (j <= i3 - i4) {
                    int i5 = j + i4;
                    this.i = i5;
                    return nem.y(Arrays.copyOfRange(this.f, i4, i5));
                }
            }
            if (j <= 0) {
                throw ngd.f();
            }
            throw ngd.i();
        }
        return nem.b;
    }

    @Override // defpackage.ner
    public final String x() {
        int j = j();
        if (j > 0) {
            int i = this.g;
            int i2 = this.i;
            if (j <= i - i2) {
                String str = new String(this.f, i2, j, ngb.a);
                this.i += j;
                return str;
            }
        }
        if (j == 0) {
            return "";
        }
        if (j < 0) {
            throw ngd.f();
        }
        throw ngd.i();
    }

    @Override // defpackage.ner
    public final String y() {
        int j = j();
        if (j > 0) {
            int i = this.g;
            int i2 = this.i;
            if (j <= i - i2) {
                String g = nij.g(this.f, i2, j);
                this.i += j;
                return g;
            }
        }
        if (j == 0) {
            return "";
        }
        if (j <= 0) {
            throw ngd.f();
        }
        throw ngd.i();
    }

    @Override // defpackage.ner
    public final void z(int i) {
        if (this.k == i) {
            return;
        }
        throw ngd.b();
    }

    @Override // defpackage.ner
    public final boolean E(int i) {
        int m;
        int b = nim.b(i);
        int i2 = 0;
        if (b == 0) {
            if (this.g - this.i < 10) {
                while (i2 < 10) {
                    if (a() < 0) {
                        i2++;
                    }
                }
                throw ngd.e();
            }
            while (i2 < 10) {
                byte[] bArr = this.f;
                int i3 = this.i;
                this.i = i3 + 1;
                if (bArr[i3] < 0) {
                    i2++;
                }
            }
            throw ngd.e();
            return true;
        } else if (b == 1) {
            B(8);
            return true;
        } else if (b == 2) {
            B(j());
            return true;
        } else if (b != 3) {
            if (b == 4) {
                return false;
            }
            if (b == 5) {
                B(4);
                return true;
            }
            throw ngd.a();
        } else {
            do {
                m = m();
                if (m == 0) {
                    break;
                }
            } while (E(m));
            z(nim.c(nim.a(i), 4));
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
        if (r2[r3] >= 0) goto L13;
     */
    @Override // defpackage.ner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int j() {
        /*
            r5 = this;
            int r0 = r5.i
            int r1 = r5.g
            if (r1 != r0) goto L7
            goto L6c
        L7:
            byte[] r2 = r5.f
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.i = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6c
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L23
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L69
        L23:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L30
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2e:
            r1 = r3
            goto L69
        L30:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L69
        L3e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6c
        L69:
            r5.i = r1
            return r0
        L6c:
            long r0 = r5.s()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nen.j():int");
    }

    public final long r() {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2 = this.i;
        int i3 = this.g;
        if (i3 != i2) {
            byte[] bArr = this.f;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.i = i4;
                return b;
            } else if (i3 - i4 >= 9) {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 >= 0) {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        j = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            i7 = i5 + 1;
                            long j5 = (bArr[i5] << 28) ^ i9;
                            if (j5 < 0) {
                                int i10 = i7 + 1;
                                long j6 = j5 ^ (bArr[i7] << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i7 = i10 + 1;
                                    j5 = j6 ^ (bArr[i10] << 42);
                                    if (j5 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i10 = i7 + 1;
                                        j6 = j5 ^ (bArr[i7] << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i7 = i10 + 1;
                                            j = (j6 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                            if (j < 0) {
                                                i10 = i7 + 1;
                                                if (bArr[i7] >= 0) {
                                                    j2 = j;
                                                    i5 = i10;
                                                    this.i = i5;
                                                    return j2;
                                                }
                                            }
                                        }
                                    }
                                }
                                j2 = j3 ^ j6;
                                i5 = i10;
                                this.i = i5;
                                return j2;
                            }
                            j4 = 266354560;
                            j = j5 ^ j4;
                        }
                    }
                    i5 = i7;
                    j2 = j;
                    this.i = i5;
                    return j2;
                }
                i = i6 ^ (-128);
                j2 = i;
                this.i = i5;
                return j2;
            }
        }
        return s();
    }
}
