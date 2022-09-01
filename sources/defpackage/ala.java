package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: PG */
/* renamed from: ala  reason: default package */
/* loaded from: classes.dex */
public final class ala extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new wz();
    int a;
    Parcelable b;
    ClassLoader c;

    public ala(Parcel parcel, ClassLoader classLoader) {
        super(parcel);
        classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
        this.a = parcel.readInt();
        this.b = parcel.readParcelable(classLoader);
        this.c = classLoader;
    }

    public final String toString() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int i = this.a;
        return "FragmentPager.SavedState{" + hexString + " position=" + i + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
    }

    public ala(Parcelable parcelable) {
        super(parcelable);
    }
}
