package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: dnh  reason: default package */
/* loaded from: classes.dex */
public final class dnh extends aht {
    public static final Parcelable.Creator CREATOR = new ahj(10);
    public final Parcelable a;

    public dnh(Parcel parcel) {
        super(parcel);
        this.a = parcel.readParcelable(ly.class.getClassLoader());
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.a, 0);
    }

    public dnh(Parcelable parcelable, Parcelable parcelable2) {
        super(parcelable);
        this.a = parcelable2;
    }
}
