package defpackage;

/* compiled from: PG */
/* renamed from: haa  reason: default package */
/* loaded from: classes.dex */
final class haa {
    public final long a;
    public final long b;
    public final String c;
    public final int d;

    public haa(long j, long j2, String str, int i) {
        this.a = j;
        this.b = j2;
        if (str != null) {
            this.c = str;
            this.d = i;
            return;
        }
        throw new NullPointerException("Null text");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static haa a(long j, long j2, String str, int i) {
        return new haa(j, j2, str, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof haa) {
            haa haaVar = (haa) obj;
            if (this.a == haaVar.a && this.b == haaVar.b && this.c.equals(haaVar.c) && this.d == haaVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return this.d ^ ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        String str = this.c;
        int i = this.d;
        return "EventRecord{timestamp=" + j + ", tid=" + j2 + ", text=" + str + ", count=" + i + "}";
    }

    public haa() {
    }
}
