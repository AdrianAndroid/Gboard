package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: neo  reason: default package */
/* loaded from: classes2.dex */
final class neo extends ner {
    private final Iterable f;
    private final Iterator g;
    private ByteBuffer h;
    private int i;
    private int j;
    private int l;
    private long n;
    private long o;
    private long p;
    private int k = Integer.MAX_VALUE;
    private int m = 0;

    public neo(Iterable iterable, int i) {
        this.i = i;
        this.f = iterable;
        this.g = iterable.iterator();
        if (i == 0) {
            this.h = ngb.c;
            this.n = 0L;
            this.o = 0L;
            this.p = 0L;
            return;
        }
        P();
    }

    private final int L() {
        return (int) (((this.i - this.m) - this.n) + this.o);
    }

    private final long M() {
        return this.p - this.n;
    }

    private final void N() {
        if (!this.g.hasNext()) {
            throw ngd.i();
        }
        P();
    }

    private final void O() {
        int i = this.i + this.j;
        this.i = i;
        int i2 = this.k;
        if (i <= i2) {
            this.j = 0;
            return;
        }
        int i3 = i - i2;
        this.j = i3;
        this.i = i - i3;
    }

    private final void P() {
        ByteBuffer byteBuffer = (ByteBuffer) this.g.next();
        this.h = byteBuffer;
        this.m += (int) (this.n - this.o);
        long position = byteBuffer.position();
        this.n = position;
        this.o = position;
        this.p = this.h.limit();
        long e = nih.e(this.h);
        this.n += e;
        this.o += e;
        this.p += e;
    }

    private final void Q(byte[] bArr, int i) {
        if (i > L()) {
            if (i > 0) {
                throw ngd.i();
            }
            return;
        }
        int i2 = i;
        while (i2 > 0) {
            if (M() == 0) {
                N();
            }
            int min = Math.min(i2, (int) M());
            long j = min;
            nih.k(this.n, bArr, i - i2, j);
            i2 -= min;
            this.n += j;
        }
    }

    @Override // defpackage.ner
    public final void A(int i) {
        this.k = i;
        O();
    }

    @Override // defpackage.ner
    public final boolean C() {
        return (((long) this.m) + this.n) - this.o == ((long) this.i);
    }

    @Override // defpackage.ner
    public final boolean D() {
        return r() != 0;
    }

    @Override // defpackage.ner
    public final boolean E(int i) {
        int m;
        int b = nim.b(i);
        if (b == 0) {
            for (int i2 = 0; i2 < 10; i2++) {
                if (a() >= 0) {
                    return true;
                }
            }
            throw ngd.e();
        } else if (b == 1) {
            B(8);
            return true;
        } else if (b == 2) {
            B(j());
            return true;
        } else if (b == 3) {
            do {
                m = m();
                if (m == 0) {
                    break;
                }
            } while (E(m));
            z(nim.c(nim.a(i), 4));
            return true;
        } else {
            if (b == 4) {
                return false;
            }
            if (b == 5) {
                B(4);
                return true;
            }
            throw ngd.a();
        }
    }

    public final byte a() {
        if (M() == 0) {
            N();
        }
        long j = this.n;
        this.n = 1 + j;
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
        return (int) ((this.m + this.n) - this.o);
    }

    @Override // defpackage.ner
    public final int e(int i) {
        if (i >= 0) {
            int d = i + d();
            int i2 = this.k;
            if (d <= i2) {
                this.k = d;
                O();
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
        if (M() >= 4) {
            long j = this.n;
            this.n = 4 + j;
            return ((nih.a(j + 3) & 255) << 24) | (nih.a(j) & 255) | ((nih.a(1 + j) & 255) << 8) | ((nih.a(2 + j) & 255) << 16);
        }
        return (a() & 255) | ((a() & 255) << 8) | ((a() & 255) << 16) | ((a() & 255) << 24);
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
        if (M() >= 8) {
            long j = this.n;
            this.n = 8 + j;
            long a = ((nih.a(4 + j) & 255) << 32) | ((nih.a(2 + j) & 255) << 16) | (nih.a(j) & 255) | ((nih.a(1 + j) & 255) << 8) | ((nih.a(3 + j) & 255) << 24) | ((nih.a(5 + j) & 255) << 40);
            return ((nih.a(j + 7) & 255) << 56) | ((nih.a(6 + j) & 255) << 48) | a;
        }
        return (a() & 255) | ((a() & 255) << 8) | ((a() & 255) << 16) | ((a() & 255) << 24) | ((a() & 255) << 32) | ((a() & 255) << 40) | ((a() & 255) << 48) | ((a() & 255) << 56);
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
            long j2 = j;
            long j3 = this.p;
            long j4 = this.n;
            if (j2 <= j3 - j4) {
                byte[] bArr = new byte[j];
                nih.k(j4, bArr, 0L, j2);
                this.n += j2;
                return nem.y(bArr);
            }
        }
        if (j > 0 && j <= L()) {
            byte[] bArr2 = new byte[j];
            Q(bArr2, j);
            return nem.y(bArr2);
        } else if (j == 0) {
            return nem.b;
        } else {
            if (j < 0) {
                throw ngd.f();
            }
            throw ngd.i();
        }
    }

    @Override // defpackage.ner
    public final String x() {
        int j = j();
        if (j > 0) {
            long j2 = j;
            long j3 = this.p;
            long j4 = this.n;
            if (j2 <= j3 - j4) {
                byte[] bArr = new byte[j];
                nih.k(j4, bArr, 0L, j2);
                String str = new String(bArr, ngb.a);
                this.n += j2;
                return str;
            }
        }
        if (j > 0 && j <= L()) {
            byte[] bArr2 = new byte[j];
            Q(bArr2, j);
            return new String(bArr2, ngb.a);
        } else if (j == 0) {
            return "";
        } else {
            if (j < 0) {
                throw ngd.f();
            }
            throw ngd.i();
        }
    }

    @Override // defpackage.ner
    public final String y() {
        int j = j();
        if (j > 0) {
            long j2 = j;
            long j3 = this.p;
            long j4 = this.n;
            if (j2 <= j3 - j4) {
                String f = nij.f(this.h, (int) (j4 - this.o), j);
                this.n += j2;
                return f;
            }
        }
        if (j >= 0 && j <= L()) {
            byte[] bArr = new byte[j];
            Q(bArr, j);
            return nij.g(bArr, 0, j);
        } else if (j == 0) {
            return "";
        } else {
            if (j <= 0) {
                throw ngd.f();
            }
            throw ngd.i();
        }
    }

    @Override // defpackage.ner
    public final void z(int i) {
        if (this.l == i) {
            return;
        }
        throw ngd.b();
    }

    public final void B(int i) {
        if (i < 0 || i > ((this.i - this.m) - this.n) + this.o) {
            if (i < 0) {
                throw ngd.f();
            }
            throw ngd.i();
        }
        while (i > 0) {
            if (M() == 0) {
                N();
            }
            int min = Math.min(i, (int) M());
            i -= min;
            this.n += min;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
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
            long r0 = r10.n
            long r2 = r10.p
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto La
            goto L8c
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = defpackage.nih.a(r0)
            if (r0 < 0) goto L1a
            long r4 = r10.n
            long r4 = r4 + r2
            r10.n = r4
            return r0
        L1a:
            long r6 = r10.p
            long r8 = r10.n
            long r6 = r6 - r8
            r8 = 10
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L8c
            long r6 = r4 + r2
            byte r1 = defpackage.nih.a(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L33
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L89
        L33:
            long r4 = r6 + r2
            byte r1 = defpackage.nih.a(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L42
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L40:
            r6 = r4
            goto L89
        L42:
            long r6 = r4 + r2
            byte r1 = defpackage.nih.a(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L52
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L89
        L52:
            long r4 = r6 + r2
            byte r1 = defpackage.nih.a(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = defpackage.nih.a(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = defpackage.nih.a(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = defpackage.nih.a(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = defpackage.nih.a(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = defpackage.nih.a(r4)
            if (r1 < 0) goto L8c
        L89:
            r10.n = r6
            return r0
        L8c:
            long r0 = r10.s()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.neo.j():int");
    }

    public final long r() {
        long a;
        long j;
        long j2;
        int i;
        long j3 = this.n;
        if (this.p != j3) {
            long j4 = j3 + 1;
            byte a2 = nih.a(j3);
            if (a2 >= 0) {
                this.n++;
                return a2;
            } else if (this.p - this.n >= 10) {
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
                                                    this.n = j5;
                                                    return a;
                                                }
                                            }
                                        }
                                    }
                                }
                                a = a7 ^ j;
                                j5 = j7;
                                this.n = j5;
                                return a;
                            }
                            j2 = 266354560;
                            a = a6 ^ j2;
                        }
                    }
                    j5 = j6;
                    this.n = j5;
                    return a;
                }
                i = a3 ^ (-128);
                a = i;
                this.n = j5;
                return a;
            }
        }
        return s();
    }
}
