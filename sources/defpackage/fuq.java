package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: fuq  reason: default package */
/* loaded from: classes.dex */
public final class fuq extends frw {
    public static final Parcelable.Creator CREATOR = new fuo(3);
    public int a;
    int b;

    public fuq() {
        this(3, 0);
    }

    public fuq(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.I(parcel, 2, this.a);
        fyb.I(parcel, 3, this.b);
        fyb.E(parcel, C);
    }
}
