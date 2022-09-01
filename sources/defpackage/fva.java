package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: fva  reason: default package */
/* loaded from: classes.dex */
public final class fva extends frw {
    public static final Parcelable.Creator CREATOR = new fuo(7);
    final String a;
    final String b;
    final String c;
    final String d;

    public fva(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str4;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.S(parcel, 2, this.a);
        fyb.S(parcel, 3, this.b);
        fyb.S(parcel, 4, this.c);
        fyb.S(parcel, 5, this.d);
        fyb.E(parcel, C);
    }
}
