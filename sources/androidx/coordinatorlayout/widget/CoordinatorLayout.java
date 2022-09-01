package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements yv, yw {
    static final String a;
    static final Class[] b;
    static final ThreadLocal c;
    static final Comparator d;
    private static final xx h;
    public abc e;
    public boolean f;
    public ViewGroup.OnHierarchyChangeListener g;
    private final List i;
    private final List j;
    private final int[] k;
    private final int[] l;
    private boolean m;
    private boolean n;
    private int[] o;
    private View p;
    private View q;
    private boolean r;
    private Drawable s;
    private yy t;
    private final yx u;
    private dcf v;
    private final bhc w;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        a = r0 != null ? r0.getName() : null;
        d = new kp(3);
        b = new Class[]{Context.class, AttributeSet.class};
        c = new ThreadLocal();
        h = new xz(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    private static final void A(int i, Rect rect, Rect rect2, tr trVar, int i2, int i3) {
        int width;
        int height;
        int i4 = trVar.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int absoluteGravity2 = Gravity.getAbsoluteGravity(q(trVar.d), i);
        int i5 = absoluteGravity & 7;
        int i6 = absoluteGravity & 112;
        int i7 = absoluteGravity2 & 112;
        int i8 = absoluteGravity2 & 7;
        if (i8 == 1) {
            width = rect.left + (rect.width() / 2);
        } else if (i8 == 5) {
            width = rect.right;
        } else {
            width = rect.left;
        }
        if (i7 == 16) {
            height = (rect.height() / 2) + rect.top;
        } else if (i7 == 80) {
            height = rect.bottom;
        } else {
            height = rect.top;
        }
        if (i5 == 1) {
            width -= i2 / 2;
        } else if (i5 != 5) {
            width -= i2;
        }
        if (i6 == 16) {
            height -= i3 / 2;
        } else if (i6 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    private static final MotionEvent B(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        return obtain;
    }

    private static final void C(View view, int i) {
        tr trVar = (tr) view.getLayoutParams();
        int i2 = trVar.i;
        if (i2 != i) {
            aad.E(view, i - i2);
            trVar.i = i;
        }
    }

    private static final void D(View view, int i) {
        tr trVar = (tr) view.getLayoutParams();
        int i2 = trVar.j;
        if (i2 != i) {
            aad.F(view, i - i2);
            trVar.j = i;
        }
    }

    public static tp a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = String.valueOf(context.getPackageName()).concat(String.valueOf(str));
        } else if (str.indexOf(46) < 0) {
            String str2 = a;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = c;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (tp) constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass ".concat(String.valueOf(str)), e);
        }
    }

    static final tr n(View view) {
        tr trVar = (tr) view.getLayoutParams();
        if (!trVar.b) {
            if (view instanceof to) {
                tp a2 = ((to) view).a();
                if (a2 == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                trVar.b(a2);
                trVar.b = true;
            } else {
                tq tqVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    tqVar = (tq) cls.getAnnotation(tq.class);
                    if (tqVar != null) {
                        break;
                    }
                }
                if (tqVar != null) {
                    try {
                        trVar.b((tp) tqVar.a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + tqVar.a().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
                trVar.b = true;
            }
        }
        return trVar;
    }

    private final int p(int i) {
        int[] iArr = this.o;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        } else if (i < 0 || i >= iArr.length) {
            Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
            return 0;
        } else {
            return iArr[i];
        }
    }

    private static int q(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    private static int r(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    private static Rect s() {
        Rect rect = (Rect) h.a();
        return rect == null ? new Rect() : rect;
    }

    private final void u(tr trVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + trVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - trVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + trVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - trVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    private static void v(Rect rect) {
        rect.setEmpty();
        h.b(rect);
    }

    private final void w() {
        View view = this.p;
        if (view != null) {
            tp tpVar = ((tr) view.getLayoutParams()).a;
            if (tpVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                tpVar.j(this, this.p, obtain);
                obtain.recycle();
            }
            this.p = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((tr) getChildAt(i).getLayoutParams()).m = false;
        }
        this.m = false;
    }

    private final void x() {
        if (aad.ad(this)) {
            if (this.t == null) {
                this.t = new kry(this, 1);
            }
            aad.V(this, this.t);
            setSystemUiVisibility(1280);
            return;
        }
        aad.V(this, null);
    }

    private final boolean y(tp tpVar, View view, MotionEvent motionEvent, int i) {
        if (i != 0) {
            return tpVar.j(this, view, motionEvent);
        }
        return tpVar.f(this, view, motionEvent);
    }

    private final boolean z(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.j;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Comparator comparator = d;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) list.get(i3);
            tr trVar = (tr) view.getLayoutParams();
            tp tpVar = trVar.a;
            if (!z || actionMasked == 0) {
                if (!z && tpVar != null && (z = y(tpVar, view, motionEvent, i))) {
                    this.p = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i4 = 0; i4 < i3; i4++) {
                            View view2 = (View) list.get(i4);
                            tp tpVar2 = ((tr) view2.getLayoutParams()).a;
                            if (tpVar2 != null) {
                                if (motionEvent2 == null) {
                                    motionEvent2 = B(motionEvent);
                                }
                                y(tpVar2, view2, motionEvent2, i);
                            }
                        }
                    }
                }
                if (trVar.a == null) {
                    trVar.m = false;
                }
                boolean z2 = trVar.m;
            } else if (tpVar != null) {
                if (motionEvent2 == null) {
                    motionEvent2 = B(motionEvent);
                }
                y(tpVar, view, motionEvent2, i);
            }
        }
        list.clear();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return z;
    }

    public final List b(View view) {
        bhc bhcVar = this.w;
        int i = ((qv) bhcVar.a).d;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) ((qv) bhcVar.a).f(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((qv) bhcVar.a).c(i2));
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    public final List c(View view) {
        ArrayList a2 = this.w.a(view);
        ArrayList arrayList = a2 == null ? null : new ArrayList(a2);
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof tr) && super.checkLayoutParams(layoutParams);
    }

    @Override // defpackage.yv
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
        tp tpVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                tr trVar = (tr) childAt.getLayoutParams();
                if (trVar.d(i3) && (tpVar = trVar.a) != null) {
                    int[] iArr2 = this.k;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    tpVar.c(this, childAt, view, i, i2, iArr2, i3);
                    if (i > 0) {
                        min = Math.max(i4, this.k[0]);
                    } else {
                        min = Math.min(i4, this.k[0]);
                    }
                    i4 = min;
                    if (i2 > 0) {
                        min2 = Math.max(i5, this.k[1]);
                    } else {
                        min2 = Math.min(i5, this.k[1]);
                    }
                    i5 = min2;
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            k(1);
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        tp tpVar = ((tr) view.getLayoutParams()).a;
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.s;
        if (drawable == null || !drawable.isStateful() || !drawable.setState(drawableState)) {
            return;
        }
        invalidate();
    }

    @Override // defpackage.yv
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        f(view, i, i2, i3, i4, 0, this.l);
    }

    @Override // defpackage.yw
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        tp tpVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                tr trVar = (tr) childAt.getLayoutParams();
                if (trVar.d(i5) && (tpVar = trVar.a) != null) {
                    int[] iArr2 = this.k;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    tpVar.o(this, childAt, i2, i3, i4, iArr2);
                    if (i3 > 0) {
                        min = Math.max(i6, this.k[0]);
                    } else {
                        min = Math.min(i6, this.k[0]);
                    }
                    i6 = min;
                    if (i4 > 0) {
                        min2 = Math.max(i7, this.k[1]);
                    } else {
                        min2 = Math.min(i7, this.k[1]);
                    }
                    i7 = min2;
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            k(1);
        }
    }

    @Override // defpackage.yv
    public final void g(View view, View view2, int i, int i2) {
        this.u.b(i, i2);
        this.q = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            tr trVar = (tr) getChildAt(i3).getLayoutParams();
            if (trVar.d(i2)) {
                tp tpVar = trVar.a;
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new tr();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new tr(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.u.a();
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // defpackage.yv
    public final void h(View view, int i) {
        this.u.c(i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            tr trVar = (tr) childAt.getLayoutParams();
            if (trVar.d(i)) {
                tp tpVar = trVar.a;
                if (tpVar != null) {
                    tpVar.d(this, childAt, view, i);
                }
                trVar.c(i, false);
                trVar.a();
            }
        }
        this.q = null;
    }

    public final void i(View view) {
        ArrayList a2 = this.w.a(view);
        if (a2 == null || a2.isEmpty()) {
            return;
        }
        for (int i = 0; i < a2.size(); i++) {
            View view2 = (View) a2.get(i);
            tp tpVar = ((tr) view2.getLayoutParams()).a;
            if (tpVar != null) {
                tpVar.e(this, view2, view);
            }
        }
    }

    final void j(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            tt.a(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0287  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r25) {
        /*
            Method dump skipped, instructions count: 719
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.k(int):void");
    }

    public final void l(View view, int i) {
        Rect s;
        Rect s2;
        int i2;
        tr trVar = (tr) view.getLayoutParams();
        View view2 = trVar.k;
        if (view2 != null || trVar.f == -1) {
            if (view2 != null) {
                s = s();
                s2 = s();
                try {
                    tt.a(this, view2, s);
                    tr trVar2 = (tr) view.getLayoutParams();
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    A(i, s, s2, trVar2, measuredWidth, measuredHeight);
                    u(trVar2, s2, measuredWidth, measuredHeight);
                    view.layout(s2.left, s2.top, s2.right, s2.bottom);
                    return;
                } finally {
                    v(s);
                    v(s2);
                }
            }
            int i3 = trVar.e;
            if (i3 < 0) {
                tr trVar3 = (tr) view.getLayoutParams();
                s = s();
                s.set(getPaddingLeft() + trVar3.leftMargin, getPaddingTop() + trVar3.topMargin, (getWidth() - getPaddingRight()) - trVar3.rightMargin, (getHeight() - getPaddingBottom()) - trVar3.bottomMargin);
                if (this.e != null && aad.ad(this) && !aad.ad(view)) {
                    s.left += this.e.b();
                    s.top += this.e.d();
                    s.right -= this.e.c();
                    s.bottom -= this.e.a();
                }
                s2 = s();
                yo.a(q(trVar3.c), view.getMeasuredWidth(), view.getMeasuredHeight(), s, s2, i);
                view.layout(s2.left, s2.top, s2.right, s2.bottom);
                return;
            }
            tr trVar4 = (tr) view.getLayoutParams();
            int absoluteGravity = Gravity.getAbsoluteGravity(r(trVar4.c), i);
            int i4 = absoluteGravity & 7;
            int i5 = absoluteGravity & 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            if (i == 1) {
                i3 = width - i3;
            }
            int p = p(i3) - measuredWidth2;
            if (i4 == 1) {
                p += measuredWidth2 / 2;
            } else if (i4 == 5) {
                p += measuredWidth2;
            }
            if (i5 != 16) {
                i2 = i5 != 80 ? 0 : measuredHeight2;
            } else {
                i2 = measuredHeight2 / 2;
            }
            int max = Math.max(getPaddingLeft() + trVar4.leftMargin, Math.min(p, ((width - getPaddingRight()) - measuredWidth2) - trVar4.rightMargin));
            int max2 = Math.max(getPaddingTop() + trVar4.topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - trVar4.bottomMargin));
            view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
            return;
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    public final boolean m(View view, int i, int i2) {
        Rect s = s();
        tt.a(this, view, s);
        try {
            return s.contains(i, i2);
        } finally {
            v(s);
        }
    }

    public final void o(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w();
        if (this.r) {
            if (this.v == null) {
                this.v = new dcf(this, 1);
            }
            getViewTreeObserver().addOnPreDrawListener(this.v);
        }
        if (this.e == null && aad.ad(this)) {
            aad.K(this);
        }
        this.n = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        w();
        if (this.r && this.v != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.v);
        }
        View view = this.q;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.n = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f || this.s == null) {
            return;
        }
        abc abcVar = this.e;
        int d2 = abcVar != null ? abcVar.d() : 0;
        if (d2 <= 0) {
            return;
        }
        this.s.setBounds(0, 0, getWidth(), d2);
        this.s.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            w();
            actionMasked = 0;
        }
        boolean z = z(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.p = null;
            w();
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        tp tpVar;
        int f = aad.f(this);
        int size = this.i.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.i.get(i5);
            if (view.getVisibility() != 8 && ((tpVar = ((tr) view.getLayoutParams()).a) == null || !tpVar.g(this, view, f))) {
                l(view, f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0364  */
    /* JADX WARN: Type inference failed for: r4v36, types: [xx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v26, types: [xx, java.lang.Object] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 977
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                tr trVar = (tr) childAt.getLayoutParams();
                if (trVar.n) {
                    tp tpVar = trVar.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        tp tpVar;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                tr trVar = (tr) childAt.getLayoutParams();
                if (trVar.n && (tpVar = trVar.a) != null) {
                    z |= tpVar.n(view);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        d(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        e(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        g(view, view2, i, 0);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof ts)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ts tsVar = (ts) parcelable;
        super.onRestoreInstanceState(tsVar.d);
        SparseArray sparseArray = tsVar.a;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            tp tpVar = n(childAt).a;
            if (id != -1 && tpVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                tpVar.p(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable q;
        ts tsVar = new ts(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            tp tpVar = ((tr) childAt.getLayoutParams()).a;
            if (id != -1 && tpVar != null && (q = tpVar.q(childAt)) != null) {
                sparseArray.append(id, q);
            }
        }
        tsVar.a = sparseArray;
        return tsVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return t(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        h(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.p;
        boolean z2 = false;
        if (view != null) {
            tp tpVar = ((tr) view.getLayoutParams()).a;
            z = tpVar != null ? tpVar.j(this, this.p, motionEvent) : false;
        } else {
            z = z(motionEvent, 1);
            if (actionMasked != 0 && z) {
                z2 = true;
            }
        }
        if (this.p == null || actionMasked == 3) {
            z |= super.onTouchEvent(motionEvent);
        } else if (z2) {
            MotionEvent B = B(motionEvent);
            super.onTouchEvent(B);
            B.recycle();
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.p = null;
            w();
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        tp tpVar = ((tr) view.getLayoutParams()).a;
        if (tpVar == null || !tpVar.h(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.m) {
            return;
        }
        if (this.p == null) {
            int childCount = getChildCount();
            MotionEvent motionEvent = null;
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                tp tpVar = ((tr) childAt.getLayoutParams()).a;
                if (tpVar != null) {
                    if (motionEvent == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    tpVar.f(this, childAt, motionEvent);
                }
            }
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        w();
        this.m = true;
    }

    @Override // android.view.View
    public final void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        x();
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.g = onHierarchyChangeListener;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.s;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.s.setVisible(z, false);
    }

    @Override // defpackage.yv
    public final boolean t(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                tr trVar = (tr) childAt.getLayoutParams();
                tp tpVar = trVar.a;
                if (tpVar != null) {
                    boolean i4 = tpVar.i(this, childAt, view, view2, i, i2);
                    z |= i4;
                    trVar.c(i2, i4);
                } else {
                    trVar.c(i2, false);
                }
            }
        }
        return z;
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.s;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f10340_resource_name_obfuscated_res_0x7f04037d);
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof tr) {
            return new tr((tr) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new tr((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new tr(layoutParams);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes;
        this.i = new ArrayList();
        this.w = new bhc(null);
        this.j = new ArrayList();
        this.k = new int[2];
        this.l = new int[2];
        this.u = new yx();
        if (i == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tn.a, 0, R.style.f208090_resource_name_obfuscated_res_0x7f150a7e);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tn.a, i, 0);
        }
        if (i == 0) {
            aad.L(this, context, tn.a, attributeSet, obtainStyledAttributes, 0, R.style.f208090_resource_name_obfuscated_res_0x7f150a7e);
        } else {
            aad.L(this, context, tn.a, attributeSet, obtainStyledAttributes, i, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.o = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.o.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.o;
                iArr[i2] = (int) (iArr[i2] * f);
            }
        }
        this.s = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        x();
        super.setOnHierarchyChangeListener(new coz(this, 1));
        if (aad.d(this) == 0) {
            aad.U(this, 1);
        }
    }
}
