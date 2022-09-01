package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: gev  reason: default package */
/* loaded from: classes.dex */
public final class gev extends frw {
    public static final Parcelable.Creator CREATOR = new gcz(9);
    public final String a;
    public final byte[] b;
    public final List c;

    public gev(String str, byte[] bArr, List list) {
        this.a = str;
        this.b = bArr;
        this.c = list == null ? new ArrayList(0) : new ArrayList(list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gev)) {
            return false;
        }
        gev gevVar = (gev) obj;
        return fyb.aJ(this.a, gevVar.a) && fyb.aJ(this.b, gevVar.b) && fyb.aJ(this.c, gevVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.S(parcel, 1, this.a);
        fyb.L(parcel, 2, this.b);
        ArrayList arrayList = new ArrayList(this.c);
        int D = fyb.D(parcel, 3);
        int size = arrayList.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) arrayList.get(i2)).intValue());
        }
        fyb.E(parcel, D);
        fyb.E(parcel, C);
    }
}
