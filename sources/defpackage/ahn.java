package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: ahn  reason: default package */
/* loaded from: classes.dex */
public final class ahn extends aht {
    public static final Parcelable.Creator CREATOR = new ahj(2);
    public String a;

    public ahn(Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
    }

    public ahn(Parcelable parcelable) {
        super(parcelable);
    }
}
