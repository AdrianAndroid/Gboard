package android.support.v7.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.google.android.inputmethod.latin.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements yu {
    public static final /* synthetic */ int R = 0;
    public EdgeEffect A;
    public lv B;
    public int C;
    public int D;
    public mb E;
    public final int F;
    public final mn G;
    public kr H;
    public kq I;
    public final ml J;
    public boolean K;
    public boolean L;
    public boolean M;
    public mq N;
    public final int[] O;
    final List P;
    public final bek Q;
    private final float V;
    private final mg W;
    private int aA;
    private dh aB;
    private opn aC;
    private opu aD;
    private final opu aE;
    private final Rect aa;
    private final ArrayList ab;
    private mc ac;
    private int ad;
    private boolean ae;
    private int af;
    private final AccessibilityManager ag;
    private int ah;
    private int ai;
    private int aj;
    private VelocityTracker ak;
    private int al;
    private int am;
    private int an;
    private int ao;
    private final int ap;
    private float aq;
    private float ar;
    private boolean as;
    private List at;
    private final int[] au;
    private final int[] av;
    private final int[] aw;
    private Runnable ax;
    private boolean ay;
    private int az;
    public final me e;
    mh f;
    public hy g;
    public jr h;
    public boolean i;
    public final Rect j;
    public final RectF k;
    public ls l;
    public ly m;
    public final List n;
    public final ArrayList o;
    public boolean p;
    boolean q;
    boolean r;
    boolean s;
    public boolean t;
    public List u;
    public boolean v;
    boolean w;
    public EdgeEffect x;
    public EdgeEffect y;
    public EdgeEffect z;
    private static final int[] S = {16843830};
    private static final float T = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean a = true;
    public static final boolean b = true;
    private static final Class[] U = {Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
    public static final Interpolator c = new om(1);
    static final mm d = new mm();

    public RecyclerView(Context context) {
        this(context, null);
    }

    public static void J(View view, Rect rect) {
        lz lzVar = (lz) view.getLayoutParams();
        Rect rect2 = lzVar.d;
        rect.set((view.getLeft() - rect2.left) - lzVar.leftMargin, (view.getTop() - rect2.top) - lzVar.topMargin, view.getRight() + rect2.right + lzVar.rightMargin, view.getBottom() + rect2.bottom + lzVar.bottomMargin);
    }

    private final int a(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.x;
        float f2 = 0.0f;
        if (edgeEffect != null && aqr.o(edgeEffect) != 0.0f) {
            if (canScrollHorizontally(-1)) {
                this.x.onRelease();
            } else {
                float f3 = -aqr.p(this.x, -width, 1.0f - height);
                if (aqr.o(this.x) == 0.0f) {
                    this.x.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.z;
            if (edgeEffect2 != null && aqr.o(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.z.onRelease();
                } else {
                    float p = aqr.p(this.z, width, height);
                    if (aqr.o(this.z) == 0.0f) {
                        this.z.onRelease();
                    }
                    f2 = p;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getWidth());
    }

    private final int aD(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.y;
        float f2 = 0.0f;
        if (edgeEffect != null && aqr.o(edgeEffect) != 0.0f) {
            if (canScrollVertically(-1)) {
                this.y.onRelease();
            } else {
                float f3 = -aqr.p(this.y, -height, width);
                if (aqr.o(this.y) == 0.0f) {
                    this.y.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.A;
            if (edgeEffect2 != null && aqr.o(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.A.onRelease();
                } else {
                    float p = aqr.p(this.A, height, 1.0f - width);
                    if (aqr.o(this.A) == 0.0f) {
                        this.A.onRelease();
                    }
                    f2 = p;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getHeight());
    }

    private final void aE() {
        aM();
        ac(0);
    }

    private final void aF() {
        int a2;
        oh ohVar;
        View gD;
        boolean z = true;
        this.J.b(1);
        I(this.J);
        this.J.i = false;
        af();
        this.Q.r();
        P();
        aJ();
        mo moVar = null;
        View focusedChild = (!this.as || !hasFocus() || this.l == null) ? null : getFocusedChild();
        if (focusedChild != null && (gD = gD(focusedChild)) != null) {
            moVar = gB(gD);
        }
        if (moVar == null) {
            aL();
        } else {
            ml mlVar = this.J;
            mlVar.m = this.l.b ? moVar.e : -1L;
            if (this.v) {
                a2 = -1;
            } else {
                a2 = moVar.v() ? moVar.d : moVar.a();
            }
            mlVar.l = a2;
            ml mlVar2 = this.J;
            View view = moVar.a;
            int id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id = view.getId();
                }
            }
            mlVar2.n = id;
        }
        ml mlVar3 = this.J;
        if (!mlVar3.j || !this.L) {
            z = false;
        }
        mlVar3.h = z;
        this.L = false;
        this.K = false;
        mlVar3.g = mlVar3.k;
        mlVar3.e = this.l.ha();
        aH(this.au);
        if (this.J.j) {
            int a3 = this.h.a();
            for (int i = 0; i < a3; i++) {
                mo j = j(this.h.e(i));
                if (!j.A() && (!j.t() || this.l.b)) {
                    lv.c(j);
                    j.d();
                    this.Q.y(j, lv.l(j));
                    if (this.J.h && j.y() && !j.v() && !j.A() && !j.t()) {
                        this.Q.q(gy(j), j);
                    }
                }
            }
        }
        if (this.J.k) {
            int c2 = this.h.c();
            for (int i2 = 0; i2 < c2; i2++) {
                mo j2 = j(this.h.f(i2));
                if (!j2.A() && j2.d == -1) {
                    j2.d = j2.c;
                }
            }
            ml mlVar4 = this.J;
            boolean z2 = mlVar4.f;
            mlVar4.f = false;
            this.m.s(this.e, mlVar4);
            this.J.f = z2;
            for (int i3 = 0; i3 < this.h.a(); i3++) {
                mo j3 = j(this.h.e(i3));
                if (!j3.A() && ((ohVar = (oh) ((qv) this.Q.b).get(j3)) == null || (ohVar.b & 4) == 0)) {
                    lv.c(j3);
                    boolean q = j3.q(8192);
                    j3.d();
                    yx l = lv.l(j3);
                    if (q) {
                        aA(j3, l);
                    } else {
                        bek bekVar = this.Q;
                        oh ohVar2 = (oh) ((qv) bekVar.b).get(j3);
                        if (ohVar2 == null) {
                            ohVar2 = oh.a();
                            ((qv) bekVar.b).put(j3, ohVar2);
                        }
                        ohVar2.b |= 2;
                        ohVar2.c = l;
                    }
                }
            }
            gH();
        } else {
            gH();
        }
        Q();
        ag(false);
        this.J.d = 2;
    }

    private final void aG() {
        af();
        P();
        this.J.b(6);
        this.g.e();
        this.J.e = this.l.ha();
        this.J.c = 0;
        mh mhVar = this.f;
        if (mhVar != null) {
            int i = this.l.c;
            Parcelable parcelable = mhVar.a;
            if (parcelable != null) {
                this.m.Z(parcelable);
            }
            this.f = null;
        }
        ml mlVar = this.J;
        mlVar.g = false;
        this.m.s(this.e, mlVar);
        ml mlVar2 = this.J;
        mlVar2.f = false;
        mlVar2.j = mlVar2.j && this.B != null;
        mlVar2.d = 4;
        Q();
        ag(false);
    }

    private final void aH(int[] iArr) {
        int a2 = this.h.a();
        if (a2 != 0) {
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MIN_VALUE;
            for (int i3 = 0; i3 < a2; i3++) {
                mo j = j(this.h.e(i3));
                if (!j.A()) {
                    int c2 = j.c();
                    if (c2 < i) {
                        i = c2;
                    }
                    if (c2 > i2) {
                        i2 = c2;
                    }
                }
            }
            iArr[0] = i;
            iArr[1] = i2;
            return;
        }
        iArr[0] = -1;
        iArr[1] = -1;
    }

    private final void aI(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.aj) {
            int i = actionIndex == 0 ? 1 : 0;
            this.aj = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.an = x;
            this.al = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.ao = y;
            this.am = y;
        }
    }

    private final void aJ() {
        boolean z;
        if (this.v) {
            this.g.j();
            if (this.w) {
                this.m.B();
            }
        }
        if (aP()) {
            this.g.g();
        } else {
            this.g.e();
        }
        boolean z2 = true;
        boolean z3 = this.K || this.L;
        ml mlVar = this.J;
        boolean z4 = this.q && this.B != null && ((z = this.v) || z3 || this.m.u) && (!z || this.l.b);
        mlVar.j = z4;
        if (!z4 || !z3 || this.v || !aP()) {
            z2 = false;
        }
        mlVar.k = z2;
    }

    private final void aK(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof lz) {
            lz lzVar = (lz) layoutParams;
            if (!lzVar.e) {
                Rect rect = lzVar.d;
                this.j.left -= rect.left;
                this.j.right += rect.right;
                this.j.top -= rect.top;
                this.j.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.j);
            offsetRectIntoDescendantCoords(view, this.j);
        } else {
            view2 = null;
        }
        this.m.bh(this, view, this.j, !this.q, view2 == null);
    }

    private final void aL() {
        ml mlVar = this.J;
        mlVar.m = -1L;
        mlVar.l = -1;
        mlVar.n = -1;
    }

    private final void aM() {
        VelocityTracker velocityTracker = this.ak;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        ah(0);
        EdgeEffect edgeEffect = this.x;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.x.isFinished();
        }
        EdgeEffect edgeEffect2 = this.y;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.y.isFinished();
        }
        EdgeEffect edgeEffect3 = this.z;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.z.isFinished();
        }
        EdgeEffect edgeEffect4 = this.A;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.A.isFinished();
        }
        if (z) {
            aad.G(this);
        }
    }

    private final void aN() {
        mk mkVar;
        this.G.d();
        ly lyVar = this.m;
        if (lyVar == null || (mkVar = lyVar.t) == null) {
            return;
        }
        mkVar.g();
    }

    private final boolean aO(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.ab.size();
        for (int i = 0; i < size; i++) {
            mc mcVar = (mc) this.ab.get(i);
            if (mcVar.n(motionEvent) && action != 3) {
                this.ac = mcVar;
                return true;
            }
        }
        return false;
    }

    private final boolean aP() {
        return this.B != null && this.m.y();
    }

    private final boolean aQ(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float o = aqr.o(edgeEffect);
        double log = Math.log((Math.abs(-i) * 0.35f) / (this.V * 0.015f));
        double d2 = T;
        double d3 = this.V * 0.015f;
        Double.isNaN(d2);
        Double.isNaN(d2);
        double exp = Math.exp((d2 / ((-1.0d) + d2)) * log);
        Double.isNaN(d3);
        return ((float) (d3 * exp)) < o * ((float) i2);
    }

    private final void aR(Context context, String str, AttributeSet attributeSet, int i) {
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            if (trim.charAt(0) == '.') {
                trim = String.valueOf(context.getPackageName()).concat(String.valueOf(trim));
            } else if (!trim.contains(".")) {
                trim = RecyclerView.class.getPackage().getName() + '.' + trim;
            }
            try {
                if (isInEditMode()) {
                    classLoader = getClass().getClassLoader();
                } else {
                    classLoader = context.getClassLoader();
                }
                Class<? extends U> asSubclass = Class.forName(trim, false, classLoader).asSubclass(ly.class);
                try {
                    constructor = asSubclass.getConstructor(U);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), 0};
                } catch (NoSuchMethodException e) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e2);
                    }
                }
                constructor.setAccessible(true);
                ab((ly) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e3);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e4);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e7);
            }
        }
    }

    private final opn aS() {
        if (this.aC == null) {
            this.aC = new opn(this);
        }
        return this.aC;
    }

    public static final int ap(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i <= 0 || edgeEffect == null || aqr.o(edgeEffect) == 0.0f) {
            if (i >= 0 || edgeEffect2 == null || aqr.o(edgeEffect2) == 0.0f) {
                return i;
            }
            float f = i2;
            int round = Math.round((f / 4.0f) * aqr.p(edgeEffect2, (i * 4.0f) / f, 0.5f));
            if (round != i) {
                edgeEffect2.finish();
            }
            return i - round;
        }
        int round2 = Math.round(((-i2) / 4.0f) * aqr.p(edgeEffect, ((-i) * 4.0f) / i2, 0.5f));
        if (round2 != i) {
            edgeEffect.finish();
        }
        return i - round2;
    }

    public static final long aq() {
        if (b) {
            return System.nanoTime();
        }
        return 0L;
    }

    public static RecyclerView gC(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView gC = gC(viewGroup.getChildAt(i));
            if (gC != null) {
                return gC;
            }
        }
        return null;
    }

    public static mo j(View view) {
        if (view == null) {
            return null;
        }
        return ((lz) view.getLayoutParams()).c;
    }

    public static void u(mo moVar) {
        WeakReference weakReference = moVar.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == moVar.a) {
                    return;
                }
                ViewParent parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            moVar.b = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x030c, code lost:
        if (r17.h.k(getFocusedChild()) != false) goto L150;
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0374  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void B() {
        /*
            Method dump skipped, instructions count: 981
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.B():void");
    }

    public final void C(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        aS().g(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void G() {
        if (this.z != null) {
            return;
        }
        EdgeEffect b2 = this.aB.b(this);
        this.z = b2;
        if (this.i) {
            b2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            b2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void H() {
        if (this.y != null) {
            return;
        }
        EdgeEffect b2 = this.aB.b(this);
        this.y = b2;
        if (this.i) {
            b2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            b2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    final void I(ml mlVar) {
        if (this.C == 2) {
            OverScroller overScroller = this.G.a;
            mlVar.o = overScroller.getFinalX() - overScroller.getCurrX();
            mlVar.p = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        mlVar.o = 0;
        mlVar.p = 0;
    }

    final void K() {
        this.A = null;
        this.y = null;
        this.z = null;
        this.x = null;
    }

    public final void L() {
        if (this.o.size() == 0) {
            return;
        }
        ly lyVar = this.m;
        if (lyVar != null) {
            lyVar.V("Cannot invalidate item decorations during a scroll or layout");
        }
        N();
        requestLayout();
    }

    public final void M(int i) {
        if (this.m == null) {
            return;
        }
        ac(2);
        this.m.aa(i);
        awakenScrollBars();
    }

    final void N() {
        int c2 = this.h.c();
        for (int i = 0; i < c2; i++) {
            ((lz) this.h.f(i).getLayoutParams()).e = true;
        }
        me meVar = this.e;
        int size = meVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            lz lzVar = (lz) ((mo) meVar.c.get(i2)).a.getLayoutParams();
            if (lzVar != null) {
                lzVar.e = true;
            }
        }
    }

    public final void O(int i, int i2, boolean z) {
        int i3 = i + i2;
        int c2 = this.h.c();
        for (int i4 = 0; i4 < c2; i4++) {
            mo j = j(this.h.f(i4));
            if (j != null && !j.A()) {
                int i5 = j.c;
                if (i5 >= i3) {
                    j.k(-i2, z);
                    this.J.f = true;
                } else if (i5 >= i) {
                    j.f(8);
                    j.k(-i2, z);
                    j.c = i - 1;
                    this.J.f = true;
                }
            }
        }
        me meVar = this.e;
        int size = meVar.c.size();
        while (true) {
            size--;
            if (size >= 0) {
                mo moVar = (mo) meVar.c.get(size);
                if (moVar != null) {
                    int i6 = moVar.c;
                    if (i6 >= i3) {
                        moVar.k(-i2, z);
                    } else if (i6 >= i) {
                        moVar.f(8);
                        meVar.j(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public final void P() {
        this.ah++;
    }

    final void Q() {
        R(true);
    }

    public final void R(boolean z) {
        int i;
        int i2 = this.ah - 1;
        this.ah = i2;
        if (i2 <= 0) {
            this.ah = 0;
            if (!z) {
                return;
            }
            int i3 = this.af;
            this.af = 0;
            if (i3 != 0 && am()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(2048);
                abh.b(obtain, i3);
                sendAccessibilityEventUnchecked(obtain);
            }
            for (int size = this.P.size() - 1; size >= 0; size--) {
                mo moVar = (mo) this.P.get(size);
                if (moVar.a.getParent() == this && !moVar.A() && (i = moVar.p) != -1) {
                    aad.U(moVar.a, i);
                    moVar.p = -1;
                }
            }
            this.P.clear();
        }
    }

    public final void S() {
        if (this.M || !this.p) {
            return;
        }
        aad.H(this, this.ax);
        this.M = true;
    }

    public final void T(boolean z) {
        this.w = z | this.w;
        this.v = true;
        int c2 = this.h.c();
        for (int i = 0; i < c2; i++) {
            mo j = j(this.h.f(i));
            if (j != null && !j.A()) {
                j.f(6);
            }
        }
        N();
        me meVar = this.e;
        int size = meVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            mo moVar = (mo) meVar.c.get(i2);
            if (moVar != null) {
                moVar.f(6);
                moVar.e(null);
            }
        }
        ls lsVar = meVar.g.l;
        if (lsVar == null || !lsVar.b) {
            meVar.i();
        }
    }

    public final void U() {
        lv lvVar = this.B;
        if (lvVar != null) {
            lvVar.f();
        }
        ly lyVar = this.m;
        if (lyVar != null) {
            lyVar.aR(this.e);
            this.m.aS(this.e);
        }
        this.e.d();
    }

    public final void V(int i) {
        int e = e();
        if (i < 0 || i >= e) {
            throw new IndexOutOfBoundsException(i + " is an invalid index for size " + e);
        }
        aB(ax(i));
    }

    public final void W(mc mcVar) {
        this.ab.remove(mcVar);
        if (this.ac == mcVar) {
            this.ac = null;
        }
    }

    public final void X(int i, int i2, int[] iArr) {
        mo moVar;
        af();
        P();
        I(this.J);
        int h = i != 0 ? this.m.h(i, this.e, this.J) : 0;
        int i3 = i2 != 0 ? this.m.i(i2, this.e, this.J) : 0;
        int a2 = this.h.a();
        for (int i4 = 0; i4 < a2; i4++) {
            View e = this.h.e(i4);
            mo gB = gB(e);
            if (gB != null && (moVar = gB.i) != null) {
                View view = moVar.a;
                int left = e.getLeft();
                int top = e.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Q();
        ag(false);
        if (iArr != null) {
            iArr[0] = h;
            iArr[1] = i3;
        }
    }

    public final void Y(int i) {
        if (this.s) {
            return;
        }
        ai();
        ly lyVar = this.m;
        if (lyVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        lyVar.aa(i);
        awakenScrollBars();
    }

    public final void Z(mq mqVar) {
        this.N = mqVar;
        aad.M(this, mqVar);
    }

    public final void aA(mo moVar, yx yxVar) {
        moVar.m(0, 8192);
        if (this.J.h && moVar.y() && !moVar.v() && !moVar.A()) {
            this.Q.q(gy(moVar), moVar);
        }
        this.Q.y(moVar, yxVar);
    }

    public final void aB(di diVar) {
        ly lyVar = this.m;
        if (lyVar != null) {
            lyVar.V("Cannot remove item decoration during a scroll  or layout");
        }
        this.o.remove(diVar);
        if (this.o.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        N();
        requestLayout();
    }

    public void aC(dz dzVar) {
        List list = this.at;
        if (list != null) {
            list.remove(dzVar);
        }
    }

    public void aa(ls lsVar) {
        suppressLayout(false);
        ls lsVar2 = this.l;
        if (lsVar2 != null) {
            lsVar2.hn(this.W);
            this.l.hc(this);
        }
        U();
        this.g.j();
        ls lsVar3 = this.l;
        this.l = lsVar;
        if (lsVar != null) {
            lsVar.hm(this.W);
            lsVar.hb(this);
        }
        ly lyVar = this.m;
        if (lyVar != null) {
            lyVar.bt();
        }
        me meVar = this.e;
        ls lsVar4 = this.l;
        meVar.d();
        meVar.g(lsVar3, true);
        knf q = meVar.q();
        if (lsVar3 != null) {
            q.k();
        }
        if (q.a == 0) {
            q.j();
        }
        if (lsVar4 != null) {
            q.i();
        }
        meVar.e();
        this.J.f = true;
        T(false);
        requestLayout();
    }

    public void ab(ly lyVar) {
        if (lyVar == this.m) {
            return;
        }
        ai();
        if (this.m != null) {
            lv lvVar = this.B;
            if (lvVar != null) {
                lvVar.f();
            }
            this.m.aR(this.e);
            this.m.aS(this.e);
            this.e.d();
            if (this.p) {
                this.m.bx(this);
            }
            this.m.bc(null);
            this.m = null;
        } else {
            this.e.d();
        }
        jr jrVar = this.h;
        jrVar.a.d();
        int size = jrVar.b.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            jrVar.c.E((View) jrVar.b.get(size));
            jrVar.b.remove(size);
        }
        opu opuVar = jrVar.c;
        int B = opuVar.B();
        for (int i = 0; i < B; i++) {
            View D = opuVar.D(i);
            ((RecyclerView) opuVar.a).gL(D);
            D.clearAnimation();
        }
        ((RecyclerView) opuVar.a).removeAllViews();
        this.m = lyVar;
        if (lyVar != null) {
            if (lyVar.s != null) {
                throw new IllegalArgumentException("LayoutManager " + lyVar + " is already attached to a RecyclerView:" + lyVar.s.m());
            }
            this.m.bc(this);
            if (this.p) {
                this.m.bj();
            }
        }
        this.e.o();
        requestLayout();
    }

    public final void ac(int i) {
        if (i == this.C) {
            return;
        }
        this.C = i;
        if (i != 2) {
            aN();
        }
        ly lyVar = this.m;
        if (lyVar != null) {
            lyVar.aQ(i);
        }
        List list = this.at;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ((dz) this.at.get(size)).b(this, i);
        }
    }

    public final void ad(int i, int i2) {
        at(i, i2, Integer.MIN_VALUE);
    }

    public final void ae(int i) {
        if (this.s) {
            return;
        }
        ly lyVar = this.m;
        if (lyVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            lyVar.aq(this, i);
        }
    }

    public final void af() {
        int i = this.ad + 1;
        this.ad = i;
        if (i != 1 || this.s) {
            return;
        }
        this.r = false;
    }

    public final void ag(boolean z) {
        int i = this.ad;
        if (i <= 0) {
            this.ad = 1;
            i = 1;
        }
        if (!z && !this.s) {
            this.r = false;
        }
        if (i == 1) {
            if (z && this.r && !this.s && this.m != null && this.l != null) {
                B();
            }
            if (!this.s) {
                this.r = false;
            }
        }
        this.ad--;
    }

    public final void ah(int i) {
        aS().b(i);
    }

    public final void ai() {
        ac(0);
        aN();
    }

    public final boolean ak(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return aS().e(i, i2, iArr, iArr2, i3);
    }

    public final boolean al() {
        return !this.q || this.v || this.g.l();
    }

    public final boolean am() {
        AccessibilityManager accessibilityManager = this.ag;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public final boolean an() {
        return this.ah > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0111, code lost:
        if (r3 == 0.0f) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean ao(int r19, int r20, android.view.MotionEvent r21, int r22) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.ao(int, int, android.view.MotionEvent, int):boolean");
    }

    public void ar() {
    }

    public final void as(mo moVar, int i) {
        if (!an()) {
            aad.U(moVar.a, i);
            return;
        }
        moVar.p = i;
        this.P.add(moVar);
    }

    public final void at(int i, int i2, int i3) {
        au(i, i2, i3, false);
    }

    public final void au(int i, int i2, int i3, boolean z) {
        ly lyVar = this.m;
        if (lyVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.s) {
        } else {
            int i4 = 0;
            if (true != lyVar.ae()) {
                i = 0;
            }
            if (true != this.m.af()) {
                i2 = 0;
            }
            if (i == 0) {
                if (i2 == 0) {
                    return;
                }
                i = 0;
            }
            if (i3 == Integer.MIN_VALUE || i3 > 0) {
                if (z) {
                    if (i != 0) {
                        i4 = 1;
                    }
                    if (i2 != 0) {
                        i4 |= 2;
                    }
                    av(i4, 1);
                }
                this.G.c(i, i2, i3, null);
                return;
            }
            scrollBy(i, i2);
        }
    }

    public final void av(int i, int i2) {
        aS().i(i, i2);
    }

    public final void aw() {
        lv lvVar = this.B;
        if (lvVar != null) {
            lvVar.f();
            this.B.l = null;
        }
        this.B = null;
    }

    public final di ax(int i) {
        int e = e();
        if (i >= e) {
            throw new IndexOutOfBoundsException(i + " is an invalid index for size " + e);
        }
        return (di) this.o.get(i);
    }

    public final void ay(di diVar) {
        ly lyVar = this.m;
        if (lyVar != null) {
            lyVar.V("Cannot add item decoration during a scroll  or layout");
        }
        if (this.o.isEmpty()) {
            setWillNotDraw(false);
        }
        this.o.add(diVar);
        N();
        requestLayout();
    }

    public void az(dz dzVar) {
        if (this.at == null) {
            this.at = new ArrayList();
        }
        this.at.add(dzVar);
    }

    public final int c(View view) {
        mo j = j(view);
        if (j != null) {
            return j.a();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof lz) && this.m.x((lz) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        ly lyVar = this.m;
        if (lyVar != null && lyVar.ae()) {
            return this.m.F(this.J);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        ly lyVar = this.m;
        if (lyVar != null && lyVar.ae()) {
            return this.m.a(this.J);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        ly lyVar = this.m;
        if (lyVar != null && lyVar.ae()) {
            return this.m.b(this.J);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        ly lyVar = this.m;
        if (lyVar != null && lyVar.af()) {
            return lyVar.I(this.J);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        ly lyVar = this.m;
        if (lyVar != null && lyVar.af()) {
            return lyVar.c(this.J);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        ly lyVar = this.m;
        if (lyVar != null && lyVar.af()) {
            return lyVar.d(this.J);
        }
        return 0;
    }

    public final int d(View view) {
        mo j = j(view);
        if (j != null) {
            return j.c();
        }
        return -1;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return aS().c(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return aS().d(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return aS().e(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return aS().f(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.o.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((di) this.o.get(i)).g(canvas, this);
        }
        EdgeEffect edgeEffect = this.x;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.i ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.x;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.y;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.i) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.y;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.z;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.i ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.z;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.A;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.i) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.A;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || (this.B != null && this.o.size() > 0 && this.B.i())) {
            aad.G(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final int e() {
        return this.o.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0065, code lost:
        if (r3.findNextFocus(r13, r14, true != ((r13.m.av() == 1) ^ (r15 == 2)) ? 17 : 66) == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
        if (r3.findNextFocus(r13, r14, r15 == 2 ? 130 : 33) != null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
        gK();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
        if (gD(r14) != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
        af();
        r13.m.n(r14, r15, r13.e, r13.J);
        ag(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0195, code lost:
        if (r8 > 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b3, code lost:
        if (r10 > 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b6, code lost:
        if (r8 < 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b9, code lost:
        if (r10 < 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01c2, code lost:
        if ((r10 * r3) > 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01cf, code lost:
        if (r1 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01cb, code lost:
        if ((r10 * r3) < 0) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0107  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final mo gA(int i) {
        mo moVar = null;
        if (this.v) {
            return null;
        }
        int c2 = this.h.c();
        for (int i2 = 0; i2 < c2; i2++) {
            mo j = j(this.h.f(i2));
            if (j != null && !j.v() && gx(j) == i) {
                if (!this.h.k(j.a)) {
                    return j;
                }
                moVar = j;
            }
        }
        return moVar;
    }

    public final mo gB(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return j(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View gD(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            return r3
        L17:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.gD(android.view.View):android.view.View");
    }

    public final void gF(mo moVar) {
        View view = moVar.a;
        ViewParent parent = view.getParent();
        this.e.n(gB(view));
        if (moVar.x()) {
            this.h.h(view, -1, view.getLayoutParams(), true);
        } else if (parent != this) {
            this.h.g(view, -1, true);
        } else {
            jr jrVar = this.h;
            int C = jrVar.c.C(view);
            if (C < 0) {
                new StringBuilder("view is not a child, cannot hide ").append(view);
                throw new IllegalArgumentException("view is not a child, cannot hide ".concat(view.toString()));
            }
            jrVar.a.e(C);
            jrVar.j(view);
        }
    }

    public final void gG(String str) {
        if (an()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(m()));
        } else if (this.ai <= 0) {
        } else {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("".concat(m())));
        }
    }

    final void gH() {
        int c2 = this.h.c();
        for (int i = 0; i < c2; i++) {
            mo j = j(this.h.f(i));
            if (!j.A()) {
                j.g();
            }
        }
        me meVar = this.e;
        int size = meVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((mo) meVar.c.get(i2)).g();
        }
        int size2 = meVar.a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((mo) meVar.a.get(i3)).g();
        }
        ArrayList arrayList = meVar.b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((mo) meVar.b.get(i4)).g();
            }
        }
    }

    public void gI() {
        List list = this.at;
        if (list != null) {
            list.clear();
        }
    }

    public final void gJ(int i, int i2) {
        EdgeEffect edgeEffect = this.x;
        boolean z = false;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.x.onRelease();
            z = this.x.isFinished();
        }
        EdgeEffect edgeEffect2 = this.z;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.z.onRelease();
            z |= this.z.isFinished();
        }
        EdgeEffect edgeEffect3 = this.y;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.y.onRelease();
            z |= this.y.isFinished();
        }
        EdgeEffect edgeEffect4 = this.A;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.A.onRelease();
            z |= this.A.isFinished();
        }
        if (z) {
            aad.G(this);
        }
    }

    public final void gK() {
        if (!this.q || this.v) {
            B();
        } else if (!this.g.l()) {
        } else {
            if (!this.g.k(4) || this.g.k(11)) {
                if (!this.g.l()) {
                    return;
                }
                B();
                return;
            }
            af();
            P();
            this.g.g();
            if (!this.r) {
                int a2 = this.h.a();
                int i = 0;
                while (true) {
                    if (i < a2) {
                        mo j = j(this.h.e(i));
                        if (j != null && !j.A() && j.y()) {
                            B();
                            break;
                        }
                        i++;
                    } else {
                        this.g.d();
                        break;
                    }
                }
            }
            ag(true);
            Q();
        }
    }

    public final void gL(View view) {
        mo j = j(view);
        ls lsVar = this.l;
        if (lsVar != null && j != null) {
            lsVar.s(j);
        }
        List list = this.u;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                ((ma) this.u.get(size)).b(view);
            }
        }
    }

    public final void gM(int i, int i2) {
        this.ai++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        ar();
        List list = this.at;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((dz) this.at.get(size)).c(this, i, i2);
            }
        }
        this.ai--;
    }

    public final void gN() {
        if (this.A != null) {
            return;
        }
        EdgeEffect b2 = this.aB.b(this);
        this.A = b2;
        if (this.i) {
            b2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            b2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void gO() {
        if (this.x != null) {
            return;
        }
        EdgeEffect b2 = this.aB.b(this);
        this.x = b2;
        if (this.i) {
            b2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            b2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ly lyVar = this.m;
        if (lyVar == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager".concat(m()));
        }
        return lyVar.j();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        ly lyVar = this.m;
        if (lyVar == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager".concat(m()));
        }
        return lyVar.l(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.support.v7.widget.RecyclerView";
    }

    @Override // android.view.View
    public final int getBaseline() {
        if (this.m != null) {
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final boolean getClipToPadding() {
        return this.i;
    }

    public final int gx(mo moVar) {
        if (moVar.q(524) || !moVar.s()) {
            return -1;
        }
        hy hyVar = this.g;
        int i = moVar.c;
        int size = hyVar.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            hx hxVar = (hx) hyVar.a.get(i2);
            int i3 = hxVar.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = hxVar.b;
                    if (i4 <= i) {
                        int i5 = hxVar.d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = hxVar.b;
                    if (i6 == i) {
                        i = hxVar.d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (hxVar.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (hxVar.b <= i) {
                i += hxVar.d;
            }
        }
        return i;
    }

    final long gy(mo moVar) {
        return this.l.b ? moVar.e : moVar.c;
    }

    public final Rect gz(View view) {
        lz lzVar = (lz) view.getLayoutParams();
        if (!lzVar.e) {
            return lzVar.d;
        }
        if (!this.J.g || (!lzVar.b() && !lzVar.c.t())) {
            Rect rect = lzVar.d;
            rect.set(0, 0, 0, 0);
            int size = this.o.size();
            for (int i = 0; i < size; i++) {
                this.j.set(0, 0, 0, 0);
                ((di) this.o.get(i)).e(this.j, view, this, this.J);
                rect.left += this.j.left;
                rect.top += this.j.top;
                rect.right += this.j.right;
                rect.bottom += this.j.bottom;
            }
            lzVar.e = false;
            return rect;
        }
        return lzVar.d;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return aS().h(0);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.p;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.s;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return aS().a;
    }

    public final String m() {
        return " " + super.toString() + ", adapter:" + this.l + ", layout:" + this.m + ", context:" + getContext();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.ah = 0;
        boolean z = true;
        this.p = true;
        if (!this.q || isLayoutRequested()) {
            z = false;
        }
        this.q = z;
        this.e.e();
        ly lyVar = this.m;
        if (lyVar != null) {
            lyVar.bj();
        }
        this.M = false;
        if (b) {
            kr krVar = (kr) kr.a.get();
            this.H = krVar;
            if (krVar == null) {
                this.H = new kr();
                Display o = aad.o(this);
                float f = 60.0f;
                if (!isInEditMode() && o != null) {
                    float refreshRate = o.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                kr krVar2 = this.H;
                krVar2.e = 1.0E9f / f;
                kr.a.set(krVar2);
            }
            this.H.c.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        kr krVar;
        super.onDetachedFromWindow();
        lv lvVar = this.B;
        if (lvVar != null) {
            lvVar.f();
        }
        ai();
        this.p = false;
        ly lyVar = this.m;
        if (lyVar != null) {
            lyVar.bx(this);
        }
        this.P.clear();
        removeCallbacks(this.ax);
        do {
        } while (oh.a.a() != null);
        me meVar = this.e;
        for (int i = 0; i < meVar.c.size(); i++) {
            uq.d(((mo) meVar.c.get(i)).a);
        }
        meVar.f(meVar.g.l);
        Iterator a2 = new oml(this, 1).a();
        while (a2.hasNext()) {
            uq.e((View) a2.next()).n();
        }
        if (!b || (krVar = this.H) == null) {
            return;
        }
        krVar.c.remove(this);
        this.H = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.o.size();
        for (int i = 0; i < size; i++) {
            ((di) this.o.get(i)).f(canvas, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cb, code lost:
        if (r0 != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0191, code lost:
        if (r11.C != 2) goto L83;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        B();
        this.q = true;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        ly lyVar = this.m;
        if (lyVar == null) {
            z(i, i2);
            return;
        }
        boolean z = false;
        if (lyVar.ag()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.m.bu(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.ay = z;
            if (z || this.l == null) {
                return;
            }
            if (this.J.d == 1) {
                aF();
            }
            this.m.aZ(i, i2);
            this.J.i = true;
            aG();
            this.m.bb(i, i2);
            if (this.m.aj()) {
                this.m.aZ(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.J.i = true;
                aG();
                this.m.bb(i, i2);
            }
            this.az = getMeasuredWidth();
            this.aA = getMeasuredHeight();
            return;
        }
        if (this.t) {
            af();
            P();
            aJ();
            Q();
            ml mlVar = this.J;
            if (mlVar.k) {
                mlVar.g = true;
            } else {
                this.g.e();
                this.J.g = false;
            }
            this.t = false;
            ag(false);
        } else if (this.J.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        ls lsVar = this.l;
        if (lsVar != null) {
            this.J.e = lsVar.ha();
        } else {
            this.J.e = 0;
        }
        af();
        this.m.bu(i, i2);
        ag(false);
        this.J.g = false;
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (an()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof mh)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        mh mhVar = (mh) parcelable;
        this.f = mhVar;
        super.onRestoreInstanceState(mhVar.d);
        requestLayout();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        mh mhVar = new mh(super.onSaveInstanceState());
        mh mhVar2 = this.f;
        if (mhVar2 != null) {
            mhVar.a = mhVar2.a;
        } else {
            ly lyVar = this.m;
            mhVar.a = lyVar != null ? lyVar.R() : null;
        }
        return mhVar;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        K();
    }

    /* JADX WARN: Code restructure failed: missing block: B:226:0x03b1, code lost:
        if (r0 < r15) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0185, code lost:
        if (r0 != 0) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ff  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 1075
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void r(ma maVar) {
        if (this.u == null) {
            this.u = new ArrayList();
        }
        this.u.add(maVar);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        mo j = j(view);
        if (j != null) {
            if (j.x()) {
                j.j();
            } else if (!j.A()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + j + m());
            }
        }
        view.clearAnimation();
        gL(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.m.bf() && !an() && view2 != null) {
            aK(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.m.bh(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.ab.size();
        for (int i = 0; i < size; i++) {
            ((mc) this.ab.get(i)).h(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.ad != 0 || this.s) {
            this.r = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(mc mcVar) {
        this.ab.add(mcVar);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        ly lyVar = this.m;
        if (lyVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.s) {
        } else {
            boolean ae = lyVar.ae();
            boolean af = this.m.af();
            if (!ae) {
                if (!af) {
                    return;
                }
                af = true;
            }
            if (true != ae) {
                i = 0;
            }
            if (true != af) {
                i2 = 0;
            }
            ao(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!an()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
            return;
        }
        int i = 0;
        int a2 = accessibilityEvent != null ? abh.a(accessibilityEvent) : 0;
        if (a2 != 0) {
            i = a2;
        }
        this.af |= i;
    }

    @Override // android.view.ViewGroup
    public final void setClipToPadding(boolean z) {
        if (z != this.i) {
            K();
        }
        this.i = z;
        super.setClipToPadding(z);
        if (this.q) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        aS().a(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return aS().i(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        aS().b(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.s) {
            gG("Do not suppressLayout in layout or scroll");
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.s = true;
                this.ae = true;
                ai();
                return;
            }
            this.s = false;
            if (this.r && this.m != null && this.l != null) {
                requestLayout();
            }
            this.r = false;
        }
    }

    public final void z(int i, int i2) {
        setMeasuredDimension(ly.ar(i, getPaddingLeft() + getPaddingRight(), aad.h(this)), ly.ar(i2, getPaddingTop() + getPaddingBottom(), aad.g(this)));
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f16320_resource_name_obfuscated_res_0x7f040655);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        this.W = new mg(this);
        this.e = new me(this);
        kq kqVar = null;
        this.Q = new bek(null, null, null);
        this.j = new Rect();
        this.aa = new Rect();
        this.k = new RectF();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.ab = new ArrayList();
        this.ad = 0;
        this.v = false;
        this.w = false;
        this.ah = 0;
        this.ai = 0;
        this.aB = d;
        this.B = new lv(null);
        this.C = 0;
        this.aj = -1;
        this.aq = Float.MIN_VALUE;
        this.ar = Float.MIN_VALUE;
        this.as = true;
        this.G = new mn(this);
        this.I = b ? new kq() : kqVar;
        this.J = new ml();
        this.K = false;
        this.L = false;
        this.aD = new opu(this);
        this.M = false;
        this.au = new int[2];
        this.av = new int[2];
        this.aw = new int[2];
        this.O = new int[2];
        this.P = new ArrayList();
        this.ax = new az(this, 16);
        this.az = 0;
        this.aA = 0;
        this.aE = new opu(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.D = viewConfiguration.getScaledTouchSlop();
        this.aq = aag.a(viewConfiguration, context);
        this.ar = aag.b(viewConfiguration, context);
        this.F = viewConfiguration.getScaledMinimumFlingVelocity();
        this.ap = viewConfiguration.getScaledMaximumFlingVelocity();
        this.V = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.B.l = this.aD;
        this.g = new hy(new opu(this), null, null, null, null, null, null);
        this.h = new jr(new opu(this), null, null, null, null);
        if (aad.e(this) == 0) {
            aad.ao(this);
        }
        if (aad.d(this) == 0) {
            aad.U(this, 1);
        }
        this.ag = (AccessibilityManager) getContext().getSystemService("accessibility");
        Z(new mq(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ex.a, i, 0);
        aad.L(this, context, ex.a, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.i = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables.".concat(m()));
            }
            Resources resources = getContext().getResources();
            str = string;
            new kn(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.f34190_resource_name_obfuscated_res_0x7f07018c), resources.getDimensionPixelSize(R.dimen.f34210_resource_name_obfuscated_res_0x7f07018e), resources.getDimensionPixelOffset(R.dimen.f34200_resource_name_obfuscated_res_0x7f07018d));
        } else {
            str = string;
        }
        obtainStyledAttributes.recycle();
        aR(context, str, attributeSet, i);
        int[] iArr = S;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        aad.L(this, context, iArr, attributeSet, obtainStyledAttributes2, i, 0);
        boolean z = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
        setTag(R.id.f56750_resource_name_obfuscated_res_0x7f0b02a6, true);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ly lyVar = this.m;
        if (lyVar == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager".concat(m()));
        }
        return lyVar.k(layoutParams);
    }
}
