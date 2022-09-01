package defpackage;

import android.view.ViewGroup;
import com.google.android.libraries.inputmethod.keyboard.impl.Keyboard;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* renamed from: hts  reason: default package */
/* loaded from: classes.dex */
public final class hts implements htt {
    final /* synthetic */ Keyboard a;

    public hts(Keyboard keyboard) {
        this.a = keyboard;
    }

    @Override // defpackage.htt
    public final float a() {
        ibm ibmVar = this.a.w;
        if (ibmVar != null) {
            return ibmVar.g;
        }
        ((ltd) Keyboard.A.a(hip.a).k("com/google/android/libraries/inputmethod/keyboard/impl/Keyboard$1", "getKeyTextSizeRatio", 128, "Keyboard.java")).t("keyboardDef is null.");
        return 1.0f;
    }

    @Override // defpackage.htt
    public final float b() {
        return this.a.v.a();
    }

    @Override // defpackage.htt
    public final int c() {
        return this.a.gh();
    }

    @Override // defpackage.htt
    public final htc d() {
        return this.a.v.n();
    }

    @Override // defpackage.htt
    public final SoftKeyboardView e(htd htdVar, int i, ViewGroup viewGroup) {
        Keyboard keyboard = this.a;
        return keyboard.v.u(htdVar, viewGroup, i, keyboard.x.f.f);
    }

    @Override // defpackage.htt
    public final void g(SoftKeyboardView softKeyboardView, icf icfVar) {
        this.a.fz(softKeyboardView, icfVar);
    }

    @Override // defpackage.htt
    public final void h(icf icfVar) {
        this.a.fA(icfVar);
    }

    @Override // defpackage.htt
    public final boolean m(int i) {
        return this.a.M(i);
    }
}
