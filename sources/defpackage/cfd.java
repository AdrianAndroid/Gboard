package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import com.google.android.inputmethod.latin.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: cfd  reason: default package */
/* loaded from: classes.dex */
public final class cfd {
    public static final hhl a;
    public static final hhl b;
    public static final hhl c;
    public static final hhl d;
    public static final hhl e;
    public static final hhl f;
    public static final hhl g = hhq.a("enable_next_generation_hwr_support", false);
    public static final lug h = lug.i("SuperDelight");
    private static final lmz p;
    private static volatile cfd q;
    public final Context i;
    public final bze j;
    public final ceq k;
    public final mkr m;
    public final hho o;
    private final idk r;
    private final Object s = new Object();
    private byy t = bze.a;
    private final AtomicBoolean u = new AtomicBoolean(false);
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final AtomicReference n = new AtomicReference(new ArrayList());

    static {
        hhl h2 = hhq.h("delight_metadata_uri", cem.a);
        a = h2;
        hhl f2 = hhq.f("delight_latest_metadata_version", 2022072200L);
        b = f2;
        hhl h3 = hhq.h("delight_overrides_metadata_uri", "");
        c = h3;
        hhl f3 = hhq.f("delight_latest_overrides_metadata_version", -1L);
        d = f3;
        hhl h4 = hhq.h("delight_apps_metadata_uri", "");
        e = h4;
        hhl f4 = hhq.f("delight_apps_metadata_version", -1L);
        f = f4;
        p = lmz.w(h4, f4, h2, f2, h3, f3, new hhl[0]);
    }

    private cfd(Context context) {
        mks a2 = gxo.a(2);
        bze a3 = bzd.a(context);
        hrx.y(context);
        ieh j = ieh.j();
        bya byaVar = new bya(this, 3);
        this.o = byaVar;
        this.i = context;
        this.m = a2;
        this.j = a3;
        this.r = j;
        hhq.o(byaVar, p);
        ceq ceqVar = new ceq(context, j, a3, a2);
        this.k = ceqVar;
        cfl cflVar = new cfl(context, jan.b, a2, ieh.j());
        cfj cfjVar = new cfj(context, jan.b, a2, ieh.j());
        bzt a4 = bzu.a("delight");
        a4.b = new ceu();
        a4.d = cflVar;
        a4.b(cfjVar);
        a4.e = 500;
        a4.f = 500;
        a3.i(a4.a());
        bzt a5 = bzu.a("delight_overrides");
        a5.b = new ceu();
        a5.d = cflVar;
        a5.e = 300;
        a5.f = 300;
        a3.i(a5.a());
        bzt a6 = bzu.a("bundled_delight");
        a6.b = new ces(context, ieh.j());
        a6.d = cflVar;
        a6.b(cfjVar);
        a6.b(new cfh(context, jan.b, a2, ieh.j()));
        a6.e = 500;
        a6.f = 500;
        a3.i(a6.a());
        bze bzeVar = ceqVar.b;
        bzt a7 = bzu.a("delight_apps");
        a7.b = new ceo();
        a7.d = cflVar;
        a7.e = 300;
        a7.f = 300;
        bzeVar.i(a7.a());
    }

    public static cfd b(Context context) {
        cfd cfdVar = q;
        if (cfdVar == null) {
            synchronized (cfd.class) {
                cfdVar = q;
                if (cfdVar == null) {
                    cfdVar = new cfd(context.getApplicationContext());
                    q = cfdVar;
                }
            }
        }
        return cfdVar;
    }

    public static final List n() {
        return cat.a(hqr.b());
    }

    private final void o(List list) {
        ((luc) ((luc) h.b()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightManager", "deletePacks", 962, "SuperDelightManager.java")).w("SuperDelightManager#deletePacks(): chosen for deletion %s", list);
        try {
            this.j.a("delight", list).get(30L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            ((luc) ((luc) ((luc) h.c()).i(e2)).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightManager", "deletePacks", (char) 970, "SuperDelightManager.java")).t("SuperDelightManager#deletePacks(1)");
        }
    }

    private final void p(byy byyVar) {
        synchronized (this.s) {
            h();
            m(byyVar);
        }
    }

    public final Delight5Facilitator a() {
        return Delight5Facilitator.h(this.i);
    }

    public final mko c(String str, int i, jsv jsvVar) {
        return this.j.e(str, i, jsvVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final mko d() {
        return mio.h(this.j.c("delight_overrides"), new bzf(this, 9), this.m);
    }

    public final mko e(boolean z) {
        return this.j.b(true != z ? "delight" : "bundled_delight");
    }

    public final mko f() {
        mko mkoVar;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final boolean z = !this.u.getAndSet(true);
        if (z) {
            ((luc) ((luc) h.b()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightManager", "syncBundledLanguageModels", 732, "SuperDelightManager.java")).t("syncBundledLanguageModels(): clearing bundled_delight selection");
            bzr bzrVar = (bzr) this.j;
            mkoVar = mio.h(mio.h(bzrVar.m("bundled_delight"), new bzi(bzrVar, 1), bzrVar.i), new bzh(bzrVar, 3), bzrVar.i);
        } else {
            mkoVar = mkk.a;
        }
        mko h2 = mio.h(mkoVar, new miy() { // from class: cez
            @Override // defpackage.miy
            public final mko a(Object obj) {
                cfd cfdVar = cfd.this;
                boolean z2 = z;
                long j = elapsedRealtime;
                Void r7 = (Void) obj;
                if (z2) {
                    ieh.j().g(caq.SUPER_DELIGHT_BUNDLED_CLEAR_SELECTION_TIME, SystemClock.elapsedRealtime() - j);
                }
                ((luc) ((luc) cfd.h.b()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightManager", "initializeBundledDelightSuperpacks", 374, "SuperDelightManager.java")).t("initializeBundledDelightSuperpacks()");
                return mio.h(cfdVar.c("bundled_delight", 2022072200, jsv.j().a()), new bzf(cfdVar, 10), cfdVar.m);
            }
        }, this.m);
        try {
            List n = n();
            jyu g2 = jsq.g();
            g2.e("enabledLocales", n);
            mko h3 = mio.h(h2, new bxo(this, g2.b(), 14), this.m);
            g(h3, "bundled_delight");
            return h3;
        } catch (cen e2) {
            return kcu.J(e2);
        }
    }

    final void g(mko mkoVar, String str) {
        if (((Boolean) cas.d.c()).booleanValue()) {
            kcu.U(mio.h(mhu.g(mkh.q(mkoVar), Exception.class, bou.f, this.m), new bxo(this, str, 12), this.m), new bvo(this, str, 5), this.m);
        }
    }

    public final void h() {
        synchronized (this.s) {
            try {
                this.t.close();
                this.t = bze.a;
            } catch (IllegalArgumentException e2) {
                ((luc) ((luc) ((luc) h.c()).i(e2)).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightManager", "clearUsedPacks", (char) 835, "SuperDelightManager.java")).t("error clearUsedPacks");
            }
        }
    }

    public final void i() {
        p(bze.a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cei.b());
        arrayList.add(cei.c());
        arrayList.add(cei.d());
        o(arrayList);
    }

    public final void j(List list) {
        ArrayList arrayList = new ArrayList();
        byx b2 = byy.b();
        lyu a2 = lyu.a();
        a2.d(b2);
        try {
            synchronized (this.s) {
                for (juc jucVar : this.t.g()) {
                    if (list.contains(cei.g(jucVar))) {
                        arrayList.add(jucVar.o());
                    } else {
                        byz c2 = this.t.c(jucVar.i());
                        a2.d(c2);
                        b2.b(c2);
                    }
                }
                byy a3 = b2.a();
                a2.d(a3);
                p(a3);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jsr e2 = cei.e((Locale) it.next());
                if (e2 != null) {
                    arrayList.add(e2);
                }
            }
            if (arrayList.isEmpty()) {
                try {
                    a2.close();
                    return;
                } catch (IOException e3) {
                    ((luc) ((luc) ((luc) h.c()).i(e3)).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightManager", "deleteLanguageModelPacksInternal", (char) 947, "SuperDelightManager.java")).t("SuperDelightManager#deleteLanguageModelPacks()");
                    return;
                }
            }
            o(arrayList);
            try {
                a2.close();
            } catch (IOException e4) {
                ((luc) ((luc) ((luc) h.c()).i(e4)).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightManager", "deleteLanguageModelPacksInternal", (char) 947, "SuperDelightManager.java")).t("SuperDelightManager#deleteLanguageModelPacks()");
            }
        } catch (Throwable th) {
            try {
                a2.close();
            } catch (IOException e5) {
                ((luc) ((luc) ((luc) h.c()).i(e5)).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightManager", "deleteLanguageModelPacksInternal", (char) 947, "SuperDelightManager.java")).t("SuperDelightManager#deleteLanguageModelPacks()");
            }
            throw th;
        }
    }

    public final void k(boolean z) {
        xv a2;
        mko K;
        Object obj;
        if (!((Boolean) cat.a.c()).booleanValue()) {
            lug lugVar = h;
            ((luc) ((luc) lugVar.b()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightManager", "initializeDelightSuperpacks", 338, "SuperDelightManager.java")).t("initializeDelightSuperpacks()");
            int F = ino.M(this.i).F(R.string.f165150_resource_name_obfuscated_res_0x7f14084a, 0);
            String y = ino.M(this.i).y(R.string.f165140_resource_name_obfuscated_res_0x7f140849);
            if (F <= 0 || TextUtils.isEmpty(y)) {
                int intValue = ((Long) b.c()).intValue();
                String str = (String) a.c();
                String str2 = cem.a;
                if (intValue < 2022072200 || TextUtils.isEmpty(str)) {
                    ((luc) ((luc) lugVar.b()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightManager", "getDelightMetadataUriAndVersion", 1005, "SuperDelightManager.java")).z("getDelightMetadataUriAndVersion(): Defaults : %d : %s", 2022072200, str2);
                    a2 = xv.a(str2, 2022072200);
                } else {
                    ((luc) ((luc) lugVar.b()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightManager", "getDelightMetadataUriAndVersion", 1009, "SuperDelightManager.java")).z("getDelightMetadataUriAndVersion(): Phenotype : %d : %s", intValue, str);
                    a2 = xv.a(str, Integer.valueOf(intValue));
                }
            } else {
                ((luc) ((luc) lugVar.b()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightManager", "getDelightMetadataUriAndVersion", 995, "SuperDelightManager.java")).z("getDelightMetadataUriAndVersion(): Override : %d : %s", F, y);
                a2 = xv.a(y, Integer.valueOf(F));
            }
            if (a2.a == null || (obj = a2.b) == null) {
                K = kcu.K(-1);
            } else {
                int intValue2 = ((Integer) obj).intValue();
                jsu j = jsv.j();
                j.a = (String) a2.a;
                j.d(2);
                K = mio.h(mio.h(mio.h(this.j.c("delight"), new dke(this, intValue2, j.a(), 1), this.m), new bzf(this, 14), this.m), new bzf(this, 11), this.m);
            }
            cdx.b(this.i);
            try {
                List n = n();
                jyu g2 = jsq.g();
                g2.e("enabledLocales", n);
                jsq b2 = g2.b();
                mko h2 = mio.h(mio.h(mio.h(K, new bzf(this, 15), this.m), new bxo(this, b2, 15), this.m), new bxo(this, b2, 11), this.m);
                kcu.U(h2, new cek(a(), this, this.r, z, 1), this.m);
                g(h2, "delight");
                this.k.b();
            } catch (cen e2) {
                this.r.e(cap.SUPER_DELIGHT_NO_INPUT_METHOD_ENTRIES_IN_SYNC, "delight");
                kcu.J(e2);
            }
        }
    }

    public final void l() {
        mko h2;
        lug lugVar = h;
        ((luc) ((luc) lugVar.b()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightManager", "initializeOverridesSuperpacks", 400, "SuperDelightManager.java")).t("initializeOverridesSuperpacks()");
        String str = (String) c.c();
        int intValue = ((Long) d.c()).intValue();
        if ((intValue < 0) != TextUtils.isEmpty(str)) {
            ((luc) ((luc) lugVar.d()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightManager", "initializeOverridesSuperpacks", 406, "SuperDelightManager.java")).z("SuperDelightManager#initializeOverridesSuperpacks(): version %d may be negative if and only if URI \"%s\" is empty, ignoring", intValue, str);
            h2 = kcu.K(-1);
        } else if (intValue < 0) {
            h2 = mio.h(this.j.c("delight_overrides"), new bzf(this, 12), this.m);
        } else {
            h2 = mio.h(c("delight_overrides", intValue, jsv.k(str)), new bzf(this, 13), this.m);
        }
        try {
            List n = n();
            jyu g2 = jsq.g();
            g2.e("enabledLocales", n);
            mko h3 = mio.h(h2, new bxo(this, g2.b(), 13), this.m);
            kcu.U(mhu.h(h3, cel.class, cex.a, this.m), new cek(a(), this, this.r, false, 2), this.m);
            g(h3, "delight_overrides");
        } catch (cen unused) {
            this.r.e(cap.SUPER_DELIGHT_NO_INPUT_METHOD_ENTRIES_IN_SYNC, "delight_overrides");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(byy byyVar) {
        synchronized (this.s) {
            byx b2 = byy.b();
            b2.c(this.t);
            b2.c(byyVar);
            byy a2 = b2.a();
            this.t.close();
            this.t = a2;
        }
    }
}
