package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionMenuView extends kx implements gl, hb {
    public gm a;
    public boolean b;
    public hs c;
    public gk d;
    public opu e;
    private Context i;
    private int j;
    private gy k;
    private boolean l;
    private int m;
    private int n;
    private int o;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public static final hv m() {
        hv hvVar = new hv();
        hvVar.gravity = 16;
        return hvVar;
    }

    public static final hv n(ViewGroup.LayoutParams layoutParams) {
        hv hvVar;
        if (layoutParams != null) {
            if (layoutParams instanceof hv) {
                hvVar = new hv((hv) layoutParams);
            } else {
                hvVar = new hv(layoutParams);
            }
            if (hvVar.gravity <= 0) {
                hvVar.gravity = 16;
            }
            return hvVar;
        }
        return m();
    }

    @Override // defpackage.hb
    public final void a(gm gmVar) {
        this.a = gmVar;
    }

    @Override // defpackage.gl
    public final boolean b(go goVar) {
        return this.a.z(goVar, 0);
    }

    @Override // defpackage.kx
    /* renamed from: c */
    public final hv id(AttributeSet attributeSet) {
        return new hv(getContext(), attributeSet);
    }

    @Override // defpackage.kx, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof hv;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.kx
    public final /* bridge */ /* synthetic */ kw d() {
        return m();
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final Menu g() {
        if (this.a == null) {
            Context context = getContext();
            gm gmVar = new gm(context);
            this.a = gmVar;
            gmVar.p(new hw(this, 0));
            hs hsVar = new hs(context);
            this.c = hsVar;
            hsVar.p();
            hs hsVar2 = this.c;
            gy gyVar = this.k;
            if (gyVar == null) {
                gyVar = new hu();
            }
            hsVar2.e = gyVar;
            this.a.h(this.c, this.i);
            this.c.j(this);
        }
        return this.a;
    }

    @Override // defpackage.kx, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m();
    }

    public final void h() {
        hs hsVar = this.c;
        if (hsVar != null) {
            hsVar.n();
        }
    }

    public final void i(gy gyVar, gk gkVar) {
        this.k = gyVar;
        this.d = gkVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.kx
    public final /* bridge */ /* synthetic */ kw ie(ViewGroup.LayoutParams layoutParams) {
        return n(layoutParams);
    }

    public final void j(int i) {
        if (this.j != i) {
            this.j = i;
            if (i == 0) {
                this.i = getContext();
            } else {
                this.i = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public final void k(hs hsVar) {
        this.c = hsVar;
        hsVar.j(this);
    }

    protected final boolean l(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof ht)) {
            z = ((ht) childAt).c();
        }
        return (i <= 0 || !(childAt2 instanceof ht)) ? z : ((ht) childAt2).d() | z;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        hs hsVar = this.c;
        if (hsVar != null) {
            hsVar.i();
            if (!this.c.l()) {
                return;
            }
            this.c.k();
            this.c.m();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.kx, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.l) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int i7 = this.h;
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean b = oi.b(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                hv hvVar = (hv) childAt.getLayoutParams();
                if (hvVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i11)) {
                        measuredWidth += i7;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b) {
                        i5 = getPaddingLeft() + hvVar.leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - hvVar.rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i12 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + hvVar.leftMargin) + hvVar.rightMargin;
                    l(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1) {
            if (i9 == 0) {
                View childAt2 = getChildAt(0);
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                int i13 = (i8 / 2) - (measuredWidth2 / 2);
                int i14 = i6 - (measuredHeight2 / 2);
                childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
                return;
            }
            childCount = 1;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (b) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                hv hvVar2 = (hv) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !hvVar2.a) {
                    int i17 = width2 - hvVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + hvVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            hv hvVar3 = (hv) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !hvVar3.a) {
                int i20 = paddingLeft + hvVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + hvVar3.rightMargin + max;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02f6  */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v37 */
    @Override // defpackage.kx, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 793
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionMenuView.onMeasure(int, int):void");
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s();
        float f = context.getResources().getDisplayMetrics().density;
        this.n = (int) (56.0f * f);
        this.o = (int) (f * 4.0f);
        this.i = context;
        this.j = 0;
    }

    @Override // defpackage.kx, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return n(layoutParams);
    }
}
