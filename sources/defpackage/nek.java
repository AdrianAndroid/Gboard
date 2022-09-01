package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: PG */
/* renamed from: nek  reason: default package */
/* loaded from: classes2.dex */
public class nek extends nej {
    private static final long serialVersionUID = 1;
    protected final byte[] a;

    public nek(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.nem
    public byte a(int i) {
        return this.a[i];
    }

    @Override // defpackage.nem
    public byte b(int i) {
        return this.a[i];
    }

    protected int c() {
        return 0;
    }

    @Override // defpackage.nem
    public int d() {
        return this.a.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.nem
    public void e(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, i, bArr, i2, i3);
    }

    @Override // defpackage.nem
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nem) || d() != ((nem) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (obj instanceof nek) {
            nek nekVar = (nek) obj;
            int i = this.c;
            int i2 = nekVar.c;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            return g(nekVar, 0, d());
        }
        return obj.equals(this);
    }

    @Override // defpackage.nej
    public final boolean g(nem nemVar, int i, int i2) {
        if (i2 > nemVar.d()) {
            int d = d();
            throw new IllegalArgumentException("Length too large: " + i2 + d);
        }
        int i3 = i + i2;
        if (i3 > nemVar.d()) {
            int d2 = nemVar.d();
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + d2);
        } else if (nemVar instanceof nek) {
            nek nekVar = (nek) nemVar;
            byte[] bArr = this.a;
            byte[] bArr2 = nekVar.a;
            int c = c() + i2;
            int c2 = c();
            int c3 = nekVar.c() + i;
            while (c2 < c) {
                if (bArr[c2] != bArr2[c3]) {
                    return false;
                }
                c2++;
                c3++;
            }
            return true;
        } else {
            return nemVar.k(i, i3).equals(k(0, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.nem
    public final int i(int i, int i2, int i3) {
        return ngb.d(i, this.a, c() + i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.nem
    public final int j(int i, int i2, int i3) {
        int c = c() + i2;
        byte[] bArr = this.a;
        ndb ndbVar = nij.a;
        return ndb.am(i, bArr, c, i3 + c);
    }

    @Override // defpackage.nem
    public final nem k(int i, int i2) {
        int q = q(i, i2, d());
        return q == 0 ? nem.b : new neh(this.a, c() + i, q);
    }

    @Override // defpackage.nem
    public final ner l() {
        return ner.K(this.a, c(), d());
    }

    @Override // defpackage.nem
    protected final String m(Charset charset) {
        return new String(this.a, c(), d(), charset);
    }

    @Override // defpackage.nem
    public final ByteBuffer n() {
        return ByteBuffer.wrap(this.a, c(), d()).asReadOnlyBuffer();
    }

    @Override // defpackage.nem
    public final void o(nee neeVar) {
        neeVar.a(this.a, c(), d());
    }

    @Override // defpackage.nem
    public final boolean p() {
        int c = c();
        return nij.h(this.a, c, d() + c);
    }
}
