package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* renamed from: gda  reason: default package */
/* loaded from: classes.dex */
public final class gda extends frw {
    public static final Parcelable.Creator CREATOR = new gcz(2);
    public final List a;

    public gda(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gda) {
            return this.a.equals(((gda) obj).a);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlagOverrides(");
        boolean z = true;
        for (gcy gcyVar : this.a) {
            if (!z) {
                sb.append(", ");
            }
            gcyVar.a(sb);
            z = false;
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.W(parcel, 2, this.a);
        fyb.E(parcel, C);
    }
}
