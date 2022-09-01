package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BitmapTeleporter extends frw implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new fmq(9);
    final int a;
    ParcelFileDescriptor b;
    final int c;

    public BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.a = i;
        this.b = parcelFileDescriptor;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.b != null) {
            int C = fyb.C(parcel);
            fyb.I(parcel, 1, this.a);
            fyb.R(parcel, 2, this.b, i | 1);
            fyb.I(parcel, 3, this.c);
            fyb.E(parcel, C);
            this.b = null;
            return;
        }
        fyb.ax(null);
        throw null;
    }
}
