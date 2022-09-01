package defpackage;

import android.net.Uri;
import android.util.Printer;
import com.google.android.libraries.inputmethod.staticflag.AllFlags;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: hhu  reason: default package */
/* loaded from: classes.dex */
public final class hhu implements gzv {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/flag/FlagManager");
    public static final hhu b = new hhu();
    public volatile idk h;
    public volatile hhm i;
    public boolean j;
    public ija k;
    public jlt l;
    public volatile dsl m;
    public volatile dsl n;
    volatile ijk o;
    public volatile ijk p;
    public volatile ijk q;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    private final Uri r = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(AllFlags.STATICMENDELPACKAGENAME)));
    private final Map s = new WeakHashMap();

    public hhu() {
        gzt.a.a(this);
    }

    private static void A(nfh nfhVar, Map map) {
        hie[] values;
        for (hhr hhrVar : map.values()) {
            String str = hhrVar.a;
            nfh t = hif.e.t();
            String str2 = hhrVar.a;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            hif hifVar = (hif) t.b;
            str2.getClass();
            hifVar.a |= 1;
            hifVar.b = str2;
            int i = hik.a;
            hih a2 = hik.a(hhrVar.c());
            if (a2 != null) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                hif hifVar2 = (hif) t.b;
                hifVar2.c = a2;
                hifVar2.a |= 2;
            }
            for (hie hieVar : hie.values()) {
                hih a3 = hik.a(hhrVar.b(hieVar));
                if (a3 != null) {
                    t.cS(hieVar.g, a3);
                }
            }
            nfhVar.cU(str, (hif) t.cz());
        }
    }

    public static void n(Set set, ConcurrentHashMap concurrentHashMap) {
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            hhr hhrVar = (hhr) entry.getValue();
            if (hhrVar.c != null) {
                set.add(hhrVar);
            }
        }
    }

    public static void r(mko mkoVar) {
        kcu.U(mkoVar, new cbx(16), mjl.a);
    }

    private static hhr w(ConcurrentHashMap concurrentHashMap, Class cls, String str, Object obj) {
        hhr hhrVar = (hhr) concurrentHashMap.get(str);
        if (hhrVar == null) {
            hhrVar = new hhr(str, cls);
            hhr hhrVar2 = (hhr) concurrentHashMap.putIfAbsent(str, hhrVar);
            if (hhrVar2 != null) {
                hhrVar = hhrVar2;
            }
            if (obj != null) {
                hhrVar.m(hie.HERMETRIC_OVERRIDE, obj);
            }
        }
        return hhrVar;
    }

    private final hhr x(hie hieVar, ConcurrentHashMap concurrentHashMap, Class cls, String str, Object obj, lmx lmxVar, lmx lmxVar2, Object obj2) {
        hhr w = w(concurrentHashMap, cls, str, obj2);
        z(w, hieVar, lmxVar, lmxVar2, w.m(hieVar, obj));
        return w;
    }

    private static void y(Map map, Printer printer) {
        for (hhr hhrVar : map.values()) {
            printer.println(hhrVar.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.concurrent.Executor, java.lang.Object] */
    private final void z(hhr hhrVar, hie hieVar, lmx lmxVar, lmx lmxVar2, boolean z) {
        ijk ijkVar;
        mko K;
        mko b2;
        if (z) {
            if (lmxVar != null) {
                lmxVar.d(hhrVar);
            } else {
                o(lmz.r(hhrVar), hhw.NOTIFY_ONE_FLAG_CHANGED);
            }
        }
        if (lmxVar2 == null) {
            if (!u()) {
                hig higVar = hig.BOOL_VALUE;
                hie hieVar2 = hie.DEFAULT;
                int ordinal = hieVar.ordinal();
                if (ordinal != 1) {
                    ijkVar = ordinal != 4 ? null : this.q;
                } else {
                    ijkVar = this.p;
                }
                if (ijkVar != null) {
                    idn k = k(hhw.PERSIST_ONE_FLAG_TO_SHARED_PREFERENCES);
                    ijkVar.e(lmz.r(hhrVar));
                    K = kcu.K(k);
                }
                K = kcu.K(null);
            } else {
                if (this.o != null) {
                    idn k2 = k(hhw.PERSIST_ONE_FLAG_TO_DATA_STORE);
                    ijk ijkVar2 = this.o;
                    if (!ijk.c(hieVar)) {
                        b2 = mkk.a;
                    } else {
                        b2 = ((kqr) ijkVar2.a).b(new fyn(hhrVar, hieVar, 7), ijkVar2.b);
                    }
                    K = mio.g(b2, new hdp(k2, 2), mjl.a);
                }
                K = kcu.K(null);
            }
            r(K);
            return;
        }
        lmxVar2.d(hhrVar);
    }

    public final int a(hie hieVar, Map map, Collection collection, lmx lmxVar, lmx lmxVar2) {
        int i = 0;
        for (hhr hhrVar : map.values()) {
            if (!collection.contains(hhrVar)) {
                z(hhrVar, hieVar, lmxVar, lmxVar2, hhrVar.k(hieVar));
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final hhl b(String str, boolean z) {
        return j(this.c, Boolean.class, str, Boolean.valueOf(z), (Boolean) l(str, fxd.t));
    }

    public final hhl c(hie hieVar, String str, boolean z, lmx lmxVar, lmx lmxVar2) {
        return x(hieVar, this.c, Boolean.class, str, Boolean.valueOf(z), lmxVar, lmxVar2, (Boolean) l(str, fxd.t));
    }

    public final hhl d(hie hieVar, String str, byte[] bArr, lmx lmxVar, lmx lmxVar2) {
        return x(hieVar, this.g, byte[].class, str, bArr, lmxVar, lmxVar2, (byte[]) l(str, hht.c));
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("FlagManager (V5):");
        nfh t = hij.b.t();
        A(t, this.c);
        A(t, this.d);
        A(t, this.e);
        A(t, this.f);
        A(t, this.g);
        printer.println(lyk.d.i(((hij) t.cz()).q()));
        y(this.c, printer);
        y(this.d, printer);
        y(this.e, printer);
        y(this.f, printer);
        y(this.g, printer);
        int size = this.c.size();
        int size2 = this.d.size();
        int size3 = this.e.size();
        int size4 = this.f.size();
        int size5 = this.g.size();
        printer.println("FlagManager dump finish: " + (size + size2 + size3 + size4 + size5) + " flags in total.");
    }

    public final hhl e(hie hieVar, String str, double d, lmx lmxVar, lmx lmxVar2) {
        return x(hieVar, this.e, Double.class, str, Double.valueOf(d), lmxVar, lmxVar2, (Double) l(str, hht.b));
    }

    public final hhl f(hie hieVar, String str, long j, lmx lmxVar, lmx lmxVar2) {
        return x(hieVar, this.d, Long.class, str, Long.valueOf(j), lmxVar, lmxVar2, (Long) l(str, hht.a));
    }

    public final hhl g(hie hieVar, String str, String str2, lmx lmxVar, lmx lmxVar2) {
        return x(hieVar, this.f, String.class, str, str2, lmxVar, lmxVar2, (String) l(str, fxd.u));
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "FlagManager";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final hhr h(String str, byte[] bArr) {
        return i(this.g, byte[].class, str, bArr, (byte[]) l(str, hht.c));
    }

    public final hhr i(ConcurrentHashMap concurrentHashMap, Class cls, String str, Object obj, Object obj2) {
        hhr w = w(concurrentHashMap, cls, str, obj2);
        w.l(obj, false);
        return w;
    }

    public final hhr j(ConcurrentHashMap concurrentHashMap, Class cls, String str, Object obj, Object obj2) {
        hhr w = w(concurrentHashMap, cls, str, obj2);
        w.l(obj, true);
        return w;
    }

    public final idn k(ids idsVar) {
        if (this.h != null) {
            return this.h.a(idsVar);
        }
        return null;
    }

    public final Object l(String str, leq leqVar) {
        String c;
        jlt jltVar = this.l;
        if (jltVar == null || (c = jltVar.c(this.r, null, str)) == null) {
            return null;
        }
        return leqVar.a(c);
    }

    public final void m(Map map, leq leqVar, lmx lmxVar) {
        for (Map.Entry entry : map.entrySet()) {
            Object l = l((String) entry.getKey(), leqVar);
            if (l != null) {
                hhr hhrVar = (hhr) entry.getValue();
                if (hhrVar.m(hie.HERMETRIC_OVERRIDE, l)) {
                    lmxVar.d(hhrVar);
                }
            }
        }
    }

    public final void o(Set set, ids idsVar) {
        idn k = idsVar != null ? k(idsVar) : null;
        synchronized (this) {
            if (!this.s.isEmpty()) {
                lls h = llw.h();
                boolean z = false;
                for (Map.Entry entry : this.s.entrySet()) {
                    hho hhoVar = (hho) entry.getKey();
                    lsf j = lvw.j((Set) entry.getValue(), set);
                    if (!j.isEmpty()) {
                        h.a(hhoVar, j);
                        z = true;
                    }
                }
                if (!z) {
                    return;
                }
                r(mio.g(gyc.b.hP(new gxd(h, 7)), new hdp(k, 5), mjl.a));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void p(hho hhoVar, Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        if (hhoVar == null) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/flag/FlagManager", "registerObserver", 918, "FlagManager.java")).w("Observer is null when registering: %s", collection);
            return;
        }
        lmz lmzVar = (lmz) this.s.get(hhoVar);
        if (lmzVar == null) {
            this.s.put(hhoVar, lmz.p(collection));
            return;
        }
        lmx g = lmz.g();
        g.j(lmzVar);
        g.j(collection);
        this.s.put(hhoVar, g.g());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void q(hho hhoVar, hhl... hhlVarArr) {
        lmz lmzVar = (lmz) this.s.get(hhoVar);
        if (lmzVar == null) {
            this.s.put(hhoVar, lmz.q(hhlVarArr));
            return;
        }
        lmx g = lmz.g();
        g.j(lmzVar);
        g.i(hhlVarArr);
        this.s.put(hhoVar, g.g());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void s(hho hhoVar) {
        this.s.remove(hhoVar);
    }

    public final boolean t(hie hieVar, Map map, String str, lmx lmxVar, lmx lmxVar2) {
        hhr hhrVar = (hhr) map.get(str);
        if (hhrVar != null) {
            z(hhrVar, hieVar, lmxVar, lmxVar2, hhrVar.k(hieVar));
            return true;
        }
        return false;
    }

    public final boolean u() {
        return this.i != null && this.i.a();
    }

    public final boolean v() {
        return this.i != null && this.i.b();
    }
}
