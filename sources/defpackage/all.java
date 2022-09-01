package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: all  reason: default package */
/* loaded from: classes.dex */
public final class all extends acy {
    public static final Parcelable.Creator CREATOR = new nf(5);
    public int a;
    public Parcelable b;
    public ClassLoader e;

    public all(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
        this.a = parcel.readInt();
        this.b = parcel.readParcelable(classLoader);
        this.e = classLoader;
    }

    public final String toString() {
        return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.a + "}";
    }

    @Override // defpackage.acy, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
    }

    public all(Parcelable parcelable) {
        super(parcelable);
    }
}
