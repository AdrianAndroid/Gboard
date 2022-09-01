package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public static final int[] a = {16842931};
    private static final Comparator h = new kp(5);
    private static final Interpolator i = new om(5);
    private int A;
    private int B;
    private float D;
    private float E;
    private float F;
    private float G;
    private VelocityTracker I;
    private int J;
    private int K;
    private int L;
    private int M;
    private boolean O;
    private int P;
    public ald b;
    public int c;
    public EdgeEffect d;
    public EdgeEffect e;
    public List f;
    public List g;
    private int j;
    private Scroller o;
    private boolean p;
    private alk q;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean x;
    private boolean y;
    private int z;
    private final ArrayList k = new ArrayList();
    private final alg l = new alg();
    private final Rect m = new Rect();
    private int n = -1;
    private float r = -3.4028235E38f;
    private float s = Float.MAX_VALUE;
    private int w = 1;
    private boolean C = true;
    private int H = -1;
    private boolean N = true;
    private final Runnable Q = new od(this, 18);
    private int R = 0;

    public ViewPager(Context context) {
        super(context);
        u(context);
    }

    private final void A(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.H) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.D = motionEvent.getX(i2);
            this.H = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.I;
            if (velocityTracker == null) {
                return;
            }
            velocityTracker.clear();
        }
    }

    private final void B(int i2, boolean z, int i3, boolean z2) {
        int scrollX;
        int i4;
        int abs;
        alg d = d(i2);
        int v = d != null ? (int) (v() * Math.max(this.r, Math.min(d.e, this.s))) : 0;
        if (z) {
            if (getChildCount() == 0) {
                C(false);
            } else {
                Scroller scroller = this.o;
                if (scroller == null || scroller.isFinished()) {
                    scrollX = getScrollX();
                } else {
                    scrollX = this.p ? this.o.getCurrX() : this.o.getStartX();
                    this.o.abortAnimation();
                    C(false);
                }
                int i5 = scrollX;
                int scrollY = getScrollY();
                int i6 = v - i5;
                int i7 = -scrollY;
                if (i6 != 0) {
                    i4 = i6;
                } else if (i7 == 0) {
                    y(false);
                    i();
                    p(0);
                } else {
                    i4 = 0;
                }
                C(true);
                p(2);
                int v2 = v();
                float f = v2;
                float f2 = v2 / 2;
                float sin = f2 + (((float) Math.sin((Math.min(1.0f, Math.abs(i4) / f) - 0.5f) * 0.47123894f)) * f2);
                int abs2 = Math.abs(i3);
                if (abs2 > 0) {
                    abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                } else {
                    abs = (int) (((Math.abs(i4) / (f + 0.0f)) + 1.0f) * 100.0f);
                }
                int min = Math.min(abs, 600);
                this.p = false;
                this.o.startScroll(i5, scrollY, i4, i7, min);
                aad.G(this);
            }
            if (!z2) {
                return;
            }
            z(i2);
            return;
        }
        if (z2) {
            z(i2);
        }
        y(false);
        scrollTo(v, 0);
        D(v);
    }

    private final void C(boolean z) {
        if (this.u != z) {
            this.u = z;
        }
    }

    private final boolean D(int i2) {
        if (this.k.size() == 0) {
            if (this.N) {
                return false;
            }
            this.O = false;
            h(0, 0.0f, 0);
            if (!this.O) {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
            return false;
        }
        alg x = x();
        float v = v();
        int i3 = x.b;
        float f = ((i2 / v) - x.e) / (x.d + (0.0f / v));
        this.O = false;
        h(i3, f, (int) (v * f));
        if (!this.O) {
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        return true;
    }

    private final boolean E(float f, float f2) {
        float p;
        ArrayList arrayList;
        boolean z;
        float f3 = this.D - f;
        this.D = f;
        float height = f2 / getHeight();
        float width = f3 / getWidth();
        if (aqr.o(this.d) != 0.0f) {
            p = -aqr.p(this.d, -width, 1.0f - height);
        } else {
            p = aqr.o(this.e) != 0.0f ? aqr.p(this.e, width, height) : 0.0f;
        }
        float width2 = p * getWidth();
        float f4 = f3 - width2;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = width2 != 0.0f;
        if (Math.abs(f4) < 1.0E-4f) {
            return z4;
        }
        float scrollX = getScrollX() + f4;
        float v = v();
        float f5 = this.r * v;
        float f6 = this.s * v;
        alg algVar = (alg) this.k.get(0);
        alg algVar2 = (alg) this.k.get(arrayList.size() - 1);
        if (algVar.b != 0) {
            f5 = algVar.e * v;
            z = false;
        } else {
            z = true;
        }
        if (algVar2.b != this.b.a() - 1) {
            f6 = algVar2.e * v;
        } else {
            z2 = true;
        }
        if (scrollX < f5) {
            if (z) {
                aqr.p(this.d, (f5 - scrollX) / v, 1.0f - (f2 / getHeight()));
            } else {
                z3 = z4;
            }
            z4 = z3;
            scrollX = f5;
        } else if (scrollX > f6) {
            if (z2) {
                aqr.p(this.e, (scrollX - f6) / v, f2 / getHeight());
            } else {
                z3 = z4;
            }
            z4 = z3;
            scrollX = f6;
        }
        int i2 = (int) scrollX;
        this.D += scrollX - i2;
        scrollTo(i2, getScrollY());
        D(i2);
        return z4;
    }

    private final boolean F() {
        this.H = -1;
        this.x = false;
        this.y = false;
        VelocityTracker velocityTracker = this.I;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.I = null;
        }
        this.d.onRelease();
        this.e.onRelease();
        return !this.d.isFinished() || !this.e.isFinished();
    }

    private final void G() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private final int v() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private final Rect w(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private final alg x() {
        int i2;
        int v = v();
        float f = 0.0f;
        float scrollX = v > 0 ? getScrollX() / v : 0.0f;
        float f2 = v > 0 ? 0.0f / v : 0.0f;
        alg algVar = null;
        float f3 = 0.0f;
        int i3 = 0;
        boolean z = true;
        int i4 = -1;
        while (i3 < this.k.size()) {
            alg algVar2 = (alg) this.k.get(i3);
            if (!z && algVar2.b != (i2 = i4 + 1)) {
                algVar2 = this.l;
                algVar2.e = f + f3 + f2;
                algVar2.b = i2;
                algVar2.d = 1.0f;
                i3--;
            }
            alg algVar3 = algVar2;
            f = algVar3.e;
            float f4 = algVar3.d + f + f2;
            if (!z && scrollX < f) {
                return algVar;
            }
            if (scrollX < f4 || i3 == this.k.size() - 1) {
                return algVar3;
            }
            i4 = algVar3.b;
            i3++;
            z = false;
            algVar = algVar3;
            f3 = algVar3.d;
        }
        return algVar;
    }

    private final void y(boolean z) {
        boolean z2 = this.R == 2;
        if (z2) {
            C(false);
            if (!this.o.isFinished()) {
                this.o.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.o.getCurrX();
                int currY = this.o.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        D(currX);
                    }
                }
            }
        }
        this.v = false;
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            alg algVar = (alg) this.k.get(i2);
            if (algVar.c) {
                algVar.c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                aad.H(this, this.Q);
            } else {
                this.Q.run();
            }
        }
    }

    private final void z(int i2) {
        List list = this.f;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                alj aljVar = (alj) this.f.get(i3);
                if (aljVar != null) {
                    aljVar.c(i2);
                }
            }
        }
    }

    public int a() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i2, int i3) {
        alg c;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (c = c(childAt)) != null && c.b == this.c) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (!isFocusable()) {
            return;
        }
        if (((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null) {
            return;
        }
        arrayList.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        alg c;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (c = c(childAt)) != null && c.b == this.c) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        alh alhVar = (alh) layoutParams;
        boolean z = alhVar.a | (view.getClass().getAnnotation(alf.class) != null);
        alhVar.a = z;
        if (!this.t) {
            super.addView(view, i2, layoutParams);
        } else if (alhVar == null || !z) {
            alhVar.d = true;
            addViewInLayout(view, i2, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    final alg b(int i2, int i3) {
        alg algVar = new alg();
        algVar.b = i2;
        algVar.a = this.b.b(this, i2);
        algVar.d = 1.0f;
        if (i3 < 0 || i3 >= this.k.size()) {
            this.k.add(algVar);
        } else {
            this.k.add(i3, algVar);
        }
        return algVar;
    }

    final alg c(View view) {
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            alg algVar = (alg) this.k.get(i2);
            if (this.b.h(view, algVar.a)) {
                return algVar;
            }
        }
        return null;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i2) {
        if (this.b == null) {
            return false;
        }
        int v = v();
        int scrollX = getScrollX();
        return i2 < 0 ? scrollX > ((int) (((float) v) * this.r)) : i2 > 0 && scrollX < ((int) (((float) v) * this.s));
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof alh) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.p = true;
        if (this.o.isFinished() || !this.o.computeScrollOffset()) {
            y(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.o.getCurrX();
        int currY = this.o.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!D(currX)) {
                this.o.abortAnimation();
                scrollTo(0, currY);
            }
        }
        aad.G(this);
    }

    final alg d(int i2) {
        for (int i3 = 0; i3 < this.k.size(); i3++) {
            alg algVar = (alg) this.k.get(i3);
            if (algVar.b == i2) {
                return algVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L5f
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L5a
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L48
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L5a
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r6 = r5.q(r4)
            goto L5b
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L5a
            boolean r6 = r5.q(r1)
            goto L5b
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r6 = r5.t()
            goto L5b
        L41:
            r6 = 66
            boolean r6 = r5.q(r6)
            goto L5b
        L48:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L53
            boolean r6 = r5.s()
            goto L5b
        L53:
            r6 = 17
            boolean r6 = r5.q(r6)
            goto L5b
        L5a:
            r6 = 0
        L5b:
            if (r6 == 0) goto L5e
            goto L5f
        L5e:
            return r2
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        alg c;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (c = c(childAt)) != null && c.b == this.c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        ald aldVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0 && (overScrollMode != 1 || (aldVar = this.b) == null || aldVar.a() <= 1)) {
            this.d.finish();
            this.e.finish();
            return;
        }
        if (!this.d.isFinished()) {
            int save = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((-height) + getPaddingTop(), this.r * width);
            this.d.setSize(height, width);
            z = this.d.draw(canvas);
            canvas.restoreToCount(save);
        } else {
            z = false;
        }
        if (!this.e.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate(-getPaddingTop(), (-(this.s + 1.0f)) * width2);
            this.e.setSize((height2 - paddingTop) - paddingBottom, width2);
            z |= this.e.draw(canvas);
            canvas.restoreToCount(save2);
        }
        if (!z) {
            return;
        }
        aad.G(this);
    }

    public void e(alj aljVar) {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        this.f.add(aljVar);
    }

    public final void f() {
        List list = this.f;
        if (list != null) {
            list.clear();
        }
    }

    public final void g() {
        int a2 = this.b.a();
        this.j = a2;
        int size = this.k.size();
        int i2 = this.w;
        boolean z = size < (i2 + i2) + 1 && this.k.size() < a2;
        int i3 = this.c;
        int i4 = 0;
        boolean z2 = false;
        while (i4 < this.k.size()) {
            alg algVar = (alg) this.k.get(i4);
            ald aldVar = this.b;
            Object obj = algVar.a;
            if (aldVar.j() != -1) {
                this.k.remove(i4);
                i4--;
                this.b.c(this, algVar.b, algVar.a);
                int i5 = this.c;
                if (i5 == algVar.b) {
                    i3 = Math.max(0, Math.min(i5, (-1) + a2));
                }
                z = true;
                z2 = true;
            }
            i4++;
        }
        if (z2) {
            this.b.i();
        }
        Collections.sort(this.k, h);
        if (z) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                alh alhVar = (alh) getChildAt(i6).getLayoutParams();
                if (!alhVar.a) {
                    alhVar.c = 0.0f;
                }
            }
            n(i3, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new alh();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new alh(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i2, int i3) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void h(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.P
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            alh r9 = (defpackage.alh) r9
            boolean r10 = r9.a
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.b
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            java.util.List r0 = r12.f
            if (r0 == 0) goto L85
            int r0 = r0.size()
        L73:
            if (r1 >= r0) goto L85
            java.util.List r3 = r12.f
            java.lang.Object r3 = r3.get(r1)
            alj r3 = (defpackage.alj) r3
            if (r3 == 0) goto L82
            r3.b(r13, r14, r15)
        L82:
            int r1 = r1 + 1
            goto L73
        L85:
            r12.O = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.h(int, float, int):void");
    }

    public final void i() {
        j(this.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
        if (r9 != r10) goto L244;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void j(int r19) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.j(int):void");
    }

    public void k(ald aldVar) {
        ald aldVar2 = this.b;
        if (aldVar2 != null) {
            aldVar2.f(null);
            for (int i2 = 0; i2 < this.k.size(); i2++) {
                alg algVar = (alg) this.k.get(i2);
                this.b.c(this, algVar.b, algVar.a);
            }
            this.b.i();
            this.k.clear();
            int i3 = 0;
            while (i3 < getChildCount()) {
                if (!((alh) getChildAt(i3).getLayoutParams()).a) {
                    removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
            this.c = 0;
            scrollTo(0, 0);
        }
        this.b = aldVar;
        this.j = 0;
        if (aldVar != null) {
            if (this.q == null) {
                this.q = new alk(this);
            }
            this.b.f(this.q);
            this.v = false;
            boolean z = this.N;
            this.N = true;
            this.j = this.b.a();
            int i4 = this.n;
            if (i4 >= 0) {
                n(i4, false, true);
                this.n = -1;
            } else if (!z) {
                i();
            } else {
                requestLayout();
            }
        }
        List list = this.g;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.g.size();
        for (int i5 = 0; i5 < size; i5++) {
            nos nosVar = (nos) this.g.get(i5);
            kyv kyvVar = (kyv) nosVar.b;
            if (kyvVar.v == this) {
                kyvVar.i(aldVar, nosVar.a);
            }
        }
    }

    public void l(int i2) {
        this.v = false;
        n(i2, !this.N, false);
    }

    public void m(int i2, boolean z) {
        this.v = false;
        n(i2, z, false);
    }

    final void n(int i2, boolean z, boolean z2) {
        o(i2, z, z2, 0);
    }

    final void o(int i2, boolean z, boolean z2, int i3) {
        ald aldVar = this.b;
        boolean z3 = false;
        if (aldVar == null || aldVar.a() <= 0) {
            C(false);
        } else if (z2 || this.c != i2 || this.k.size() == 0) {
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 >= this.b.a()) {
                i2 = this.b.a() - 1;
            }
            int i4 = this.w;
            int i5 = this.c;
            if (i2 > i5 + i4 || i2 < i5 - i4) {
                for (int i6 = 0; i6 < this.k.size(); i6++) {
                    ((alg) this.k.get(i6)).c = true;
                }
            }
            if (this.c != i2) {
                z3 = true;
            }
            if (this.N) {
                this.c = i2;
                if (z3) {
                    z(i2);
                }
                requestLayout();
                return;
            }
            j(i2);
            B(i2, z, i3, z3);
        } else {
            C(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this.Q);
        Scroller scroller = this.o;
        if (scroller != null && !scroller.isFinished()) {
            this.o.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            F();
            return false;
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.F = x;
            this.D = x;
            float y = motionEvent.getY();
            this.G = y;
            this.E = y;
            this.H = motionEvent.getPointerId(0);
            this.y = false;
            this.p = true;
            this.o.computeScrollOffset();
            if (this.R == 2 && Math.abs(this.o.getFinalX() - this.o.getCurrX()) > this.M) {
                this.o.abortAnimation();
                this.v = false;
                i();
                this.x = true;
                G();
                p(1);
            } else if (aqr.o(this.d) == 0.0f && aqr.o(this.e) == 0.0f) {
                y(false);
                this.x = false;
            } else {
                this.x = true;
                p(1);
                if (aqr.o(this.d) != 0.0f) {
                    aqr.p(this.d, 0.0f, 1.0f - (this.E / getHeight()));
                }
                if (aqr.o(this.e) != 0.0f) {
                    aqr.p(this.e, 0.0f, this.E / getHeight());
                }
            }
        } else if (this.x) {
            return true;
        } else {
            if (this.y) {
                return false;
            }
            if (action == 2) {
                int i2 = this.H;
                if (i2 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i2);
                    float x2 = motionEvent.getX(findPointerIndex);
                    float f = x2 - this.D;
                    float abs = Math.abs(f);
                    float y2 = motionEvent.getY(findPointerIndex);
                    float abs2 = Math.abs(y2 - this.G);
                    if (f != 0.0f) {
                        float f2 = this.D;
                        if ((this.C || ((f2 >= this.A || f <= 0.0f) && (f2 <= getWidth() - this.A || f >= 0.0f))) && r(this, false, (int) f, (int) x2, (int) y2)) {
                            this.D = x2;
                            this.E = y2;
                            this.y = true;
                            return false;
                        }
                    }
                    float f3 = this.B;
                    if (abs > f3 && abs * 0.5f > abs2) {
                        this.x = true;
                        G();
                        p(1);
                        this.D = f > 0.0f ? this.F + this.B : this.F - this.B;
                        this.E = y2;
                        C(true);
                    } else if (abs2 > f3) {
                        this.y = true;
                    }
                    if (this.x && E(x2, y2)) {
                        aad.G(this);
                    }
                }
            } else if (action == 6) {
                A(motionEvent);
            }
        }
        if (this.I == null) {
            this.I = VelocityTracker.obtain();
        }
        this.I.addMovement(motionEvent);
        return this.x;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        int i5;
        alg c;
        int childCount = getChildCount();
        if ((i2 & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i5 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
            i5 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (c = c(childAt)) != null && c.b == this.c && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i5;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof all)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        all allVar = (all) parcelable;
        super.onRestoreInstanceState(allVar.d);
        if (this.b != null) {
            Parcelable parcelable2 = allVar.b;
            ClassLoader classLoader = allVar.e;
            n(allVar.a, false, true);
            return;
        }
        this.n = allVar.a;
        Parcelable parcelable3 = allVar.b;
        ClassLoader classLoader2 = allVar.e;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        all allVar = new all(super.onSaveInstanceState());
        allVar.a = this.c;
        if (this.b != null) {
            allVar.b = null;
        }
        return allVar;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            if (i4 <= 0 || this.k.isEmpty()) {
                alg d = d(this.c);
                int min = (int) ((d != null ? Math.min(d.e, this.s) : 0.0f) * ((i2 - getPaddingLeft()) - getPaddingRight()));
                if (min == getScrollX()) {
                    return;
                }
                y(false);
                scrollTo(min, getScrollY());
            } else if (!this.o.isFinished()) {
                this.o.setFinalX(a() * v());
            } else {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                scrollTo((int) ((getScrollX() / ((i4 - getPaddingLeft()) - getPaddingRight())) * ((i2 - paddingLeft) - paddingRight)), getScrollY());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x01bb  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(int i2) {
        if (this.R == i2) {
            return;
        }
        this.R = i2;
        List list = this.f;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            alj aljVar = (alj) this.f.get(i3);
            if (aljVar != null) {
                aljVar.a(i2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(int r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.findFocus()
            r1 = 0
            if (r0 != r5) goto L9
        L7:
            r0 = r1
            goto L58
        L9:
            if (r0 == 0) goto L58
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r5) goto L16
            goto L58
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L48
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            java.lang.String r0 = "arrowScroll tried to find focus based on non-child current focused view "
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = r0.concat(r2)
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
            goto L7
        L58:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r5, r0, r6)
            r2 = 0
            r3 = 66
            r4 = 17
            if (r1 == 0) goto La9
            if (r1 == r0) goto La9
            if (r6 != r4) goto L89
            android.graphics.Rect r2 = r5.m
            android.graphics.Rect r2 = r5.w(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r5.m
            android.graphics.Rect r3 = r5.w(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L84
            if (r2 < r3) goto L84
            boolean r2 = r5.s()
            goto Lbd
        L84:
            boolean r2 = r1.requestFocus()
            goto Lbd
        L89:
            if (r6 != r3) goto Lbd
            android.graphics.Rect r2 = r5.m
            android.graphics.Rect r2 = r5.w(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r5.m
            android.graphics.Rect r3 = r5.w(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto La4
            if (r2 > r3) goto La4
            boolean r2 = r5.t()
            goto Lbd
        La4:
            boolean r2 = r1.requestFocus()
            goto Lbd
        La9:
            if (r6 == r4) goto Lb9
            r0 = 1
            if (r6 != r0) goto Laf
            goto Lb9
        Laf:
            if (r6 == r3) goto Lb4
            r0 = 2
            if (r6 != r0) goto Lbd
        Lb4:
            boolean r2 = r5.t()
            goto Lbd
        Lb9:
            boolean r2 = r5.s()
        Lbd:
            if (r2 == 0) goto Lc6
            int r6 = android.view.SoundEffectConstants.getContantForFocusDirection(r6)
            r5.playSoundEffect(r6)
        Lc6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.q(int):boolean");
    }

    protected final boolean r(View view, boolean z, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && r(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.t) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    final boolean s() {
        int i2 = this.c;
        if (i2 > 0) {
            m(i2 - 1, true);
            return true;
        }
        return false;
    }

    final boolean t() {
        ald aldVar = this.b;
        if (aldVar == null || this.c >= aldVar.a() - 1) {
            return false;
        }
        m(this.c + 1, true);
        return true;
    }

    final void u(Context context) {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        this.o = new Scroller(context, i);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.B = viewConfiguration.getScaledPagingTouchSlop();
        this.J = (int) (400.0f * f);
        this.K = viewConfiguration.getScaledMaximumFlingVelocity();
        this.d = new EdgeEffect(context);
        this.e = new EdgeEffect(context);
        this.L = (int) (25.0f * f);
        this.M = (int) (f + f);
        this.z = (int) (f * 16.0f);
        aad.M(this, new ali(this));
        if (aad.d(this) == 0) {
            aad.U(this, 1);
        }
        aad.V(this, new ale(this));
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == null;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        u(context);
    }
}
