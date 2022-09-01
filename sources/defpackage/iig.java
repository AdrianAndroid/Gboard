package defpackage;

import android.net.Uri;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: iig  reason: default package */
/* loaded from: classes.dex */
public final class iig {
    public String a;
    private lnj b;
    private String c;
    private Uri d;
    private iil e;
    private long f;
    private byte g;
    private int h;
    private int i;

    public final iih a() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        lnj lnjVar = this.b;
        if (lnjVar == null) {
            throw new IllegalStateException("Property \"headers\" has not been set");
        }
        treeMap.putAll(lnjVar);
        String str = this.a;
        if (str == null) {
            throw new IllegalStateException("Property \"userAgent\" has not been set");
        }
        treeMap.put("User-Agent", str);
        String str2 = this.c;
        if (str2 != null) {
            treeMap.put("Content-Type", str2);
        }
        if (b() >= 0) {
            treeMap.put("Cache-Control", iih.b(b()));
        }
        i(treeMap);
        if (this.g != 1 || this.b == null || this.h == 0 || this.d == null || this.e == null || this.a == null || this.i == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" headers");
            }
            if (this.h == 0) {
                sb.append(" method");
            }
            if (this.d == null) {
                sb.append(" uri");
            }
            if (this.e == null) {
                sb.append(" networkRequestFeature");
            }
            if (this.g == 0) {
                sb.append(" cacheExpirationTimeInSeconds");
            }
            if (this.a == null) {
                sb.append(" userAgent");
            }
            if (this.i == 0) {
                sb.append(" priority");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        iih iihVar = new iih(this.b, this.c, this.h, this.d, this.e, this.f, this.a, this.i);
        if (!iin.c(iihVar.d)) {
            ((ltd) iih.a.a(hip.a).k("com/google/android/libraries/inputmethod/net/common/HttpRequest$Builder", "build", 213, "HttpRequest.java")).w("%s does not have http[s] scheme", iihVar.d);
        }
        return iihVar;
    }

    public final long b() {
        if (this.g != 0) {
            return this.f;
        }
        throw new IllegalStateException("Property \"cacheExpirationTimeInSeconds\" has not been set");
    }

    public final void c(long j) {
        this.f = j;
        this.g = (byte) 1;
    }

    public final void d() {
        this.c = "application/json";
    }

    public final void e(iil iilVar) {
        if (iilVar != null) {
            this.e = iilVar;
            return;
        }
        throw new NullPointerException("Null networkRequestFeature");
    }

    public final void f(int i) {
        if (i != 0) {
            this.i = i;
            return;
        }
        throw new NullPointerException("Null priority");
    }

    public final void g() {
        this.h = 1;
    }

    public final void h(Uri uri) {
        if (uri != null) {
            this.d = uri;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    public final void i(Map map) {
        lnj a = lnj.a(map, String.CASE_INSENSITIVE_ORDER);
        if (a != null) {
            this.b = a;
            return;
        }
        throw new NullPointerException("Null headers");
    }

    public final void j(String str) {
        h(Uri.parse(str));
    }
}
