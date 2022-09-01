package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: icd  reason: default package */
/* loaded from: classes.dex */
public final class icd implements Parcelable {
    public static final Parcelable.Creator CREATOR = new icc(0);
    public final String a;
    public final String b;
    public final boolean c;
    private volatile int d;

    public icd(Parcel parcel) {
        this.d = Integer.MAX_VALUE;
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = kki.E(parcel);
        this.d = parcel.readInt();
    }

    public icd(String str, String str2, boolean z) {
        this.d = Integer.MAX_VALUE;
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final int a() {
        if (this.d == Integer.MAX_VALUE) {
            int length = this.a.getBytes().length + 5;
            String str = this.b;
            if (str != null) {
                length += str.getBytes().length;
            }
            this.d = length;
        }
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("className", this.a);
        S.b("preferenceKey", this.b);
        S.h("reversePreference", this.c);
        return S.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(a());
    }
}
