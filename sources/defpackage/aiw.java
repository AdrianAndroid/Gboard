package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: aiw  reason: default package */
/* loaded from: classes.dex */
public final class aiw extends aht {
    public static final Parcelable.Creator CREATOR = new ahj(6);
    public int a;
    public int b;
    public int c;

    public aiw(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    public aiw(Parcelable parcelable) {
        super(parcelable);
    }
}
