package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: gdb  reason: default package */
/* loaded from: classes.dex */
public final class gdb extends frw implements Comparable {
    public static final Parcelable.Creator CREATOR = new gcz(3);
    public final int a;
    public final int b;

    public gdb(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(gdb gdbVar) {
        int i = this.a;
        int i2 = gdbVar.a;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = this.b;
        int i4 = gdbVar.b;
        if (i3 < i4) {
            return -1;
        }
        return i3 > i4 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof gdb) && compareTo((gdb) obj) == 0;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "GenericDimension(" + this.a + ", " + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.I(parcel, 1, this.a);
        fyb.I(parcel, 2, this.b);
        fyb.E(parcel, C);
    }
}
