package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: fmp  reason: default package */
/* loaded from: classes.dex */
public final class fmp extends frw {
    public static final Parcelable.Creator CREATOR = new fmq(0);
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final int h;
    public final Integer i;
    public final boolean j;
    public final int k;

    public fmp(String str, int i, int i2, String str2, boolean z, String str3, boolean z2, int i3, Integer num, boolean z3, int i4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = z;
        this.f = str3;
        this.g = z2;
        this.h = i3;
        this.i = num;
        this.j = z3;
        this.k = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fmp) {
            fmp fmpVar = (fmp) obj;
            if (fyb.aJ(this.a, fmpVar.a) && this.b == fmpVar.b && this.c == fmpVar.c && fyb.aJ(this.f, fmpVar.f) && fyb.aJ(this.d, fmpVar.d) && this.e == fmpVar.e && this.g == fmpVar.g && this.h == fmpVar.h && fyb.aJ(this.i, fmpVar.i) && this.j == fmpVar.j && this.k == fmpVar.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), this.f, this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.g), Integer.valueOf(this.h), this.i, Boolean.valueOf(this.j), Integer.valueOf(this.k)});
    }

    public final String toString() {
        return "PlayLoggerContext[package=" + this.a + ",packageVersionCode=" + this.b + ",logSource=" + this.c + ",logSourceName=" + this.f + ",uploadAccount=" + this.d + ",logAndroidId=" + this.e + ",isAnonymous=" + this.g + ",qosTier=" + this.h + ",appMobilespecId=" + this.i + ",scrubMccMnc=" + this.j + "piiLevelset=" + this.k + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.S(parcel, 2, this.a);
        fyb.I(parcel, 3, this.b);
        fyb.I(parcel, 4, this.c);
        fyb.S(parcel, 5, this.d);
        fyb.F(parcel, 7, this.e);
        fyb.S(parcel, 8, this.f);
        fyb.F(parcel, 9, this.g);
        fyb.I(parcel, 10, this.h);
        fyb.P(parcel, 11, this.i);
        fyb.F(parcel, 12, this.j);
        fyb.I(parcel, 13, this.k);
        fyb.E(parcel, C);
    }
}
