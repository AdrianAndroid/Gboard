package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: mnw  reason: default package */
/* loaded from: classes2.dex */
public final class mnw extends frw {
    public static final Parcelable.Creator CREATOR = new icc(19);
    public final String a;

    public mnw(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.S(parcel, 2, this.a);
        fyb.E(parcel, C);
    }
}
