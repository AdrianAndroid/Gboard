package defpackage;

/* compiled from: PG */
/* renamed from: ikm  reason: default package */
/* loaded from: classes.dex */
public final class ikm {
    public final String a;
    public final jav b;

    public ikm(String str, jav javVar) {
        if (str != null) {
            this.a = str;
            if (javVar != null) {
                this.b = javVar;
                return;
            }
            throw new NullPointerException("Null languageTag");
        }
        throw new NullPointerException("Null displayName");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ikm) {
            ikm ikmVar = (ikm) obj;
            if (this.a.equals(ikmVar.a) && this.b.equals(ikmVar.b)) {
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
        String str2 = this.b.n;
        return "LanguageTagDisplayTuple{displayName=" + str + ", languageTag=" + str2 + "}";
    }

    public ikm() {
    }
}
