package com.google.android.apps.inputmethod.libs.framework.keyboard.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LinearSoftKeyViewsPage extends LinearLayout implements der {
    private final List a = lre.A();
    private final SparseArray b = new SparseArray();

    public LinearSoftKeyViewsPage(Context context) {
        super(context);
    }

    private final void e(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof SoftKeyView) {
                if (childAt.getId() == -1) {
                    this.a.add((SoftKeyView) childAt);
                } else {
                    this.b.put(childAt.getId(), (SoftKeyView) childAt);
                }
            } else if (childAt instanceof ViewGroup) {
                e((ViewGroup) childAt);
            }
        }
    }

    @Override // defpackage.jdb
    public final void A(jdr jdrVar) {
        for (SoftKeyView softKeyView : this.a) {
            softKeyView.j(jdrVar);
        }
        for (int i = 0; i < this.b.size(); i++) {
            ((SoftKeyView) this.b.valueAt(i)).j(jdrVar);
        }
    }

    @Override // defpackage.der
    public final int a(ict[] ictVarArr) {
        return ((ictVarArr.length + this.a.size()) - 1) / this.a.size();
    }

    @Override // defpackage.der
    public final int b(ict[] ictVarArr, int i) {
        int length;
        if (ictVarArr == null || i < 0 || i >= (length = ictVarArr.length)) {
            throw new IllegalArgumentException();
        }
        int size = this.a.size();
        return i + size >= length ? length - i : size;
    }

    @Override // defpackage.der
    public final int c() {
        return this.a.size();
    }

    @Override // defpackage.der
    public final int d(ict[] ictVarArr, int i) {
        int i2 = i;
        for (SoftKeyView softKeyView : this.a) {
            if (i2 < ictVarArr.length) {
                softKeyView.n(ictVarArr[i2]);
                i2++;
            } else {
                softKeyView.n(null);
            }
        }
        return i2 - i;
    }

    @Override // defpackage.der
    public final void f(Runnable runnable) {
        runnable.run();
    }

    @Override // defpackage.der
    public final void h(Runnable runnable) {
        runnable.run();
    }

    @Override // defpackage.der
    public final boolean i(int i, ict ictVar) {
        SoftKeyView softKeyView = (SoftKeyView) this.b.get(i);
        if (softKeyView != null) {
            softKeyView.n(ictVar);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        e(this);
    }

    @Override // defpackage.jdb
    public final void t(gqc gqcVar) {
        for (SoftKeyView softKeyView : this.a) {
            softKeyView.i(gqcVar);
        }
        for (int i = 0; i < this.b.size(); i++) {
            ((SoftKeyView) this.b.valueAt(i)).i(gqcVar);
        }
    }

    @Override // defpackage.jdb
    public final void y(float f, float f2) {
        float f3 = f * f2;
        for (SoftKeyView softKeyView : this.a) {
            softKeyView.k(f3);
        }
        for (int i = 0; i < this.b.size(); i++) {
            ((SoftKeyView) this.b.valueAt(i)).k(f3);
        }
    }

    public LinearSoftKeyViewsPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
