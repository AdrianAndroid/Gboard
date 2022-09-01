package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* renamed from: gdz  reason: default package */
/* loaded from: classes.dex */
public final class gdz extends frw implements foi {
    public static final Parcelable.Creator CREATOR = new gcz(6);
    public final List a;
    public final String b;

    public gdz(List list, String str) {
        this.a = list;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.U(parcel, 1, this.a);
        fyb.S(parcel, 2, this.b);
        fyb.E(parcel, C);
    }
}
