package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Set;

/* compiled from: PG */
/* renamed from: czt  reason: default package */
/* loaded from: classes.dex */
public final class czt implements hho {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/tenoranimation/DynamicArtSuperpacksManager");
    static final hhl b = hhq.h("dynamic_art_superpacks_manifest_url", "https://www.gstatic.com/android/keyboard/dynamic_art/20211015170549/manifest.json");
    static final hhl c = hhq.f("dynamic_art_superpacks_manifest_version", 20211015);
    private static volatile czt g;
    public final bze d;
    public final czj e;
    public hiz f;
    private final mkr h;

    private czt(bze bzeVar, mkr mkrVar, czj czjVar) {
        this.d = bzeVar;
        this.h = mkrVar;
        this.e = czjVar;
    }

    public static czt b(Context context) {
        czt cztVar;
        czt cztVar2 = g;
        if (cztVar2 != null) {
            return cztVar2;
        }
        synchronized (czt.class) {
            if (g == null) {
                bze a2 = bzd.a(context);
                czt cztVar3 = new czt(a2, gxo.a(19), czj.b);
                bzt a3 = bzu.a("dynamic_art");
                a3.e = 300;
                a3.f = 300;
                a2.i(a3.a());
                hhq.p(cztVar3, b, c, czu.a);
                g = cztVar3;
            }
            cztVar = g;
        }
        return cztVar;
    }

    public static File c(String str, byy byyVar) {
        for (String str2 : byyVar.h()) {
            if (str.equals(byyVar.e(str2).n().b("label", null))) {
                return byyVar.f(str2);
            }
        }
        return null;
    }

    public final void d(boolean z) {
        jsv k;
        if (!iqi.g(czu.a)) {
            return;
        }
        hiz hizVar = this.f;
        if (hizVar != null && !hizVar.isDone()) {
            if (!z) {
                return;
            }
            this.f.cancel(false);
        }
        if (((Boolean) czu.f.c()).booleanValue()) {
            jsu j = jsv.j();
            j.a = (String) b.c();
            j.d(1);
            j.g(2);
            k = j.a();
        } else {
            k = jsv.k((String) b.c());
        }
        hiz s = hiz.k(this.d.e("dynamic_art", ((Long) c.c()).intValue(), k)).v(new coa(this, 6), this.h).v(new coa(this, 7), this.h).s(new cij(this, 3), this.h);
        s.F(new cbx(3), this.h);
        this.f = s;
    }

    @Override // defpackage.hho
    public final void gW(Set set) {
        d(true);
    }
}
