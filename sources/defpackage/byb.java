package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* renamed from: byb  reason: default package */
/* loaded from: classes.dex */
public abstract class byb {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/crank/modelmanager/AbstractModelManager");
    private final mkr b;
    public final lug c;
    public final bze d;
    private hiz h;
    private final hho i;
    public final CopyOnWriteArraySet e = new CopyOnWriteArraySet();
    final Object g = new Object();
    byy f = byy.a;

    public byb(String str, bze bzeVar, mkr mkrVar) {
        bya byaVar = new bya(this, 0);
        this.i = byaVar;
        this.c = lug.i(str);
        this.d = bzeVar;
        this.b = mkrVar;
        bzeVar.i(c());
        hhq.p(byaVar, f(), g());
    }

    protected abstract bzu c();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract hhl d();

    protected abstract hhl e();

    protected abstract hhl f();

    protected abstract hhl g();

    public abstract jqk h();

    protected abstract String i();

    public abstract String j();

    public final byz k(Locale locale, String str) {
        byy byyVar;
        String str2;
        lyu a2 = lyu.a();
        try {
            byx b = byy.b();
            a2.d(b);
            try {
                byyVar = (byy) this.d.b(j()).get();
            } catch (InterruptedException | ExecutionException unused) {
                ((luc) ((luc) this.c.d()).k("com/google/android/apps/inputmethod/libs/crank/modelmanager/AbstractModelManager", "getPacks", 371, "AbstractModelManager.java")).t("getPacks()");
                byyVar = bze.a;
            }
            a2.d(byyVar);
            byyVar.i();
            if (byyVar.i()) {
                return null;
            }
            String i = i();
            Iterator it = byyVar.g().iterator();
            while (true) {
                if (!it.hasNext()) {
                    ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/crank/modelmanager/AbstractModelManager", "getPackNameForModel", 361, "AbstractModelManager.java")).w("Could not find pack that supports %s", locale);
                    str2 = null;
                    break;
                }
                juc jucVar = (juc) it.next();
                if (i.equals(jucVar.n().b("label", null))) {
                    String b2 = jucVar.n().b("locale", null);
                    String b3 = jucVar.n().b("locales", null);
                    if (b2 == null && b3 == null) {
                        b2 = str;
                    }
                    if (locale == null) {
                        str2 = jucVar.i();
                        break;
                    } else if (b3 != null || b2 != null) {
                        if (b2 != null && jay.h(jay.f(b2), locale)) {
                            str2 = jucVar.i();
                            break;
                        } else if (b3 != null && jay.j(b3, locale)) {
                            str2 = jucVar.i();
                            break;
                        }
                    } else {
                        ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/crank/modelmanager/AbstractModelManager", "getPackNameForModel", 349, "AbstractModelManager.java")).w("%s not opened, pack was expected to specify supported locales", jucVar.i());
                    }
                }
            }
            if (TextUtils.isEmpty(str2)) {
                ((luc) ((luc) this.c.c()).k("com/google/android/apps/inputmethod/libs/crank/modelmanager/AbstractModelManager", "openPack", 264, "AbstractModelManager.java")).w("openPack(): no `%s` pack found, did you set the correct label?", str2);
                try {
                    a2.close();
                } catch (IOException e) {
                    ((luc) ((luc) ((luc) this.c.c()).i(e)).k("com/google/android/apps/inputmethod/libs/crank/modelmanager/AbstractModelManager", "openPack", (char) 292, "AbstractModelManager.java")).t("openPack()");
                }
                return null;
            }
            jtr d = byyVar.d();
            if (d == null) {
                ((luc) ((luc) this.c.c()).k("com/google/android/apps/inputmethod/libs/crank/modelmanager/AbstractModelManager", "openPack", 270, "AbstractModelManager.java")).w("openPack(): invalid superpack for packSet %s", byyVar);
                try {
                    a2.close();
                } catch (IOException e2) {
                    ((luc) ((luc) ((luc) this.c.c()).i(e2)).k("com/google/android/apps/inputmethod/libs/crank/modelmanager/AbstractModelManager", "openPack", (char) 292, "AbstractModelManager.java")).t("openPack()");
                }
                return null;
            }
            int a3 = d.a();
            hhl e3 = e();
            if (a3 < (e3 != null ? ((Long) e3.c()).intValue() : 0)) {
                try {
                    a2.close();
                } catch (IOException e4) {
                    ((luc) ((luc) ((luc) this.c.c()).i(e4)).k("com/google/android/apps/inputmethod/libs/crank/modelmanager/AbstractModelManager", "openPack", (char) 292, "AbstractModelManager.java")).t("openPack()");
                }
                return null;
            }
            byz c = byyVar.c(str2);
            a2.d(c);
            b.b(c);
            byy a4 = b.a();
            a2.d(a4);
            synchronized (this.g) {
                byx b4 = byy.b();
                b4.c(this.f);
                b4.c(a4);
                byy a5 = b4.a();
                this.f.close();
                this.f = a5;
            }
            try {
                a2.close();
            } catch (IOException e5) {
                ((luc) ((luc) ((luc) this.c.c()).i(e5)).k("com/google/android/apps/inputmethod/libs/crank/modelmanager/AbstractModelManager", "openPack", (char) 292, "AbstractModelManager.java")).t("openPack()");
            }
            return c;
        } finally {
            try {
                a2.close();
            } catch (IOException e6) {
                ((luc) ((luc) ((luc) this.c.c()).i(e6)).k("com/google/android/apps/inputmethod/libs/crank/modelmanager/AbstractModelManager", "openPack", (char) 292, "AbstractModelManager.java")).t("openPack()");
            }
        }
    }

    public final mko l() {
        return m(null);
    }

    public final mko m(Locale locale) {
        if (hji.e(this.h)) {
            return this.h.t();
        }
        this.h = null;
        int intValue = ((Long) g().c()).intValue();
        hhl e = e();
        if (intValue < (e != null ? ((Long) e.c()).intValue() : 0)) {
            return mkk.a;
        }
        hiz v = hiz.k(this.d.e(j(), intValue, jsv.k((String) f().c()))).v(new bzf(this, 1), this.b);
        v.F(new bvo(this, locale, 3), this.b);
        this.h = v;
        return v.t();
    }

    public final void n(byd bydVar) {
        this.e.add(bydVar);
    }

    public final void o() {
        synchronized (this.g) {
            this.f.close();
            this.f = byy.a;
        }
    }

    public final void p(byd bydVar) {
        this.e.remove(bydVar);
    }
}
