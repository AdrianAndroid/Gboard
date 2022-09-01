package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: gdw  reason: default package */
/* loaded from: classes.dex */
public final class gdw extends frw implements foi {
    public static final Parcelable.Creator CREATOR = new gcz(5);
    final int a;
    public int b;
    public Intent c;

    public gdw() {
        this(2, 0, null);
    }

    public gdw(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.I(parcel, 1, this.a);
        fyb.I(parcel, 2, this.b);
        fyb.R(parcel, 3, this.c, i);
        fyb.E(parcel, C);
    }
}
