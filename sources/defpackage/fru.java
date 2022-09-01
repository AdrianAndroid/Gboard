package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* renamed from: fru  reason: default package */
/* loaded from: classes.dex */
public final class fru extends frw {
    public static final Parcelable.Creator CREATOR = new fmq(18);
    public final int a;
    public List b;

    public fru(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.I(parcel, 1, this.a);
        fyb.W(parcel, 2, this.b);
        fyb.E(parcel, C);
    }
}
