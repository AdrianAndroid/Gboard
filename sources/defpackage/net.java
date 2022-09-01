package defpackage;

import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: net  reason: default package */
/* loaded from: classes2.dex */
public final class net extends Cnew {
    final byte[] a;
    final int b;
    int c;
    int d;
    private final OutputStream g;

    public net(OutputStream outputStream, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i, 20)];
        this.a = bArr;
        this.b = bArr.length;
        if (outputStream != null) {
            this.g = outputStream;
            return;
        }
        throw new NullPointerException("out");
    }

    private final void aD(int i) {
        if (this.b - this.c < i) {
            i();
        }
    }

    @Override // defpackage.Cnew
    public final void A(int i, int i2) {
        C(nim.c(i, i2));
    }

    @Override // defpackage.Cnew
    public final void B(int i, int i2) {
        aD(20);
        f(i, 0);
        g(i2);
    }

    @Override // defpackage.Cnew
    public final void C(int i) {
        aD(5);
        g(i);
    }

    @Override // defpackage.Cnew
    public final void D(int i, long j) {
        aD(20);
        f(i, 0);
        h(j);
    }

    @Override // defpackage.Cnew
    public final void E(long j) {
        aD(10);
        h(j);
    }

    @Override // defpackage.Cnew
    public final void F(byte[] bArr, int i) {
        C(i);
        k(bArr, 0, i);
    }

    @Override // defpackage.Cnew, defpackage.nee
    public final void a(byte[] bArr, int i, int i2) {
        k(bArr, i, i2);
    }

    @Override // defpackage.Cnew
    public final int b() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    final void c(byte b) {
        byte[] bArr = this.a;
        int i = this.c;
        this.c = i + 1;
        bArr[i] = b;
        this.d++;
    }

    final void d(int i) {
        byte[] bArr = this.a;
        int i2 = this.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.c = i5 + 1;
        bArr[i5] = (byte) ((i >> 24) & 255);
        this.d += 4;
    }

    final void e(long j) {
        byte[] bArr = this.a;
        int i = this.c;
        int i2 = i + 1;
        bArr[i] = (byte) (j & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i5 + 1;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.c = i8 + 1;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        this.d += 8;
    }

    final void f(int i, int i2) {
        g(nim.c(i, i2));
    }

    public final void i() {
        this.g.write(this.a, 0, this.c);
        this.c = 0;
    }

    @Override // defpackage.Cnew
    public final void j(byte b) {
        if (this.c == this.b) {
            i();
        }
        c(b);
    }

    public final void k(byte[] bArr, int i, int i2) {
        int i3 = this.b;
        int i4 = this.c;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.a, i4, i2);
            this.c += i2;
            this.d += i2;
            return;
        }
        System.arraycopy(bArr, i, this.a, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.c = this.b;
        this.d += i5;
        i();
        if (i7 <= this.b) {
            System.arraycopy(bArr, i6, this.a, 0, i7);
            this.c = i7;
        } else {
            this.g.write(bArr, i6, i7);
        }
        this.d += i7;
    }

    @Override // defpackage.Cnew
    public final void l(int i, boolean z) {
        aD(11);
        f(i, 0);
        c(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.Cnew
    public final void m(int i, nem nemVar) {
        A(i, 2);
        n(nemVar);
    }

    @Override // defpackage.Cnew
    public final void n(nem nemVar) {
        C(nemVar.d());
        nemVar.o(this);
    }

    @Override // defpackage.Cnew
    public final void o(int i, int i2) {
        aD(14);
        f(i, 5);
        d(i2);
    }

    @Override // defpackage.Cnew
    public final void p(int i) {
        aD(4);
        d(i);
    }

    @Override // defpackage.Cnew
    public final void q(int i, long j) {
        aD(18);
        f(i, 1);
        e(j);
    }

    @Override // defpackage.Cnew
    public final void r(long j) {
        aD(8);
        e(j);
    }

    @Override // defpackage.Cnew
    public final void s(int i, int i2) {
        aD(20);
        f(i, 0);
        if (i2 >= 0) {
            g(i2);
        } else {
            h(i2);
        }
    }

    @Override // defpackage.Cnew
    public final void t(int i) {
        if (i >= 0) {
            C(i);
        } else {
            E(i);
        }
    }

    @Override // defpackage.Cnew
    public final void u(int i, ngz ngzVar, nho nhoVar) {
        A(i, 2);
        ndu nduVar = (ndu) ngzVar;
        int m = nduVar.m();
        if (m == -1) {
            m = nhoVar.a(nduVar);
            nduVar.o(m);
        }
        C(m);
        nhoVar.l(ngzVar, this.f);
    }

    @Override // defpackage.Cnew
    public final void v(ngz ngzVar) {
        C(ngzVar.s());
        ngzVar.ii(this);
    }

    @Override // defpackage.Cnew
    public final void w(int i, ngz ngzVar) {
        A(1, 3);
        B(2, i);
        A(3, 2);
        v(ngzVar);
        A(1, 4);
    }

    @Override // defpackage.Cnew
    public final void x(int i, nem nemVar) {
        A(1, 3);
        B(2, i);
        m(3, nemVar);
        A(1, 4);
    }

    @Override // defpackage.Cnew
    public final void y(int i, String str) {
        A(i, 2);
        z(str);
    }

    @Override // defpackage.Cnew
    public final void z(String str) {
        int b;
        try {
            int length = str.length() * 3;
            int ad = ad(length);
            int i = ad + length;
            int i2 = this.b;
            if (i <= i2) {
                if (i > i2 - this.c) {
                    i();
                }
                int ad2 = ad(str.length());
                int i3 = this.c;
                try {
                    if (ad2 == ad) {
                        int i4 = i3 + ad2;
                        this.c = i4;
                        int a = nij.a(str, this.a, i4, this.b - i4);
                        this.c = i3;
                        b = (a - i3) - ad2;
                        g(b);
                        this.c = a;
                    } else {
                        b = nij.b(str);
                        g(b);
                        this.c = nij.a(str, this.a, this.c, b);
                    }
                    this.d += b;
                    return;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new nev(e);
                } catch (nii e2) {
                    this.d -= this.c - i3;
                    this.c = i3;
                    throw e2;
                }
            }
            byte[] bArr = new byte[length];
            int a2 = nij.a(str, bArr, 0, length);
            C(a2);
            k(bArr, 0, a2);
        } catch (nii e3) {
            am(str, e3);
        }
    }

    final void g(int i) {
        if (!Cnew.e) {
            while ((i & (-128)) != 0) {
                byte[] bArr = this.a;
                int i2 = this.c;
                this.c = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                this.d++;
                i >>>= 7;
            }
            byte[] bArr2 = this.a;
            int i3 = this.c;
            this.c = i3 + 1;
            bArr2[i3] = (byte) i;
            this.d++;
            return;
        }
        long j = this.c;
        while ((i & (-128)) != 0) {
            byte[] bArr3 = this.a;
            int i4 = this.c;
            this.c = i4 + 1;
            nih.n(bArr3, i4, (byte) ((i & 127) | 128));
            i >>>= 7;
        }
        byte[] bArr4 = this.a;
        int i5 = this.c;
        this.c = i5 + 1;
        nih.n(bArr4, i5, (byte) i);
        this.d += (int) (this.c - j);
    }

    final void h(long j) {
        if (!Cnew.e) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.a;
                int i = this.c;
                this.c = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                this.d++;
                j >>>= 7;
            }
            byte[] bArr2 = this.a;
            int i2 = this.c;
            this.c = i2 + 1;
            bArr2[i2] = (byte) j;
            this.d++;
            return;
        }
        long j2 = this.c;
        while ((j & (-128)) != 0) {
            byte[] bArr3 = this.a;
            int i3 = this.c;
            this.c = i3 + 1;
            nih.n(bArr3, i3, (byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        byte[] bArr4 = this.a;
        int i4 = this.c;
        this.c = i4 + 1;
        nih.n(bArr4, i4, (byte) j);
        this.d += (int) (this.c - j2);
    }
}
