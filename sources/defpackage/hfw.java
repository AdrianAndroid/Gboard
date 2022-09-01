package defpackage;

import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: hfw  reason: default package */
/* loaded from: classes.dex */
public final class hfw implements hga, hsz {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/extension/ExtensionWrapper");
    public final igr b;
    public final idk c;
    public final hfq d;
    public final hfv e;
    public final Class f;
    public ifw g;
    public hfl h;
    public EditorInfo i;
    public boolean j;
    private final int k;
    private boolean l;

    public hfw(igr igrVar, idk idkVar, hfq hfqVar, hfv hfvVar, Class cls, int i) {
        this.b = igrVar;
        this.c = idkVar;
        this.d = hfqVar;
        this.e = hfvVar;
        this.f = cls;
        this.k = i;
    }

    public static void ai(ifw ifwVar, hga hgaVar) {
        if (ifwVar instanceof hfz) {
            ((hfz) ifwVar).P(hgaVar);
        } else if (!(ifwVar instanceof hfx)) {
        } else {
            ((hfx) ifwVar).k(hgaVar);
        }
    }

    private final Object aj(Class cls) {
        if (this.g == null) {
            ifw b = this.b.b(this.f);
            ai(b, this);
            this.g = b;
            if (b == null) {
                ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/extension/ExtensionWrapper", "getInstance", 764, "ExtensionWrapper.java")).w("Load extension %s failed", this.f);
            }
        }
        ifw ifwVar = this.g;
        if (ifwVar != null) {
            return cls.cast(ifwVar);
        }
        return null;
    }

    private final Object ak(Class cls) {
        if (this.g == null) {
            ifw a2 = this.b.a(this.f);
            ai(a2, this);
            this.g = a2;
        }
        ifw ifwVar = this.g;
        if (ifwVar != null) {
            return cls.cast(ifwVar);
        }
        return null;
    }

    private final void al(hpu hpuVar, boolean z) {
        EditorInfo a2 = hpuVar != null ? hpuVar.a() : null;
        this.i = a2;
        if (hpuVar == null || a2 != null) {
            this.d.br(hpuVar, z);
            return;
        }
        throw new IllegalArgumentException("A non-null EditorInfo is expected.");
    }

    private final boolean am() {
        return Z() && ((hfp) this.e).f == this;
    }

    @Override // defpackage.hsz
    public final void A() {
        ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/extension/ExtensionWrapper", "hideKeyboard", 679, "ExtensionWrapper.java")).t("Unexpected method call.");
    }

    public final void B() {
        this.j = true;
    }

    public final void C() {
        if (am() && this.l) {
            this.e.n(null);
            this.l = false;
        }
        if (this.i != null) {
            al(null, false);
        }
    }

    public final void D() {
        if (!W()) {
            ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/extension/ExtensionWrapper", "onDeactivate", 221, "ExtensionWrapper.java")).w("Extension %s is not activated yet.", this.f);
            return;
        }
        final hfx i = i();
        if (i != null) {
            ad(new hfu() { // from class: hfs
                @Override // defpackage.hfu
                public final boolean a() {
                    hfx.this.i();
                    return true;
                }
            }, i, 2);
        }
        this.h = null;
        C();
    }

    @Override // defpackage.hsz
    public final void E(long j, long j2) {
    }

    @Override // defpackage.hsz
    public final void F(ice iceVar) {
        hfz k;
        hsy B;
        if (!S() || (k = k()) == null || (B = k.B()) == null) {
            return;
        }
        this.e.n(B.X(iceVar));
    }

    @Override // defpackage.hfy
    public final void G() {
        this.d.aJ();
    }

    @Override // defpackage.hsz
    public final void H(int i) {
        if (S()) {
            this.d.aK(i);
        }
    }

    @Override // defpackage.hsz
    public final void I(ice iceVar, hte hteVar) {
        ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/extension/ExtensionWrapper", "removeKeyboardViewSwitchAnimator", 556, "ExtensionWrapper.java")).t("Unexpected method call.");
    }

    @Override // defpackage.hsz
    public final void J(int i) {
        ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/extension/ExtensionWrapper", "requestCandidates", 684, "ExtensionWrapper.java")).t("Unexpected method call.");
    }

    @Override // defpackage.hsz
    public final void K(hln hlnVar, boolean z) {
        ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/extension/ExtensionWrapper", "selectTextCandidate", 664, "ExtensionWrapper.java")).t("Unexpected method call.");
    }

    @Override // defpackage.hsz
    public final void L(KeyEvent keyEvent) {
        if (S()) {
            this.d.aU(keyEvent);
        }
    }

    @Override // defpackage.hga
    public final void M(CharSequence charSequence) {
        if (S()) {
            this.d.aY(charSequence);
        }
    }

    @Override // defpackage.hga
    public final void N(View view) {
        hfp hfpVar;
        hfw hfwVar;
        if (W() && Z() && (hfwVar = (hfpVar = (hfp) this.e).g) == this) {
            if (hfwVar != this) {
                ((ltd) ((ltd) hfp.a.d()).k("com/google/android/libraries/inputmethod/extension/ExtensionManager", "setCurrentOpenableExtensionWrapper", 945, "ExtensionManager.java")).w("%s is not the pending openable extension", this);
            } else {
                hfpVar.g = null;
                hfw hfwVar2 = hfpVar.f;
                hfpVar.h = hfwVar2;
                if (hfwVar2 != null) {
                    hfwVar2.D();
                }
                hfpVar.f = this;
                ijl.b().g(new hfn(this.f, this.h));
            }
        }
        if (S()) {
            this.e.n(view);
            this.l = view != null;
            return;
        }
        ((ltd) ((ltd) ((ltd) a.d()).l(lub.MEDIUM)).k("com/google/android/libraries/inputmethod/extension/ExtensionWrapper", "setExtensionView", 399, "ExtensionWrapper.java")).G("%s is not the current openable extension, the current one is: %s", this, ((hfp) this.e).f);
    }

    @Override // defpackage.hga
    public final void O(boolean z) {
        if (S()) {
            this.d.ba(z);
        }
    }

    @Override // defpackage.hsz
    public final void P(ibz ibzVar, ice iceVar, hth hthVar) {
    }

    @Override // defpackage.hsz
    public final void Q(int i, int i2) {
        if (S()) {
            this.d.bi(i, i2);
        }
    }

    @Override // defpackage.hfy
    public final void R(hpu hpuVar, boolean z) {
        if (!W()) {
            ((ltd) ((ltd) ((ltd) a.d()).l(lub.MEDIUM)).k("com/google/android/libraries/inputmethod/extension/ExtensionWrapper", "checkIsActivatedExtension", 825, "ExtensionWrapper.java")).w("Extension %s is not activated.", this.f);
        } else if (hpuVar != null || this.i != null) {
            al(hpuVar, z);
        } else {
            ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/extension/ExtensionWrapper", "updateInputConnectionProvider", 419, "ExtensionWrapper.java")).w("%s cannot clear focus not owned by itself.", this);
        }
    }

    public final boolean S() {
        if (!am() || !W()) {
            ((ltd) ((ltd) ((ltd) a.d()).l(lub.MEDIUM)).k("com/google/android/libraries/inputmethod/extension/ExtensionWrapper", "checkIsCurrentOpenableAndActivatedExtension", 811, "ExtensionWrapper.java")).w("%s is not the current activated extension.", this.f);
            return false;
        }
        return true;
    }

    public final boolean T(hfd hfdVar) {
        hfh hfhVar;
        int i = this.k;
        return (i == 1 || i == 2) && W() && (hfhVar = (hfh) aj(hfh.class)) != null && hfhVar.c(hfdVar);
    }

    @Override // defpackage.hsz
    public final boolean U() {
        return this.d.bu();
    }

    @Override // defpackage.hsz
    public final boolean V(ibz ibzVar, ice iceVar) {
        ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/extension/ExtensionWrapper", "getKeyboardViewShown", 596, "ExtensionWrapper.java")).t("Unexpected method call.");
        return false;
    }

    @Override // defpackage.hfy
    public final boolean W() {
        return this.h != null;
    }

    @Override // defpackage.hfy, defpackage.hsz
    public final boolean X() {
        return this.d.isFullscreenMode();
    }

    @Override // defpackage.hsz
    public final boolean Y() {
        return false;
    }

    public final boolean Z() {
        return this.k == 2;
    }

    @Override // defpackage.hsz
    public final float a() {
        return this.d.x();
    }

    @Override // defpackage.gzb
    public final void aM(gza gzaVar) {
        this.d.aM(gzaVar);
    }

    @Override // defpackage.gzb
    public final void aO(gza gzaVar) {
        throw null;
    }

    public final boolean aa() {
        return am() && W() && this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ab() {
        hfx j = j();
        return j != null && j.o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ac(boolean z) {
        hfz l;
        return Z() && (l = l()) != null && l.T(z);
    }

    public final boolean ad(hfu hfuVar, hfx hfxVar, int i) {
        ids U = hfxVar instanceof hgb ? ((hgb) hfxVar).U(i) : null;
        if (U == null) {
            return hfuVar.a();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean a2 = hfuVar.a();
        this.c.g(U, SystemClock.elapsedRealtime() - elapsedRealtime);
        return a2;
    }

    @Override // defpackage.hfy
    public final void ae() {
        hfp hfpVar = (hfp) this.e;
        if (hfpVar.k) {
            hfpVar.r(this, hfl.AUTOMATIC, null);
        }
    }

    @Override // defpackage.gzb
    public final void af(gza gzaVar) {
        this.d.af(gzaVar);
    }

    @Override // defpackage.hsz
    public final ExtractedText ag() {
        return this.d.bJ();
    }

    @Override // defpackage.hga
    public final CharSequence ah() {
        return this.d.bO();
    }

    @Override // defpackage.hsz
    public final int b() {
        return this.d.y();
    }

    @Override // defpackage.hsz
    public final /* synthetic */ long c() {
        return 0L;
    }

    @Override // defpackage.hsz
    public final View d() {
        return this.d.G();
    }

    @Override // defpackage.hsz
    public final ViewGroup e(ice iceVar, boolean z) {
        if (iceVar == ice.HEADER) {
            return this.d.J();
        }
        return null;
    }

    @Override // defpackage.hfy
    public final EditorInfo f() {
        return this.d.M();
    }

    @Override // defpackage.hfy
    public final EditorInfo g() {
        return this.d.N();
    }

    @Override // defpackage.hfy, defpackage.hsz
    public final gqc h() {
        gqc O = this.d.O();
        return O != null ? O : gqc.b;
    }

    @Override // defpackage.hsz
    public final idk hO() {
        return this.d.Z();
    }

    public final hfx i() {
        return (hfx) aj(hfx.class);
    }

    public final hfx j() {
        return (hfx) ak(hfx.class);
    }

    public final hfz k() {
        return (hfz) aj(hfz.class);
    }

    public final hfz l() {
        return (hfz) ak(hfz.class);
    }

    @Override // defpackage.hsz
    public final hqt m() {
        return this.d.S();
    }

    @Override // defpackage.hsz
    public final htc n() {
        return null;
    }

    @Override // defpackage.hsz
    public final hww o() {
        return this.d.V();
    }

    @Override // defpackage.hfy
    public final iau p() {
        return this.d.W();
    }

    @Override // defpackage.hfy
    public final ibz q() {
        return this.d.Y();
    }

    @Override // defpackage.hsz
    public final imn s() {
        return this.d.aa();
    }

    @Override // defpackage.hsz
    public final iss t() {
        return this.d.ab();
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[5];
        ifw ifwVar = this.g;
        objArr[0] = ifwVar != null ? ifwVar.getDumpableTag() : null;
        int i = this.k;
        objArr[1] = i != 1 ? i != 2 ? "BASIC" : "OPENABLE" : "BASIC_EVENT_CONSUMER";
        objArr[2] = this.h;
        objArr[3] = this.f;
        objArr[4] = this.g;
        return String.format(locale, "{tag=%s, type=%s, activationSource=%s, class=%s, instance=%s}", objArr);
    }

    @Override // defpackage.hsz
    public final SoftKeyboardView u(htd htdVar, ViewGroup viewGroup, int i, int i2) {
        return this.d.ac(htdVar, viewGroup, i, i2);
    }

    @Override // defpackage.hsz
    public final List v() {
        return this.d.ae();
    }

    @Override // defpackage.hsz
    public final void w(ice iceVar, hte hteVar) {
        ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/extension/ExtensionWrapper", "addKeyboardViewSwitchAnimator", 550, "ExtensionWrapper.java")).t("Unexpected method call.");
    }

    @Override // defpackage.hga
    public final void x(CharSequence charSequence) {
        if (S()) {
            this.d.an(charSequence);
        }
    }

    @Override // defpackage.hfy
    public final void y() {
        hfv hfvVar = this.e;
        if (!W()) {
            return;
        }
        if (Z()) {
            hfp hfpVar = (hfp) hfvVar;
            hfpVar.i = null;
            hfpVar.j = null;
            hfpVar.f(this);
            hfpVar.g(this);
            hfpVar.d(this);
            return;
        }
        D();
    }

    @Override // defpackage.hfy, defpackage.hsz
    public final void z(hfd hfdVar) {
        this.d.at(hfdVar);
    }
}
