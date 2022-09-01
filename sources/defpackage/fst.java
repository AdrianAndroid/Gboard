package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: fst  reason: default package */
/* loaded from: classes.dex */
public final class fst implements Parcelable {
    public static final Parcelable.Creator CREATOR = new fmq(20);
    public final ParcelFileDescriptor a;
    public final Parcelable b;

    public fst(ParcelFileDescriptor parcelFileDescriptor, Parcelable parcelable) {
        this.a = parcelFileDescriptor;
        this.b = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 0;
        int i2 = this.a != null ? 1 : 0;
        Parcelable parcelable = this.b;
        if (parcelable != null) {
            i = parcelable.describeContents();
        }
        return i2 | i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
