package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: gct  reason: default package */
/* loaded from: classes.dex */
public final class gct extends frw {
    public static final Parcelable.Creator CREATOR = new fuo(18);
    public final String a;
    public final byte[] b;
    public final String c;
    public final gcs[] d;
    public final Map e = new TreeMap();
    public final boolean f;
    public final long g;

    public gct(String str, String str2, gcs[] gcsVarArr, boolean z, byte[] bArr, long j) {
        this.a = str;
        this.c = str2;
        this.d = gcsVarArr;
        this.f = z;
        this.b = bArr;
        this.g = j;
        for (gcs gcsVar : gcsVarArr) {
            this.e.put(Integer.valueOf(gcsVar.a), gcsVar);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gct) {
            gct gctVar = (gct) obj;
            if (gjz.d(this.a, gctVar.a) && gjz.d(this.c, gctVar.c) && this.e.equals(gctVar.e) && this.f == gctVar.f && Arrays.equals(this.b, gctVar.b) && this.g == gctVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.e, Boolean.valueOf(this.f), this.b, Long.valueOf(this.g)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configurations('");
        sb.append(this.a);
        sb.append("', '");
        sb.append(this.c);
        sb.append("', (");
        for (gcs gcsVar : this.e.values()) {
            sb.append(gcsVar);
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.f);
        sb.append(", ");
        byte[] bArr = this.b;
        sb.append(bArr == null ? "null" : Base64.encodeToString(bArr, 3));
        sb.append(", ");
        sb.append(this.g);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.S(parcel, 2, this.a);
        fyb.S(parcel, 3, this.c);
        fyb.V(parcel, 4, this.d, i);
        fyb.F(parcel, 5, this.f);
        fyb.L(parcel, 6, this.b);
        fyb.J(parcel, 7, this.g);
        fyb.E(parcel, C);
    }
}
