package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Scope extends frw implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new fmq(7);
    final int a;
    public final String b;

    public Scope(int i, String str) {
        fyb.aG(str, "scopeUri must not be null or empty");
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.b.equals(((Scope) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.I(parcel, 1, this.a);
        fyb.S(parcel, 2, this.b);
        fyb.E(parcel, C);
    }

    public Scope(String str) {
        this(1, str);
    }
}
