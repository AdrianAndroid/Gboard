package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    static boolean a = true;
    public int c;
    LinearLayoutManager e;
    public RecyclerView f;
    public alt g;
    public alr h;
    public wi m;
    private Parcelable q;
    private lr r;
    private alq s;
    private aqr t;
    private final Rect n = new Rect();
    private final Rect o = new Rect();
    public alq b = new alq();
    public boolean d = false;
    public dg l = new alu(this);
    private int p = -1;
    public boolean i = false;
    public boolean j = true;
    public int k = -1;

    public ViewPager2(Context context) {
        super(context);
        i(context, null);
    }

    private final void i(Context context, AttributeSet attributeSet) {
        this.m = a ? new amd(this) : new aly(this);
        amf amfVar = new amf(this, context);
        this.f = amfVar;
        amfVar.setId(aad.c());
        this.f.setDescendantFocusability(131072);
        ama amaVar = new ama(this);
        this.e = amaVar;
        this.f.ab(amaVar);
        RecyclerView recyclerView = this.f;
        recyclerView.D = ViewConfiguration.get(recyclerView.getContext()).getScaledPagingTouchSlop();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aln.a);
        aad.L(this, context, aln.a, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            this.e.ac(obtainStyledAttributes.getInt(0, 0));
            this.m.n();
            obtainStyledAttributes.recycle();
            this.f.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f.r(new alx());
            this.g = new alt(this);
            alt altVar = this.g;
            RecyclerView recyclerView2 = this.f;
            this.t = new aqr(altVar);
            ame ameVar = new ame(this);
            this.r = ameVar;
            RecyclerView recyclerView3 = ameVar.a;
            if (recyclerView3 != recyclerView2) {
                if (recyclerView3 != null) {
                    recyclerView3.aC(ameVar.b);
                    ameVar.a.E = null;
                }
                ameVar.a = recyclerView2;
                RecyclerView recyclerView4 = ameVar.a;
                if (recyclerView4 != null) {
                    if (recyclerView4.E != null) {
                        throw new IllegalStateException("An instance of OnFlingListener already set.");
                    }
                    recyclerView4.az(ameVar.b);
                    RecyclerView recyclerView5 = ameVar.a;
                    recyclerView5.E = ameVar;
                    new Scroller(recyclerView5.getContext(), new DecelerateInterpolator());
                    ameVar.f();
                }
            }
            this.f.az(this.g);
            alq alqVar = new alq();
            this.s = alqVar;
            this.g.e = alqVar;
            alv alvVar = new alv(this);
            alw alwVar = new alw(this);
            alqVar.h(alvVar);
            this.s.h(alwVar);
            this.m.t(this.f);
            this.s.h(this.b);
            alr alrVar = new alr(this.e);
            this.h = alrVar;
            this.s.h(alrVar);
            RecyclerView recyclerView6 = this.f;
            attachViewToParent(recyclerView6, 0, recyclerView6.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final int a() {
        return this.e.j == 1 ? 1 : 0;
    }

    public final int b() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f;
        if (a() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public final ls c() {
        return this.f.l;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f.canScrollVertically(i);
    }

    public final void d() {
        ls c;
        if (this.p == -1 || (c = c()) == null) {
            return;
        }
        if (this.q != null) {
            if (c instanceof alo) {
                ((alo) c).b();
            }
            this.q = null;
        }
        int max = Math.max(0, Math.min(this.p, c.ha() - 1));
        this.c = max;
        this.p = -1;
        this.f.Y(max);
        this.m.j();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof amg) {
            int i = ((amg) parcelable).a;
            sparseArray.put(this.f.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        d();
    }

    public final void e() {
        lr lrVar = this.r;
        if (lrVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View c = lrVar.c(this.e);
        if (c == null) {
            return;
        }
        int bo = LinearLayoutManager.bo(c);
        if (bo != this.c && this.g.b == 0) {
            this.s.g(bo);
        }
        this.d = false;
    }

    public final boolean f() {
        return this.e.av() == 1;
    }

    public final void g() {
        Object obj = this.t.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        if (this.m.p()) {
            return this.m.d();
        }
        return super.getAccessibilityClassName();
    }

    public final void h(int i) {
        int i2;
        ls c = c();
        if (c == null) {
            if (this.p == -1) {
                return;
            }
            this.p = Math.max(i, 0);
        } else if (c.ha() <= 0) {
        } else {
            int min = Math.min(Math.max(i, 0), c.ha() - 1);
            if ((min == this.c && this.g.g()) || min == (i2 = this.c)) {
                return;
            }
            double d = i2;
            this.c = min;
            this.m.m();
            if (!this.g.g()) {
                d = this.g.d();
            }
            alt altVar = this.g;
            altVar.a = 2;
            int i3 = altVar.c;
            altVar.c = min;
            altVar.f(2);
            if (i3 != min) {
                altVar.e(min);
            }
            double d2 = min;
            Double.isNaN(d2);
            if (Math.abs(d2 - d) > 3.0d) {
                this.f.Y(d2 > d ? min - 3 : min + 3);
                RecyclerView recyclerView = this.f;
                recyclerView.post(new amh(min, recyclerView, 0));
                return;
            }
            this.f.ae(min);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.m.g(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f.getMeasuredWidth();
        int measuredHeight = this.f.getMeasuredHeight();
        this.n.left = getPaddingLeft();
        this.n.right = (i3 - i) - getPaddingRight();
        this.n.top = getPaddingTop();
        this.n.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.n, this.o);
        this.f.layout(this.o.left, this.o.top, this.o.right, this.o.bottom);
        if (this.d) {
            e();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        measureChild(this.f, i, i2);
        int measuredWidth = this.f.getMeasuredWidth();
        int measuredHeight = this.f.getMeasuredHeight();
        int measuredState = this.f.getMeasuredState();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        setMeasuredDimension(resolveSizeAndState(Math.max(measuredWidth + paddingLeft + paddingRight, getSuggestedMinimumWidth()), i, measuredState), resolveSizeAndState(Math.max(measuredHeight + paddingTop + paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof amg)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        amg amgVar = (amg) parcelable;
        super.onRestoreInstanceState(amgVar.getSuperState());
        this.p = amgVar.b;
        this.q = amgVar.c;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        amg amgVar = new amg(super.onSaveInstanceState());
        amgVar.a = this.f.getId();
        int i = this.p;
        if (i == -1) {
            i = this.c;
        }
        amgVar.b = i;
        Parcelable parcelable = this.q;
        if (parcelable != null) {
            amgVar.c = parcelable;
        } else {
            ls lsVar = this.f.l;
            if (lsVar instanceof alo) {
                amgVar.c = ((alo) lsVar).a();
            }
        }
        return amgVar;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" does not support direct child views"));
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (this.m.s(i)) {
            this.m.v(i);
            return true;
        }
        return super.performAccessibilityAction(i, bundle);
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.m.l();
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        i(context, attributeSet);
    }
}
