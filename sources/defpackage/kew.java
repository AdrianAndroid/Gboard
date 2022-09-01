package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: kew */
/* loaded from: classes.dex */
public final class kew extends ker implements kdt {
    private static final ltg a = ltg.j("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitMetricServiceImpl");
    private final kdq b;
    private final Context c;
    private final Executor d;
    private final keo e;
    private final oiy f;
    private final nox g;
    private final oiy h;
    private final oiy i;

    public kew(kdr kdrVar, Context context, Executor executor, keo keoVar, oiy oiyVar, nox noxVar, oiy oiyVar2, oiy oiyVar3) {
        this.b = kdrVar.a(executor, noxVar, null);
        this.c = context;
        this.d = executor;
        this.e = keoVar;
        this.f = oiyVar;
        this.g = noxVar;
        this.h = oiyVar2;
        this.i = oiyVar3;
    }

    public static /* synthetic */ mko c(kew kewVar) {
        if (!((ken) kewVar.g.a()).b()) {
            return mkk.a;
        }
        if (!Application.getProcessName().equals(String.valueOf(kewVar.c.getPackageName()).concat(String.valueOf(((ken) kewVar.g.a()).a)))) {
            return mkk.a;
        }
        if (!((Boolean) kewVar.h.a()).booleanValue()) {
            return mkk.a;
        }
        final List a2 = kewVar.e.a(0, 0, ((SharedPreferences) kewVar.f.a()).getString("lastExitProcessName", null), ((SharedPreferences) kewVar.f.a()).getLong("lastExitTimestamp", -1L));
        if (a2.isEmpty()) {
            return mkk.a;
        }
        ona onaVar = (ona) kewVar.i.a();
        nfh t = omz.e.t();
        int i = ((lrl) a2).c;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        omz omzVar = (omz) t.b;
        int i2 = omzVar.a | 2;
        omzVar.a = i2;
        omzVar.d = i;
        onaVar.getClass();
        omzVar.c = onaVar;
        omzVar.a = i2 | 1;
        HashSet l = lvw.l();
        for (int i3 = 0; i3 < onaVar.a.size(); i3++) {
            int d = ols.d(onaVar.a.d(i3));
            if (d == 0) {
                d = 1;
            }
            l.add(Integer.valueOf(d - 1));
        }
        lta listIterator = ((llp) a2).listIterator();
        while (listIterator.hasNext()) {
            omy omyVar = (omy) listIterator.next();
            int d2 = ols.d(omyVar.c);
            if (d2 == 0) {
                d2 = 1;
            }
            if (l.contains(Integer.valueOf(d2 - 1))) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                omz omzVar2 = (omz) t.b;
                omyVar.getClass();
                nga ngaVar = omzVar2.b;
                if (!ngaVar.c()) {
                    omzVar2.b = nfm.H(ngaVar);
                }
                omzVar2.b.add(omyVar);
            }
        }
        omz omzVar3 = (omz) t.cz();
        kdq kdqVar = kewVar.b;
        kdl a3 = kdm.a();
        nfh t2 = oos.u.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        oos oosVar = (oos) t2.b;
        omzVar3.getClass();
        oosVar.l = omzVar3;
        oosVar.a |= 524288;
        a3.d((oos) t2.cz());
        return mio.g(kdqVar.b(a3.a()), new leq() { // from class: ket
            @Override // defpackage.leq
            public final Object a(Object obj) {
                kew.this.u(a2, (Void) obj);
                return null;
            }
        }, kewVar.d);
    }

    @Override // defpackage.kdt
    public void ad() {
        w();
    }

    public /* synthetic */ mko t() {
        return gkm.b(this.c, new Runnable() { // from class: kev
            @Override // java.lang.Runnable
            public final void run() {
                kew.this.v();
            }
        });
    }

    public /* synthetic */ Void u(List list, Void r7) {
        int i = 0;
        omy omyVar = (omy) list.get(0);
        do {
            String str = omyVar.b;
            i++;
            if (((SharedPreferences) this.f.a()).edit().putString("lastExitProcessName", str).putLong("lastExitTimestamp", omyVar.f).commit()) {
                return null;
            }
        } while (i < 3);
        ((ltd) ((ltd) a.d()).k("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitMetricServiceImpl", "updateLastRecordedAppExit", 179, "ApplicationExitMetricServiceImpl.java")).t("Failed to persist most recent App Exit");
        return null;
    }

    public /* synthetic */ void v() {
        kcu.P(new mix() { // from class: keu
            @Override // defpackage.mix
            public final mko a() {
                return kew.c(kew.this);
            }
        }, this.d);
    }

    public void w() {
        kcu.P(new mix() { // from class: kes
            @Override // defpackage.mix
            public final mko a() {
                return kew.this.t();
            }
        }, this.d);
    }
}
