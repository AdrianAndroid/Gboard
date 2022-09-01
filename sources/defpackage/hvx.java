package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.libraries.inputmethod.keyboard.impl.KeyboardViewHolder;
import com.google.android.libraries.inputmethod.widgets.KeyboardHolder;

/* compiled from: PG */
/* renamed from: hvx  reason: default package */
/* loaded from: classes.dex */
public final class hvx {
    public static final lug a = hin.a;
    public static final hhl b = hhq.e("enable_higher_keyboard_max_system_bottom_gap_inch", 0.0d);
    public static final lgb c = jdg.o(null);
    public final Context f;
    public final hvw g;
    public final ino h;
    public View j;
    public View k;
    public jdm l;
    public KeyboardViewHolder m;
    public View n;
    public KeyboardHolder o;
    public View p;
    public View q;
    public View r;
    public View s;
    public jdm t;
    public Rect u;
    public lgb v;
    public lgb w;
    public boolean x;
    public final Runnable d = new hvg(this, 7);
    public final View.OnLayoutChangeListener e = new hvu(this);
    private final int[] y = new int[2];
    public final Point i = new Point();

    public hvx(Context context, hvw hvwVar) {
        lgb lgbVar = c;
        this.v = lgbVar;
        this.w = lgbVar;
        this.f = context;
        this.h = ino.M(context);
        this.g = hvwVar;
    }

    private static final void A(View view, int i, int i2) {
        if (view == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (i2 == marginLayoutParams.bottomMargin && i == marginLayoutParams.topMargin) {
            return;
        }
        marginLayoutParams.topMargin = i;
        marginLayoutParams.bottomMargin = i2;
        view.setLayoutParams(marginLayoutParams);
    }

    public static lgb h(Context context, ViewGroup viewGroup, int i) {
        return viewGroup == null ? c : jdg.n(new hvv(context, i, viewGroup));
    }

    private final float r() {
        float a2 = this.g.p().a();
        if (a2 < 0.0f || a2 > 1.0f) {
            ((luc) ((luc) a.c()).k("com/google/android/libraries/inputmethod/keyboardmode/KeyboardViewManager", "getKeyboardSizeRatio", 511, "KeyboardViewManager.java")).w("keyboardSizeRatio:%f out of range!", Float.valueOf(a2));
            return 1.0f;
        }
        return a2;
    }

    private final int s() {
        return Math.max(0, Math.min(this.g.p().h(), x()));
    }

    private final int t() {
        return this.g.p().k();
    }

    private final int u() {
        int e;
        int x = x();
        int m = this.g.p().m();
        p();
        if (this.u != null) {
            View view = this.k;
            if (view != null) {
                e = view.getRootView().getHeight() - g();
            } else {
                e = e();
            }
            return Math.min((e - f()) - x, m);
        }
        return m;
    }

    private final int v() {
        return (int) (d() * r());
    }

    private final int w() {
        p();
        int n = this.g.p().n();
        Rect rect = this.u;
        return rect != null ? Math.min(Math.max(rect.left, n), this.u.right - v()) : n;
    }

    private final int x() {
        p();
        int o = this.g.p().o();
        if (this.u != null) {
            return Math.max(Math.min(e() - f(), o), (gvv.e(this.f) - this.u.bottom) - g());
        }
        return o;
    }

    private final void y(jdm jdmVar) {
        if (jdmVar == null) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) jdmVar.getLayoutParams();
        int d = d();
        float r = r();
        float sqrt = (float) Math.sqrt(r);
        if (sqrt < 0.0f || sqrt > 2.0f) {
            ((luc) ((luc) a.c()).k("com/google/android/libraries/inputmethod/keyboardmode/KeyboardViewManager", "updateKeyboardHeaderViewWidth", 904, "KeyboardViewManager.java")).x("headerRatio:%f out of range! bodyRatio=%f", sqrt, r);
            sqrt = r;
        }
        layoutParams.width = Math.round((d * r) / sqrt);
        jdmVar.setLayoutParams(layoutParams);
        jdmVar.k(sqrt);
        jdmVar.forceLayout();
    }

    private static void z(View view, int i) {
        if (view == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (i == marginLayoutParams.leftMargin) {
            return;
        }
        marginLayoutParams.leftMargin = i;
        view.setLayoutParams(marginLayoutParams);
    }

    public final int a() {
        return this.g.p().f();
    }

    public final int b() {
        return this.g.p().g();
    }

    public final int c() {
        return this.g.p().j();
    }

    public final int d() {
        return this.g.p().l();
    }

    public final int e() {
        return this.g.p().p();
    }

    public final int f() {
        p();
        Rect rect = this.u;
        if (rect == null) {
            return 0;
        }
        int width = rect.width();
        int e = e();
        KeyboardHolder keyboardHolder = this.o;
        if (keyboardHolder == null) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = keyboardHolder.getLayoutParams();
        this.o.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), 0, layoutParams != null ? layoutParams.width : 0), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(e, Integer.MIN_VALUE), 0, layoutParams != null ? layoutParams.height : 0));
        return this.o.getMeasuredHeight();
    }

    public final int g() {
        int e = this.g.p().e();
        if (e >= 0) {
            return e;
        }
        gvv.k(this.f).getRealSize(this.i);
        int i = this.i.y;
        View view = this.j;
        if (view == null || view.getHeight() <= 0) {
            return i;
        }
        int height = this.j.getHeight();
        this.j.getLocationOnScreen(this.y);
        return (i - this.y[1]) - height;
    }

    public final void i() {
        this.x = true;
    }

    public final void j() {
        Drawable background;
        View view = this.n;
        if (view == null || (background = view.getBackground()) == null) {
            return;
        }
        int round = Math.round(r() * 10000.0f);
        background.setLevel(round);
        ((luc) ((luc) a.b()).k("com/google/android/libraries/inputmethod/keyboardmode/KeyboardViewManager", "updateKeyboardBackgroundDrawableLevel", 501, "KeyboardViewManager.java")).u("Set level to the background drawable: %d", round);
    }

    public final void k() {
        KeyboardHolder keyboardHolder = this.o;
        if (keyboardHolder == null) {
            return;
        }
        int height = keyboardHolder.getHeight();
        View view = this.n;
        if (view == null) {
            return;
        }
        int visibility = view.getVisibility();
        int i = 8;
        if (height > 0 && view.getBackground() != null) {
            i = 0;
        }
        view.setVisibility(i);
        ((luc) ((luc) a.b()).k("com/google/android/libraries/inputmethod/keyboardmode/KeyboardViewManager", "updateKeyboardBackgroundFrameVisibility", 357, "KeyboardViewManager.java")).y("Set background frame visibility. old:%d, new:%d", visibility, view.getVisibility());
    }

    public final void l() {
        View view;
        KeyboardHolder keyboardHolder = this.o;
        if (keyboardHolder == null || (view = this.q) == null) {
            return;
        }
        int i = 8;
        if (keyboardHolder.getHeight() > 0 && this.g.p().u()) {
            i = 0;
        }
        view.setVisibility(i);
    }

    public final void m() {
        n();
        z(this.o, w());
        z(this.n, w());
        z(this.q, w() - t());
    }

    public final void n() {
        int max;
        if (this.o != null) {
            A(this.o, u(), s());
        }
        KeyboardViewHolder keyboardViewHolder = this.m;
        if (keyboardViewHolder != null && keyboardViewHolder.getHeight() > 0) {
            int g = g();
            boolean z = true;
            boolean z2 = hyq.i() && hyq.h(this.f);
            int applyDimension = (int) TypedValue.applyDimension(4, ((Double) b.c()).floatValue(), this.f.getResources().getDisplayMetrics());
            if (applyDimension <= 0 || g < 0) {
                z = z2;
            } else if (!z2 || applyDimension <= g) {
                z = false;
            }
            this.h.f("normal_mode_keyboard_qualified_to_higher_keyboard", z);
            int a2 = a();
            if (a2 > 0) {
                Integer valueOf = Integer.valueOf(a2);
                ((luc) ((luc) a.b()).k("com/google/android/libraries/inputmethod/keyboardmode/KeyboardViewManager", "updateKeyboardBodyViewHolderPaddingBottom", 598, "KeyboardViewManager.java")).J("Set finalPaddingBottom = %d while holderPaddingBottom = %d; navigationHeight = %d", valueOf, valueOf, Integer.valueOf(g));
            } else if (z) {
                int b2 = b();
                int max2 = Math.max(0, b2 - g);
                ((luc) ((luc) a.b()).k("com/google/android/libraries/inputmethod/keyboardmode/KeyboardViewManager", "updateKeyboardBodyViewHolderPaddingBottom", 604, "KeyboardViewManager.java")).J("Set finalPaddingBottom = %d while keyboardBottomGapFromScreen = %d; navigationHeight = %d", Integer.valueOf(max2), Integer.valueOf(b2), Integer.valueOf(g));
                a2 = max2;
            } else {
                a2 = 0;
            }
            KeyboardViewHolder keyboardViewHolder2 = this.m;
            if (keyboardViewHolder2 != null && a2 != keyboardViewHolder2.getPaddingBottom()) {
                KeyboardViewHolder keyboardViewHolder3 = this.m;
                keyboardViewHolder3.setPadding(keyboardViewHolder3.getPaddingLeft(), this.m.getPaddingTop(), this.m.getPaddingRight(), a2);
            }
            View view = this.r;
            if (view != null && view.getLayoutParams().height != a2) {
                ViewGroup.LayoutParams layoutParams = this.r.getLayoutParams();
                layoutParams.height = a2;
                this.r.setLayoutParams(layoutParams);
            }
            int min = Math.min(this.g.p().i(), a2);
            View view2 = this.s;
            if (view2 != null && view2.getLayoutParams().height != min) {
                ViewGroup.LayoutParams layoutParams2 = this.s.getLayoutParams();
                layoutParams2.height = min;
                this.s.setLayoutParams(layoutParams2);
            }
        }
        if (this.k != null && this.n != null) {
            A(this.n, u(), s());
        }
        if (this.k == null || (max = Math.max(0, x() - s())) == this.k.getPaddingBottom()) {
            return;
        }
        this.k.setPadding(0, 0, 0, max);
    }

    public final void o() {
        y(this.t);
        y(this.l);
        if (this.m != null) {
            int d = d();
            float r = r();
            ViewGroup.LayoutParams layoutParams = this.m.getLayoutParams();
            layoutParams.width = d;
            this.m.setLayoutParams(layoutParams);
            this.m.k(r);
            KeyboardHolder keyboardHolder = this.o;
            if (keyboardHolder != null) {
                ViewGroup.LayoutParams layoutParams2 = keyboardHolder.getLayoutParams();
                layoutParams2.width = d;
                this.o.setLayoutParams(layoutParams2);
                this.o.b = r;
            }
            View view = this.r;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                layoutParams3.width = v();
                this.r.setLayoutParams(layoutParams3);
            }
        }
        View view2 = this.n;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
            int d2 = (int) (d() * r());
            if (d2 != layoutParams4.width) {
                layoutParams4.width = d2;
                this.n.setLayoutParams(layoutParams4);
                this.n.forceLayout();
            }
        }
        View view3 = this.q;
        if (view3 != null) {
            ViewGroup.LayoutParams layoutParams5 = view3.getLayoutParams();
            int t = t();
            int d3 = ((int) (d() * r())) + t + t;
            if (d3 != layoutParams5.width) {
                layoutParams5.width = d3;
                this.q.setLayoutParams(layoutParams5);
            }
        }
        j();
    }

    public final void p() {
        this.u = this.g.p().q();
    }

    public final boolean q(String str, int i) {
        if (!this.h.ai(str) || this.h.D(str) != i) {
            this.h.h(str, i);
            return true;
        }
        return false;
    }
}
