package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;

/* compiled from: PG */
/* renamed from: dvo  reason: default package */
/* loaded from: classes.dex */
public final class dvo implements dvl, hwu {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/nga/impl/ui/MicRing");
    private final hhk c = new bvl(this, 13);
    public final dvt b = new dvt();
    private boolean d = false;

    public static SoftKeyView o() {
        hsk b = hsx.b();
        if (b == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/ui/MicRing", "getVoiceButton", 98, "MicRing.java")).t("InputMethodService is null");
            return null;
        }
        View G = b.G();
        if (G == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/ui/MicRing", "getVoiceButton", 103, "MicRing.java")).t("keyboardArea is null");
            return null;
        }
        return (SoftKeyView) G.findViewById(lre.aF());
    }

    @Override // defpackage.hwu
    public final /* synthetic */ void a(ibz ibzVar, ice iceVar, View view) {
    }

    @Override // defpackage.hwu
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.hwu
    public final /* synthetic */ void c(boolean z) {
    }

    @Override // defpackage.hwu
    public final void d(View view) {
        if (!this.b.j()) {
            return;
        }
        SoftKeyView softKeyView = (SoftKeyView) view.findViewById(lre.aF());
        if (softKeyView == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/ui/MicRing", "onKeyboardViewShowing", 120, "MicRing.java")).t("The voice button is null");
        } else if (this.b.i(softKeyView)) {
        } else {
            softKeyView.f(new dvn(this, softKeyView));
        }
    }

    @Override // defpackage.hwu
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.hwu
    public final /* synthetic */ void f(ibz ibzVar) {
    }

    @Override // defpackage.dvl
    public final void g() {
        this.b.a();
    }

    @Override // defpackage.dvl
    public final void h(Runnable runnable) {
        this.b.b(runnable);
    }

    @Override // defpackage.dvl
    public final void i() {
        this.b.d();
        gqj.d.g(this.c);
        if (this.d) {
            hsx.c().l(ice.HEADER, this);
        }
        this.d = false;
    }

    @Override // defpackage.dvl
    public final void j(boolean z) {
        this.b.a = z;
    }

    @Override // defpackage.dvl
    public final void k(boolean z) {
        this.b.f(z);
    }

    @Override // defpackage.dvl
    public final void l(Context context, boolean z) {
        i();
        SoftKeyView o = o();
        if (o == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/ui/MicRing", "show", 40, "MicRing.java")).t("The voice button is null");
            return;
        }
        this.b.g(context, o, z);
        gqj.d.e(this.c);
        this.d = hsx.c().a(ice.HEADER, this);
    }

    @Override // defpackage.dvl
    public final void m(int i) {
        this.b.h(i);
    }

    @Override // defpackage.dvl
    public final void n() {
        this.b.h(100);
    }
}
