package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: ktf  reason: default package */
/* loaded from: classes.dex */
public final class ktf extends acy {
    public static final Parcelable.Creator CREATOR = new ksv(2);
    public boolean a;

    public ktf(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            getClass().getClassLoader();
        }
        this.a = parcel.readInt() != 1 ? false : true;
    }

    @Override // defpackage.acy, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a ? 1 : 0);
    }

    public ktf(Parcelable parcelable) {
        super(parcelable);
    }
}
