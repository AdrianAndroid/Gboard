package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ceq  reason: default package */
/* loaded from: classes.dex */
public final class ceq {
    public static final lug a = lug.i("SuperDelight");
    public final bze b;
    public final Executor c;
    public final Context d;
    public volatile byy e = byy.a;
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    private final idk g;

    public ceq(Context context, idk idkVar, bze bzeVar, Executor executor) {
        this.d = context;
        this.g = idkVar;
        this.b = bzeVar;
        this.c = executor;
    }

    public static juc a(byy byyVar, Locale locale, String str) {
        for (juc jucVar : byyVar.g()) {
            if (locale.equals(cei.g(jucVar))) {
                String b = jucVar.n().b("appName", "");
                if (!TextUtils.isEmpty(b) && iqe.g(b).j(str)) {
                    return jucVar;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        mko h;
        Object obj;
        ((luc) ((luc) a.b()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightAppsSuperpacksManager", "initializeDelightAppsSuperpacks", 92, "SuperDelightAppsSuperpacksManager.java")).t("initializeDelightAppsSuperpacks()");
        xv xvVar = new xv((String) cfd.e.c(), Integer.valueOf((int) ((Long) cfd.f.c()).longValue()));
        if (TextUtils.isEmpty((CharSequence) xvVar.a) || (obj = xvVar.b) == null || ((Integer) obj).intValue() < 0) {
            this.e = byy.a;
            h = mio.h(mkh.q(this.b.c("delight_apps")), new bzf(this, 7), this.c);
        } else {
            h = mio.h(mkh.q(cfd.b(this.d).c("delight_apps", ((Integer) xvVar.b).intValue(), jsv.k((String) xvVar.a))), new bzf(this, 8), this.c);
        }
        try {
            cfd.b(this.d);
            List n = cfd.n();
            jyu g = jsq.g();
            g.e("enabledLocales", n);
            mko g2 = mio.g(mio.h(mio.h(h, new bxo(this, g.b(), 10), this.c), new bzf(this, 6), this.c), new byi(this, 6), mjl.a);
            if (!((Boolean) cas.d.c()).booleanValue()) {
                return;
            }
            kcu.U(g2, new buo(this, 4), this.c);
        } catch (cen unused) {
            this.g.e(cap.SUPER_DELIGHT_NO_INPUT_METHOD_ENTRIES_IN_SYNC, "delight_apps");
        }
    }
}
