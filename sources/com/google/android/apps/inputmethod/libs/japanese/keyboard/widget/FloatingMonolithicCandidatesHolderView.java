package com.google.android.apps.inputmethod.libs.japanese.keyboard.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FloatingMonolithicCandidatesHolderView extends LinearLayout implements dlc, jdb {
    private static final lug a = hin.a;
    private deb c;
    private int d;
    private SoftKeyView g;
    private final List b = lre.A();
    private int e = -1;
    private int f = -1;

    public FloatingMonolithicCandidatesHolderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArray;
        this.d = 9;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, dkp.a);
            try {
                this.d = typedArray.getInt(0, 9);
                if (typedArray != null) {
                    typedArray.recycle();
                }
                this.c = new deb(context, new dec(attributeSet));
            } catch (Throwable th) {
                th = th;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            typedArray = null;
        }
    }

    private final int e(int i) {
        int j;
        int i2 = this.e;
        if (i2 == -1 || i == -1 || (j = i - j(i2)) < 0 || j >= getChildCount()) {
            return -1;
        }
        return j;
    }

    private final int j(int i) {
        if (i < 0) {
            ((luc) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/japanese/keyboard/widget/FloatingMonolithicCandidatesHolderView", "getFirstCandidateIndex", 315, "FloatingMonolithicCandidatesHolderView.java")).u("pageIndex [%d] < 0", -1);
            return -1;
        }
        return i * this.d;
    }

    private final int m(int i) {
        if (i >= this.b.size()) {
            ((luc) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/japanese/keyboard/widget/FloatingMonolithicCandidatesHolderView", "getPageIndex", 303, "FloatingMonolithicCandidatesHolderView.java")).y("candidateIndex [%d] >= mCandidates.size() [%d]", i, this.b.size());
            return -1;
        }
        return i / this.d;
    }

    private final SoftKeyView o(int i) {
        SoftKeyView softKeyView = null;
        if (i < 0) {
            ((luc) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/japanese/keyboard/widget/FloatingMonolithicCandidatesHolderView", "fillContentViews", 265, "FloatingMonolithicCandidatesHolderView.java")).u("Cannot fill page index [%d] < 0", i);
            return null;
        }
        int j = j(i);
        if (j >= this.b.size()) {
            ((luc) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/japanese/keyboard/widget/FloatingMonolithicCandidatesHolderView", "fillContentViews", 270, "FloatingMonolithicCandidatesHolderView.java")).y("Cannot add candidate index [%d] >= mCandidates.size() [%d]", j, this.b.size());
            return null;
        }
        p();
        this.e = i;
        int min = Math.min(this.d + j, this.b.size());
        for (int i2 = j; i2 < min; i2++) {
            softKeyView = this.c.g(i2 - j, (hln) this.b.get(i2));
            addView(softKeyView);
        }
        return softKeyView;
    }

    private final void p() {
        this.e = -1;
        for (int i = 0; i < getChildCount(); i++) {
            this.c.k((SoftKeyView) getChildAt(i));
        }
        removeAllViews();
    }

    private final boolean r(int i) {
        int e = e(this.f);
        if (e != -1) {
            getChildAt(e).setSelected(false);
        }
        this.f = i;
        if (i == -1) {
            return false;
        }
        int m = m(i);
        if (m != this.e) {
            o(m);
        }
        int e2 = e(this.f);
        if (e2 == -1) {
            ((luc) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/japanese/keyboard/widget/FloatingMonolithicCandidatesHolderView", "selectCandidateByIndex", 218, "FloatingMonolithicCandidatesHolderView.java")).u("Cannot select viewIndex [%d] < 0", -1);
            return false;
        }
        getChildAt(e2).setSelected(true);
        return true;
    }

    @Override // defpackage.jdb
    public final void A(jdr jdrVar) {
        this.c.h = jdrVar;
    }

    @Override // defpackage.ddw
    public final boolean D() {
        return false;
    }

    @Override // defpackage.ddw
    public final boolean E() {
        throw null;
    }

    @Override // defpackage.ded
    public final boolean F(hln hlnVar) {
        List list = this.b;
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                i = -1;
                break;
            } else if (list.get(i) == hlnVar) {
                break;
            } else {
                i++;
            }
        }
        return r(i);
    }

    @Override // defpackage.dlc
    public final int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.ddw
    public final int b() {
        return this.b.size();
    }

    @Override // defpackage.dlc
    public final int c() {
        return this.f;
    }

    @Override // defpackage.ded
    public final hln f(iay iayVar) {
        return null;
    }

    @Override // defpackage.ded
    public final hln g() {
        if (getChildCount() == 0) {
            return null;
        }
        int j = j(this.e);
        if (!r(j)) {
            return null;
        }
        return (hln) this.b.get(j);
    }

    @Override // defpackage.ded
    public final hln h() {
        if (getChildCount() == 0) {
            return null;
        }
        int j = (j(this.e) + getChildCount()) - 1;
        if (!r(j)) {
            return null;
        }
        return (hln) this.b.get(j);
    }

    @Override // defpackage.dlc
    public final void hd(dlb dlbVar) {
    }

    @Override // defpackage.ddw
    public final SoftKeyView i() {
        return this.g;
    }

    @Override // defpackage.ddw
    public final List k(List list) {
        throw null;
    }

    @Override // defpackage.ddw
    public final void l(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.b.addAll(list);
        int i = this.f;
        this.g = o(i == -1 ? 0 : m(i));
        r(this.f);
    }

    @Override // defpackage.ded
    public final void n() {
        this.b.clear();
        this.f = -1;
        p();
        this.g = null;
    }

    @Override // defpackage.ded
    public final void q(boolean z) {
        for (int i = 0; i < getChildCount(); i++) {
            this.c.l((SoftKeyView) getChildAt(i), z, false);
        }
    }

    @Override // defpackage.jdb
    public final void t(gqc gqcVar) {
        this.c.i = gqcVar;
    }

    @Override // defpackage.ded
    public final void v(int[] iArr) {
        this.c.j = iArr;
    }

    @Override // defpackage.ded
    public final void w(float f) {
        this.c.f = f;
    }

    @Override // defpackage.ddw
    public final void x(ddv ddvVar) {
        throw null;
    }

    @Override // defpackage.jdb
    public final void y(float f, float f2) {
        this.c.g = f;
    }
}
