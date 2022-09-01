package defpackage;

/* compiled from: PG */
/* renamed from: nio  reason: default package */
/* loaded from: classes2.dex */
final class nio extends nip {
    private final long a;
    private final nhf b;

    public nio(long j, nhf nhfVar) {
        this.a = j;
        if (nhfVar != null) {
            this.b = nhfVar;
            return;
        }
        throw new NullPointerException("Null parser");
    }

    @Override // defpackage.nip
    public final long b() {
        return this.a;
    }

    @Override // defpackage.nip
    public final nhf c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nip) {
            nip nipVar = (nip) obj;
            if (this.a == nipVar.b() && this.b.equals(nipVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return this.b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        String obj = this.b.toString();
        return "GeneratedAnyExtractor{typeHash=" + j + ", parser=" + obj + "}";
    }
}
