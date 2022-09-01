package defpackage;

/* compiled from: PG */
/* renamed from: ltz  reason: default package */
/* loaded from: classes.dex */
final class ltz implements ltq {
    private final ltq a;
    private final Object b;

    public ltz(ltq ltqVar, Object obj) {
        lxj.b(ltqVar, "log site key");
        this.a = ltqVar;
        lxj.b(obj, "log site qualifier");
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ltz)) {
            return false;
        }
        ltz ltzVar = (ltz) obj;
        return this.a.equals(ltzVar.a) && this.b.equals(ltzVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return "SpecializedLogSiteKey{ delegate='" + this.a + "', qualifier='" + this.b + "' }";
    }
}
