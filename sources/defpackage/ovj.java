package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: PG */
/* renamed from: ovj  reason: default package */
/* loaded from: classes2.dex */
public final class ovj implements out {
    public final ovp a;
    public final our b = new our();
    public boolean c;

    public ovj(ovp ovpVar) {
        oll.e(ovpVar, "source");
        this.a = ovpVar;
    }

    @Override // defpackage.out
    public final void A(long j) {
        if (D(j)) {
            return;
        }
        throw new EOFException();
    }

    @Override // defpackage.out
    public final void B(long j) {
        if (!this.c) {
            while (j > 0) {
                our ourVar = this.b;
                if (ourVar.b != 0 || this.a.b(ourVar, 8192L) != -1) {
                    long min = Math.min(j, this.b.b);
                    this.b.B(min);
                    j -= min;
                } else {
                    throw new EOFException();
                }
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.out
    public final boolean C() {
        if (!this.c) {
            our ourVar = this.b;
            return ourVar.C() && this.a.b(ourVar, 8192L) == -1;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.out
    public final boolean D(long j) {
        our ourVar;
        if (j >= 0) {
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            do {
                ourVar = this.b;
                if (ourVar.b >= j) {
                    return true;
                }
            } while (this.a.b(ourVar, 8192L) != -1);
            return false;
        }
        throw new IllegalArgumentException("byteCount < 0: " + j);
    }

    @Override // defpackage.out
    public final byte[] E() {
        this.b.M(this.a);
        return this.b.E();
    }

    @Override // defpackage.out
    public final byte[] F(long j) {
        A(j);
        return this.b.F(j);
    }

    @Override // defpackage.out
    public final boolean H(ouu ouuVar) {
        oll.e(ouuVar, "bytes");
        int b = ouuVar.b();
        oll.e(ouuVar, "bytes");
        if (!this.c) {
            if (ouuVar.b() < b) {
                return false;
            }
            for (int i = 0; i < b; i++) {
                long j = i;
                if (!D(1 + j) || this.b.c(j) != ouuVar.a(i)) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.ovp
    public final ovr a() {
        return this.a.a();
    }

    @Override // defpackage.ovp
    public final long b(our ourVar, long j) {
        if (j >= 0) {
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            our ourVar2 = this.b;
            if (ourVar2.b == 0 && this.a.b(ourVar2, 8192L) == -1) {
                return -1L;
            }
            return this.b.b(ourVar, Math.min(j, this.b.b));
        }
        throw new IllegalArgumentException("byteCount < 0: " + j);
    }

    public final int c() {
        A(4L);
        int f = this.b.f();
        return ((f & 255) << 24) | (f >>> 24) | ((16711680 & f) >>> 8) | ((65280 & f) << 8);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.ovp
    public final void close() {
        if (!this.c) {
            this.c = true;
            this.a.close();
            this.b.y();
        }
    }

    @Override // defpackage.out
    public final byte d() {
        A(1L);
        return this.b.d();
    }

    public final long e() {
        return g((byte) 0, Long.MAX_VALUE);
    }

    @Override // defpackage.out
    public final int f() {
        A(4L);
        return this.b.f();
    }

    public final long g(byte b, long j) {
        if (!this.c) {
            long j2 = 0;
            while (j2 < j) {
                long i = this.b.i(b, j2, j);
                if (i != -1) {
                    return i;
                }
                our ourVar = this.b;
                long j3 = ourVar.b;
                if (j3 >= j || this.a.b(ourVar, 8192L) == -1) {
                    return -1L;
                }
                j2 = Math.max(j2, j3);
            }
            return -1L;
        }
        throw new IllegalStateException("closed");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0128 A[SYNTHETIC] */
    @Override // defpackage.out
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long h(defpackage.ouu r21) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ovj.h(ouu):long");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015a A[SYNTHETIC] */
    @Override // defpackage.out
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long j(defpackage.ouu r20) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ovj.j(ouu):long");
    }

    @Override // defpackage.out
    public final InputStream k() {
        return new ovi(this, 0);
    }

    @Override // defpackage.out
    public final String l(Charset charset) {
        oll.e(charset, "charset");
        this.b.M(this.a);
        return this.b.l(charset);
    }

    @Override // defpackage.out
    public final String p() {
        return q(Long.MAX_VALUE);
    }

    @Override // defpackage.out
    public final String q(long j) {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            long g = g((byte) 10, j2);
            if (g != -1) {
                return ovt.a(this.b, g);
            }
            if (j2 >= Long.MAX_VALUE || !D(j2) || this.b.c((-1) + j2) != 13 || !D(1 + j2) || this.b.c(j2) != 10) {
                our ourVar = new our();
                our ourVar2 = this.b;
                ourVar2.G(ourVar, 0L, Math.min(32L, ourVar2.b));
                long min = Math.min(this.b.b, j);
                String d = ourVar.r().d();
                throw new EOFException("\\n not found: limit=" + min + " content=" + d + "…");
            }
            return ovt.a(this.b, j2);
        }
        throw new IllegalArgumentException("limit < 0: " + j);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        oll.e(byteBuffer, "sink");
        our ourVar = this.b;
        if (ourVar.b == 0 && this.a.b(ourVar, 8192L) == -1) {
            return -1;
        }
        return this.b.read(byteBuffer);
    }

    @Override // defpackage.out
    public final ouu s(long j) {
        A(j);
        return this.b.s(j);
    }

    public final String toString() {
        ovp ovpVar = this.a;
        return "buffer(" + ovpVar + ")";
    }

    @Override // defpackage.out
    public final short w() {
        A(2L);
        return this.b.w();
    }

    @Override // defpackage.out
    public final void z(byte[] bArr) {
        oll.e(bArr, "sink");
        try {
            A(bArr.length);
            this.b.z(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                our ourVar = this.b;
                long j = ourVar.b;
                if (j <= 0) {
                    throw e;
                }
                int e2 = ourVar.e(bArr, i, (int) j);
                if (e2 == -1) {
                    throw new AssertionError();
                }
                i += e2;
            }
        }
    }
}
