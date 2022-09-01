package defpackage;

/* compiled from: PG */
/* renamed from: jvb  reason: default package */
/* loaded from: classes.dex */
public final class jvb {
    public final jsr a;
    public final String b;

    public jvb(jsr jsrVar, String str) {
        if (jsrVar != null) {
            this.a = jsrVar;
            this.b = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    public static jvb a(jsr jsrVar, String str) {
        return new jvb(jsrVar, str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jvb) {
            jvb jvbVar = (jvb) obj;
            if (this.a.equals(jvbVar.a)) {
                String str = this.b;
                String str2 = jvbVar.b;
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
        lfa T = jdg.T("");
        T.d();
        T.b("name", this.a);
        T.b("scheme", this.b);
        return T.toString();
    }

    public jvb() {
    }
}
