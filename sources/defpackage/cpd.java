package defpackage;

/* compiled from: PG */
/* renamed from: cpd  reason: default package */
/* loaded from: classes.dex */
public final class cpd {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;

    public cpd() {
    }

    public cpd(int i, boolean z, boolean z2, int i2) {
        this.d = i;
        this.a = z;
        this.b = z2;
        this.c = i2;
    }

    public static cpc a() {
        cpc cpcVar = new cpc();
        cpcVar.a = (byte) (cpcVar.a | 1);
        cpcVar.d(false);
        cpcVar.c(true);
        cpcVar.b(-1);
        return cpcVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cpd)) {
            return false;
        }
        cpd cpdVar = (cpd) obj;
        int i = this.d;
        int i2 = cpdVar.d;
        if (i == 0) {
            throw null;
        }
        return i == i2 && this.a == cpdVar.a && this.b == cpdVar.b && this.c == cpdVar.c;
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            int i2 = 1237;
            int i3 = (((((i ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003;
            if (true == this.b) {
                i2 = 1231;
            }
            return ((i3 ^ i2) * 1000003) ^ this.c;
        }
        throw null;
    }

    public final String toString() {
        int i = this.d;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "SEARCH_RESULTS_NO_QUERY" : "SEARCH_RESULTS" : "BROWSE_SCROLLABLE" : "BROWSE_FIXED" : "UNSPECIFIED";
        boolean z = this.a;
        boolean z2 = this.b;
        int i2 = this.c;
        return "DisplayFlags{viewState=" + str + ", lastElementHalfVisible=false, scrollableStartElement=" + z + ", scrollToInitialMiddleIndex=" + z2 + ", maxIndexForOpenSearchBox=" + i2 + "}";
    }
}
