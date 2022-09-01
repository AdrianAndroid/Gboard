package defpackage;

/* compiled from: PG */
/* renamed from: dzp  reason: default package */
/* loaded from: classes.dex */
public final class dzp {
    public final cqp a;
    public final dzo b;

    public dzp(cqp cqpVar, dzo dzoVar) {
        if (cqpVar != null) {
            this.a = cqpVar;
            if (dzoVar != null) {
                this.b = dzoVar;
                return;
            }
            throw new NullPointerException("Null source");
        }
        throw new NullPointerException("Null image");
    }

    public static dzp a(cqp cqpVar, dzo dzoVar) {
        return new dzp(cqpVar, dzoVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzp) {
            dzp dzpVar = (dzp) obj;
            if (this.a.equals(dzpVar.a) && this.b.equals(dzpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String obj = this.a.toString();
        String obj2 = this.b.toString();
        return "ContentSuggestionImageResult{image=" + obj + ", source=" + obj2 + "}";
    }

    public dzp() {
    }
}
