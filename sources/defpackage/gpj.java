package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: gpj  reason: default package */
/* loaded from: classes.dex */
public final class gpj implements Parcelable {
    public static final Parcelable.Creator CREATOR = new gcz(13);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public gpj(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }

    public gpj(int[] iArr) {
        this.a = iArr[0];
        this.b = iArr[1];
        this.c = iArr[2];
        this.d = iArr[3];
    }
}
