package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import j$.util.Collection$EL;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: cdx  reason: default package */
/* loaded from: classes.dex */
public final class cdx implements hhk {
    public static volatile cdx a;
    public final Context b;
    private final cfd g;
    private final cdk j;
    public volatile long f = Long.MAX_VALUE;
    private final Map h = new HashMap();
    private llw i = lrq.b;
    public final Set c = new HashSet();
    public final Set d = new HashSet();
    public final List e = new ArrayList();
    private lmz k = lrr.a;
    private llw l = lrq.b;

    public cdx(Context context) {
        cfd b = cfd.b(context);
        this.b = context;
        this.g = b;
        this.j = new cdk(context, this);
    }

    public static cdx b(Context context) {
        cdx cdxVar = a;
        if (cdxVar == null) {
            synchronized (cdx.class) {
                cdxVar = a;
                if (cdxVar == null) {
                    cdxVar = new cdx(context);
                    Map p = ffb.p((String) cas.c.c());
                    if (!p.isEmpty()) {
                        cdxVar.i = llw.k(p);
                    }
                    cas.c.e(cdxVar);
                    cdk cdkVar = cdxVar.j;
                    int b = cdkVar.a.b("assignment_version", 0);
                    if (b > 0) {
                        cdkVar.c = b;
                        Set e = cdkVar.a.e("assigned_noredirect", lrr.a);
                        String d = cdkVar.a.d("assigned_redirect", "");
                        if (!e.isEmpty() || !d.isEmpty()) {
                            cdkVar.b.e(d.isEmpty() ? lrq.b : llw.k(ffb.o(d)), e.isEmpty() ? lrr.a : lmz.p((Collection) Collection$EL.stream(e).map(byw.g).collect(Collectors.toSet())), true);
                        }
                    }
                    ijl.b().h(cdkVar, cdp.class, gxo.a(10));
                    ccu.i.e(cdkVar);
                    if (((Boolean) cas.k.c()).booleanValue()) {
                        SharedPreferences sharedPreferences = cdxVar.b.getSharedPreferences("his_langid_result", 0);
                        String string = sharedPreferences.getString("lang_detection", "");
                        if (!string.isEmpty()) {
                            cdxVar.h.putAll(ffb.p(string));
                        }
                        String string2 = sharedPreferences.getString("lm_eval_result", "");
                        if (!string2.isEmpty()) {
                            Set set = cdxVar.d;
                            HashSet hashSet = new HashSet();
                            if (!string2.isEmpty()) {
                                for (String str : lfy.c(',').i(string2)) {
                                    List k = lfy.c('|').k(str);
                                    if (k.size() == 3 && !((String) k.get(0)).isEmpty() && !((String) k.get(1)).isEmpty() && (((String) k.get(2)).equals("true") || ((String) k.get(2)).equals("false"))) {
                                        Locale n = ffb.n((String) k.get(0));
                                        Locale n2 = ffb.n((String) k.get(1));
                                        if (n != null && n2 != null) {
                                            hashSet.add(new cdw(n, n2, ((String) k.get(2)).equals("true")));
                                        }
                                    }
                                }
                            }
                            set.addAll(hashSet);
                        }
                    }
                    a = cdxVar;
                }
            }
        }
        return cdxVar;
    }

    public static final boolean f() {
        return h() || g();
    }

    private static boolean g() {
        return ((Boolean) cas.l.c()).booleanValue();
    }

    private static boolean h() {
        return ((Boolean) cas.j.c()).booleanValue();
    }

    public final Locale c(Locale locale) {
        Locale locale2;
        jav d = jav.d(locale);
        if (this.k.contains(d)) {
            return null;
        }
        if (this.l.containsKey(d)) {
            return ((jav) this.l.get(d)).q();
        }
        if (h() && (locale2 = (Locale) this.i.get(locale)) != null) {
            return locale2;
        }
        if (!g()) {
            return null;
        }
        return (Locale) this.h.get(locale);
    }

    public final Locale d(Locale locale) {
        Locale c = c(locale);
        return c != null ? c : locale;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(llw llwVar, lmz lmzVar, boolean z) {
        low lqmVar;
        if (z) {
            this.l = llwVar;
            this.k = lmzVar;
            return;
        }
        HashSet hashSet = new HashSet();
        if (!this.l.equals(llwVar)) {
            llw llwVar2 = this.l;
            if (llwVar2 instanceof SortedMap) {
                SortedMap sortedMap = (SortedMap) llwVar2;
                jdg.u(sortedMap);
                jdg.u(llwVar);
                Comparator comparator = sortedMap.comparator();
                if (comparator == null) {
                    comparator = lrb.a;
                }
                TreeMap x = lre.x(comparator);
                TreeMap x2 = lre.x(comparator);
                x2.putAll(llwVar);
                TreeMap x3 = lre.x(comparator);
                TreeMap x4 = lre.x(comparator);
                lre.y(sortedMap, llwVar, len.a, x, x2, x3, x4);
                lqmVar = new lqn(x, x2, x3, x4);
            } else {
                len lenVar = len.a;
                LinkedHashMap t = lre.t();
                LinkedHashMap linkedHashMap = new LinkedHashMap(llwVar);
                LinkedHashMap t2 = lre.t();
                LinkedHashMap t3 = lre.t();
                lre.y(llwVar2, llwVar, lenVar, t, linkedHashMap, t2, t3);
                lqmVar = new lqm(t, linkedHashMap, t2, t3);
            }
            hashSet.addAll(this.l.keySet());
            hashSet.addAll(llwVar.keySet());
            hashSet.removeAll(lqmVar.b().keySet());
        }
        if (!this.k.equals(lmzVar)) {
            lmz lmzVar2 = this.k;
            jdg.Q(lmzVar2, "set1");
            jdg.Q(lmzVar, "set2");
            hashSet.addAll(new lsd(lmzVar2, lmzVar));
        }
        if (hashSet.isEmpty()) {
            return;
        }
        this.l = llwVar;
        this.k = lmzVar;
        this.e.clear();
        this.e.addAll((Collection) Collection$EL.stream(hashSet).map(byw.h).collect(Collectors.toSet()));
        this.f = System.currentTimeMillis();
        this.g.k(false);
        this.c.removeAll((Collection) Collection$EL.stream(this.k).map(byw.h).collect(Collectors.toSet()));
    }

    @Override // defpackage.hhk
    public final void ib(hhl hhlVar) {
        Map p = ffb.p((String) cas.c.c());
        HashSet<Locale> hashSet = new HashSet();
        hashSet.addAll(p.keySet());
        hashSet.addAll(this.i.keySet());
        HashMap hashMap = new HashMap();
        HashSet hashSet2 = new HashSet();
        this.e.clear();
        boolean z = false;
        for (Locale locale : hashSet) {
            Locale locale2 = (Locale) p.get(locale);
            if (locale2 == null) {
                hashSet2.add(locale);
                this.c.remove(locale);
                this.e.add(locale);
            } else {
                Locale locale3 = (Locale) this.i.get(locale);
                if (locale3 == null) {
                    hashMap.put(locale, locale2);
                    this.e.add(locale);
                } else if (!locale2.equals(locale3)) {
                    hashMap.put(locale, locale2);
                    this.e.add(locale);
                }
            }
            z = true;
        }
        if (!hashSet2.isEmpty()) {
            lls h = llw.h();
            lsz it = this.i.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet2.contains(entry.getKey())) {
                    h.g(entry);
                }
            }
            this.i = h.l();
        }
        if (z) {
            lls h2 = llw.h();
            for (Map.Entry entry2 : hashMap.entrySet()) {
                h2.g(entry2);
            }
            this.i = h2.l();
            if (!h()) {
                return;
            }
            this.f = System.currentTimeMillis();
            this.g.k(false);
        }
    }
}
