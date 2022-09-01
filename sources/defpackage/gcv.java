package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: gcv  reason: default package */
/* loaded from: classes.dex */
public final class gcv extends frw {
    public static final Parcelable.Creator CREATOR = new fuo(20);
    public final String a;
    public final byte[] b;
    public final byte[][] c;
    public final byte[][] d;
    public final byte[][] e;
    public final byte[][] f;
    public final int[] g;
    public final byte[][] h;
    public final int[] i;

    public gcv(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2) {
        this.a = str;
        this.b = bArr;
        this.c = bArr2;
        this.d = bArr3;
        this.e = bArr4;
        this.f = bArr5;
        this.g = iArr;
        this.h = bArr6;
        this.i = iArr2;
    }

    private static List a(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static List b(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte[] bArr2 : bArr) {
            fyb.ax(bArr2);
            arrayList.add(Base64.encodeToString(bArr2, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static List c(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new gdb(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void d(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        int length = bArr.length;
        boolean z = true;
        int i = 0;
        while (i < length) {
            byte[] bArr2 = bArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            fyb.ax(bArr2);
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i++;
            z = false;
        }
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gcv) {
            gcv gcvVar = (gcv) obj;
            if (gjz.d(this.a, gcvVar.a) && Arrays.equals(this.b, gcvVar.b) && gjz.d(b(this.c), b(gcvVar.c)) && gjz.d(b(this.d), b(gcvVar.d)) && gjz.d(b(this.e), b(gcvVar.e)) && gjz.d(b(this.f), b(gcvVar.f)) && gjz.d(a(this.g), a(gcvVar.g)) && gjz.d(b(this.h), b(gcvVar.h)) && gjz.d(c(this.i), c(gcvVar.i))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str2 = this.a;
        if (str2 == null) {
            str = "null";
        } else {
            str = "'" + str2 + "'";
        }
        sb.append(str);
        byte[] bArr = this.b;
        sb.append(", direct==");
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        d(sb, "GAIA=", this.c);
        sb.append(", ");
        d(sb, "PSEUDO=", this.d);
        sb.append(", ");
        d(sb, "ALWAYS=", this.e);
        sb.append(", ");
        d(sb, "OTHER=", this.f);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.g));
        sb.append(", ");
        d(sb, "directs=", this.h);
        sb.append(", genDims=");
        sb.append(Arrays.toString(c(this.i).toArray()));
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.S(parcel, 2, this.a);
        fyb.L(parcel, 3, this.b);
        fyb.M(parcel, 4, this.c);
        fyb.M(parcel, 5, this.d);
        fyb.M(parcel, 6, this.e);
        fyb.M(parcel, 7, this.f);
        fyb.O(parcel, 8, this.g);
        fyb.M(parcel, 9, this.h);
        fyb.O(parcel, 10, this.i);
        fyb.E(parcel, C);
    }
}
