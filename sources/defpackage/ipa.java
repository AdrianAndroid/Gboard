package defpackage;

/* compiled from: PG */
/* renamed from: ipa  reason: default package */
/* loaded from: classes.dex */
public final class ipa {
    public final String a;
    public final llp b;
    public final llw c;
    public final lmz d;

    public ipa() {
    }

    public ipa(String str, llp llpVar, llw llwVar, lmz lmzVar) {
        this.a = str;
        this.b = llpVar;
        this.c = llwVar;
        this.d = lmzVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ipa) {
            ipa ipaVar = (ipa) obj;
            if (this.a.equals(ipaVar.a) && lre.I(this.b, ipaVar.b) && lre.z(this.c, ipaVar.c) && this.d.equals(ipaVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        return "DBConfig{name=" + str + ", tableConfigs=" + valueOf + ", commonFields=" + valueOf2 + ", commonIndexFields=" + valueOf3 + "}";
    }
}
