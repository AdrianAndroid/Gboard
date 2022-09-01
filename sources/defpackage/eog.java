package defpackage;

/* compiled from: PG */
/* renamed from: eog  reason: default package */
/* loaded from: classes.dex */
public final class eog {
    public final jav a;
    public final eod b;

    public eog(jav javVar, eod eodVar) {
        if (javVar != null) {
            this.a = javVar;
            if (eodVar != null) {
                this.b = eodVar;
                return;
            }
            throw new NullPointerException("Null modelType");
        }
        throw new NullPointerException("Null languageTag");
    }

    public static eog a(jav javVar, eod eodVar) {
        return new eog(javVar, eodVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eog) {
            eog eogVar = (eog) obj;
            if (this.a.equals(eogVar.a) && this.b.equals(eogVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a.n;
        String obj = this.b.toString();
        return "LanguageTagModelTypeTuple{languageTag=" + str + ", modelType=" + obj + "}";
    }

    public eog() {
    }
}
