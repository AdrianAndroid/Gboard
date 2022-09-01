package com.google.android.apps.inputmethod.libs.delight5;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import com.google.android.keyboard.client.delight5.Decoder;
import com.google.android.keyboard.client.delight5.DynamicLm;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Delight5Facilitator implements inm, gzv, bxh {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/delight5/Delight5Facilitator");
    private static volatile Delight5Facilitator u;
    private final jaq A;
    private final exa C;
    private volatile cca G;
    private ija L;
    private boolean N;
    private String O;
    private hho P;
    public final mks b;
    public final Context e;
    public final cct g;
    public final caj h;
    public final DynamicLm i;
    public final ino j;
    public final idk k;
    public final cly l;
    public final bxm m;
    private final ccb orientationListener;
    public mro q;
    public final dbf t;
    private final ceg w;
    private final cee x;
    private final ccr y;
    private final cdh z;
    public final AtomicReference c = new AtomicReference();
    public final AtomicReference d = new AtomicReference();
    private final AtomicBoolean D = new AtomicBoolean(false);
    private final AtomicBoolean E = new AtomicBoolean(false);
    public final AtomicBoolean n = new AtomicBoolean(false);
    private final AtomicBoolean F = new AtomicBoolean(true);
    public final List o = new ArrayList();
    private final ConcurrentHashMap H = new ConcurrentHashMap();
    public final ConcurrentHashMap p = new ConcurrentHashMap();
    private final Map I = new qo();
    private final Map J = new qo();
    public final Runnable r = new cam(this);
    private final ijj K = new ckp(this, 1);
    private String M = "";
    private final iye Q = new can(this);
    private final llp R = llp.s(cas.N, cas.y);
    public final AtomicReference s = new AtomicReference();
    public final jan f = jan.b;
    private final cbd v = cbd.c;
    private final car B = new car();

    public Delight5Facilitator(Context context, ceg cegVar, cee ceeVar, cct cctVar, ccr ccrVar, dbf dbfVar, cdh cdhVar, caj cajVar, DynamicLm dynamicLm, ino inoVar, mks mksVar, jaq jaqVar, idk idkVar, cly clyVar, bxm bxmVar, exa exaVar, byte[] bArr) {
        this.e = context;
        this.w = cegVar;
        this.x = ceeVar;
        this.g = cctVar;
        this.y = ccrVar;
        this.t = dbfVar;
        this.z = cdhVar;
        this.h = cajVar;
        this.i = dynamicLm;
        this.j = inoVar;
        this.b = mksVar;
        this.A = jaqVar;
        this.k = idkVar;
        this.l = clyVar;
        this.m = bxmVar;
        this.C = exaVar;
        ccb ccbVar = new ccb(cajVar);
        this.orientationListener = ccbVar;
        ccbVar.g(mksVar);
        gzt.a.a(this);
    }

    private final synchronized void M() {
        if (!((Boolean) cas.d.c()).booleanValue() || this.N) {
            return;
        }
        cal calVar = new cal(this, 0);
        gzc.b.e("delight", calVar);
        gzc.b.e("bundled_delight", calVar);
        gzc.b.e("delight_overrides", calVar);
        gzc.b.e("delight_apps", calVar);
        this.N = true;
    }

    private final synchronized void N() {
        this.J.clear();
        Iterator it = this.I.entrySet().iterator();
        while (it.hasNext()) {
            if (mvk.DECODING.equals(((xv) ((Map.Entry) it.next()).getValue()).b)) {
                it.remove();
            }
        }
    }

    public static Delight5Facilitator g() {
        Delight5Facilitator delight5Facilitator;
        synchronized (Delight5Facilitator.class) {
            delight5Facilitator = u;
        }
        return delight5Facilitator;
    }

    public static Delight5Facilitator h(Context context) {
        mks mksVar;
        jaq jaqVar;
        bxm bxmVar;
        exa exaVar;
        cbe cbeVar;
        cdi cdiVar;
        exa exaVar2;
        Delight5Facilitator delight5Facilitator = u;
        if (delight5Facilitator == null) {
            synchronized (Delight5Facilitator.class) {
                delight5Facilitator = u;
                if (delight5Facilitator == null) {
                    Context applicationContext = context.getApplicationContext();
                    ceg cegVar = new ceg(applicationContext);
                    hrx.y(applicationContext);
                    cee ceeVar = new cee(cegVar);
                    cct cctVar = new cct(applicationContext);
                    ccr ccrVar = new ccr(applicationContext);
                    dbf dbfVar = new dbf(applicationContext);
                    cdh cdhVar = new cdh(applicationContext);
                    caj cajVar = new caj(applicationContext, new Decoder(applicationContext));
                    DynamicLm dynamicLm = new DynamicLm(applicationContext);
                    ino M = ino.M(applicationContext);
                    mks f = gxp.a().f("DFacilitator", 10);
                    jaq jaqVar2 = new jaq(applicationContext);
                    cly a2 = cly.a(applicationContext);
                    bxm bxmVar2 = new bxm(applicationContext);
                    exa exaVar3 = exa.b;
                    if (exaVar3 == null) {
                        synchronized (exa.class) {
                            exaVar2 = exa.b;
                            if (exaVar2 == null) {
                                bxmVar = bxmVar2;
                                exa exaVar4 = new exa(applicationContext, gxo.a(10));
                                jaqVar = jaqVar2;
                                exaVar4.h.d(exaVar4.e);
                                mksVar = f;
                                ffa.v.f(exaVar4.f, exaVar4.e);
                                ffa.w.f(exaVar4.g, exaVar4.e);
                                exa.b = exaVar4;
                                exaVar2 = exaVar4;
                            } else {
                                mksVar = f;
                                jaqVar = jaqVar2;
                                bxmVar = bxmVar2;
                            }
                        }
                        exaVar = exaVar2;
                    } else {
                        mksVar = f;
                        jaqVar = jaqVar2;
                        bxmVar = bxmVar2;
                        exaVar = exaVar3;
                    }
                    delight5Facilitator = new Delight5Facilitator(applicationContext, cegVar, ceeVar, cctVar, ccrVar, dbfVar, cdhVar, cajVar, dynamicLm, M, mksVar, jaqVar, ieh.j(), a2, bxmVar, exaVar, null);
                    delight5Facilitator.j.aa(delight5Facilitator, "pref_key_use_personalized_dicts", "pref_key_enable_emoji_suggestion");
                    delight5Facilitator.j.Z(delight5Facilitator, R.string.f160340_resource_name_obfuscated_res_0x7f14063f, R.string.f161460_resource_name_obfuscated_res_0x7f1406b3, R.string.f161020_resource_name_obfuscated_res_0x7f140686);
                    delight5Facilitator.Q.d(delight5Facilitator.b);
                    ijl.b().c(delight5Facilitator.K, exp.class, delight5Facilitator.b);
                    delight5Facilitator.w.c = delight5Facilitator;
                    delight5Facilitator.l.h.set(new opu(delight5Facilitator, (byte[]) null));
                    delight5Facilitator.m.g.a.set(delight5Facilitator);
                    ikj.C(delight5Facilitator.e).s(delight5Facilitator.x);
                    gyk.i(delight5Facilitator.e).s(delight5Facilitator.y);
                    Context context2 = delight5Facilitator.e;
                    cdi cdiVar2 = cdi.a;
                    if (cdiVar2 == null) {
                        synchronized (cdi.class) {
                            cdiVar = cdi.a;
                            if (cdiVar == null) {
                                cdiVar = new cdi(context2.getApplicationContext());
                                cdiVar.q();
                                cdi.a = cdiVar;
                            }
                        }
                        cdiVar2 = cdiVar;
                    }
                    cdh cdhVar2 = delight5Facilitator.z;
                    cdiVar2.c = cdhVar2;
                    cdiVar2.s(cdhVar2);
                    cbe cbeVar2 = cbe.c;
                    if (cbeVar2 == null) {
                        synchronized (cbe.class) {
                            cbeVar = cbe.c;
                            if (cbeVar == null) {
                                cbeVar = new cbe();
                                cbe.c = cbeVar;
                            }
                        }
                        cbeVar2 = cbeVar;
                    }
                    cas.g.e(cbeVar2.d);
                    delight5Facilitator.M();
                    if (delight5Facilitator.L == null) {
                        ija c = ijf.c(new bqj(delight5Facilitator, 17), new bqj(delight5Facilitator, 18), irs.a);
                        delight5Facilitator.L = c;
                        c.d(gyc.b);
                    }
                    if (!delight5Facilitator.R.isEmpty()) {
                        bya byaVar = new bya(delight5Facilitator, 2);
                        delight5Facilitator.P = byaVar;
                        hhq.o(byaVar, delight5Facilitator.R);
                    }
                    u = delight5Facilitator;
                }
            }
        }
        return delight5Facilitator;
    }

    public static void v(mko mkoVar, String str) {
        hji.c(mkoVar, new bxl(5), new bxj(str, 5), mjl.a);
    }

    public final synchronized void A(mvm mvmVar, boolean z) {
        this.J.put(mvmVar.d, Boolean.valueOf(z));
    }

    public final synchronized void B(mvm mvmVar, mvk mvkVar) {
        this.I.remove(mvmVar.d);
        this.I.put(mvmVar.d, xv.a(mvmVar, mvkVar));
    }

    public final void C(final List list) {
        this.H.clear();
        cfd b = cfd.b(this.e);
        final Context context = this.e;
        cdx.b(context);
        final boolean f = cdx.f();
        mko g = mio.g(mkh.q(kcu.H(b.j.d("bundled_delight", 2022072200), b.j.d("delight", ((Long) cfd.b.c()).intValue()), b.j.d("delight_overrides", ((Long) cfd.d.c()).intValue()))), new leq() { // from class: cey
            @Override // defpackage.leq
            public final Object a(Object obj) {
                List<Locale> list2 = list;
                boolean z = f;
                Context context2 = context;
                List list3 = (List) obj;
                hhl hhlVar = cfd.a;
                if (list3.size() != 3 || list3.get(0) == null || ((list3.get(1) == null && ((Long) cfd.b.c()).longValue() > 0) || (list3.get(2) == null && ((Long) cfd.d.c()).longValue() > 0))) {
                    return lrq.b;
                }
                jqm jqmVar = (jqm) list3.get(0);
                jqm jqmVar2 = (jqm) list3.get(1);
                jqm jqmVar3 = (jqm) list3.get(2);
                lls i = llw.i(list2.size());
                for (Locale locale : list2) {
                    juc c = jqmVar3 != null ? cej.c(locale, jqmVar3.i(), z) : null;
                    if (c == null && jqmVar2 != null) {
                        c = cej.a(context2, locale, jqmVar2.i(), true);
                    }
                    if (c == null && jqmVar != null) {
                        c = cej.a(context2, locale, jqmVar.i(), true);
                    }
                    if (c != null) {
                        i.a(locale, cei.f(c));
                    }
                }
                return i.l();
            }
        }, b.m);
        ConcurrentHashMap concurrentHashMap = this.H;
        Objects.requireNonNull(concurrentHashMap);
        hji.c(g, new bxj(concurrentHashMap, 4), bxl.e, mjl.a);
    }

    public final synchronized boolean D(mvm mvmVar, mvk mvkVar) {
        xv xvVar = (xv) this.I.get(mvmVar.d);
        if (xvVar != null) {
            return mvkVar == xvVar.b;
        }
        this.I.put(mvmVar.d, xv.a(mvmVar, mvk.UNUSED));
        return mvk.UNUSED == mvkVar;
    }

    public final boolean E(List list, String str, boolean z) {
        return F(null, list, str, "", null, z, null);
    }

    public final boolean F(cbg cbgVar, List list, String str, String str2, ifn ifnVar, boolean z, mql mqlVar) {
        M();
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/delight5/Delight5Facilitator", "initializeForIme", 760, "Delight5Facilitator.java")).G("initializeForIme() : Locale = %s, layout = %s", list, str);
        cby i = i();
        if (!z) {
            bzv bzvVar = i.c;
            List<Locale> c = cby.c(list);
            if (!((Boolean) cas.d.c()).booleanValue()) {
                for (juc jucVar : bzvVar.c.k.e.g()) {
                    if (c.contains(cei.g(jucVar))) {
                        return false;
                    }
                }
            } else {
                for (Locale locale : c) {
                    List list2 = (List) bzvVar.d.get(locale.toLanguageTag());
                    if (list2 != null && !list2.isEmpty()) {
                        return false;
                    }
                }
            }
        }
        this.D.set(true);
        this.h.k(cbgVar, ifnVar);
        this.M = str2;
        if (list.equals(n()) && TextUtils.equals(this.O, str) && !this.E.get() && !dlr.d && !dyt.d) {
            String str3 = this.M;
            bzv bzvVar2 = i.c;
            bzvVar2.a = bzvVar2.b;
            bzvVar2.b = str3;
            List<Locale> c2 = cby.c(list);
            if (!bzvVar2.a.equals(bzvVar2.b)) {
                if (((Boolean) cas.d.c()).booleanValue()) {
                    for (Locale locale2 : c2) {
                        if (!Objects.equals(bzvVar2.a(locale2, bzvVar2.a), bzvVar2.a(locale2, bzvVar2.b))) {
                        }
                    }
                } else {
                    cfd cfdVar = bzvVar2.c;
                    String str4 = bzvVar2.b;
                    ceq ceqVar = cfdVar.k;
                    byy byyVar = ceqVar.e;
                    for (Locale locale3 : c2) {
                        juc a2 = ceq.a(byyVar, locale3, str4);
                        juc jucVar2 = (juc) ceqVar.f.get(locale3);
                        if (a2 == null) {
                            if (jucVar2 == null) {
                                jucVar2 = null;
                            }
                        }
                        if (a2 == null || a2.equals(jucVar2)) {
                        }
                    }
                }
            }
            caj cajVar = this.h;
            if (cajVar.s()) {
                synchronized (cajVar.b) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!cajVar.q(((Locale) it.next()).getLanguage())) {
                        }
                    }
                }
                return true;
            }
            if (!I()) {
                cca b = i().b(list, this.M, 4);
                this.G = b;
                v(kcu.P(b, this.b), "Delight5InitializeForIme-MainLmLoader");
            }
            return true;
        }
        this.O = str;
        Boolean bool = (Boolean) cbk.a(new cak(this, list, mqlVar, 0));
        return bool != null && bool.booleanValue();
    }

    public final boolean G() {
        return this.n.get();
    }

    public final boolean H(mvm mvmVar) {
        Long l;
        Locale locale = (Locale) this.p.get(mvmVar);
        return (locale == null || (l = (Long) this.H.get(locale)) == null || l.longValue() != mvmVar.j) ? false : true;
    }

    public final boolean I() {
        cca ccaVar = this.G;
        return ccaVar != null && !ccaVar.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x05a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean J(java.util.List r17, defpackage.mql r18) {
        /*
            Method dump skipped, instructions count: 1872
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator.J(java.util.List, mql):boolean");
    }

    public final boolean K(Locale locale) {
        if (this.A.j()) {
            if (!this.h.p()) {
                return this.h.v(5000L);
            }
            return true;
        } else if (locale.equals(q())) {
            return this.h.v(5000L);
        } else {
            this.h.k(null, null);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!hjg.r()) {
                try {
                    gyc.b.hQ(new brs(this, locale, 7)).get(5000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/apps/inputmethod/libs/delight5/Delight5Facilitator", "initializeForSpellChecker", (char) 862, "Delight5Facilitator.java")).t("Failed to reset decoder");
                    return false;
                }
            } else {
                J(Collections.singletonList(locale), null);
                ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/delight5/Delight5Facilitator", "initializeForSpellChecker", 852, "Delight5Facilitator.java")).t("Delight5Faclilitator#initializeForSpellChecker() is called from main thread");
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/delight5/Delight5Facilitator", "initializeForSpellChecker", 867, "Delight5Facilitator.java")).v("initializeForSpellChecker(): reset decoder takes: %s milliseconds ", elapsedRealtime2);
            return this.h.v(Math.max(5000 - elapsedRealtime2, 1L));
        }
    }

    public final synchronized void L(mvm mvmVar) {
        Boolean bool = (Boolean) this.J.get(mvmVar.d);
        if (bool == null || !bool.booleanValue()) {
            int i = mvmVar.b;
            mvl mvlVar = mvl.UNKNOWN;
            B(mvmVar, mvk.UNUSED);
            mko mkoVar = mkk.a;
        } else if (D(mvmVar, mvk.DECODING)) {
            mko mkoVar2 = mkk.a;
        } else {
            int i2 = mvmVar.b;
            mvl mvlVar2 = mvl.UNKNOWN;
            B(mvmVar, mvk.DECODING);
            this.h.b(mvmVar);
        }
    }

    @Override // defpackage.bxh
    public final mko a(mqa mqaVar) {
        int i = mqaVar.b;
        mqc mqcVar = mqc.UNKNOWN_ENGINE;
        caj cajVar = this.h;
        return cajVar.h.hR(new bwt(cajVar, mqaVar, 3), null);
    }

    @Override // defpackage.byd
    public final /* synthetic */ void b() {
        cog.l(this);
    }

    @Override // defpackage.bxh
    public final mko c(mqa mqaVar) {
        int i = mqaVar.b;
        mqc mqcVar = mqc.UNKNOWN_ENGINE;
        caj cajVar = this.h;
        return cajVar.h.hR(new bwt(cajVar, mqaVar, 4), null);
    }

    @Override // defpackage.bxh
    public final void d() {
        z();
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("Active Main LMs");
        for (mvm mvmVar : o()) {
            printer.println("  ".concat(String.valueOf(mvmVar.d)));
        }
        if (z) {
            printer.println("Dynamic LMs: eradicated");
            return;
        }
        printer.println("Dynamic LMs");
        synchronized (this) {
            for (xv xvVar : this.I.values()) {
                gzu.a(printer, "  %d %s", Integer.valueOf(((mvk) xvVar.b).d), ((mvm) xvVar.a).d);
            }
        }
    }

    @Override // defpackage.bxh
    public final void e() {
        z();
    }

    @Override // defpackage.bxh
    public final void f(mqg mqgVar) {
        int i = mqgVar.b;
        caj cajVar = this.h;
        cajVar.h.hP(new bwt(cajVar, mqgVar, 2));
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "Delight5Facilitator";
    }

    @Override // defpackage.inm
    public final void go(ino inoVar, String str) {
        if ("pref_key_use_personalized_dicts".equals(str) && !inoVar.ak("pref_key_use_personalized_dicts")) {
            t();
        }
        if (q() == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(6);
        if ("pref_key_use_personalized_dicts".equals(str) || inoVar.an(str, R.string.f160340_resource_name_obfuscated_res_0x7f14063f)) {
            arrayList.add(kcu.P(cco.b(this.e, n(), inoVar, this), this.b));
            this.C.b();
        }
        if ("pref_key_use_personalized_dicts".equals(str)) {
            arrayList.add(kcu.P(new bzx(this.e, n(), inoVar, this), this.b));
            if (((Boolean) cas.N.c()).booleanValue()) {
                Context context = this.e;
                List n = n();
                mks mksVar = this.b;
                arrayList.add(kcu.P(new ccd(context, n, inoVar, mksVar, this), mksVar));
            }
        }
        if (inoVar.an(str, R.string.f161460_resource_name_obfuscated_res_0x7f1406b3)) {
            arrayList.add(kcu.P(new caa(this.g, inoVar, this), this.b));
        }
        if (inoVar.an(str, R.string.f161020_resource_name_obfuscated_res_0x7f140686)) {
            arrayList.add(kcu.P(new ccc(this.w, inoVar, this), this.b));
        }
        if ("pref_key_enable_emoji_suggestion".equals(str)) {
            arrayList.add(kcu.P(new cba(this, inoVar, this.f, this.l), this.b));
        }
        v(j(hiz.K(arrayList).f()), "Delight5OnSharedPreferenceChanged-initializeDecoderWhenDone");
    }

    protected final cby i() {
        return cby.a(this.e);
    }

    public final hiz j(hiz hizVar) {
        if (((Boolean) cas.h.c()).booleanValue()) {
            return hizVar.v(new bzf(this, 3), mjl.a);
        }
        return hiz.n(true);
    }

    public final hiz k(List list, boolean z, boolean z2) {
        llp q;
        mko mkoVar;
        cca b = i().b(list, this.M, true != z2 ? 2 : 1);
        this.G = b;
        mko P = kcu.P(b, this.b);
        this.d.set(P);
        cao caoVar = new cao(this, z);
        mko mkoVar2 = (mko) this.d.get();
        if (mkoVar2 != null) {
            if (mkoVar2.isDone()) {
                this.h.h.hP(caoVar);
            } else {
                kcu.U(mkoVar2, l(caoVar), this.b);
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new bzx(this.e, list, this.j, this));
        if (((Boolean) cas.N.c()).booleanValue()) {
            arrayList.add(new ccd(this.e, list, this.j, this.b, this));
        }
        EditorInfo b2 = hsu.b();
        if (b2 == null || ham.a(b2) != 3 || !han.AGSA.a(b2) || !((Boolean) cas.i.c()).booleanValue()) {
            arrayList.add(new caa(this.g, this.j, this));
            arrayList.add(new ccc(this.w, this.j, this));
            arrayList.add(cco.b(this.e, list, this.j, this));
            arrayList.add(new cba(this, this.j, this.f, this.l));
            arrayList.add(new caz(this.t, this, null));
        }
        arrayList.add(new cbu(this.e, this));
        dlr.d = false;
        arrayList.add(new ccf(this.e, this));
        dyt.d = false;
        bxm bxmVar = this.m;
        Context context = this.e;
        if (bxmVar.g.a.get() == null) {
            q = llp.q();
        } else {
            if (hyr.b() && bxm.e.compareAndSet(false, true)) {
                bye a2 = bye.a(context);
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                llp r = llp.r(jsr.d("next-word-predictor", "tflite-nwp-"));
                if (!r.isEmpty()) {
                    mko a3 = a2.d.a("next-word-predictor", r);
                    ((luc) ((luc) a2.c.b()).k("com/google/android/apps/inputmethod/libs/crank/modelmanager/AbstractModelManager", "deletePacks", 477, "AbstractModelManager.java")).w("AbstractModelManager#deletePacks(): chosen for deletion %s", r);
                    mkoVar = a3;
                } else {
                    ((luc) ((luc) a2.c.b()).k("com/google/android/apps/inputmethod/libs/crank/modelmanager/AbstractModelManager", "deletePacks", 481, "AbstractModelManager.java")).t("AbstractModelManager#deletePacks(): no packs for deletion");
                    mkoVar = null;
                }
                if (mkoVar != null) {
                    hji.c(mkoVar, new hiu() { // from class: bxk
                        @Override // defpackage.hiu
                        public final void a(Object obj) {
                            Void r7 = (Void) obj;
                            ((ltd) ((ltd) bxm.d.b()).k("com/google/android/apps/inputmethod/libs/crank/CrankFacilitator", "lambda$deletePacks$0", 342, "CrankFacilitator.java")).v("Delete packs succeeded, duration=%s", SystemClock.elapsedRealtime() - elapsedRealtime);
                        }
                    }, bxl.a, mjl.a);
                }
            }
            llk e = llp.e();
            e.h(new byf(context, bxmVar.g, bye.a(context), list));
            if (fhr.w(context) && (((Boolean) bxn.aK.c()).booleanValue() || irs.d())) {
                bxz a4 = bxz.a(context);
                bxs b3 = bxs.b(context);
                bym a5 = bym.a(context);
                llp o = llp.o(list);
                if (!o.isEmpty()) {
                    a4.b = o;
                }
                llp o2 = llp.o(list);
                if (!o2.isEmpty()) {
                    b3.a = o2;
                }
                llp o3 = llp.o(list);
                if (!o3.isEmpty()) {
                    a5.b = o3;
                }
                e.j(llp.t(new bxy(bxmVar.g, a4, list), new bxp(bxmVar.g, b3, list, context), new byj(bxmVar.g, a5, list, context)));
            }
            e.h(new byh(bxmVar.g, list));
            q = e.g();
        }
        arrayList.addAll(q);
        ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
        arrayList2.add(P);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            mko P2 = kcu.P((mix) arrayList.get(i), this.b);
            arrayList2.add(P2);
            v(P2, "Delight5LoadLanguageModels");
        }
        return hiz.K(arrayList2).f();
    }

    public final mka l(gxu gxuVar) {
        return new gnr(this, gxuVar, 1);
    }

    public final String m() {
        return this.h.e.a.getSpatialModelVersion();
    }

    public final List n() {
        List unmodifiableList;
        synchronized (this.o) {
            unmodifiableList = Collections.unmodifiableList(this.o);
        }
        return unmodifiableList;
    }

    public final List o() {
        return this.h.i();
    }

    public final List p() {
        return this.h.i();
    }

    public final Locale q() {
        Locale locale;
        synchronized (this.o) {
            locale = this.o.isEmpty() ? null : (Locale) this.o.get(0);
        }
        return locale;
    }

    public final synchronized Set r() {
        HashSet hashSet;
        hashSet = new HashSet();
        for (xv xvVar : this.I.values()) {
            Object obj = xvVar.a;
            if (obj != null) {
                mvl b = mvl.b(((mvm) obj).b);
                if (b == null) {
                    b = mvl.UNKNOWN;
                }
                mvl[] mvlVarArr = cbw.a;
                int length = mvlVarArr.length;
                int i = 0;
                while (true) {
                    if (i >= 8) {
                        break;
                    } else if (!mvlVarArr[i].equals(b)) {
                        i++;
                    } else if (mvk.DECODING.equals(xvVar.b)) {
                        hashSet.add((mvm) xvVar.a);
                    }
                }
            }
        }
        return hashSet;
    }

    public final void s() {
        synchronized (this.c) {
            mko mkoVar = (mko) this.c.get();
            if (mkoVar == null) {
                return;
            }
            this.c.set(null);
            mkoVar.cancel(true);
        }
    }

    public final void t() {
        hji.c(kcu.O(new bof(this, 2), this.b), new bxj(this, 3), bxl.d, this.b);
    }

    public final void u() {
        s();
        this.h.w();
    }

    public final void w() {
        ltg ltgVar = a;
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/delight5/Delight5Facilitator", "maybeReloadModelsOnDeviceLockStateChanged", 688, "Delight5Facilitator.java")).t("Reload or unload user history for lock state change.");
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(kcu.P(cco.b(this.e, n(), this.j, this), this.b));
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/delight5/Delight5Facilitator", "maybeReloadModelsOnDeviceLockStateChanged", 694, "Delight5Facilitator.java")).t("Reload or unload contacts and personal LM for lock state change.");
        arrayList.add(kcu.P(new caa(this.g, this.j, this), this.b));
        arrayList.add(kcu.P(new ccc(this.w, this.j, this), this.b));
        if (((Boolean) cas.N.c()).booleanValue()) {
            Context context = this.e;
            List n = n();
            ino inoVar = this.j;
            mks mksVar = this.b;
            arrayList.add(kcu.P(new ccd(context, n, inoVar, mksVar, this), mksVar));
        }
        if (((Boolean) cas.S.c()).booleanValue()) {
            arrayList.add(kcu.P(new caz(this.t, this, null), this.b));
        }
        v(j(hiz.K(arrayList).f()), "Delight5MaybeReloadModelsOnDeviceLockStateChanged-initializeDecoderWhenDone");
    }

    public final void x(mql mqlVar) {
        mql mqlVar2 = (mql) this.s.get();
        if (mqlVar2 == null || !mqlVar2.equals(mqlVar)) {
            cbz cbzVar = this.h.e;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            nfh t = mqm.d.t();
            long o = cbzVar.d.o();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mqm mqmVar = (mqm) t.b;
            int i = mqmVar.a | 2;
            mqmVar.a = i;
            mqmVar.c = o;
            mqlVar.getClass();
            mqmVar.b = mqlVar;
            mqmVar.a = i | 1;
            mqm mqmVar2 = (mqm) t.cz();
            cbzVar.d(mti.SET_DECODER_EXPERIMENT_PARAMS);
            cbzVar.a.setDecoderExperimentParams(mqmVar2);
            cbzVar.e(mti.SET_DECODER_EXPERIMENT_PARAMS);
            cbzVar.b.g(caq.DELIGHT_SET_DECODER_EXPERIMENT_PARAMS, SystemClock.elapsedRealtime() - elapsedRealtime);
            cbzVar.b.e(cap.LOG_NATIVE_METRICS, Long.valueOf(mqmVar2.c));
            this.s.set(mqlVar);
        }
    }

    public final void y(List list) {
        Object obj;
        Object c;
        ArrayList arrayList = new ArrayList();
        cdx cdxVar = cdx.a;
        boolean z = false;
        if (cdxVar != null && cdx.f()) {
            z = true;
        }
        for (Locale locale : n()) {
            if (list.contains(locale)) {
                obj = locale;
            } else {
                obj = null;
                if (z && (c = cdxVar.c(locale)) != null && list.contains(c)) {
                    obj = c;
                }
            }
            if (obj != null) {
                if (!this.h.q(locale.getLanguage())) {
                    arrayList.add(locale);
                } else {
                    this.E.set(true);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            cca b = i().b(arrayList, this.M, 3);
            this.G = b;
            v(kcu.P(b, this.b), "PostSuperpackSync-MainLanguageModelLoader");
        }
    }

    public final void z() {
        this.E.set(true);
    }
}
