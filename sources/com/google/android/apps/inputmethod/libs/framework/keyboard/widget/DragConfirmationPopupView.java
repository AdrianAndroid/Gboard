package com.google.android.apps.inputmethod.libs.framework.keyboard.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DragConfirmationPopupView extends FrameLayout implements ilv {
    private boolean A;
    private Animator B;
    private Animator C;
    private AccelerateInterpolator D;
    private DecelerateInterpolator E;
    public int a;
    public ImageView b;
    public deo d;
    public boolean e;
    public AnimatorSet f;
    ValueAnimator g;
    ValueAnimator h;
    ValueAnimator i;
    ValueAnimator j;
    ValueAnimator k;
    ValueAnimator l;
    ValueAnimator m;
    private int n;
    private int o;
    private ColorFilter p;
    private View q;
    private AppCompatTextView r;
    private ColorDrawable s;
    private ViewOverlay t;
    private final gqa u;
    private String v;
    private String w;
    private String x;
    private String y;
    private iay z;
    public final den c = den.a();
    private final Animator.AnimatorListener F = new dem(this);
    private final ValueAnimator.AnimatorUpdateListener G = new op(this, 9);
    private final ValueAnimator.AnimatorUpdateListener H = new op(this, 10);
    private final ValueAnimator.AnimatorUpdateListener I = new op(this, 11);
    private final ValueAnimator.AnimatorUpdateListener J = new op(this, 12);

    public DragConfirmationPopupView(Context context) {
        super(context);
        this.u = gqa.a(context);
        x(context);
    }

    private final int o(int i) {
        return (int) gwc.a(getContext(), i);
    }

    private final ValueAnimator p(float f) {
        this.g.cancel();
        this.g.setFloatValues(getAlpha(), f);
        return this.g;
    }

    private final ValueAnimator q(float f) {
        this.k.cancel();
        this.k.setFloatValues(this.d.d, f);
        return this.k;
    }

    private final ValueAnimator r(float f) {
        this.l.cancel();
        this.l.setFloatValues(this.d.e, f);
        return this.l;
    }

    private final ValueAnimator s(float f) {
        this.m.cancel();
        this.m.setFloatValues(this.d.f, f);
        return this.m;
    }

    private final ValueAnimator t(float f) {
        this.h.cancel();
        this.h.setFloatValues(this.b.getScaleX(), f);
        return this.h;
    }

    private static Rect u(View view) {
        Rect rect = new Rect();
        jdy.i(view, null, rect);
        return rect;
    }

    private final iay v() {
        if (this.e) {
            return this.z;
        }
        return null;
    }

    private final String w() {
        return this.e ? this.v : this.x;
    }

    private final void x(Context context) {
        int color = context.getResources().getColor(R.color.f21260_resource_name_obfuscated_res_0x7f0600c8);
        this.o = color;
        this.s = new ColorDrawable(color);
    }

    private final void y(boolean z) {
        if (this.e == z) {
            return;
        }
        this.e = z;
        z();
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        boolean z2 = this.e;
        float f = true != z2 ? 0.0f : 0.8f;
        float f2 = true != z2 ? 1.0f : 1.2f;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f = animatorSet2;
        animatorSet2.playTogether(t(f2), q(f));
        this.f.setInterpolator(this.E);
        this.f.start();
        this.u.k(w());
    }

    private final void z() {
        if (this.e) {
            this.c.setColorFilter(this.p);
        } else {
            this.c.setColorFilter(null);
        }
    }

    @Override // defpackage.ilv
    public final iay a(float f, float f2, boolean z) {
        this.d.c(f, f2);
        y(this.d.d());
        this.c.setBounds(this.d.a());
        if (z) {
            this.u.k(this.e ? this.w : this.y);
        }
        return v();
    }

    @Override // defpackage.ilv
    public final iay b(SoftKeyboardView softKeyboardView, View view, float f, float f2, ial ialVar, int[] iArr, boolean z) {
        int i;
        c();
        this.A = false;
        setAlpha(0.0f);
        this.z = ialVar.d();
        iay d = ialVar.d();
        if (d.c == -10031) {
            hln hlnVar = (hln) d.e;
            this.v = getContext().getString(R.string.f147540_resource_name_obfuscated_res_0x7f140003, hlnVar.a);
            this.w = getContext().getString(R.string.f147550_resource_name_obfuscated_res_0x7f140004);
            this.x = getContext().getString(R.string.f147520_resource_name_obfuscated_res_0x7f140001, hlnVar.a);
            this.y = getContext().getString(R.string.f147530_resource_name_obfuscated_res_0x7f140002);
        } else {
            String e = ialVar.e(0);
            this.v = e;
            this.w = e;
            String string = getContext().getString(17039360);
            this.x = string;
            this.y = string;
        }
        this.r.setText(ialVar.e(0));
        this.b.setImageResource(ialVar.b(0));
        this.b.setImageTintList(ColorStateList.valueOf(-1));
        Rect u = u(view);
        iArr[2] = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Context context = getContext();
        layoutParams.width = gvv.f(context);
        layoutParams.height = gvv.d(context);
        setLayoutParams(getLayoutParams());
        ViewGroup.LayoutParams layoutParams2 = this.q.getLayoutParams();
        layoutParams2.height = u.top;
        this.q.setLayoutParams(layoutParams2);
        this.d.b(u, u(this.b), f, f2);
        this.s.setAlpha(255);
        this.s.setColor(this.o);
        this.s.setBounds(u);
        this.t.add(this.s);
        View view2 = view;
        while (true) {
            if (view2 == null) {
                i = 0;
                break;
            }
            Drawable background = view2.getBackground();
            if (!(background instanceof ColorDrawable)) {
                ViewParent parent = view2.getParent();
                view2 = parent instanceof View ? (View) parent : null;
            } else {
                i = ((ColorDrawable) background).getColor();
                break;
            }
        }
        this.a = i;
        den denVar = this.c;
        Resources resources = getResources();
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Drawable background2 = view.getBackground();
        if (background2 != null) {
            background2.setAlpha(0);
        }
        View findViewById = view.findViewById(R.id.f52790_resource_name_obfuscated_res_0x7f0b00d0);
        if (findViewById != null) {
            findViewById.setAlpha(0.0f);
        }
        view.draw(canvas);
        if (background2 != null) {
            background2.setAlpha(255);
        }
        if (findViewById != null) {
            findViewById.setAlpha(1.0f);
        }
        denVar.setDrawableByLayerId(1, new BitmapDrawable(resources, createBitmap));
        denVar.invalidateSelf();
        this.c.setAlpha(255);
        this.c.b(this.n);
        this.c.setBounds(this.d.a());
        this.t.add(this.c);
        this.e = false;
        z();
        y(this.d.d());
        this.u.i(w());
        return v();
    }

    public final void c() {
        if (hjg.r()) {
            if (this.A) {
                return;
            }
            this.A = true;
            Animator animator = this.B;
            if (animator != null && animator.isStarted()) {
                this.B.cancel();
            }
            this.B = null;
            AnimatorSet animatorSet = this.f;
            if (animatorSet != null && animatorSet.isStarted()) {
                this.f.cancel();
            }
            this.f = null;
            Animator animator2 = this.C;
            if (animator2 != null && animator2.isStarted()) {
                this.C.cancel();
            }
            this.C = null;
            ViewOverlay viewOverlay = this.t;
            if (viewOverlay != null) {
                viewOverlay.remove(this.c);
                this.t.remove(this.s);
            }
            this.z = null;
            return;
        }
        throw new IllegalStateException("expect UI thread");
    }

    @Override // defpackage.ilv
    public final void d(int i) {
    }

    @Override // defpackage.ilv
    public final void e() {
    }

    @Override // defpackage.ilv
    public final void f(View.OnClickListener onClickListener) {
    }

    @Override // defpackage.ilv
    public final boolean g() {
        return true;
    }

    @Override // defpackage.ilv
    public final boolean h() {
        return false;
    }

    @Override // defpackage.ilv
    public final boolean i() {
        return false;
    }

    @Override // defpackage.ilv
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // defpackage.ilv
    public final void k() {
    }

    @Override // defpackage.ilv
    public final /* synthetic */ void l() {
    }

    @Override // defpackage.ilv
    public final Animator m(hek hekVar) {
        Animator animator = this.C;
        if (animator != null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.e) {
            this.i.cancel();
            this.i.setIntValues(this.s.getAlpha(), 0);
            this.j.cancel();
            this.j.setIntValues(this.c.getAlpha(), 0);
            animatorSet.playTogether(p(0.0f), this.i, q(1.0f), this.j, s(0.0f), t(1.0f));
            animatorSet.setInterpolator(this.D);
        } else {
            animatorSet.playTogether(p(0.0f), s(1.0f), r(1.0f), t(1.0f));
            animatorSet.setInterpolator(this.E);
        }
        animatorSet.addListener(this.F);
        this.C = animatorSet;
        return animatorSet;
    }

    @Override // defpackage.ilv
    public final Animator n(hek hekVar, boolean z) {
        Animator animator = this.B;
        if (animator != null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(p(1.0f), r(0.0f), s(1.1f));
        animatorSet.setInterpolator(this.E);
        this.B = animatorSet;
        return animatorSet;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        ColorStateList a;
        super.onFinishInflate();
        this.t = getRootView().getOverlay();
        this.q = findViewById(R.id.f54010_resource_name_obfuscated_res_0x7f0b0173);
        this.r = (AppCompatTextView) findViewById(R.id.f54020_resource_name_obfuscated_res_0x7f0b0174);
        this.b = (ImageView) findViewById(R.id.f54030_resource_name_obfuscated_res_0x7f0b0175);
        int integer = getResources().getInteger(17694720);
        int i = integer / 2;
        this.D = new AccelerateInterpolator();
        this.E = new DecelerateInterpolator();
        Context context = getContext();
        int[] iArr = {16842919};
        int color = context.getResources().getColor(R.color.f27200_resource_name_obfuscated_res_0x7f06052f);
        LayoutInflater from = LayoutInflater.from(context);
        if ((from instanceof gyz) && (a = ((gyz) from).a(R.color.f27200_resource_name_obfuscated_res_0x7f06052f)) != null) {
            color = a.getColorForState(iArr, color);
        }
        this.n = color;
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        ColorMatrix colorMatrix2 = new ColorMatrix();
        colorMatrix2.setScale(1.0f, 1.0f, 1.0f, 1.0f);
        colorMatrix2.preConcat(colorMatrix);
        this.p = new ColorMatrixColorFilter(colorMatrix2);
        this.d = new deo(o(32), o(64));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 0.0f);
        this.g = ofFloat;
        long j = integer;
        ofFloat.setDuration(j);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 0.0f);
        this.h = ofFloat2;
        ofFloat2.addUpdateListener(this.J);
        this.h.setDuration(j);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.s, "alpha", 0, 0);
        this.i = ofInt;
        ofInt.setDuration(j);
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(this.c, "alpha", 0, 0);
        this.j = ofInt2;
        ofInt2.setDuration(j);
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 0.0f);
        this.k = ofFloat3;
        ofFloat3.addUpdateListener(this.I);
        this.k.setDuration(j);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.0f, 0.0f);
        this.l = ofFloat4;
        ofFloat4.addUpdateListener(this.H);
        long j2 = i;
        this.l.setDuration(j2);
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 0.0f);
        this.m = ofFloat5;
        ofFloat5.addUpdateListener(this.G);
        this.m.setDuration(j2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.r.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = this.r.getMeasuredHeight();
        super.onLayout(z, i, i2, i3, i4);
        if (measuredHeight <= this.r.getHeight()) {
            this.r.setVisibility(0);
        } else {
            this.r.setVisibility(4);
        }
        Rect u = u(this.b);
        if (!this.d.a().equals(u)) {
            deo deoVar = this.d;
            deoVar.b(deoVar.a, u, deoVar.b, deoVar.c);
            this.c.setBounds(this.d.a());
        }
    }

    public DragConfirmationPopupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.u = gqa.a(context);
        x(context);
    }

    public DragConfirmationPopupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.u = gqa.a(context);
        x(context);
    }

    public DragConfirmationPopupView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.u = gqa.a(context);
        x(context);
    }
}
