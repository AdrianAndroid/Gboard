package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: PG */
/* renamed from: alc  reason: default package */
/* loaded from: classes.dex */
public class alc extends ViewGroup {
    public static final ltg a = ltg.j("androidx/viewpager/widget/FourDirectionalViewPager");
    public static final int[] b = {16842931};
    private static final Comparator i = new kp(4);
    private static final Interpolator j = new om(4);
    private int A;
    private int B;
    private float C;
    private float D;
    private float E;
    private float F;
    private int G;
    private VelocityTracker H;
    private int I;
    private int J;
    private int K;
    private int L;
    private boolean M;
    private boolean N;
    private int O;
    private int P;
    private aqr Q;
    private aqr R;
    private aqr S;
    private aqr T;
    public akt c;
    public int d;
    public int e;
    public int f;
    public aky g;
    public int h;
    private final ArrayList k;
    private final akv l;
    private final Rect m;
    private int n;
    private Scroller o;
    private akz p;
    private float q;
    private float r;
    private int s;
    private int t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z;

    public alc(Context context) {
        super(context);
        this.k = new ArrayList();
        this.l = new akv();
        this.m = new Rect();
        this.n = -1;
        this.q = -3.4028235E38f;
        this.r = Float.MAX_VALUE;
        this.f = 1;
        this.G = -1;
        this.M = true;
        this.h = 1;
        this.P = 0;
        B();
    }

    private final void A() {
        this.x = false;
        this.y = false;
        VelocityTracker velocityTracker = this.H;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.H = null;
        }
    }

    private final void B() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.o = new Scroller(context, j);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.B = aag.d(viewConfiguration);
        this.I = viewConfiguration.getScaledMinimumFlingVelocity();
        this.J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.Q = new aqr(context, (byte[]) null);
        this.R = new aqr(context, (byte[]) null);
        this.S = new aqr(context, (byte[]) null);
        this.T = new aqr(context, (byte[]) null);
        float f = context.getResources().getDisplayMetrics().density;
        this.K = (int) (25.0f * f);
        this.L = (int) (f + f);
        this.z = (int) (f * 16.0f);
        aad.M(this, new akx(this));
        if (aad.d(this) == 0) {
            aad.U(this, 1);
        }
    }

    private final void C(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.G) {
            int i2 = actionIndex == 0 ? 1 : 0;
            F(t(motionEvent, i2));
            this.G = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.H;
            if (velocityTracker == null) {
                return;
            }
            velocityTracker.clear();
        }
    }

    private final void D(int i2, int i3, int i4, int i5) {
        if (i3 <= 0 || this.k.isEmpty()) {
            akv c = c(this.d);
            int min = (int) ((c != null ? Math.min(c.d, this.r) : 0.0f) * i2);
            if (min == v()) {
                return;
            }
            z();
            E(min);
            return;
        }
        int v = (int) ((v() / (i3 + i5)) * (i4 + i2));
        E(v);
        if (this.o.isFinished()) {
            return;
        }
        int duration = this.o.getDuration() - this.o.timePassed();
        akv c2 = c(this.d);
        int i6 = c2 == null ? 0 : (int) (c2.d * i2);
        if (this.h == 1) {
            this.o.startScroll(v, 0, i6, 0, duration);
        } else {
            this.o.startScroll(0, v, 0, i6, duration);
        }
    }

    private final void E(int i2) {
        if (this.h == 1) {
            scrollTo(i2, getScrollY());
        } else {
            scrollTo(getScrollX(), i2);
        }
    }

    private final void F(float f) {
        if (this.h == 1) {
            this.E = f;
        } else {
            this.F = f;
        }
    }

    private final void G(akw akwVar, float f) {
        if (this.h == 1) {
            akwVar.c = f;
        } else {
            akwVar.d = f;
        }
    }

    private final void H(int i2) {
        if (this.P == i2) {
            return;
        }
        this.P = i2;
    }

    private final void I(boolean z) {
        if (this.v != z) {
            this.v = z;
        }
    }

    private final void J(float f) {
        this.x = true;
        H(1);
        F(f);
        I(true);
    }

    private final boolean K(int i2) {
        if (this.k.isEmpty()) {
            this.N = false;
            r(0, 0.0f);
            if (!this.N) {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
            return false;
        }
        akv y = y();
        int w = w();
        int i3 = this.e;
        float f = w;
        int i4 = y.b;
        float f2 = y.d;
        float u = u(y);
        this.N = false;
        r(i4, ((i2 / f) - f2) / (u + (i3 / f)));
        if (!this.N) {
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        return true;
    }

    private final boolean L(float f) {
        ArrayList arrayList;
        boolean z;
        boolean z2;
        float s = s();
        F(f);
        float v = v() + (s - f);
        float w = w();
        float f2 = this.q * w;
        float f3 = this.r * w;
        boolean z3 = false;
        akv akvVar = (akv) this.k.get(0);
        akv akvVar2 = (akv) this.k.get(arrayList.size() - 1);
        if (akvVar.b != 0) {
            f2 = akvVar.d * w;
            z = false;
        } else {
            z = true;
        }
        if (akvVar2.b != this.c.a() - 1) {
            f3 = akvVar2.d * w;
            z2 = false;
        } else {
            z2 = true;
        }
        if (v < f2) {
            if (z) {
                this.Q.w(Math.abs(f2 - v) / w);
                z3 = true;
            }
            v = f2;
        } else if (v > f3) {
            if (z2) {
                this.R.w(Math.abs(v - f3) / w);
                z3 = true;
            }
            v = f3;
        }
        int i2 = (int) v;
        F((s() + v) - i2);
        E(i2);
        K(i2);
        return z3;
    }

    private final void M(akv akvVar) {
        if (this.h == 1) {
            akvVar.e = 1.0f;
        } else {
            akvVar.f = 1.0f;
        }
    }

    private final aqr N() {
        return this.h == 1 ? this.Q : this.S;
    }

    private final aqr O() {
        return this.h == 1 ? this.R : this.T;
    }

    private final float s() {
        return this.h == 1 ? this.E : this.F;
    }

    private final float u(akv akvVar) {
        return this.h == 1 ? akvVar.e : akvVar.f;
    }

    private final int v() {
        return this.h == 1 ? getScrollX() : getScrollY();
    }

    private final int w() {
        return this.h == 1 ? getWidth() : getHeight();
    }

    private final Rect x(Rect rect, View view) {
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

    private final akv y() {
        int i2;
        int w = w();
        float f = 0.0f;
        float v = w > 0 ? v() / w : 0.0f;
        float f2 = w > 0 ? this.e / w : 0.0f;
        akv akvVar = null;
        float f3 = 0.0f;
        int i3 = 0;
        boolean z = true;
        int i4 = -1;
        while (i3 < this.k.size()) {
            akv akvVar2 = (akv) this.k.get(i3);
            if (!z && akvVar2.b != (i2 = i4 + 1)) {
                akvVar2 = this.l;
                akvVar2.d = f + f3 + f2;
                akvVar2.b = i2;
                M(akvVar2);
                i3--;
            }
            akv akvVar3 = akvVar2;
            f = akvVar3.d;
            float u = u(akvVar3) + f + f2;
            if (!z && v < f) {
                return akvVar;
            }
            if (v < u || i3 == this.k.size() - 1) {
                return akvVar3;
            }
            i4 = akvVar3.b;
            i3++;
            z = false;
            akvVar = akvVar3;
            f3 = u(akvVar3);
        }
        return akvVar;
    }

    private final void z() {
        boolean z = this.P == 2;
        if (z) {
            I(false);
            this.o.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.o.getCurrX();
            int currY = this.o.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
            }
            H(0);
        }
        this.w = false;
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            akv akvVar = (akv) this.k.get(i2);
            if (akvVar.c) {
                akvVar.c = false;
                z = true;
            }
        }
        if (z) {
            e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i2, int i3) {
        akv fC;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (fC = fC(childAt)) != null && fC.b == this.d) {
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
        akv fC;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (fC = fC(childAt)) != null && fC.b == this.d) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        akw akwVar = (akw) layoutParams;
        boolean z = akwVar.a | (view instanceof aku);
        akwVar.a = z;
        if (!this.u) {
            super.addView(view, i2, layoutParams);
        } else if (akwVar == null || !z) {
            akwVar.e = true;
            addViewInLayout(view, i2, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    final akv c(int i2) {
        for (int i3 = 0; i3 < this.k.size(); i3++) {
            akv akvVar = (akv) this.k.get(i3);
            if (akvVar.b == i2) {
                return akvVar;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof akw) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.o.isFinished() || !this.o.computeScrollOffset()) {
            z();
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.o.getCurrX();
        int currY = this.o.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (this.h == 1) {
                if (!K(currX)) {
                    this.o.abortAnimation();
                    scrollTo(0, currY);
                }
            } else if (!K(currY)) {
                this.o.abortAnimation();
                scrollTo(currX, 0);
            }
        }
        aad.G(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        int size = this.k.size();
        int i2 = this.f;
        boolean z = size < (i2 + i2) + 1 && this.k.size() < this.c.a();
        int i3 = this.d;
        int i4 = 0;
        boolean z2 = false;
        while (i4 < this.k.size()) {
            akv akvVar = (akv) this.k.get(i4);
            akt aktVar = this.c;
            Object obj = akvVar.a;
            if (aktVar.j() != -1) {
                this.k.remove(i4);
                i4--;
                this.c.c(this, akvVar.b, akvVar.a);
                int i5 = this.d;
                if (i5 == akvVar.b) {
                    i3 = Math.max(0, Math.min(i5, this.c.a() - 1));
                }
                z = true;
                z2 = true;
            }
            i4++;
        }
        if (z2) {
            this.c.i();
        }
        Collections.sort(this.k, i);
        if (z) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                akw akwVar = (akw) getChildAt(i6).getLayoutParams();
                if (!akwVar.a) {
                    G(akwVar, 0.0f);
                }
            }
            j(i3, false, true);
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0051 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r5) {
        /*
            r4 = this;
            boolean r0 = super.dispatchKeyEvent(r5)
            r1 = 1
            if (r0 != 0) goto L52
            int r0 = r5.getAction()
            r2 = 0
            if (r0 != 0) goto L4d
            int r0 = r5.getKeyCode()
            r3 = 61
            if (r0 == r3) goto L36
            switch(r0) {
                case 19: goto L2f;
                case 20: goto L28;
                case 21: goto L21;
                case 22: goto L1a;
                default: goto L19;
            }
        L19:
            goto L4d
        L1a:
            r5 = 66
            boolean r5 = r4.fJ(r5)
            goto L4e
        L21:
            r5 = 17
            boolean r5 = r4.fJ(r5)
            goto L4e
        L28:
            r5 = 130(0x82, float:1.82E-43)
            boolean r5 = r4.fJ(r5)
            goto L4e
        L2f:
            r5 = 33
            boolean r5 = r4.fJ(r5)
            goto L4e
        L36:
            boolean r0 = r5.hasNoModifiers()
            if (r0 == 0) goto L42
            r5 = 2
            boolean r5 = r4.fJ(r5)
            goto L4e
        L42:
            boolean r5 = r5.hasModifiers(r1)
            if (r5 == 0) goto L4d
            boolean r5 = r4.fJ(r1)
            goto L4e
        L4d:
            r5 = 0
        L4e:
            if (r5 == 0) goto L51
            goto L52
        L51:
            return r2
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alc.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        akv fC;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (fC = fC(childAt)) != null && fC.b == this.d && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        akt aktVar;
        akt aktVar2;
        super.draw(canvas);
        boolean z = false;
        int i2 = 1;
        if (this.h != 1) {
            int i3 = aad.i(this);
            if (i3 != 0 && (i3 != 1 || (aktVar = this.c) == null || aktVar.a() <= 1)) {
                this.S.r();
                this.T.r();
                return;
            }
            if (!this.S.u()) {
                int save = canvas.save();
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int height = getHeight();
                canvas.rotate(270.0f);
                canvas.translate((-width) + getPaddingLeft(), this.q * height);
                this.S.s(width, height);
                z = this.S.t(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.T.u()) {
                int save2 = canvas.save();
                int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int height2 = getHeight();
                akt aktVar3 = this.c;
                if (aktVar3 != null) {
                    i2 = aktVar3.a();
                }
                canvas.rotate(180.0f);
                int paddingLeft = getPaddingLeft();
                int i4 = this.e;
                canvas.translate((-width2) + paddingLeft, ((-i2) * (height2 + i4)) + i4);
                this.T.s(width2, height2);
                z |= this.T.t(canvas);
                canvas.restoreToCount(save2);
            }
            if (!z) {
                return;
            }
            aad.G(this);
            return;
        }
        int i5 = aad.i(this);
        if (i5 != 0 && (i5 != 1 || (aktVar2 = this.c) == null || aktVar2.a() <= 1)) {
            this.Q.r();
            this.R.r();
            return;
        }
        if (!this.Q.u()) {
            int save3 = canvas.save();
            int height3 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width3 = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((-height3) + getPaddingTop(), this.q * width3);
            this.Q.s(height3, width3);
            z = this.Q.t(canvas);
            canvas.restoreToCount(save3);
        }
        if (!this.R.u()) {
            int save4 = canvas.save();
            int width4 = getWidth();
            int height4 = getHeight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate(-getPaddingTop(), (-(this.r + 1.0f)) * width4);
            this.R.s((height4 - paddingTop) - paddingBottom, width4);
            z |= this.R.t(canvas);
            canvas.restoreToCount(save4);
        }
        if (!z) {
            return;
        }
        aad.G(this);
    }

    public final void e() {
        fD(this.d);
    }

    final akv fC(View view) {
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            akv akvVar = (akv) this.k.get(i2);
            if (this.c.h(view, akvVar.a)) {
                return akvVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
        if (r9 != r10) goto L243;
     */
    /* JADX WARN: Removed duplicated region for block: B:226:0x031f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void fD(int r20) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alc.fD(int):void");
    }

    public final void fE(akt aktVar) {
        akt aktVar2 = this.c;
        if (aktVar2 != null) {
            aktVar2.g(this.p);
            for (int i2 = 0; i2 < this.k.size(); i2++) {
                akv akvVar = (akv) this.k.get(i2);
                this.c.c(this, akvVar.b, akvVar.a);
            }
            this.c.i();
            this.k.clear();
            int i3 = 0;
            while (i3 < getChildCount()) {
                if (!((akw) getChildAt(i3).getLayoutParams()).a) {
                    removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
            this.d = 0;
            scrollTo(0, 0);
        }
        this.c = aktVar;
        if (aktVar != null) {
            if (this.p == null) {
                this.p = new akz(this);
            }
            this.c.e(this.p);
            this.w = false;
            this.M = true;
            int i4 = this.n;
            if (i4 >= 0) {
                j(i4, false, true);
                this.n = -1;
                return;
            }
            e();
        }
    }

    public final void fF(int i2) {
        this.w = false;
        j(i2, !this.M, false);
    }

    public final void fG(int i2, boolean z) {
        this.w = false;
        j(i2, z, false);
    }

    final void fH(int i2, boolean z, boolean z2, int i3) {
        aky akyVar;
        akt aktVar = this.c;
        if (aktVar == null || aktVar.a() <= 0) {
            I(false);
        } else if (z2 || this.d != i2 || this.k.isEmpty()) {
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 >= this.c.a()) {
                i2 = this.c.a() - 1;
            }
            int i4 = this.f;
            int i5 = this.d;
            if (i2 > i5 + i4 || i2 < i5 - i4) {
                for (int i6 = 0; i6 < this.k.size(); i6++) {
                    ((akv) this.k.get(i6)).c = true;
                }
            }
            int i7 = this.d;
            fD(i2);
            if (i7 != i2 && (akyVar = this.g) != null) {
                akyVar.a(i2);
            }
            akv c = c(i2);
            int w = c != null ? (int) (w() * Math.max(this.q, Math.min(c.d, this.r))) : 0;
            if (z) {
                if (this.h == 1) {
                    m(w, 0, i3);
                    return;
                } else {
                    m(0, w, i3);
                    return;
                }
            }
            z();
            if (this.h == 1) {
                scrollTo(w, 0);
            } else {
                scrollTo(0, w);
            }
        } else {
            I(false);
        }
    }

    public final void fI(int i2) {
        int i3 = this.e;
        this.e = i2;
        int w = w();
        D(w, w, i2, i3);
        requestLayout();
    }

    public final boolean fJ(int i2) {
        boolean requestFocus;
        boolean requestFocus2;
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        boolean z = false;
        if (findNextFocus == null || findNextFocus == findFocus) {
            int i3 = this.h;
            if (i3 == 1) {
                if (i2 == 17 || i2 == 1) {
                    z = p();
                } else if (i2 == 66 || i2 == 2) {
                    z = fK();
                }
            } else if (i3 == 2) {
                if (i2 == 33 || i2 == 1) {
                    z = p();
                } else if (i2 == 130 || i2 == 2) {
                    z = fK();
                }
            }
        } else {
            int i4 = this.h;
            if (i4 == 1) {
                if (i2 == 17) {
                    int i5 = x(this.m, findNextFocus).left;
                    int i6 = x(this.m, findFocus).left;
                    if (findFocus == null || i5 < i6) {
                        requestFocus2 = findNextFocus.requestFocus();
                    } else {
                        requestFocus2 = p();
                    }
                    z = requestFocus2;
                } else if (i2 == 66) {
                    int i7 = x(this.m, findNextFocus).left;
                    int i8 = x(this.m, findFocus).left;
                    if (findFocus == null || i7 > i8) {
                        requestFocus = findNextFocus.requestFocus();
                    } else {
                        requestFocus = fK();
                    }
                    z = requestFocus;
                    i2 = 66;
                }
            } else if (i4 == 2) {
                if (i2 == 33) {
                    int i9 = x(this.m, findNextFocus).top;
                    int i10 = x(this.m, findFocus).top;
                    if (findFocus == null || i9 < i10) {
                        z = findNextFocus.requestFocus();
                    } else {
                        z = p();
                    }
                } else if (i2 == 130) {
                    int i11 = x(this.m, findNextFocus).top;
                    int i12 = x(this.m, findFocus).top;
                    if (findFocus == null || i11 > i12) {
                        z = findNextFocus.requestFocus();
                    } else {
                        z = fK();
                    }
                }
            }
        }
        if (z) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i2));
        }
        return z;
    }

    final boolean fK() {
        akt aktVar = this.c;
        if (aktVar == null || this.d >= aktVar.a() - 1) {
            return false;
        }
        fG(this.d + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new akw();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new akw(getContext(), attributeSet);
    }

    final akv gv(int i2, int i3) {
        akv akvVar = new akv();
        akvVar.b = i2;
        akvVar.a = this.c.b(this, i2);
        M(akvVar);
        if (i3 < 0 || i3 >= this.k.size()) {
            this.k.add(akvVar);
        } else {
            this.k.add(i3, akvVar);
        }
        return akvVar;
    }

    final void j(int i2, boolean z, boolean z2) {
        fH(i2, z, z2, 0);
    }

    final void m(int i2, int i3, int i4) {
        int i5;
        int w;
        double d;
        int abs;
        if (getChildCount() == 0) {
            I(false);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i6 = i2 - scrollX;
        int i7 = i3 - scrollY;
        if (i6 != 0) {
            i5 = i6;
        } else if (i7 == 0) {
            z();
            e();
            H(0);
            return;
        } else {
            i5 = 0;
        }
        I(true);
        H(2);
        int i8 = this.h == 1 ? i5 : i7;
        float w2 = w() / 2;
        Double.isNaN((Math.min(1.0f, Math.abs(i8) / w) - 0.5f) * 0.3f);
        float sin = w2 + (((float) Math.sin((float) ((d * 3.141592653589793d) / 2.0d))) * w2);
        int abs2 = Math.abs(i4);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i8) / (w() + this.e)) + 1.0f) * 100.0f);
        }
        this.o.startScroll(scrollX, scrollY, i5, i7, Math.min(abs, 600));
        aad.G(this);
    }

    protected final boolean o(View view, boolean z, boolean z2, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && o(childAt, z, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z2) {
            if (z) {
                if (!aad.aa(view, -i2)) {
                    return false;
                }
            } else if (!aad.Z(view, -i2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.M = true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.x = false;
            this.y = false;
            this.G = -1;
            VelocityTracker velocityTracker = this.H;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.H = null;
            }
            return false;
        }
        if (action != 0) {
            if (this.x) {
                return true;
            }
            if (this.y) {
                return false;
            }
            if (action == 2) {
                int i2 = this.G;
                if (i2 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i2);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    if (this.h == 1) {
                        float f = x - this.E;
                        float abs = Math.abs(f);
                        float abs2 = Math.abs(y - this.F);
                        if (f != 0.0f) {
                            float f2 = this.E;
                            if ((f2 >= this.A || f <= 0.0f) && ((f2 <= getWidth() - this.A || f >= 0.0f) && o(this, false, false, (int) f, (int) x, (int) y))) {
                                this.E = x;
                                this.C = x;
                                this.F = y;
                                this.y = true;
                                return false;
                            }
                        }
                        float f3 = this.B;
                        if (abs > f3 && abs > abs2) {
                            J(f > 0.0f ? this.C + f3 : this.C - f3);
                        } else if (abs2 > f3) {
                            this.y = true;
                        }
                        if (this.x && L(x)) {
                            aad.G(this);
                        }
                    } else {
                        float f4 = y - this.F;
                        float abs3 = Math.abs(x - this.E);
                        float abs4 = Math.abs(f4);
                        if (f4 != 0.0f) {
                            float f5 = this.F;
                            if ((f5 >= this.A || f4 <= 0.0f) && ((f5 <= getHeight() - this.A || f4 >= 0.0f) && o(this, true, false, (int) f4, (int) x, (int) y))) {
                                this.F = y;
                                this.D = y;
                                this.E = x;
                                this.y = true;
                                return false;
                            }
                        }
                        float f6 = this.B;
                        if (abs4 > f6 && abs4 > abs3) {
                            J(f4 > 0.0f ? this.D + f6 : this.D - f6);
                        } else if (abs3 > f6) {
                            this.y = true;
                        }
                        if (this.x && L(y)) {
                            aad.G(this);
                        }
                    }
                }
            } else if (action == 6) {
                C(motionEvent);
            }
        } else {
            this.E = motionEvent.getX();
            this.F = motionEvent.getY();
            if (this.h == 1) {
                this.C = motionEvent.getX();
            } else {
                this.D = motionEvent.getY();
            }
            this.G = motionEvent.getPointerId(0);
            this.y = false;
            this.o.computeScrollOffset();
            boolean z = (this.h == 1 && Math.abs(this.o.getFinalX() - this.o.getCurrX()) > this.L) || (this.h == 2 && Math.abs(this.o.getFinalY() - this.o.getCurrY()) > this.L);
            if (this.P != 2 || !z) {
                z();
                this.x = false;
            } else {
                this.o.abortAnimation();
                this.w = false;
                e();
                this.x = true;
                H(1);
            }
        }
        if (this.H == null) {
            this.H = VelocityTracker.obtain();
        }
        this.H.addMovement(motionEvent);
        return this.x;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alc.onLayout(boolean, int, int, int, int):void");
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
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alc.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        int i5;
        akv fC;
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
            if (childAt.getVisibility() == 0 && (fC = fC(childAt)) != null && fC.b == this.d && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i5;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ala)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ala alaVar = (ala) parcelable;
        super.onRestoreInstanceState(alaVar.getSuperState());
        if (this.c != null) {
            Parcelable parcelable2 = alaVar.b;
            ClassLoader classLoader = alaVar.c;
            j(alaVar.a, false, true);
            return;
        }
        this.n = alaVar.a;
        Parcelable parcelable3 = alaVar.b;
        ClassLoader classLoader2 = alaVar.c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ala alaVar = new ala(super.onSaveInstanceState());
        alaVar.a = this.d;
        if (this.c != null) {
            alaVar.b = null;
        }
        return alaVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 || this.h != 1) {
            if (i3 == i5 || this.h != 2) {
                return;
            }
            int i6 = this.e;
            D(i3, i5, i6, i6);
            return;
        }
        int i7 = this.e;
        D(i2, i4, i7, i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
        if (O().v() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01aa, code lost:
        if (O().v() == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alc.onTouchEvent(android.view.MotionEvent):boolean");
    }

    final boolean p() {
        int i2 = this.d;
        if (i2 > 0) {
            fG(i2 - 1, true);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == null;
    }

    private final float t(MotionEvent motionEvent, int i2) {
        return this.h == 1 ? motionEvent.getX(i2) : motionEvent.getY(i2);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public alc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = new ArrayList();
        this.l = new akv();
        this.m = new Rect();
        this.n = -1;
        this.q = -3.4028235E38f;
        this.r = Float.MAX_VALUE;
        this.f = 1;
        this.G = -1;
        this.M = true;
        this.h = 1;
        this.P = 0;
        B();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842948});
        int i2 = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        if (i2 == 0) {
            this.h = 1;
        } else if (i2 == 1) {
            this.h = 2;
        } else {
            throw new IllegalArgumentException("The page flip orientation is wrong.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void r(int r12, float r13) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alc.r(int, float):void");
    }
}
