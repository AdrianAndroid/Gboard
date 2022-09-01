package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.keyboardmode.MultiTouchDelegateView;

/* compiled from: PG */
/* renamed from: hwg  reason: default package */
/* loaded from: classes.dex */
public final class hwg {
    private static final hwe J = new hwb();
    public int A;
    public final idk B;
    private final Context L;
    public View a;
    public View c;
    public MultiTouchDelegateView f;
    public int g;
    public View h;
    public View i;
    public View j;
    public View k;
    public View l;
    public View m;
    public View n;
    public View o;
    public View p;
    public View q;
    public View r;
    public View s;
    public View t;
    public imn u;
    public Rect v;
    public int x;
    public int y;
    public int z;
    public final int[] d = new int[2];
    public final Rect e = new Rect();
    private final Rect K = new Rect();
    public final View.OnLayoutChangeListener C = new dkr(this, 11);
    public final Runnable D = new hvg(this, 8);
    public final View.OnTouchListener E = new bph(this, 13);
    public final View.OnTouchListener F = new hwc(this);
    public final View.OnLayoutChangeListener G = new dkr(this, 12);
    public final Runnable H = new hvg(this, 9);
    public final int[] I = new int[2];
    public boolean b = false;
    public hwe w = J;

    public hwg(Context context) {
        ieh j = ieh.j();
        this.L = context;
        this.B = j;
        this.v = new Rect(0, 0, gvv.f(context), gvv.d(context));
    }

    public static void f(View view, MultiTouchDelegateView multiTouchDelegateView) {
        if (view == null) {
            return;
        }
        Rect rect = new Rect();
        jdy.i(view, multiTouchDelegateView, rect);
        rect.left -= 100;
        rect.top -= 100;
        rect.right += 100;
        rect.bottom += 100;
        multiTouchDelegateView.a.add(new TouchDelegate(rect, view));
    }

    public static void g(View view, boolean z) {
        if (view != null) {
            view.setActivated(z);
        }
    }

    public final int a() {
        return this.v.bottom;
    }

    public final int b(int i) {
        return i - this.d[0];
    }

    public final int c(int i) {
        return i - this.d[1];
    }

    public final void d() {
        this.b = false;
        View view = this.a;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.G);
            this.a.removeCallbacks(this.H);
            this.a = null;
        }
        imn imnVar = this.u;
        if (imnVar == null) {
            return;
        }
        imnVar.c(this.c, null, true);
    }

    public final void e() {
        d();
        this.w.a();
    }

    public final void h(boolean z) {
        g(this.n, z);
        g(this.p, z);
        g(this.o, z);
        g(this.q, z);
        g(this.k, z);
        g(this.m, z);
        g(this.j, z);
        g(this.l, z);
    }

    public final void i() {
        View view = this.a;
        if (view == null) {
            return;
        }
        jdy.j(view, this.K);
        View view2 = this.i;
        if (view2 == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
        Rect rect = this.K;
        layoutParams.width = rect.width();
        layoutParams.height = rect.height();
        this.i.setLayoutParams(layoutParams);
        this.i.setScaleX(1.0f);
        this.i.setScaleY(1.0f);
        this.i.setX(b(this.K.left));
        this.i.setY(c(this.K.top));
        if (this.x == 0) {
            float f = layoutParams.height / layoutParams.width;
            int width = this.v.width() - this.L.getResources().getDimensionPixelSize(R.dimen.f41380_resource_name_obfuscated_res_0x7f0705cc);
            this.x = width;
            this.y = Math.round(width * f);
            int e = jbt.e(this.L, R.attr.f5820_resource_name_obfuscated_res_0x7f040179);
            this.z = e;
            int min = Math.min(e, layoutParams.width);
            this.z = min;
            this.A = Math.round(min * f);
        }
        int i = this.K.top;
        MultiTouchDelegateView multiTouchDelegateView = this.f;
        if (multiTouchDelegateView == null) {
            return;
        }
        int c = c(i);
        this.g = c;
        multiTouchDelegateView.setY(c);
    }
}
