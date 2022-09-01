package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: ny  reason: default package */
/* loaded from: classes2.dex */
public final class ny extends acy {
    public static final Parcelable.Creator CREATOR = new nf(2);
    public int a;
    public boolean b;

    public ny(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
        this.b = parcel.readInt() != 0;
    }

    @Override // defpackage.acy, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }

    public ny(Parcelable parcelable) {
        super(parcelable);
    }
}
