package defpackage;

/* compiled from: PG */
/* renamed from: iqv  reason: default package */
/* loaded from: classes.dex */
public final class iqv {
    public final Boolean a;
    public final llp b;

    public iqv(Boolean bool, llp llpVar) {
        this.a = bool;
        if (llpVar != null) {
            this.b = llpVar;
            return;
        }
        throw new NullPointerException("Null suggestions");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iqv) {
            iqv iqvVar = (iqv) obj;
            if (this.a.equals(iqvVar.a) && lre.I(this.b, iqvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Boolean bool = this.a;
        String obj = this.b.toString();
        return "SuggestionTypeData{isSpellCorrection=" + bool + ", suggestions=" + obj + "}";
    }

    public iqv() {
    }
}
