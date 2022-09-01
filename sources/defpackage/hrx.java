package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.IBinder;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Printer;
import com.google.android.inputmethod.latin.R;
import j$.util.Objects;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: hrx  reason: default package */
/* loaded from: classes.dex */
public final class hrx implements hqy, hrd, gzv, hsa, hqw, hri {
    private static final hrs U;
    private static volatile hqy X;
    public static final hrw b;
    public static final hru c;
    public static final hrt d;
    public volatile llp A;
    public volatile hqu E;
    public lgb F;
    public final lgb G;
    public hsc J;
    public mko K;
    public mko M;
    public boe N;
    public volatile bov O;
    public volatile kdr P;
    public ijk Q;
    public final jls R;
    public mop S;
    private final ino Y;
    private final jaq Z;
    private volatile WeakReference aa;
    private boolean ab;
    public final Context i;
    public final hrj k;
    public boolean m;
    public volatile boolean n;
    public volatile hrc o;
    public volatile gyv p;
    public volatile boolean q;
    public ija r;
    public ija s;
    public boolean t;
    public volatile hsb u;
    public hrv v;
    public boolean w;
    public volatile llp x;
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager");
    private static final jav[] T = new jav[0];
    private static final jav V = jav.f("zz");
    private static final llw W = llw.o("zh-CN", "com.google.android.inputmethod.pinyin", "zh-TW", "com.google.android.apps.inputmethod.zhuyin", "zh-HK", "com.google.android.apps.inputmethod.cantonese", "ko", "com.google.android.inputmethod.korean");
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final qo f = new qo();
    public final qv g = new qv();
    public final qv h = new qv();
    public final gvn l = new hrm(this);
    public final WeakHashMap y = new WeakHashMap();
    public final qo z = new qo();
    public final AtomicReference B = new AtomicReference();
    public final AtomicReference C = new AtomicReference();
    public final qo D = new qo();
    public hqt H = null;
    public ArrayList I = new ArrayList();
    public jav[] L = T;
    private final AtomicReference ac = new AtomicReference();
    private final BroadcastReceiver ad = new hrn(this);
    public final idk j = ieh.j();

    static {
        hrw hrwVar = new hrw();
        b = hrwVar;
        hru hruVar = new hru();
        c = hruVar;
        hrt hrtVar = new hrt();
        d = hrtVar;
        hrs hrsVar = new hrs();
        U = hrsVar;
        ijf.g("InputMethodEntryManager_UserUnlocked", hrwVar);
        ijf.g("InputMethodEntryManager_Initialized", hruVar);
        ijf.g("InputMethodEntryManager_ImeListLoaded", hrtVar);
        ijf.g("InputMethodEntryManager_GlobalAdditionalImeDefsLoaded", hrsVar);
    }

    public hrx(Context context) {
        this.i = context;
        this.Y = ino.M(context);
        this.k = new hrj(context, this);
        this.Z = new jaq(context);
        this.G = new etm(context, 17);
        this.R = new jls(context);
        this.p = new gyv(context);
    }

    public static llp D(llp llpVar) {
        int size = llpVar.size();
        if (size > 1) {
            int i = -1;
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                hqt hqtVar = (hqt) llpVar.get(i2);
                if (hqtVar.i().equals(V)) {
                    i = i2;
                } else if (hqtVar.u()) {
                    z = true;
                }
            }
            if (!z || i < 0) {
                return llpVar;
            }
            llk e = llp.e();
            if (i > 0) {
                e.j(llpVar.subList(0, i));
            }
            if (i < size - 1) {
                e.j(llpVar.subList(i + 1, size));
            }
            return e.g();
        }
        return llpVar;
    }

    public static mkr G() {
        return gxo.a(1);
    }

    public static String H(iav iavVar) {
        return iavVar.f.c;
    }

    private static final lmz aA(hqz hqzVar, hqt hqtVar) {
        if (ay(hqtVar)) {
            lmx g = lmz.g();
            llp b2 = hqr.b();
            int size = b2.size();
            for (int i = 0; i < size; i++) {
                hqt hqtVar2 = (hqt) b2.get(i);
                if (!hqtVar2.equals(hqtVar) && ay(hqtVar2)) {
                    g.d(hqtVar2);
                }
            }
            lmz g2 = g.g();
            if (g2.isEmpty()) {
                return lrr.a;
            }
            return hqzVar.b(hqtVar, g2);
        }
        return lrr.a;
    }

    private final mko aB(jav javVar, jls jlsVar, mkr mkrVar) {
        return this.o == null ? kcu.K(null) : kcu.L(this.o.d(javVar, jlsVar, mkrVar));
    }

    public static boolean ac(hqt hqtVar, hsc hscVar) {
        return hqtVar.i().equals(hscVar.a) && TextUtils.equals(hqtVar.p(), hscVar.b);
    }

    private static int ai(jav javVar, List list) {
        String str = javVar.g;
        int size = list.size();
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            jav javVar2 = (jav) list.get(i4);
            if (javVar.equals(javVar2)) {
                return i4;
            }
            if (TextUtils.equals(str, javVar2.g) && i < 0) {
                if (TextUtils.equals(javVar.i, javVar2.i)) {
                    if (TextUtils.equals(javVar2.j, javVar.j)) {
                        i = i4;
                    } else if (i2 < 0) {
                        i2 = i4;
                    }
                } else if (i3 < 0) {
                    i3 = i4;
                }
            }
        }
        return i >= 0 ? i : i2 >= 0 ? i2 : i3;
    }

    private final Context aj(hqt hqtVar, boolean z) {
        return z ? this.i : hqtVar.a();
    }

    private final lmz ak(jav javVar) {
        String d2 = this.k.b.d("default_variant_".concat(String.valueOf(String.valueOf(javVar))), null);
        if (TextUtils.isEmpty(d2)) {
            llp llpVar = (llp) this.h.get(javVar.n);
            if (llpVar == null) {
                llpVar = (llp) this.h.get("all");
            }
            if (llpVar == null || llpVar.isEmpty()) {
                String d3 = this.P.d(javVar);
                if (d3 == null) {
                    return lrr.a;
                }
                return lmz.r(d3);
            }
            lmx g = lmz.g();
            int size = llpVar.size();
            for (int i = 0; i < size; i++) {
                String str = (String) llpVar.get(i);
                if (str.equals("default")) {
                    str = this.P.d(javVar);
                }
                if (!TextUtils.isEmpty(str)) {
                    g.d(str);
                }
            }
            return g.g();
        }
        return lmz.r(d2);
    }

    private final lmz al(hqt hqtVar) {
        lmz lmzVar;
        lmz g;
        hqz z = z(hqtVar);
        if (z == null) {
            return lrr.a;
        }
        int a2 = z.a(hqtVar);
        if (a2 <= 0) {
            return lrr.a;
        }
        synchronized (this.g) {
            lmzVar = (lmz) this.g.get(hsc.a(hqtVar));
        }
        if (lmzVar == null) {
            g = null;
        } else {
            lmx g2 = lmz.g();
            llp b2 = hqr.b();
            int size = b2.size();
            for (int i = 0; i < size; i++) {
                g2.d(((hqt) b2.get(i)).h());
            }
            lmz g3 = g2.g();
            lmx g4 = lmz.g();
            lsz it = lmzVar.iterator();
            int i2 = a2;
            while (it.hasNext()) {
                jav javVar = (jav) it.next();
                if (g3.contains(javVar)) {
                    g4.d(javVar);
                    i2--;
                    if (i2 == 0) {
                        break;
                    }
                }
            }
            g = g4.g();
        }
        if (g != null) {
            return g;
        }
        lmz aA = aA(z, hqtVar);
        if (aA.isEmpty()) {
            return lrr.a;
        }
        qq qqVar = new qq();
        llp b3 = hqr.b();
        int size2 = b3.size();
        for (int i3 = 0; i3 < size2; i3++) {
            hqt hqtVar2 = (hqt) b3.get(i3);
            if (aA.contains(hqtVar2) && qqVar.add(hqtVar2.h()) && a2 - 1 == 0) {
                break;
            }
        }
        return lmz.p(qqVar);
    }

    private final mko am(Collection collection) {
        mko g;
        if (!collection.isEmpty()) {
            if (this.P == null) {
                g = kcu.K(lrr.a);
            } else {
                llb G = llb.G();
                llp b2 = hqr.b();
                int size = b2.size();
                for (int i = 0; i < size; i++) {
                    hqt hqtVar = (hqt) b2.get(i);
                    G.v(hqtVar.i(), hqtVar.p());
                }
                mkr G2 = G();
                ArrayList arrayList = new ArrayList();
                for (jav javVar : G.w()) {
                    this.P.e(javVar);
                    if (!ad(0)) {
                        arrayList.add(kcu.K(javVar));
                    } else {
                        arrayList.add(mio.g(aB(javVar, C(javVar, null).g(), G2), new crj(this, G, javVar, 9), G2));
                    }
                }
                g = mio.g(kcu.G(arrayList), hht.q, G2);
            }
            return mio.g(g, new hdp(collection, 17), mjl.a);
        }
        return kcu.K(llp.q());
    }

    private final String an(hqt hqtVar, boolean z) {
        hre hreVar = (hre) hqtVar;
        iav iavVar = hreVar.a;
        String c2 = iavVar != null ? iavVar.c(aj(hqtVar, z)) : null;
        if (c2 != null) {
            return c2;
        }
        Context aj = aj(hqtVar, z);
        return hreVar.b.o(aj, gwc.h(aj));
    }

    private final String ao(hqt hqtVar, boolean z) {
        int i;
        hre hreVar = (hre) hqtVar;
        iav iavVar = hreVar.a;
        if (iavVar == null || (i = iavVar.f.d) == 0) {
            String str = hreVar.c;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Integer num = (Integer) this.f.get(str);
            if (num != null) {
                return aj(hqtVar, z).getString(num.intValue());
            }
            return str.toUpperCase(Locale.US);
        }
        return aj(hqtVar, z).getString(i);
    }

    private final void ap() {
        hrv hrvVar = this.v;
        if (hrvVar != null) {
            hrvVar.a();
            this.v = null;
        }
    }

    private final void aq() {
        mko mkoVar = this.K;
        if (mkoVar != null) {
            mkoVar.cancel(true);
            this.K = null;
        }
    }

    private final void ar() {
        hsc hscVar = this.J;
        if (hscVar == null) {
            return;
        }
        jav javVar = hscVar.a;
        String str = hscVar.b;
        llp b2 = hqr.b();
        hqt w = w(b2, javVar, str);
        this.J = null;
        if (w == null) {
            return;
        }
        llp i = llp.i(lre.Z(b2, new ein(w, 14)));
        this.Q = new ijk(this.Q, i, null);
        P(i);
    }

    private static void as(Printer printer, hqt hqtVar) {
        if (hqtVar == null) {
            printer.println("null");
            return;
        }
        String valueOf = String.valueOf(hqtVar.i());
        String valueOf2 = String.valueOf(hqtVar.h());
        String p = hqtVar.p();
        printer.println("(" + valueOf + " , " + valueOf2 + ", " + p + ")");
    }

    private final void at(List list, lmx lmxVar) {
        if (this.P == null) {
            return;
        }
        llp a2 = jay.a(list);
        if (!a2.isEmpty()) {
            mop r = this.P.r(this.i, this.N);
            int i = ((lrl) a2).c;
            boolean z = false;
            for (int i2 = 0; i2 < i; i2++) {
                jav javVar = (jav) a2.get(i2);
                Object c2 = r.c(javVar.n);
                if (c2 == null) {
                    c2 = jav.L(new jau(javVar), r);
                }
                if (c2 != null) {
                    lmxVar.d(c2);
                    z = true;
                }
            }
            if (z) {
                return;
            }
        }
        llp g = this.P.g(this.N);
        lrl lrlVar = (lrl) g;
        int i3 = lrlVar.c;
        for (int i4 = 0; i4 < i3; i4++) {
            jav javVar2 = (jav) g.get(i4);
            if (list.contains(javVar2.j)) {
                lmxVar.d(javVar2);
            }
        }
        qq qqVar = new qq();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qqVar.addAll(jay.e((String) it.next()));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = qqVar.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            arrayList.clear();
            int i5 = lrlVar.c;
            boolean z2 = false;
            for (int i6 = 0; i6 < i5; i6++) {
                jav javVar3 = (jav) g.get(i6);
                if (str.equals(javVar3.g)) {
                    if (list.contains(javVar3.j)) {
                        lmxVar.d(javVar3);
                        z2 = true;
                    } else if (!z2 && TextUtils.isEmpty(javVar3.j)) {
                        arrayList.add(javVar3);
                    }
                }
            }
            if (!z2) {
                lmxVar.j(arrayList);
            }
        }
    }

    private final void au(jav[] javVarArr, lmx lmxVar) {
        if (this.P == null || (r0 = javVarArr.length) == 0) {
            return;
        }
        mop r = this.P.r(this.i, this.N);
        for (jav javVar : javVarArr) {
            if (Objects.equals(javVar, jav.d)) {
                return;
            }
            jav K = javVar.K(r);
            if (K == null && !TextUtils.isEmpty(javVar.j)) {
                kdr kdrVar = this.P;
                String str = javVar.g;
                boe boeVar = this.N;
                if (TextUtils.isEmpty(str)) {
                    K = null;
                } else {
                    iaw b2 = kdrVar.b(str);
                    if (b2 == null) {
                        lsz it = ((llw) kdrVar.d).entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            jau H = jav.H();
                            H.f((String) entry.getKey());
                            if (str.equals(H.b)) {
                                b2 = (iaw) entry.getValue();
                                break;
                            }
                        }
                    }
                    K = kdr.f(b2, boeVar);
                }
            }
            if (K != null) {
                String str2 = (String) W.get(K.n);
                if (TextUtils.isEmpty(str2) || !this.Z.i(str2)) {
                    lmxVar.d(K);
                }
            }
        }
    }

    private static void av(jav javVar, qq qqVar) {
        lsz it = lmz.p(qqVar).iterator();
        while (it.hasNext()) {
            ((hqv) it.next()).aN(javVar);
        }
    }

    private final void aw(lmz lmzVar, boolean z) {
        hrv B = B(lmzVar);
        ax(B, new hrr(this, B, z), false);
    }

    private final void ax(hrv hrvVar, mka mkaVar, boolean z) {
        hrv hrvVar2 = this.v;
        if (hrvVar2 != null) {
            hrvVar2.a();
        }
        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager", "updateInputMethodEntrySettingsLoadingTask", 861, "InputMethodEntryManager.java")).w("update loading task with resetImplicitlyEnabledEntries is %b", Boolean.valueOf(z));
        this.v = hrvVar;
        this.w = z;
        kcu.U(hrvVar.a, mkaVar, gyc.a);
    }

    private static boolean ay(hqt hqtVar) {
        iav g = hqtVar.g();
        return g != null && g.q.d(R.id.f54840_resource_name_obfuscated_res_0x7f0b01cc, true);
    }

    private final boolean az() {
        return this.E != null && this.E.b(this.aa != null ? (IBinder) this.aa.get() : null);
    }

    public static hqt w(llp llpVar, jav javVar, String str) {
        int size = llpVar.size();
        for (int i = 0; i < size; i++) {
            hqt hqtVar = (hqt) llpVar.get(i);
            if (hqtVar.i().equals(javVar) && TextUtils.equals(hqtVar.p(), str)) {
                return hqtVar;
            }
        }
        return null;
    }

    public static hqy y(Context context) {
        hqy hqyVar = X;
        if (hqyVar == null) {
            synchronized (hrx.class) {
                hqyVar = X;
                if (hqyVar == null) {
                    hrx hrxVar = new hrx(context.getApplicationContext());
                    hqn hqnVar = new hqn(context.getApplicationContext());
                    if (hrxVar.m) {
                        ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager", "registerPrimaryImeDefsProvider", 1365, "InputMethodEntryManager.java")).t("registerPrimaryImeDefsProvider: the entry manager has already been initialized.");
                    }
                    ArrayList arrayList = hrxVar.I;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i = 0;
                        while (true) {
                            if (i < size) {
                                hqx hqxVar = (hqx) arrayList.get(i);
                                i++;
                                if (hqxVar.getClass() == hqnVar.getClass()) {
                                    ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager", "registerPrimaryImeDefsProvider", 1372, "InputMethodEntryManager.java")).w("Provider: %s already exists. ", hqxVar.getClass());
                                    break;
                                }
                            } else {
                                hqnVar.b = hrxVar;
                                hrxVar.I.add(hqnVar);
                                break;
                            }
                        }
                    }
                    X = hrxVar;
                    hqyVar = hrxVar;
                }
            }
        }
        return hqyVar;
    }

    public final hre A(iav iavVar, jav javVar, jga jgaVar) {
        iaw c2 = this.P != null ? this.P.c(javVar) : null;
        return new hre(iavVar, javVar, H(iavVar), c2 != null && c2.c, jgaVar, this);
    }

    public final hrv B(lmz lmzVar) {
        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager", "startLoadingInputMethodEntrySettings", 773, "InputMethodEntryManager.java")).w("Start loading input method entry settings: %s", lmzVar);
        synchronized (this.g) {
            this.g.clear();
            lsz it = lmzVar.iterator();
            while (it.hasNext()) {
                hsc hscVar = (hsc) it.next();
                hrj hrjVar = this.k;
                lmz lmzVar2 = null;
                Set<String> e = hrjVar.b.e(hrj.e(hscVar.a, hscVar.b), null);
                if (e != null) {
                    if (e.isEmpty()) {
                        lmzVar2 = lrr.a;
                    } else {
                        lmx g = lmz.g();
                        jau H = jav.H();
                        for (String str : e) {
                            try {
                                jav g2 = jav.g(str);
                                if (g2 == null) {
                                    g2 = H.b(str);
                                }
                                if (!Objects.equals(g2, jav.d)) {
                                    g.d(g2);
                                }
                            } catch (IllegalArgumentException e2) {
                                ((luc) ((luc) ((luc) hrj.a.d()).i(e2)).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryDataStore", "convertToLanguageTagSet", 424, "InputMethodEntryDataStore.java")).w("Invalid language tag: %s", str);
                            }
                        }
                        lmzVar2 = g.g();
                    }
                }
                if (lmzVar2 != null) {
                    this.g.put(hscVar, lmzVar2);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        lsz it2 = lmzVar.iterator();
        while (it2.hasNext()) {
            hsc hscVar2 = (hsc) it2.next();
            arrayList.add(e(hscVar2.a, hscVar2.b));
        }
        return new hrv(mio.h(kcu.G(arrayList), new ivo(this, 1), mjl.a), lmzVar);
    }

    public final jga C(jav javVar, String str) {
        jga jgaVar = new jga();
        jgaVar.c(new jfu(javVar));
        jgaVar.f(str);
        if (this.u != null) {
            hsb hsbVar = this.u;
            lmz lmzVar = hsbVar.a;
            kdr kdrVar = hsbVar.e;
            hsbVar.a(jgaVar, (int[]) kdrVar.a, (int[]) kdrVar.g, (int[]) kdrVar.b, (int[]) kdrVar.f);
            iaw c2 = hsbVar.e.c(javVar);
            if (c2 != null) {
                hsbVar.a(jgaVar, c2.g, c2.h, c2.i, c2.j);
            }
        }
        return jgaVar;
    }

    public final lmz E() {
        if (this.P == null) {
            return lrr.a;
        }
        lmx g = lmz.g();
        au(this.L, g);
        lmx g2 = lmz.g();
        lsz it = g.g().iterator();
        boolean z = false;
        while (it.hasNext()) {
            jav javVar = (jav) it.next();
            lsz it2 = ak(javVar).iterator();
            while (it2.hasNext()) {
                g2.d(hsc.b(javVar, (String) it2.next()));
                z = true;
            }
        }
        if (!z) {
            jav f = jav.f((String) this.P.e);
            lsz it3 = ak(f).iterator();
            while (it3.hasNext()) {
                g2.d(hsc.b(f, (String) it3.next()));
            }
        }
        g2.d(hsc.b(V, "qwerty"));
        return g2.g();
    }

    public final mko F(List list) {
        Object K;
        lmx g = lmz.g();
        if (list != null && !list.isEmpty() && this.P != null) {
            mop r = this.P.r(this.i, this.N);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                fvt fvtVar = (fvt) it.next();
                try {
                    jav d2 = jav.d(fvtVar.a);
                    if (!Objects.equals(d2, jav.d) && (K = d2.K(r)) != null) {
                        g.d(K);
                    }
                } catch (IllegalArgumentException e) {
                    ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager", "fillLanguagesFromLanguagePreferences", 1252, "InputMethodEntryManager.java")).w("Failed to parse locale %s", fvtVar.a);
                }
            }
        }
        String str = (String) irr.b.c();
        if (!TextUtils.isEmpty(str)) {
            at(llp.r(str), g);
        } else {
            TelephonyManager telephonyManager = (TelephonyManager) this.i.getSystemService("phone");
            if (telephonyManager != null) {
                String simCountryIso = telephonyManager.getSimCountryIso();
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                ArrayList arrayList = new ArrayList(2);
                if (!TextUtils.isEmpty(simCountryIso)) {
                    arrayList.add(simCountryIso.toUpperCase(Locale.US));
                }
                if (!TextUtils.isEmpty(networkCountryIso)) {
                    arrayList.add(networkCountryIso.toUpperCase(Locale.US));
                }
                if (!arrayList.isEmpty()) {
                    at(arrayList, g);
                }
            }
        }
        au(jav.G(), g);
        return am(g.g());
    }

    public final void I() {
        mko mkoVar = this.M;
        if (mkoVar != null) {
            mkoVar.cancel(true);
            this.M = null;
        }
    }

    public final void J(hqt hqtVar) {
        hqt x = x();
        if (!this.ab) {
            this.k.b.u(R.string.f160620_resource_name_obfuscated_res_0x7f14065e, hrj.d(hqtVar));
        }
        N(hqtVar);
        this.j.e(hry.INPUT_METHOD_ENTRY_CHANGED, x, hqtVar, al(hqtVar), Boolean.valueOf(this.ab));
    }

    public final void K(llp llpVar) {
        llp b2 = hqr.b();
        int size = b2.size();
        for (int i = 0; i < size; i++) {
            hqt hqtVar = (hqt) b2.get(i);
            if (w(llpVar, hqtVar.i(), hqtVar.p()) == null) {
                U(hqtVar);
            }
        }
        int size2 = b2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            hqt hqtVar2 = (hqt) b2.get(i2);
            if (!llpVar.contains(hqtVar2)) {
                ino.M(this.i).w(iin.o(hqtVar2));
            }
        }
        this.k.g(this.q ? llp.q() : llpVar);
        this.Q = new ijk(this.Q, llpVar, null);
        P(llpVar);
    }

    public final void L() {
        ap();
        if (this.s != null) {
            return;
        }
        ija b2 = ijf.b(new hob(this, 15), d, U);
        this.s = b2;
        b2.e(gyc.a);
    }

    public final void M() {
        if (this.Y.x(R.string.f162610_resource_name_obfuscated_res_0x7f140726, false)) {
            this.Y.q(R.string.f162610_resource_name_obfuscated_res_0x7f140726, false);
            ijk ijkVar = this.Q;
            hqt hqtVar = null;
            if (ijkVar != null) {
                int[] iArr = (int[]) ijkVar.a;
                if (iArr.length != 0) {
                    hqtVar = (hqt) ((llp) ijkVar.b).get(iArr[0]);
                }
            }
            if (hqtVar == null) {
                hqtVar = (hqt) lre.ao(hqr.b());
            }
            if (hqtVar != null) {
                W(hqtVar);
            } else {
                ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager", "maybeResetToFirstInputMethodEntry", 1108, "InputMethodEntryManager.java")).t("The first input method entry is null.");
            }
        }
    }

    public final void N(hqt hqtVar) {
        mko K;
        mko g;
        iav iavVar = null;
        if (hqtVar != null) {
            this.H = hqtVar;
            synchronized (this.y) {
                if (((llp) this.y.get(hqtVar)) != null) {
                    this.H = null;
                    O(hqtVar, false);
                    return;
                } else if (((mko) this.z.get(hqtVar)) != null) {
                    return;
                } else {
                    if (this.O == null) {
                        g = kcu.K(llp.q());
                    } else {
                        boolean i = ijf.i(b);
                        bov bovVar = this.O;
                        mko hQ = G().hQ(new hlx(bovVar, hqtVar, i, 1));
                        iav g2 = hqtVar.g();
                        if (g2 != null) {
                            iavVar = g2.y;
                        }
                        if (iavVar != null) {
                            K = kcu.K(iavVar);
                        } else {
                            K = mio.g(y(bovVar.a).c(hqtVar.i()), bou.b, mjl.a);
                        }
                        g = mio.g(mio.g(kcu.H(hQ, mio.g(K, bou.a, mjl.a)), bou.c, mjl.a), new hdp(this, 16), mjl.a);
                    }
                    this.z.put(hqtVar, g);
                    kcu.U(g, new hrq(this, hqtVar, g), gyc.a);
                    return;
                }
            }
        }
        this.H = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void O(hqt hqtVar, boolean z) {
        iav g = hqtVar.g();
        if (g == null || !g.A) {
            ijf.k(hsd.a);
        } else {
            ijf.j(hsd.a);
        }
        if (z || !hqtVar.equals(hqp.b())) {
            ijl.b().g(new hqp(hqtVar));
        }
        mld mldVar = (mld) this.ac.getAndSet(null);
        if (mldVar != null) {
            mldVar.c(hqtVar);
        }
    }

    public final void P(llp llpVar) {
        synchronized (this.y) {
            lta listIterator = llpVar.listIterator();
            while (listIterator.hasNext()) {
                hqt hqtVar = (hqt) listIterator.next();
                llp llpVar2 = (llp) this.y.remove(hqtVar);
                if (llpVar2 != null) {
                    this.y.put(hqtVar, llpVar2);
                }
            }
        }
        ijl.b().g(new hqr(llpVar));
    }

    public final void Q(Collection collection) {
        if (collection == null) {
            lsz it = llw.k(this.D).entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                av((jav) entry.getKey(), (qq) entry.getValue());
            }
            return;
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            jav javVar = (jav) it2.next();
            qq qqVar = (qq) this.D.get(javVar);
            if (qqVar != null) {
                av(javVar, qqVar);
            }
        }
    }

    public final void R(llp llpVar) {
        this.x = llpVar;
        ijf.j(U);
    }

    public final void S() {
        if (!this.q) {
            return;
        }
        ap();
        aa(B(E()), true);
    }

    public final void T() {
        if (this.n || this.v != null) {
            ltg ltgVar = a;
            ((ltd) ((ltd) ltgVar.b()).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager", "reloadInputMethodEntryPreferencesImpl", 3210, "InputMethodEntryManager.java")).t("reloadInputMethodEntryPreferencesImpl");
            lmz b2 = this.k.b();
            if (!b2.isEmpty()) {
                if (!this.n || this.P == null) {
                    ((ltd) ((ltd) ltgVar.c()).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager", "stopUsingSystemLanguages", 2473, "InputMethodEntryManager.java")).t("stopUsingSystemLanguages is called before initialized");
                } else if (this.q) {
                    Z();
                    if (this.v == null) {
                        this.k.g(hqr.b());
                    }
                }
                aw(b2, false);
                return;
            }
            Y();
            aw(E(), true);
        }
    }

    public final void U(hqt hqtVar) {
        synchronized (this.g) {
            this.g.remove(hsc.a(hqtVar));
            this.k.h(hqtVar, null);
        }
    }

    public final void W(hqt hqtVar) {
        hsc hscVar = this.J;
        boolean z = false;
        if (hscVar != null && ac(hqtVar, hscVar)) {
            z = true;
        }
        this.ab = z;
        if (hqtVar.equals(x())) {
            return;
        }
        J(hqtVar);
    }

    public final void X(boolean z) {
        if (z) {
            this.n = true;
            ijf.j(c);
            return;
        }
        this.n = false;
        ijf.k(c);
    }

    public final void Y() {
        if (!this.q) {
            this.q = true;
            this.i.registerReceiver(this.ad, new IntentFilter("android.intent.action.LOCALE_CHANGED"));
            this.L = jav.G();
        }
    }

    public final void Z() {
        if (this.q) {
            this.q = false;
            this.i.unregisterReceiver(this.ad);
            I();
            this.L = T;
        }
    }

    @Override // defpackage.hqy
    public final hqt a(jav javVar) {
        if (!jav.E(javVar.g)) {
            llp b2 = hqr.b();
            int ai = ai(javVar, lre.H(hqr.b(), hht.p));
            if (ai >= 0) {
                return (hqt) b2.get(ai);
            }
        }
        return null;
    }

    public final void aa(hrv hrvVar, boolean z) {
        ax(hrvVar, new hro(this, hrvVar, this.q), z);
    }

    public final void ab(hqt hqtVar) {
        if (!this.n) {
            throw new IllegalStateException("updateTemporaryCurrentInputMethodEntry is called before initialized");
        }
        if (!q(hqtVar)) {
            ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager", "updateTemporaryCurrentInputMethodEntry", 1927, "InputMethodEntryManager.java")).w("Entry %s must be enabled before it can be activated", hqtVar);
        } else if (hqtVar.equals(x())) {
        } else {
            this.ab = true;
            J(hqtVar);
        }
    }

    public final boolean ad(int i) {
        return i == 0 || ((Boolean) hhq.c(this.i, i).c()).booleanValue();
    }

    @Override // defpackage.hqy
    public final mko b() {
        hqt b2 = hqp.b();
        if (b2 != null) {
            return kcu.K(b2);
        }
        return (mld) DesugarAtomicReference.updateAndGet(this.ac, hrk.a);
    }

    @Override // defpackage.hqy
    public final mko c(jav javVar) {
        if (this.P == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager", "getDefaultInputMethodEntry", 1495, "InputMethodEntryManager.java")).w("Can't get entry for %s. Entry list def is null.", javVar);
            return kcu.K(null);
        }
        return mio.g(d(javVar), new fyn(javVar, this.P.d(javVar), 10), mjl.a);
    }

    @Override // defpackage.hqy
    public final mko d(jav javVar) {
        mkr G = G();
        jga C = C(javVar, null);
        return mio.g(aB(javVar, C.g(), G), new crj(this, javVar, C, 11), mjl.a);
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        hqt b2 = hqp.b();
        if (b2 != null) {
            printer.println("Current Input Method:");
            as(printer, b2);
            lmz s = s(b2);
            if (s.isEmpty()) {
                printer.println("No multilingual secondary languages enabled.");
            } else {
                printer.println("Enabled multilingual secondary languages:");
                lsz it = s.iterator();
                while (it.hasNext()) {
                    printer.println(((jav) it.next()).n);
                }
            }
        }
        if (this.H != null) {
            printer.println("Pending current input method entry:");
            as(printer, this.H);
        }
        llp b3 = hqr.b();
        if (!b3.isEmpty()) {
            printer.println("Enabled Input Method Entries:");
            int size = b3.size();
            for (int i = 0; i < size; i++) {
                as(printer, (hqt) b3.get(i));
            }
        }
        boolean z2 = this.q;
        printer.println("Use system language = " + z2);
        if (this.q) {
            printer.println("Cache system locales = ".concat(String.valueOf(String.valueOf(Arrays.asList(this.L)))));
            printer.println("System locales = ".concat(String.valueOf(String.valueOf(Arrays.asList(jav.G())))));
        }
        ijk ijkVar = this.Q;
        if (ijkVar != null) {
            printer.println("Rotation List: ".concat(String.valueOf(String.valueOf(mhq.n((int[]) ijkVar.a)))));
        }
    }

    @Override // defpackage.hqy
    public final mko e(jav javVar, String str) {
        mko K;
        mko L;
        mkr G = G();
        jga C = C(javVar, str);
        jls g = C.g();
        if (this.o == null) {
            L = kcu.K(null);
        } else {
            hrc hrcVar = this.o;
            iaw c2 = hrcVar.d.c(javVar);
            if (c2 == null) {
                ((ltd) ((ltd) hrc.a.d()).k("com/google/android/libraries/inputmethod/inputmethodentry/ImeDefCache", "getImeDef", 94, "ImeDefCache.java")).w("There are no ImeDef resources defined for %s", javVar);
                hrcVar.e.l(4);
                K = kcu.K(null);
            } else {
                K = mio.g(hrcVar.c(javVar, c2, g, G), new hdp(str, 12), G);
            }
            L = kcu.L(K);
        }
        return mio.g(L, new crj(this, javVar, C, 10), mjl.a);
    }

    @Override // defpackage.hqy
    public final mko f() {
        if (!this.n) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager", "getLanguagesAvailableForEnabling", 1172, "InputMethodEntryManager.java")).t("getLanguagesAvailableForEnabling is called before initialized");
            return kcu.K(llp.q());
        } else if (this.P == null) {
            return kcu.K(llp.q());
        } else {
            return am(this.P.g(this.N));
        }
    }

    @Override // defpackage.hqy
    public final void g(jav javVar) {
        llp g;
        int ai;
        if (!this.n || this.P == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager", "changeCurrentLanguageTemporarily", 1795, "InputMethodEntryManager.java")).t("changeCurrentLanguageTemporarily is called before initialized.");
            return;
        }
        aq();
        hqt a2 = a(javVar);
        if (a2 == null) {
            String str = null;
            jav javVar2 = (this.P != null && (ai = ai(javVar, (g = this.P.g(this.N)))) >= 0) ? (jav) g.get(ai) : null;
            if (javVar2 == null) {
                return;
            }
            hqt b2 = hqp.b();
            if (b2 != null) {
                str = b2.p();
            }
            mko g2 = mio.g(d(javVar2), new fyn(str, this.P.d(javVar2), 9), mjl.a);
            this.K = g2;
            kcu.U(g2, new hrp(this, g2, javVar), gyc.b);
            return;
        }
        if (!hsc.a(a2).equals(this.J)) {
            ar();
        }
        ab(a2);
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "InputMethodEntryManager";
    }

    @Override // defpackage.hqy
    public final void h() {
        hqt w;
        aq();
        ar();
        if (!this.ab || !this.n) {
            return;
        }
        this.ab = false;
        hsc a2 = this.k.a();
        if (a2 == null || (w = w(hqr.b(), a2.a, a2.b)) == null || w.equals(x())) {
            return;
        }
        J(w);
    }

    @Override // defpackage.hqy
    public final void i(Collection collection) {
        if (!this.n) {
            throw new IllegalStateException("enableInputMethodEntries is called before initialized");
        }
        ArrayList arrayList = new ArrayList(hqr.b());
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            hqt hqtVar = (hqt) it.next();
            if (!arrayList.contains(hqtVar)) {
                arrayList.add(hqtVar);
                z = true;
            }
        }
        if (!z) {
            return;
        }
        Z();
        K(llp.o(arrayList));
    }

    @Override // defpackage.hqy
    public final void j(Context context, int i, Bundle bundle) {
        lgb lgbVar = this.F;
        if (lgbVar != null) {
            Object a2 = lgbVar.a();
            if (i != -1) {
                ((Intent) a2).putExtra("entry", i);
            }
            if (bundle != null) {
                ((Intent) a2).putExtras(bundle);
            }
            context.startActivity((Intent) a2);
            return;
        }
        ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager", "launchLanguageSettingActivity", 2448, "InputMethodEntryManager.java")).t("languageSettingIntentSupplier is not set!");
    }

    @Override // defpackage.hqy
    public final void k(hqt hqtVar) {
        if (!this.n) {
            throw new IllegalStateException("setCurrentInputMethodEntry is called before initialized");
        }
        if (!q(hqtVar)) {
            ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager", "setCurrentInputMethodEntry", 1767, "InputMethodEntryManager.java")).G("Entry %s must be enabled before it can be activated. Enabled ones are: %s", hqtVar, hqr.b());
        } else if (hqtVar.equals(x())) {
        } else {
            this.t = true;
            W(hqtVar);
        }
    }

    @Override // defpackage.hqy
    public final void l(Collection collection) {
        if (!this.n) {
            throw new IllegalStateException("setEnabledInputMethodEntries is called before initialized");
        }
        llp o = llp.o(collection);
        if (lre.I(hqr.b(), o)) {
            return;
        }
        Z();
        K(o);
        if (collection.contains(x())) {
            return;
        }
        W((hqt) o.get(0));
    }

    @Override // defpackage.hqy
    public final void m(IBinder iBinder) {
        if (iBinder == null) {
            this.aa = null;
        } else if (this.aa != null && this.aa.get() == iBinder) {
        } else {
            this.aa = new WeakReference(iBinder);
        }
    }

    @Override // defpackage.hqy
    public final void n(Context context) {
        gyv gyvVar = this.p;
        if (gyvVar.e != context) {
            gyvVar.e = context;
            gyvVar.a();
        }
    }

    @Override // defpackage.hqy
    public final boolean o() {
        return hqr.b().size() > 1;
    }

    @Override // defpackage.hqy
    public final boolean p() {
        if (o()) {
            return true;
        }
        hqu hquVar = this.E;
        WeakReference weakReference = this.aa;
        if (hquVar == null) {
            return false;
        }
        return hquVar.a(weakReference != null ? (IBinder) weakReference.get() : null);
    }

    @Override // defpackage.hqy
    public final boolean q(hqt hqtVar) {
        return hqr.b().contains(hqtVar);
    }

    @Override // defpackage.hrd
    public final lmz s(hqt hqtVar) {
        if (!this.n) {
            ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager", "getEnabledMultilingualSecondaryLanguages", 2099, "InputMethodEntryManager.java")).t("getEnabledMultilingualSecondaryLanguages is called before initialized");
            return lrr.a;
        }
        return al(hqtVar);
    }

    @Override // defpackage.hrd
    public final lmz t(hqt hqtVar) {
        if (!this.n) {
            ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager", "getSupportedMultilingualLanguages", 2041, "InputMethodEntryManager.java")).t("getSupportedMultilingualLanguages is called before initialized");
            return lrr.a;
        }
        hqz z = z(hqtVar);
        if (z == null) {
            return lrr.a;
        }
        return aA(z, hqtVar);
    }

    @Override // defpackage.hri
    public final void v(int i) {
        this.j.e(hry.LOAD_INPUT_METHOD_ENTRY_ERROR, Integer.valueOf(i));
    }

    public final hqt x() {
        hqt hqtVar = this.H;
        return hqtVar != null ? hqtVar : hqp.b();
    }

    public final hqz z(hqt hqtVar) {
        if (!ay(hqtVar)) {
            return null;
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            hqz hqzVar = (hqz) it.next();
            if (hqzVar.a(hqtVar) > 0) {
                return hqzVar;
            }
        }
        return null;
    }

    public final void V(Collection collection) {
        lmz o;
        if (this.o != null) {
            hrv hrvVar = this.v;
            if (hrvVar != null) {
                o = hrvVar.b;
            } else {
                o = this.n ? lmz.o(lre.ab(hqr.b(), hht.o)) : null;
            }
            boolean z = false;
            if (this.v != null && this.w) {
                z = true;
            }
            if (collection == null) {
                this.o.a();
            } else {
                this.o.b(collection);
            }
            ap();
            if (o != null) {
                hrv B = B(o);
                aa(B, z);
                B.a.d(new gxi(this, collection, 17), gyc.a);
                return;
            }
            Q(collection);
        }
    }

    @Override // defpackage.hrd
    public final String u(hqt hqtVar, int i, boolean z) {
        if (i == 0) {
            String ao = ao(hqtVar, z);
            return ao != null ? String.format("%s (%s)", an(hqtVar, z), ao) : an(hqtVar, z);
        } else if (i != 1) {
            return lfd.d(ao(hqtVar, z));
        } else {
            return an(hqtVar, z);
        }
    }

    @Override // defpackage.hqy
    public final boolean r(boolean z) {
        if (this.Q != null) {
            hqt b2 = hqp.b();
            if (b2 == null) {
                ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager", "switchToNextInputMethodEntry", 2376, "InputMethodEntryManager.java")).t("The current input method entry shouldn't be null");
                return false;
            }
            hqt b3 = this.Q.b(b2, z);
            if (!z && b3 == null) {
                if (az()) {
                    this.j.e(hry.SWITCH_TO_OTHER_IMES_BY_GLOBE_KEY, new Object[0]);
                    this.Y.q(R.string.f162610_resource_name_obfuscated_res_0x7f140726, true);
                    return true;
                }
                b3 = this.Q.b(b2, true);
            }
            if (b3 == null || b3.equals(b2)) {
                return false;
            }
            k(b3);
            return true;
        }
        ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager", "switchToNextInputMethodEntry", 2366, "InputMethodEntryManager.java")).t("The dynamic rotation list shouldn't be null");
        if (z || !az()) {
            return false;
        }
        this.Y.q(R.string.f162610_resource_name_obfuscated_res_0x7f140726, true);
        return true;
    }
}
