package defpackage;

/* compiled from: PG */
/* renamed from: eeq  reason: default package */
/* loaded from: classes.dex */
public final class eeq {
    public static final eeq a = c().e();
    public final String b;
    public final mba c;

    public eeq() {
    }

    public eeq(String str, mba mbaVar) {
        this.b = str;
        this.c = mbaVar;
    }

    public static eeq a(iay iayVar) {
        if (iayVar.c != -30000) {
            return a;
        }
        Object obj = iayVar.e;
        return obj instanceof eeq ? (eeq) obj : a;
    }

    public static gwv c() {
        gwv gwvVar = new gwv((byte[]) null);
        gwvVar.f("");
        gwvVar.g(mba.UNKNOWN);
        return gwvVar;
    }

    public final iay b() {
        return new iay(-30000, null, this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eeq) {
            eeq eeqVar = (eeq) obj;
            if (this.b.equals(eeqVar.b) && this.c.equals(eeqVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.b;
        String valueOf = String.valueOf(this.c);
        return "SearchInfo{query=" + str + ", searchQueryType=" + valueOf + "}";
    }
}
