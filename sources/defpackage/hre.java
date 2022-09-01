package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Printer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: hre  reason: default package */
/* loaded from: classes.dex */
public final class hre implements hqt {
    public final iav a;
    public final jav b;
    public final String c;
    public final boolean d;
    private final hrd e;
    private final jga f;

    public hre(iav iavVar, jav javVar, String str, boolean z, jga jgaVar, hrd hrdVar) {
        this.a = iavVar;
        this.b = javVar;
        this.c = str;
        this.d = z;
        jga clone = jgaVar.clone();
        ibw ibwVar = iavVar.f;
        boolean z2 = ibwVar.i;
        boolean z3 = ibwVar.h;
        jgb jgbVar = (jgb) clone.a.get("keyboard_mode");
        if (jgbVar == null) {
            clone.d(hyq.d(z2, z3));
        } else {
            String str2 = jgbVar.b;
            if (("one_handed".equals(str2) && !z2) || ("split".equals(str2) && !z3)) {
                jgbVar = new jgb(jgbVar.a, "normal");
            }
            clone.c(jgbVar);
        }
        this.f = clone;
        this.e = hrdVar;
    }

    @Override // defpackage.hqt
    public final Context a() {
        Context e;
        hrd hrdVar = this.e;
        iav iavVar = this.a;
        jav javVar = iavVar != null ? iavVar.B : null;
        if (javVar == null) {
            javVar = this.b;
        }
        gyv gyvVar = ((hrx) hrdVar).p;
        boolean z = this.d;
        Context context = (Context) gyvVar.d.get(javVar);
        if (context == null) {
            Context context2 = gyvVar.e;
            if (context2 == null) {
                context2 = gyvVar.a;
            }
            if (z) {
                e = jbi.d(context2, javVar);
            } else {
                e = jbi.e(context2, javVar.C());
            }
            gyu gyuVar = new gyu(e, context2.toString(), gyvVar.b, gyvVar.c);
            Context context3 = (Context) gyvVar.d.putIfAbsent(javVar, gyuVar);
            return context3 == null ? gyuVar : context3;
        }
        return context;
    }

    @Override // defpackage.hqt
    public final jls b() {
        jga clone = this.f.clone();
        clone.e(w());
        return clone.g();
    }

    @Override // defpackage.hqt
    public final jls c(int i) {
        jga clone = this.f.clone();
        clone.e(w());
        clone.d(i);
        return clone.g();
    }

    @Override // defpackage.hqt
    public final jls d(iav iavVar, int i) {
        jfn[] jfnVarArr = iavVar.f.k.b;
        if (jfnVarArr.length == 0) {
            return c(i);
        }
        jga clone = this.f.clone();
        for (jfn jfnVar : jfnVarArr) {
            clone.c(jfnVar);
        }
        clone.e(w());
        clone.d(i);
        return clone.g();
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("languageTag = ".concat(String.valueOf(String.valueOf(this.b))));
        printer.println("variant = ".concat(this.c));
        boolean z2 = this.d;
        printer.println("hasLocalizedResources = " + z2);
        printer.println("conditionCacheKey = ".concat(this.f.b()));
        printer.println("imeDef.stringId = ".concat(String.valueOf(this.a.b)));
        printer.println("imeDef.className = ".concat(String.valueOf(this.a.c)));
        printer.println("imeDef.languageTag = ".concat(String.valueOf(String.valueOf(this.a.e))));
    }

    @Override // defpackage.hqt
    public final int e() {
        Iterator it = ((hrx) this.e).e.iterator();
        while (it.hasNext()) {
            int a = ((hqz) it.next()).a(this);
            if (a > 0) {
                return a;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hre)) {
            return false;
        }
        hre hreVar = (hre) obj;
        return this.b.equals(hreVar.b) && TextUtils.equals(this.c, hreVar.c) && TextUtils.equals(this.a.b, hreVar.a.b) && this.d == hreVar.d && TextUtils.equals(this.a.x, hreVar.a.x) && TextUtils.equals(this.f.b(), hreVar.f.b());
    }

    @Override // defpackage.hqt
    public final int f() {
        return this.a.z;
    }

    @Override // defpackage.hqt
    public final iav g() {
        return this.a;
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "InputMethodEntry";
    }

    @Override // defpackage.hqt
    public final jav h() {
        return this.a.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.a.b, Boolean.valueOf(this.d), this.a.x, this.f.b()});
    }

    @Override // defpackage.hqt
    public final jav i() {
        return this.b;
    }

    @Override // defpackage.hqt
    public final llp j() {
        llp llpVar;
        hrd hrdVar = this.e;
        synchronized (((hrx) hrdVar).y) {
            llpVar = (llp) ((hrx) hrdVar).y.get(this);
            if (llpVar == null && equals(hqp.b())) {
                llpVar = ((hrx) hrdVar).A;
            }
            if (llpVar == null) {
                llpVar = llp.q();
            }
        }
        return llpVar;
    }

    @Override // defpackage.hqt
    public final lmz k() {
        return this.e.s(this);
    }

    @Override // defpackage.hqt
    public final lmz l() {
        return this.e.t(this);
    }

    @Override // defpackage.hqt
    public final mko m(String str) {
        return mio.g(((hrx) this.e).e(this.b, str), new hdp((hqt) this, 15), mjl.a);
    }

    @Override // defpackage.hqt
    public final String n(int i) {
        return this.e.u(this, i, false);
    }

    @Override // defpackage.hqt
    public final String o(int i) {
        return this.e.u(this, i, true);
    }

    @Override // defpackage.hqt
    public final String p() {
        return this.c;
    }

    @Override // defpackage.hqt
    public final /* synthetic */ Locale q() {
        return hqs.a(this);
    }

    @Override // defpackage.hqt
    public final void r(Collection collection) {
        hrd hrdVar = this.e;
        hrx hrxVar = (hrx) hrdVar;
        if (!hrxVar.n) {
            throw new IllegalStateException("updateMultilingualSetting is called before initialized");
        }
        if (!hrxVar.q(this)) {
            ((ltd) hrx.a.a(hip.a).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager", "updateMultilingualSetting", 2177, "InputMethodEntryManager.java")).w("Entry %s is not enabled", this);
            return;
        }
        lmz t = hrxVar.t(this);
        if (t.isEmpty()) {
            hrxVar.j.e(hry.UPDATE_MULTILINGUAL_SETTING, this, null);
            return;
        }
        lmx g = lmz.g();
        lsz it = t.iterator();
        while (it.hasNext()) {
            jav h = ((hqt) it.next()).h();
            if (collection.contains(h)) {
                g.d(h);
            }
        }
        lmz g2 = g.g();
        synchronized (hrxVar.g) {
            ((hrx) hrdVar).g.put(hsc.a(this), g2);
            ((hrx) hrdVar).k.h(this, g2);
        }
        hrxVar.j.e(hry.UPDATE_MULTILINGUAL_SETTING, this, g2);
    }

    @Override // defpackage.hqt
    public final boolean s() {
        return this.a.v;
    }

    @Override // defpackage.hqt
    public final boolean t() {
        return this.d;
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("languageTag", this.b);
        S.b("variant", this.c);
        S.h("hasLocalizedResources", this.d);
        S.b("conditionCacheKey", this.f);
        S.b("imeDef.stringId", this.a.b);
        S.b("imeDef.className", this.a.c);
        S.b("imeDef.languageTag", this.a.e);
        return S.toString();
    }

    @Override // defpackage.hqt
    public final boolean u() {
        return this.a.u;
    }

    @Override // defpackage.hqt
    public final boolean v() {
        return h().a() == 1;
    }

    @Override // defpackage.hqt
    public final boolean w() {
        lmz lmzVar;
        hrd hrdVar = this.e;
        jav javVar = this.b;
        String str = this.c;
        llp b = hqr.b();
        if (b == null || b.isEmpty()) {
            synchronized (((hrx) hrdVar).g) {
                lmzVar = (lmz) ((hrx) hrdVar).g.get(hsc.b(javVar, str));
            }
            if (lmzVar != null && !lmzVar.isEmpty()) {
                return true;
            }
        } else {
            hqt w = hrx.w(b, javVar, str);
            if (w == null) {
                ((ltd) ((ltd) hrx.a.b()).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager", "isMultilingualActivated", 2077, "InputMethodEntryManager.java")).G("No activated InputMethodEntry for %s %s", javVar, str);
            } else if (((hrx) hrdVar).s(w).size() > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hqt
    public final boolean x() {
        return ((hrx) this.e).z(this) != null;
    }

    @Override // defpackage.hqt
    public final boolean y() {
        iav iavVar = this.a;
        return iavVar != null && iavVar.C;
    }

    @Override // defpackage.hqt
    public final boolean z() {
        return this.a.w;
    }
}
