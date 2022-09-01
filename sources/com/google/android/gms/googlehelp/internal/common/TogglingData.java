package com.google.android.gms.googlehelp.internal.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TogglingData extends frw implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new fuo(9);
    String a;
    String b;
    public String c;

    private TogglingData() {
    }

    public TogglingData(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.S(parcel, 2, this.a);
        fyb.S(parcel, 3, this.b);
        fyb.S(parcel, 4, this.c);
        fyb.E(parcel, C);
    }
}
