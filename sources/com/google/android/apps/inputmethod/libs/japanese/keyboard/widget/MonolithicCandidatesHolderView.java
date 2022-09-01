package com.google.android.apps.inputmethod.libs.japanese.keyboard.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MonolithicCandidatesHolderView extends FrameLayout implements AbsListView.OnScrollListener, dlc, jdb {
    private static final lug b = hin.a;
    private static final hhl c = hhq.f("japanese_candidate_width_quantization_level", 1);
    public FrameLayout a;
    private dlb d;
    private final int f;
    private final hhk g;
    private dla h;
    private final int i;
    private final int j;
    private boolean k;
    private final deb m;
    private SoftKeyView n;
    private final List e = lre.A();
    private int l = -1;

    public MonolithicCandidatesHolderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        bvl bvlVar = new bvl(this, 12);
        this.g = bvlVar;
        TypedArray typedArray = null;
        try {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dkp.b, 0, 0);
            try {
                int resourceId = obtainStyledAttributes.getResourceId(3, 0);
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
                this.i = dimensionPixelSize;
                int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(0, 1);
                if (dimensionPixelSize2 <= 0) {
                    ((luc) b.a(hip.a).k("com/google/android/apps/inputmethod/libs/japanese/keyboard/widget/MonolithicCandidatesHolderView", "<init>", 119, "MonolithicCandidatesHolderView.java")).u("mMinCandidateWidth [%d] <= 0", dimensionPixelSize2);
                    this.f = 1;
                } else {
                    this.f = dimensionPixelSize2;
                }
                int i = obtainStyledAttributes.getInt(2, 0);
                this.j = i;
                if (obtainStyledAttributes != null) {
                    obtainStyledAttributes.recycle();
                }
                deb debVar = new deb(context, new dec(attributeSet), null, 40, 20);
                this.m = debVar;
                dla dlaVar = new dla(context, debVar, resourceId, dimensionPixelSize, i);
                this.h = dlaVar;
                dlaVar.setDivider(null);
                this.h.setOnScrollListener(this);
                this.h.setSelector(R.drawable.f46210_resource_name_obfuscated_res_0x7f08012e);
                addView(this.h, new ViewGroup.LayoutParams(-1, -1));
                c.e(bvlVar);
            } catch (Throwable th) {
                th = th;
                typedArray = obtainStyledAttributes;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void e() {
        if (!this.k && this.h.getLastVisiblePosition() == this.h.getCount() - 1) {
            dlb dlbVar = this.d;
            if (dlbVar != null) {
                dlbVar.u(2000 - b());
            }
            this.k = true;
        }
    }

    private final void j() {
        FrameLayout frameLayout = this.a;
        if (frameLayout != null) {
            frameLayout.setVisibility(true != this.e.isEmpty() ? 0 : 4);
        }
    }

    @Override // defpackage.jdb
    public final void A(jdr jdrVar) {
        this.m.h = jdrVar;
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
        int i = 0;
        while (true) {
            if (i >= this.e.size()) {
                i = -1;
                break;
            } else if (this.e.get(i) == hlnVar) {
                break;
            } else {
                i++;
            }
        }
        this.l = i;
        this.h.d(i);
        return this.l != -1;
    }

    @Override // defpackage.dlc
    public final int a() {
        int i = this.h.d;
        return i + i;
    }

    @Override // defpackage.ddw
    public final int b() {
        return this.e.size();
    }

    @Override // defpackage.dlc
    public final int c() {
        return this.l;
    }

    @Override // defpackage.ded
    public final hln f(iay iayVar) {
        return null;
    }

    @Override // defpackage.ded
    public final hln g() {
        return null;
    }

    @Override // defpackage.ded
    public final hln h() {
        return null;
    }

    @Override // defpackage.dlc
    public final void hd(dlb dlbVar) {
        this.d = dlbVar;
    }

    @Override // defpackage.ddw
    public final SoftKeyView i() {
        return this.n;
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
        this.e.addAll(list);
        this.n = this.h.a(list);
        j();
        ieh.j().e(dry.SHOW_CANDIDATES, this.h.b());
    }

    @Override // defpackage.ded
    public final void n() {
        this.e.clear();
        this.k = false;
        this.h.c();
        j();
        this.n = null;
        ieh.j().e(dry.SHOW_CANDIDATES, this.h.b());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        hhl hhlVar = c;
        int longValue = (int) ((i5 / this.f) * ((Long) hhlVar.c()).longValue());
        dla dlaVar = this.h;
        if (dlaVar.d != longValue) {
            if (i5 > 0 && i5 != dlaVar.c) {
                dlaVar.c = i5;
                dlaVar.c();
            }
            dla dlaVar2 = this.h;
            if (dlaVar2.d != longValue) {
                dlaVar2.d = longValue;
                dlaVar2.c();
            }
            dla dlaVar3 = this.h;
            int longValue2 = (int) (this.j * ((Long) hhlVar.c()).longValue());
            if (dlaVar3.b != longValue2) {
                dlaVar3.b = longValue2;
                dlaVar3.j.notifyDataSetChanged();
            }
            this.h.c();
            this.h.a(this.e);
            this.h.d(this.l);
            FrameLayout frameLayout = this.a;
            if (frameLayout != null) {
                int measuredWidth = frameLayout.getMeasuredWidth();
                dla dlaVar4 = this.h;
                int i6 = ((dlaVar4.c / dlaVar4.d) - measuredWidth) / 2;
                if (i6 > 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.a.getLayoutParams();
                    layoutParams.rightMargin += i6;
                    this.a.setLayoutParams(layoutParams);
                }
            }
        }
        this.h.setOnScrollListener(null);
        super.onLayout(z, i, i2, i3, i4);
        this.h.setOnScrollListener(this);
        e();
        ieh.j().e(dry.SHOW_CANDIDATES, this.h.b());
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        e();
        dlb dlbVar = this.d;
        if (dlbVar != null) {
            dla dlaVar = this.h;
            boolean z = true;
            if (dlaVar.getFirstVisiblePosition() <= 0 && (dlaVar.getChildCount() == 0 || (-dlaVar.getChildAt(0).getTop()) <= dlaVar.getChildAt(0).getHeight() / 2)) {
                z = false;
            }
            dlbVar.t(z);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 8) {
            layout(getLeft(), 0, getRight(), 0);
        }
    }

    @Override // defpackage.ded
    public final void q(boolean z) {
    }

    @Override // defpackage.jdb
    public final void t(gqc gqcVar) {
        this.m.i = gqcVar;
    }

    @Override // defpackage.ded
    public final void v(int[] iArr) {
    }

    @Override // defpackage.ded
    public final void w(float f) {
        this.m.f = f;
    }

    @Override // defpackage.ddw
    public final void x(ddv ddvVar) {
        throw null;
    }

    @Override // defpackage.jdb
    public final void y(float f, float f2) {
        this.m.g = f;
        dla dlaVar = this.h;
        int i = (int) (this.i * f);
        if (dlaVar.e != i) {
            dlaVar.e = i;
            dlaVar.j.notifyDataSetChanged();
        }
    }
}
