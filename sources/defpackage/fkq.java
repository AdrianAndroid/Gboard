package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: fkq  reason: default package */
/* loaded from: classes.dex */
public final class fkq extends frw {
    public static final Parcelable.Creator CREATOR = new ahj(14);
    public final String a;
    public final String[] b;

    public fkq(String str, String[] strArr) {
        this.a = str;
        this.b = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.S(parcel, 1, this.a);
        fyb.T(parcel, 2, this.b);
        fyb.E(parcel, C);
    }
}
