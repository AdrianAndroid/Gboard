package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AlertDialogLayout extends kx {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    private static int a(View view) {
        int g = aad.g(view);
        if (g > 0) {
            return g;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return a(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    @Override // defpackage.kx, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            int r10 = r9.getPaddingLeft()
            int r13 = r13 - r11
            int r11 = r9.getPaddingRight()
            int r11 = r13 - r11
            int r13 = r13 - r10
            int r0 = r9.getPaddingRight()
            int r13 = r13 - r0
            int r0 = r9.getMeasuredHeight()
            int r1 = r9.getChildCount()
            int r2 = r9.f
            r3 = 8388615(0x800007, float:1.1754953E-38)
            r3 = r3 & r2
            r2 = r2 & 112(0x70, float:1.57E-43)
            r4 = 16
            if (r2 == r4) goto L37
            r4 = 80
            if (r2 == r4) goto L2e
            int r12 = r9.getPaddingTop()
            goto L41
        L2e:
            int r2 = r9.getPaddingTop()
            int r2 = r2 + r14
            int r2 = r2 - r12
            int r12 = r2 - r0
            goto L41
        L37:
            int r2 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r14 = r14 - r0
            int r14 = r14 / 2
            int r12 = r2 + r14
        L41:
            android.graphics.drawable.Drawable r14 = r9.g
            r0 = 0
            if (r14 != 0) goto L48
            r14 = 0
            goto L4c
        L48:
            int r14 = r14.getIntrinsicHeight()
        L4c:
            if (r0 >= r1) goto Laa
            android.view.View r2 = r9.getChildAt(r0)
            if (r2 == 0) goto La7
            int r4 = r2.getVisibility()
            r5 = 8
            if (r4 == r5) goto La7
            int r4 = r2.getMeasuredWidth()
            int r5 = r2.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r6 = r2.getLayoutParams()
            kw r6 = (defpackage.kw) r6
            int r7 = r6.gravity
            if (r7 >= 0) goto L6f
            r7 = r3
        L6f:
            int r8 = defpackage.aad.f(r9)
            int r7 = android.view.Gravity.getAbsoluteGravity(r7, r8)
            r7 = r7 & 7
            r8 = 1
            if (r7 == r8) goto L88
            r8 = 5
            if (r7 == r8) goto L83
            int r7 = r6.leftMargin
            int r7 = r7 + r10
            goto L93
        L83:
            int r7 = r11 - r4
            int r8 = r6.rightMargin
            goto L92
        L88:
            int r7 = r13 - r4
            int r7 = r7 / 2
            int r7 = r7 + r10
            int r8 = r6.leftMargin
            int r7 = r7 + r8
            int r8 = r6.rightMargin
        L92:
            int r7 = r7 - r8
        L93:
            boolean r8 = r9.r(r0)
            if (r8 == 0) goto L9a
            int r12 = r12 + r14
        L9a:
            int r8 = r6.topMargin
            int r12 = r12 + r8
            int r4 = r4 + r7
            int r8 = r12 + r5
            r2.layout(r7, r12, r4, r8)
            int r2 = r6.bottomMargin
            int r5 = r5 + r2
            int r12 = r12 + r5
        La7:
            int r0 = r0 + 1
            goto L4c
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.kx, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.f130020_resource_name_obfuscated_res_0x7f0b21b0) {
                    view = childAt;
                } else if (id == R.id.f52730_resource_name_obfuscated_res_0x7f0b00c5) {
                    view2 = childAt;
                } else if ((id != R.id.f53560_resource_name_obfuscated_res_0x7f0b012a && id != R.id.f53720_resource_name_obfuscated_res_0x7f0b013f) || view3 != null) {
                    super.onMeasure(i, i2);
                    return;
                } else {
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i, 0);
            paddingTop += view.getMeasuredHeight();
            i3 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i3 = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            i4 = a(view2);
            i5 = view2.getMeasuredHeight() - i4;
            paddingTop += i4;
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (view3 != null) {
            view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            i6 = view3.getMeasuredHeight();
            paddingTop += i6;
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        } else {
            i6 = 0;
        }
        int i8 = size - paddingTop;
        if (view2 != null) {
            int i9 = paddingTop - i4;
            int min = Math.min(i8, i5);
            if (min > 0) {
                i8 -= min;
                i4 += min;
            }
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
            paddingTop = i9 + view2.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        }
        if (view3 != null && i8 > 0) {
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(i8 + i6, mode));
            paddingTop = (paddingTop - i6) + view3.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        }
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                i10 = Math.max(i10, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i10 + getPaddingLeft() + getPaddingRight(), i, i3), View.resolveSizeAndState(paddingTop, i2, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt3 = getChildAt(i12);
                if (childAt3.getVisibility() != 8) {
                    kw kwVar = (kw) childAt3.getLayoutParams();
                    if (kwVar.width == -1) {
                        int i13 = kwVar.height;
                        kwVar.height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, makeMeasureSpec, 0, i2, 0);
                        kwVar.height = i13;
                    }
                }
            }
        }
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
