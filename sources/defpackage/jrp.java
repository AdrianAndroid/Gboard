package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: jrp  reason: default package */
/* loaded from: classes.dex */
public abstract class jrp implements Parcelable {
    public static final jrp a = d(0, 1);
    public static final Parcelable.Creator CREATOR = new icc(11);

    public static jrp d(int i, int i2) {
        return new jrf(i, i2);
    }

    public static void e(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException("Invalid priority value:" + i);
    }

    public abstract int a();

    public abstract int b();

    public final int c(int i) {
        return a() != 0 ? i : b() + i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public String toString() {
        String str = a() == 1 ? "absolute:" : "relative:";
        int b = b();
        return "{" + str + b + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(b());
        parcel.writeInt(a());
    }
}
