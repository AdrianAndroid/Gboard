package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: fkm  reason: default package */
/* loaded from: classes.dex */
public final class fkm extends frw {
    public static final Parcelable.Creator CREATOR = new ahj(13);
    public final int a;
    public final int b;
    public final String c;
    public final byte[][] d;
    public final byte[] e;
    public final byte[] f;

    public fkm(int i, int i2, String str, byte[][] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = bArr;
        this.e = bArr2;
        this.f = bArr3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.I(parcel, 1, this.a);
        fyb.I(parcel, 2, this.b);
        fyb.S(parcel, 3, this.c);
        fyb.M(parcel, 4, this.d);
        fyb.L(parcel, 5, this.e);
        fyb.L(parcel, 6, this.f);
        fyb.E(parcel, C);
    }
}
