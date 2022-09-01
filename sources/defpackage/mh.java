package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: mh  reason: default package */
/* loaded from: classes.dex */
public final class mh extends acy {
    public static final Parcelable.Creator CREATOR = new nf(1);
    public Parcelable a;

    public mh(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readParcelable(classLoader == null ? ly.class.getClassLoader() : classLoader);
    }

    @Override // defpackage.acy, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.a, 0);
    }

    public mh(Parcelable parcelable) {
        super(parcelable);
    }
}
