package defpackage;

import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* renamed from: hze  reason: default package */
/* loaded from: classes.dex */
public final class hze {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/mdd/FlaggedDownloadManager");
    private static volatile hze d;
    public final hyy c;
    private final HashMap e = new HashMap();
    public final HashSet b = new HashSet();

    public hze(hyy hyyVar) {
        this.c = hyyVar;
    }

    public static hze a() {
        hze hzeVar = d;
        if (hzeVar == null) {
            synchronized (hze.class) {
                hzeVar = d;
                if (hzeVar == null) {
                    hzeVar = new hze(hyy.a());
                    d = hzeVar;
                }
            }
        }
        return hzeVar;
    }

    public final synchronized void b(hzd hzdVar) {
        mko mkoVar = hzdVar.g;
        if (mkoVar != null) {
            mkoVar.cancel(true);
        }
        if (hzdVar.i != null) {
            jhs jhsVar = (jhs) hzdVar.b.j();
            kcu.U(kcu.K(true), new fel(this, hzdVar, 7), mjl.a);
            return;
        }
        d(hzdVar);
    }

    public final synchronized void c(String str) {
        mko mkoVar;
        hzd hzdVar = (hzd) this.e.remove(str);
        this.c.g(str);
        if (hzdVar == null || (mkoVar = hzdVar.g) == null) {
            return;
        }
        mkoVar.cancel(true);
        hzdVar.e.a(null);
    }

    public final synchronized void d(hzd hzdVar) {
        hyy hyyVar = this.c;
        String str = hzdVar.a;
        jix jixVar = hyyVar.d;
        jhz a2 = jia.a();
        a2.b(str);
        hzdVar.g = mio.h(mkh.q(jixVar.b(a2.a())), new hzb(this, hzdVar, 0), mjl.a);
        kcu.U(hzdVar.g, new hyw(hzdVar, 2), mjl.a);
    }

    public final synchronized void e(hic hicVar, leq leqVar, String str, hyz hyzVar, hyz hyzVar2, dir dirVar, hiu hiuVar) {
        hzd hzdVar = new hzd(str, hicVar, hyzVar, hyzVar2, dirVar, hiuVar, leqVar);
        this.e.put(str, hzdVar);
        this.b.add(hicVar.d());
        hzdVar.h = new ewy(this, hzdVar, 3);
        hicVar.f(hzdVar.h, mjl.a);
        if (jai.b.b()) {
            b(hzdVar);
        }
    }

    public final synchronized void f(String str, String str2, lgb lgbVar, hyz hyzVar, hyz hyzVar2, dir dirVar, hiu hiuVar) {
        kcu.U(mkh.q(((hzq) lgbVar).a()), new hzc(this, str, str2, hyzVar, hyzVar2, dirVar, hiuVar, 0), mjl.a);
    }
}
