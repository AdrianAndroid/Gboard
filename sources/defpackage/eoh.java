package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;

/* compiled from: PG */
/* renamed from: eoh */
/* loaded from: classes.dex */
public final class eoh implements hho {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/spellchecker/superpacks/SpellCheckerDataManager");
    private static eoh h;
    public final eol c;
    private lmz j;
    private final ExecutorService k;
    private boolean i = false;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final AtomicLong d = new AtomicLong(0);
    public final AtomicLong e = new AtomicLong(0);
    public final AtomicBoolean f = new AtomicBoolean(true);
    public final AtomicBoolean g = new AtomicBoolean(true);
    private volatile mko l = null;

    private eoh(Context context, ExecutorService executorService) {
        eol a2 = eol.a(context);
        this.k = executorService;
        this.c = a2;
    }

    public static eoh b(Context context) {
        if (h == null) {
            eoh eohVar = new eoh(context, gxo.a(10));
            h = eohVar;
            if (!eohVar.i) {
                eohVar.c.b();
                hhq.p(eohVar, eng.n, ith.a);
                eohVar.i = true;
            }
        }
        return h;
    }

    public static /* bridge */ /* synthetic */ void d(eoh eohVar) {
        eohVar.l = null;
    }

    private final eoc f(jav javVar, eod eodVar) {
        eoc eocVar = (eoc) this.b.get(eog.a(javVar, eodVar));
        if (eocVar != null || eot.h(eodVar) == 2) {
            return eocVar;
        }
        jau I = jav.I(javVar);
        do {
            List asList = Arrays.asList(I.a());
            Iterator it = this.b.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                eog eogVar = (eog) it.next();
                if (eogVar.b == eodVar && eogVar.a.h(asList) != null) {
                    eocVar = (eoc) this.b.get(eogVar);
                    break;
                }
            }
        } while (I.d());
        return eocVar;
    }

    private final void g() {
        eok a2;
        mko I;
        mko h2;
        eod[] values;
        if (this.l != null || this.j == null || this.e.get() + 300000 > System.currentTimeMillis()) {
            return;
        }
        if (!this.g.get()) {
            if (!this.f.get()) {
                return;
            }
            lsz it = this.j.iterator();
            while (it.hasNext()) {
                jav javVar = (jav) it.next();
                for (eod eodVar : eod.values()) {
                    if (!eot.g(eodVar) || f(javVar, eodVar) != null) {
                    }
                }
            }
            return;
        }
        eol eolVar = this.c;
        lmz lmzVar = this.j;
        if (!irv.b()) {
            ((ltd) ((ltd) eol.a.b()).k("com/google/android/apps/inputmethod/libs/spellchecker/superpacks/SpellCheckerSuperpacksManager", "sync", 120, "SpellCheckerSuperpacksManager.java")).t("Failed to sync due to network disconnected.");
            h2 = kcu.I();
        } else {
            if (!eolVar.f) {
                eolVar.b();
            }
            String str = (String) eng.n.c();
            Matcher matcher = eol.b.matcher(str);
            if (matcher.find()) {
                a2 = eok.a(str, Integer.valueOf(Integer.parseInt(matcher.group(1))));
            } else {
                a2 = eok.a(str, 0);
            }
            if (TextUtils.isEmpty(a2.a) || a2.b.intValue() == 0) {
                I = kcu.I();
            } else {
                jsu j = jsv.j();
                j.a = a2.a;
                j.g(2);
                j.d(2);
                I = eolVar.d.e(eolVar.c, a2.b.intValue(), j.a());
            }
            jyu g = jsq.g();
            g.e("language_tags", lmzVar);
            h2 = mio.h(mio.h(mkh.q(I), new dvb(eolVar, g.b(), 4), eolVar.e), new eoi(eolVar, 1), eolVar.e);
        }
        this.l = h2;
        kcu.U(this.l, new eay(this, 2), this.k);
    }

    public final synchronized void c(lmz lmzVar) {
        lmz lmzVar2 = this.j;
        if (lmzVar2 == null || !lmzVar2.equals(lmzVar)) {
            this.j = lmzVar;
            this.f.set(true);
        }
        g();
    }

    public final eoc e(jav javVar, eod eodVar) {
        eoc f = f(javVar, eodVar);
        g();
        if (f != null) {
            return f;
        }
        if (this.l != null) {
            synchronized (this.d) {
                try {
                    this.d.wait(100L);
                } catch (InterruptedException unused) {
                }
            }
        }
        return f(javVar, eodVar);
    }

    @Override // defpackage.hho
    public final void gW(Set set) {
        this.g.set(true);
    }
}
