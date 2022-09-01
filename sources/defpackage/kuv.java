package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: kuv  reason: default package */
/* loaded from: classes.dex */
public final class kuv extends acy {
    public static final Parcelable.Creator CREATOR = new ksv(3);
    public boolean a;

    public kuv(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt() != 1 ? false : true;
    }

    @Override // defpackage.acy, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a ? 1 : 0);
    }

    public kuv(Parcelable parcelable) {
        super(parcelable);
    }
}
