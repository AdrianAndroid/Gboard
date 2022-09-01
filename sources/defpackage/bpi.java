package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* renamed from: bpi  reason: default package */
/* loaded from: classes.dex */
public final class bpi implements AutoCloseable, htt {
    public final htu a;
    public final imn b;
    public final PopupWindow c;
    public final Animator d;
    public final Animator e;
    public View f;
    public View g;
    public View h;
    public View i;
    public boolean j;
    private final Context m;
    private int o;
    private final hsz p;
    private final Rect n = new Rect();
    public final Runnable k = new att(this, 18);
    public final Handler l = new Handler();

    public bpi(Context context, hsz hszVar, icf icfVar, ibm ibmVar, hsy hsyVar) {
        this.m = context;
        this.p = hszVar;
        this.a = new htu(this, icfVar, new hud(context, hszVar, ibmVar, icfVar, hsyVar));
        PopupWindow popupWindow = new PopupWindow(new View(context));
        popupWindow.setFocusable(false);
        popupWindow.setTouchable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setBackgroundDrawable(new ShapeDrawable());
        popupWindow.setTouchInterceptor(new bph(this, 0));
        popupWindow.setWidth(1);
        popupWindow.setHeight(1);
        this.c = popupWindow;
        this.b = hszVar.s();
        this.d = AnimatorInflater.loadAnimator(context, R.animator.f580_resource_name_obfuscated_res_0x7f020019);
        this.e = AnimatorInflater.loadAnimator(context, R.animator.f590_resource_name_obfuscated_res_0x7f02001a);
    }

    @Override // defpackage.htt
    public final float a() {
        return 1.0f;
    }

    @Override // defpackage.htt
    public final float b() {
        return 1.0f;
    }

    @Override // defpackage.htt
    public final int c() {
        return 0;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.j = false;
        this.a.close();
        this.l.removeCallbacks(this.k);
        this.b.c(this.g, null, true);
        this.c.dismiss();
        this.g = null;
        this.h = null;
        this.i = null;
    }

    @Override // defpackage.htt
    public final htc d() {
        return this.p.n();
    }

    @Override // defpackage.htt
    public final SoftKeyboardView e(htd htdVar, int i, ViewGroup viewGroup) {
        return this.p.u(htdVar, viewGroup, i, 0);
    }

    public final void f() {
        if (this.g == null) {
            View d = this.a.d((ViewGroup) this.h);
            this.g = d;
            this.f = d.findViewById(R.id.f56070_resource_name_obfuscated_res_0x7f0b0252);
        }
    }

    @Override // defpackage.htt
    public final void g(SoftKeyboardView softKeyboardView, icf icfVar) {
    }

    @Override // defpackage.htt
    public final void h(icf icfVar) {
        this.j = false;
        this.l.removeCallbacks(this.k);
        this.b.c(this.g, null, true);
        this.g = null;
    }

    public final void i() {
        View view = this.i;
        if (view == null || this.h == null || !view.isShown()) {
            return;
        }
        this.j = true;
        this.l.removeCallbacks(this.k);
        this.l.postDelayed(this.k, 100L);
        this.a.e();
    }

    public final void j() {
        if (this.i == null || this.h == null) {
            return;
        }
        f();
        if (this.g == null) {
            return;
        }
        int i = this.o;
        if (i == -1) {
            i = this.i.getRootView().getBottom();
        } else {
            int i2 = 0;
            if (i == -2) {
                View findViewById = this.h.getRootView().findViewById(R.id.f54740_resource_name_obfuscated_res_0x7f0b01c2);
                if (findViewById.isShown()) {
                    i2 = findViewById.getMeasuredHeight();
                }
                i = this.h.getMeasuredHeight() + i2 + this.i.getMeasuredHeight();
            } else if (i == -3) {
                i = 0;
            }
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.g.getLayoutParams();
        if (marginLayoutParams == null) {
            return;
        }
        this.i.getWindowVisibleDisplayFrame(this.n);
        marginLayoutParams.height = ((this.n.height() - i) - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin;
        this.g.setLayoutParams(marginLayoutParams);
        this.b.e(this.g, this.i, 0, 0, 0, null);
        this.c.dismiss();
    }

    public final boolean k() {
        return this.b.f(this.g);
    }

    public final void l(int i) {
        this.o = i;
        if (k()) {
            j();
        }
    }

    @Override // defpackage.htt
    public final /* synthetic */ boolean m(int i) {
        return false;
    }
}
