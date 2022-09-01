package defpackage;

import android.net.Uri;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* renamed from: gla  reason: default package */
/* loaded from: classes.dex */
public final class gla implements gma {
    private static final ltg b = ltg.j("com/google/android/libraries/gsa/io/impl/CookieWrapper");
    public final bmi a;
    private final nox c;
    private final URL d;
    private final lfb e;
    private final gle f;
    private final gnn g;
    private final lfb h;
    private final gmb i;
    private blw j;
    private boolean k = false;

    public gla(bmi bmiVar, blw blwVar, nox noxVar, lfb lfbVar, gle gleVar, gnn gnnVar, lfb lfbVar2, gmb gmbVar) {
        this.a = bmiVar;
        this.j = blwVar;
        this.c = noxVar;
        this.e = lfbVar;
        this.f = gleVar;
        this.g = gnnVar;
        this.h = lfbVar2;
        this.i = gmbVar;
        this.d = bmiVar.e;
    }

    private final mko e(bmj bmjVar) {
        ((blv) this.c.a()).a();
        g(bmjVar);
        return f();
    }

    private final synchronized mko f() {
        if (!this.j.e()) {
            return kcu.K(new bln(new blb(262204)));
        }
        this.j.c();
        this.j = this.j.d();
        this.k = true;
        return c();
    }

    private static void g(bmj bmjVar) {
        try {
            bmjVar.a().c();
        } catch (blb | bmd unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.miy
    /* renamed from: b */
    public final synchronized mko a(bmj bmjVar) {
        if (!this.a.h) {
            return kcu.K(bmjVar);
        }
        try {
            nwo c = bmjVar.c();
            if (c.b("Refresh-Google-Creds", null) != null) {
                ((ltd) ((ltd) b.d()).k("com/google/android/libraries/gsa/io/impl/CookieWrapper", "hasRefreshCookiesHeader", 228, "CookieWrapper.java")).t("Got header to refresh cookies.");
                lfb lfbVar = this.h;
                if (lfbVar.e()) {
                    int i = true != this.k ? 262228 : 262227;
                    bvq bvqVar = (bvq) ((nox) lfbVar.a()).a();
                    new blb(i);
                    throw null;
                } else if (!this.k) {
                    return e(bmjVar);
                }
            }
            String b2 = c.b("Location", null);
            if (this.a.l != 4 && c.c() && b2 != null && this.e.e()) {
                Uri.parse(b2);
                if (((bmk) ((nox) this.e.a()).a()).a()) {
                    if (this.k) {
                        throw new blb(262203);
                    }
                    return e(bmjVar);
                }
            }
            if (this.a.h) {
                blv blvVar = (blv) this.c.a();
                this.d.toExternalForm();
                ArrayList arrayList = new ArrayList();
                ?? r0 = c.b;
                int size = r0.size();
                for (int i2 = 0; i2 < size; i2++) {
                    bme bmeVar = (bme) r0.get(i2);
                    if (bmeVar.a.equalsIgnoreCase("Set-Cookie")) {
                        arrayList.add(bmeVar.b);
                    }
                }
                Collections.unmodifiableList(arrayList);
                blvVar.c();
            }
            return kcu.K(bmjVar);
        } catch (blb e) {
            g(bmjVar);
            return kcu.K(new bln(e));
        }
    }

    @Override // defpackage.gma
    public final synchronized mko c() {
        bmi bmiVar = this.a;
        if (!bmiVar.h && !this.k) {
            return d(bmiVar);
        }
        this.d.toExternalForm();
        mko g = mhu.g(((blv) this.c.a()).b(), blb.class, fxd.h, mjl.a);
        gnn gnnVar = this.g;
        return mio.h(g, new dvb(((gnp) gnnVar).a, new opu(this), 16, null, null, null, null), new glh((gnp) gnnVar, 6));
    }

    public final synchronized mko d(bmi bmiVar) {
        lty ltyVar = luh.a;
        this.f.b();
        return mio.h(this.i.a(bmiVar, this.j).c(), this, mjl.a);
    }
}
