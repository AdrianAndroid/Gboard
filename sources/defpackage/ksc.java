package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: ksc  reason: default package */
/* loaded from: classes.dex */
public final class ksc extends acy {
    public static final Parcelable.Creator CREATOR = new ksv(1);
    public boolean a;
    public boolean b;
    public int e;
    public float f;
    public boolean g;

    public ksc(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z = true;
        this.a = parcel.readByte() != 0;
        this.b = parcel.readByte() != 0;
        this.e = parcel.readInt();
        this.f = parcel.readFloat();
        this.g = parcel.readByte() == 0 ? false : z;
    }

    @Override // defpackage.acy, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.e);
        parcel.writeFloat(this.f);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
    }

    public ksc(Parcelable parcelable) {
        super(parcelable);
    }
}
