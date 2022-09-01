package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* compiled from: PG */
/* renamed from: our  reason: default package */
/* loaded from: classes2.dex */
public final class our implements Cloneable, ByteChannel, out, ous {
    public ovk a;
    public long b;

    @Override // defpackage.out
    public final void A(long j) {
        throw null;
    }

    @Override // defpackage.out
    public final boolean C() {
        return this.b == 0;
    }

    @Override // defpackage.out
    public final boolean D(long j) {
        throw null;
    }

    @Override // defpackage.out
    public final byte[] E() {
        return F(this.b);
    }

    public final void G(our ourVar, long j, long j2) {
        oli.f(this.b, j, j2);
        if (j2 == 0) {
            return;
        }
        ourVar.b += j2;
        ovk ovkVar = this.a;
        while (true) {
            oll.b(ovkVar);
            long j3 = ovkVar.c - ovkVar.b;
            if (j >= j3) {
                j -= j3;
                ovkVar = ovkVar.f;
            }
        }
        while (j2 > 0) {
            oll.b(ovkVar);
            ovk b = ovkVar.b();
            int i = b.b + ((int) j);
            b.b = i;
            b.c = Math.min(i + ((int) j2), b.c);
            ovk ovkVar2 = ourVar.a;
            if (ovkVar2 == null) {
                b.g = b;
                b.f = b.g;
                ourVar.a = b.f;
            } else {
                ovk ovkVar3 = ovkVar2.g;
                oll.b(ovkVar3);
                ovkVar3.d(b);
            }
            j2 -= b.c - b.b;
            ovkVar = ovkVar.f;
            j = 0;
        }
    }

    @Override // defpackage.out
    public final boolean H(ouu ouuVar) {
        oll.e(ouuVar, "bytes");
        int b = ouuVar.b();
        oll.e(ouuVar, "bytes");
        if (this.b < b || ouuVar.b() < b) {
            return false;
        }
        for (int i = 0; i < b; i++) {
            if (c(i) != ouuVar.a(i)) {
                return false;
            }
        }
        return true;
    }

    public final void I(ouu ouuVar) {
        oll.e(ouuVar, "byteString");
        ouuVar.p(this, ouuVar.b());
    }

    @Override // defpackage.ous
    public final /* bridge */ /* synthetic */ void J(byte[] bArr) {
        throw null;
    }

    @Override // defpackage.ous
    /* renamed from: K */
    public final void L(byte[] bArr, int i, int i2) {
        oll.e(bArr, "source");
        long j = i2;
        oli.f(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            ovk v = v(1);
            int min = Math.min(i3 - i, 8192 - v.c);
            int i4 = i + min;
            nxp.A(bArr, v.a, v.c, i, i4);
            v.c += min;
            i = i4;
        }
        this.b += j;
    }

    public final void M(ovp ovpVar) {
        oll.e(ovpVar, "source");
        do {
        } while (ovpVar.b(this, 8192L) != -1);
    }

    public final void N(int i) {
        ovk v = v(1);
        byte[] bArr = v.a;
        int i2 = v.c;
        v.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    public final void O(int i) {
        ovk v = v(4);
        byte[] bArr = v.a;
        int i2 = v.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        v.c = i5 + 1;
        this.b += 4;
    }

    @Override // defpackage.ous
    public final /* bridge */ /* synthetic */ void P(int i) {
        throw null;
    }

    @Override // defpackage.ous
    public final /* bridge */ /* synthetic */ void Q(int i) {
        throw null;
    }

    public final void R(String str, int i, int i2) {
        char charAt;
        oll.e(str, "string");
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i);
        } else if (i2 >= i) {
            if (i2 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
            }
            while (i < i2) {
                char charAt2 = str.charAt(i);
                if (charAt2 < 128) {
                    ovk v = v(1);
                    byte[] bArr = v.a;
                    int i3 = v.c - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    bArr[i + i3] = (byte) charAt2;
                    while (true) {
                        i = i4;
                        if (i >= min || (charAt = str.charAt(i)) >= 128) {
                            break;
                        }
                        i4 = i + 1;
                        bArr[i + i3] = (byte) charAt;
                    }
                    int i5 = v.c;
                    int i6 = (i3 + i) - i5;
                    v.c = i5 + i6;
                    this.b += i6;
                } else {
                    if (charAt2 < 2048) {
                        ovk v2 = v(2);
                        byte[] bArr2 = v2.a;
                        int i7 = v2.c;
                        bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                        bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                        v2.c = i7 + 2;
                        this.b += 2;
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        ovk v3 = v(3);
                        byte[] bArr3 = v3.a;
                        int i8 = v3.c;
                        bArr3[i8] = (byte) ((charAt2 >> '\f') | 224);
                        bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                        bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                        v3.c = i8 + 3;
                        this.b += 3;
                    } else {
                        int i9 = i + 1;
                        char charAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                        if (charAt2 > 56319 || charAt3 < 56320 || charAt3 >= 57344) {
                            N(63);
                            i = i9;
                        } else {
                            int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                            ovk v4 = v(4);
                            byte[] bArr4 = v4.a;
                            int i11 = v4.c;
                            bArr4[i11] = (byte) ((i10 >> 18) | 240);
                            bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                            bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                            bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                            v4.c = i11 + 4;
                            this.b += 4;
                            i += 2;
                        }
                    }
                    i++;
                }
            }
        } else {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
    }

    public final void S(int i) {
        if (i < 128) {
            N(i);
        } else if (i < 2048) {
            ovk v = v(2);
            byte[] bArr = v.a;
            int i2 = v.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            v.c = i2 + 2;
            this.b += 2;
        } else if (i >= 55296 && i < 57344) {
            N(63);
        } else if (i < 65536) {
            ovk v2 = v(3);
            byte[] bArr2 = v2.a;
            int i3 = v2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            v2.c = i3 + 3;
            this.b += 3;
        } else if (i <= 1114111) {
            ovk v3 = v(4);
            byte[] bArr3 = v3.a;
            int i4 = v3.c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            v3.c = i4 + 4;
            this.b += 4;
        } else {
            char c = ovu.a[i >> 28];
            int i5 = 0;
            char[] cArr = ovu.a;
            char[] cArr2 = {c, cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            while (i5 < 8 && cArr2[i5] == '0') {
                i5++;
            }
            if (i5 < 0) {
                throw new IndexOutOfBoundsException("startIndex: " + i5 + ", endIndex: 8, size: 8");
            } else if (i5 <= 8) {
                throw new IllegalArgumentException("Unexpected code point: 0x".concat(new String(cArr2, i5, 8 - i5)));
            } else {
                throw new IllegalArgumentException("startIndex: " + i5 + " > endIndex: 8");
            }
        }
    }

    @Override // defpackage.ous
    public final /* bridge */ /* synthetic */ void T() {
        throw null;
    }

    public final void U(byte[] bArr) {
        oll.e(bArr, "source");
        L(bArr, 0, bArr.length);
    }

    public final void V(long j) {
        if (j == 0) {
            N(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) >> 2);
        ovk v = v(i);
        byte[] bArr = v.a;
        int i2 = v.c;
        int i3 = i2 + i;
        while (true) {
            i3--;
            if (i3 >= i2) {
                bArr[i3] = ovt.a[(int) (15 & j)];
                j >>>= 4;
            } else {
                v.c += i;
                this.b += i;
                return;
            }
        }
    }

    public final void W(String str) {
        oll.e(str, "string");
        R(str, 0, str.length());
    }

    @Override // defpackage.ous
    public final /* bridge */ /* synthetic */ void X(int i) {
        throw null;
    }

    public final void Y(long j) {
        boolean z;
        if (j == 0) {
            N(48);
            return;
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                W("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        ovk v = v(i);
        byte[] bArr = v.a;
        int i2 = v.c + i;
        while (j != 0) {
            i2--;
            bArr[i2] = ovt.a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        v.c += i;
        this.b += i;
    }

    @Override // defpackage.ous
    public final /* bridge */ /* synthetic */ void Z(long j) {
        throw null;
    }

    @Override // defpackage.ovp
    public final ovr a() {
        return ovr.h;
    }

    @Override // defpackage.ous
    public final /* bridge */ /* synthetic */ void aa(String str) {
        throw null;
    }

    @Override // defpackage.ovp
    public final long b(our ourVar, long j) {
        if (j >= 0) {
            long j2 = this.b;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            ourVar.ik(this, j);
            return j;
        }
        throw new IllegalArgumentException("byteCount < 0: " + j);
    }

    public final byte c(long j) {
        oli.f(this.b, j, 1L);
        ovk ovkVar = this.a;
        if (ovkVar == null) {
            oll.b(null);
            throw null;
        }
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                ovkVar = ovkVar.g;
                oll.b(ovkVar);
                j2 -= ovkVar.c - ovkVar.b;
            }
            oll.b(ovkVar);
            return ovkVar.a[(int) ((ovkVar.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            long j4 = (ovkVar.c - ovkVar.b) + j3;
            if (j4 > j) {
                oll.b(ovkVar);
                return ovkVar.a[(int) ((ovkVar.b + j) - j3)];
            }
            ovkVar = ovkVar.f;
            oll.b(ovkVar);
            j3 = j4;
        }
    }

    public final /* synthetic */ Object clone() {
        our ourVar = new our();
        if (this.b != 0) {
            ovk ovkVar = this.a;
            oll.b(ovkVar);
            ovk b = ovkVar.b();
            ourVar.a = b;
            b.g = b;
            b.f = b.g;
            for (ovk ovkVar2 = ovkVar.f; ovkVar2 != ovkVar; ovkVar2 = ovkVar2.f) {
                ovk ovkVar3 = b.g;
                oll.b(ovkVar3);
                oll.b(ovkVar2);
                ovkVar3.d(ovkVar2.b());
            }
            ourVar.b = this.b;
        }
        return ourVar;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.ovp
    public final void close() {
    }

    @Override // defpackage.out
    public final byte d() {
        if (this.b == 0) {
            throw new EOFException();
        }
        ovk ovkVar = this.a;
        oll.b(ovkVar);
        int i = ovkVar.b;
        int i2 = ovkVar.c;
        int i3 = i + 1;
        byte b = ovkVar.a[i];
        this.b--;
        if (i3 == i2) {
            this.a = ovkVar.a();
            ovl.b(ovkVar);
        } else {
            ovkVar.b = i3;
        }
        return b;
    }

    public final int e(byte[] bArr, int i, int i2) {
        oll.e(bArr, "sink");
        oli.f(bArr.length, i, i2);
        ovk ovkVar = this.a;
        if (ovkVar == null) {
            return -1;
        }
        int min = Math.min(i2, ovkVar.c - ovkVar.b);
        byte[] bArr2 = ovkVar.a;
        int i3 = ovkVar.b;
        nxp.A(bArr2, bArr, i, i3, i3 + min);
        int i4 = ovkVar.b + min;
        ovkVar.b = i4;
        this.b -= min;
        if (i4 != ovkVar.c) {
            return min;
        }
        this.a = ovkVar.a();
        ovl.b(ovkVar);
        return min;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof our) {
                long j = this.b;
                our ourVar = (our) obj;
                if (j == ourVar.b) {
                    if (j != 0) {
                        ovk ovkVar = this.a;
                        oll.b(ovkVar);
                        ovk ovkVar2 = ourVar.a;
                        oll.b(ovkVar2);
                        int i = ovkVar.b;
                        int i2 = ovkVar2.b;
                        long j2 = 0;
                        while (j2 < this.b) {
                            long min = Math.min(ovkVar.c - i, ovkVar2.c - i2);
                            long j3 = 0;
                            while (j3 < min) {
                                int i3 = i + 1;
                                int i4 = i2 + 1;
                                if (ovkVar.a[i] == ovkVar2.a[i2]) {
                                    j3++;
                                    i = i3;
                                    i2 = i4;
                                }
                            }
                            if (i == ovkVar.c) {
                                ovk ovkVar3 = ovkVar.f;
                                oll.b(ovkVar3);
                                i = ovkVar3.b;
                                ovkVar = ovkVar3;
                            }
                            if (i2 == ovkVar2.c) {
                                ovkVar2 = ovkVar2.f;
                                oll.b(ovkVar2);
                                i2 = ovkVar2.b;
                            }
                            j2 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.out
    public final int f() {
        if (this.b < 4) {
            throw new EOFException();
        }
        ovk ovkVar = this.a;
        oll.b(ovkVar);
        int i = ovkVar.b;
        int i2 = ovkVar.c;
        if (i2 - i < 4) {
            return ((d() & 255) << 24) | ((d() & 255) << 16) | ((d() & 255) << 8) | (d() & 255);
        }
        byte[] bArr = ovkVar.a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
        this.b -= 4;
        if (i6 == i2) {
            this.a = ovkVar.a();
            ovl.b(ovkVar);
        } else {
            ovkVar.b = i6;
        }
        return i7;
    }

    @Override // defpackage.ous, defpackage.ovn, java.io.Flushable
    public final void flush() {
    }

    public final long g() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        ovk ovkVar = this.a;
        oll.b(ovkVar);
        ovk ovkVar2 = ovkVar.g;
        oll.b(ovkVar2);
        int i = ovkVar2.c;
        if (i < 8192 && ovkVar2.e) {
            j -= i - ovkVar2.b;
        }
        return j;
    }

    @Override // defpackage.out
    public final long h(ouu ouuVar) {
        throw null;
    }

    public final int hashCode() {
        ovk ovkVar = this.a;
        if (ovkVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = ovkVar.c;
            for (int i3 = ovkVar.b; i3 < i2; i3++) {
                i = (i * 31) + ovkVar.a[i3];
            }
            ovkVar = ovkVar.f;
            oll.b(ovkVar);
        } while (ovkVar != this.a);
        return i;
    }

    @Override // defpackage.ovn
    public final void ik(our ourVar, long j) {
        ovk ovkVar;
        ovk a;
        oll.e(ourVar, "source");
        if (ourVar != this) {
            oli.f(ourVar.b, 0L, j);
            while (j > 0) {
                ovk ovkVar2 = ourVar.a;
                oll.b(ovkVar2);
                int i = ovkVar2.c;
                oll.b(ourVar.a);
                int i2 = 0;
                if (j < i - ovkVar.b) {
                    ovk ovkVar3 = this.a;
                    ovk ovkVar4 = ovkVar3 != null ? ovkVar3.g : null;
                    if (ovkVar4 != null && ovkVar4.e) {
                        if ((ovkVar4.c + j) - (ovkVar4.d ? 0 : ovkVar4.b) <= 8192) {
                            ovk ovkVar5 = ourVar.a;
                            oll.b(ovkVar5);
                            ovkVar5.c(ovkVar4, (int) j);
                            ourVar.b -= j;
                            this.b += j;
                            return;
                        }
                    }
                    ovk ovkVar6 = ourVar.a;
                    oll.b(ovkVar6);
                    int i3 = (int) j;
                    if (i3 <= ovkVar6.c - ovkVar6.b) {
                        if (i3 >= 1024) {
                            a = ovkVar6.b();
                        } else {
                            a = ovl.a();
                            byte[] bArr = ovkVar6.a;
                            byte[] bArr2 = a.a;
                            int i4 = ovkVar6.b;
                            nxp.D(bArr, bArr2, i4, i4 + i3);
                        }
                        a.c = a.b + i3;
                        ovkVar6.b += i3;
                        ovk ovkVar7 = ovkVar6.g;
                        oll.b(ovkVar7);
                        ovkVar7.d(a);
                        ourVar.a = a;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range");
                    }
                }
                ovk ovkVar8 = ourVar.a;
                oll.b(ovkVar8);
                long j2 = ovkVar8.c - ovkVar8.b;
                ourVar.a = ovkVar8.a();
                ovk ovkVar9 = this.a;
                if (ovkVar9 == null) {
                    this.a = ovkVar8;
                    ovkVar8.g = ovkVar8;
                    ovkVar8.f = ovkVar8.g;
                } else {
                    ovk ovkVar10 = ovkVar9.g;
                    oll.b(ovkVar10);
                    ovkVar10.d(ovkVar8);
                    ovk ovkVar11 = ovkVar8.g;
                    if (ovkVar11 != ovkVar8) {
                        oll.b(ovkVar11);
                        if (ovkVar11.e) {
                            int i5 = ovkVar8.c - ovkVar8.b;
                            ovk ovkVar12 = ovkVar8.g;
                            oll.b(ovkVar12);
                            int i6 = 8192 - ovkVar12.c;
                            ovk ovkVar13 = ovkVar8.g;
                            oll.b(ovkVar13);
                            if (!ovkVar13.d) {
                                ovk ovkVar14 = ovkVar8.g;
                                oll.b(ovkVar14);
                                i2 = ovkVar14.b;
                            }
                            if (i5 <= i6 + i2) {
                                ovk ovkVar15 = ovkVar8.g;
                                oll.b(ovkVar15);
                                ovkVar8.c(ovkVar15, i5);
                                ovkVar8.a();
                                ovl.b(ovkVar8);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact");
                    }
                }
                ourVar.b -= j2;
                this.b += j2;
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.out
    public final long j(ouu ouuVar) {
        throw null;
    }

    @Override // defpackage.out
    public final InputStream k() {
        return new ovi(this, 1);
    }

    @Override // defpackage.out
    public final String l(Charset charset) {
        oll.e(charset, "charset");
        return m(this.b, charset);
    }

    public final String n() {
        return m(this.b, omo.a);
    }

    public final String o(long j) {
        return m(j, omo.a);
    }

    @Override // defpackage.out
    public final String p() {
        throw null;
    }

    @Override // defpackage.out
    public final String q(long j) {
        throw null;
    }

    public final ouu r() {
        return s(this.b);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        oll.e(byteBuffer, "sink");
        ovk ovkVar = this.a;
        if (ovkVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), ovkVar.c - ovkVar.b);
        byteBuffer.put(ovkVar.a, ovkVar.b, min);
        int i = ovkVar.b + min;
        ovkVar.b = i;
        this.b -= min;
        if (i == ovkVar.c) {
            this.a = ovkVar.a();
            ovl.b(ovkVar);
        }
        return min;
    }

    public final ouu t() {
        long j = this.b;
        if (j > 2147483647L) {
            throw new IllegalStateException("size > Int.MAX_VALUE: " + j);
        }
        return u((int) j);
    }

    public final String toString() {
        return t().toString();
    }

    @Override // defpackage.out
    public final short w() {
        if (this.b < 2) {
            throw new EOFException();
        }
        ovk ovkVar = this.a;
        oll.b(ovkVar);
        int i = ovkVar.b;
        int i2 = ovkVar.c;
        if (i2 - i < 2) {
            return (short) (((d() & 255) << 8) | (d() & 255));
        }
        byte[] bArr = ovkVar.a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
        this.b -= 2;
        if (i4 == i2) {
            this.a = ovkVar.a();
            ovl.b(ovkVar);
        } else {
            ovkVar.b = i4;
        }
        return (short) i5;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        oll.e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            ovk v = v(1);
            int min = Math.min(i, 8192 - v.c);
            byteBuffer.get(v.a, v.c, min);
            i -= min;
            v.c += min;
        }
        this.b += remaining;
        return remaining;
    }

    public final short x() {
        short w = w();
        return (short) (((w & 255) << 8) | ((w >>> 8) & 255));
    }

    public final void y() {
        B(this.b);
    }

    @Override // defpackage.out
    public final void z(byte[] bArr) {
        oll.e(bArr, "sink");
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i < length) {
                int e = e(bArr, i, length - i);
                if (e == -1) {
                    throw new EOFException();
                }
                i += e;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.out
    public final byte[] F(long j) {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException("byteCount: " + j);
        } else if (this.b >= j) {
            byte[] bArr = new byte[(int) j];
            z(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    public final String m(long j, Charset charset) {
        oll.e(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException("byteCount: " + j);
        } else if (this.b < j) {
            throw new EOFException();
        } else {
            if (j == 0) {
                return "";
            }
            ovk ovkVar = this.a;
            oll.b(ovkVar);
            int i = ovkVar.b;
            int i2 = ovkVar.c;
            if (i + j > i2) {
                return new String(F(j), charset);
            }
            int i3 = (int) j;
            String str = new String(ovkVar.a, i, i3, charset);
            int i4 = i + i3;
            ovkVar.b = i4;
            this.b -= j;
            if (i4 == i2) {
                this.a = ovkVar.a();
                ovl.b(ovkVar);
            }
            return str;
        }
    }

    @Override // defpackage.out
    public final ouu s(long j) {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException("byteCount: " + j);
        } else if (this.b < j) {
            throw new EOFException();
        } else {
            if (j >= 4096) {
                ouu u = u((int) j);
                B(j);
                return u;
            }
            return new ouu(F(j));
        }
    }

    public final ovk v(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        ovk ovkVar = this.a;
        if (ovkVar == null) {
            ovk a = ovl.a();
            this.a = a;
            a.g = a;
            a.f = a;
            return a;
        }
        ovk ovkVar2 = ovkVar.g;
        oll.b(ovkVar2);
        if (ovkVar2.c + i <= 8192 && ovkVar2.e) {
            return ovkVar2;
        }
        ovk a2 = ovl.a();
        ovkVar2.d(a2);
        return a2;
    }

    @Override // defpackage.out
    public final void B(long j) {
        while (j > 0) {
            ovk ovkVar = this.a;
            if (ovkVar != null) {
                int min = (int) Math.min(j, ovkVar.c - ovkVar.b);
                long j2 = min;
                this.b -= j2;
                j -= j2;
                int i = ovkVar.b + min;
                ovkVar.b = i;
                if (i == ovkVar.c) {
                    this.a = ovkVar.a();
                    ovl.b(ovkVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final long i(byte b, long j, long j2) {
        ovk ovkVar;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (j3 < 0 || j3 > j4) {
            long j6 = this.b;
            throw new IllegalArgumentException("size=" + j6 + " fromIndex=" + j3 + " toIndex=" + j4);
        }
        long j7 = this.b;
        if (j4 > j7) {
            j4 = j7;
        }
        if (j3 != j4 && (ovkVar = this.a) != null) {
            if (j7 - j3 < j3) {
                while (j7 > j3) {
                    ovkVar = ovkVar.g;
                    oll.b(ovkVar);
                    j7 -= ovkVar.c - ovkVar.b;
                }
                if (ovkVar != null) {
                    while (j7 < j4) {
                        byte[] bArr = ovkVar.a;
                        int min = (int) Math.min(ovkVar.c, (ovkVar.b + j4) - j7);
                        for (int i = (int) ((ovkVar.b + j3) - j7); i < min; i++) {
                            if (bArr[i] == b) {
                                return (i - ovkVar.b) + j7;
                            }
                        }
                        j7 += ovkVar.c - ovkVar.b;
                        ovkVar = ovkVar.f;
                        oll.b(ovkVar);
                        j3 = j7;
                    }
                }
            } else {
                while (true) {
                    long j8 = (ovkVar.c - ovkVar.b) + j5;
                    if (j8 > j3) {
                        break;
                    }
                    ovkVar = ovkVar.f;
                    oll.b(ovkVar);
                    j5 = j8;
                }
                if (ovkVar != null) {
                    while (j5 < j4) {
                        byte[] bArr2 = ovkVar.a;
                        int min2 = (int) Math.min(ovkVar.c, (ovkVar.b + j4) - j5);
                        for (int i2 = (int) ((ovkVar.b + j3) - j5); i2 < min2; i2++) {
                            if (bArr2[i2] == b) {
                                return (i2 - ovkVar.b) + j5;
                            }
                        }
                        j5 += ovkVar.c - ovkVar.b;
                        ovkVar = ovkVar.f;
                        oll.b(ovkVar);
                        j3 = j5;
                    }
                }
            }
        }
        return -1L;
    }

    public final ouu u(int i) {
        if (i != 0) {
            oli.f(this.b, 0L, i);
            ovk ovkVar = this.a;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                oll.b(ovkVar);
                int i5 = ovkVar.c;
                int i6 = ovkVar.b;
                if (i5 != i6) {
                    i3 += i5 - i6;
                    i4++;
                    ovkVar = ovkVar.f;
                } else {
                    throw new AssertionError("s.limit == s.pos");
                }
            }
            byte[][] bArr = new byte[i4];
            int[] iArr = new int[i4 + i4];
            ovk ovkVar2 = this.a;
            int i7 = 0;
            while (i2 < i) {
                oll.b(ovkVar2);
                bArr[i7] = ovkVar2.a;
                i2 += ovkVar2.c - ovkVar2.b;
                iArr[i7] = Math.min(i2, i);
                iArr[bArr.length + i7] = ovkVar2.b;
                ovkVar2.d = true;
                i7++;
                ovkVar2 = ovkVar2.f;
            }
            return new ovm(bArr, iArr);
        }
        return ouu.a;
    }
}
