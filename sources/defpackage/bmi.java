package defpackage;

import java.net.URL;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: bmi  reason: default package */
/* loaded from: classes.dex */
public final class bmi {
    public static final ltg a = ltg.j("com/google/android/apps/gsa/shared/io/HttpRequestData");
    public static final lmz b = lmz.u("GET", "HEAD", "POST", "PUT");
    public static final lmz c = lmz.t("GET", "HEAD", "PUT");
    public static final lmz d = lmz.w("Authorization".toLowerCase(Locale.US), "Cookie".toLowerCase(Locale.US), "From".toLowerCase(Locale.US), "If-Modified-Since".toLowerCase(Locale.US), "If-Range".toLowerCase(Locale.US), "If-Unmodified-Since".toLowerCase(Locale.US), "Max-Forwards".toLowerCase(Locale.US), "Proxy-Authorization".toLowerCase(Locale.US), "Referer".toLowerCase(Locale.US), "User-Agent".toLowerCase(Locale.US));
    public final URL e;
    public final String f;
    public final llp g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final boolean q;
    public final bmq r;
    public final StackTraceElement[] s;

    static {
        lmz.v("Range".toLowerCase(Locale.US), "User-Agent".toLowerCase(Locale.US), "Accept-Encoding".toLowerCase(Locale.US), "Content-Type".toLowerCase(Locale.US), "Icy-MetaData".toLowerCase(Locale.US));
    }

    public bmi(bmh bmhVar) {
        int i;
        boolean z;
        URL url = bmhVar.b;
        jdg.u(url);
        this.e = url;
        jdg.v(b.contains(bmhVar.a));
        String str = bmhVar.a;
        jdg.u(str);
        this.f = str;
        llp o = llp.o(bmhVar.c);
        this.g = o;
        int size = o.size();
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (int i2 = 0; i2 < size; i2++) {
            bme bmeVar = (bme) o.get(i2);
            if (bmeVar.a.equalsIgnoreCase("Cache-Control")) {
                z3 |= bmeVar.b.toLowerCase(Locale.US).contains("no-cache");
                if (bmeVar.b.toLowerCase(Locale.US).contains("no-store")) {
                    z4 = true;
                }
            }
        }
        this.q = !z3 || !z4;
        this.h = bmhVar.g;
        this.i = bmhVar.d;
        this.j = bmhVar.e;
        this.k = bmhVar.f;
        jdg.v(bmhVar.h != -1);
        this.l = bmhVar.h;
        int i3 = bmhVar.i;
        b(i3);
        this.m = i3;
        int i4 = bmhVar.j;
        b(i4);
        this.n = i4;
        int i5 = bmhVar.k;
        b(i5);
        if (i5 == -1 || i3 == -1) {
            i = i5;
            z = true;
        } else {
            z = i3 > 0;
            i = 0;
        }
        jdg.y(z, "Invalid timeout value: %s.", i);
        jdg.y((i == -1 || i4 == -1 || i4 > 0) ? true : z2, "Invalid timeout value: %s.", i);
        this.o = i5;
        this.p = bmhVar.l;
        bmq bmqVar = bmhVar.m;
        jdg.u(bmqVar);
        this.r = bmqVar;
        StackTraceElement[] stackTraceElementArr = bmhVar.n;
        if (stackTraceElementArr == null) {
            this.s = new Throwable().getStackTrace();
        } else {
            this.s = stackTraceElementArr;
        }
    }

    public static bmh a() {
        bmh bmhVar = new bmh();
        jdg.v(b.contains("POST"));
        bmhVar.a = "POST";
        bmhVar.b();
        bmhVar.c("Cache-Control", "no-cache, no-store");
        bmhVar.g = true;
        return bmhVar;
    }

    public static void b(int i) {
        boolean z = true;
        if (i <= 0) {
            if (i == -1) {
                i = -1;
            } else {
                z = false;
            }
        }
        jdg.y(z, "Invalid timeout value: %s.", i);
    }
}
