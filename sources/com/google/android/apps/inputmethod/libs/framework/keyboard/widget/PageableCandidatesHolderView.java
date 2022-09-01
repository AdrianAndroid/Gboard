package com.google.android.apps.inputmethod.libs.framework.keyboard.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PageableCandidatesHolderView extends alc implements dew, jdb {
    private static final lug q = hin.a;
    private dpe A;
    public dev i;
    public dee k;
    public dee l;
    public int m;
    public boolean n;
    public final nwo o;
    private final dfk r;
    private SoftKeyView s;
    private final int t;
    private final akt u;
    private int v;
    private hln w;
    private hln x;
    private final deb y;
    private boolean z;
    public final List j = lre.A();
    public final dxs p = new dxs();

    public PageableCandidatesHolderView(Context context, int i, int i2, int i3, deb debVar) {
        super(context);
        dex dexVar = new dex(this);
        this.u = dexVar;
        this.t = i3;
        this.y = debVar;
        this.o = new nwo(context, debVar, i2, i, 0);
        fE(dexVar);
        dfk dfkVar = new dfk(context);
        this.r = dfkVar;
        dfkVar.a = this.h;
    }

    @Override // defpackage.jdb
    public final void A(jdr jdrVar) {
        this.y.h = jdrVar;
    }

    public final void B() {
        int b = this.p.b();
        if (b == 0) {
            if (this.j.isEmpty()) {
                return;
            }
            this.p.h(0, 0);
            this.u.d();
            return;
        }
        int c = this.p.c();
        int i = c - 1;
        if (c != b) {
            return;
        }
        int d = this.p.d(i);
        if (d == -1) {
            throw new lgj("The candidate finish index list should have value for page:" + i);
        } else if (d >= this.j.size()) {
        } else {
            this.p.h(i + 1, d + 1);
            this.u.d();
        }
    }

    public final void C(SoftKeyView softKeyView) {
        if (this.k == null) {
            return;
        }
        SoftKeyView softKeyView2 = this.s;
        if (softKeyView2 != null) {
            softKeyView2.setSelected(false);
            deg degVar = (deg) this.s.getParent();
            if (degVar != null && this.z) {
                degVar.b(false);
            }
        }
        this.s = softKeyView;
        if (softKeyView == null) {
            return;
        }
        softKeyView.setSelected(true);
        deg degVar2 = (deg) this.s.getParent();
        if (degVar2 == null) {
            return;
        }
        if (this.z) {
            degVar2.b(true);
        }
        this.k.d = degVar2;
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
        SoftKeyView e;
        if (hlnVar == null) {
            C((SoftKeyView) null);
            this.n = false;
            return true;
        }
        this.n = true;
        dee deeVar = this.k;
        if (deeVar == null || (e = deeVar.e(hlnVar)) == null) {
            if (!this.j.contains(hlnVar)) {
                return false;
            }
            this.w = hlnVar;
            return true;
        }
        this.x = hlnVar;
        C(e);
        return true;
    }

    @Override // defpackage.dew
    public final void G(dev devVar) {
        this.i = devVar;
    }

    @Override // defpackage.deu
    public final boolean H() {
        dee deeVar = this.k;
        return deeVar == null || deeVar.a == 0;
    }

    @Override // defpackage.deu
    public final boolean I() {
        int e;
        dee deeVar = this.k;
        return deeVar == null || (e = this.p.e(deeVar.a)) == -1 || e + this.k.b == this.j.size();
    }

    @Override // defpackage.deu
    public final boolean J() {
        if (I()) {
            return false;
        }
        fG(this.k.a + 1, false);
        return true;
    }

    @Override // defpackage.deu
    public final boolean K() {
        if (H()) {
            return false;
        }
        fG(this.k.a - 1, false);
        return true;
    }

    @Override // defpackage.ddw
    public final int b() {
        return this.j.size();
    }

    @Override // defpackage.ded
    public final hln f(iay iayVar) {
        int i;
        dpe dpeVar = this.A;
        int i2 = -1;
        if (dpeVar != null && this.z) {
            i2 = dpeVar.e(iayVar);
        }
        if (i2 >= 0) {
            return this.k.a(i2);
        }
        switch (iayVar.c) {
            case 19:
                i = 33;
                break;
            case 20:
                i = 130;
                break;
            case 21:
                i = 17;
                break;
            case 22:
                i = 66;
                break;
            default:
                return null;
        }
        if (this.s == null) {
            return g();
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, this.s, i);
        if (findNextFocus instanceof SoftKeyView) {
            C((SoftKeyView) findNextFocus);
        } else if (i == 17) {
            dee deeVar = this.k;
            if (deeVar != null && !deeVar.j()) {
                SoftKeyView d = deeVar.d();
                if (d != null) {
                    C(d);
                }
            } else if (H()) {
                return null;
            } else {
                K();
            }
        } else if (i != 33) {
            if (i == 66) {
                dee deeVar2 = this.k;
                if (deeVar2 == null || deeVar2.k()) {
                    J();
                } else {
                    SoftKeyView b = deeVar2.b();
                    if (b != null) {
                        C(b);
                    }
                }
            } else if (i == 130) {
                J();
            }
        } else if (H()) {
            return null;
        } else {
            K();
        }
        return (hln) this.s.b.c(iah.PRESS).d().e;
    }

    @Override // defpackage.ded
    public final hln h() {
        return null;
    }

    @Override // defpackage.ddw
    public final SoftKeyView i() {
        return null;
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
        this.j.addAll(list);
        this.v -= list.size();
        dee deeVar = this.l;
        if (deeVar != null) {
            deeVar.f(this.j, s(deeVar));
            z(this.l);
        } else if (!isShown()) {
        } else {
            B();
        }
    }

    @Override // defpackage.ded
    public final void n() {
        this.j.clear();
        this.p.f();
        this.v = 0;
        this.w = null;
        this.x = null;
        this.s = null;
        this.n = false;
        this.k = null;
        this.l = null;
        this.u.d();
        this.i.gs(this, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.alc, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        if (i5 != 0 && this.m == 0) {
            this.m = i5;
            dee deeVar = this.l;
            if (deeVar != null) {
                deeVar.h(i5);
                dee deeVar2 = this.l;
                deeVar2.f(this.j, s(deeVar2));
                z(this.l);
                this.l.forceLayout();
                this.l.measure(View.MeasureSpec.makeMeasureSpec(this.l.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.l.getMeasuredHeight(), 1073741824));
            }
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.alc, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
    }

    @Override // defpackage.alc, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        this.r.a(motionEvent);
        return onTouchEvent;
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (isShown()) {
            B();
        }
    }

    @Override // defpackage.ded
    public final void q(boolean z) {
        this.z = z;
        dee deeVar = this.k;
        if (deeVar != null) {
            boolean z2 = false;
            if (this.n && z) {
                z2 = true;
            }
            deeVar.i(z2);
        }
    }

    public final int s(dee deeVar) {
        return this.p.e(deeVar.a);
    }

    @Override // defpackage.jdb
    public final void t(gqc gqcVar) {
        this.y.i = gqcVar;
    }

    @Override // defpackage.dew
    public final int u() {
        return this.t;
    }

    @Override // defpackage.ded
    public final void v(int[] iArr) {
        this.A = new dpe(iArr);
        this.y.j = iArr;
    }

    @Override // defpackage.ded
    public final void w(float f) {
        this.y.f = f;
    }

    @Override // defpackage.ddw
    public final void x(ddv ddvVar) {
        throw null;
    }

    @Override // defpackage.jdb
    public final void y(float f, float f2) {
        this.y.g = f;
    }

    public final void z(dee deeVar) {
        SoftKeyView e;
        dee deeVar2 = this.k;
        if (deeVar == deeVar2) {
            this.i.gs(this, deeVar2.a);
        }
        if (deeVar.c) {
            this.p.g(deeVar.a, (deeVar.b + this.p.e(deeVar.a)) - 1);
            post(new cvj(this, 19));
        } else if (this.v <= 0) {
            int i = (this.t - deeVar.b) + 1;
            this.v = i;
            this.i.r(i);
        }
        hln hlnVar = this.w;
        if (hlnVar == null) {
            hln hlnVar2 = this.x;
            if (hlnVar2 == null || (e = deeVar.e(hlnVar2)) == null) {
                return;
            }
            C(e);
            return;
        }
        SoftKeyView e2 = deeVar.e(hlnVar);
        if (e2 != null) {
            this.k = deeVar;
            C(e2);
            this.x = this.w;
            this.w = null;
            post(new bwt(this, deeVar, 16));
            return;
        }
        post(new cvj(this, 18));
    }

    @Override // defpackage.ded
    public final hln g() {
        SoftKeyView c;
        dee deeVar;
        this.n = true;
        hln hlnVar = null;
        if (this.m == 0 && (deeVar = this.k) != null) {
            int e = this.p.e(deeVar.a);
            if (e < this.j.size()) {
                hlnVar = (hln) this.j.get(e);
            }
            this.w = hlnVar;
            return hlnVar;
        }
        dee deeVar2 = this.k;
        if (deeVar2 == null || (c = deeVar2.c()) == null) {
            return null;
        }
        C(c);
        hln hlnVar2 = (hln) c.b.c(iah.PRESS).d().e;
        this.x = hlnVar2;
        return hlnVar2;
    }

    public PageableCandidatesHolderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        int i2;
        dex dexVar = new dex(this);
        this.u = dexVar;
        int attributeResourceValue = attributeSet.getAttributeResourceValue(null, "row_background", 0);
        int d = jgd.d(context, attributeSet, null, "row_count", 4);
        if (d < 0) {
            ((luc) q.a(hip.a).k("com/google/android/apps/inputmethod/libs/framework/keyboard/widget/PageableCandidatesHolderView", "<init>", 158, "PageableCandidatesHolderView.java")).u("rowCount [%d] < 0", d);
            i = 4;
        } else {
            i = d;
        }
        int d2 = jgd.d(context, attributeSet, null, "max_candidates_per_row", 6);
        if (d2 < 0) {
            ((luc) q.a(hip.a).k("com/google/android/apps/inputmethod/libs/framework/keyboard/widget/PageableCandidatesHolderView", "<init>", 165, "PageableCandidatesHolderView.java")).u("maxCandidatesPerRow [%d] < 0", d2);
            i2 = 6;
        } else {
            i2 = d2;
        }
        this.t = i * i2;
        deb debVar = new deb(context, new dec(attributeSet), jgd.k(context, attributeSet, null, "deletable_label"));
        this.y = debVar;
        this.o = new nwo(context, debVar, i2, i, attributeResourceValue);
        fE(dexVar);
        dfk dfkVar = new dfk(context);
        this.r = dfkVar;
        dfkVar.a = this.h;
    }
}
