package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: neu  reason: default package */
/* loaded from: classes2.dex */
public final class neu extends Cnew {
    private final byte[] a;
    private final int b;
    private int c;

    public neu(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            int length = bArr.length;
            int i3 = i + i2;
            if ((i | i2 | (length - i3)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            this.a = bArr;
            this.c = i;
            this.b = i3;
            return;
        }
        throw new NullPointerException("buffer");
    }

    @Override // defpackage.Cnew
    public final void A(int i, int i2) {
        C(nim.c(i, i2));
    }

    @Override // defpackage.Cnew
    public final void B(int i, int i2) {
        A(i, 0);
        C(i2);
    }

    @Override // defpackage.Cnew
    public final void D(int i, long j) {
        A(i, 0);
        E(j);
    }

    @Override // defpackage.Cnew
    public final void F(byte[] bArr, int i) {
        C(i);
        c(bArr, 0, i);
    }

    @Override // defpackage.Cnew, defpackage.nee
    public final void a(byte[] bArr, int i, int i2) {
        c(bArr, i, i2);
    }

    @Override // defpackage.Cnew
    public final int b() {
        return this.b - this.c;
    }

    @Override // defpackage.Cnew
    public final void l(int i, boolean z) {
        A(i, 0);
        j(z ? (byte) 1 : (byte) 0);
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
        A(i, 5);
        p(i2);
    }

    @Override // defpackage.Cnew
    public final void p(int i) {
        try {
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
        } catch (IndexOutOfBoundsException e) {
            throw new nev(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
        }
    }

    @Override // defpackage.Cnew
    public final void q(int i, long j) {
        A(i, 1);
        r(j);
    }

    @Override // defpackage.Cnew
    public final void r(long j) {
        try {
            byte[] bArr = this.a;
            int i = this.c;
            int i2 = i + 1;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.c = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new nev(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
        }
    }

    @Override // defpackage.Cnew
    public final void s(int i, int i2) {
        A(i, 0);
        t(i2);
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
        int i = this.c;
        try {
            int ad = ad(str.length() * 3);
            int ad2 = ad(str.length());
            if (ad2 == ad) {
                int i2 = i + ad2;
                this.c = i2;
                int a = nij.a(str, this.a, i2, b());
                this.c = i;
                C((a - i) - ad2);
                this.c = a;
                return;
            }
            C(nij.b(str));
            this.c = nij.a(str, this.a, this.c, b());
        } catch (IndexOutOfBoundsException e) {
            throw new nev(e);
        } catch (nii e2) {
            this.c = i;
            am(str, e2);
        }
    }

    @Override // defpackage.Cnew
    public final void C(int i) {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.a;
                int i2 = this.c;
                this.c = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new nev(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
            }
        }
        byte[] bArr2 = this.a;
        int i3 = this.c;
        this.c = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    public final void c(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.a, this.c, i2);
            this.c += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new nev(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), Integer.valueOf(i2)), e);
        }
    }

    @Override // defpackage.Cnew
    public final void j(byte b) {
        try {
            byte[] bArr = this.a;
            int i = this.c;
            this.c = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new nev(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
        }
    }

    @Override // defpackage.Cnew
    public final void E(long j) {
        if (Cnew.e && b() >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.a;
                int i = this.c;
                this.c = i + 1;
                nih.n(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.a;
            int i2 = this.c;
            this.c = i2 + 1;
            nih.n(bArr2, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.a;
                int i3 = this.c;
                this.c = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new nev(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
            }
        }
        byte[] bArr4 = this.a;
        int i4 = this.c;
        this.c = i4 + 1;
        bArr4[i4] = (byte) j;
    }
}
