package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: cww  reason: default package */
/* loaded from: classes.dex */
public final class cww implements cxa {
    public final String a;
    public final Uri b;
    public final String c;
    private final mbr d;
    private final String e;
    private final iil f;
    private final llp g;

    public cww() {
    }

    public cww(String str, mbr mbrVar, String str2, Uri uri, String str3, iil iilVar, llp llpVar) {
        this.a = str;
        this.d = mbrVar;
        this.e = str2;
        this.b = uri;
        this.c = str3;
        this.f = iilVar;
        this.g = llpVar;
    }

    public static cwv b() {
        cwv cwvVar = new cwv();
        cwvVar.d("");
        cwvVar.f(iil.a);
        cwvVar.c(mbr.UNKNOWN_CONTENT_TYPE);
        return cwvVar;
    }

    public static cww c(cqp cqpVar) {
        cwv b = b();
        b.d(cqpVar.o());
        b.e(cqpVar.d());
        b.b = cqpVar.n();
        b.f(cqpVar.i());
        b.a = cqpVar.r();
        b.c(cqpVar.m());
        return b.a();
    }

    public final cqp a() {
        cqo t = cqp.t();
        t.n(1);
        t.f(1);
        t.g(this.e);
        t.h(this.b);
        t.f = this.c;
        t.l(this.a);
        t.j(this.f);
        t.e(this.d);
        return t.a();
    }

    @Override // defpackage.cxa
    public final Uri d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cww) {
            cww cwwVar = (cww) obj;
            if (this.a.equals(cwwVar.a) && this.d.equals(cwwVar.d) && this.e.equals(cwwVar.e) && this.b.equals(cwwVar.b) && ((str = this.c) != null ? str.equals(cwwVar.c) : cwwVar.c == null) && this.f.equals(cwwVar.f) && lre.I(this.g, cwwVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        return ((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.d);
        String str2 = this.e;
        String valueOf2 = String.valueOf(this.b);
        String str3 = this.c;
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.g);
        return "Sticker{imageTag=" + str + ", contentType=" + valueOf + ", id=" + str2 + ", imageUri=" + valueOf2 + ", contentDescription=" + str3 + ", networkRequestFeature=" + valueOf3 + ", keywords=" + valueOf4 + "}";
    }
}
