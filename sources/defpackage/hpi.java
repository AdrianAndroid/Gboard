package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.EditorInfo;

/* compiled from: PG */
/* renamed from: hpi  reason: default package */
/* loaded from: classes.dex */
public final class hpi implements hov {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/inputbundle/KeyboardWrapper");
    private static final ibz[] q = {ibz.c, ibz.b};
    public final hph b;
    public hsy c;
    public ibz d;
    public ibm e;
    public ibz f;
    public Object h;
    public boolean i;
    public boolean l;
    public final hoy m;
    public final ino n;
    public final hos o;
    public String p;
    private final iav r;
    private final hox s;
    public int g = 0;
    public boolean j = true;
    public long k = 0;

    public hpi(Context context, hoy hoyVar, iav iavVar, hsz hszVar, hox hoxVar, hos hosVar) {
        this.b = new hph(context, iavVar, hoyVar, hszVar);
        this.n = ino.M(context);
        this.m = hoyVar;
        this.r = iavVar;
        this.s = hoxVar;
        this.o = hosVar;
        this.p = b(hoyVar.S());
    }

    public static String b(hqt hqtVar) {
        return hqtVar == null ? "" : (String) hqtVar.b().b;
    }

    public final idk a() {
        return this.m.Z();
    }

    public final String c() {
        return "RECENT_SYMBOL_DIGIT_KEYBOARD_".concat(String.valueOf(this.r.b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(long j, boolean z) {
        if (!n() || !this.c.af(j)) {
            return;
        }
        if ((j & 1) == 1) {
            if (z) {
                this.o.b = (j & 3) == 3 ? 4096 : 8192;
            } else {
                this.o.b = 0;
                j |= 66;
            }
        }
        this.c.fp(j, z);
    }

    public final void f(long j, boolean z) {
        if (n()) {
            this.c.fp(j, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public final void h(boolean z, Object obj, ibz ibzVar) {
        ibo iboVar;
        for (ice iceVar : ice.values()) {
            k(iceVar);
        }
        if (!this.o.g()) {
            this.o.f();
        }
        hsy hsyVar = this.c;
        if (hsyVar != null) {
            hsyVar.aa();
        }
        EditorInfo N = this.m.N();
        if (N != null) {
            hsy hsyVar2 = this.c;
            if (hsyVar2 != null) {
                hsyVar2.g(N, obj);
                if (this.m.O().n()) {
                    this.m.bj(this.c.fr());
                }
            }
            e(68719476736L, this.m.bE());
            int i = this.s.h;
            f(512L, i == 1 || i == 2);
        }
        this.o.e(this.c);
        this.o.c();
        m(true);
        hox hoxVar = this.s;
        if (hoxVar.g == 1) {
            hoxVar.p().l(ibzVar, z && ((iboVar = (ibo) this.r.f.j.get(ibzVar)) == null || iboVar.a));
        }
        hsy hsyVar3 = this.c;
        if (hsyVar3 != null) {
            hsyVar3.ac();
        }
        idk a2 = a();
        hpb hpbVar = hpb.KEYBOARD_ACTIVATED;
        iav iavVar = this.r;
        a2.e(hpbVar, this.c, ibzVar, iavVar.b, iavVar.e);
    }

    public final void i(ibz ibzVar) {
        htb a2;
        hqt S;
        hph hphVar = this.b;
        if (hphVar.h) {
            throw new lgj("prefetchKeyboardDef is called after all keyboards are closed.");
        }
        if (hphVar.h(ibzVar, null) || (a2 = hphVar.a(ibzVar)) == null || (S = hphVar.f.S()) == null) {
            return;
        }
        a2.u(hphVar.d, ibzVar, hphVar.b(), hphVar.i(S));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(ibz ibzVar, hov hovVar) {
        final hph hphVar = this.b;
        if (hphVar.h) {
            throw new lgj("requestKeyboard is called after all keyboards are closed.");
        }
        if (hphVar.h(ibzVar, hovVar)) {
            ((ltd) ((ltd) hph.a.b()).k("com/google/android/libraries/inputmethod/inputbundle/KeyboardManager", "requestKeyboard", 128, "KeyboardManager.java")).G("Using cached keyboard %s, imeId=%s", ibzVar, hphVar.e.b);
            return;
        }
        htb a2 = hphVar.a(ibzVar);
        if (a2 == null) {
            ((ltd) ((ltd) hph.a.c()).k("com/google/android/libraries/inputmethod/inputbundle/KeyboardManager", "requestKeyboard", 134, "KeyboardManager.java")).w("no keyboardProvider found for %s keyboard", ibzVar);
            hovVar.d(null, null, ibzVar);
            return;
        }
        hqt S = hphVar.f.S();
        if (S == null) {
            throw new IllegalStateException("current input method entry is null");
        }
        hphVar.c(ibzVar, hovVar);
        String b = hphVar.b();
        ((ltd) ((ltd) hph.a.b()).k("com/google/android/libraries/inputmethod/inputbundle/KeyboardManager", "requestKeyboard", 146, "KeyboardManager.java")).J("Creating keyboard %s, imeId=%s, cacheKey=%s", ibzVar, hphVar.e.b, b);
        a2.t(hphVar.d, hphVar.g, hphVar.e, ibzVar, b, hphVar.i(S), new hta() { // from class: hpe
            @Override // defpackage.hta
            public final void a(ibz ibzVar2, hsy hsyVar, ibm ibmVar) {
                hph hphVar2 = hph.this;
                qq qqVar = (qq) hphVar2.c.remove(ibzVar2);
                if (hphVar2.h || hsyVar == null || ibmVar == null) {
                    hph.d(qqVar, null, null, ibzVar2);
                    gvt.a(hsyVar);
                    return;
                }
                hsyVar.ae(hphVar2.e.f.a(ibzVar2));
                htf htfVar = (htf) hphVar2.b.put(ibzVar2, htf.a(hsyVar, ibmVar));
                if (htfVar != null) {
                    ((ltd) hph.a.a(hip.a).k("com/google/android/libraries/inputmethod/inputbundle/KeyboardManager", "onKeyboardCreated", 324, "KeyboardManager.java")).w("%s keyboard is created more than once", ibzVar2);
                    gvt.a(htfVar.a);
                }
                hph.d(qqVar, hsyVar, ibmVar, ibzVar2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(ice iceVar) {
        View view;
        hoy hoyVar = this.m;
        hsy hsyVar = this.c;
        if (hsyVar != null) {
            view = hsyVar.X(iceVar);
        } else {
            ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/inputbundle/KeyboardWrapper", "getActiveKeyboardView", 185, "KeyboardWrapper.java")).J("keyboard is null imeDef=%s, keyboardDef=%s, type=%s", this.r, this.e, this.d);
            view = null;
        }
        hoyVar.bc(iceVar, view);
    }

    public final void l(ibz ibzVar, Object obj) {
        if (this.g != 1) {
            ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/inputbundle/KeyboardWrapper", "switchToKeyboard", 519, "KeyboardWrapper.java")).u("switchToKeyboard does nothing as keyboardStatus is not ACTIVE but %s", this.g);
        } else if (this.f != ibzVar || obj != this.h) {
            ibz ibzVar2 = this.d;
            if (ibzVar2 != null) {
                ifh.b(new ifh(null, false, ibzVar2, ibzVar));
            }
            ibz ibzVar3 = this.f;
            if (ibzVar3 != null) {
                this.b.e(ibzVar3, this);
            }
            this.f = ibzVar;
            this.h = obj;
            j(ibzVar, this);
        } else {
            ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/inputbundle/KeyboardWrapper", "switchToKeyboard", 524, "KeyboardWrapper.java")).G("switchToKeyboard does nothing as the parameters are identical (type=%s, payload=%s)", ibzVar, obj);
        }
    }

    public final void m(boolean z) {
        hsy hsyVar = this.c;
        if (hsyVar != null) {
            boolean z2 = false;
            if (z) {
                z2 = TextUtils.isEmpty(this.m.R(1, 1, 0).b);
            }
            hsyVar.fp(549755813888L, z2);
        }
    }

    public final boolean n() {
        return this.g == 1 && this.c != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean o(CharSequence charSequence) {
        return n() && this.c.B(charSequence);
    }

    @Override // defpackage.hov
    public final void d(hsy hsyVar, ibm ibmVar, ibz ibzVar) {
        ibz ibzVar2;
        if (hsyVar == null || ibmVar == null || (ibzVar2 = this.f) != ibzVar) {
            if (this.f != ibzVar) {
                ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/inputbundle/KeyboardWrapper", "onKeyboardReady", 166, "KeyboardWrapper.java")).G("The returned keyboard %s is not expected: %s", ibzVar, this.f);
                return;
            }
            this.f = null;
            if (this.l) {
                throw new lgj(String.format("Failed to fetch keyboard for %s when activating", ibzVar));
            }
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/inputbundle/KeyboardWrapper", "onKeyboardReady", 175, "KeyboardWrapper.java")).w("Failed to fetch keyboard for %s", ibzVar);
            return;
        }
        hsy hsyVar2 = this.c;
        if (hsyVar != hsyVar2 && ibzVar == ibzVar2) {
            if (hsyVar2 != null && hsyVar2.fq()) {
                hsyVar2.h();
            }
            this.c = hsyVar;
            this.e = ibmVar;
            this.d = ibzVar;
            this.m.aH(ibzVar);
            this.f = null;
            if (ibzVar == ibz.c || ibzVar == ibz.b) {
                this.n.j(c(), ibzVar.l);
            }
            if (this.g == 1) {
                h(true, this.h, this.d);
            } else {
                ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/inputbundle/KeyboardWrapper", "onKeyboardReady", 153, "KeyboardWrapper.java")).K("Keyboard was switched but not activated. keyboardStatus: %s, kbtype: %s, kb:%s, kbDef:%s", Integer.valueOf(this.g), ibzVar, hsyVar, ibmVar);
            }
        }
        if (!this.l) {
            return;
        }
        this.l = false;
        if (hsyVar2 != null || !this.j) {
            return;
        }
        ibz[] ibzVarArr = q;
        int length = ibzVarArr.length;
        for (int i = 0; i < 2; i++) {
            ibz ibzVar3 = ibzVarArr[i];
            if (ibzVar3 != ibzVar) {
                i(ibzVar3);
            }
        }
    }
}
