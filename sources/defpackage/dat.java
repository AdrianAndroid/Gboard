package defpackage;

/* compiled from: PG */
/* renamed from: dat  reason: default package */
/* loaded from: classes.dex */
public final class dat {
    public static final dat a = b("");
    public final String b;
    public final lfb c;

    public dat(String str, lfb lfbVar) {
        if (str != null) {
            this.b = str;
            this.c = lfbVar;
            return;
        }
        throw new NullPointerException("Null primaryEmoji");
    }

    public static dat a(llp llpVar) {
        int size = llpVar.size();
        if (size != 0) {
            if (size == 1) {
                return b((String) llpVar.get(0));
            }
            if (size == 2) {
                return c((String) llpVar.get(0), (String) llpVar.get(1));
            }
            throw new IllegalStateException("Expected a list of size 0, 1 or 2");
        }
        return a;
    }

    public static dat b(String str) {
        return c(str, "");
    }

    public static dat c(String str, String str2) {
        return new dat(str, dip.o(str2));
    }

    public final String d() {
        boolean e = this.c.e();
        dau.i(e, "Secondary emoji is absent, cannot create mixing query parameter");
        if (!e) {
            return "";
        }
        String str = this.b;
        return str + "_" + ((String) this.c.a());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dat) {
            dat datVar = (dat) obj;
            if (this.b.equals(datVar.b) && this.c.equals(datVar.c)) {
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
        String obj = this.c.toString();
        return "ContentSuggestionQueries{primaryEmoji=" + str + ", secondaryEmoji=" + obj + "}";
    }

    public dat() {
    }
}
