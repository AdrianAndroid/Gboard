package com.google.android.apps.inputmethod.latin.keyboard.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LatinFixedCountCandidatesHolderView extends LinearLayout implements ddw, jdb, ddx {
    private static final ltg h = ltg.j("com/google/android/apps/inputmethod/latin/keyboard/widget/LatinFixedCountCandidatesHolderView");
    public SoftKeyView a;
    public boolean b;
    public final int c;
    public ddv d;
    Runnable e;
    public int f;
    public int g;
    private final llp i;
    private final llp j;
    private final bql k;
    private final deb l;
    private final int m;
    private final float n;
    private llp o;
    private SoftKeyView p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private dpe u;

    public LatinFixedCountCandidatesHolderView(Context context) {
        this(context, null);
    }

    static void B(deb debVar, SoftKeyView softKeyView, boolean z, boolean z2, boolean z3) {
        if (z) {
            softKeyView.setBackgroundResource(0);
        }
        debVar.l(softKeyView, z2, z3);
    }

    private final float G() {
        float f;
        int i;
        int i2 = ((lrl) this.i).c;
        if (i2 % 2 != 0) {
            f = 1.0f - this.n;
            i = i2 - 1;
        } else if (i2 <= 2) {
            return 0.0f;
        } else {
            float f2 = this.n;
            f = 1.0f - (f2 + f2);
            i = i2 - 2;
        }
        return f / i;
    }

    private final hln I(int i) {
        SoftKeyView j = j(i);
        if (j == null) {
            return null;
        }
        return e(j);
    }

    private final void J() {
        Runnable runnable = this.e;
        if (runnable != null) {
            kki.k(runnable);
            this.e = null;
        }
    }

    private final void K(int i) {
        SoftKeyView j;
        SoftKeyView j2;
        int i2 = this.q;
        if (i2 >= 0 && (j2 = j(i2)) != null) {
            j2.setSelected(false);
        }
        this.q = i;
        if (i < 0 || (j = j(i)) == null) {
            return;
        }
        j.setSelected(true);
    }

    private final void L(llp llpVar, llp llpVar2, int i, boolean z) {
        int i2 = 0;
        while (i2 < ((lrl) llpVar).c) {
            View view = (View) llpVar.get(i2);
            int floatValue = i2 < ((lrl) llpVar2).c ? (int) (((Float) llpVar2.get(i2)).floatValue() * i) : 0;
            if (floatValue > 0) {
                view.setVisibility(0);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null && layoutParams.width != floatValue) {
                    layoutParams.width = floatValue;
                    view.setLayoutParams(layoutParams);
                }
                if ((view instanceof bql) && z) {
                    bql bqlVar = (bql) view;
                    float floatValue2 = ((Float) llpVar2.get(i2)).floatValue();
                    float f = this.n;
                    ArrayList arrayList = new ArrayList();
                    int i3 = bqlVar.d;
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 != 5) {
                                if (i3 == 6 && floatValue2 > f) {
                                    Float valueOf = Float.valueOf(((floatValue2 - f) / 2.0f) / 2.0f);
                                    arrayList.add(valueOf);
                                    arrayList.add(valueOf);
                                    Float valueOf2 = Float.valueOf(f / 2.0f);
                                    arrayList.add(valueOf2);
                                    arrayList.add(valueOf2);
                                    arrayList.add(valueOf);
                                    arrayList.add(valueOf);
                                }
                            } else if (floatValue2 > f) {
                                float f2 = (floatValue2 - f) / 2.0f;
                                arrayList.add(Float.valueOf(f2));
                                Float valueOf3 = Float.valueOf(f / 2.0f);
                                arrayList.add(valueOf3);
                                arrayList.add(valueOf3);
                                Float valueOf4 = Float.valueOf(f2 / 2.0f);
                                arrayList.add(valueOf4);
                                arrayList.add(valueOf4);
                            }
                        } else if (floatValue2 > f) {
                            Float valueOf5 = Float.valueOf(f / 2.0f);
                            arrayList.add(valueOf5);
                            arrayList.add(valueOf5);
                            Float valueOf6 = Float.valueOf((floatValue2 - f) / 2.0f);
                            arrayList.add(valueOf6);
                            arrayList.add(valueOf6);
                        }
                    } else if (floatValue2 > f) {
                        arrayList.add(Float.valueOf(f));
                        Float valueOf7 = Float.valueOf((floatValue2 - f) / 2.0f);
                        arrayList.add(valueOf7);
                        arrayList.add(valueOf7);
                    }
                    if (arrayList.size() == bqlVar.d) {
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            SoftKeyView softKeyView = (SoftKeyView) bqlVar.c.get(i4);
                            float floatValue3 = ((Float) arrayList.get(i4)).floatValue();
                            ViewGroup.LayoutParams layoutParams2 = softKeyView.getLayoutParams();
                            int i5 = (int) (floatValue3 * i);
                            if (layoutParams2.width != i5) {
                                layoutParams2.width = i5;
                                softKeyView.setLayoutParams(layoutParams2);
                            }
                        }
                    } else {
                        int i6 = 0;
                        while (true) {
                            llp llpVar3 = bqlVar.c;
                            if (i6 < ((lrl) llpVar3).c) {
                                ((SoftKeyView) llpVar3.get(i6)).setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
                                i6++;
                            }
                        }
                    }
                }
            } else {
                if (view instanceof bql) {
                    ((bql) view).b();
                }
                view.setVisibility(8);
            }
            i2++;
        }
    }

    private final void M() {
        N(false);
    }

    private final void N(boolean z) {
        int i;
        boolean O = O();
        boolean R = R();
        SoftKeyView j = j(this.g);
        for (int i2 = 0; i2 < this.f; i2++) {
            boolean z2 = true;
            if (Q(i2)) {
                bql bqlVar = this.k;
                int i3 = 0;
                while (i3 < bqlVar.d) {
                    B(bqlVar.a, (SoftKeyView) bqlVar.c.get(i3), z, R, i3 == bqlVar.d + (-1));
                    i3++;
                }
            } else {
                SoftKeyView j2 = j(i2);
                if (j2 != null) {
                    boolean z3 = this.f == 1;
                    if (!O || j == null || !j.isActivated() || (i2 != (i = this.g) && i2 != i - 1)) {
                        z2 = z3;
                    }
                    B(this.l, j2, z, R, z2);
                }
            }
        }
    }

    private static boolean O() {
        return jam.o() && ((Boolean) hnu.b.c()).booleanValue();
    }

    private final boolean P(int i, int i2) {
        if (i != i2) {
            return i == i2 + (-1) && this.f % 2 == 0;
        }
        return true;
    }

    private final boolean Q(int i) {
        return i == this.c + (-1);
    }

    private final boolean R() {
        return this.t && this.s;
    }

    public static hln e(SoftKeyView softKeyView) {
        ict ictVar = softKeyView.b;
        ial c = ictVar != null ? ictVar.c(iah.PRESS) : null;
        iay d = c != null ? c.d() : null;
        Object obj = d != null ? d.e : null;
        if (obj instanceof hln) {
            return (hln) obj;
        }
        return null;
    }

    public static void o(SoftKeyView softKeyView) {
        p(softKeyView, false);
    }

    static void p(SoftKeyView softKeyView, boolean z) {
        softKeyView.setVisibility(true != z ? 4 : 8);
        softKeyView.setSelected(false);
        softKeyView.setActivated(false);
        softKeyView.setEnabled(true);
    }

    public static void r(SoftKeyView softKeyView) {
        View findViewById = softKeyView.findViewById(R.id.f52790_resource_name_obfuscated_res_0x7f0b00d0);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    static void u(deb debVar, SoftKeyView softKeyView, hln hlnVar, int i, boolean z, boolean z2) {
        debVar.h(softKeyView);
        softKeyView.n(debVar.e(i, hlnVar, z2));
        if (z) {
            View findViewById = softKeyView.findViewById(R.id.f65200_resource_name_obfuscated_res_0x7f0b0745);
            if (findViewById instanceof AppCompatTextView) {
                AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById;
                int i2 = hlnVar.s;
                boolean z3 = i2 == 9;
                if (i2 == 0) {
                    throw null;
                }
                jdy.l(appCompatTextView, z3);
            }
        }
        softKeyView.setVisibility(0);
        softKeyView.setSelected(false);
    }

    @Override // defpackage.jdb
    public final void A(jdr jdrVar) {
        this.l.h = jdrVar;
        llp llpVar = this.j;
        int i = ((lrl) llpVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((SoftKeyView) llpVar.get(i2)).j(jdrVar);
        }
        llp llpVar2 = this.k.c;
        int i3 = ((lrl) llpVar2).c;
        for (int i4 = 0; i4 < i3; i4++) {
            ((SoftKeyView) llpVar2.get(i4)).j(jdrVar);
        }
    }

    @Override // defpackage.ddx
    public final void C() {
        llp llpVar = this.o;
        if (llpVar != null) {
            L(this.i, llpVar, H(), true);
        }
    }

    @Override // defpackage.ddw
    public final boolean D() {
        return this.f >= this.c;
    }

    @Override // defpackage.ddw
    public final boolean E() {
        return getWidth() > 0 && getHeight() > 0;
    }

    @Override // defpackage.ded
    public final boolean F(hln hlnVar) {
        if (hlnVar == null) {
            K(-1);
            this.t = false;
            M();
            return true;
        }
        this.t = true;
        M();
        for (int i = 0; i < this.c; i++) {
            if (hlnVar.equals(I(i))) {
                K(i);
                return true;
            }
        }
        return false;
    }

    protected int a(iay iayVar) {
        dpe dpeVar = this.u;
        if (dpeVar == null || !R()) {
            return -1;
        }
        return dpeVar.e(iayVar);
    }

    @Override // defpackage.ddw
    public final int b() {
        return this.f;
    }

    @Override // defpackage.ddx
    public final int c() {
        return this.c;
    }

    protected deb d(Context context, bqi bqiVar) {
        return new bqh(context, bqiVar, !O());
    }

    @Override // defpackage.ded
    public final hln g() {
        if (this.f == 0) {
            return null;
        }
        this.t = true;
        M();
        K(0);
        return I(0);
    }

    @Override // defpackage.ded
    public final hln h() {
        return null;
    }

    @Override // defpackage.ddw
    public final SoftKeyView i() {
        return this.p;
    }

    public final SoftKeyView j(int i) {
        if (i < 0) {
            return null;
        }
        llp llpVar = this.j;
        if (i < ((lrl) llpVar).c) {
            return (SoftKeyView) llpVar.get(i);
        }
        bql bqlVar = this.k;
        int i2 = i - bqlVar.b;
        if (i2 >= 0) {
            llp llpVar2 = bqlVar.c;
            if (i2 < ((lrl) llpVar2).c) {
                return (SoftKeyView) llpVar2.get(i2);
            }
        }
        return null;
    }

    @Override // defpackage.ddw
    public final List k(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        m(list, arrayList);
        return arrayList;
    }

    @Override // defpackage.ddw
    public final void l(List list) {
        m(list, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(java.util.List r23, java.util.ArrayList r24) {
        /*
            Method dump skipped, instructions count: 971
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.inputmethod.latin.keyboard.widget.LatinFixedCountCandidatesHolderView.m(java.util.List, java.util.ArrayList):void");
    }

    @Override // defpackage.ded
    public final void n() {
        llp llpVar = this.j;
        int i = ((lrl) llpVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            o((SoftKeyView) llpVar.get(i2));
        }
        this.k.b();
        s();
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        ddv ddvVar = this.d;
        if (ddvVar == null || i <= 0) {
            return;
        }
        if (i4 <= 0) {
            ddvVar.a();
        } else {
            ddvVar.b();
        }
    }

    @Override // defpackage.ded
    public final void q(boolean z) {
        this.s = z;
        M();
    }

    public final void s() {
        this.f = 0;
        this.q = -1;
        this.p = null;
        this.r = this.g;
        this.g = -1;
        J();
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
        int layoutDirection = getLayoutDirection();
        super.setLayoutDirection(i);
        if (i != layoutDirection) {
            N(true);
        }
    }

    @Override // defpackage.jdb
    public final void t(gqc gqcVar) {
        this.l.i = gqcVar;
        llp llpVar = this.j;
        int i = ((lrl) llpVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((SoftKeyView) llpVar.get(i2)).i(gqcVar);
        }
        llp llpVar2 = this.k.c;
        int i3 = ((lrl) llpVar2).c;
        for (int i4 = 0; i4 < i3; i4++) {
            ((SoftKeyView) llpVar2.get(i4)).i(gqcVar);
        }
    }

    @Override // defpackage.ded
    public final void v(int[] iArr) {
        this.u = new dpe(iArr);
        this.l.j = iArr;
    }

    @Override // defpackage.ded
    public final void w(float f) {
        this.l.f = f;
    }

    @Override // defpackage.ddw
    public final void x(ddv ddvVar) {
        this.d = ddvVar;
    }

    @Override // defpackage.jdb
    public final void y(float f, float f2) {
        this.l.g = f;
    }

    @Override // defpackage.ddx
    public final void z(SoftKeyView softKeyView) {
        this.a = softKeyView;
        boolean z = false;
        if (softKeyView == null) {
            this.b = false;
            return;
        }
        if (softKeyView.getVisibility() == 0) {
            z = true;
        }
        this.b = z;
        this.a.f(new cgm(this, 1));
    }

    public LatinFixedCountCandidatesHolderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArray;
        this.q = -1;
        this.g = -1;
        this.r = -1;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, bos.b);
            try {
                float f = typedArray.getFloat(0, 0.4f);
                this.n = f;
                int integer = typedArray.getInteger(1, 9);
                this.c = integer;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                if (integer % 2 != 0 || f + f <= 1.0f) {
                    this.m = (int) jgd.w(context, attributeSet, "max_width", -1.0f);
                    deb d = d(context, new bqi(attributeSet));
                    this.l = d;
                    int i = integer - 1;
                    llk f2 = llp.f(i);
                    for (int i2 = 0; i2 < i; i2++) {
                        SoftKeyView f3 = d.f();
                        f3.setVisibility(8);
                        f2.h(f3);
                    }
                    llp g = f2.g();
                    this.j = g;
                    bql bqlVar = new bql(this.l, ((lrl) g).c, ((Long) cit.u.c()).intValue());
                    this.k = bqlVar;
                    bqlVar.setId(R.id.f66020_resource_name_obfuscated_res_0x7f0b07b8);
                    this.l.i(bqlVar);
                    llk f4 = llp.f(this.c);
                    f4.j(g);
                    f4.h(bqlVar);
                    llp g2 = f4.g();
                    this.i = g2;
                    int i3 = ((lrl) g2).c;
                    for (int i4 = 0; i4 < i3; i4++) {
                        addView((View) g2.get(i4));
                    }
                    return;
                }
                throw new IllegalArgumentException("The bestCandidateWidthPercentile * 2 should not exceed 1 when there are even candidates, the middle two candidates will have the same width");
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

    @Override // defpackage.ded
    public final hln f(iay iayVar) {
        int i = this.f;
        if (i == 0) {
            return null;
        }
        int i2 = iayVar.c;
        if (i2 == 21) {
            int i3 = this.q;
            if (i3 > 0) {
                K(i3 - 1);
            }
        } else if (i2 != 22) {
            int a = a(iayVar);
            if (a < 0 || a >= this.f) {
                return null;
            }
            K(a);
        } else {
            int i4 = this.q;
            if (i4 < 0 || i4 >= i - 1) {
                return null;
            }
            K(i4 + 1);
        }
        int i5 = this.q;
        if (i5 < 0) {
            return g();
        }
        return I(i5);
    }

    private final int H() {
        SoftKeyView softKeyView = this.a;
        int i = 0;
        if (softKeyView != null && this.b) {
            int width = softKeyView.getWidth();
            if (width != 0) {
                i = width;
            } else {
                softKeyView.measure(0, 0);
                i = softKeyView.getMeasuredWidth();
            }
        }
        return Math.max(Math.max(this.m, getWidth()) - i, 1);
    }
}
