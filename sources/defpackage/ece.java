package defpackage;

/* compiled from: PG */
/* renamed from: ece  reason: default package */
/* loaded from: classes.dex */
public final class ece {
    public final String a;
    private final Float b;

    public ece(String str, Float f) {
        if (str != null) {
            this.a = str;
            this.b = f;
            return;
        }
        throw new NullPointerException("Null prediction");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ece) {
            ece eceVar = (ece) obj;
            if (this.a.equals(eceVar.a) && this.b.equals(eceVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        Float f = this.b;
        return "ScoredPrediction{prediction=" + str + ", score=" + f + "}";
    }

    public ece() {
    }
}
