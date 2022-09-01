package defpackage;

import android.content.Context;
import android.os.Handler;
import android.util.Printer;
import j$.util.Objects;
import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: idz  reason: default package */
/* loaded from: classes.dex */
public class idz implements idi, gzv {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/metrics/clearcut/BaseClearcutAdapter");
    static final hhl b = hhq.a("check_checkbox", false);
    protected final Context c;
    public final flo d;
    public final fma e;
    public final gkd i;
    private fnz m;
    private boolean j = false;
    private final ArrayDeque k = new ArrayDeque();
    final hhk g = new ffp(this, 6);
    public final AtomicReference h = new AtomicReference(null);
    private final gfg l = new idy(this);
    public final String f = "LATIN_IME";

    static {
        hhq.a("debug_log_verifier", false);
    }

    public idz(Context context, gkd gkdVar) {
        ieq ieqVar = null;
        this.c = context;
        this.i = gkdVar;
        flo floVar = new flo(context, "LATIN_IME");
        this.d = floVar;
        fma fmaVar = new fma(floVar, "GOOGLE_KEYBOARD_COUNTERS", 1024);
        this.e = fmaVar;
        fmaVar.d();
        ieq k = k();
        if (k != null) {
            gjo gjoVar = new gjo(ldu.a);
            gjr gjrVar = ((gjv) gjh.a.b).b;
            gjt gjtVar = (gjt) gjrVar;
            if (gjtVar.b[15] != null) {
                k.d = k.b(k.b);
                k.b.X(k.e, k.c);
                synchronized (gjtVar.b[15]) {
                    llk llkVar = new llk();
                    lta listIterator = ((gjt) gjrVar).b[15].a.listIterator();
                    while (listIterator.hasNext()) {
                        gjp gjpVar = (gjp) listIterator.next();
                        if (gjpVar.a.equals(gjoVar)) {
                            ieqVar = gjpVar.b;
                        } else {
                            llkVar.h(gjpVar);
                        }
                    }
                    llkVar.h(new gjp(gjoVar, k));
                    ((gjt) gjrVar).b[15].a = llkVar.g();
                }
                if (ieqVar != null) {
                    ieqVar.b.ad(ieqVar.e);
                }
            }
        }
        h();
        b.e(this.g);
        gzt.a.a(this);
    }

    private final synchronized void l() {
        if (this.m == null) {
            this.m = new fnz(this.c, gff.a, new gfe(), fny.a, null, null, null, null);
        }
        if (this.j) {
            return;
        }
        fnz fnzVar = this.m;
        fpt o = fhr.o(this.l, fnzVar.f, gfg.class.getSimpleName());
        gdf gdfVar = new gdf(fnzVar, o, ((gfe) fnzVar.d).b, 2, null);
        flc flcVar = new flc(fnzVar, 7);
        fpy fpyVar = new fpy();
        fpyVar.a = gdfVar;
        fpyVar.b = flcVar;
        fpyVar.d = o;
        boolean z = false;
        fpyVar.e = new fmv[]{gex.a};
        fpyVar.f = 4507;
        fyb.az(fpyVar.a != null, "Must set register function");
        fyb.az(fpyVar.b != null, "Must set unregister function");
        if (fpyVar.d != null) {
            z = true;
        }
        fyb.az(z, "Must set holder");
        fyb.aH(fpyVar.d.c, "Key must not be null");
        fpx fpxVar = new fpx(fpyVar, fpyVar.d, fpyVar.e, fpyVar.f);
        opu opuVar = new opu(fpyVar);
        Runnable runnable = fpyVar.c;
        fyb.aH(fpxVar.a(), "Listener has already been released.");
        fpj fpjVar = fnzVar.i;
        fxa fxaVar = new fxa();
        fpjVar.i(fxaVar, fpxVar.c, fnzVar);
        fon fonVar = new fon(new fws(fpxVar, opuVar, runnable, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null), fxaVar, null, null);
        Handler handler = fpjVar.m;
        handler.sendMessage(handler.obtainMessage(8, new nwo(fonVar, fpjVar.i.get(), fnzVar)));
        this.j = true;
    }

    private final synchronized void m() {
        fnz fnzVar = this.m;
        if (fnzVar == null || !this.j) {
            return;
        }
        fps fpsVar = fhr.o(this.l, fnzVar.f, gfg.class.getSimpleName()).c;
        fyb.aH(fpsVar, "Key must not be null");
        fpj fpjVar = fnzVar.i;
        fxa fxaVar = new fxa();
        fpjVar.i(fxaVar, 4508, fnzVar);
        fop fopVar = new fop(fpsVar, fxaVar, null);
        Handler handler = fpjVar.m;
        handler.sendMessage(handler.obtainMessage(13, new nwo(fopVar, fpjVar.i.get(), fnzVar)));
        this.j = false;
    }

    private static void n(Runnable runnable) {
        try {
            runnable.run();
        } catch (SecurityException e) {
            ((ltd) ((ltd) ((ltd) ((ltd) a.c()).i(e)).g(2, TimeUnit.MINUTES)).k("com/google/android/libraries/inputmethod/metrics/clearcut/BaseClearcutAdapter", "runLogRunnable", 373, "BaseClearcutAdapter.java")).t("Failed to log metrics.");
        }
    }

    @Override // defpackage.idi
    public final void a() {
        i(new hvg(this, 12));
    }

    @Override // defpackage.idi
    public final void b(String str, boolean z) {
        i(new cah(this, str, z, 3));
    }

    @Override // defpackage.idi
    public final void c(String str) {
        i(new idx(this, str, 1));
    }

    @Override // defpackage.idi
    public final void d(String str, int i) {
        i(new ov(this, str, i, 11));
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("isUserOptInCheckbox=".concat(String.valueOf(String.valueOf(this.h.get()))));
        int size = this.k.size();
        printer.println("cacheLogRunnables.size()=" + size);
    }

    @Override // defpackage.idi
    public final void e(String str, long j) {
        i(new fsm(this, str, j, 3));
    }

    @Override // defpackage.idi
    public void f(final mbh mbhVar, final int i, final long j, final long j2) {
        i(new Runnable() { // from class: idw
            @Override // java.lang.Runnable
            public final void run() {
                idz idzVar = idz.this;
                mbh mbhVar2 = mbhVar;
                int i2 = i;
                long j3 = j;
                long j4 = j2;
                flo floVar = idzVar.d;
                gkd gkdVar = idzVar.i;
                fyb.ax(mbhVar2);
                fyb.ax(gkdVar);
                Objects.requireNonNull(mbhVar2);
                flm b2 = floVar.b(new etm(mbhVar2, 4));
                b2.j = gkdVar;
                b2.b(i2);
                b2.g = idzVar.f;
                if (j3 > 0 && j4 > 0) {
                    nfj nfjVar = b2.i;
                    if (nfjVar.c) {
                        nfjVar.cD();
                        nfjVar.c = false;
                    }
                    nol nolVar = (nol) nfjVar.b;
                    nol nolVar2 = nol.j;
                    nolVar.a |= 1;
                    nolVar.b = j3;
                    nfj nfjVar2 = b2.i;
                    if (nfjVar2.c) {
                        nfjVar2.cD();
                        nfjVar2.c = false;
                    }
                    nol nolVar3 = (nol) nfjVar2.b;
                    nolVar3.a |= 2;
                    nolVar3.c = j4;
                    nfj nfjVar3 = b2.i;
                    long f = ffb.f(((nol) nfjVar3.b).b);
                    if (nfjVar3.c) {
                        nfjVar3.cD();
                        nfjVar3.c = false;
                    }
                    nol nolVar4 = (nol) nfjVar3.b;
                    nolVar4.a |= 65536;
                    nolVar4.g = f;
                }
                b2.a();
            }
        });
    }

    @Override // defpackage.idi
    public final void g(byte[] bArr) {
        i(new gxi(this, bArr, 20));
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "ClearcutAdapter";
    }

    public final void h() {
        if (((Boolean) b.c()).booleanValue()) {
            this.h.set(null);
            l();
            j();
            return;
        }
        this.h.set(Boolean.TRUE);
        m();
    }

    public final void i(Runnable runnable) {
        Boolean bool = (Boolean) this.h.get();
        if (bool == null) {
            this.k.add(runnable);
            if (this.k.size() <= 1000) {
                return;
            }
            this.k.removeFirst();
            ((ltd) ((ltd) ((ltd) a.d()).g(2, TimeUnit.MINUTES)).k("com/google/android/libraries/inputmethod/metrics/clearcut/BaseClearcutAdapter", "logIfUserIsOptedInCheckbox", 350, "BaseClearcutAdapter.java")).t("Evicts log requests as cached too many.");
        } else if (bool.booleanValue()) {
            while (!this.k.isEmpty()) {
                n((Runnable) this.k.removeFirst());
            }
            n(runnable);
        } else {
            this.k.clear();
        }
    }

    public final void j() {
        fnz fnzVar;
        synchronized (this) {
            fnzVar = this.m;
        }
        fqf b2 = fqg.b();
        b2.a = new gey(0);
        b2.c = 4501;
        gen g = fnzVar.g(b2.a());
        g.k(new dop(this, 7));
        g.j(new doq(this, 15));
    }

    protected ieq k() {
        return null;
    }
}
