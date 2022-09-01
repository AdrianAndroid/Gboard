package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: PG */
/* renamed from: asz  reason: default package */
/* loaded from: classes.dex */
public final class asz extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new ahj(9);
    public boolean a;
    public boolean b;

    public asz(Parcel parcel) {
        super(parcel);
        this.a = ((Boolean) parcel.readValue(null)).booleanValue();
        this.b = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        boolean z = this.a;
        boolean z2 = this.b;
        return "MainSwitchBar.SavedState{" + hexString + " checked=" + z + " visible=" + z2 + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.a));
        parcel.writeValue(Boolean.valueOf(this.b));
    }

    public asz(Parcelable parcelable) {
        super(parcelable);
    }
}
