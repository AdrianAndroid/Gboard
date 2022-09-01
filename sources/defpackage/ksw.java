package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* renamed from: ksw  reason: default package */
/* loaded from: classes.dex */
public final class ksw extends acy {
    public static final Parcelable.Creator CREATOR = new ksv(0);
    public final int a;
    public final int b;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public ksw(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        boolean z = false;
        this.e = parcel.readInt() == 1;
        this.f = parcel.readInt() == 1;
        this.g = parcel.readInt() == 1 ? true : z;
    }

    @Override // defpackage.acy, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
    }

    public ksw(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
        super(parcelable);
        this.a = bottomSheetBehavior.w;
        this.b = bottomSheetBehavior.b;
        this.e = bottomSheetBehavior.a;
        this.f = bottomSheetBehavior.t;
        this.g = bottomSheetBehavior.u;
    }
}
