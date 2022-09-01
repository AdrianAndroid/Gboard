package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: gcy  reason: default package */
/* loaded from: classes.dex */
public final class gcy extends frw {
    public static final Parcelable.Creator CREATOR = new gcz(0);
    public final String a;
    public final String b;
    public final gcx c;
    public final boolean d;

    public gcy(String str, String str2, gcx gcxVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = gcxVar;
        this.d = z;
    }

    public final String a(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        this.c.d(sb);
        sb.append(", ");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcy)) {
            return false;
        }
        gcy gcyVar = (gcy) obj;
        return gjz.d(this.a, gcyVar.a) && gjz.d(this.b, gcyVar.b) && gjz.d(this.c, gcyVar.c) && this.d == gcyVar.d;
    }

    public final String toString() {
        return a(new StringBuilder());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.S(parcel, 2, this.a);
        fyb.S(parcel, 3, this.b);
        fyb.R(parcel, 4, this.c, i);
        fyb.F(parcel, 5, this.d);
        fyb.E(parcel, C);
    }
}
