package defpackage;

/* compiled from: PG */
/* renamed from: cjc  reason: default package */
/* loaded from: classes.dex */
public final class cjc {
    public final lfb a;
    public final lfb b;
    public final lfb c;

    public cjc() {
    }

    public cjc(lfb lfbVar, lfb lfbVar2, lfb lfbVar3) {
        this.a = lfbVar;
        this.b = lfbVar2;
        this.c = lfbVar3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cjc) {
            cjc cjcVar = (cjc) obj;
            if (this.a.equals(cjcVar.a) && this.b.equals(cjcVar.b) && this.c.equals(cjcVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        return "ExpressionMomentCandidateData{image=" + valueOf + ", emojiGroup=" + valueOf2 + ", additionalCandidates=" + valueOf3 + "}";
    }
}
