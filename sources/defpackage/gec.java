package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: gec  reason: default package */
/* loaded from: classes.dex */
public final class gec extends frw {
    public static final Parcelable.Creator CREATOR = new gcz(8);
    final int a;
    public final fmt b;
    public final frr c;

    public gec(int i, fmt fmtVar, frr frrVar) {
        this.a = i;
        this.b = fmtVar;
        this.c = frrVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.I(parcel, 1, this.a);
        fyb.R(parcel, 2, this.b, i);
        fyb.R(parcel, 3, this.c, i);
        fyb.E(parcel, C);
    }
}
