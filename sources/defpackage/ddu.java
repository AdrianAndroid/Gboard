package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;

/* compiled from: PG */
/* renamed from: ddu  reason: default package */
/* loaded from: classes.dex */
public abstract class ddu extends dep implements der, jda {
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private SoftKeyView g;

    public ddu(Context context) {
        this(context, null);
    }

    @Override // defpackage.jdb
    public final void A(jdr jdrVar) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof SoftKeyView) {
                ((SoftKeyView) childAt).j(jdrVar);
            }
        }
    }

    @Override // defpackage.der
    public final int a(ict[] ictVarArr) {
        int length;
        if (ictVarArr == null || (length = ictVarArr.length) == 0) {
            return 0;
        }
        int c = c();
        return ((length + c) - 1) / c;
    }

    @Override // defpackage.der
    public final int b(ict[] ictVarArr, int i) {
        int length;
        if (ictVarArr == null || i < 0 || i >= (length = ictVarArr.length)) {
            throw new IllegalArgumentException();
        }
        int c = c();
        return i + c >= length ? length - i : c;
    }

    @Override // defpackage.der
    public final int c() {
        return j() - (this.d == -1 ? 0 : 1);
    }

    @Override // defpackage.der
    public final int d(ict[] ictVarArr, int i) {
        int length = ictVarArr != null ? ictVarArr.length : 0;
        int i2 = i;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            SoftKeyView softKeyView = (SoftKeyView) getChildAt(i3);
            if (softKeyView.getId() == -1) {
                if (i2 < length) {
                    softKeyView.n(ictVarArr[i2]);
                    softKeyView.setVisibility(0);
                    i2++;
                } else {
                    softKeyView.setVisibility(4);
                }
            }
        }
        return i2 - i;
    }

    protected abstract SoftKeyView e();

    @Override // defpackage.der
    public final void f(Runnable runnable) {
        runnable.run();
    }

    @Override // defpackage.jda
    public final void gw(ict[] ictVarArr) {
        d(ictVarArr, 0);
    }

    @Override // defpackage.der
    public final void h(Runnable runnable) {
        runnable.run();
    }

    @Override // defpackage.der
    public final boolean i(int i, ict ictVar) {
        SoftKeyView softKeyView;
        if (this.d != i || (softKeyView = this.g) == null) {
            return false;
        }
        softKeyView.n(ictVar);
        return true;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        int i;
        super.onFinishInflate();
        int j = j();
        for (int i2 = 0; i2 < j; i2++) {
            addView(e());
        }
        if (this.d == -1 || (i = this.c) < 0 || i >= j) {
            return;
        }
        SoftKeyView softKeyView = (SoftKeyView) getChildAt(i);
        this.g = softKeyView;
        softKeyView.setId(this.d);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // defpackage.jdb
    public final void t(gqc gqcVar) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof SoftKeyView) {
                ((SoftKeyView) childAt).i(gqcVar);
            }
        }
    }

    @Override // defpackage.jdb
    public final void y(float f, float f2) {
        float f3 = f * f2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof SoftKeyView) {
                ((SoftKeyView) childAt).k(f3);
            }
        }
    }

    public ddu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ddu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Throwable th;
        TypedArray typedArray;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, dby.a);
        } catch (Throwable th2) {
            th = th2;
            typedArray = null;
        }
        try {
            int i2 = typedArray.getInt(1, 4);
            this.e = i2;
            int i3 = typedArray.getInt(0, 4);
            this.f = i3;
            int i4 = typedArray.getInt(2, 0);
            this.c = i4 < 0 ? i4 + (i2 * i3) : i4;
            this.d = typedArray.getResourceId(3, -1);
            this.b = i2;
            requestLayout();
            this.a = i3;
            requestLayout();
            setClickable(false);
            if (typedArray == null) {
                return;
            }
            typedArray.recycle();
        } catch (Throwable th3) {
            th = th3;
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }
}
