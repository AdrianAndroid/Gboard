package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: fvs  reason: default package */
/* loaded from: classes.dex */
public final class fvs extends frw {
    public static final Parcelable.Creator CREATOR = new fuo(10);
    public final float a;
    public final float b;
    private final Locale c;

    public fvs(String str, float f, float f2) {
        this.c = fwb.b(str);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fvs) {
            fvs fvsVar = (fvs) obj;
            if (fyb.aJ(this.c, fvsVar.c) && fyb.aJ(Float.valueOf(this.a), Float.valueOf(fvsVar.a)) && fyb.aJ(Float.valueOf(this.b), Float.valueOf(fvsVar.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Float.valueOf(this.a), Float.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.S(parcel, 1, fwb.a(this.c));
        fyb.G(parcel, 2, this.a);
        fyb.G(parcel, 3, this.b);
        fyb.E(parcel, C);
    }
}
