package defpackage;

import android.content.Context;
import android.util.Printer;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: hfp  reason: default package */
/* loaded from: classes.dex */
public final class hfp implements gzv, hfv {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/extension/ExtensionManager");
    public final igr b;
    public final hfq c;
    public llw d;
    public boolean e;
    public hfw f;
    public hfw g;
    public hfw h;
    public hfw i;
    public hfl j;
    public boolean k;
    public boolean l;
    public final ifu m;
    public final igh n;
    public final igh o;
    private final Context p;
    private llw q;
    private boolean r;
    private boolean s;
    private boolean t = false;

    public hfp(Context context, igr igrVar, hfq hfqVar) {
        llw llwVar = lrq.b;
        this.d = llwVar;
        this.q = llwVar;
        hfo hfoVar = new hfo(this);
        this.m = hfoVar;
        igh ighVar = new igh(hfx.class, new eim(this, 7), 1);
        this.o = ighVar;
        igh ighVar2 = new igh(hfx.class, new eim(this, 8), 0);
        this.n = ighVar2;
        this.p = context;
        this.b = igrVar;
        this.c = hfqVar;
        gzt.a.a(this);
        hfoVar.a(gyc.b);
        ijl.b().h(ighVar, igd.class, gyc.a);
        ijl.b().h(ighVar2, igi.class, gyc.a);
    }

    private final void t(boolean z) {
        hfx j;
        for (hfw hfwVar : b()) {
            if (!z || (j = hfwVar.j()) == null || !j.p()) {
                if (hfwVar.W()) {
                    hfwVar.D();
                }
            } else {
                hfx j2 = hfwVar.j();
                if (j2 != null) {
                    j2.e();
                }
            }
        }
        hfw hfwVar2 = this.f;
        if (hfwVar2 != null && !hfwVar2.W()) {
            m();
        }
        hfw hfwVar3 = this.g;
        if (hfwVar3 != null && !hfwVar3.W()) {
            this.g = null;
        }
        this.h = null;
    }

    private final void u(View view) {
        hfw hfwVar;
        this.c.aZ(view);
        if (view == null || (hfwVar = this.f) == null) {
            if (view != null || !this.t) {
                return;
            }
            this.c.aq();
            this.t = false;
        } else if (!hfwVar.Z()) {
            throw new IllegalStateException("Not an openable extension");
        } else {
            hfz hfzVar = (hfz) hfwVar.g;
            if (hfzVar == null || !hfzVar.S()) {
                return;
            }
            this.c.av();
            this.t = true;
        }
    }

    private final boolean v(hfw hfwVar, final hfl hflVar, final Map map) {
        final hqt S = this.c.S();
        if (S == null) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/extension/ExtensionManager", "callExtensionWrapperOnActivate", 633, "ExtensionManager.java")).t("The input method entry is null!");
            return false;
        }
        final EditorInfo N = this.c.N();
        final boolean z = N == this.c.M();
        if (!hfwVar.W()) {
            final hfx i = hfwVar.i();
            if (i != null) {
                hfwVar.h = hflVar;
                boolean ad = hfwVar.ad(new hfu() { // from class: hft
                    @Override // defpackage.hfu
                    public final boolean a() {
                        return hfx.this.n(S, N, z, map, hflVar);
                    }
                }, i, 1);
                if (ad) {
                    hfwVar.c.e(hfr.a, i.getClass().getName());
                } else {
                    hfwVar.h = null;
                }
                return ad;
            }
            ((ltd) ((ltd) hfw.a.d()).k("com/google/android/libraries/inputmethod/extension/ExtensionWrapper", "onActivate", 197, "ExtensionWrapper.java")).w("Failed to get instance of extension %s.", hfwVar.f);
            return false;
        }
        ((ltd) ((ltd) hfw.a.d()).k("com/google/android/libraries/inputmethod/extension/ExtensionWrapper", "onActivate", 192, "ExtensionWrapper.java")).w("Extension %s is already activated.", hfwVar.f);
        return false;
    }

    private final boolean w() {
        hfw hfwVar = this.f;
        if (hfwVar == null || !hfwVar.W()) {
            hfw hfwVar2 = this.g;
            return hfwVar2 != null && hfwVar2.W();
        }
        return true;
    }

    private final boolean x(hfw hfwVar, hfl hflVar, Map map) {
        return hfwVar.W() || v(hfwVar, hflVar, map);
    }

    private final boolean y(Class cls, hfl hflVar, Map map) {
        if (!cls.isAnnotationPresent(hjj.class) || hjk.a()) {
            hfw a2 = a(cls);
            if (a2 == null) {
                ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/extension/ExtensionManager", "openExtension", 571, "ExtensionManager.java")).w("Wrapper for extension %s doesn't exist.", cls);
                return false;
            }
            return r(a2, hflVar, map);
        }
        ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/extension/ExtensionManager", "openExtension", 563, "ExtensionManager.java")).w("Extension %s needs GMSCore but the package is not signed by Google.", cls);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean z(defpackage.hfw r5, defpackage.hfl r6, java.util.Map r7) {
        /*
            r4 = this;
            boolean r0 = r4.l
            r1 = 0
            if (r0 == 0) goto L6
            goto L29
        L6:
            hfl r0 = defpackage.hfl.AUTOMATIC
            if (r6 == r0) goto Lb
            goto L2a
        Lb:
            hfw r0 = r4.g
            if (r0 == 0) goto L16
            hfl r0 = r0.h
            hfl r2 = defpackage.hfl.AUTOMATIC
            if (r0 != r2) goto L29
            goto L2a
        L16:
            hfw r0 = r4.f
            if (r0 == 0) goto L2a
            if (r5 == r0) goto L2a
            boolean r2 = r0.W()
            if (r2 == 0) goto L2a
            hfl r0 = r0.h
            hfl r2 = defpackage.hfl.AUTOMATIC
            if (r0 != r2) goto L29
            goto L2a
        L29:
            return r1
        L2a:
            r0 = 0
            r4.g(r0)
            hfw r2 = r4.f
            r3 = 1
            if (r2 == 0) goto L5c
            if (r2 != r5) goto L5c
            boolean r0 = r5.W()
            if (r0 == 0) goto L51
            boolean r0 = r5.Z()
            if (r0 == 0) goto L64
            boolean r0 = r5.W()
            if (r0 == 0) goto L64
            hfz r0 = r5.k()
            if (r0 == 0) goto L64
            r0.N(r7, r6)
            goto L64
        L51:
            boolean r7 = r4.v(r5, r6, r7)
            if (r7 == 0) goto L58
            goto L64
        L58:
            r4.m()
            goto L68
        L5c:
            r4.g = r5
            boolean r7 = r4.v(r5, r6, r7)
            if (r7 == 0) goto L66
        L64:
            r1 = 1
            goto L68
        L66:
            r4.g = r0
        L68:
            if (r1 == 0) goto L6e
            r4.i = r5
            r4.j = r6
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfp.z(hfw, hfl, java.util.Map):boolean");
    }

    public final hfw a(Class cls) {
        hfw hfwVar = (hfw) this.q.get(cls);
        if (hfwVar == null || !hfwVar.j) {
            return null;
        }
        return hfwVar;
    }

    public final Iterable b() {
        return lre.Z(this.q.values(), dyv.p);
    }

    public final void c() {
        boolean w = w();
        for (hfw hfwVar : b()) {
            if (hfwVar.ab()) {
                if (!hfwVar.Z()) {
                    x(hfwVar, hfl.AUTOMATIC, null);
                } else if (!w) {
                    w = z(hfwVar, hfl.AUTOMATIC, null);
                }
            }
        }
    }

    public final void d(hfw hfwVar) {
        if (w()) {
            return;
        }
        for (hfw hfwVar2 : b()) {
            if (hfwVar2 != hfwVar && hfwVar2.Z() && hfwVar2.ab() && z(hfwVar2, hfl.AUTOMATIC, null)) {
                return;
            }
        }
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("currentExtensionWrapper = ".concat(String.valueOf(String.valueOf(this.f))));
        printer.println("pendingExtensionWrapper = ".concat(String.valueOf(String.valueOf(this.g))));
        printer.println("previousExtensionWraper = ".concat(String.valueOf(String.valueOf(this.h))));
        printer.println("originalLiveExtensionWrapper = ".concat(String.valueOf(String.valueOf(this.i))));
        printer.println("originalLiveActivationSource = ".concat(String.valueOf(String.valueOf(this.j))));
        printer.println("Available extensions:");
        lsz it = this.q.values().iterator();
        while (it.hasNext()) {
            printer.println("  ".concat(String.valueOf(String.valueOf((hfw) it.next()))));
        }
    }

    public final void e() {
        this.i = null;
        this.j = null;
        f(null);
        g(null);
        if (this.c.M() != this.c.N()) {
            this.c.br(null, false);
        }
    }

    public final void f(hfw hfwVar) {
        hfw hfwVar2 = this.f;
        if (hfwVar2 == null) {
            return;
        }
        if (hfwVar2 == hfwVar || hfwVar == null) {
            hfwVar2.D();
            m();
            return;
        }
        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/extension/ExtensionManager", "deactivateCurrentExtensionWrapper", 651, "ExtensionManager.java")).G("Current extension %s doesn't match %s", hfwVar2, hfwVar);
    }

    public final void g(hfw hfwVar) {
        hfw hfwVar2 = this.g;
        if (hfwVar2 == null) {
            return;
        }
        if (hfwVar2 == hfwVar || hfwVar == null) {
            hfwVar2.D();
            this.g = null;
            return;
        }
        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/extension/ExtensionManager", "deactivatePendingExtensionWrapper", 664, "ExtensionManager.java")).G("Pending extension %s doesn't match %s", hfwVar2, hfwVar);
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "ExtensionManager";
    }

    public final void h() {
        hfz l;
        for (hfw hfwVar : b()) {
            if (hfwVar.Z() && (l = hfwVar.l()) != null) {
                l.I();
            }
        }
    }

    public final void i(hfw hfwVar) {
        if (!this.k || !hfwVar.ab()) {
            return;
        }
        if (!hfwVar.Z()) {
            x(hfwVar, hfl.AUTOMATIC, null);
        } else if (w()) {
        } else {
            z(hfwVar, hfl.AUTOMATIC, null);
        }
    }

    public final void j() {
        this.k = false;
        t(false);
    }

    public final void k(hfw hfwVar, boolean z) {
        hfwVar.C();
        hfwVar.g = null;
        hfwVar.h = null;
        hfwVar.j = z;
        if (hfwVar == this.f) {
            m();
        } else if (hfwVar == this.g) {
            this.g = null;
        }
        if (hfwVar == this.i) {
            this.i = null;
            this.j = null;
        }
    }

    public final void l(boolean z, boolean z2) {
        hfw hfwVar;
        hfw hfwVar2;
        if (!this.e) {
            this.e = true;
            ifv b = ifv.b();
            if (b != null) {
                q(b);
            }
            ifv b2 = ifv.b();
            if (b2 != null) {
                p(b2);
            }
        }
        this.k = true;
        this.r = true;
        t(z);
        hfw hfwVar3 = this.i;
        hfl hflVar = this.j;
        this.i = null;
        this.j = null;
        if (hfwVar3 != null && hflVar != null && (((hfwVar = this.f) == null || hfwVar.ac(z2)) && ((hfwVar2 = this.f) != null ? hfwVar3 == hfwVar2 : hfwVar3.ac(z2)))) {
            z(hfwVar3, hflVar, null);
        }
        c();
        this.r = false;
        if (w() || !this.s) {
            return;
        }
        this.s = false;
        u(null);
    }

    public final void m() {
        if (this.f != null) {
            this.f = null;
            ijl.b().e(hfn.class);
        }
    }

    @Override // defpackage.hfv
    public final void n(View view) {
        boolean z;
        if (!this.r || view != null) {
            u(view);
            z = false;
        } else {
            z = true;
        }
        this.s = z;
    }

    public final void o(String str) {
        this.c.at(hfd.d(new iay(-10104, null, new icz(str, llw.l("activation_source", hfl.ACCESS_POINT)))));
    }

    public final void p(ifv ifvVar) {
        int i;
        lls h = llw.h();
        Set<Class> e = ifvVar.e(hfx.class);
        llw llwVar = this.q;
        for (Class cls : e) {
            hfw hfwVar = (hfw) llwVar.get(cls);
            if (hfwVar == null) {
                igg c = ifvVar.c(cls);
                if (c == null) {
                    ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/extension/ExtensionManager", "updateExtensionWrappersMap", 212, "ExtensionManager.java")).w("Invalid module %s", cls);
                } else {
                    if (hfz.class.isAssignableFrom(c.b)) {
                        i = 2;
                    } else {
                        i = hfh.class.isAssignableFrom(c.b) ? 1 : 0;
                    }
                    hfw hfwVar2 = new hfw(this.b, this.c.Z(), this.c, this, c.a, i);
                    ifw a2 = hfwVar2.b.a(hfwVar2.f);
                    hfw.ai(a2, hfwVar2);
                    hfwVar2.g = a2;
                    hfwVar2.B();
                    i(hfwVar2);
                    hfwVar = hfwVar2;
                }
            } else {
                hfwVar.B();
            }
            h.a(cls, hfwVar);
        }
        this.q = h.l();
        lsz it = lvw.i(llwVar.keySet(), e).iterator();
        while (it.hasNext()) {
            hfw hfwVar3 = (hfw) llwVar.get((Class) it.next());
            if (hfwVar3 != null && hfwVar3.g != null) {
                k(hfwVar3, false);
            }
        }
    }

    public final void q(ifv ifvVar) {
        lls h = llw.h();
        for (Class cls : ifvVar.e(htb.class)) {
            igg c = ifvVar.c(cls);
            if (c == null) {
                ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/extension/ExtensionManager", "updateKeyboardTypeToExtensionMap", 178, "ExtensionManager.java")).w("Can't find the module def for %s", cls.getCanonicalName());
            } else {
                hek hekVar = c.g;
                if (hekVar != null) {
                    for (ibz ibzVar : (ibz[]) hekVar.b) {
                        h.a(ibzVar, cls);
                    }
                }
            }
        }
        this.d = h.l();
    }

    public final boolean r(hfw hfwVar, hfl hflVar, Map map) {
        if (hfwVar.Z()) {
            boolean z = z(hfwVar, hflVar, map);
            if (!z) {
                d(hfwVar);
            }
            return z;
        }
        return x(hfwVar, hflVar, map);
    }

    public final boolean s(Object obj, hfl hflVar, Map map) {
        if (obj instanceof String) {
            String str = (String) obj;
            Class r = jbt.r(this.p.getClassLoader(), str);
            Class asSubclass = r != null ? r.asSubclass(ifw.class) : null;
            if (asSubclass == null) {
                ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/extension/ExtensionManager", "openExtension", 549, "ExtensionManager.java")).w("Extension %s cannot be instantiated", str);
                return false;
            }
            return y(asSubclass, hflVar, map);
        }
        if (obj instanceof Class) {
            Class cls = (Class) obj;
            if (ifw.class.isAssignableFrom(cls)) {
                return y(cls.asSubclass(ifw.class), hflVar, map);
            }
        }
        throw new IllegalArgumentException("Unsupported extension interface class parameter type.");
    }
}
