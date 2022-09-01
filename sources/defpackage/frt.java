package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: frt  reason: default package */
/* loaded from: classes.dex */
public final class frt extends frw {
    public static final Parcelable.Creator CREATOR = new fmq(17);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public frt(int i, boolean z, boolean z2, int i2, int i3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.I(parcel, 1, this.a);
        fyb.F(parcel, 2, this.b);
        fyb.F(parcel, 3, this.c);
        fyb.I(parcel, 4, this.d);
        fyb.I(parcel, 5, this.e);
        fyb.E(parcel, C);
    }
}
