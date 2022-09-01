package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: PG */
/* renamed from: ix  reason: default package */
/* loaded from: classes.dex */
public final class ix extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new u(16);
    boolean a;

    public ix(Parcel parcel) {
        super(parcel);
        this.a = parcel.readByte() != 0;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
    }

    public ix(Parcelable parcelable) {
        super(parcelable);
    }
}
