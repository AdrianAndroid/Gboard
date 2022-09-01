package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: fqu  reason: default package */
/* loaded from: classes.dex */
public final class fqu extends frw {
    public static final Parcelable.Creator CREATOR = new fmq(11);
    Bundle a;
    fmv[] b;
    int c;
    public fqv d;

    public fqu() {
    }

    public fqu(Bundle bundle, fmv[] fmvVarArr, int i, fqv fqvVar) {
        this.a = bundle;
        this.b = fmvVarArr;
        this.c = i;
        this.d = fqvVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.K(parcel, 1, this.a);
        fyb.V(parcel, 2, this.b, i);
        fyb.I(parcel, 3, this.c);
        fyb.R(parcel, 4, this.d, i);
        fyb.E(parcel, C);
    }
}
