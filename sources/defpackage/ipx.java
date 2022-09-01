package defpackage;

/* compiled from: PG */
/* renamed from: ipx  reason: default package */
/* loaded from: classes.dex */
public final class ipx {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final int e;

    public ipx() {
    }

    public ipx(int i, int i2, int i3, int i4, boolean z) {
        this.e = i;
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ipx)) {
            return false;
        }
        ipx ipxVar = (ipx) obj;
        int i = this.e;
        int i2 = ipxVar.e;
        if (i == 0) {
            throw null;
        }
        return i == i2 && this.a == ipxVar.a && this.b == ipxVar.b && this.c == ipxVar.c && this.d == ipxVar.d;
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return ((((((((i ^ 1000003) * (-721379959)) ^ this.a) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231);
        }
        throw null;
    }

    public final String toString() {
        int i = this.e;
        String str = i != 1 ? i != 2 ? i != 3 ? "null" : "N_TILE" : "ROW_NUMBER_MOD" : "NONE";
        int i2 = this.a;
        int i3 = this.b;
        int i4 = this.c;
        boolean z = this.d;
        return "IteratorConfig{slicingType=" + str + ", modDelta=0, numberOfSlices=" + i2 + ", sliceRangeBegin=" + i3 + ", sliceRangeEnd=" + i4 + ", random=" + z + "}";
    }
}
