package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: gew  reason: default package */
/* loaded from: classes.dex */
public final class gew extends frw {
    public static final Parcelable.Creator CREATOR = new gcz(10);
    public final boolean a;
    public final boolean b;
    private final List c;

    static {
        new gew(null, false, false);
    }

    public gew(List list, boolean z, boolean z2) {
        this.c = list == null ? new ArrayList(0) : new ArrayList(list);
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gew)) {
            return false;
        }
        gew gewVar = (gew) obj;
        return fyb.aJ(this.c, gewVar.c) && fyb.aJ(Boolean.valueOf(this.a), Boolean.valueOf(gewVar.a));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.W(parcel, 1, new ArrayList(this.c));
        fyb.F(parcel, 2, this.a);
        fyb.F(parcel, 3, this.b);
        fyb.E(parcel, C);
    }
}
