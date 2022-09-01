package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: kyk  reason: default package */
/* loaded from: classes.dex */
public final class kyk extends acy {
    public static final Parcelable.Creator CREATOR = new ksv(4);
    public final qv a;

    public kyk(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.a = new qv(readInt);
        for (int i = 0; i < readInt; i++) {
            this.a.put(strArr[i], bundleArr[i]);
        }
    }

    public final String toString() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String obj = this.a.toString();
        return "ExtendableSavedState{" + hexString + " states=" + obj + "}";
    }

    @Override // defpackage.acy, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int i2 = this.a.d;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = (String) this.a.c(i3);
            bundleArr[i3] = (Bundle) this.a.f(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public kyk(Parcelable parcelable) {
        super(parcelable);
        this.a = new qv();
    }
}
