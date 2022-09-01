package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: fmv  reason: default package */
/* loaded from: classes.dex */
public final class fmv extends frw {
    public static final Parcelable.Creator CREATOR = new fmq(3);
    public final String a;
    @Deprecated
    public final int b;
    private final long c;

    public fmv(String str, int i, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public fmv(String str, long j) {
        this.a = str;
        this.c = j;
        this.b = -1;
    }

    public final long a() {
        long j = this.c;
        return j == -1 ? this.b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fmv) {
            fmv fmvVar = (fmv) obj;
            String str = this.a;
            if (((str != null && str.equals(fmvVar.a)) || (this.a == null && fmvVar.a == null)) && a() == fmvVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(a())});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        fyb.aL("name", this.a, arrayList);
        fyb.aL("version", Long.valueOf(a()), arrayList);
        return fyb.aK(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.S(parcel, 1, this.a);
        fyb.I(parcel, 2, this.b);
        fyb.J(parcel, 3, a());
        fyb.E(parcel, C);
    }
}
