package defpackage;

import android.view.View;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* renamed from: cou  reason: default package */
/* loaded from: classes.dex */
public final class cou implements cpf {
    private static final ltg d = ltg.j("com/google/android/apps/inputmethod/libs/expression/header/ElementController");
    private static final cov e = cov.a().h();
    private static final cpd f;
    public cot a;
    public cpd b = f;
    public cov c = e;
    private final cpe g;

    static {
        cpc a = cpd.a();
        a.b = 1;
        f = a.a();
    }

    public cou(SoftKeyboardView softKeyboardView, cot cotVar) {
        View findViewById = softKeyboardView.findViewById(R.id.keyboard_expression_header_container);
        this.a = cotVar;
        if (findViewById instanceof cpe) {
            cpe cpeVar = (cpe) findViewById;
            this.g = cpeVar;
            cpeVar.r(this);
            return;
        }
        ((ltd) d.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/header/ElementController", "<init>", 56, "ElementController.java")).t("Provided keyboard view does not contain valid header container");
        this.g = coj.a();
    }

    @Override // defpackage.cpf
    public final coq a(cox coxVar) {
        coq coqVar;
        int i;
        cow cowVar = cow.START;
        int ordinal = coxVar.b.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                int i2 = coxVar.c;
                if (i2 >= 0) {
                    llp llpVar = this.c.b;
                    if (i2 < ((lrl) llpVar).c) {
                        return (coq) llpVar.get(i2);
                    }
                }
            } else if (ordinal == 2 && (i = coxVar.c) >= 0) {
                llp llpVar2 = this.c.d;
                if (i < ((lrl) llpVar2).c) {
                    return (coq) llpVar2.get(i);
                }
            }
        } else if (coxVar.c == 0 && (coqVar = this.c.a) != null) {
            return coqVar;
        }
        ((ltd) ((ltd) d.d()).k("com/google/android/apps/inputmethod/libs/expression/header/ElementController", "getElementAt", 170, "ElementController.java")).w("Invalid position %s", coxVar);
        return null;
    }

    @Override // defpackage.cpf
    public final cov b() {
        return this.c;
    }

    @Override // defpackage.cpf
    public final cpd c() {
        return this.b;
    }

    @Override // defpackage.cpf
    public final void d(coq coqVar, boolean z) {
        gyc.b.execute(new cah(this, coqVar, z, 2));
    }

    @Override // defpackage.cpf
    public final void e(int i) {
        this.g.u(i);
    }

    public final cox f() {
        return this.g.j();
    }

    public final void g(cpd cpdVar) {
        this.b = cpdVar;
        this.g.m();
    }

    public final void h() {
        j(false);
        this.b = f;
        this.c = e;
        this.g.p();
    }

    public final void i(cox coxVar) {
        this.g.x(coxVar);
    }

    public final void j(boolean z) {
        this.g.t(z);
    }

    public final void k(cov covVar) {
        if (this.b != f) {
            this.c = covVar;
            this.g.o();
        }
    }
}
