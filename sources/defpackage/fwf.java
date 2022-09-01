package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: fwf  reason: default package */
/* loaded from: classes.dex */
public final class fwf extends frw {
    public static final Parcelable.Creator CREATOR = new fuo(13);
    public final String a;
    public final byte[] b;
    public final int c;
    public final byte[] d;

    public fwf(String str, byte[] bArr, int i, byte[] bArr2) {
        boolean z = false;
        if (!lfd.e(str) && bArr != null) {
            z = true;
        }
        fyb.az(z, "Collection name cannot be null or empty. Selection criteria cannot be null.");
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwf)) {
            return false;
        }
        fwf fwfVar = (fwf) obj;
        return this.a.equals(fwfVar.a) && Arrays.equals(this.b, fwfVar.b) && this.c == fwfVar.c && Arrays.equals(this.d, fwfVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(this.c), Integer.valueOf(Arrays.hashCode(this.d))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.S(parcel, 1, this.a);
        fyb.L(parcel, 2, this.b);
        fyb.I(parcel, 3, this.c);
        fyb.L(parcel, 4, this.d);
        fyb.E(parcel, C);
    }
}
