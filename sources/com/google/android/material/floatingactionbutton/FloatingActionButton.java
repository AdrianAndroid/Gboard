package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.inputmethod.latin.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FloatingActionButton extends kvk implements ktx, kxu, to {
    public int a;
    public boolean b;
    public final Rect c;
    private ColorStateList e;
    private PorterDuff.Mode f;
    private ColorStateList g;
    private int h;
    private int i;
    private int j;
    private int k;
    private final Rect l;
    private kup m;
    private final kyi n;
    private final ohq o;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class BaseBehavior extends tp {
        private Rect a;
        private boolean b;

        public BaseBehavior() {
            this.b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kut.c);
            this.b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        private static boolean t(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof tr) {
                return ((tr) layoutParams).a instanceof BottomSheetBehavior;
            }
            return false;
        }

        private final boolean u(View view, FloatingActionButton floatingActionButton) {
            return this.b && ((tr) floatingActionButton.getLayoutParams()).f == view.getId() && floatingActionButton.d == 0;
        }

        private final boolean v(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!u(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            kuy.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.d()) {
                floatingActionButton.d();
                return true;
            }
            floatingActionButton.f();
            return true;
        }

        private final boolean w(View view, FloatingActionButton floatingActionButton) {
            if (!u(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((tr) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.d();
                return true;
            }
            floatingActionButton.f();
            return true;
        }

        @Override // defpackage.tp
        public final void a(tr trVar) {
            if (trVar.h == 0) {
                trVar.h = 80;
            }
        }

        @Override // defpackage.tp
        public final /* bridge */ /* synthetic */ boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                v(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
                return false;
            } else if (!t(view2)) {
                return false;
            } else {
                w(view2, floatingActionButton);
                return false;
            }
        }

        @Override // defpackage.tp
        public final /* bridge */ /* synthetic */ boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
            int i2;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List b = coordinatorLayout.b(floatingActionButton);
            int size = b.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) b.get(i4);
                if (view2 instanceof AppBarLayout) {
                    if (v(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (t(view2) && w(view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.l(floatingActionButton, i);
            Rect rect = floatingActionButton.c;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            tr trVar = (tr) floatingActionButton.getLayoutParams();
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - trVar.rightMargin) {
                i2 = rect.right;
            } else {
                i2 = floatingActionButton.getLeft() <= trVar.leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - trVar.bottomMargin) {
                i3 = rect.bottom;
            } else if (floatingActionButton.getTop() <= trVar.topMargin) {
                i3 = -rect.top;
            }
            if (i3 != 0) {
                aad.F(floatingActionButton, i3);
            }
            if (i2 == 0) {
                return true;
            }
            aad.E(floatingActionButton, i2);
            return true;
        }

        @Override // defpackage.tp
        public final /* bridge */ /* synthetic */ boolean r(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.c;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class Behavior extends BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void c(FloatingActionButton floatingActionButton, Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    private final int h(int i) {
        int i2 = this.j;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i == 1) {
                return resources.getDimensionPixelSize(R.dimen.f33220_resource_name_obfuscated_res_0x7f070121);
            }
            return resources.getDimensionPixelSize(R.dimen.f33230_resource_name_obfuscated_res_0x7f070122);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return h(1);
        } else {
            return h(0);
        }
    }

    private static int i(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return i;
            }
            if (mode != 1073741824) {
                throw new IllegalArgumentException();
            }
            return size;
        }
        return Math.min(i, size);
    }

    private final kup j() {
        if (this.m == null) {
            this.m = new kur(this, new opu(this), null, null, null);
        }
        return this.m;
    }

    @Override // defpackage.to
    public final tp a() {
        return new Behavior();
    }

    public final int b() {
        return h(this.i);
    }

    final void d() {
        kup j = j();
        if (j.B.getVisibility() == 0) {
            if (j.A == 1) {
                return;
            }
        } else if (j.A != 2) {
            return;
        }
        Animator animator = j.v;
        if (animator != null) {
            animator.cancel();
        }
        if (!j.m()) {
            j.B.g(4, false);
            return;
        }
        krw krwVar = j.x;
        AnimatorSet b = krwVar != null ? j.b(krwVar, 0.0f, 0.0f, 0.0f) : j.c(0.0f, 0.4f, 0.4f, kup.d, kup.e);
        b.addListener(new kuf(j));
        b.start();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        j();
        getDrawableState();
    }

    final void f() {
        kup j = j();
        if (j.B.getVisibility() != 0) {
            if (j.A == 2) {
                return;
            }
        } else if (j.A != 1) {
            return;
        }
        Animator animator = j.v;
        if (animator != null) {
            animator.cancel();
        }
        krw krwVar = j.w;
        if (!j.m()) {
            j.B.g(0, false);
            j.B.setAlpha(1.0f);
            j.B.setScaleY(1.0f);
            j.B.setScaleX(1.0f);
            j.g(1.0f);
            return;
        }
        if (j.B.getVisibility() != 0) {
            float f = 0.0f;
            j.B.setAlpha(0.0f);
            FloatingActionButton floatingActionButton = j.B;
            if (krwVar == null) {
                f = 0.4f;
            }
            floatingActionButton.setScaleY(f);
            j.B.setScaleX(f);
            j.g(f);
        }
        krw krwVar2 = j.w;
        AnimatorSet b = krwVar2 != null ? j.b(krwVar2, 1.0f, 1.0f, 1.0f) : j.c(1.0f, 1.0f, 1.0f, kup.b, kup.c);
        b.addListener(new kug(j));
        b.start();
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        return this.e;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        return this.f;
    }

    @Override // defpackage.kxu
    public final void ic(kxj kxjVar) {
        j().h(kxjVar);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        j();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kup j = j();
        kxe kxeVar = j.m;
        if (kxeVar != null) {
            laq.j(j.B, kxeVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kup j = j();
        j.B.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = j.C;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int b = b();
        this.a = (b - this.k) / 2;
        j().j();
        int min = Math.min(i(b, i), i(b, i2));
        setMeasuredDimension(this.c.left + min + this.c.right, min + this.c.top + this.c.bottom);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof kyk)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        kyk kykVar = (kyk) parcelable;
        super.onRestoreInstanceState(kykVar.d);
        kyi kyiVar = this.n;
        Bundle bundle = (Bundle) kykVar.a.get("expandableWidgetHelper");
        nq.g(bundle);
        kyiVar.b = bundle.getBoolean("expanded", false);
        kyiVar.a = bundle.getInt("expandedComponentIdHint", 0);
        if (!kyiVar.b) {
            return;
        }
        ViewParent parent = ((View) kyiVar.c).getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        ((CoordinatorLayout) parent).i((View) kyiVar.c);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        kyk kykVar = new kyk(onSaveInstanceState);
        qv qvVar = kykVar.a;
        kyi kyiVar = this.n;
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", kyiVar.b);
        bundle.putInt("expandedComponentIdHint", kyiVar.a);
        qvVar.put("expandableWidgetHelper", bundle);
        return kykVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.l;
            if (aad.ah(this)) {
                rect.set(0, 0, getWidth(), getHeight());
                rect.left += this.c.left;
                rect.top += this.c.top;
                rect.right -= this.c.right;
                rect.bottom -= this.c.bottom;
                if (!this.l.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            kup j = j();
            kxe kxeVar = j.m;
            if (kxeVar != null) {
                kxeVar.setTintList(colorStateList);
            }
            ktz ktzVar = j.o;
            if (ktzVar == null) {
                return;
            }
            ktzVar.b(colorStateList);
        }
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            kxe kxeVar = j().m;
            if (kxeVar == null) {
                return;
            }
            kxeVar.setTintMode(mode);
        }
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        j().k(f);
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            j().i();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        this.o.l(i);
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        drawable.clearColorFilter();
    }

    @Override // android.view.View
    public final void setScaleX(float f) {
        super.setScaleX(f);
        j();
    }

    @Override // android.view.View
    public final void setScaleY(float f) {
        super.setScaleY(f);
        j();
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        super.setTranslationX(f);
        j();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        j();
    }

    @Override // android.view.View
    public final void setTranslationZ(float f) {
        super.setTranslationZ(f);
        j();
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f11940_resource_name_obfuscated_res_0x7f04043b);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(kzb.a(context, attributeSet, i, R.style.f203960_resource_name_obfuscated_res_0x7f150844), attributeSet, i);
        boolean z;
        Drawable drawable;
        Drawable drawable2;
        this.c = new Rect();
        this.l = new Rect();
        Context context2 = getContext();
        TypedArray a = kve.a(context2, attributeSet, kut.b, i, R.style.f203960_resource_name_obfuscated_res_0x7f150844, new int[0]);
        this.e = kws.b(context2, a, 1);
        this.f = kvj.b(a.getInt(2, -1), null);
        this.g = kws.b(context2, a, 12);
        this.i = a.getInt(7, -1);
        this.j = a.getDimensionPixelSize(6, 0);
        this.h = a.getDimensionPixelSize(3, 0);
        float dimension = a.getDimension(4, 0.0f);
        float dimension2 = a.getDimension(9, 0.0f);
        float dimension3 = a.getDimension(11, 0.0f);
        this.b = a.getBoolean(16, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f40410_resource_name_obfuscated_res_0x7f070519);
        int dimensionPixelSize2 = a.getDimensionPixelSize(10, 0);
        this.k = dimensionPixelSize2;
        kup j = j();
        if (j.z != dimensionPixelSize2) {
            j.z = dimensionPixelSize2;
            j.i();
        }
        krw a2 = krw.a(context2, a, 15);
        krw a3 = krw.a(context2, a, 8);
        kxj a4 = kxj.b(context2, attributeSet, i, R.style.f203960_resource_name_obfuscated_res_0x7f150844, kxj.a).a();
        boolean z2 = a.getBoolean(5, false);
        setEnabled(a.getBoolean(0, true));
        a.recycle();
        ohq ohqVar = new ohq(this);
        this.o = ohqVar;
        ohqVar.j(attributeSet, i);
        this.n = new kyi(this);
        j().h(a4);
        kup j2 = j();
        ColorStateList colorStateList = this.e;
        PorterDuff.Mode mode = this.f;
        ColorStateList colorStateList2 = this.g;
        int i2 = this.h;
        kur kurVar = (kur) j2;
        kxj kxjVar = kurVar.l;
        nq.g(kxjVar);
        kurVar.m = new kuq(kxjVar);
        kurVar.m.setTintList(colorStateList);
        if (mode != null) {
            kurVar.m.setTintMode(mode);
        }
        kurVar.m.j(kurVar.B.getContext());
        if (i2 > 0) {
            Context context3 = kurVar.B.getContext();
            kxj kxjVar2 = kurVar.l;
            nq.g(kxjVar2);
            ktz ktzVar = new ktz(kxjVar2);
            int a5 = us.a(context3, R.color.f21760_resource_name_obfuscated_res_0x7f060115);
            int a6 = us.a(context3, R.color.f21750_resource_name_obfuscated_res_0x7f060114);
            int a7 = us.a(context3, R.color.f21730_resource_name_obfuscated_res_0x7f060112);
            z = z2;
            int a8 = us.a(context3, R.color.f21740_resource_name_obfuscated_res_0x7f060113);
            ktzVar.c = a5;
            ktzVar.d = a6;
            ktzVar.e = a7;
            ktzVar.f = a8;
            float f = i2;
            if (ktzVar.b != f) {
                ktzVar.b = f;
                ktzVar.a.setStrokeWidth(f * 1.3333f);
                ktzVar.g = true;
                ktzVar.invalidateSelf();
            }
            ktzVar.b(colorStateList);
            kurVar.o = ktzVar;
            ktz ktzVar2 = kurVar.o;
            nq.g(ktzVar2);
            kxe kxeVar = kurVar.m;
            nq.g(kxeVar);
            drawable2 = new LayerDrawable(new Drawable[]{ktzVar2, kxeVar});
            drawable = null;
        } else {
            z = z2;
            drawable = null;
            kurVar.o = null;
            drawable2 = kurVar.m;
        }
        kurVar.n = new RippleDrawable(kww.b(colorStateList2), drawable2, drawable);
        kurVar.p = kurVar.n;
        j().u = dimensionPixelSize;
        kup j3 = j();
        if (j3.r != dimension) {
            j3.r = dimension;
            j3.f(dimension, j3.s, j3.t);
        }
        kup j4 = j();
        if (j4.s != dimension2) {
            j4.s = dimension2;
            j4.f(j4.r, dimension2, j4.t);
        }
        kup j5 = j();
        if (j5.t != dimension3) {
            j5.t = dimension3;
            j5.f(j5.r, j5.s, dimension3);
        }
        j().w = a2;
        j().x = a3;
        j().q = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
