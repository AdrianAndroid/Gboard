package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: mnx  reason: default package */
/* loaded from: classes2.dex */
public final class mnx extends frw {
    public static final Parcelable.Creator CREATOR = new icc(18);
    public final Uri a;
    public final Uri b;
    public final List c;

    public mnx(Uri uri, Uri uri2, List list) {
        this.a = uri;
        this.b = uri2;
        this.c = list == null ? new ArrayList() : list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.R(parcel, 1, this.a, i);
        fyb.R(parcel, 2, this.b, i);
        fyb.W(parcel, 3, this.c);
        fyb.E(parcel, C);
    }
}
