package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import java.util.Map;

/* compiled from: PG */
/* renamed from: dbn  reason: default package */
/* loaded from: classes.dex */
public abstract class dbn implements hfz, dcy, hgb {
    public static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/extension/AbstractOpenableExtension");
    private hqt a;
    public Context c;
    protected igg d;
    public hsy e;
    public ibz f;
    private hga fg;
    private long fk;
    public idk g;
    public boolean h;
    private long k;
    private int n;
    private mko o;
    private mko p;
    private ids j = idf.a;
    private boolean fj = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public static final Map V(hfl hflVar) {
        if (hflVar != null) {
            return llw.l("activation_source", hflVar);
        }
        return null;
    }

    private final void f() {
        ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/libs/extension/AbstractOpenableExtension", "maybeDestroyExistingKeyboardGroupManager", 511, "AbstractOpenableExtension.java")).w("Destroy existing keyboard group manager in %s", getClass().getSimpleName());
        mko mkoVar = this.o;
        this.o = null;
        if (mkoVar != null) {
            kcu.U(mkoVar, new buo(this, 12), gyc.b);
            mkoVar.cancel(true);
        }
    }

    private final void l(final ibz ibzVar, final hfl hflVar) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        mko mkoVar = this.o;
        if (mkoVar == null) {
            ((ltd) ((ltd) b.c()).k("com/google/android/apps/inputmethod/libs/extension/AbstractOpenableExtension", "switchToKeyboard", 238, "AbstractOpenableExtension.java")).t("Keyboard group manager future is null when requesting new keyboard.");
            return;
        }
        mko g = mio.g(kcu.L(mkoVar), new leq() { // from class: dbl
            @Override // defpackage.leq
            public final Object a(Object obj) {
                dbn dbnVar = dbn.this;
                final ibz ibzVar2 = ibzVar;
                hfl hflVar2 = hflVar;
                long j = elapsedRealtime;
                final dcz dczVar = (dcz) obj;
                if (dczVar != null) {
                    ((ltd) ((ltd) dbn.b.b()).k("com/google/android/apps/inputmethod/libs/extension/AbstractOpenableExtension", "lambda$switchToKeyboard$1", 248, "AbstractOpenableExtension.java")).w("requesting keyboard when keyboardGroupManager is ready in %s", dbnVar.getClass().getSimpleName());
                    final Context y = dbnVar.y();
                    final fxi fxiVar = new fxi(dbnVar, hflVar2, j);
                    htf htfVar = (htf) dczVar.f.get(ibzVar2);
                    if (htfVar != null) {
                        fxiVar.b(htfVar.a, ibzVar2, true);
                        return null;
                    } else if (!dczVar.c.c(ibzVar2)) {
                        return null;
                    } else {
                        iss t = dczVar.e.C().t();
                        ibu.a(dczVar.b).c(y, new ibr(fxiVar, y, ibzVar2, null) { // from class: dcx
                            public final /* synthetic */ Context b;
                            public final /* synthetic */ ibz c;
                            public final /* synthetic */ fxi d;

                            @Override // defpackage.ibr
                            public final void b(ibm ibmVar) {
                                dcz dczVar2 = dcz.this;
                                fxi fxiVar2 = this.d;
                                Context context = this.b;
                                ibz ibzVar3 = this.c;
                                if (((dbn) fxiVar2.b).R()) {
                                    if (ibmVar != null) {
                                        hsy l = iin.l(context, dczVar2.e.C(), ibmVar, dczVar2.d, ibzVar3);
                                        if (TextUtils.isEmpty(ibmVar.c)) {
                                            ((ltd) ((ltd) dcz.a.c()).k("com/google/android/apps/inputmethod/libs/framework/core/KeyboardGroupManager", "requestKeyboardInternal", 155, "KeyboardGroupManager.java")).w("keyboard class is empty %s", ibmVar);
                                        }
                                        if (l != null) {
                                            l.ae(dczVar2.c.a(ibzVar3));
                                            dczVar2.f.put(ibzVar3, htf.a(l, ibmVar));
                                            fxiVar2.b(l, ibzVar3, false);
                                            return;
                                        }
                                    }
                                    fxiVar2.b(null, ibzVar3, false);
                                }
                            }
                        }, gvv.c(y), t == null ? "" : ((ess) t).a, dczVar.e.X(), dczVar.c, ibzVar2);
                        return null;
                    }
                }
                ((ltd) ((ltd) dbn.b.c()).k("com/google/android/apps/inputmethod/libs/extension/AbstractOpenableExtension", "lambda$switchToKeyboard$1", 254, "AbstractOpenableExtension.java")).t("create keyboardGroupManager failed.");
                return null;
            }
        }, mjl.a);
        mko mkoVar2 = this.p;
        if (mkoVar2 != null) {
            mkoVar2.cancel(false);
        }
        this.p = g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized hqt A() {
        return this.a;
    }

    @Override // defpackage.hfz
    public final hsy B() {
        return this.e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hga, hsz] */
    @Override // defpackage.dcy
    public final hsz C() {
        return z();
    }

    protected ids D() {
        return this.j;
    }

    protected String E() {
        gqh gqhVar;
        igg iggVar = this.d;
        if (iggVar == null || (gqhVar = iggVar.c) == null) {
            return null;
        }
        return gqhVar.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void F(hsy hsyVar, boolean z) {
        z().N(hsyVar.X(ice.HEADER));
        z().O(z);
        this.h = true;
    }

    public synchronized void G() {
        if (this.h) {
            K();
            if (this.j != idf.a && this.k > 0) {
                this.g.g(this.j, SystemClock.elapsedRealtime() - this.k);
                this.j = idf.a;
                this.k = 0L;
            }
        }
    }

    public final void H() {
        mko g;
        f();
        ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/libs/extension/AbstractOpenableExtension", "createKeyboardGroupManagerListenableFuture", 123, "AbstractOpenableExtension.java")).w("Create keyboard group manager listenable future in %s", getClass().getSimpleName());
        int d = d();
        if (d == 0) {
            g = null;
        } else {
            mko b2 = new dbs(this.c, d).b();
            kcu.U(b2, new dbm(this, d), mjl.a);
            g = mio.g(b2, new cus(this, 5), gyc.b);
        }
        this.o = g;
    }

    @Override // defpackage.hfz
    public final void I() {
        H();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void J() {
        if (!this.fj) {
            return;
        }
        String E = E();
        if (TextUtils.isEmpty(E)) {
            ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/extension/AbstractOpenableExtension", "hideCloseFeatureMenuFromAccessPointEntryButton", 659, "AbstractOpenableExtension.java")).t("Doesn't specific the access point feature Id.");
            return;
        }
        grd.b(R.id.key_pos_header_access_points_menu, gqn.c(E));
        this.fj = false;
    }

    public final void K() {
        this.h = false;
        z().N(null);
        v();
        L();
    }

    protected void L() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void M() {
        ids U = U(this.n == 1 ? 4 : 5);
        if (U != idf.a && this.fk > 0) {
            this.g.g(U, SystemClock.elapsedRealtime() - this.fk);
        }
        this.fk = 0L;
    }

    @Override // defpackage.hfz
    public final void N(Map map, hfl hflVar) {
        igg iggVar = this.d;
        if (iggVar != null) {
            ifh ifhVar = new ifh("KeyboardLatency.OpenExtension.".concat(String.valueOf(iggVar.b.getSimpleName())));
            synchronized (ifh.class) {
                if (ifh.d == null || ifhVar.g) {
                    ifh.e = SystemClock.elapsedRealtime();
                    ifh.d = ifhVar;
                }
            }
        }
        w(map, hflVar);
    }

    @Override // defpackage.hfz
    public final void O() {
        ibz ibzVar = this.f;
        if (ibzVar != null) {
            l(ibzVar, hfl.INTERNAL);
        }
    }

    @Override // defpackage.hfz
    public final void P(hga hgaVar) {
        this.fg = hgaVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void Q() {
        String E = E();
        if (TextUtils.isEmpty(E)) {
            ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/extension/AbstractOpenableExtension", "showCloseFeatureMenuOnAccessPointEntryButton", 641, "AbstractOpenableExtension.java")).t("Doesn't specific the access point feature Id.");
            return;
        }
        String c = gqn.c(E);
        iay iayVar = new iay(-10060, null, null);
        gqe a = gqn.a(c, false);
        a.h(iayVar);
        gqq.b(R.id.key_pos_header_access_points_menu, a.a());
        this.fj = true;
    }

    public final synchronized boolean R() {
        return this.a != null;
    }

    @Override // defpackage.hfz
    public /* synthetic */ boolean S() {
        return false;
    }

    @Override // defpackage.hfz
    public boolean T(boolean z) {
        return false;
    }

    @Override // defpackage.hgb
    public ids U(int i) {
        return idf.a;
    }

    @Override // defpackage.hfz
    public void W(int i, int i2, int i3, int i4) {
    }

    @Override // defpackage.dcy
    public final jls X() {
        hfw hfwVar;
        hqt m;
        hga hgaVar = this.fg;
        if (hgaVar == null || (m = (hfwVar = (hfw) hgaVar).m()) == null) {
            return null;
        }
        return m.c(hfwVar.d.y());
    }

    @Override // defpackage.hfh
    public boolean c(hfd hfdVar) {
        hsy hsyVar = this.e;
        return hsyVar != null && hsyVar.fq() && hsyVar.c(hfdVar);
    }

    protected abstract int d();

    @Override // defpackage.gzv
    public /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.hfx
    public /* synthetic */ void e() {
    }

    public ibz g() {
        return ibz.a;
    }

    @Override // defpackage.gzv
    public /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public synchronized void gm(Context context, igg iggVar) {
        this.c = context;
        this.d = iggVar;
        H();
    }

    @Override // defpackage.ifw
    public void gn() {
        i();
        f();
    }

    @Override // defpackage.hfx
    public /* synthetic */ void h(ibz ibzVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean hv() {
        return false;
    }

    public void hw(hsy hsyVar) {
    }

    @Override // defpackage.hfx
    public final synchronized void i() {
        if (!R()) {
            return;
        }
        r();
        this.a = null;
    }

    @Override // defpackage.hfx
    public /* synthetic */ void j(EditorInfo editorInfo, boolean z) {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void k(hfy hfyVar) {
    }

    public void m(hfl hflVar) {
        hsy hsyVar = this.e;
        if (hsyVar == null) {
            return;
        }
        F(hsyVar, hv());
        this.e.g(z().g(), V(hflVar));
        M();
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [hga, hsz] */
    @Override // defpackage.hfx
    public synchronized boolean n(hqt hqtVar, EditorInfo editorInfo, boolean z, Map map, hfl hflVar) {
        ltg ltgVar = b;
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/extension/AbstractOpenableExtension", "onActivate", 194, "AbstractOpenableExtension.java")).w("onActivate(): %s", hqtVar);
        this.g = z().hO();
        this.fk = SystemClock.elapsedRealtime();
        this.n++;
        if (R()) {
            ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/extension/AbstractOpenableExtension", "onActivate", 201, "AbstractOpenableExtension.java")).w("Extension is already activated: %s", this.a);
            if (hqtVar.equals(this.a)) {
                N(map, hflVar);
                return true;
            }
            ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/extension/AbstractOpenableExtension", "onActivate", 206, "AbstractOpenableExtension.java")).t("Deactivating previous extension due to change of input method entry.");
            i();
        }
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/extension/AbstractOpenableExtension", "onActivate", 210, "AbstractOpenableExtension.java")).w("Activating extension %s.", getClass().getSimpleName());
        this.a = hqtVar;
        N(map, hflVar);
        return true;
    }

    @Override // defpackage.hfx
    public /* synthetic */ boolean o() {
        return false;
    }

    @Override // defpackage.hfx
    public /* synthetic */ boolean p() {
        return false;
    }

    @Override // defpackage.hfx
    public /* synthetic */ void q() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void r() {
        G();
        this.e = null;
        this.f = null;
        mko mkoVar = this.p;
        if (mkoVar != null) {
            mkoVar.cancel(false);
            this.p = null;
            getClass().getSimpleName();
        }
    }

    @Override // defpackage.hfz
    public void v() {
        hsy hsyVar = this.e;
        if (hsyVar != null) {
            hsyVar.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void w(Map map, hfl hflVar) {
        if (!R()) {
            return;
        }
        ibz g = g();
        if (g != null) {
            this.j = D();
            this.k = SystemClock.elapsedRealtime();
            if (this.f != g) {
                l(g, hflVar);
            } else if (!this.h) {
                m(hflVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized Context y() {
        hqt hqtVar;
        hqtVar = this.a;
        return hqtVar != null ? hqtVar.a() : this.c;
    }

    public final hga z() {
        hga hgaVar = this.fg;
        if (hgaVar != null) {
            return hgaVar;
        }
        throw new IllegalStateException("Delegate is null! Openable extensions must not be interacted with unless they have a non-null delegate.");
    }
}
