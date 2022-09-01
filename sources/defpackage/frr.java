package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: frr  reason: default package */
/* loaded from: classes.dex */
public final class frr extends frw {
    public static final Parcelable.Creator CREATOR = new fmq(16);
    final int a;
    final IBinder b;
    public final fmt c;
    public final boolean d;
    public final boolean e;

    public frr(int i, IBinder iBinder, fmt fmtVar, boolean z, boolean z2) {
        this.a = i;
        this.b = iBinder;
        this.c = fmtVar;
        this.d = z;
        this.e = z2;
    }

    public final frg a() {
        IBinder iBinder = this.b;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        return queryLocalInterface instanceof frg ? (frg) queryLocalInterface : new frg(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frr)) {
            return false;
        }
        frr frrVar = (frr) obj;
        return this.c.equals(frrVar.c) && fyb.aJ(a(), frrVar.a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.I(parcel, 1, this.a);
        fyb.N(parcel, 2, this.b);
        fyb.R(parcel, 3, this.c, i);
        fyb.F(parcel, 4, this.d);
        fyb.F(parcel, 5, this.e);
        fyb.E(parcel, C);
    }
}
