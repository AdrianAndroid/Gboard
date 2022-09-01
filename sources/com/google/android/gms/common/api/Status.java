package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Status extends frw implements ReflectedParcelable, foi {
    final int e;
    public final int f;
    public final String g;
    public final PendingIntent h;
    public final fmt i;
    public static final Status a = new Status(0);
    public static final Status b = new Status(14);
    public static final Status c = new Status(8);
    public static final Status d = new Status(15);
    public static final Parcelable.Creator CREATOR = new fmq(8);

    public Status(int i) {
        this(i, null);
    }

    public Status(int i, int i2, String str, PendingIntent pendingIntent, fmt fmtVar) {
        this.e = i;
        this.f = i2;
        this.g = str;
        this.h = pendingIntent;
        this.i = fmtVar;
    }

    public final boolean a() {
        return this.f <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.e == status.e && this.f == status.f && fyb.aJ(this.g, status.g) && fyb.aJ(this.h, status.h) && fyb.aJ(this.i, status.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.e), Integer.valueOf(this.f), this.g, this.h, this.i});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.g;
        if (str == null) {
            str = fgy.e(this.f);
        }
        fyb.aL("statusCode", str, arrayList);
        fyb.aL("resolution", this.h, arrayList);
        return fyb.aK(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.I(parcel, 1, this.f);
        fyb.S(parcel, 2, this.g);
        fyb.R(parcel, 3, this.h, i);
        fyb.R(parcel, 4, this.i, i);
        fyb.I(parcel, 1000, this.e);
        fyb.E(parcel, C);
    }

    public Status(int i, String str, byte[] bArr) {
        this(1, i, str, null, null);
    }

    public Status(int i, String str) {
        this(i, str, null);
    }
}
