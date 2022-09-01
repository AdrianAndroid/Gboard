package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: fvt  reason: default package */
/* loaded from: classes.dex */
public final class fvt extends frw {
    public static final Parcelable.Creator CREATOR = new fuo(11);
    public final Locale a;
    public final float b;
    public final float c;

    public fvt(String str, float f, float f2) {
        this.a = fwb.b(str);
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fvt) {
            fvt fvtVar = (fvt) obj;
            if (fyb.aJ(this.a, fvtVar.a) && fyb.aJ(Float.valueOf(this.b), Float.valueOf(fvtVar.b)) && fyb.aJ(Float.valueOf(this.c), Float.valueOf(fvtVar.c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b), Float.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.S(parcel, 1, fwb.a(this.a));
        fyb.G(parcel, 2, this.b);
        fyb.G(parcel, 3, this.c);
        fyb.E(parcel, C);
    }
}
