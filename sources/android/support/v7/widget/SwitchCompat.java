package android.support.v7.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    private static final Property c = new np(Float.class);
    private static final int[] d = {16842912};
    private float A;
    private VelocityTracker B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private boolean K;
    private final TextPaint L;
    private ColorStateList M;
    private Layout N;
    private Layout O;
    private TransformationMethod P;
    private final jh Q;
    private final Rect R;
    private bek S;
    public float a;
    ObjectAnimator b;
    private Drawable e;
    private ColorStateList f;
    private PorterDuff.Mode g;
    private boolean h;
    private boolean i;
    private Drawable j;
    private ColorStateList k;
    private PorterDuff.Mode l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private CharSequence s;
    private CharSequence t;
    private CharSequence u;
    private CharSequence v;
    private boolean w;
    private int x;
    private int y;
    private float z;

    public SwitchCompat(Context context) {
        this(context, null);
    }

    private final int g() {
        return (int) (((oi.b(this) ? 1.0f - this.a : this.a) * h()) + 0.5f);
    }

    private final int h() {
        Rect rect;
        Drawable drawable = this.j;
        if (drawable != null) {
            Rect rect2 = this.R;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.e;
            if (drawable2 != null) {
                rect = ke.b(drawable2);
            } else {
                rect = ke.a;
            }
            return ((((this.D - this.F) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    private final Layout i(CharSequence charSequence) {
        TextPaint textPaint = this.L;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private final CharSequence j(CharSequence charSequence) {
        bek m = m();
        TransformationMethod transformationMethod = this.P;
        Object obj = m.b;
        aen.b();
        return transformationMethod != null ? transformationMethod.getTransformation(charSequence, this) : charSequence;
    }

    private final void k() {
        if (!((aen) ((aqr) this.S.b).a).a.a) {
            return;
        }
        aef aefVar = aef.a;
    }

    private final boolean l() {
        return this.a > 0.5f;
    }

    private final bek m() {
        if (this.S == null) {
            this.S = new bek(this);
        }
        return this.S;
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.u;
            if (charSequence == null) {
                charSequence = getResources().getString(R.string.f147590_resource_name_obfuscated_res_0x7f14000f);
            }
            aad.X(this, charSequence);
        }
    }

    public final void b() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.s;
            if (charSequence == null) {
                charSequence = getResources().getString(R.string.f147600_resource_name_obfuscated_res_0x7f140010);
            }
            aad.X(this, charSequence);
        }
    }

    public final void c(Typeface typeface) {
        if ((this.L.getTypeface() == null || this.L.getTypeface().equals(typeface)) && (this.L.getTypeface() != null || typeface == null)) {
            return;
        }
        this.L.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.u = charSequence;
        this.v = j(charSequence);
        this.O = null;
        if (this.w) {
            k();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.R;
        int i3 = this.G;
        int i4 = this.H;
        int i5 = this.I;
        int i6 = this.J;
        int g = g() + i3;
        Drawable drawable = this.e;
        if (drawable != null) {
            rect = ke.b(drawable);
        } else {
            rect = ke.a;
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            g += rect2.left;
            if (rect != null) {
                if (rect.left > rect2.left) {
                    i3 += rect.left - rect2.left;
                }
                i = rect.top > rect2.top ? (rect.top - rect2.top) + i4 : i4;
                if (rect.right > rect2.right) {
                    i5 -= rect.right - rect2.right;
                }
                if (rect.bottom > rect2.bottom) {
                    i2 = i6 - (rect.bottom - rect2.bottom);
                    this.j.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.j.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.e;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i7 = g - rect2.left;
            int i8 = g + this.F + rect2.right;
            this.e.setBounds(i7, i4, i8, i6);
            Drawable background = getBackground();
            if (background != null) {
                wf.e(background, i7, i4, i8, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.e;
        if (drawable != null) {
            wf.d(drawable, f, f2);
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            wf.d(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.e;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public final void e(CharSequence charSequence) {
        this.s = charSequence;
        this.t = j(charSequence);
        this.N = null;
        if (this.w) {
            k();
        }
    }

    public final void f(float f) {
        this.a = f;
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingLeft() {
        if (!oi.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.D;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.q : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingRight() {
        if (oi.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.D;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.q : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return up.c(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.b;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.b.end();
        this.b = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, d);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.R;
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.H;
        int i2 = this.J;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.e;
        if (drawable != null) {
            if (!this.r || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect b = ke.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b.left;
                rect.right -= b.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = l() ? this.N : this.O;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.M;
            if (colorStateList != null) {
                this.L.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.L.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.s : this.u;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        int i9 = 0;
        if (this.e != null) {
            Rect rect = this.R;
            Drawable drawable = this.j;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b = ke.b(this.e);
            i5 = Math.max(0, b.left - rect.left);
            i9 = Math.max(0, b.right - rect.right);
        } else {
            i5 = 0;
        }
        if (oi.b(this)) {
            i6 = getPaddingLeft() + i5;
            width = ((this.D + i6) - i5) - i9;
        } else {
            width = (getWidth() - getPaddingRight()) - i9;
            i6 = (width - this.D) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = getPaddingTop();
            int height = getHeight();
            int paddingBottom = getPaddingBottom();
            int i10 = this.E;
            i7 = (((paddingTop + height) - paddingBottom) / 2) - (i10 / 2);
            i8 = i7 + i10;
        } else if (gravity == 80) {
            i8 = getHeight() - getPaddingBottom();
            i7 = i8 - this.E;
        } else {
            i7 = getPaddingTop();
            i8 = this.E + i7;
        }
        this.G = i6;
        this.H = i7;
        this.J = i8;
        this.I = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.w) {
            if (this.N == null) {
                this.N = i(this.t);
            }
            if (this.O == null) {
                this.O = i(this.v);
            }
        }
        Rect rect = this.R;
        Drawable drawable = this.e;
        int i7 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.e.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.e.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (this.w) {
            int max = Math.max(this.N.getWidth(), this.O.getWidth());
            int i8 = this.o;
            i5 = max + i8 + i8;
        } else {
            i5 = 0;
        }
        this.F = Math.max(i5, i3);
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 = this.j.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i9 = rect.left;
        int i10 = rect.right;
        Drawable drawable3 = this.e;
        if (drawable3 != null) {
            Rect b = ke.b(drawable3);
            i9 = Math.max(i9, b.left);
            i10 = Math.max(i10, b.right);
        }
        if (this.K) {
            int i11 = this.p;
            int i12 = this.F;
            i6 = Math.max(i11, i12 + i12 + i9 + i10);
        } else {
            i6 = this.p;
        }
        int max2 = Math.max(i7, i4);
        this.D = i6;
        this.E = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.s : this.u;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r0 != 3) goto L7;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        m();
        aen.b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            b();
        } else {
            a();
        }
        float f = 0.0f;
        if (getWindowToken() == null || !aad.ah(this)) {
            ObjectAnimator objectAnimator = this.b;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (true == isChecked) {
                f = 1.0f;
            }
            f(f);
            return;
        }
        if (true == isChecked) {
            f = 1.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, c, f);
        this.b = ofFloat;
        ofFloat.setDuration(250L);
        nq.a(this.b, true);
        this.b.start();
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(up.d(this, callback));
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        m();
        aen.b();
        super.setFilters(inputFilterArr);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.e || drawable == this.j;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f17450_resource_name_obfuscated_res_0x7f0406f4);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable drawable;
        Drawable drawable2;
        Typeface typeface;
        Typeface create;
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.k = null;
        this.l = null;
        this.m = false;
        this.n = false;
        this.B = VelocityTracker.obtain();
        boolean z = true;
        this.K = true;
        this.R = new Rect();
        nr.d(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.L = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        gkn w = gkn.w(context, attributeSet, ei.w, i, 0);
        aad.L(this, context, ei.w, attributeSet, (TypedArray) w.a, i, 0);
        Drawable n = w.n(2);
        this.e = n;
        if (n != null) {
            n.setCallback(this);
        }
        Drawable n2 = w.n(11);
        this.j = n2;
        if (n2 != null) {
            n2.setCallback(this);
        }
        e(w.p(0));
        d(w.p(1));
        this.w = w.s(3, true);
        this.o = w.h(8, 0);
        this.p = w.h(5, 0);
        this.q = w.h(6, 0);
        this.r = w.s(4, false);
        ColorStateList m = w.m(9);
        if (m != null) {
            this.f = m;
            this.h = true;
        }
        PorterDuff.Mode a = ke.a(w.i(10, -1), null);
        if (this.g != a) {
            this.g = a;
            this.i = true;
        }
        boolean z2 = this.h;
        if ((z2 || this.i) && (drawable = this.e) != null && (z2 || this.i)) {
            Drawable mutate = drawable.mutate();
            this.e = mutate;
            if (this.h) {
                wf.g(mutate, this.f);
            }
            if (this.i) {
                wf.h(this.e, this.g);
            }
            if (this.e.isStateful()) {
                this.e.setState(getDrawableState());
            }
        }
        ColorStateList m2 = w.m(12);
        if (m2 != null) {
            this.k = m2;
            this.m = true;
        }
        PorterDuff.Mode a2 = ke.a(w.i(13, -1), null);
        if (this.l != a2) {
            this.l = a2;
            this.n = true;
        }
        boolean z3 = this.m;
        if ((z3 || this.n) && (drawable2 = this.j) != null && (z3 || this.n)) {
            Drawable mutate2 = drawable2.mutate();
            this.j = mutate2;
            if (this.m) {
                wf.g(mutate2, this.k);
            }
            if (this.n) {
                wf.h(this.j, this.l);
            }
            if (this.j.isStateful()) {
                this.j.setState(getDrawableState());
            }
        }
        int l = w.l(7, 0);
        if (l != 0) {
            gkn u = gkn.u(context, l, ei.x);
            ColorStateList m3 = u.m(3);
            if (m3 != null) {
                this.M = m3;
            } else {
                this.M = getTextColors();
            }
            int h = u.h(0, 0);
            if (h != 0) {
                float f = h;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i2 = u.i(1, -1);
            int i3 = u.i(2, -1);
            if (i2 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i2 != 2) {
                typeface = i2 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            float f2 = 0.0f;
            if (i3 > 0) {
                if (typeface == null) {
                    create = Typeface.defaultFromStyle(i3);
                } else {
                    create = Typeface.create(typeface, i3);
                }
                c(create);
                int style = ((create != null ? create.getStyle() : 0) ^ (-1)) & i3;
                textPaint.setFakeBoldText(1 != (style & 1) ? false : z);
                textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : f2);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                c(typeface);
            }
            if (u.s(14, false)) {
                this.P = new fb(getContext());
            } else {
                this.P = null;
            }
            e(this.s);
            d(this.u);
            u.r();
        }
        jh jhVar = new jh(this);
        this.Q = jhVar;
        jhVar.g(attributeSet, i);
        w.r();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.y = viewConfiguration.getScaledTouchSlop();
        this.C = viewConfiguration.getScaledMinimumFlingVelocity();
        m().v(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
