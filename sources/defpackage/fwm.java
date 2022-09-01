package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: fwm  reason: default package */
/* loaded from: classes.dex */
public final class fwm extends fwc {
    public static final Parcelable.Creator CREATOR = new fuo(14);
    public final String b;
    public final int c;
    public final boolean d;
    public final String e;
    public final int f;
    public final Uri g;
    public final fwn h;
    public final long i;
    public final Uri j;
    public final fwq k;
    public final Uri l;
    private final byte[] m;

    public fwm(String str, int i, boolean z, String str2, int i2, Uri uri, fwn fwnVar, long j, Uri uri2, fwq fwqVar, byte[] bArr, Uri uri3) {
        boolean z2 = true;
        jdg.v(!str.isEmpty());
        jdg.v(i != 0);
        if (uri != null && str2 == null) {
            jdg.v(i2 != 3 ? false : z2);
            jdg.u(uri2);
            jdg.u(fwqVar);
            jdg.u(uri3);
        } else if (uri != null || str2 == null) {
            if (uri == null) {
                throw new IllegalArgumentException("must call exactly one of #setFederatedOptions or #setPersonalizedOptions");
            }
            throw new IllegalArgumentException("cannot call both #setFederatedOptions and #setPersonalizedOptions");
        } else {
            jdg.v(!str2.isEmpty());
            if (i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3) {
                z2 = false;
            }
            jdg.v(z2);
        }
        this.b = str;
        this.c = i;
        this.d = z;
        this.e = str2;
        this.f = i2;
        this.g = uri;
        this.j = uri2;
        this.h = fwnVar;
        this.i = j;
        this.k = fwqVar;
        this.m = bArr != null ? bArr : new byte[0];
        this.l = uri3;
    }

    public static fwl a() {
        return new fwl();
    }

    public static void b(Uri uri) {
        jdg.A(uri.isAbsolute(), "%s is not absolute.", uri);
        jdg.A(uri.isHierarchical(), "%s is not hierarchical.", uri);
        boolean z = false;
        jdg.w(uri.getAuthority() == null, "Uri cannot have authority.");
        jdg.w(uri.getFragment() == null, "Uri cannot have fragment part.");
        jdg.w(uri.getQuery() == null, "Uri cannot have query part.");
        if ("appfiles".equals(uri.getScheme()) || "appcache".equals(uri.getScheme()) || "appdir".equals(uri.getScheme())) {
            z = true;
        }
        jdg.A(z, "Unsupported scheme: %s", uri.getScheme());
    }

    public final byte[] c() {
        byte[] bArr = this.m;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwm)) {
            return false;
        }
        fwm fwmVar = (fwm) obj;
        return jdg.W(this.b, fwmVar.b) && this.c == fwmVar.c && this.d == fwmVar.d && jdg.W(this.e, fwmVar.e) && this.f == fwmVar.f && jdg.W(this.g, fwmVar.g) && jdg.W(this.j, fwmVar.j) && jdg.W(this.h, fwmVar.h) && this.i == fwmVar.i && jdg.W(this.k, fwmVar.k) && Arrays.equals(this.m, fwmVar.m) && jdg.W(this.l, fwmVar.l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(this.c), Boolean.valueOf(this.d), this.e, Integer.valueOf(this.f), this.g, this.j, this.h, Long.valueOf(this.i), this.k, Integer.valueOf(Arrays.hashCode(this.m)), this.l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.S(parcel, 1, this.b);
        fyb.I(parcel, 2, this.c);
        fyb.F(parcel, 3, this.d);
        fyb.S(parcel, 4, this.e);
        fyb.I(parcel, 5, this.f);
        fyb.R(parcel, 6, this.g, i);
        fyb.R(parcel, 9, this.h, i);
        fyb.J(parcel, 10, this.i);
        fyb.R(parcel, 11, this.j, i);
        fyb.R(parcel, 12, this.k, i);
        fyb.L(parcel, 13, c());
        fyb.R(parcel, 14, this.l, i);
        fyb.E(parcel, C);
    }
}
