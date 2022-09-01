package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: fni  reason: default package */
/* loaded from: classes.dex */
public final class fni extends frw {
    public static final Parcelable.Creator CREATOR = new fmq(5);
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;

    public fni(boolean z, String str, int i, int i2) {
        this.a = z;
        this.b = str;
        this.c = ffb.c(i) - 1;
        this.d = ffb.d(i2) - 1;
    }

    public final int a() {
        return ffb.c(this.c);
    }

    public final void b() {
        ffb.d(this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.F(parcel, 1, this.a);
        fyb.S(parcel, 2, this.b);
        fyb.I(parcel, 3, this.c);
        fyb.I(parcel, 4, this.d);
        fyb.E(parcel, C);
    }
}
