package defpackage;

/* compiled from: PG */
/* renamed from: kzc  reason: default package */
/* loaded from: classes.dex */
public final class kzc {
    public final int a;
    public final long b;

    public kzc() {
    }

    public kzc(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kzc) {
            kzc kzcVar = (kzc) obj;
            if (this.a == kzcVar.a && this.b == kzcVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        long j = this.b;
        return ((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        int i = this.a;
        long j = this.b;
        return "EventRecord{eventType=" + i + ", eventTimestamp=" + j + "}";
    }
}
