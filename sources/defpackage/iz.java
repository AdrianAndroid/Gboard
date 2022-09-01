package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: iz  reason: default package */
/* loaded from: classes.dex */
public class iz extends Spinner {
    private static final int[] e = {16843505};
    public final Context a;
    public iy b;
    int c;
    final Rect d;
    private ko f;
    private SpinnerAdapter g;
    private final boolean h;
    private final isu i;

    public iz(Context context) {
        this(context, (AttributeSet) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        int max2 = Math.max(0, max - (15 - (min - max)));
        View view = null;
        int i2 = 0;
        while (max2 < min) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            int i3 = itemViewType != i ? itemViewType : i;
            if (itemViewType != i) {
                view = null;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
            max2++;
            i = i3;
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.d);
        return i2 + this.d.left + this.d.right;
    }

    public final void b() {
        this.b.l(ir.b(this), ir.a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        isu isuVar = this.i;
        if (isuVar != null) {
            isuVar.b();
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownHorizontalOffset() {
        iy iyVar = this.b;
        return iyVar != null ? iyVar.a() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownVerticalOffset() {
        iy iyVar = this.b;
        return iyVar != null ? iyVar.b() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownWidth() {
        return this.b != null ? this.c : super.getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public final Drawable getPopupBackground() {
        iy iyVar = this.b;
        return iyVar != null ? iyVar.c() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public final Context getPopupContext() {
        return this.a;
    }

    @Override // android.widget.Spinner
    public final CharSequence getPrompt() {
        iy iyVar = this.b;
        return iyVar != null ? iyVar.d() : super.getPrompt();
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        iy iyVar = this.b;
        if (iyVar == null || !iyVar.u()) {
            return;
        }
        this.b.k();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.b == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        ix ixVar = (ix) parcelable;
        super.onRestoreInstanceState(ixVar.getSuperState());
        if (!ixVar.a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new he(this, 2));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        ix ixVar = new ix(super.onSaveInstanceState());
        iy iyVar = this.b;
        boolean z = false;
        if (iyVar != null && iyVar.u()) {
            z = true;
        }
        ixVar.a = z;
        return ixVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ko koVar = this.f;
        if (koVar == null || !koVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        iy iyVar = this.b;
        if (iyVar != null) {
            if (iyVar.u()) {
                return true;
            }
            b();
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        isu isuVar = this.i;
        if (isuVar != null) {
            isuVar.f();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        isu isuVar = this.i;
        if (isuVar != null) {
            isuVar.d(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownHorizontalOffset(int i) {
        iy iyVar = this.b;
        if (iyVar != null) {
            iyVar.h(i);
            this.b.g(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    @Override // android.widget.Spinner
    public final void setDropDownVerticalOffset(int i) {
        iy iyVar = this.b;
        if (iyVar != null) {
            iyVar.j(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownWidth(int i) {
        if (this.b != null) {
            this.c = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundDrawable(Drawable drawable) {
        iy iyVar = this.b;
        if (iyVar != null) {
            iyVar.f(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(ej.a(this.a, i));
    }

    @Override // android.widget.Spinner
    public final void setPrompt(CharSequence charSequence) {
        iy iyVar = this.b;
        if (iyVar != null) {
            iyVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public iz(Context context, int i) {
        this(context, null, R.attr.f17000_resource_name_obfuscated_res_0x7f0406ab, i);
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.h) {
            this.g = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.b == null) {
            return;
        }
        Context context = this.a;
        if (context == null) {
            context = getContext();
        }
        this.b.e(new iu(spinnerAdapter, context.getTheme()));
    }

    public iz(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f17000_resource_name_obfuscated_res_0x7f0406ab);
    }

    public iz(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public iz(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00db  */
    /* JADX WARN: Type inference failed for: r11v0, types: [int] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r7v0, types: [iz, android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public iz(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11, android.content.res.Resources.Theme r12) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iz.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
