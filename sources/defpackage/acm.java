package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: PG */
/* renamed from: acm  reason: default package */
/* loaded from: classes.dex */
public final class acm extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new ahj(1);
    public int a;

    public acm(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
    }

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.a + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }

    public acm(Parcelable parcelable) {
        super(parcelable);
    }
}
