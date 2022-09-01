package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: gcx  reason: default package */
/* loaded from: classes.dex */
public final class gcx extends frw implements Comparable {
    public static final Parcelable.Creator CREATOR = new gcz(1);
    public final String a;
    final long b;
    final boolean c;
    final double d;
    final String e;
    final byte[] f;
    public final int g;
    public final int h;

    public gcx(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = d;
        this.e = str2;
        this.f = bArr;
        this.g = i;
        this.h = i2;
    }

    private static int g(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i != i2 ? 1 : 0;
    }

    public final double a() {
        if (this.g == 3) {
            return this.d;
        }
        throw new IllegalArgumentException("Not a double type");
    }

    public final long b() {
        if (this.g == 1) {
            return this.b;
        }
        throw new IllegalArgumentException("Not a long type");
    }

    public final String c() {
        if (this.g != 4) {
            throw new IllegalArgumentException("Not a String type");
        }
        String str = this.e;
        fyb.ax(str);
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r9) {
        /*
            r8 = this;
            gcx r9 = (defpackage.gcx) r9
            java.lang.String r0 = r8.a
            java.lang.String r1 = r9.a
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto Le
            goto Lac
        Le:
            int r0 = r8.g
            int r1 = r9.g
            int r1 = g(r0, r1)
            if (r1 == 0) goto L1b
            r0 = r1
            goto Lac
        L1b:
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L9c
            r4 = 2
            if (r0 == r4) goto L91
            r4 = 3
            if (r0 == r4) goto L88
            r4 = 4
            if (r0 == r4) goto L76
            r4 = 5
            if (r0 != r4) goto L62
            byte[] r0 = r8.f
            byte[] r4 = r9.f
            if (r0 != r4) goto L34
            goto L97
        L34:
            if (r0 != 0) goto L38
            goto La4
        L38:
            if (r4 != 0) goto L3c
            goto Lab
        L3c:
            byte[] r0 = r8.f
            int r0 = r0.length
            byte[] r1 = r9.f
            int r1 = r1.length
            int r0 = java.lang.Math.min(r0, r1)
            if (r2 >= r0) goto L57
            byte[] r0 = r8.f
            r0 = r0[r2]
            byte[] r1 = r9.f
            r1 = r1[r2]
            int r0 = r0 - r1
            if (r0 == 0) goto L54
            goto Lac
        L54:
            int r2 = r2 + 1
            goto L3c
        L57:
            byte[] r0 = r8.f
            int r0 = r0.length
            byte[] r9 = r9.f
            int r9 = r9.length
            int r0 = g(r0, r9)
            goto Lac
        L62:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid enum value: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r9.<init>(r0)
            throw r9
        L76:
            java.lang.String r0 = r8.e
            java.lang.String r9 = r9.e
            if (r0 != r9) goto L7d
            goto L97
        L7d:
            if (r0 != 0) goto L80
            goto La4
        L80:
            if (r9 != 0) goto L83
            goto Lab
        L83:
            int r0 = r0.compareTo(r9)
            goto Lac
        L88:
            double r0 = r8.d
            double r2 = r9.d
            int r0 = java.lang.Double.compare(r0, r2)
            goto Lac
        L91:
            boolean r0 = r8.c
            boolean r9 = r9.c
            if (r0 != r9) goto L99
        L97:
            r0 = 0
            goto Lac
        L99:
            if (r0 == 0) goto La4
            goto Lab
        L9c:
            long r4 = r8.b
            long r6 = r9.b
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto La6
        La4:
            r0 = -1
            goto Lac
        La6:
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto Lab
            goto L97
        Lab:
            r0 = 1
        Lac:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gcx.compareTo(java.lang.Object):int");
    }

    public final String d(StringBuilder sb) {
        sb.append("Flag(");
        sb.append(this.a);
        sb.append(", ");
        int i = this.g;
        if (i == 1) {
            sb.append(this.b);
        } else if (i == 2) {
            sb.append(this.c);
        } else if (i == 3) {
            sb.append(this.d);
        } else if (i == 4) {
            sb.append("'");
            String str = this.e;
            fyb.ax(str);
            sb.append(str);
            sb.append("'");
        } else if (i == 5) {
            sb.append("'");
            sb.append(Base64.encodeToString((byte[]) fyb.ax(this.f), 3));
            sb.append("'");
        } else {
            String str2 = this.a;
            throw new AssertionError("Invalid type: " + str2 + ", " + i);
        }
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    public final boolean e() {
        if (this.g == 2) {
            return this.c;
        }
        throw new IllegalArgumentException("Not a boolean type");
    }

    public final boolean equals(Object obj) {
        int i;
        if (obj instanceof gcx) {
            gcx gcxVar = (gcx) obj;
            if (gjz.d(this.a, gcxVar.a) && (i = this.g) == gcxVar.g && this.h == gcxVar.h) {
                if (i != 1) {
                    if (i == 2) {
                        return this.c == gcxVar.c;
                    } else if (i == 3) {
                        return this.d == gcxVar.d;
                    } else if (i == 4) {
                        return gjz.d(this.e, gcxVar.e);
                    } else {
                        if (i == 5) {
                            return Arrays.equals(this.f, gcxVar.f);
                        }
                        throw new AssertionError("Invalid enum value: " + i);
                    }
                } else if (this.b == gcxVar.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final byte[] f() {
        if (this.g != 5) {
            throw new IllegalArgumentException("Not a bytes type");
        }
        return (byte[]) fyb.ax(this.f);
    }

    public final String toString() {
        return d(new StringBuilder());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        String str = this.a;
        if (!gcz.b(str)) {
            fyb.S(parcel, 2, str);
        }
        long j = this.b;
        if (j != 0) {
            fyb.J(parcel, 3, j);
        }
        if (this.c) {
            fyb.F(parcel, 4, true);
        }
        double d = this.d;
        if (d != 0.0d) {
            fyb.H(parcel, 5, 8);
            parcel.writeDouble(d);
        }
        String str2 = this.e;
        if (!gcz.b(str2)) {
            fyb.S(parcel, 6, str2);
        }
        byte[] bArr = this.f;
        if (!gcz.b(bArr)) {
            fyb.L(parcel, 7, bArr);
        }
        int i2 = this.g;
        if (!gcz.a(i2)) {
            fyb.I(parcel, 8, i2);
        }
        int i3 = this.h;
        if (!gcz.a(i3)) {
            fyb.I(parcel, 9, i3);
        }
        fyb.E(parcel, C);
    }
}
