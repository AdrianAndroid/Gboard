package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: jen  reason: default package */
/* loaded from: classes.dex */
public final class jen implements Parcelable {
    public static final Parcelable.Creator CREATOR = new icc(5);
    public final byte[] a;

    public jen(Parcel parcel) {
        byte[] bArr = new byte[parcel.readInt()];
        this.a = bArr;
        parcel.readByteArray(bArr);
    }

    public jen(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.length);
        parcel.writeByteArray(this.a);
    }
}
