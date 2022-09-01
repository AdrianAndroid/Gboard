package com.google.android.apps.inputmethod.libs.framework.keyboard.widget;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FixedSizeCandidatesHolderView extends LinearLayout implements ddx, jdb {
    private View a;
    private int b;
    private final deb c;
    private int d;
    private int e;
    private final SoftKeyView[] f;
    private int g;
    private boolean h;
    private int i;
    private ddv j;
    private final int k;
    private final int l;
    private boolean m;
    private boolean n;
    private boolean o;
    private SoftKeyView p;
    private List q;
    private dpe r;

    public FixedSizeCandidatesHolderView(Context context) {
        this(context, null);
    }

    private static hln d(SoftKeyView softKeyView) {
        return (hln) softKeyView.b.c(iah.PRESS).d().e;
    }

    private final hln e(int i) {
        if (this.e == 0) {
            return null;
        }
        this.o = true;
        m();
        j(i);
        return d((SoftKeyView) getChildAt(i));
    }

    private final void j(int i) {
        int i2 = this.g;
        if (i2 >= 0) {
            SoftKeyView softKeyView = (SoftKeyView) getChildAt(i2);
            softKeyView.setSelected(false);
            AppCompatTextView appCompatTextView = (AppCompatTextView) softKeyView.findViewById(R.id.f65200_resource_name_obfuscated_res_0x7f0b0745);
            if (appCompatTextView != null) {
                jdy.k(appCompatTextView, false);
            }
        }
        this.g = i;
        if (i >= 0) {
            SoftKeyView softKeyView2 = (SoftKeyView) getChildAt(i);
            softKeyView2.setSelected(true);
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) softKeyView2.findViewById(R.id.f65200_resource_name_obfuscated_res_0x7f0b0745);
            if (appCompatTextView2 == null) {
                return;
            }
            jdy.k(appCompatTextView2, d(softKeyView2).g);
        }
    }

    private final void m() {
        int i = 0;
        while (true) {
            int i2 = this.e;
            if (i < i2) {
                this.c.l(this.f[i], o(), i == i2 + (-1));
                i++;
            } else {
                return;
            }
        }
    }

    private final boolean o() {
        return this.o && this.n;
    }

    @Override // defpackage.jdb
    public final void A(jdr jdrVar) {
        this.c.h = jdrVar;
    }

    @Override // defpackage.ddx
    public final void C() {
        n();
        a(this.q, new ArrayList());
    }

    @Override // defpackage.ddw
    public final boolean D() {
        return this.h;
    }

    @Override // defpackage.ddw
    public final boolean E() {
        return getWidth() > 0 && getHeight() > 0;
    }

    @Override // defpackage.ded
    public final boolean F(hln hlnVar) {
        if (hlnVar == null) {
            j(-1);
            this.o = false;
            m();
            return true;
        }
        this.o = true;
        m();
        for (int i = 0; i < this.e; i++) {
            if (hlnVar == d((SoftKeyView) getChildAt(i))) {
                j(i);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x00db, code lost:
        r2 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.util.List r12, java.util.ArrayList r13) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.inputmethod.libs.framework.keyboard.widget.FixedSizeCandidatesHolderView.a(java.util.List, java.util.ArrayList):void");
    }

    @Override // defpackage.ddw
    public final int b() {
        return this.e;
    }

    @Override // defpackage.ddx
    public final int c() {
        return this.d;
    }

    @Override // defpackage.ded
    public final hln f(iay iayVar) {
        int i = this.e;
        if (i == 0) {
            return null;
        }
        int i2 = iayVar.c;
        int i3 = -1;
        if (i2 == 21) {
            int i4 = this.g;
            if (i4 > 0) {
                j(i4 - 1);
            }
        } else if (i2 != 22) {
            dpe dpeVar = this.r;
            if (dpeVar != null && o()) {
                i3 = dpeVar.e(iayVar);
            }
            if (i3 < 0 || i3 >= this.e) {
                return null;
            }
            j(i3);
        } else {
            int i5 = this.g;
            if (i5 < 0 || i5 >= i - 1) {
                return null;
            }
            j(i5 + 1);
        }
        int i6 = this.g;
        if (i6 < 0) {
            return g();
        }
        return d((SoftKeyView) getChildAt(i6));
    }

    @Override // defpackage.ded
    public final hln g() {
        return e(0);
    }

    @Override // defpackage.ded
    public final hln h() {
        return e(this.e - 1);
    }

    @Override // defpackage.ddw
    public final SoftKeyView i() {
        return this.p;
    }

    @Override // defpackage.ddw
    public final List k(List list) {
        this.q = list;
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        a(list, arrayList);
        return arrayList;
    }

    @Override // defpackage.ddw
    public final void l(List list) {
        a(list, null);
    }

    @Override // defpackage.ded
    public final void n() {
        View childAt;
        this.e = 0;
        int i = this.g;
        if (i != -1 && (childAt = getChildAt(i)) != null) {
            childAt.setSelected(false);
        }
        this.g = -1;
        this.i = 0;
        this.h = false;
        this.p = null;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        ddv ddvVar = this.j;
        if (ddvVar == null || i <= 0) {
            return;
        }
        if (i4 <= 0) {
            this.c.e = getMeasuredHeight();
            this.j.a();
        } else if (i3 == i) {
        } else {
            ddvVar.b();
        }
    }

    @Override // defpackage.ded
    public final void q(boolean z) {
        this.n = z;
        m();
    }

    @Override // defpackage.jdb
    public final void t(gqc gqcVar) {
        this.c.i = gqcVar;
    }

    @Override // defpackage.ded
    public final void v(int[] iArr) {
        this.r = new dpe(iArr);
        this.c.j = iArr;
    }

    @Override // defpackage.ded
    public final void w(float f) {
        this.c.f = f;
    }

    @Override // defpackage.ddw
    public final void x(ddv ddvVar) {
        this.j = ddvVar;
    }

    @Override // defpackage.jdb
    public final void y(float f, float f2) {
        this.c.g = f;
    }

    @Override // defpackage.ddx
    public final void z(SoftKeyView softKeyView) {
        this.a = softKeyView;
    }

    public FixedSizeCandidatesHolderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 9;
        this.g = -1;
        this.d = jgd.d(context, attributeSet, null, "max_candidates_count", 9);
        String k = jgd.k(context, attributeSet, null, "deletable_label");
        this.f = new SoftKeyView[this.d];
        this.c = new deb(context, new dec(attributeSet), k);
        this.k = (int) jgd.w(context, attributeSet, "max_width", -1.0f);
        this.l = (int) jgd.w(context, attributeSet, "min_width", -1.0f);
        this.m = jgd.o(context, attributeSet, null, "center_single_candidate", false);
    }
}
