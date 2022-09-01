package defpackage;

/* compiled from: PG */
/* renamed from: esv  reason: default package */
/* loaded from: classes.dex */
public final class esv {
    public final String a;
    public final String b;

    public esv(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null themeId");
        }
        throw new NullPointerException("Null packageUrl");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof esv) {
            esv esvVar = (esv) obj;
            if (this.a.equals(esvVar.a) && this.b.equals(esvVar.b)) {
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
        String str2 = this.b;
        return "RestorableRemoteThemeItem{packageUrl=" + str + ", themeId=" + str2 + "}";
    }

    public esv() {
    }
}
