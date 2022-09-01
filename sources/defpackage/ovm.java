package defpackage;

/* compiled from: PG */
/* renamed from: ovm  reason: default package */
/* loaded from: classes2.dex */
public final class ovm extends ouu {
    public final transient byte[][] e;
    public final transient int[] f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovm(byte[][] bArr, int[] iArr) {
        super(ouu.a.b);
        oll.e(bArr, "segments");
        oll.e(iArr, "directory");
        this.e = bArr;
        this.f = iArr;
    }

    private final ouu q() {
        return new ouu(n());
    }

    private final Object writeReplace() {
        return q();
    }

    @Override // defpackage.ouu
    public final byte a(int i) {
        oli.f(this.f[this.e.length - 1], i, 1L);
        int d = oli.d(this, i);
        int i2 = d == 0 ? 0 : this.f[d - 1];
        int[] iArr = this.f;
        byte[][] bArr = this.e;
        return bArr[d][(i - i2) + iArr[bArr.length + d]];
    }

    @Override // defpackage.ouu
    public final int b() {
        return this.f[this.e.length - 1];
    }

    @Override // defpackage.ouu
    public final String d() {
        return q().d();
    }

    @Override // defpackage.ouu
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ouu) {
            ouu ouuVar = (ouu) obj;
            if (ouuVar.b() == b() && o(ouuVar, b())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ouu
    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int length = this.e.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr = this.e[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.c = i3;
        return i3;
    }

    @Override // defpackage.ouu
    public final ouu j() {
        return q().j();
    }

    @Override // defpackage.ouu
    public final boolean k(int i, byte[] bArr, int i2, int i3) {
        int i4;
        oll.e(bArr, "other");
        if (i < 0 || i > b() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int d = oli.d(this, i);
        while (i < i5) {
            if (d == 0) {
                d = 0;
                i4 = 0;
            } else {
                i4 = this.f[d - 1];
            }
            int[] iArr = this.f;
            int i6 = iArr[d];
            int i7 = iArr[this.e.length + d];
            int min = Math.min(i5, (i6 - i4) + i4) - i;
            if (!oli.g(this.e[d], i7 + (i - i4), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            d++;
        }
        return true;
    }

    @Override // defpackage.ouu
    public final byte[] m() {
        return n();
    }

    @Override // defpackage.ouu
    public final byte[] n() {
        byte[] bArr = new byte[b()];
        int length = this.e.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            nxp.A(this.e[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.ouu
    public final boolean o(ouu ouuVar, int i) {
        int i2;
        oll.e(ouuVar, "other");
        if (b() - i < 0) {
            return false;
        }
        int d = oli.d(this, 0);
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (d == 0) {
                d = 0;
                i2 = 0;
            } else {
                i2 = this.f[d - 1];
            }
            int[] iArr = this.f;
            int i5 = iArr[d];
            int i6 = iArr[this.e.length + d];
            int min = Math.min(i, (i5 - i2) + i2) - i3;
            if (!ouuVar.k(i4, this.e[d], i6 + (i3 - i2), min)) {
                return false;
            }
            i4 += min;
            i3 += min;
            d++;
        }
        return true;
    }

    @Override // defpackage.ouu
    public final void p(our ourVar, int i) {
        int i2;
        int d = oli.d(this, 0);
        int i3 = 0;
        while (i3 < i) {
            if (d == 0) {
                d = 0;
                i2 = 0;
            } else {
                i2 = this.f[d - 1];
            }
            int[] iArr = this.f;
            int i4 = iArr[d];
            int i5 = iArr[this.e.length + d];
            int min = Math.min(i, (i4 - i2) + i2) - i3;
            int i6 = i5 + (i3 - i2);
            ovk ovkVar = new ovk(this.e[d], i6, i6 + min, true);
            ovk ovkVar2 = ourVar.a;
            if (ovkVar2 == null) {
                ovkVar.g = ovkVar;
                ovkVar.f = ovkVar.g;
                ourVar.a = ovkVar.f;
            } else {
                ovk ovkVar3 = ovkVar2.g;
                oll.b(ovkVar3);
                ovkVar3.d(ovkVar);
            }
            i3 += min;
            d++;
        }
        ourVar.b += i;
    }

    @Override // defpackage.ouu
    public final String toString() {
        return q().toString();
    }
}
