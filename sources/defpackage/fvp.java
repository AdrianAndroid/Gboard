package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: fvp  reason: default package */
/* loaded from: classes.dex */
public final class fvp extends frw {
    public static final Parcelable.Creator CREATOR = new fuo(8);
    final int a;
    final String b;
    final Intent c;

    public fvp(int i, String str, Intent intent) {
        this.a = i;
        this.b = str;
        this.c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.I(parcel, 2, this.a);
        fyb.S(parcel, 3, this.b);
        fyb.R(parcel, 4, this.c, i);
        fyb.E(parcel, C);
    }
}
