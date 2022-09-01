package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TokenData extends frw implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ahj(15);
    final int a;
    public final String b;
    public final Long c;
    public final boolean d;
    public final boolean e;
    public final List f;
    public final String g;

    public TokenData(int i, String str, Long l, boolean z, boolean z2, List list, String str2) {
        this.a = i;
        fyb.aF(str);
        this.b = str;
        this.c = l;
        this.d = z;
        this.e = z2;
        this.f = list;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.b, tokenData.b) && fyb.aJ(this.c, tokenData.c) && this.d == tokenData.d && this.e == tokenData.e && fyb.aJ(this.f, tokenData.f) && fyb.aJ(this.g, tokenData.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f, this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.I(parcel, 1, this.a);
        fyb.S(parcel, 2, this.b);
        Long l = this.c;
        if (l != null) {
            fyb.H(parcel, 3, 8);
            parcel.writeLong(l.longValue());
        }
        fyb.F(parcel, 4, this.d);
        fyb.F(parcel, 5, this.e);
        fyb.U(parcel, 6, this.f);
        fyb.S(parcel, 7, this.g);
        fyb.E(parcel, C);
    }
}
