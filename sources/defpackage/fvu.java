package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: fvu  reason: default package */
/* loaded from: classes.dex */
public final class fvu extends frw {
    public static final Parcelable.Creator CREATOR = new fuo(12);
    public final float a;
    public final int b;
    public final int c;
    public final Integer d;

    public fvu(float f, int i, int i2, Integer num) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fvu) {
            fvu fvuVar = (fvu) obj;
            if (fyb.aJ(Float.valueOf(this.a), Float.valueOf(fvuVar.a)) && fyb.aJ(Integer.valueOf(this.b), Integer.valueOf(fvuVar.b)) && fyb.aJ(this.d, fvuVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Integer.valueOf(this.b), this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.G(parcel, 1, this.a);
        fyb.I(parcel, 2, this.b);
        fyb.I(parcel, 3, this.c);
        fyb.P(parcel, 4, this.d);
        fyb.E(parcel, C);
    }
}
