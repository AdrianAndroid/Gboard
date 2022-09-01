package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: fmo  reason: default package */
/* loaded from: classes.dex */
public final class fmo extends frw {
    public static final Parcelable.Creator CREATOR = new fmq(1);
    public final boolean a;

    public fmo(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fmo) && this.a == ((fmo) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    public final String toString() {
        boolean z = this.a;
        return "LogVerifierResultParcelable[" + z + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.F(parcel, 1, this.a);
        fyb.E(parcel, C);
    }
}
