package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: fme  reason: default package */
/* loaded from: classes.dex */
public final class fme extends frw {
    public static final Parcelable.Creator CREATOR = new ahj(19);
    public final List a;

    public fme(List list) {
        this.a = Collections.unmodifiableList(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fme) {
            return this.a.equals(((fme) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "BatchedLogErrorParcelable[LogErrors: " + this.a + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.W(parcel, 1, this.a);
        fyb.E(parcel, C);
    }
}
