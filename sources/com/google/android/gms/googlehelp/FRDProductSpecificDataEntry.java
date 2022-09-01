package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FRDProductSpecificDataEntry extends frw implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new fuo(4);
    int a;
    int b;
    List c;
    List d;
    List e;
    List f;
    byte[][] g;
    Boolean h;

    public FRDProductSpecificDataEntry(int i, int i2, List list, List list2, List list3, List list4, byte[][] bArr, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.g = bArr;
        this.h = Boolean.valueOf(z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FRDProductSpecificDataEntry)) {
            return false;
        }
        FRDProductSpecificDataEntry fRDProductSpecificDataEntry = (FRDProductSpecificDataEntry) obj;
        return this.a == fRDProductSpecificDataEntry.a && this.b == fRDProductSpecificDataEntry.b && jdg.W(this.c, fRDProductSpecificDataEntry.c) && jdg.W(this.d, fRDProductSpecificDataEntry.d) && jdg.W(this.e, fRDProductSpecificDataEntry.e) && jdg.W(this.f, fRDProductSpecificDataEntry.f) && Arrays.equals(this.g, fRDProductSpecificDataEntry.g) && jdg.W(this.h, fRDProductSpecificDataEntry.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d, this.e, this.f, Integer.valueOf(Arrays.deepHashCode(this.g)), this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.I(parcel, 2, this.a);
        fyb.I(parcel, 3, this.b);
        fyb.U(parcel, 4, this.c);
        fyb.Q(parcel, 5, this.d);
        fyb.U(parcel, 6, this.e);
        fyb.Q(parcel, 7, this.f);
        fyb.M(parcel, 8, this.g);
        Boolean bool = this.h;
        if (bool != null) {
            fyb.H(parcel, 9, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        fyb.E(parcel, C);
    }
}
