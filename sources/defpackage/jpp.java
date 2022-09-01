package defpackage;

/* compiled from: PG */
/* renamed from: jpp  reason: default package */
/* loaded from: classes.dex */
final class jpp {
    public final String a;
    public final String b;

    public jpp() {
    }

    public jpp(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jpp) {
            jpp jppVar = (jpp) obj;
            String str = this.a;
            if (str != null ? str.equals(jppVar.a) : jppVar.a == null) {
                String str2 = this.b;
                String str3 = jppVar.b;
                if (str2 != null ? str2.equals(str3) : str3 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        return "BaseValues{baseDownloadUrl=" + str + ", downloadPackingScheme=" + str2 + "}";
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }
}
