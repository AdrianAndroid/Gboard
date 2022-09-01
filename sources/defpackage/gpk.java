package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: gpk  reason: default package */
/* loaded from: classes.dex */
public final class gpk implements Parcelable {
    public static final Parcelable.Creator CREATOR = new gcz(14);
    final String a;
    public final gpj[] b;

    public gpk(Parcel parcel) {
        this.a = parcel.readString();
        gpj[] gpjVarArr = new gpj[parcel.readInt()];
        this.b = gpjVarArr;
        parcel.readTypedArray(gpjVarArr, gpj.CREATOR);
    }

    public final int a() {
        return this.b.length;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b.length);
        parcel.writeTypedArray(this.b, 0);
    }

    public gpk(String str, int[][] iArr) {
        this.a = str;
        int length = iArr.length;
        this.b = new gpj[length];
        for (int i = 0; i < length; i++) {
            this.b[i] = new gpj(iArr[i]);
        }
    }
}
