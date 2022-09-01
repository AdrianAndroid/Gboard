package defpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: gmc  reason: default package */
/* loaded from: classes.dex */
final class gmc implements gma {
    private static final ltg a = ltg.j("com/google/android/libraries/gsa/io/impl/RedirectWrapper");
    private final bmi b;
    private final lfb c;
    private final gmb d;
    private int e;
    private URL f;
    private blw g;
    private final List h = new ArrayList();

    public gmc(bmi bmiVar, blw blwVar, int i, lfb lfbVar, gmb gmbVar) {
        this.b = bmiVar;
        this.e = i;
        this.c = lfbVar;
        this.f = bmiVar.e;
        this.g = blwVar;
        this.d = gmbVar;
    }

    private static void d(bmj bmjVar) {
        try {
            bmjVar.a().c();
        } catch (blb | bmd unused) {
        }
    }

    private static URL e(bmr bmrVar, URL url, bmh bmhVar) {
        url.toString();
        try {
            URL url2 = new URL(bmrVar.b());
            bmhVar.b = url2;
            for (Map.Entry entry : bmrVar.a().entrySet()) {
                bmhVar.c((String) entry.getKey(), (String) entry.getValue());
            }
            return url2;
        } catch (MalformedURLException e) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/libraries/gsa/io/impl/RedirectWrapper", "rewriteRequest", (char) 235, "RedirectWrapper.java")).t("Bad rewritten URL");
            bnh.b(e);
            return url;
        }
    }

    @Override // defpackage.miy
    /* renamed from: b */
    public final synchronized mko a(bmj bmjVar) {
        try {
            nwo c = bmjVar.c();
            if (!c.c() || !this.b.i) {
                if (!this.h.isEmpty()) {
                    bmjVar = bmjVar.b(this.h);
                }
                return kcu.K(bmjVar);
            } else if (this.e <= 0) {
                throw new blb(262171);
            } else {
                try {
                    URL url = new URL(this.f, c.b("Location", ""));
                    if (this.f.getProtocol().equals("https") && url.getProtocol().equals("http")) {
                        throw new blb(262206);
                    }
                    if (this.g.e()) {
                        this.e--;
                        this.f = url;
                        this.h.add(url);
                        this.g.c();
                        this.g = this.g.d();
                        d(bmjVar);
                        return c();
                    }
                    throw new blb(262198);
                } catch (MalformedURLException e) {
                    throw new blb(e, 262197);
                }
            }
        } catch (blb e2) {
            d(bmjVar);
            return kcu.K(new bln(e2));
        }
    }

    @Override // defpackage.gma
    public final synchronized mko c() {
        bmh bmhVar;
        bmhVar = new bmh(this.b);
        URL url = this.f;
        bmhVar.b = url;
        if (this.b.k && this.c.e()) {
            url = e((bmr) this.c.a(), url, bmhVar);
        }
        this.f = url;
        bmhVar.b();
        return mio.h(this.d.a(bmhVar.a(), this.g).c(), this, mjl.a);
    }
}
