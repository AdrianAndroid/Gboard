package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: flh  reason: default package */
/* loaded from: classes.dex */
public final class flh extends frw {
    public static final Parcelable.Creator CREATOR = new ahj(17);
    final int a;
    public String b;

    public flh() {
        this.a = 1;
    }

    public flh(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.I(parcel, 1, this.a);
        fyb.S(parcel, 2, this.b);
        fyb.E(parcel, C);
    }
}
