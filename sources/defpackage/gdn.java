package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: gdn  reason: default package */
/* loaded from: classes.dex */
public final class gdn extends frw {
    public static final Parcelable.Creator CREATOR = new gcz(4);
    public final String a;

    public gdn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gdn) {
            return fyb.aJ(this.a, ((gdn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        return "PseudonymousIdToken[" + str + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.S(parcel, 2, this.a);
        fyb.E(parcel, C);
    }
}
