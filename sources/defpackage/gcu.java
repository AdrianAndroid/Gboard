package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: gcu  reason: default package */
/* loaded from: classes.dex */
public final class gcu extends frw {
    public static final Parcelable.Creator CREATOR = new fuo(19);
    public final byte[] a;

    public gcu(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.L(parcel, 2, this.a);
        fyb.E(parcel, C);
    }
}
