package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: aiy  reason: default package */
/* loaded from: classes.dex */
public final class aiy extends aht {
    public static final Parcelable.Creator CREATOR = new ahj(7);
    public boolean a;

    public aiy(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt() != 1 ? false : true;
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a ? 1 : 0);
    }

    public aiy(Parcelable parcelable) {
        super(parcelable);
    }
}
