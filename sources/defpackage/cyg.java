package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* renamed from: cyg  reason: default package */
/* loaded from: classes.dex */
public final class cyg implements ihs {
    public final llp a;
    private final Locale b;
    private final iij c;

    public cyg(Locale locale, llp llpVar, iij iijVar) {
        if (locale != null) {
            this.b = locale;
            if (llpVar != null) {
                this.a = llpVar;
                if (iijVar != null) {
                    this.c = iijVar;
                    return;
                }
                throw new NullPointerException("Null httpResponse");
            }
            throw new NullPointerException("Null tags");
        }
        throw new NullPointerException("Null locale");
    }

    public static cyg b(String str, llp llpVar, iij iijVar) {
        return new cyg(jay.f(str), llpVar, iijVar);
    }

    @Override // defpackage.ihs
    public final iij a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyg) {
            cyg cygVar = (cyg) obj;
            if (this.b.equals(cygVar.b) && lre.I(this.a, cygVar.a) && this.c.equals(cygVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String obj = this.b.toString();
        String obj2 = this.a.toString();
        String obj3 = this.c.toString();
        return "TenorCategoryResponse{locale=" + obj + ", tags=" + obj2 + ", httpResponse=" + obj3 + "}";
    }

    public cyg() {
    }
}
