package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: fup  reason: default package */
/* loaded from: classes.dex */
public final class fup extends frw {
    public static final Parcelable.Creator CREATOR = new fuo(2);
    final String a;
    final boolean b;
    final boolean c;
    final boolean d;
    final boolean e;

    public fup(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.S(parcel, 2, this.a);
        fyb.F(parcel, 3, this.b);
        fyb.F(parcel, 4, this.c);
        fyb.F(parcel, 5, this.d);
        fyb.F(parcel, 6, this.e);
        fyb.E(parcel, C);
    }
}
