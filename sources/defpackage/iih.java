package defpackage;

import android.net.Uri;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: iih  reason: default package */
/* loaded from: classes.dex */
public final class iih {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/net/common/HttpRequest");
    public static final lgb b = jdg.n(cqg.r);
    public final lnj c;
    public final Uri d;
    public final iil e;
    public final int f;
    public final int g;
    private final String h;
    private final long i;
    private final String j;

    public iih() {
    }

    public iih(lnj lnjVar, String str, int i, Uri uri, iil iilVar, long j, String str2, int i2) {
        this.c = lnjVar;
        this.h = str;
        this.f = i;
        this.d = uri;
        this.e = iilVar;
        this.i = j;
        this.j = str2;
        this.g = i2;
    }

    public static iig a() {
        iig iigVar = new iig();
        iigVar.e(iil.a);
        iigVar.c(-1L);
        iigVar.i(lrq.b);
        String str = (String) b.a();
        if (str != null) {
            iigVar.a = str;
            iigVar.f(4);
            return iigVar;
        }
        throw new NullPointerException("Null userAgent");
    }

    public static String b(long j) {
        Locale locale = Locale.US;
        Long valueOf = Long.valueOf(j);
        return String.format(locale, "max-age=%d, max-stale=%d", valueOf, valueOf);
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof iih) {
            iih iihVar = (iih) obj;
            if (lre.z(this.c, iihVar.c) && ((str = this.h) != null ? str.equals(iihVar.h) : iihVar.h == null)) {
                int i = this.f;
                int i2 = iihVar.f;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 1 && this.d.equals(iihVar.d) && this.e.equals(iihVar.e) && this.i == iihVar.i && this.j.equals(iihVar.j)) {
                    int i3 = this.g;
                    int i4 = iihVar.g;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == i4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() ^ (-721379959)) * 1000003;
        String str = this.h;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        if (this.f != 0) {
            int hashCode3 = this.d.hashCode();
            int hashCode4 = this.e.hashCode();
            long j = this.i;
            int hashCode5 = this.j.hashCode();
            int i = this.g;
            iin.f(i);
            return ((((((((((hashCode2 ^ 1) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ hashCode5) * 1000003) ^ i;
        }
        throw null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String str = this.h;
        int i = this.f;
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        long j = this.i;
        String str2 = this.j;
        int i2 = this.g;
        return "HttpRequest{body=null, headers=" + valueOf + ", contentType=" + str + ", method=" + iin.g(i) + ", uri=" + valueOf2 + ", networkRequestFeature=" + valueOf3 + ", cacheExpirationTimeInSeconds=" + j + ", userAgent=" + str2 + ", priority=" + iin.e(i2) + "}";
    }
}
