package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: gpl  reason: default package */
/* loaded from: classes.dex */
public final class gpl implements Parcelable {
    public static final Parcelable.Creator CREATOR = new gcz(15);
    public final gpk[] a;

    public gpl(Parcel parcel) {
        gpk[] gpkVarArr = new gpk[parcel.readInt()];
        this.a = gpkVarArr;
        parcel.readTypedArray(gpkVarArr, gpk.CREATOR);
    }

    public final int a() {
        return this.a.length;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.length);
        parcel.writeTypedArray(this.a, 0);
    }

    public gpl(String[] strArr, int[][][] iArr) {
        int length = strArr.length;
        this.a = new gpk[length];
        for (int i = 0; i < length; i++) {
            this.a[i] = new gpk(strArr[i], iArr[i]);
        }
    }
}
