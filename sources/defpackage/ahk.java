package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: ahk  reason: default package */
/* loaded from: classes.dex */
public final class ahk extends aht {
    public static final Parcelable.Creator CREATOR = new ahj(0);
    public String a;

    public ahk(Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
    }

    public ahk(Parcelable parcelable) {
        super(parcelable);
    }
}
