package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: gpo  reason: default package */
/* loaded from: classes.dex */
public final class gpo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new gcz(18);
    public final float a;
    public final float b;
    public final long c;
    public final float d;

    public gpo(float f, float f2, long j, float f3) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = f3;
    }

    public gpo(Parcel parcel) {
        this.a = parcel.readFloat();
        this.b = parcel.readFloat();
        this.c = parcel.readLong();
        this.d = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format("(%s, %s)", Float.valueOf(this.a), Float.valueOf(this.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
        parcel.writeLong(this.c);
        parcel.writeFloat(this.d);
    }
}
