package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* renamed from: kx  reason: default package */
/* loaded from: classes.dex */
public class kx extends ViewGroup {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    public int f;
    public Drawable g;
    public int h;
    private float i;
    private boolean j;
    private int[] k;
    private int[] l;
    private int m;
    private int n;
    private int o;

    public kx(Context context) {
        this(context, null);
    }

    private static void a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof kw;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: d */
    public kw generateDefaultLayoutParams() {
        int i = this.d;
        if (i == 0) {
            return new kw(-2);
        }
        if (i != 1) {
            return null;
        }
        return new kw(-1);
    }

    @Override // android.view.View
    public final int getBaseline() {
        int i;
        if (this.b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.b;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.b != 0) {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            return -1;
        }
        int i3 = this.c;
        if (this.d == 1 && (i = this.f & 112) != 48) {
            if (i == 16) {
                i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.e) / 2;
            } else if (i == 80) {
                i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.e;
            }
        }
        return i3 + ((kw) childAt.getLayoutParams()).topMargin + baseline;
    }

    @Override // android.view.ViewGroup
    /* renamed from: id */
    public kw generateLayoutParams(AttributeSet attributeSet) {
        return new kw(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: ie */
    public kw generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new kw(layoutParams);
    }

    final void o(Canvas canvas, int i) {
        this.g.setBounds(getPaddingLeft() + this.o, i, (getWidth() - getPaddingRight()) - this.o, this.m + i);
        this.g.draw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.support.v7.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.support.v7.widget.LinearLayoutCompat");
    }

    final void p(Canvas canvas, int i) {
        this.g.setBounds(i, getPaddingTop() + this.o, this.h + i, (getHeight() - getPaddingBottom()) - this.o);
        this.g.draw(canvas);
    }

    public final void q(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean r(int i) {
        if (i == 0) {
            return (this.n & 1) != 0;
        } else if (i == getChildCount()) {
            return (this.n & 4) != 0;
        } else if ((this.n & 2) == 0) {
            return false;
        } else {
            do {
                i--;
                if (i < 0) {
                    return false;
                }
            } while (getChildAt(i).getVisibility() == 8);
            return true;
        }
    }

    public final void s() {
        this.a = false;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public kx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public kx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z = true;
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.f = 8388659;
        gkn w = gkn.w(context, attributeSet, ei.n, i, 0);
        aad.L(this, context, ei.n, attributeSet, (TypedArray) w.a, i, 0);
        int i2 = w.i(1, -1);
        if (i2 >= 0) {
            q(i2);
        }
        int i3 = w.i(0, -1);
        if (i3 >= 0 && this.f != i3) {
            i3 = (8388615 & i3) == 0 ? i3 | 8388611 : i3;
            this.f = (i3 & 112) == 0 ? i3 | 48 : i3;
            requestLayout();
        }
        if (!w.s(2, true)) {
            s();
        }
        this.i = ((TypedArray) w.a).getFloat(4, -1.0f);
        this.b = w.i(3, -1);
        this.j = w.s(7, false);
        Drawable n = w.n(5);
        if (n != this.g) {
            this.g = n;
            if (n != null) {
                this.h = n.getIntrinsicWidth();
                this.m = n.getIntrinsicHeight();
            } else {
                this.h = 0;
                this.m = 0;
            }
            setWillNotDraw(n != null ? false : z);
            requestLayout();
        }
        this.n = w.i(8, 0);
        this.o = w.h(6, 0);
        w.r();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        int left2;
        int bottom;
        if (this.g == null) {
            return;
        }
        int i2 = 0;
        if (this.d != 1) {
            int childCount = getChildCount();
            boolean b = oi.b(this);
            while (i2 < childCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && r(i2)) {
                    kw kwVar = (kw) childAt.getLayoutParams();
                    if (b) {
                        left2 = childAt.getRight() + kwVar.rightMargin;
                    } else {
                        left2 = (childAt.getLeft() - kwVar.leftMargin) - this.h;
                    }
                    p(canvas, left2);
                }
                i2++;
            }
            if (!r(childCount)) {
                return;
            }
            View childAt2 = getChildAt(childCount - 1);
            if (childAt2 != null) {
                kw kwVar2 = (kw) childAt2.getLayoutParams();
                if (b) {
                    left = childAt2.getLeft() - kwVar2.leftMargin;
                    i = this.h;
                    right = left - i;
                } else {
                    right = childAt2.getRight() + kwVar2.rightMargin;
                }
            } else if (b) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.h;
                right = left - i;
            }
            p(canvas, right);
            return;
        }
        int childCount2 = getChildCount();
        while (i2 < childCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && r(i2)) {
                o(canvas, (childAt3.getTop() - ((kw) childAt3.getLayoutParams()).topMargin) - this.m);
            }
            i2++;
        }
        if (!r(childCount2)) {
            return;
        }
        View childAt4 = getChildAt(childCount2 - 1);
        if (childAt4 == null) {
            bottom = (getHeight() - getPaddingBottom()) - this.m;
        } else {
            bottom = childAt4.getBottom() + ((kw) childAt4.getLayoutParams()).bottomMargin;
        }
        o(canvas, bottom);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kx.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02d4, code lost:
        if (r10.width == (-1)) goto L169;
     */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x061b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x084a  */
    /* JADX WARN: Removed duplicated region for block: B:345:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x07de  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r40, int r41) {
        /*
            Method dump skipped, instructions count: 2186
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kx.onMeasure(int, int):void");
    }
}
