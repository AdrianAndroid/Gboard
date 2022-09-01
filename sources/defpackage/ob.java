package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ob  reason: default package */
/* loaded from: classes2.dex */
public final class ob implements jt {
    public final Toolbar a;
    public int b;
    CharSequence c;
    public Window.Callback d;
    boolean e;
    private View f;
    private Drawable g;
    private Drawable h;
    private Drawable i;
    private boolean j;
    private CharSequence k;
    private CharSequence l;
    private hs m;
    private int n;
    private Drawable o;

    public ob(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.n = 0;
        this.a = toolbar;
        this.c = toolbar.s;
        this.k = toolbar.t;
        this.j = this.c != null;
        this.i = toolbar.e();
        String str = null;
        gkn w = gkn.w(toolbar.getContext(), null, ei.a, R.attr.f7370_resource_name_obfuscated_res_0x7f040217, 0);
        int i = 15;
        this.o = w.n(15);
        if (!z) {
            if (toolbar.e() != null) {
                this.o = toolbar.e();
            } else {
                i = 11;
            }
            this.b = i;
        } else {
            CharSequence p = w.p(27);
            if (!TextUtils.isEmpty(p)) {
                k(p);
            }
            CharSequence p2 = w.p(25);
            if (!TextUtils.isEmpty(p2)) {
                this.k = p2;
                if ((this.b & 8) != 0) {
                    toolbar.r(p2);
                }
            }
            Drawable n = w.n(20);
            if (n != null) {
                h(n);
            }
            Drawable n2 = w.n(17);
            if (n2 != null) {
                this.g = n2;
                C();
            }
            if (this.i == null && (drawable = this.o) != null) {
                this.i = drawable;
                B();
            }
            g(w.i(10, 0));
            int l = w.l(9, 0);
            if (l != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(l, (ViewGroup) toolbar, false);
                View view = this.f;
                if (view != null && (this.b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f = inflate;
                if (inflate != null && (this.b & 16) != 0) {
                    toolbar.addView(inflate);
                }
                g(this.b | 16);
            }
            int k = w.k(13, 0);
            if (k > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = k;
                toolbar.setLayoutParams(layoutParams);
            }
            int g = w.g(7, -1);
            int g2 = w.g(3, -1);
            if (g >= 0 || g2 >= 0) {
                int max = Math.max(g, 0);
                int max2 = Math.max(g2, 0);
                toolbar.j();
                toolbar.r.a(max, max2);
            }
            int l2 = w.l(28, 0);
            if (l2 != 0) {
                Context context = toolbar.getContext();
                toolbar.k = l2;
                TextView textView = toolbar.b;
                if (textView != null) {
                    textView.setTextAppearance(context, l2);
                }
            }
            int l3 = w.l(26, 0);
            if (l3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.l = l3;
                TextView textView2 = toolbar.c;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, l3);
                }
            }
            int l4 = w.l(22, 0);
            if (l4 != 0) {
                toolbar.q(l4);
            }
        }
        w.r();
        if (this.n != R.string.f147570_resource_name_obfuscated_res_0x7f14000a) {
            this.n = R.string.f147570_resource_name_obfuscated_res_0x7f14000a;
            if (TextUtils.isEmpty(toolbar.h())) {
                int i2 = this.n;
                this.l = i2 != 0 ? b().getString(i2) : str;
                A();
            }
        }
        this.l = toolbar.h();
        toolbar.p(new nz(this));
    }

    private final void A() {
        if ((this.b & 4) != 0) {
            if (TextUtils.isEmpty(this.l)) {
                this.a.m(this.n);
            } else {
                this.a.n(this.l);
            }
        }
    }

    private final void B() {
        if ((this.b & 4) == 0) {
            this.a.o(null);
            return;
        }
        Toolbar toolbar = this.a;
        Drawable drawable = this.i;
        if (drawable == null) {
            drawable = this.o;
        }
        toolbar.o(drawable);
    }

    private final void C() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.h) == null) {
            drawable = this.g;
        }
        this.a.l(drawable);
    }

    private final void z(CharSequence charSequence) {
        this.c = charSequence;
        if ((this.b & 8) != 0) {
            this.a.s(charSequence);
            if (!this.j) {
                return;
            }
            aad.N(this.a.getRootView(), charSequence);
        }
    }

    @Override // defpackage.jt
    public final int a() {
        return this.b;
    }

    @Override // defpackage.jt
    public final Context b() {
        return this.a.getContext();
    }

    @Override // defpackage.jt
    public final void c() {
        this.a.i();
    }

    @Override // defpackage.jt
    public final void d() {
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView != null) {
            actionMenuView.h();
        }
    }

    @Override // defpackage.jt
    public final void e() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // defpackage.jt
    public final void f() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // defpackage.jt
    public final void g(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    A();
                }
                B();
            }
            if ((i2 & 3) != 0) {
                C();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.a.s(this.c);
                    this.a.r(this.k);
                } else {
                    this.a.s(null);
                    this.a.r(null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.a.addView(view);
            } else {
                this.a.removeView(view);
            }
        }
    }

    @Override // defpackage.jt
    public final void h(Drawable drawable) {
        this.h = drawable;
        C();
    }

    @Override // defpackage.jt
    public final void i(Menu menu, gy gyVar) {
        if (this.m == null) {
            this.m = new hs(this.a.getContext());
        }
        hs hsVar = this.m;
        hsVar.e = gyVar;
        Toolbar toolbar = this.a;
        if (menu == null && toolbar.a == null) {
            return;
        }
        toolbar.k();
        gm gmVar = toolbar.a.a;
        if (gmVar == menu) {
            return;
        }
        if (gmVar != null) {
            gmVar.m(toolbar.v);
            gmVar.m(toolbar.w);
        }
        if (toolbar.w == null) {
            toolbar.w = new nw(toolbar);
        }
        hsVar.o();
        if (menu != null) {
            gm gmVar2 = (gm) menu;
            gmVar2.h(hsVar, toolbar.i);
            gmVar2.h(toolbar.w, toolbar.i);
        } else {
            hsVar.b(toolbar.i, null);
            toolbar.w.b(toolbar.i, null);
            hsVar.i();
            toolbar.w.i();
        }
        toolbar.a.j(toolbar.j);
        toolbar.a.k(hsVar);
        toolbar.v = hsVar;
    }

    @Override // defpackage.jt
    public final void j() {
        this.e = true;
    }

    @Override // defpackage.jt
    public final void k(CharSequence charSequence) {
        this.j = true;
        z(charSequence);
    }

    @Override // defpackage.jt
    public final void l(int i) {
        this.a.setVisibility(i);
    }

    @Override // defpackage.jt
    public final void m(Window.Callback callback) {
        this.d = callback;
    }

    @Override // defpackage.jt
    public final void n(CharSequence charSequence) {
        if (!this.j) {
            z(charSequence);
        }
    }

    @Override // defpackage.jt
    public final boolean o() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.b;
    }

    @Override // defpackage.jt
    public final boolean p() {
        nw nwVar = this.a.w;
        return (nwVar == null || nwVar.b == null) ? false : true;
    }

    @Override // defpackage.jt
    public final boolean q() {
        hs hsVar;
        ActionMenuView actionMenuView = this.a.a;
        return (actionMenuView == null || (hsVar = actionMenuView.c) == null || !hsVar.k()) ? false : true;
    }

    @Override // defpackage.jt
    public final boolean r() {
        hs hsVar;
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView == null || (hsVar = actionMenuView.c) == null) {
            return false;
        }
        return hsVar.k != null || hsVar.l();
    }

    @Override // defpackage.jt
    public final boolean s() {
        return this.a.t();
    }

    @Override // defpackage.jt
    public final boolean t() {
        return this.a.u();
    }

    @Override // defpackage.jt
    public final void u() {
    }

    @Override // defpackage.jt
    public final void v() {
    }

    @Override // defpackage.jt
    public final void w() {
    }

    @Override // defpackage.jt
    public final void x() {
        this.a.requestLayout();
    }

    @Override // defpackage.jt
    public final aqq y(int i, long j) {
        aqq aq = aad.aq(this.a);
        aq.j(i == 0 ? 1.0f : 0.0f);
        aq.k(j);
        aq.l(new oa(this, i));
        return aq;
    }
}
