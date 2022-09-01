package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: aii  reason: default package */
/* loaded from: classes.dex */
public final class aii extends aht {
    public static final Parcelable.Creator CREATOR = new ahj(5);
    public final int a;

    public aii(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }

    public aii(Parcelable parcelable, int i) {
        super(parcelable);
        this.a = i;
    }
}
