package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    SparseArray a = new SparseArray();
    private final ArrayList c = new ArrayList(100);
    m b = new m();
    private int d = 0;
    private int e = 0;
    private int f = Integer.MAX_VALUE;
    private int g = Integer.MAX_VALUE;
    private boolean h = true;
    private int i = 2;
    private c j = null;

    public ConstraintLayout(Context context) {
        super(context);
        e(null);
    }

    protected static final a b() {
        return new a();
    }

    private final l c(int i) {
        if (i == 0) {
            return this.b;
        }
        View view = (View) this.a.get(i);
        if (view == this) {
            return this.b;
        }
        if (view != null) {
            return ((a) view.getLayoutParams()).Y;
        }
        return null;
    }

    private final l d(View view) {
        if (view == this) {
            return this.b;
        }
        if (view != null) {
            return ((a) view.getLayoutParams()).Y;
        }
        return null;
    }

    private final void e(AttributeSet attributeSet) {
        this.b.J = this;
        this.a.put(getId(), this);
        this.j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 16) {
                    this.d = obtainStyledAttributes.getDimensionPixelOffset(16, this.d);
                } else if (index == 17) {
                    this.e = obtainStyledAttributes.getDimensionPixelOffset(17, this.e);
                } else if (index == 14) {
                    this.f = obtainStyledAttributes.getDimensionPixelOffset(14, this.f);
                } else if (index == 15) {
                    this.g = obtainStyledAttributes.getDimensionPixelOffset(15, this.g);
                } else if (index == 113) {
                    this.i = obtainStyledAttributes.getInt(113, this.i);
                } else if (index == 34) {
                    int resourceId = obtainStyledAttributes.getResourceId(34, 0);
                    c cVar = new c();
                    this.j = cVar;
                    cVar.a(getContext(), resourceId);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.b.ai = this.i;
    }

    protected final void a() {
        this.b.D();
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return b();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            a aVar = (a) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 || aVar.Q || isInEditMode) {
                l lVar = aVar.Y;
                int b = lVar.b();
                int c = lVar.c();
                childAt.layout(b, c, lVar.h() + b, lVar.d() + c);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:247:0x0515, code lost:
        if (r10.height == (-1)) goto L264;
     */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x055a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r33, int r34) {
        /*
            Method dump skipped, instructions count: 1741
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        l d = d(view);
        if ((view instanceof d) && !(d instanceof n)) {
            a aVar = (a) view.getLayoutParams();
            aVar.Y = new n();
            aVar.Q = true;
            ((n) aVar.Y).A(aVar.M);
            l lVar = aVar.Y;
        }
        this.a.put(view.getId(), view);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.b.F(d(view));
        this.h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        this.h = true;
    }

    @Override // android.view.View
    public final void setId(int i) {
        this.a.remove(getId());
        super.setId(i);
        this.a.put(getId(), this);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e(attributeSet);
    }
}
