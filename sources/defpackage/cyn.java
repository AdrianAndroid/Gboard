package defpackage;

/* compiled from: PG */
/* renamed from: cyn  reason: default package */
/* loaded from: classes.dex */
public final class cyn implements ihs {
    public static final /* synthetic */ int b = 0;
    public final String a;
    private final llp c;
    private final iij d;

    static {
        b("", llp.q(), iij.a);
    }

    public cyn(String str, llp llpVar, iij iijVar) {
        if (str != null) {
            this.a = str;
            if (llpVar != null) {
                this.c = llpVar;
                if (iijVar != null) {
                    this.d = iijVar;
                    return;
                }
                throw new NullPointerException("Null httpResponse");
            }
            throw new NullPointerException("Null results");
        }
        throw new NullPointerException("Null next");
    }

    public static cyn b(String str, llp llpVar, iij iijVar) {
        return new cyn(str, llpVar, iijVar);
    }

    public static cyn c(iij iijVar) {
        return (cyn) iin.h(iijVar, cym.a, cuv.o);
    }

    @Override // defpackage.ihs
    public final iij a() {
        return this.d;
    }

    public final llp d() {
        return e(bzg.q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00dc, code lost:
        if (android.text.TextUtils.isEmpty(r6) != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.llp e(defpackage.lfe r12) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyn.e(lfe):llp");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyn) {
            cyn cynVar = (cyn) obj;
            if (this.a.equals(cynVar.a) && lre.I(this.c, cynVar.c) && this.d.equals(cynVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String obj = this.c.toString();
        String obj2 = this.d.toString();
        return "TenorImageResponse{next=" + str + ", results=" + obj + ", httpResponse=" + obj2 + "}";
    }

    public cyn() {
    }
}
