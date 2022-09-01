package defpackage;

import android.view.ViewGroup;
import com.google.android.libraries.inputmethod.keyboard.impl.Keyboard;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* renamed from: hug  reason: default package */
/* loaded from: classes.dex */
public final class hug implements htt {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public hug(Keyboard keyboard, int i) {
        this.b = i;
        this.a = keyboard;
    }

    public hug(huh huhVar, int i) {
        this.b = i;
        this.a = huhVar;
    }

    @Override // defpackage.htt
    public final float a() {
        if (this.b == 0) {
            ibm ibmVar = ((huh) this.a).e;
            if (ibmVar == null) {
                return 1.0f;
            }
            return ibmVar.g;
        }
        ibm ibmVar2 = ((Keyboard) this.a).w;
        if (ibmVar2 != null) {
            return ibmVar2.g;
        }
        ((ltd) Keyboard.A.a(hip.a).k("com/google/android/libraries/inputmethod/keyboard/impl/Keyboard$2", "getKeyTextSizeRatio", 188, "Keyboard.java")).t("keyboardDef is null.");
        return 1.0f;
    }

    @Override // defpackage.htt
    public final float b() {
        if (this.b != 0) {
            return ((Keyboard) this.a).v.a();
        }
        return 1.0f;
    }

    @Override // defpackage.htt
    public final int c() {
        return 0;
    }

    @Override // defpackage.htt
    public final htc d() {
        if (this.b != 0) {
            return ((Keyboard) this.a).v.n();
        }
        return null;
    }

    @Override // defpackage.htt
    public final void g(SoftKeyboardView softKeyboardView, icf icfVar) {
    }

    @Override // defpackage.htt
    public final void h(icf icfVar) {
        if (this.b != 0) {
            return;
        }
        huh huhVar = (huh) this.a;
        huhVar.c.c(huhVar.g, null, true);
        huh huhVar2 = (huh) this.a;
        gsa gsaVar = (gsa) huhVar2.h.a;
        gsaVar.i = null;
        gsaVar.j = null;
        huhVar2.g = null;
    }

    @Override // defpackage.htt
    public final /* synthetic */ boolean m(int i) {
        return false;
    }

    @Override // defpackage.htt
    public final SoftKeyboardView e(htd htdVar, int i, ViewGroup viewGroup) {
        if (this.b == 0) {
            SoftKeyboardView softKeyboardView = (SoftKeyboardView) ((huh) this.a).c.a(i);
            softKeyboardView.setClickable(true);
            softKeyboardView.setEnabled(true);
            return softKeyboardView;
        }
        Keyboard keyboard = (Keyboard) this.a;
        return keyboard.v.u(htdVar, viewGroup, i, keyboard.x.f.f);
    }
}
