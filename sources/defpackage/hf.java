package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: hf  reason: default package */
/* loaded from: classes.dex */
final class hf extends gv implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener, gz {
    final lm a;
    View c;
    ViewTreeObserver d;
    private final Context e;
    private final gm f;
    private final gj h;
    private final boolean i;
    private final int j;
    private final int k;
    private PopupWindow.OnDismissListener m;
    private View n;
    private gy o;
    private boolean p;
    private boolean q;
    private int r;
    private boolean t;
    final ViewTreeObserver.OnGlobalLayoutListener b = new he(this, 0);
    private final View.OnAttachStateChangeListener l = new ge(this, 2);
    private int s = 0;

    public hf(Context context, gm gmVar, View view, int i, boolean z) {
        this.e = context;
        this.f = gmVar;
        this.i = z;
        this.h = new gj(gmVar, LayoutInflater.from(context), z, R.layout.f133350_resource_name_obfuscated_res_0x7f0e0013);
        this.k = i;
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.f31680_resource_name_obfuscated_res_0x7f070017));
        this.n = view;
        this.a = new lm(context, i);
        gmVar.h(this, context);
    }

    @Override // defpackage.gz
    public final void c(gm gmVar, boolean z) {
        if (gmVar != this.f) {
            return;
        }
        k();
        gy gyVar = this.o;
        if (gyVar == null) {
            return;
        }
        gyVar.a(gmVar, z);
    }

    @Override // defpackage.gz
    public final void d(gy gyVar) {
        this.o = gyVar;
    }

    @Override // defpackage.gz
    public final boolean e() {
        return false;
    }

    @Override // defpackage.hd
    public final ListView eW() {
        return this.a.e;
    }

    @Override // defpackage.gz
    public final boolean f(hg hgVar) {
        if (hgVar.hasVisibleItems()) {
            gx gxVar = new gx(this.e, hgVar, this.c, this.i, this.k);
            gxVar.e(this.o);
            gxVar.d(gv.w(hgVar));
            gxVar.c = this.m;
            this.m = null;
            this.f.i(false);
            lm lmVar = this.a;
            int i = lmVar.g;
            int b = lmVar.b();
            if ((Gravity.getAbsoluteGravity(this.s, aad.f(this.n)) & 7) == 5) {
                i += this.n.getWidth();
            }
            if (!gxVar.g()) {
                if (gxVar.a != null) {
                    gxVar.f(i, b, true, true);
                }
            }
            gy gyVar = this.o;
            if (gyVar != null) {
                gyVar.b(hgVar);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.gz
    public final void i() {
        this.q = false;
        gj gjVar = this.h;
        if (gjVar != null) {
            gjVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.gv
    public final void j(gm gmVar) {
    }

    @Override // defpackage.hd
    public final void k() {
        if (u()) {
            this.a.k();
        }
    }

    @Override // defpackage.gv
    public final void l(View view) {
        this.n = view;
    }

    @Override // defpackage.gv
    public final void m(boolean z) {
        this.h.b = z;
    }

    @Override // defpackage.gv
    public final void n(int i) {
        this.s = i;
    }

    @Override // defpackage.gv
    public final void o(int i) {
        this.a.g = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.p = true;
        this.f.close();
        ViewTreeObserver viewTreeObserver = this.d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.d = this.c.getViewTreeObserver();
            }
            this.d.removeGlobalOnLayoutListener(this.b);
            this.d = null;
        }
        this.c.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            k();
            return true;
        }
        return false;
    }

    @Override // defpackage.gv
    public final void p(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    @Override // defpackage.gv
    public final void q(boolean z) {
        this.t = z;
    }

    @Override // defpackage.gv
    public final void r(int i) {
        this.a.j(i);
    }

    @Override // defpackage.hd
    public final void s() {
        View view;
        if (u()) {
            return;
        }
        if (this.p || (view = this.n) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.c = view;
        this.a.v(this);
        lm lmVar = this.a;
        lmVar.m = this;
        lmVar.y();
        View view2 = this.c;
        ViewTreeObserver viewTreeObserver = this.d;
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        this.d = viewTreeObserver2;
        if (viewTreeObserver == null) {
            viewTreeObserver2.addOnGlobalLayoutListener(this.b);
        }
        view2.addOnAttachStateChangeListener(this.l);
        lm lmVar2 = this.a;
        lmVar2.l = view2;
        lmVar2.j = this.s;
        if (!this.q) {
            this.r = x(this.h, this.e, this.j);
            this.q = true;
        }
        this.a.r(this.r);
        this.a.x();
        this.a.t(this.g);
        this.a.s();
        kk kkVar = this.a.e;
        kkVar.setOnKeyListener(this);
        if (this.t && this.f.e != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.e).inflate(R.layout.f133340_resource_name_obfuscated_res_0x7f0e0012, (ViewGroup) kkVar, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f.e);
            }
            frameLayout.setEnabled(false);
            kkVar.addHeaderView(frameLayout, null, false);
        }
        this.a.e(this.h);
        this.a.s();
    }

    @Override // defpackage.hd
    public final boolean u() {
        return !this.p && this.a.u();
    }
}
