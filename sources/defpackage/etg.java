package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: etg  reason: default package */
/* loaded from: classes.dex */
public final class etg implements etf {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/theme/listing/PackagedThemesMegapacksManager");
    private static volatile etg d;
    public final bze b;
    public final Map c = new ConcurrentHashMap();
    private final mkr e;
    private final mkr f;
    private final ett g;

    private etg(Context context) {
        bze a2 = bzd.a(context);
        mks a3 = gxo.a(9);
        mks a4 = gxo.a(10);
        ett c = ett.c(context);
        this.b = a2;
        this.e = a3;
        this.f = a4;
        this.g = c;
    }

    public static etg c(Context context) {
        etg etgVar = d;
        if (etgVar == null) {
            synchronized (etg.class) {
                etgVar = d;
                if (etgVar == null) {
                    etgVar = new etg(context.getApplicationContext());
                    d = etgVar;
                }
            }
        }
        return etgVar;
    }

    public static File d(byy byyVar) {
        if (byyVar == null || byyVar.i()) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/theme/listing/PackagedThemesMegapacksManager", "findFileFromPackSet", 236, "PackagedThemesMegapacksManager.java")).t("findFileAndNotifyListener() : Received unexpectedly null or empty packset.");
            return null;
        }
        if (byyVar.a() > 1) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/theme/listing/PackagedThemesMegapacksManager", "findFileFromPackSet", 242, "PackagedThemesMegapacksManager.java")).u("findFileAndNotifyListener() : Unexpected packset size =%d.", byyVar.a());
        }
        Iterator it = byyVar.g().iterator();
        if (!it.hasNext()) {
            return null;
        }
        return byyVar.f(((juc) it.next()).i());
    }

    public static String e(String str) {
        return "downloaded_theme_".concat(String.valueOf(jbs.a(str)));
    }

    public static void f(ete eteVar, String str, File file) {
        gyc.b.execute(new epv(file, eteVar, str, 2));
    }

    @Override // defpackage.etf
    public final void a(String str, File file, boolean z, ete eteVar, String str2) {
        ltg ltgVar = a;
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/theme/listing/PackagedThemesMegapacksManager", "requestThemePackage", 115, "PackagedThemesMegapacksManager.java")).J("requestThemePackage() : url = %s, file = %s, isRestore = %s", str, file, Boolean.valueOf(z));
        int i = this.g.g.get();
        if (i <= 0) {
            ((ltd) ((ltd) ltgVar.d()).k("com/google/android/apps/inputmethod/libs/theme/listing/PackagedThemesMegapacksManager", "requestThemePackage", 122, "PackagedThemesMegapacksManager.java")).t("requestThemePackage() : Unexpected manifest version.");
            f(eteVar, str, null);
            return;
        }
        String concat = "themes_".concat(String.valueOf(str2));
        mkr mkrVar = z ? this.f : this.e;
        bze bzeVar = this.b;
        bzt a2 = bzu.a("themes");
        a2.e = 500;
        a2.f = 300;
        a2.b(new jpy(mkrVar));
        bzeVar.i(a2.a());
        jub p = juc.p();
        p.d(str);
        p.m("themes");
        p.l(e(str));
        p.a = jtr.c("themes", i);
        p.o(false);
        juc a3 = p.a();
        bze bzeVar2 = this.b;
        llp r = llp.r(a3);
        eth ethVar = new eth(((bzr) this.b).j.a());
        bzt a4 = bzu.a(concat);
        a4.e = 500;
        a4.f = 300;
        bzr bzrVar = (bzr) bzeVar2;
        kcu.U(mio.h(mkh.q(mio.h(bzrVar.m("themes"), new bzq(bzrVar, a4.a(), concat, ethVar, i, r), bzrVar.i)), new dvb(this, concat, 5), mkrVar), new cvt(this, eteVar, str, 6), mkrVar);
    }

    @Override // defpackage.etf
    public final File b(String str) {
        byy byyVar = (byy) this.c.get(jbs.a(str));
        if (byyVar == null) {
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/theme/listing/PackagedThemesMegapacksManager", "getDownloadedThemeFile", 152, "PackagedThemesMegapacksManager.java")).w("getDownloadedThemeFile() : No packSet for %s.", str);
            return null;
        }
        return d(byyVar);
    }
}
