package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: ng  reason: default package */
/* loaded from: classes2.dex */
public final class ng extends acy {
    public static final Parcelable.Creator CREATOR = new nf(0);
    public boolean a;

    public ng(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.a + "}";
    }

    @Override // defpackage.acy, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.a));
    }

    public ng(Parcelable parcelable) {
        super(parcelable);
    }
}
