package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nep  reason: default package */
/* loaded from: classes2.dex */
public final class nep extends ner {
    private final InputStream f;
    private int i;
    private int k;
    private int m = Integer.MAX_VALUE;
    private final byte[] g = new byte[4096];
    private int h = 0;
    private int j = 0;
    private int l = 0;

    public nep(InputStream inputStream) {
        ngb.i(inputStream, "input");
        this.f = inputStream;
    }

    private static int L(InputStream inputStream, byte[] bArr, int i, int i2) {
        try {
            return inputStream.read(bArr, i, i2);
        } catch (ngd e) {
            e.j();
            throw e;
        }
    }

    private final List M(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.f.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw ngd.i();
                }
                this.l += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void N() {
        int i = this.h + this.i;
        this.h = i;
        int i2 = this.l + i;
        int i3 = this.m;
        if (i2 <= i3) {
            this.i = 0;
            return;
        }
        int i4 = i2 - i3;
        this.i = i4;
        this.h = i - i4;
    }

    private final void O(int i) {
        if (!P(i)) {
            if (i > (this.c - this.l) - this.j) {
                throw ngd.h();
            }
            throw ngd.i();
        }
    }

    private final boolean P(int i) {
        int i2 = this.j;
        int i3 = this.h;
        if (i2 + i <= i3) {
            throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
        }
        int i4 = this.c;
        int i5 = this.l;
        if (i > (i4 - i5) - i2 || i5 + i2 + i > this.m) {
            return false;
        }
        if (i2 > 0) {
            if (i3 > i2) {
                byte[] bArr = this.g;
                System.arraycopy(bArr, i2, bArr, 0, i3 - i2);
            }
            i5 = this.l + i2;
            this.l = i5;
            i3 = this.h - i2;
            this.h = i3;
            this.j = 0;
        }
        int L = L(this.f, this.g, i3, Math.min(4096 - i3, (this.c - i5) - i3));
        if (L == 0 || L < -1 || L > 4096) {
            throw new IllegalStateException(String.valueOf(this.f.getClass()) + "#read(byte[]) returned invalid result: " + L + "\nThe InputStream implementation is buggy.");
        } else if (L <= 0) {
            return false;
        } else {
            this.h += L;
            N();
            if (this.h < i) {
                return P(i);
            }
            return true;
        }
    }

    private final byte[] Q(int i) {
        if (i == 0) {
            return ngb.b;
        }
        if (i >= 0) {
            int i2 = this.l;
            int i3 = this.j;
            int i4 = i2 + i3 + i;
            if (i4 - this.c <= 0) {
                int i5 = this.m;
                if (i4 > i5) {
                    B((i5 - i2) - i3);
                    throw ngd.i();
                }
                int i6 = this.h - i3;
                int i7 = i - i6;
                if (i7 >= 4096) {
                    try {
                        if (i7 > this.f.available()) {
                            return null;
                        }
                    } catch (ngd e) {
                        e.j();
                        throw e;
                    }
                }
                byte[] bArr = new byte[i];
                System.arraycopy(this.g, this.j, bArr, 0, i6);
                this.l += this.h;
                this.j = 0;
                this.h = 0;
                while (i6 < i) {
                    int L = L(this.f, bArr, i6, i - i6);
                    if (L == -1) {
                        throw ngd.i();
                    }
                    this.l += L;
                    i6 += L;
                }
                return bArr;
            }
            throw ngd.h();
        }
        throw ngd.f();
    }

    private final byte[] R(int i) {
        byte[] Q = Q(i);
        if (Q != null) {
            return Q;
        }
        int i2 = this.j;
        int i3 = this.h;
        int i4 = i3 - i2;
        this.l += i3;
        this.j = 0;
        this.h = 0;
        List<byte[]> M = M(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.g, i2, bArr, 0, i4);
        for (byte[] bArr2 : M) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    @Override // defpackage.ner
    public final void A(int i) {
        this.m = i;
        N();
    }

    public final void B(int i) {
        int i2 = this.h;
        int i3 = this.j;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.j = i3 + i;
        } else if (i >= 0) {
            int i5 = this.l;
            int i6 = i5 + i3;
            int i7 = this.m;
            if (i6 + i > i7) {
                B((i7 - i5) - i3);
                throw ngd.i();
            }
            this.l = i6;
            this.h = 0;
            this.j = 0;
            while (i4 < i) {
                try {
                    long j = i - i4;
                    try {
                        long skip = this.f.skip(j);
                        if (skip < 0 || skip > j) {
                            throw new IllegalStateException(String.valueOf(this.f.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                        } else if (skip == 0) {
                            break;
                        } else {
                            i4 += (int) skip;
                        }
                    } catch (ngd e) {
                        e.j();
                        throw e;
                    }
                } finally {
                    this.l += i4;
                    N();
                }
            }
            if (i4 >= i) {
                return;
            }
            int i8 = this.h;
            int i9 = i8 - this.j;
            this.j = i8;
            O(1);
            while (true) {
                int i10 = i - i9;
                int i11 = this.h;
                if (i10 <= i11) {
                    this.j = i10;
                    return;
                }
                i9 += i11;
                this.j = i11;
                O(1);
            }
        } else {
            throw ngd.f();
        }
    }

    @Override // defpackage.ner
    public final boolean C() {
        return this.j == this.h && !P(1);
    }

    @Override // defpackage.ner
    public final boolean D() {
        return r() != 0;
    }

    public final byte a() {
        if (this.j == this.h) {
            O(1);
        }
        byte[] bArr = this.g;
        int i = this.j;
        this.j = i + 1;
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
        return this.l + this.j;
    }

    @Override // defpackage.ner
    public final int e(int i) {
        if (i >= 0) {
            int i2 = i + this.l + this.j;
            int i3 = this.m;
            if (i2 <= i3) {
                this.m = i2;
                N();
                return i3;
            }
            throw ngd.i();
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
        int i = this.j;
        if (this.h - i < 4) {
            O(4);
            i = this.j;
        }
        byte[] bArr = this.g;
        this.j = i + 4;
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
        int i = this.j;
        if (this.h - i < 8) {
            O(8);
            i = this.j;
        }
        byte[] bArr = this.g;
        this.j = i + 8;
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
        int i = this.h;
        int i2 = this.j;
        if (j <= i - i2 && j > 0) {
            nem v = nem.v(this.g, i2, j);
            this.j += j;
            return v;
        } else if (j != 0) {
            byte[] Q = Q(j);
            if (Q != null) {
                return nem.u(Q);
            }
            int i3 = this.j;
            int i4 = this.h;
            int i5 = i4 - i3;
            this.l += i4;
            this.j = 0;
            this.h = 0;
            List<byte[]> M = M(j - i5);
            byte[] bArr = new byte[j];
            System.arraycopy(this.g, i3, bArr, 0, i5);
            for (byte[] bArr2 : M) {
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i5, length);
                i5 += length;
            }
            return nem.y(bArr);
        } else {
            return nem.b;
        }
    }

    @Override // defpackage.ner
    public final String x() {
        int j = j();
        if (j > 0) {
            int i = this.h;
            int i2 = this.j;
            if (j <= i - i2) {
                String str = new String(this.g, i2, j, ngb.a);
                this.j += j;
                return str;
            }
        }
        if (j == 0) {
            return "";
        }
        if (j <= this.h) {
            O(j);
            String str2 = new String(this.g, this.j, j, ngb.a);
            this.j += j;
            return str2;
        }
        return new String(R(j), ngb.a);
    }

    @Override // defpackage.ner
    public final String y() {
        byte[] R;
        int j = j();
        int i = this.j;
        int i2 = this.h;
        if (j <= i2 - i && j > 0) {
            R = this.g;
            this.j = i + j;
        } else if (j == 0) {
            return "";
        } else {
            i = 0;
            if (j <= i2) {
                O(j);
                R = this.g;
                this.j = j;
            } else {
                R = R(j);
            }
        }
        return nij.g(R, i, j);
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
            if (this.h - this.j < 10) {
                while (i2 < 10) {
                    if (a() < 0) {
                        i2++;
                    }
                }
                throw ngd.e();
            }
            while (i2 < 10) {
                byte[] bArr = this.g;
                int i3 = this.j;
                this.j = i3 + 1;
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
            int r0 = r5.j
            int r1 = r5.h
            if (r1 != r0) goto L7
            goto L6c
        L7:
            byte[] r2 = r5.g
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.j = r3
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
            r5.j = r1
            return r0
        L6c:
            long r0 = r5.s()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nep.j():int");
    }

    public final long r() {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2 = this.j;
        int i3 = this.h;
        if (i3 != i2) {
            byte[] bArr = this.g;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.j = i4;
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
                                                    this.j = i5;
                                                    return j2;
                                                }
                                            }
                                        }
                                    }
                                }
                                j2 = j3 ^ j6;
                                i5 = i10;
                                this.j = i5;
                                return j2;
                            }
                            j4 = 266354560;
                            j = j5 ^ j4;
                        }
                    }
                    i5 = i7;
                    j2 = j;
                    this.j = i5;
                    return j2;
                }
                i = i6 ^ (-128);
                j2 = i;
                this.j = i5;
                return j2;
            }
        }
        return s();
    }
}
