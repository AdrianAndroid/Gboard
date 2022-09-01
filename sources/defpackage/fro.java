package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: fro  reason: default package */
/* loaded from: classes.dex */
public final class fro extends frw {
    public static final Parcelable.Creator CREATOR = new fmq(14);
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;

    public fro(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.h = i4;
        this.i = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.I(parcel, 1, this.a);
        fyb.I(parcel, 2, this.b);
        fyb.I(parcel, 3, this.c);
        fyb.J(parcel, 4, this.d);
        fyb.J(parcel, 5, this.e);
        fyb.S(parcel, 6, this.f);
        fyb.S(parcel, 7, this.g);
        fyb.I(parcel, 8, this.h);
        fyb.I(parcel, 9, this.i);
        fyb.E(parcel, C);
    }
}
