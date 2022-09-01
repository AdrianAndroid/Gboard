package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.ExtractedText;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.List;

/* compiled from: PG */
/* renamed from: hox  reason: default package */
/* loaded from: classes.dex */
public final class hox implements AutoCloseable, hls, hsz {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/inputbundle/InputBundle");
    public final Context b;
    public final hoy c;
    public final iav d;
    public final hpi e;
    public final hos f;
    public int i;
    private hfi l;
    private hlp m;
    private hln n;
    private boolean o;
    private final qv k = new qv();
    public int g = 0;
    public int h = 0;
    private final hmd j = new hmd(this);

    public hox(Context context, hoy hoyVar, iav iavVar) {
        this.d = iavVar;
        this.b = context;
        this.c = hoyVar;
        hos hosVar = new hos(hoyVar, this);
        this.f = hosVar;
        this.e = new hpi(context, hoyVar, iavVar, this, this, hosVar);
    }

    private final void ap() {
        if (this.h == 1) {
            this.c.ax();
        }
        ac();
        this.f.b();
    }

    private final void aq(ibz ibzVar, Object obj) {
        this.e.l(ibzVar, obj);
    }

    @Override // defpackage.hsz
    public final void A() {
        this.c.az();
    }

    @Override // defpackage.hlq
    public final void B() {
        if (this.g == 1) {
            this.c.ao();
        }
    }

    @Override // defpackage.hlq
    public final void C(int i, int i2) {
        if (this.g == 1) {
            this.c.ap(i, i2);
        }
    }

    @Override // defpackage.hlq
    public final void D() {
        if (this.g == 1) {
            this.c.aw();
        }
    }

    @Override // defpackage.hsz
    public final void E(long j, long j2) {
        if (this.g == 1) {
            p().a(j, j2);
        }
    }

    @Override // defpackage.hsz
    public final void F(ice iceVar) {
        this.e.k(iceVar);
    }

    @Override // defpackage.hlq
    public final void G() {
        if (this.g == 1) {
            this.c.aA();
        }
    }

    @Override // defpackage.hsz
    public final void H(int i) {
        this.c.aK(i);
    }

    @Override // defpackage.hsz
    public final void I(ice iceVar, hte hteVar) {
        this.c.aN(iceVar, hteVar);
    }

    @Override // defpackage.hsz
    public final void J(int i) {
        if (this.g == 1) {
            p().w(i);
        }
    }

    @Override // defpackage.hsz
    public final void K(hln hlnVar, boolean z) {
        CharSequence charSequence = hlnVar.a;
        if (this.g != 1 || jdg.W(this.n, hlnVar)) {
            return;
        }
        if (this.d.l || z) {
            h().c(hlnVar.c);
        }
        this.n = hlnVar;
        p().gY(hlnVar, false);
    }

    @Override // defpackage.hsz
    public final void L(KeyEvent keyEvent) {
        this.c.aU(keyEvent);
    }

    @Override // defpackage.hlq
    public final void M(int i, int i2) {
        if (this.g == 1) {
            this.c.aG(i, i2);
        }
    }

    @Override // defpackage.hlq
    public final void N() {
        this.c.aJ();
    }

    @Override // defpackage.hlq
    public final void O(hfd hfdVar) {
        iay[] iayVarArr;
        if (this.g != 1 || (iayVarArr = hfdVar.b) == null || iayVarArr.length == 0) {
            return;
        }
        int i = iayVarArr[0].c;
        if (i == -10072 || i == -10074 || i == -10058 || i == -10059 || i == -10004 || i == -10104 || i == -400000 || i == -10126 || i == -10138) {
            this.c.at(hfdVar);
        } else if (am(hfdVar)) {
        } else {
            this.c.aT(hfdVar.b[0], hfdVar.g);
            this.f.b();
        }
    }

    @Override // defpackage.hsz
    public final void P(ibz ibzVar, ice iceVar, hth hthVar) {
        this.k.put(how.a(ibzVar, iceVar), Boolean.valueOf(hthVar != hth.HIDE));
        this.c.bd(iceVar, hthVar);
    }

    @Override // defpackage.hsz
    public final void Q(int i, int i2) {
        this.c.bi(i, i2);
    }

    @Override // defpackage.hlq
    public final void R(String str) {
        this.c.aR(str);
    }

    @Override // defpackage.hlq
    public final void S(CharSequence charSequence, int i, Object obj) {
        if (this.g != 1) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        int i2 = !isEmpty ? 1 : 0;
        int i3 = 0;
        if (i2 != 0) {
            hO().e(hpb.IME_COMPOSING_UPDATED, charSequence);
        }
        if (!this.d.h) {
            hpi hpiVar = this.e;
            if (hpiVar.g == 1 && hpiVar.o(charSequence)) {
                if (true != isEmpty) {
                    i3 = 2;
                }
                ai(i3);
                return;
            }
        }
        if (this.h == 1 || i2 != 0) {
            if (obj == null || !li.f()) {
                this.c.aW(charSequence, i);
            } else {
                this.c.aX(charSequence, i, obj);
            }
            this.f.b();
        }
        ai(i2);
    }

    @Override // defpackage.hlq
    public final void T(List list) {
        hpi hpiVar = this.e;
        if (hpiVar.n()) {
            hpiVar.c.y(list);
            hpiVar.a().e(hpb.READING_TEXT_CANDIDATES_SET, list);
        }
    }

    @Override // defpackage.hsz
    public final boolean U() {
        return this.c.bu();
    }

    @Override // defpackage.hsz
    public final boolean V(ibz ibzVar, ice iceVar) {
        Boolean bool = (Boolean) this.k.get(how.a(ibzVar, iceVar));
        return bool != null && bool.booleanValue();
    }

    @Override // defpackage.hls
    public final lmz W() {
        return this.c.ad();
    }

    @Override // defpackage.hsz
    public final boolean X() {
        return this.c.isFullscreenMode();
    }

    @Override // defpackage.hsz
    public final boolean Y() {
        return this.c.bz();
    }

    @Override // defpackage.hls
    public final void Z() {
    }

    @Override // defpackage.hsz
    public final float a() {
        return this.c.x();
    }

    @Override // defpackage.gzb
    public final void aM(gza gzaVar) {
        this.c.aM(gzaVar);
    }

    @Override // defpackage.gzb
    public final void aO(gza gzaVar) {
        throw null;
    }

    public final jav aa() {
        return this.d.e;
    }

    public final String ab() {
        return this.d.b;
    }

    public final void ac() {
        boolean z = true;
        if (this.g == 1) {
            T(null);
            hY(false);
            if (this.h == 2) {
                g("", 1);
            }
            if (this.h == 0) {
                return;
            }
            idk hO = hO();
            hpb hpbVar = hpb.IME_COMPOSING_ABORTED;
            Object[] objArr = new Object[1];
            if (this.h != 1) {
                z = false;
            }
            objArr[0] = Boolean.valueOf(z);
            hO.e(hpbVar, objArr);
            ai(0);
            p().gX();
        }
    }

    public final void ad(ibz ibzVar, boolean z) {
        if (this.g != 1) {
            ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/inputbundle/InputBundle", "activateKeyboard", 465, "InputBundle.java")).u("not able to activate keyboard since ime is not active, imeStatus: %d", this.g);
            return;
        }
        hpi hpiVar = this.e;
        String b = hpi.b(hpiVar.m.S());
        if (!b.equals(hpiVar.p)) {
            hpiVar.g();
            hpiVar.b.g();
            hpiVar.g = 0;
            hpiVar.p = b;
        }
        int i = hpiVar.g;
        ibz ibzVar2 = hpiVar.d;
        hpiVar.k = SystemClock.elapsedRealtime();
        if (ibzVar == null && (ibzVar = hpiVar.d) == null) {
            ibzVar = ibz.a;
        }
        int i2 = hpiVar.g;
        if (i2 != 0) {
            if (i2 == 1) {
                if (ibzVar == hpiVar.d) {
                    return;
                }
                ((ltd) hpi.a.a(hip.a).k("com/google/android/libraries/inputmethod/inputbundle/KeyboardWrapper", "activateKeyboard", 425, "KeyboardWrapper.java")).t("doesn't allow to activate another keyboard before deactivateKeyboard()");
                return;
            } else if (i2 != -1) {
                return;
            } else {
                ((ltd) hpi.a.a(hip.a).k("com/google/android/libraries/inputmethod/inputbundle/KeyboardWrapper", "activateKeyboard", 428, "KeyboardWrapper.java")).t("activateKeyboard is called after closing all keyboards");
                return;
            }
        }
        hpiVar.g = 1;
        ibz ibzVar3 = hpiVar.d;
        if (ibzVar3 == ibzVar) {
            hpiVar.i = false;
            hpiVar.h(z, null, ibzVar3);
            return;
        }
        hpiVar.i = true;
        hpiVar.l = true;
        hpiVar.f = ibzVar;
        hpiVar.j(ibzVar, hpiVar);
    }

    public final void ae() {
        if (this.g == 1) {
            ap();
            p().j();
            this.c.hideStatusIcon();
            hO().e(hpb.IME_COMPOSING_STOPPED, new Object[0]);
            hO().d(ide.c);
        }
        hlo hloVar = (hlo) ijl.b().a(hlo.class);
        if (hloVar != null && (hloVar.a || hloVar.b)) {
            ijl.b().g(new hlo(false, false));
        }
        this.g = 0;
        hos hosVar = this.f;
        hosVar.b = 0;
        hosVar.c = false;
        hosVar.d = false;
    }

    @Override // defpackage.gzb
    public final void af(gza gzaVar) {
        this.c.af(gzaVar);
    }

    @Override // defpackage.hsz
    public final ExtractedText ag() {
        return this.c.bJ();
    }

    public final void ah() {
        hpi hpiVar = this.e;
        if (hpiVar.n()) {
            hpiVar.c.h();
        }
        ibz ibzVar = hpiVar.f;
        if (ibzVar != null) {
            hpiVar.b.e(ibzVar, hpiVar);
            hpiVar.f = null;
        }
        hpiVar.l = false;
        hpiVar.j = true;
        hpiVar.h = null;
        hpiVar.g = 0;
        hpiVar.o.e(null);
    }

    public final void ai(int i) {
        boolean z = false;
        if (i == 0) {
            hO().e(hpb.IME_COMPOSING_STOPPED, new Object[0]);
        }
        if (this.h != i) {
            this.h = i;
            hpi hpiVar = this.e;
            if (i == 1 || i == 2) {
                z = true;
            }
            hpiVar.f(512L, z);
        }
    }

    public final void aj(hfd hfdVar) {
        if (this.g == 1) {
            p().h(hfdVar);
        }
    }

    public final void ak(ibz ibzVar, hov hovVar) {
        this.e.j(ibzVar, hovVar);
    }

    public final void al(ibz ibzVar) {
        aq(ibzVar, null);
    }

    public final boolean am(hfd hfdVar) {
        hpi hpiVar = this.e;
        if (!hpiVar.n()) {
            ((ltd) ((ltd) hpi.a.b()).k("com/google/android/libraries/inputmethod/inputbundle/KeyboardWrapper", "consumeEvent", 273, "KeyboardWrapper.java")).A("Skip consuming an event as current keyboard is deactivated (state=%s, keyboard existence=%s)", hpiVar.g, hpiVar.c != null);
            return false;
        }
        return hpiVar.c.c(hfdVar);
    }

    public final boolean an(int i, KeyEvent keyEvent) {
        keyEvent.getAction();
        keyEvent.getMetaState();
        keyEvent.getFlags();
        keyEvent.getScanCode();
        iaz.a(keyEvent);
        keyEvent.getRepeatCount();
        if (this.g != 1 || i == 112 || i == 238) {
            return false;
        }
        if (this.l == null) {
            if (this.d.g != null) {
                hfi hfiVar = (hfi) jbt.u(this.b.getClassLoader(), hfi.class, this.d.g, new Object[0]);
                this.l = hfiVar;
                if (hfiVar == null) {
                    throw new lgj("Failed to create a KeyEventInterpreter: ".concat(String.valueOf(this.d.g)));
                }
            } else {
                this.l = this.c.e();
            }
        }
        hfd a2 = this.l.a(keyEvent);
        if (a2 == null || a2.f() == null) {
            return false;
        }
        try {
            if (am(a2)) {
                this.f.d();
                hO().e(hfe.EVENT_HANDLED, a2);
                return true;
            } else if (a2.a == iah.UP) {
                this.f.d();
                hO().e(hfe.EVENT_HANDLED, a2);
                return false;
            } else {
                int k = k(a2);
                if (k == 1) {
                    this.f.d();
                    hO().e(hfe.EVENT_HANDLED, a2);
                    return true;
                } else if (k == 2) {
                    this.f.d();
                    hO().e(hfe.EVENT_HANDLED, a2);
                    return false;
                } else if ((a2.g & this.d.s) != 0) {
                    this.f.d();
                    hO().e(hfe.EVENT_HANDLED, a2);
                    return false;
                } else {
                    int i2 = this.h;
                    boolean B = p().B(a2);
                    if (B) {
                        this.f.g();
                    } else {
                        hO().e(hfe.EVENT_UNHANDLED_BY_IME, new Object[0]);
                    }
                    this.f.d();
                    hO().e(hfe.EVENT_HANDLED, a2);
                    if (!B && i2 != 0 && this.h == 0) {
                        this.c.z();
                    }
                    if (!B && ao(i)) {
                        return true;
                    }
                    return B;
                }
            }
        } catch (Throwable th) {
            this.f.d();
            hO().e(hfe.EVENT_HANDLED, a2);
            throw th;
        }
    }

    public final boolean ao(int i) {
        if (i == -10042) {
            this.c.aD();
            return true;
        }
        return false;
    }

    @Override // defpackage.hsz
    public final int b() {
        return this.c.y();
    }

    @Override // defpackage.hsz
    public final long c() {
        return this.c.B();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.m != null) {
            ae();
            gvt.a(this.m);
            this.m = null;
        }
        ah();
        hpi hpiVar = this.e;
        hpiVar.g();
        hph hphVar = hpiVar.b;
        hphVar.g();
        hphVar.h = true;
        hpiVar.g = -1;
        this.l = null;
        this.g = -1;
    }

    @Override // defpackage.hsz
    public final View d() {
        return this.c.G();
    }

    @Override // defpackage.hsz
    public final ViewGroup e(ice iceVar, boolean z) {
        return this.c.K(iceVar, z);
    }

    @Override // defpackage.hlq
    public final void f(int i, int i2, CharSequence charSequence) {
        if (this.g != 1 || !this.d.h) {
            return;
        }
        ai(this.c.bD(i, i2) ? 1 : 0);
        this.f.b();
    }

    @Override // defpackage.hlq
    public final void g(CharSequence charSequence, int i) {
        S(charSequence, i, null);
    }

    @Override // defpackage.hls
    public final gqc h() {
        return this.c.O();
    }

    @Override // defpackage.hlt
    public final idk hO() {
        return this.c.Z();
    }

    @Override // defpackage.hlr
    public final hqk hT(int i, int i2, int i3) {
        return this.c.R(i, i2, i3);
    }

    @Override // defpackage.hlq
    public final void hU(CompletionInfo completionInfo) {
        this.c.al(completionInfo);
    }

    @Override // defpackage.hlq
    public final void hV(CharSequence charSequence, boolean z, int i) {
        if (this.g == 1) {
            if (!TextUtils.isEmpty(charSequence) || this.h == 1) {
                this.c.am(charSequence, z, i);
                this.f.b();
            }
            if (this.h == 1) {
                ai(0);
            }
        }
        hO().e(hpb.IME_TEXT_COMMITTED, charSequence);
    }

    @Override // defpackage.hlq
    public final void hW() {
        if (this.g != 1) {
            return;
        }
        int i = this.h;
        if (i == 1) {
            this.c.ax();
            this.f.b();
        } else if (i == 2) {
            this.e.o("");
        }
        ai(0);
    }

    @Override // defpackage.hlq
    public final void hX(int i, int i2, CharSequence charSequence, boolean z) {
        if (this.g != 1) {
            return;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            ai(this.c.bC(i, i2, charSequence, false) ? 1 : 0);
        } else {
            if (!this.d.h) {
                hpi hpiVar = this.e;
                if (hpiVar.g == 1 && hpiVar.o(charSequence)) {
                    this.c.bC(i, i2, "", false);
                    ai(2);
                }
            }
            ai(this.c.bC(i, i2, charSequence, true) ? 1 : 0);
        }
        this.f.b();
        hO().e(hpb.IME_TEXT_REPLACED, new Object[0]);
    }

    @Override // defpackage.hlq
    public final void hY(boolean z) {
        this.n = null;
        if (!z) {
            hlo.b(false);
        }
        this.o = z;
        hpi hpiVar = this.e;
        if (hpiVar.n()) {
            hpiVar.c.z(z);
            hpiVar.a().e(hpb.TEXT_CANDIDATES_UPDATED, Boolean.valueOf(z));
        }
    }

    @Override // defpackage.hlq
    public final boolean hZ(hln hlnVar, boolean z) {
        boolean z2 = hlnVar != null;
        hlo hloVar = (hlo) ijl.b().a(hlo.class);
        if (hloVar == null) {
            ijl.b().g(new hlo(false, z2));
        } else if (z2 != hloVar.b) {
            ijl.b().g(new hlo(hloVar.a, z2));
        }
        hpi hpiVar = this.e;
        if (hpiVar.n()) {
            return hpiVar.c.C(hlnVar, z);
        }
        return false;
    }

    @Override // defpackage.hlq
    public final void hu(int i, int i2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5) {
        boolean bH;
        if (this.g != 1) {
            return;
        }
        CharSequence concat = TextUtils.concat(charSequence4, charSequence5);
        if (!TextUtils.isEmpty(concat)) {
            if (!this.d.h) {
                hpi hpiVar = this.e;
                if (hpiVar.g == 1 && hpiVar.o(concat)) {
                    bH = this.c.bH(i, i2, charSequence, charSequence2, charSequence3, charSequence4, charSequence5);
                    if (bH) {
                        ai(2);
                    }
                }
            }
            boolean bH2 = this.c.bH(i, i2, charSequence, charSequence2, charSequence3, charSequence4, charSequence5);
            if (bH2) {
                ai(1);
            }
            bH = bH2;
        } else {
            bH = this.c.bH(i, i2, charSequence, charSequence2, charSequence3, charSequence4, charSequence5);
            if (bH) {
                ai(0);
            }
        }
        if (!bH) {
            return;
        }
        this.f.b();
    }

    @Override // defpackage.hlr
    public final CharSequence i(int i) {
        return this.c.bM(i);
    }

    @Override // defpackage.hlr
    public final CharSequence j(int i) {
        return this.c.bN(i);
    }

    public final int k(hfd hfdVar) {
        ibz a2;
        int i = 0;
        iay iayVar = hfdVar.b[0];
        int i2 = iayVar.c;
        if (i2 == -10140) {
            this.c.aV((KeyEvent) iayVar.e);
            return 1;
        } else if (i2 == -10104) {
            Object obj = iayVar.e;
            if (!(obj instanceof icz)) {
                ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/inputbundle/InputBundle", "handleSpecialKeyEvent", 694, "InputBundle.java")).t("SWITCH_KEYBOARD: data is empty");
                return 1;
            }
            icz iczVar = (icz) obj;
            if (TextUtils.isEmpty(iczVar.a)) {
                ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/inputbundle/InputBundle", "handleSpecialKeyEvent", 699, "InputBundle.java")).t("SWITCH_KEYBOARD_WITH_PAYLOAD: keyboard type is empty");
                return 1;
            }
            aq(ibz.a(iczVar.a), iczVar.b);
            return 1;
        } else {
            String str = null;
            if (i2 == -10095) {
                hpi hpiVar = this.e;
                String str2 = (String) iayVar.e;
                if (hpiVar.g == 1) {
                    if (TextUtils.isEmpty(str2)) {
                        ((ltd) hpi.a.a(hip.a).k("com/google/android/libraries/inputmethod/inputbundle/KeyboardWrapper", "switchToKeyboardInPref", 554, "KeyboardWrapper.java")).t("SWITCH_TO_KEYBOARD_IN_PREF: prefKey should not be empty");
                    } else {
                        String Q = hpiVar.n.Q(str2);
                        ibz a3 = !TextUtils.isEmpty(Q) ? ibz.a(Q) : ibz.a;
                        hph hphVar = hpiVar.b;
                        if (hphVar.e.f.d(a3) == null && hphVar.f.T(a3) == null) {
                            ((ltd) ((ltd) hpi.a.d()).k("com/google/android/libraries/inputmethod/inputbundle/KeyboardWrapper", "switchToKeyboardInPref", 565, "KeyboardWrapper.java")).w("SWITCH_TO_KEYBOARD_IN_PREF: no such keyboard type: %s", a3);
                            a3 = ibz.a;
                        }
                        hpiVar.l(a3, null);
                    }
                }
                return 1;
            } else if (i2 == -10092) {
                this.c.aD();
                return 1;
            } else if (i2 == -10090) {
                ap();
                return 1;
            } else if (i2 == -10057) {
                hoy hoyVar = this.c;
                Object obj2 = iayVar.e;
                if (obj2 instanceof String) {
                    i = Integer.parseInt((String) obj2);
                }
                hoyVar.bg(i);
                return 1;
            } else {
                if (i2 != -10041) {
                    if (i2 != -10024) {
                        if (i2 == 4 || i2 == 111) {
                            ap();
                            return 2;
                        } else if (i2 == -10031) {
                            p().gS((hln) iayVar.e);
                            return 1;
                        } else if (i2 == -10030) {
                            hpi hpiVar2 = this.e;
                            String str3 = (String) iayVar.e;
                            String Q2 = hpiVar2.n.Q(hpiVar2.c());
                            if (!TextUtils.isEmpty(Q2)) {
                                a2 = ibz.a(Q2);
                            } else {
                                a2 = !TextUtils.isEmpty(str3) ? ibz.a(str3) : ibz.c;
                            }
                            hpiVar2.l(a2, null);
                            return 1;
                        } else if (i2 == -10011) {
                            ap();
                            Object obj3 = iayVar.e;
                            if (obj3 instanceof String) {
                                str = (String) obj3;
                            }
                            hO().e(idd.SWITCH_TO_NEXT_LANGUAGE, str);
                            this.c.bo();
                            return 1;
                        } else if (i2 == -10010) {
                            aj(hfdVar);
                            this.c.bn(this);
                            return 1;
                        } else {
                            switch (i2) {
                                case -10132:
                                case -10131:
                                case -10130:
                                    Object obj4 = iayVar.e;
                                    if (!(obj4 instanceof hln)) {
                                        ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/inputbundle/InputBundle", "handleSpecialKeyEvent", 658, "InputBundle.java")).t("INLINE_SUGGESTION_SELECT: data not a candidate");
                                        return 1;
                                    }
                                    p().gU((hln) obj4, iayVar.c);
                                    this.f.g();
                                    return 1;
                                default:
                                    switch (i2) {
                                        case -10020:
                                            int i3 = this.h;
                                            if (i3 == 0) {
                                                this.c.ak();
                                                this.f.b();
                                            } else {
                                                if (i3 == 1) {
                                                    g("", 1);
                                                }
                                                if (this.g == 1) {
                                                    T(null);
                                                    hY(false);
                                                    if (this.h == 2) {
                                                        g("", 1);
                                                    }
                                                    p().gX();
                                                    hO().e(hpb.IME_COMPOSING_CLEARED, new Object[0]);
                                                }
                                            }
                                            return 1;
                                        case -10019:
                                            ap();
                                            this.c.aC(new ins(1));
                                            return 1;
                                        case -10018:
                                            aj(hfdVar);
                                            this.c.aR((String) iayVar.e);
                                            return 1;
                                        default:
                                            switch (i2) {
                                                case -10004:
                                                    if (TextUtils.isEmpty((String) iayVar.e)) {
                                                        ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/inputbundle/InputBundle", "handleSpecialKeyEvent", 687, "InputBundle.java")).t("SWITCH_KEYBOARD: data is empty");
                                                        return 1;
                                                    }
                                                    al(ibz.a((String) iayVar.e));
                                                    return 1;
                                                case -10003:
                                                    p().gV((hln) iayVar.e, true);
                                                    return 1;
                                                case -10002:
                                                    Object obj5 = iayVar.e;
                                                    if (!(obj5 instanceof hln)) {
                                                        ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/inputbundle/InputBundle", "handleSpecialKeyEvent", 642, "InputBundle.java")).t("CANDIDATE_SELECT: data not a candidate");
                                                        return 1;
                                                    }
                                                    hln hlnVar = (hln) obj5;
                                                    if (hlnVar.s == 7) {
                                                        ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/inputbundle/InputBundle", "handleSpecialKeyEvent", 647, "InputBundle.java")).t("CANDIDATE_SELECT: expected text candidate");
                                                        return 1;
                                                    }
                                                    p().gY(hlnVar, true);
                                                    this.f.g();
                                                    hO().e(hpb.IME_TEXT_CANDIDATE_SELECTED, hlnVar);
                                                    return 1;
                                                case -10001:
                                                    aj(hfdVar);
                                                    this.c.bl((String) iayVar.e);
                                                    return 1;
                                                case -10000:
                                                    ap();
                                                    this.c.bm(jav.f((String) iayVar.e));
                                                    return 1;
                                                default:
                                                    return 3;
                                            }
                                    }
                            }
                        }
                    }
                    this.c.az();
                }
                return 1;
            }
        }
    }

    @Override // defpackage.hlq
    public final void l(List list, hln hlnVar, boolean z) {
        if (this.o) {
            hlo.b(hlnVar != null && hlnVar.g);
            this.o = false;
        }
        hpi hpiVar = this.e;
        if (hpiVar.n()) {
            hpiVar.c.r(list, hlnVar, z);
            hpiVar.a().e(hpb.TEXT_CANDIDATES_APPENDED, list, hlnVar);
        }
    }

    @Override // defpackage.hsz
    public final hqt m() {
        return this.c.S();
    }

    @Override // defpackage.hsz
    public final htc n() {
        return this.c.U();
    }

    @Override // defpackage.hsz
    public final hww o() {
        return this.c.V();
    }

    public final hlp p() {
        if (this.m == null) {
            iav iavVar = this.d;
            hlp b = hqs.b(this.b, iavVar.c, iavVar, this.j);
            if (b == null) {
                ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/inputbundle/InputBundle", "createIme", 443, "InputBundle.java")).w("Failed to load IME class: %s", this.d.c);
                throw new lgj("Failed to load IME class: ".concat(String.valueOf(this.d.c)));
            }
            this.m = b;
        }
        return this.m;
    }

    public final hsy q() {
        return this.e.c;
    }

    @Override // defpackage.hsz
    public final imn s() {
        return this.c.aa();
    }

    @Override // defpackage.hsz
    public final iss t() {
        return this.c.ab();
    }

    @Override // defpackage.hsz
    public final SoftKeyboardView u(htd htdVar, ViewGroup viewGroup, int i, int i2) {
        return this.c.ac(htdVar, viewGroup, i, i2);
    }

    @Override // defpackage.hsz
    public final List v() {
        return this.c.ae();
    }

    @Override // defpackage.hsz
    public final void w(ice iceVar, hte hteVar) {
        this.c.ah(iceVar, hteVar);
    }

    @Override // defpackage.hlq
    public final void x() {
        if (this.g == 1) {
            this.c.ai();
        }
    }

    @Override // defpackage.hlq
    public final void y(long j, boolean z) {
        this.e.e(j, z);
    }

    @Override // defpackage.hsz
    public final void z(hfd hfdVar) {
        this.c.at(hfdVar);
    }
}
