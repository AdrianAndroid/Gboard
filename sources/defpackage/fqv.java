package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: fqv  reason: default package */
/* loaded from: classes.dex */
public final class fqv extends frw {
    public static final Parcelable.Creator CREATOR = new fmq(12);
    public final frt a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;

    public fqv(frt frtVar, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.a = frtVar;
        this.b = z;
        this.c = z2;
        this.d = iArr;
        this.e = i;
        this.f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.R(parcel, 1, this.a, i);
        fyb.F(parcel, 2, this.b);
        fyb.F(parcel, 3, this.c);
        fyb.O(parcel, 4, this.d);
        fyb.I(parcel, 5, this.e);
        fyb.O(parcel, 6, this.f);
        fyb.E(parcel, C);
    }
}
