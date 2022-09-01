package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: PG */
/* renamed from: amg  reason: default package */
/* loaded from: classes.dex */
public final class amg extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new nf(6);
    public int a;
    public int b;
    public Parcelable c;

    public amg(Parcel parcel) {
        super(parcel);
        a(parcel, null);
    }

    private final void a(Parcel parcel, ClassLoader classLoader) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readParcelable(classLoader);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, i);
    }

    public amg(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        a(parcel, classLoader);
    }

    public amg(Parcelable parcelable) {
        super(parcelable);
    }
}
