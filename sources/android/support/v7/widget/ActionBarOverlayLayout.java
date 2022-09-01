package android.support.v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements js, yv, yw {
    static final int[] a = {R.attr.f7350_resource_name_obfuscated_res_0x7f040215, 16842841};
    private final Runnable A;
    private final yx B;
    public int b;
    public ActionBarContainer c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public hm h;
    public ViewPropertyAnimator i;
    public final AnimatorListenerAdapter j;
    private int k;
    private ContentFrameLayout l;
    private jt m;
    private Drawable n;
    private boolean o;
    private boolean p;
    private int q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private abc u;
    private abc v;
    private abc w;
    private abc x;
    private OverScroller y;
    private final Runnable z;

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    private final void v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(a);
        boolean z = false;
        this.k = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.n = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.o = z;
        this.y = new OverScroller(context);
    }

    private static final boolean w(View view, Rect rect, boolean z) {
        boolean z2;
        hn hnVar = (hn) view.getLayoutParams();
        if (hnVar.leftMargin != rect.left) {
            hnVar.leftMargin = rect.left;
            z2 = true;
        } else {
            z2 = false;
        }
        if (hnVar.topMargin != rect.top) {
            hnVar.topMargin = rect.top;
            z2 = true;
        }
        if (hnVar.rightMargin != rect.right) {
            hnVar.rightMargin = rect.right;
            z2 = true;
        }
        if (!z || hnVar.bottomMargin == rect.bottom) {
            return z2;
        }
        hnVar.bottomMargin = rect.bottom;
        return true;
    }

    @Override // defpackage.js
    public final void a() {
        i();
        this.m.d();
    }

    public final void b() {
        removeCallbacks(this.z);
        removeCallbacks(this.A);
        ViewPropertyAnimator viewPropertyAnimator = this.i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // defpackage.js
    public final void c(int i) {
        i();
        if (i == 2) {
            this.m.f();
        } else if (i == 5) {
            this.m.e();
        } else if (i != 109) {
        } else {
            boolean z = true;
            this.d = true;
            if (getContext().getApplicationInfo().targetSdkVersion >= 19) {
                z = false;
            }
            this.o = z;
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof hn;
    }

    @Override // defpackage.yv
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.n == null || this.o) {
            return;
        }
        int bottom = this.c.getVisibility() == 0 ? (int) (this.c.getBottom() + this.c.getTranslationY() + 0.5f) : 0;
        this.n.setBounds(0, bottom, getWidth(), this.n.getIntrinsicHeight() + bottom);
        this.n.draw(canvas);
    }

    @Override // defpackage.yv
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.yw
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        e(view, i, i2, i3, i4, i5);
    }

    @Override // defpackage.yv
    public final void g(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new hn();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new hn(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.B.a();
    }

    @Override // defpackage.yv
    public final void h(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    final void i() {
        jt f;
        if (this.l == null) {
            this.l = (ContentFrameLayout) findViewById(R.id.f52060_resource_name_obfuscated_res_0x7f0b0049);
            this.c = (ActionBarContainer) findViewById(R.id.f52070_resource_name_obfuscated_res_0x7f0b004a);
            View findViewById = findViewById(R.id.f52050_resource_name_obfuscated_res_0x7f0b0048);
            if (findViewById instanceof jt) {
                f = (jt) findViewById;
            } else if (findViewById instanceof Toolbar) {
                f = ((Toolbar) findViewById).f();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(String.valueOf(findViewById.getClass().getSimpleName())));
            }
            this.m = f;
        }
    }

    public final void j(int i) {
        b();
        this.c.setTranslationY(-Math.max(0, Math.min(i, this.c.getHeight())));
    }

    public final void k(boolean z) {
        if (z != this.p) {
            this.p = z;
            if (z) {
                return;
            }
            b();
            j(0);
        }
    }

    @Override // defpackage.js
    public final void l(Menu menu, gy gyVar) {
        i();
        this.m.i(menu, gyVar);
    }

    @Override // defpackage.js
    public final void m() {
        i();
        this.m.j();
    }

    @Override // defpackage.js
    public final void n(Window.Callback callback) {
        i();
        this.m.m(callback);
    }

    @Override // defpackage.js
    public final void o(CharSequence charSequence) {
        i();
        this.m.n(charSequence);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
        if (r0 != false) goto L7;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r6) {
        /*
            r5 = this;
            r5.i()
            abc r6 = defpackage.abc.n(r6, r5)
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = r6.b()
            int r2 = r6.d()
            int r3 = r6.c()
            int r4 = r6.a()
            r0.<init>(r1, r2, r3, r4)
            android.support.v7.widget.ActionBarContainer r1 = r5.c
            r2 = 0
            boolean r0 = w(r1, r0, r2)
            android.graphics.Rect r1 = r5.r
            defpackage.aad.al(r5, r6, r1)
            android.graphics.Rect r1 = r5.r
            int r1 = r1.left
            android.graphics.Rect r2 = r5.r
            int r2 = r2.top
            android.graphics.Rect r3 = r5.r
            int r3 = r3.right
            android.graphics.Rect r4 = r5.r
            int r4 = r4.bottom
            abc r1 = r6.l(r1, r2, r3, r4)
            r5.u = r1
            abc r2 = r5.v
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L4b
            abc r0 = r5.u
            r5.v = r0
            r0 = 1
        L4b:
            android.graphics.Rect r1 = r5.s
            android.graphics.Rect r2 = r5.r
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L5d
            android.graphics.Rect r0 = r5.s
            android.graphics.Rect r1 = r5.r
            r0.set(r1)
            goto L5f
        L5d:
            if (r0 == 0) goto L62
        L5f:
            r5.requestLayout()
        L62:
            abc r6 = r6.i()
            abc r6 = r6.k()
            abc r6 = r6.j()
            android.view.WindowInsets r6 = r6.e()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarOverlayLayout.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        aad.K(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                hn hnVar = (hn) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = hnVar.leftMargin + paddingLeft;
                int i7 = hnVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredHeight;
        aau aarVar;
        i();
        measureChildWithMargins(this.c, i, 0, i2, 0);
        hn hnVar = (hn) this.c.getLayoutParams();
        int max = Math.max(0, this.c.getMeasuredWidth() + hnVar.leftMargin + hnVar.rightMargin);
        int max2 = Math.max(0, this.c.getMeasuredHeight() + hnVar.topMargin + hnVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.c.getMeasuredState());
        int l = aad.l(this) & 256;
        if (l != 0) {
            measuredHeight = this.k;
        } else {
            measuredHeight = this.c.getVisibility() != 8 ? this.c.getMeasuredHeight() : 0;
        }
        this.t.set(this.r);
        abc abcVar = this.u;
        this.w = abcVar;
        if (this.d || l != 0) {
            vq d = vq.d(abcVar.b(), this.w.d() + measuredHeight, this.w.c(), this.w.a());
            abc abcVar2 = this.w;
            if (Build.VERSION.SDK_INT >= 30) {
                aarVar = new aat(abcVar2);
            } else if (Build.VERSION.SDK_INT >= 29) {
                aarVar = new aas(abcVar2);
            } else {
                aarVar = new aar(abcVar2);
            }
            aarVar.c(d);
            this.w = aarVar.a();
        } else {
            this.t.top += measuredHeight;
            Rect rect = this.t;
            rect.bottom = rect.bottom;
            this.w = this.w.l(0, measuredHeight, 0, 0);
        }
        w(this.l, this.t, true);
        if (!this.x.equals(this.w)) {
            abc abcVar3 = this.w;
            this.x = abcVar3;
            aad.w(this.l, abcVar3);
        }
        measureChildWithMargins(this.l, i, 0, i2, 0);
        hn hnVar2 = (hn) this.l.getLayoutParams();
        int max3 = Math.max(max, this.l.getMeasuredWidth() + hnVar2.leftMargin + hnVar2.rightMargin);
        int max4 = Math.max(max2, this.l.getMeasuredHeight() + hnVar2.topMargin + hnVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.l.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.p || !z) {
            return false;
        }
        this.y.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.y.getFinalY() > this.c.getHeight()) {
            b();
            this.A.run();
        } else {
            b();
            this.z.run();
        }
        this.f = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.q + i2;
        this.q = i5;
        j(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        eh ehVar;
        fv fvVar;
        int i2 = 0;
        this.B.b(i, 0);
        ActionBarContainer actionBarContainer = this.c;
        if (actionBarContainer != null) {
            i2 = -((int) actionBarContainer.getTranslationY());
        }
        this.q = i2;
        b();
        hm hmVar = this.h;
        if (hmVar == null || (fvVar = (ehVar = (eh) hmVar).m) == null) {
            return;
        }
        fvVar.a();
        ehVar.m = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.c.getVisibility() != 0) {
            return false;
        }
        return this.p;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.p || this.f) {
            return;
        }
        if (this.q > this.c.getHeight()) {
            b();
            postDelayed(this.A, 600L);
            return;
        }
        b();
        postDelayed(this.z, 600L);
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        i();
        int i2 = this.g ^ i;
        this.g = i;
        int i3 = i & 4;
        int i4 = i & 256;
        hm hmVar = this.h;
        if (hmVar != null) {
            eh ehVar = (eh) hmVar;
            ehVar.k = i4 == 0;
            if (i3 == 0 || i4 == 0) {
                if (ehVar.l) {
                    ehVar.l = false;
                    ehVar.w(true);
                }
            } else if (!ehVar.l) {
                ehVar.l = true;
                ehVar.w(true);
            }
        }
        if ((i2 & 256) == 0 || this.h == null) {
            return;
        }
        aad.K(this);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        hm hmVar = this.h;
        if (hmVar != null) {
            ((eh) hmVar).j = i;
        }
    }

    @Override // defpackage.js
    public final boolean p() {
        i();
        return this.m.o();
    }

    @Override // defpackage.js
    public final boolean q() {
        i();
        return this.m.q();
    }

    @Override // defpackage.js
    public final boolean r() {
        i();
        return this.m.r();
    }

    @Override // defpackage.js
    public final boolean s() {
        i();
        return this.m.s();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // defpackage.yv
    public final boolean t(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // defpackage.js
    public final boolean u() {
        i();
        return this.m.t();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        this.u = abc.a;
        abc abcVar = abc.a;
        this.v = abcVar;
        this.w = abcVar;
        this.x = abcVar;
        this.j = new hl(this);
        this.z = new az(this, 8);
        this.A = new az(this, 9);
        v(context);
        this.B = new yx();
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new hn(layoutParams);
    }
}
