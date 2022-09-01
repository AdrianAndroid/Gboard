package defpackage;

/* compiled from: PG */
/* renamed from: jqg  reason: default package */
/* loaded from: classes.dex */
public final class jqg {
    public final long a;
    private final int b;

    public jqg() {
    }

    public jqg(int i, long j) {
        this.b = i;
        this.a = j;
    }

    public static jqg a(int i, long j) {
        return new jqg(i, j);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jqg) {
            jqg jqgVar = (jqg) obj;
            if (this.b == jqgVar.b && this.a == jqgVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        long j = this.a;
        return ((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        int i = this.b;
        long j = this.a;
        return "FetchStateWithSize{fetchState=" + i + ", size=" + j + "}";
    }
}
