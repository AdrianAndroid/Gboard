package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ly  reason: default package */
/* loaded from: classes.dex */
public abstract class ly {
    public int A;
    public int B;
    public int C;
    public int D;
    public final azp E;
    public final azp F;
    private final og a;
    private final og b;
    jr r;
    public RecyclerView s;
    public mk t;
    public boolean u = false;
    public boolean v = false;
    public final boolean w = true;
    public final boolean x = true;
    public int y;
    public boolean z;

    public ly() {
        lw lwVar = new lw(this, 1);
        this.a = lwVar;
        lw lwVar2 = new lw(this, 0);
        this.b = lwVar2;
        this.E = new azp(lwVar);
        this.F = new azp(lwVar2);
    }

    public static lx aC(Context context, AttributeSet attributeSet, int i, int i2) {
        lx lxVar = new lx();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ex.a, i, i2);
        lxVar.a = obtainStyledAttributes.getInt(0, 1);
        lxVar.b = obtainStyledAttributes.getInt(10, 1);
        lxVar.c = obtainStyledAttributes.getBoolean(9, false);
        lxVar.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return lxVar;
    }

    public static int ar(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r4 == 1073741824) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int at(int r3, int r4, int r5, int r6, boolean r7) {
        /*
            int r3 = r3 - r5
            r5 = 0
            int r3 = java.lang.Math.max(r5, r3)
            r0 = -1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r7 == 0) goto L19
            if (r6 < 0) goto L10
            goto L1b
        L10:
            if (r6 != r0) goto L2f
            if (r4 == r1) goto L20
            if (r4 == 0) goto L2f
            if (r4 == r2) goto L20
            goto L2f
        L19:
            if (r6 < 0) goto L1e
        L1b:
            r4 = 1073741824(0x40000000, float:2.0)
            goto L31
        L1e:
            if (r6 != r0) goto L22
        L20:
            r6 = r3
            goto L31
        L22:
            r7 = -2
            if (r6 != r7) goto L2f
            if (r4 == r1) goto L2c
            if (r4 != r2) goto L2a
            goto L2c
        L2a:
            r4 = 0
            goto L20
        L2c:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L20
        L2f:
            r4 = 0
            r6 = 0
        L31:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ly.at(int, int, int, int, boolean):int");
    }

    public static final int bA(View view) {
        return view.getRight() + bp(view);
    }

    public static final int bB(View view) {
        return view.getTop() - bq(view);
    }

    public static boolean be(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 <= 0 || i == i3) {
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            } else if (mode == 0) {
                return true;
            } else {
                return mode == 1073741824 && size == i;
            }
        }
        return false;
    }

    public static final int bk(View view) {
        return ((lz) view.getLayoutParams()).d.bottom;
    }

    public static final int bl(View view) {
        Rect rect = ((lz) view.getLayoutParams()).d;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static final int bm(View view) {
        Rect rect = ((lz) view.getLayoutParams()).d;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static final int bn(View view) {
        return ((lz) view.getLayoutParams()).d.left;
    }

    public static final int bo(View view) {
        return ((lz) view.getLayoutParams()).a();
    }

    public static final int bp(View view) {
        return ((lz) view.getLayoutParams()).d.right;
    }

    public static final int bq(View view) {
        return ((lz) view.getLayoutParams()).d.top;
    }

    public static final void bs(View view, int i, int i2, int i3, int i4) {
        lz lzVar = (lz) view.getLayoutParams();
        Rect rect = lzVar.d;
        view.layout(i + rect.left + lzVar.leftMargin, i2 + rect.top + lzVar.topMargin, (i3 - rect.right) - lzVar.rightMargin, (i4 - rect.bottom) - lzVar.bottomMargin);
    }

    public static final int by(View view) {
        return view.getBottom() + bk(view);
    }

    public static final int bz(View view) {
        return view.getLeft() - bn(view);
    }

    private final void g(View view, int i, boolean z) {
        mo j = RecyclerView.j(view);
        if (z || j.v()) {
            this.s.Q.p(j);
        } else {
            this.s.Q.s(j);
        }
        lz lzVar = (lz) view.getLayoutParams();
        if (j.B() || j.w()) {
            if (j.w()) {
                j.p();
            } else {
                j.i();
            }
            this.r.h(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.s) {
            int d = this.r.d(view);
            if (i == -1) {
                i = this.r.a();
            }
            if (d == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.s.indexOfChild(view) + this.s.m());
            } else if (d != i) {
                ly lyVar = this.s.m;
                View aE = lyVar.aE(d);
                if (aE == null) {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + d + lyVar.s.toString());
                }
                lyVar.aM(d);
                lz lzVar2 = (lz) aE.getLayoutParams();
                mo j2 = RecyclerView.j(aE);
                if (j2.v()) {
                    lyVar.s.Q.p(j2);
                } else {
                    lyVar.s.Q.s(j2);
                }
                lyVar.r.h(aE, i, lzVar2, j2.v());
            }
        } else {
            this.r.g(view, i, false);
            lzVar.e = true;
            mk mkVar = this.t;
            if (mkVar != null && mkVar.f && mkVar.d(view) == mkVar.b) {
                mkVar.g = view;
            }
        }
        if (lzVar.f) {
            j.a.invalidate();
            lzVar.f = false;
        }
    }

    public void A(int i, int i2) {
    }

    public void B() {
    }

    public void C(int i, int i2) {
    }

    public void D(int i, int i2) {
    }

    public void E(int i, int i2) {
    }

    public int F(ml mlVar) {
        throw null;
    }

    public int I(ml mlVar) {
        throw null;
    }

    public Parcelable R() {
        throw null;
    }

    public View U(int i) {
        int as = as();
        for (int i2 = 0; i2 < as; i2++) {
            View aE = aE(i2);
            mo j = RecyclerView.j(aE);
            if (j != null && j.c() == i && !j.A() && (this.s.J.g || !j.v())) {
                return aE;
            }
        }
        return null;
    }

    public void V(String str) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.gG(str);
        }
    }

    public void Y(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.s;
        me meVar = recyclerView.e;
        ml mlVar = recyclerView.J;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.s.canScrollVertically(-1) && !this.s.canScrollHorizontally(-1) && !this.s.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        ls lsVar = this.s.l;
        if (lsVar == null) {
            return;
        }
        accessibilityEvent.setItemCount(lsVar.ha());
    }

    public void Z(Parcelable parcelable) {
        throw null;
    }

    public int a(ml mlVar) {
        throw null;
    }

    public final int aA() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int aB() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public final View aD(View view) {
        View gD;
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || (gD = recyclerView.gD(view)) == null || this.r.k(gD)) {
            return null;
        }
        return gD;
    }

    public final View aE(int i) {
        jr jrVar = this.r;
        if (jrVar != null) {
            return jrVar.e(i);
        }
        return null;
    }

    public final View aF() {
        View focusedChild;
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.r.k(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public final void aG(View view) {
        aH(view, -1);
    }

    public final void aH(View view, int i) {
        g(view, i, true);
    }

    public final void aI(View view) {
        aJ(view, -1);
    }

    public final void aJ(View view, int i) {
        g(view, i, false);
    }

    public final void aK(View view, Rect rect) {
        RecyclerView recyclerView = this.s;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.gz(view));
        }
    }

    public final void aL(me meVar) {
        int as = as();
        while (true) {
            as--;
            if (as >= 0) {
                View aE = aE(as);
                mo j = RecyclerView.j(aE);
                if (!j.A()) {
                    if (!j.t() || j.v() || this.s.l.b) {
                        aM(as);
                        meVar.m(aE);
                        this.s.Q.s(j);
                    } else {
                        aV(as);
                        meVar.l(j);
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void aM(int i) {
        aE(i);
        this.r.i(i);
    }

    public void aN(int i) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            int a = recyclerView.h.a();
            for (int i2 = 0; i2 < a; i2++) {
                recyclerView.h.e(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void aO(int i) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            int a = recyclerView.h.a();
            for (int i2 = 0; i2 < a; i2++) {
                recyclerView.h.e(i2).offsetTopAndBottom(i);
            }
        }
    }

    public final void aP(View view, abj abjVar) {
        mo j = RecyclerView.j(view);
        if (j == null || j.v() || this.r.k(j.a)) {
            return;
        }
        RecyclerView recyclerView = this.s;
        r(recyclerView.e, recyclerView.J, view, abjVar);
    }

    public void aQ(int i) {
    }

    public final void aR(me meVar) {
        int as = as();
        while (true) {
            as--;
            if (as >= 0) {
                if (!RecyclerView.j(aE(as)).A()) {
                    aU(as, meVar);
                }
            } else {
                return;
            }
        }
    }

    public final void aS(me meVar) {
        int size = meVar.a.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((mo) meVar.a.get(i)).a;
            mo j = RecyclerView.j(view);
            if (!j.A()) {
                j.n(false);
                if (j.x()) {
                    this.s.removeDetachedView(view, false);
                }
                lv lvVar = this.s.B;
                if (lvVar != null) {
                    lvVar.e(j);
                }
                j.n(true);
                meVar.h(view);
            }
        }
        meVar.a.clear();
        ArrayList arrayList = meVar.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (size > 0) {
            this.s.invalidate();
        }
    }

    public final void aT(View view, me meVar) {
        jr jrVar = this.r;
        int C = jrVar.c.C(view);
        if (C >= 0) {
            if (jrVar.a.g(C)) {
                jrVar.l(view);
            }
            jrVar.c.F(C);
        }
        meVar.k(view);
    }

    public final void aU(int i, me meVar) {
        View aE = aE(i);
        aV(i);
        meVar.k(aE);
    }

    public final void aV(int i) {
        jr jrVar;
        int b;
        View D;
        if (aE(i) == null || (D = jrVar.c.D((b = (jrVar = this.r).b(i)))) == null) {
            return;
        }
        if (jrVar.a.g(b)) {
            jrVar.l(D);
        }
        jrVar.c.F(b);
    }

    public final void aW() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void aX() {
        this.u = true;
    }

    public final void aY(RecyclerView recyclerView) {
        aZ(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void aZ(int i, int i2) {
        this.C = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.A = mode;
        if (mode == 0 && !RecyclerView.a) {
            this.C = 0;
        }
        this.D = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.B = mode2;
        if (mode2 != 0 || RecyclerView.a) {
            return;
        }
        this.D = 0;
    }

    public void aa(int i) {
        throw null;
    }

    public boolean ae() {
        throw null;
    }

    public boolean af() {
        throw null;
    }

    public boolean ag() {
        throw null;
    }

    public boolean aj() {
        return false;
    }

    public void ak(int i, int i2, ml mlVar, kq kqVar) {
        throw null;
    }

    public void al(int i, kq kqVar) {
    }

    public void ao(RecyclerView recyclerView) {
    }

    public void aq(RecyclerView recyclerView, int i) {
        throw null;
    }

    public final int as() {
        jr jrVar = this.r;
        if (jrVar != null) {
            return jrVar.a();
        }
        return 0;
    }

    public final int au() {
        RecyclerView recyclerView = this.s;
        ls lsVar = recyclerView != null ? recyclerView.l : null;
        if (lsVar != null) {
            return lsVar.ha();
        }
        return 0;
    }

    public final int av() {
        return aad.f(this.s);
    }

    public final int aw() {
        return aad.g(this.s);
    }

    public final int ax() {
        return aad.h(this.s);
    }

    public final int ay() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int az() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public int b(ml mlVar) {
        throw null;
    }

    public final void ba(int i, int i2) {
        RecyclerView.p(this.s, i, i2);
    }

    public final void bb(int i, int i2) {
        int as = as();
        if (as != 0) {
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < as; i7++) {
                View aE = aE(i7);
                Rect rect = this.s.j;
                RecyclerView.J(aE, rect);
                if (rect.left < i5) {
                    i5 = rect.left;
                }
                if (rect.right > i3) {
                    i3 = rect.right;
                }
                if (rect.top < i6) {
                    i6 = rect.top;
                }
                if (rect.bottom > i4) {
                    i4 = rect.bottom;
                }
            }
            this.s.j.set(i5, i6, i3, i4);
            u(this.s.j, i, i2);
            return;
        }
        this.s.z(i, i2);
    }

    public final void bc(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.s = null;
            this.r = null;
            this.C = 0;
            this.D = 0;
        } else {
            this.s = recyclerView;
            this.r = recyclerView.h;
            this.C = recyclerView.getWidth();
            this.D = recyclerView.getHeight();
        }
        this.A = 1073741824;
        this.B = 1073741824;
    }

    public final void bd(mk mkVar) {
        mk mkVar2 = this.t;
        if (mkVar2 != null && mkVar != mkVar2 && mkVar2.f) {
            mkVar2.g();
        }
        this.t = mkVar;
        RecyclerView recyclerView = this.s;
        recyclerView.G.d();
        if (mkVar.h) {
            Log.w("RecyclerView", "An instance of " + mkVar.getClass().getSimpleName() + " was started more than once. Each instance of" + mkVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        mkVar.c = recyclerView;
        mkVar.d = this;
        int i = mkVar.b;
        if (i != -1) {
            RecyclerView recyclerView2 = mkVar.c;
            recyclerView2.J.a = i;
            mkVar.f = true;
            mkVar.e = true;
            mkVar.g = recyclerView2.m.U(mkVar.b);
            mkVar.c.G.b();
            mkVar.h = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public final boolean bf() {
        mk mkVar = this.t;
        return mkVar != null && mkVar.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean bg(defpackage.me r3, defpackage.ml r4, int r5, android.os.Bundle r6) {
        /*
            r2 = this;
            android.support.v7.widget.RecyclerView r3 = r2.s
            r4 = 0
            if (r3 == 0) goto L96
            int r3 = r2.D
            int r6 = r2.C
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.support.v7.widget.RecyclerView r1 = r2.s
            android.graphics.Matrix r1 = r1.getMatrix()
            boolean r1 = r1.isIdentity()
            if (r1 == 0) goto L2a
            android.support.v7.widget.RecyclerView r1 = r2.s
            boolean r1 = r1.getGlobalVisibleRect(r0)
            if (r1 == 0) goto L2a
            int r3 = r0.height()
            int r6 = r0.width()
        L2a:
            r0 = 4096(0x1000, float:5.74E-42)
            r1 = 1
            if (r5 == r0) goto L60
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r5 == r0) goto L36
            r3 = 0
        L34:
            r5 = 0
            goto L87
        L36:
            android.support.v7.widget.RecyclerView r5 = r2.s
            r0 = -1
            boolean r5 = r5.canScrollVertically(r0)
            if (r5 == 0) goto L4b
            int r5 = r2.aB()
            int r3 = r3 - r5
            int r5 = r2.ay()
            int r3 = r3 - r5
            int r3 = -r3
            goto L4c
        L4b:
            r3 = 0
        L4c:
            android.support.v7.widget.RecyclerView r5 = r2.s
            boolean r5 = r5.canScrollHorizontally(r0)
            if (r5 == 0) goto L34
            int r5 = r2.az()
            int r6 = r6 - r5
            int r5 = r2.aA()
            int r6 = r6 - r5
            int r5 = -r6
            goto L87
        L60:
            android.support.v7.widget.RecyclerView r5 = r2.s
            boolean r5 = r5.canScrollVertically(r1)
            if (r5 == 0) goto L73
            int r5 = r2.aB()
            int r3 = r3 - r5
            int r5 = r2.ay()
            int r3 = r3 - r5
            goto L74
        L73:
            r3 = 0
        L74:
            android.support.v7.widget.RecyclerView r5 = r2.s
            boolean r5 = r5.canScrollHorizontally(r1)
            if (r5 == 0) goto L34
            int r5 = r2.az()
            int r6 = r6 - r5
            int r5 = r2.aA()
            int r5 = r6 - r5
        L87:
            if (r3 != 0) goto L8d
            if (r5 == 0) goto L8c
            goto L8e
        L8c:
            return r4
        L8d:
            r4 = r3
        L8e:
            android.support.v7.widget.RecyclerView r3 = r2.s
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.au(r5, r4, r6, r1)
            return r1
        L96:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ly.bg(me, ml, int, android.os.Bundle):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00aa, code lost:
        if ((r9.bottom - r14) > r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ae, code lost:
        if (r14 != 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean bh(android.support.v7.widget.RecyclerView r16, android.view.View r17, android.graphics.Rect r18, boolean r19, boolean r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r18
            int r3 = r15.az()
            int r4 = r15.aB()
            int r5 = r0.C
            int r6 = r15.aA()
            int r7 = r0.D
            int r8 = r15.ay()
            int r9 = r17.getLeft()
            int r10 = r2.left
            int r9 = r9 + r10
            int r10 = r17.getScrollX()
            int r9 = r9 - r10
            int r10 = r17.getTop()
            int r11 = r2.top
            int r10 = r10 + r11
            int r11 = r17.getScrollY()
            int r10 = r10 - r11
            int r11 = r18.width()
            int r2 = r18.height()
            int r3 = r9 - r3
            r12 = 0
            int r13 = java.lang.Math.min(r12, r3)
            int r4 = r10 - r4
            int r14 = java.lang.Math.min(r12, r4)
            int r9 = r9 + r11
            int r5 = r5 - r6
            int r9 = r9 - r5
            int r5 = java.lang.Math.max(r12, r9)
            int r10 = r10 + r2
            int r7 = r7 - r8
            int r10 = r10 - r7
            int r2 = java.lang.Math.max(r12, r10)
            int r6 = r15.av()
            r7 = 1
            if (r6 != r7) goto L64
            if (r5 == 0) goto L5f
            r13 = r5
            goto L6b
        L5f:
            int r13 = java.lang.Math.max(r13, r9)
            goto L6b
        L64:
            if (r13 == 0) goto L67
            goto L6b
        L67:
            int r13 = java.lang.Math.min(r3, r5)
        L6b:
            if (r14 == 0) goto L6e
            goto L72
        L6e:
            int r14 = java.lang.Math.min(r4, r2)
        L72:
            if (r20 == 0) goto Lac
            android.view.View r2 = r16.getFocusedChild()
            if (r2 != 0) goto L7b
            goto Lb1
        L7b:
            int r3 = r15.az()
            int r4 = r15.aB()
            int r5 = r0.C
            int r6 = r15.aA()
            int r8 = r0.D
            int r9 = r15.ay()
            int r8 = r8 - r9
            android.support.v7.widget.RecyclerView r9 = r0.s
            android.graphics.Rect r9 = r9.j
            android.support.v7.widget.RecyclerView.J(r2, r9)
            int r2 = r9.left
            int r2 = r2 - r13
            int r5 = r5 - r6
            if (r2 >= r5) goto Lb1
            int r2 = r9.right
            int r2 = r2 - r13
            if (r2 <= r3) goto Lb1
            int r2 = r9.top
            int r2 = r2 - r14
            if (r2 >= r8) goto Lb1
            int r2 = r9.bottom
            int r2 = r2 - r14
            if (r2 <= r4) goto Lb1
        Lac:
            if (r13 != 0) goto Lb2
            if (r14 == 0) goto Lb1
            goto Lb3
        Lb1:
            return r12
        Lb2:
            r12 = r13
        Lb3:
            if (r19 == 0) goto Lb9
            r1.scrollBy(r12, r14)
            goto Lbc
        Lb9:
            r1.ad(r12, r14)
        Lbc:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ly.bh(android.support.v7.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public final boolean bi(View view, int i, int i2, lz lzVar) {
        return view.isLayoutRequested() || !this.w || !be(view.getWidth(), i, lzVar.width) || !be(view.getHeight(), i2, lzVar.height);
    }

    public final void bj() {
        this.v = true;
    }

    public final void br(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((lz) view.getLayoutParams()).d;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.s != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.s.k;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public void bt() {
    }

    public final void bu(int i, int i2) {
        this.s.z(i, i2);
    }

    public boolean bv(View view, int i) {
        return false;
    }

    public final void bw(Runnable runnable) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(runnable);
        }
    }

    public final void bx(RecyclerView recyclerView) {
        this.v = false;
        ao(recyclerView);
    }

    public int c(ml mlVar) {
        throw null;
    }

    public int d(ml mlVar) {
        throw null;
    }

    public int e(me meVar, ml mlVar) {
        return -1;
    }

    public int f(me meVar, ml mlVar) {
        return -1;
    }

    public int h(int i, me meVar, ml mlVar) {
        throw null;
    }

    public int i(int i, me meVar, ml mlVar) {
        throw null;
    }

    public abstract lz j();

    public lz k(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof lz) {
            return new lz((lz) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new lz((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new lz(layoutParams);
    }

    public lz l(Context context, AttributeSet attributeSet) {
        return new lz(context, attributeSet);
    }

    public View n(View view, int i, me meVar, ml mlVar) {
        throw null;
    }

    public void q(me meVar, ml mlVar, abj abjVar) {
        if (this.s.canScrollVertically(-1) || this.s.canScrollHorizontally(-1)) {
            abjVar.d(8192);
            abjVar.l(true);
        }
        if (this.s.canScrollVertically(1) || this.s.canScrollHorizontally(1)) {
            abjVar.d(4096);
            abjVar.l(true);
        }
        abjVar.i(aqq.E(f(meVar, mlVar), e(meVar, mlVar), 0));
    }

    public void r(me meVar, ml mlVar, View view, abj abjVar) {
    }

    public void s(me meVar, ml mlVar) {
        throw null;
    }

    public void t(ml mlVar) {
    }

    public void u(Rect rect, int i, int i2) {
        int width = rect.width();
        int az = az();
        int aA = aA();
        int height = rect.height();
        int aB = aB();
        ba(ar(i, width + az + aA, ax()), ar(i2, height + aB + ay(), aw()));
    }

    public boolean x(lz lzVar) {
        return lzVar != null;
    }

    public boolean y() {
        throw null;
    }
}
