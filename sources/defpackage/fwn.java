package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: fwn  reason: default package */
/* loaded from: classes.dex */
public final class fwn extends frw {
    public static final Parcelable.Creator CREATOR = new fuo(15);
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public fwn(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwn)) {
            return false;
        }
        fwn fwnVar = (fwn) obj;
        return this.a == fwnVar.a && this.b == fwnVar.b && this.c == fwnVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.F(parcel, 1, this.a);
        fyb.F(parcel, 2, this.b);
        fyb.F(parcel, 3, this.c);
        fyb.E(parcel, C);
    }
}
