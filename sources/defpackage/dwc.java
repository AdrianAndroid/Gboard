package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* renamed from: dwc  reason: default package */
/* loaded from: classes.dex */
abstract class dwc extends dvk implements hwu {
    public static final ltg c = ltg.j("com/google/android/apps/inputmethod/libs/nga/impl/ui/NgaPopupViewContainer");
    private final Context a;
    private final imn b;
    protected View d;
    private View e;
    private dwj f;
    private Runnable g;
    private boolean h;

    public dwc(Context context, imn imnVar) {
        this.a = context;
        this.b = imnVar;
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
    public final /* synthetic */ void d(View view) {
    }

    @Override // defpackage.hwu
    public final void e() {
        View g;
        View view = this.e;
        if (view == null || (g = g()) == this.d) {
            return;
        }
        this.b.d(view, null, true);
        this.d = g;
        View view2 = this.e;
        if (view2 == null || g == null) {
            return;
        }
        i(view2, g);
    }

    @Override // defpackage.hwu
    public final /* synthetic */ void f(ibz ibzVar) {
    }

    protected abstract View g();

    public void h(View view) {
        this.b.c(view, null, true);
    }

    protected abstract void i(View view, View view2);

    @Override // defpackage.dwk
    public final void j() {
        View view = this.e;
        dwj dwjVar = this.f;
        if (view == null || dwjVar == null) {
            return;
        }
        if (this.h) {
            hsx.c().l(ice.HEADER, this);
            this.h = false;
        }
        h(view);
        dwjVar.g();
        dwjVar.e();
        Runnable runnable = this.g;
        if (runnable != null) {
            runnable.run();
        }
        this.e = null;
        this.f = null;
    }

    @Override // defpackage.dwk
    public final boolean k(dwj dwjVar, Runnable runnable) {
        View view;
        if (this.f != dwjVar || (view = this.e) == null || !this.b.f(view)) {
            j();
            View g = g();
            if (g == null) {
                ((ltd) ((ltd) c.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/ui/NgaPopupViewContainer", "showView", 160, "NgaPopupViewContainer.java")).t("No anchor view");
                this.e = null;
                this.f = null;
                return false;
            }
            int a = dwjVar.a();
            hrx.y(this.a);
            hqt b = hqp.b();
            int a2 = b != null ? b.h().a() : 0;
            View a3 = this.b.a(a);
            a3.setLayoutDirection(a2);
            a3.setEnabled(true);
            a3.setClickable(true);
            this.e = a3;
            this.f = dwjVar;
            this.g = runnable;
            dwjVar.c(this, a3, this.a);
            if (this.f != dwjVar) {
                return false;
            }
            this.d = g;
            i(a3, g);
            this.h = hsx.c().a(ice.HEADER, this);
            dwjVar.f();
            return true;
        }
        return true;
    }
}
