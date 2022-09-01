package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: gcs  reason: default package */
/* loaded from: classes.dex */
public final class gcs extends frw implements Comparable {
    public static final Parcelable.Creator CREATOR = new fuo(17);
    public final int a;
    public final gcx[] b;
    public final String[] c;
    public final Map d = new TreeMap();

    public gcs(int i, gcx[] gcxVarArr, String[] strArr) {
        this.a = i;
        this.b = gcxVarArr;
        for (gcx gcxVar : gcxVarArr) {
            this.d.put(gcxVar.a, gcxVar);
        }
        this.c = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a - ((gcs) obj).a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gcs) {
            gcs gcsVar = (gcs) obj;
            if (this.a == gcsVar.a && gjz.d(this.d, gcsVar.d) && Arrays.equals(this.c, gcsVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.a);
        sb.append(", (");
        for (gcx gcxVar : this.d.values()) {
            sb.append(gcxVar);
            sb.append(", ");
        }
        sb.append("), (");
        String[] strArr = this.c;
        if (strArr != null) {
            for (String str : strArr) {
                sb.append(str);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append("))");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.I(parcel, 2, this.a);
        fyb.V(parcel, 3, this.b, i);
        fyb.T(parcel, 4, this.c);
        fyb.E(parcel, C);
    }
}
