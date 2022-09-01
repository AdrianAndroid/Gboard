package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: hus  reason: default package */
/* loaded from: classes.dex */
public final class hus {
    private final ObjectAnimator A;
    private final ObjectAnimator B;
    private boolean C;
    public final huq f;
    public final idk g;
    public View i;
    public View j;
    public View k;
    public View l;
    public View m;
    public View n;
    public imn p;
    public Rect q;
    public int r;
    public int s;
    private final ValueAnimator.AnimatorUpdateListener w;
    private final Animator.AnimatorListener x;
    private final View.OnLayoutChangeListener t = new dkr(this, 10);
    public final Runnable a = new hob(this, 19, (byte[]) null);
    private final View.OnTouchListener u = new bph(this, 11);
    public final Runnable b = new hob(this, 20, (char[]) null);
    private final hup v = new hup(this);
    private final Rect y = new Rect();
    public final Rect c = new Rect();
    public final Rect d = new Rect();
    private final int[] z = new int[2];
    public final List o = new ArrayList();
    public boolean h = false;
    public final Runnable e = new hob(this, 18);

    public hus(Context context, huq huqVar) {
        ieh j = ieh.j();
        op opVar = new op(this, 20);
        this.w = opVar;
        huo huoVar = new huo(this);
        this.x = huoVar;
        this.f = huqVar;
        this.q = new Rect(0, 0, gvv.f(context), gvv.d(context));
        this.g = j;
        this.r = jam.d(context);
        this.s = jbt.e(context, R.attr.f5820_resource_name_obfuscated_res_0x7f040179);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, "alpha", 0.0f, 1.0f);
        this.A = ofFloat;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object) null, "alpha", 1.0f, 0.0f);
        this.B = ofFloat2;
        ofFloat.setDuration(i());
        ofFloat2.setDuration(i());
        ofFloat.addUpdateListener(opVar);
        ofFloat2.addUpdateListener(opVar);
        ofFloat2.addListener(huoVar);
    }

    public static int a() {
        return jam.o() ? 3000 : 30000;
    }

    private static int i() {
        return jam.o() ? 500 : 0;
    }

    private final void j(View view, int i, int i2) {
        if (view == null) {
            return;
        }
        view.setOnTouchListener(new hur(this, i, i2));
        this.o.add(view);
    }

    public final void b() {
        ObjectAnimator objectAnimator = this.A;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.A.cancel();
        }
        ObjectAnimator objectAnimator2 = this.B;
        if (objectAnimator2 == null || !objectAnimator2.isRunning()) {
            return;
        }
        this.B.cancel();
    }

    public final void c() {
        b();
        View view = this.j;
        if (view != null) {
            view.setOnTouchListener(null);
            this.j.removeCallbacks(this.e);
        }
        this.j = null;
        this.m = null;
        this.n = null;
        View view2 = this.k;
        if (view2 != null) {
            view2.removeCallbacks(this.a);
            this.k.removeOnLayoutChangeListener(this.t);
        }
        this.k = null;
        this.o.clear();
    }

    public final void d() {
        Runnable runnable;
        if (!this.h) {
            return;
        }
        this.h = false;
        View view = this.j;
        if (view != null && (runnable = this.e) != null) {
            view.removeCallbacks(runnable);
        }
        ObjectAnimator objectAnimator = this.B;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        b();
        this.B.start();
    }

    public final void e() {
        this.h = false;
        View view = this.i;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.v);
            this.i = null;
        }
        imn imnVar = this.p;
        if (imnVar == null) {
            return;
        }
        View view2 = this.j;
        if (view2 != null) {
            imnVar.c(view2, null, true);
        }
        View view3 = this.m;
        if (view3 == null) {
            return;
        }
        this.p.c(view3, null, true);
    }

    public final void f() {
        if (!this.h) {
            return;
        }
        d();
        hva hvaVar = (hva) this.f;
        hvaVar.e.h(R.string.f151730_resource_name_obfuscated_res_0x7f140233);
        hvaVar.i();
    }

    public final void g(View view, huu huuVar) {
        imn imnVar;
        if (this.p == null || view == null) {
            return;
        }
        this.v.a = huuVar;
        this.q = huuVar.q();
        b();
        boolean z = huuVar.o;
        if (this.C != z) {
            this.C = z;
            c();
        }
        if (this.j == null && (imnVar = this.p) != null) {
            if (this.C) {
                this.j = imnVar.a(R.layout.f134750_resource_name_obfuscated_res_0x7f0e00bc);
            } else {
                this.j = imnVar.a(R.layout.f134740_resource_name_obfuscated_res_0x7f0e00bb);
                this.m = this.p.a(R.layout.f134770_resource_name_obfuscated_res_0x7f0e00be);
            }
            View view2 = this.j;
            if (view2 != null) {
                this.k = view2.findViewById(R.id.f59090_resource_name_obfuscated_res_0x7f0b04cc);
                this.l = this.j.findViewById(R.id.f59180_resource_name_obfuscated_res_0x7f0b04d5);
                View view3 = this.j;
                if (view3 != null) {
                    j(view3.findViewById(R.id.f59100_resource_name_obfuscated_res_0x7f0b04cd), 1, 1);
                    j(this.j.findViewById(R.id.f59110_resource_name_obfuscated_res_0x7f0b04ce), 1, 0);
                    j(this.j.findViewById(R.id.f59120_resource_name_obfuscated_res_0x7f0b04cf), 0, 1);
                    j(this.j.findViewById(R.id.f59130_resource_name_obfuscated_res_0x7f0b04d0), 0, 0);
                    this.j.setEnabled(true);
                    this.j.setOnTouchListener(this.u);
                }
                View view4 = this.k;
                if (view4 != null) {
                    view4.addOnLayoutChangeListener(this.t);
                }
            }
        }
        if (this.j == null) {
            return;
        }
        this.r = Math.min(huuVar.i, jam.d(huuVar.a));
        this.h = true;
        View view5 = this.i;
        if (view != view5) {
            this.i = view;
            if (view5 != null) {
                view5.removeOnLayoutChangeListener(this.v);
            }
            view.addOnLayoutChangeListener(this.v);
        }
        View view6 = this.m;
        if (view6 != null) {
            this.p.e(view6, view, 851, 0, -huuVar.l, null);
        }
        View view7 = this.j;
        if (view7 != null) {
            this.p.e(view7, view, 0, 0, 0, null);
            this.j.postDelayed(this.e, a());
            this.j.getLocationOnScreen(this.z);
        }
        if (this.C) {
            this.n = view.findViewById(R.id.f58170_resource_name_obfuscated_res_0x7f0b046b);
        }
        h(huuVar);
        if (this.A.isRunning()) {
            return;
        }
        b();
        this.A.start();
    }

    public final void h(huu huuVar) {
        View view;
        View view2 = this.i;
        if (view2 == null) {
            return;
        }
        jdy.j(view2, this.y);
        if (this.y.width() <= 0 || this.y.height() <= 0 || (view = this.k) == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        Rect rect = this.y;
        int width = rect.width();
        int i = huuVar.m;
        layoutParams.width = width + i + i;
        int height = rect.height();
        int i2 = huuVar.m;
        layoutParams.height = height + i2 + i2;
        this.k.setLayoutParams(layoutParams);
        int i3 = this.y.left - huuVar.m;
        int i4 = this.y.top - huuVar.m;
        View view3 = this.j;
        if (view3 != null) {
            view3.getLocationOnScreen(this.z);
        }
        this.k.setX(i3 - this.z[0]);
        this.k.setY(i4 - this.z[1]);
        this.k.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(this.q.width(), Integer.MIN_VALUE), 0, layoutParams.width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(this.q.height(), Integer.MIN_VALUE), 0, layoutParams.height));
        this.s = Math.min(this.s, this.y.width());
    }
}
