package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: fmm  reason: default package */
/* loaded from: classes.dex */
public final class fmm extends frw {
    public static final Parcelable.Creator CREATOR = new ahj(20);
    public final String a;
    public final int b;
    public int c;

    public fmm(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fmm)) {
            return false;
        }
        fmm fmmVar = (fmm) obj;
        return Objects.equals(this.a, fmmVar.a) && this.b == fmmVar.b && this.c == fmmVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        return "LogErrorParcelable[LogSourceName: " + this.a + ", ClearcutStatusCode: " + this.b + ", ErrorCount: " + this.c + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.S(parcel, 1, this.a);
        fyb.I(parcel, 2, this.b);
        fyb.I(parcel, 3, this.c);
        fyb.E(parcel, C);
    }
}
