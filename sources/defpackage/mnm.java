package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: mnm  reason: default package */
/* loaded from: classes2.dex */
public final class mnm extends frw {
    public static final Parcelable.Creator CREATOR = new icc(17);
    public final String a;
    public final String b;
    public final int c;
    public long d;
    public final Uri e;
    private final Bundle f;

    public mnm(String str, String str2, int i, long j, Bundle bundle, Uri uri) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.f = bundle;
        this.e = uri;
    }

    public final Bundle a() {
        Bundle bundle = this.f;
        return bundle == null ? new Bundle() : bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.S(parcel, 1, this.a);
        fyb.S(parcel, 2, this.b);
        fyb.I(parcel, 3, this.c);
        fyb.J(parcel, 4, this.d);
        fyb.K(parcel, 5, a());
        fyb.R(parcel, 6, this.e, i);
        fyb.E(parcel, C);
    }
}
