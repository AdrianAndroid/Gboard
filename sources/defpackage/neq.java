package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: neq  reason: default package */
/* loaded from: classes2.dex */
public final class neq extends ner {
    private final ByteBuffer f;
    private final long g;
    private long h;
    private long i;
    private final long j;
    private int k;
    private int l;
    private int m = Integer.MAX_VALUE;

    public neq(ByteBuffer byteBuffer) {
        this.f = byteBuffer;
        long e = nih.e(byteBuffer);
        this.g = e;
        this.h = byteBuffer.limit() + e;
        long position = e + byteBuffer.position();
        this.i = position;
        this.j = position;
    }

    private final int L() {
        return (int) (this.h - this.i);
    }

    private final void M() {
        long j = this.h + this.k;
        this.h = j;
        int i = (int) (j - this.j);
        int i2 = this.m;
        if (i <= i2) {
            this.k = 0;
            return;
        }
        int i3 = i - i2;
        this.k = i3;
        this.h = j - i3;
    }

    @Override // defpackage.ner
    public final void A(int i) {
        this.m = i;
        M();
    }

    public final void B(int i) {
        if (i >= 0 && i <= L()) {
            this.i += i;
        } else if (i < 0) {
            throw ngd.f();
        } else {
            throw ngd.i();
        }
    }

    @Override // defpackage.ner
    public final boolean C() {
        return this.i == this.h;
    }

    @Override // defpackage.ner
    public final boolean D() {
        return r() != 0;
    }

    public final byte a() {
        long j = this.i;
        if (j == this.h) {
            throw ngd.i();
        }
        this.i = 1 + j;
        return nih.a(j);
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
        return (int) (this.i - this.j);
    }

    @Override // defpackage.ner
    public final int e(int i) {
        if (i >= 0) {
            int d = i + d();
            int i2 = this.m;
            if (d <= i2) {
                this.m = d;
                M();
                return i2;
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
        long j = this.i;
        if (this.h - j < 4) {
            throw ngd.i();
        }
        this.i = 4 + j;
        return ((nih.a(j + 3) & 255) << 24) | (nih.a(j) & 255) | ((nih.a(1 + j) & 255) << 8) | ((nih.a(2 + j) & 255) << 16);
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
            this.l = 0;
            return 0;
        }
        int j = j();
        this.l = j;
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
        long j = this.i;
        if (this.h - j < 8) {
            throw ngd.i();
        }
        this.i = 8 + j;
        return ((nih.a(j + 7) & 255) << 56) | (nih.a(j) & 255) | ((nih.a(1 + j) & 255) << 8) | ((nih.a(2 + j) & 255) << 16) | ((nih.a(3 + j) & 255) << 24) | ((nih.a(4 + j) & 255) << 32) | ((nih.a(5 + j) & 255) << 40) | ((nih.a(6 + j) & 255) << 48);
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
        if (j <= 0 || j > L()) {
            if (j == 0) {
                return nem.b;
            }
            if (j < 0) {
                throw ngd.f();
            }
            throw ngd.i();
        }
        byte[] bArr = new byte[j];
        long j2 = j;
        nih.k(this.i, bArr, 0L, j2);
        this.i += j2;
        return nem.y(bArr);
    }

    @Override // defpackage.ner
    public final String x() {
        int j = j();
        if (j <= 0 || j > L()) {
            if (j == 0) {
                return "";
            }
            if (j < 0) {
                throw ngd.f();
            }
            throw ngd.i();
        }
        byte[] bArr = new byte[j];
        long j2 = j;
        nih.k(this.i, bArr, 0L, j2);
        String str = new String(bArr, ngb.a);
        this.i += j2;
        return str;
    }

    @Override // defpackage.ner
    public final String y() {
        int j = j();
        if (j <= 0 || j > L()) {
            if (j == 0) {
                return "";
            }
            if (j <= 0) {
                throw ngd.f();
            }
            throw ngd.i();
        }
        String f = nij.f(this.f, (int) (this.i - this.g), j);
        this.i += j;
        return f;
    }

    @Override // defpackage.ner
    public final void z(int i) {
        if (this.l == i) {
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
            if (L() < 10) {
                while (i2 < 10) {
                    if (a() < 0) {
                        i2++;
                    }
                }
                throw ngd.e();
            }
            while (i2 < 10) {
                long j = this.i;
                this.i = 1 + j;
                if (nih.a(j) < 0) {
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

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
        if (defpackage.nih.a(r4) >= 0) goto L13;
     */
    @Override // defpackage.ner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int j() {
        /*
            r10 = this;
            long r0 = r10.i
            long r2 = r10.h
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto La
            goto L87
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = defpackage.nih.a(r0)
            if (r0 < 0) goto L17
            r10.i = r4
            return r0
        L17:
            long r6 = r10.h
            long r6 = r6 - r4
            r8 = 9
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L87
            long r6 = r4 + r2
            byte r1 = defpackage.nih.a(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L2e
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L84
        L2e:
            long r4 = r6 + r2
            byte r1 = defpackage.nih.a(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L3d
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L3b:
            r6 = r4
            goto L84
        L3d:
            long r6 = r4 + r2
            byte r1 = defpackage.nih.a(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L4d
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L84
        L4d:
            long r4 = r6 + r2
            byte r1 = defpackage.nih.a(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L3b
            long r6 = r4 + r2
            byte r1 = defpackage.nih.a(r4)
            if (r1 >= 0) goto L84
            long r4 = r6 + r2
            byte r1 = defpackage.nih.a(r6)
            if (r1 >= 0) goto L3b
            long r6 = r4 + r2
            byte r1 = defpackage.nih.a(r4)
            if (r1 >= 0) goto L84
            long r4 = r6 + r2
            byte r1 = defpackage.nih.a(r6)
            if (r1 >= 0) goto L3b
            long r6 = r4 + r2
            byte r1 = defpackage.nih.a(r4)
            if (r1 < 0) goto L87
        L84:
            r10.i = r6
            return r0
        L87:
            long r0 = r10.s()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.neq.j():int");
    }

    public final long r() {
        long a;
        long j;
        long j2;
        int i;
        long j3 = this.i;
        if (this.h != j3) {
            long j4 = j3 + 1;
            byte a2 = nih.a(j3);
            if (a2 >= 0) {
                this.i = j4;
                return a2;
            } else if (this.h - j4 >= 9) {
                long j5 = j4 + 1;
                int a3 = a2 ^ (nih.a(j4) << 7);
                if (a3 >= 0) {
                    long j6 = j5 + 1;
                    int a4 = a3 ^ (nih.a(j5) << 14);
                    if (a4 >= 0) {
                        a = a4 ^ 16256;
                    } else {
                        j5 = j6 + 1;
                        int a5 = a4 ^ (nih.a(j6) << 21);
                        if (a5 < 0) {
                            i = a5 ^ (-2080896);
                        } else {
                            j6 = j5 + 1;
                            long a6 = a5 ^ (nih.a(j5) << 28);
                            if (a6 < 0) {
                                long j7 = j6 + 1;
                                long a7 = a6 ^ (nih.a(j6) << 35);
                                if (a7 < 0) {
                                    j = -34093383808L;
                                } else {
                                    j6 = j7 + 1;
                                    a6 = a7 ^ (nih.a(j7) << 42);
                                    if (a6 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        j7 = j6 + 1;
                                        a7 = a6 ^ (nih.a(j6) << 49);
                                        if (a7 < 0) {
                                            j = -558586000294016L;
                                        } else {
                                            j6 = j7 + 1;
                                            a = (a7 ^ (nih.a(j7) << 56)) ^ 71499008037633920L;
                                            if (a < 0) {
                                                long j8 = 1 + j6;
                                                if (nih.a(j6) >= 0) {
                                                    j5 = j8;
                                                    this.i = j5;
                                                    return a;
                                                }
                                            }
                                        }
                                    }
                                }
                                a = a7 ^ j;
                                j5 = j7;
                                this.i = j5;
                                return a;
                            }
                            j2 = 266354560;
                            a = a6 ^ j2;
                        }
                    }
                    j5 = j6;
                    this.i = j5;
                    return a;
                }
                i = a3 ^ (-128);
                a = i;
                this.i = j5;
                return a;
            }
        }
        return s();
    }
}
