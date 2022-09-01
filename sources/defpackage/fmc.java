package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: fmc  reason: default package */
/* loaded from: classes.dex */
public final class fmc extends frw {
    public static final Parcelable.Creator CREATOR = new ahj(18);
    private static final String[] m = new String[0];
    public final lgb a;
    public final lzr b;
    public final fmp c;
    public byte[] d;
    public final int[] e;
    public final String[] f;
    public final int[] g;
    public final byte[][] h;
    public final gcv[] i;
    public final boolean j;
    public fmo k;
    public nol l;
    private final String[] n;

    public fmc(fmp fmpVar, nol nolVar, lgb lgbVar, int[] iArr, String[] strArr, int[] iArr2) {
        this.c = fmpVar;
        this.l = nolVar;
        this.a = lgbVar;
        this.b = null;
        this.e = iArr;
        this.f = strArr;
        this.g = iArr2;
        this.h = null;
        this.i = null;
        this.n = null;
        this.j = true;
    }

    public fmc(fmp fmpVar, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, gcv[] gcvVarArr, fmo fmoVar, String[] strArr2) {
        this.c = fmpVar;
        this.d = bArr;
        this.e = iArr;
        this.f = strArr;
        this.l = null;
        this.a = null;
        this.b = null;
        this.g = iArr2;
        this.h = bArr2;
        this.i = gcvVarArr;
        this.j = z;
        this.n = strArr2;
        this.k = fmoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fmc) {
            fmc fmcVar = (fmc) obj;
            if (fyb.aJ(this.c, fmcVar.c) && Arrays.equals(this.d, fmcVar.d) && Arrays.equals(this.e, fmcVar.e) && Arrays.equals(this.f, fmcVar.f) && fyb.aJ(this.l, fmcVar.l) && fyb.aJ(this.a, fmcVar.a)) {
                lzr lzrVar = fmcVar.b;
                if (fyb.aJ(null, null) && Arrays.equals(this.g, fmcVar.g) && Arrays.deepEquals(this.h, fmcVar.h) && Arrays.equals(this.i, fmcVar.i) && Arrays.equals(this.n, fmcVar.n) && this.j == fmcVar.j && fyb.aJ(this.k, fmcVar.k)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.d, this.e, this.f, this.l, this.a, null, this.g, this.h, this.i, Boolean.valueOf(this.j), this.n, this.k});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.c);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.d;
        String str = null;
        sb.append(bArr == null ? null : new String(bArr, StandardCharsets.UTF_8));
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.e));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.f));
        sb.append(", LogEvent: ");
        sb.append(this.l);
        sb.append(", SourceExtensionByteStringProvider: ");
        sb.append(this.a);
        sb.append(", VeProducer: null, ExperimentIDs: ");
        sb.append(Arrays.toString(this.g));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.deepToString(this.h));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.i));
        sb.append(", MendelPackagesToFilter: ");
        sb.append(Arrays.toString(this.n));
        sb.append("AddPhenotypeExperimentTokens: ");
        sb.append(this.j);
        sb.append(", LogVerifierResult: ");
        fmo fmoVar = this.k;
        if (fmoVar != null) {
            str = fmoVar.toString();
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.R(parcel, 2, this.c, i);
        fyb.L(parcel, 3, this.d);
        fyb.O(parcel, 4, this.e);
        fyb.T(parcel, 5, this.f);
        fyb.O(parcel, 6, this.g);
        fyb.M(parcel, 7, this.h);
        fyb.F(parcel, 8, this.j);
        fyb.V(parcel, 9, this.i, i);
        fyb.R(parcel, 11, this.k, i);
        String[] strArr = this.n;
        if (strArr == null) {
            strArr = m;
        }
        fyb.T(parcel, 12, strArr);
        fyb.E(parcel, C);
    }
}
