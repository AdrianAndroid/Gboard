package defpackage;

/* compiled from: PG */
/* renamed from: hsc  reason: default package */
/* loaded from: classes.dex */
public final class hsc {
    public final jav a;
    public final String b;

    public hsc(jav javVar, String str) {
        if (javVar != null) {
            this.a = javVar;
            this.b = str;
            return;
        }
        throw new NullPointerException("Null languageTag");
    }

    public static hsc a(hqt hqtVar) {
        return new hsc(hqtVar.i(), hqtVar.p());
    }

    public static hsc b(jav javVar, String str) {
        return new hsc(javVar, str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hsc) {
            hsc hscVar = (hsc) obj;
            if (this.a.equals(hscVar.a)) {
                String str = this.b;
                String str2 = hscVar.b;
                if (str != null ? str.equals(str2) : str2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.a.n;
        String str2 = this.b;
        return "LanguageTagVariantTuple{languageTag=" + str + ", variant=" + str2 + "}";
    }

    public hsc() {
    }
}
