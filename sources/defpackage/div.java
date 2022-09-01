package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* renamed from: div  reason: default package */
/* loaded from: classes.dex */
public final class div implements dkb {
    public static final hhl a = hhq.a("enable_mdd_in_hmm", false);
    public static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/hmm/HmmDataFacilitator");
    private static volatile div f;
    private final int m;
    private final hqq q;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    private boolean o = false;
    public final Map d = new ConcurrentHashMap();
    private final dkc g = dkc.b();
    private final Map h = new ConcurrentHashMap();
    private final Map i = new ConcurrentHashMap();
    private final djl p = new djl();
    public final Map e = new ConcurrentHashMap();
    private final Map j = new qo();
    private final Map k = new qo();
    private final ino n = ino.L();
    private final Set l = new HashSet();

    public div(int i) {
        dis disVar = new dis(this);
        this.q = disVar;
        this.m = i;
        disVar.d(gxo.a(10));
    }

    public static div c() {
        div divVar = f;
        if (divVar == null) {
            synchronized (div.class) {
                divVar = f;
                if (divVar == null) {
                    divVar = new div(((Long) diz.b.a()).intValue());
                    dkc dkcVar = divVar.g;
                    if (dkcVar != null) {
                        synchronized (dkcVar.b) {
                            if (!dkcVar.b.contains(divVar)) {
                                dkcVar.b.add(divVar);
                            }
                        }
                    }
                    f = divVar;
                }
            }
        }
        return divVar;
    }

    private static void m(String str, din dinVar) {
        String b2 = din.b(str);
        ino L = ino.L();
        int i = dinVar.b;
        String str2 = i != 1 ? i != 2 ? "DOWNLOAD" : "OEM" : "APK";
        int i2 = dinVar.a;
        L.j(b2, str2 + "," + i2);
        ieh.j().e(dja.DATA_DICTIONARY_CHANGED, str, dinVar);
    }

    private final synchronized boolean n() {
        if (this.g != null && !this.o) {
            if (this.n.ak("pref_key_hmm_superpack_synced")) {
                return true;
            }
        }
        return false;
    }

    public final synchronized int a(String str) {
        int i;
        dkd dkdVar = (dkd) this.j.get(str);
        dkd dkdVar2 = ((Boolean) a.c()).booleanValue() ? (dkd) this.k.get(str) : null;
        if (dkdVar2 != null) {
            i = dkdVar2.a.a;
        } else {
            i = dkdVar != null ? dkdVar.a.a : 0;
        }
        return Math.max(i, b(str));
    }

    public final int b(String str) {
        return Math.max(this.h.get(str) != null ? this.m : 0, this.p.a(str));
    }

    public final djm d(diu diuVar) {
        return (djm) this.c.get(diuVar);
    }

    public final void e(String str) {
        if (!((Boolean) a.c()).booleanValue() || TextUtils.isEmpty(str) || !this.l.add(str)) {
            return;
        }
        ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/libs/hmm/HmmDataFacilitator", "maybeDownloadWithMdd", 282, "HmmDataFacilitator.java")).w("requesting download of hmm pack %s", str);
        Context a2 = guw.a();
        String concat = "hmm_data_".concat(String.valueOf(jdg.X(str)));
        hze a3 = hze.a();
        hzq hzqVar = new hzq(a2.getResources().openRawResource(R.raw.f147440_resource_name_obfuscated_res_0x7f130060), concat, gxo.a(10));
        hyt a4 = hyz.a();
        a4.c(true);
        a4.e(500);
        hyz a5 = a4.a();
        hyt a6 = hyz.a();
        a6.e(500);
        a3.f(concat, str, hzqVar, a5, a6.a(), dir.a, new bxj(this, 19));
    }

    final void f(List list, String str, dkd dkdVar) {
        if (this.g == null) {
            ((ltd) b.a(hip.a).k("com/google/android/apps/inputmethod/libs/hmm/HmmDataFacilitator", "newDownloadDataAvailable", 347, "HmmDataFacilitator.java")).t("dictionary superpack manager is null!!");
        } else if (dkdVar.a.a > b(str)) {
            if (this.g == null) {
                ((ltd) b.a(hip.a).k("com/google/android/apps/inputmethod/libs/hmm/HmmDataFacilitator", "downloadDataProviderReady", 359, "HmmDataFacilitator.java")).t("dictionary superpack manager is null!!");
                return;
            }
            File file = (File) this.p.a.get(str);
            if (file != null) {
                file.delete();
            }
            HashSet<diu> hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                diu diuVar = (diu) it.next();
                if (this.c.putIfAbsent(diuVar, dkdVar) == null) {
                    hashSet.add(diuVar);
                } else if (!dkdVar.equals(this.c.get(diuVar))) {
                    this.d.put(diuVar, dkdVar);
                }
            }
            HashSet hashSet2 = new HashSet();
            for (diu diuVar2 : hashSet) {
                diuVar2.z();
                String str2 = (String) this.e.get(diuVar2);
                if (!TextUtils.isEmpty(str2) && hashSet2.add(str2)) {
                    m(str2, dkdVar.a);
                }
            }
        }
    }

    public final synchronized void g(jho jhoVar) {
        if (jhoVar != null) {
            String str = jhoVar.b;
            File e = hyy.a().e((jhn) jhoVar.g.get(0));
            dkd dkdVar = e != null ? new dkd(e.getParentFile(), jhoVar.e, 3) : null;
            ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/libs/hmm/HmmDataFacilitator", "onMddDataDownloaded", 308, "HmmDataFacilitator.java")).w("hmm pack %s downloaded by mdd", jhoVar.b);
            if (dkdVar != null) {
                this.k.put(str, dkdVar);
                List list = (List) this.i.get(str);
                if (list != null) {
                    f(list, str, dkdVar);
                }
            }
        }
    }

    @Override // defpackage.dkb
    public final synchronized void h(byy byyVar) {
        if (this.g == null) {
            ((ltd) b.a(hip.a).k("com/google/android/apps/inputmethod/libs/hmm/HmmDataFacilitator", "onNewDataAvailable", 409, "HmmDataFacilitator.java")).t("dictionary superpack manager is null!!");
            return;
        }
        k(byyVar);
        for (Map.Entry entry : this.i.entrySet()) {
            dkd dkdVar = (dkd) this.j.get(entry.getKey());
            if (dkdVar != null) {
                f((List) entry.getValue(), (String) entry.getKey(), dkdVar);
            }
        }
    }

    public final void i(diu diuVar, String str, String str2) {
        boolean z;
        boolean z2;
        ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/libs/hmm/HmmDataFacilitator", "requestData", 166, "HmmDataFacilitator.java")).J("requestData(): consumer %s, language %s, packName %s", diuVar.getClass().getName(), str, str2);
        this.e.put(diuVar, str);
        if (!TextUtils.isEmpty(str2)) {
            List list = (List) this.i.get(str2);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.i.put(str2, list);
                z2 = true;
            } else {
                z2 = false;
            }
            list.add(diuVar);
            z = z2;
        } else {
            z = false;
        }
        ieh.j().e(dja.DATA_REQUESTED, new Object[0]);
        if (n()) {
            dkc dkcVar = this.g;
            kcu.U(dkcVar.d.b(dkcVar.e), new dit(this, diuVar, str, str2, z), mjl.a);
            return;
        }
        j(diuVar, str, str2, z);
    }

    public final synchronized void j(diu diuVar, String str, String str2, boolean z) {
        dkd dkdVar;
        int i;
        int i2;
        String name;
        dkc dkcVar;
        djm djmVar = (djm) this.h.get(str);
        dkd dkdVar2 = (dkd) this.j.get(str);
        hhl hhlVar = a;
        dkd dkdVar3 = ((Boolean) hhlVar.c()).booleanValue() ? (dkd) this.k.get(str) : null;
        if (dkdVar3 != null) {
            ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/libs/hmm/HmmDataFacilitator", "requestDataInternal", 221, "HmmDataFacilitator.java")).w("using mdd data for pack %s", str2);
            i = dkdVar3.a.a;
            dkdVar = dkdVar3;
        } else if (dkdVar2 != null) {
            dkdVar = dkdVar2;
            i = dkdVar2.a.a;
        } else {
            dkdVar = null;
            i = 0;
        }
        int a2 = this.p.a(str2);
        int i3 = djmVar == null ? 0 : this.m;
        if (i3 < a2 || i3 < i || i3 <= 0) {
            int i4 = 2;
            if (a2 <= i3 || a2 <= i) {
                i2 = -1;
                if (i <= 0 || i <= i3 || i < a2) {
                    djmVar = null;
                } else {
                    if (dkdVar3 == null) {
                        i4 = 3;
                    }
                    i2 = i4;
                    djmVar = dkdVar;
                }
            } else {
                djl djlVar = this.p;
                String lowerCase = str2.toLowerCase(Locale.US);
                File file = (File) djlVar.a.get(lowerCase);
                if (file == null) {
                    File file2 = (File) djlVar.b.get(lowerCase);
                    if (file2 != null) {
                        File b2 = djlVar.b(file2, new File(djlVar.c, file2.getName().substring(0, name.length() - 4)));
                        if (b2 != null) {
                            djlVar.a.put(lowerCase, b2);
                        }
                    }
                    file = (File) djlVar.a.get(lowerCase);
                }
                djmVar = new dkd(file, a2, 2);
                i2 = 1;
            }
        } else {
            i2 = 0;
        }
        if (djmVar != null && this.c.get(diuVar) == null) {
            this.c.put(diuVar, djmVar);
            diuVar.z();
            m(str, djmVar.a());
        }
        if (djmVar == null) {
            ieh.j().e(dja.DATA_MISSING, Integer.valueOf(dja.r.indexOf(str2)));
        } else {
            ieh.j().e(dja.DATA_LOADED, Integer.valueOf(i2));
        }
        if (!TextUtils.isEmpty(str2) && z && this.g != null && ((Boolean) hhlVar.c()).booleanValue() && (dkcVar = this.g) != null) {
            dkcVar.f();
        }
        e(str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void k(byy byyVar) {
        this.o = true;
        for (String str : byyVar.h()) {
            byz c = byyVar.c(str);
            File b2 = c.b();
            String b3 = c.a().n().b("locale", "");
            if (b3 != null) {
                ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/libs/hmm/HmmDataFacilitator", "setDownloadedPacks", 430, "HmmDataFacilitator.java")).w("Opening pack for language %s", b3);
                this.j.put(b3, new dkd(b2, c.a().n().f("version"), 3));
            }
            c.close();
        }
        this.n.f("pref_key_hmm_superpack_synced", true);
    }

    public final boolean l(diu diuVar) {
        return this.d.get(diuVar) != null;
    }
}
