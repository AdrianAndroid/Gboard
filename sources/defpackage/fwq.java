package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: fwq  reason: default package */
/* loaded from: classes.dex */
public final class fwq extends frw {
    public static final Parcelable.Creator CREATOR = new fuo(16);
    public final int a;
    public final long b;

    public fwq(int i, long j) {
        boolean z = true;
        if (i == 0) {
            i = 0;
            if (j <= 0) {
                z = false;
            }
        }
        fyb.az(z, "Recurrent jobs cannot have non-positive minimal interval.");
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwq)) {
            return false;
        }
        fwq fwqVar = (fwq) obj;
        return this.a == fwqVar.a && this.b == fwqVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.I(parcel, 1, this.a);
        fyb.J(parcel, 2, this.b);
        fyb.E(parcel, C);
    }
}
