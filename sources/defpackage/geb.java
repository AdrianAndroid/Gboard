package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: geb  reason: default package */
/* loaded from: classes.dex */
public final class geb extends frw {
    public static final Parcelable.Creator CREATOR = new gcz(7);
    final int a;
    final frq b;

    public geb(int i, frq frqVar) {
        this.a = i;
        this.b = frqVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.I(parcel, 1, this.a);
        fyb.R(parcel, 2, this.b, i);
        fyb.E(parcel, C);
    }
}
