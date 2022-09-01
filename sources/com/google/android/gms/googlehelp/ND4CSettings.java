package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ND4CSettings extends frw implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new fuo(6);
    boolean a;
    String b;

    public ND4CSettings() {
        this(true, "");
    }

    public ND4CSettings(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.F(parcel, 2, this.a);
        fyb.S(parcel, 3, this.b);
        fyb.E(parcel, C);
    }
}
