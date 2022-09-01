package defpackage;

/* compiled from: PG */
/* renamed from: jzu  reason: default package */
/* loaded from: classes.dex */
public final class jzu {
    private final int a;
    private final long b;
    private final long c;
    private final int d;
    private final long e;
    private final long f;

    public jzu() {
    }

    public jzu(int i, long j, long j2, int i2, long j3, long j4) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = i2;
        this.e = j3;
        this.f = j4;
    }

    public static jzt a() {
        jzt jztVar = new jzt();
        jztVar.j(0);
        jztVar.h(0L);
        jztVar.i(0L);
        jztVar.f(0L);
        jztVar.g(0L);
        jztVar.e(0);
        return jztVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jzu) {
            jzu jzuVar = (jzu) obj;
            if (this.a == jzuVar.a && this.b == jzuVar.b && this.c == jzuVar.c && this.d == jzuVar.d && this.e == jzuVar.e && this.f == jzuVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        long j = this.b;
        long j2 = this.c;
        int i2 = this.d;
        long j3 = this.e;
        long j4 = this.f;
        return ((((((((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ i2) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4));
    }

    public final String toString() {
        lfa T = jdg.T("");
        T.f("totalTraceCount", this.a);
        T.g("totalSize", this.b);
        T.g("totalMillis", this.c);
        int i = this.d;
        long j = -1;
        T.g("avgTraceMillis", i == 0 ? -1L : this.f / i);
        int i2 = this.d;
        if (i2 != 0) {
            j = this.e / i2;
        }
        T.g("avgTraceSize", j);
        return T.toString();
    }
}
