package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Arrays;
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends ly implements mj {
    private int G;
    private final Rect H;
    private final nj I;
    private boolean J;
    private boolean K;
    private int[] L;
    private final Runnable M;
    public int a;
    public no[] b;
    public lp c;
    lp d;
    public boolean e;
    boolean f;
    int g;
    int h;
    public nm i;
    private int j;
    private int k;
    private final kv l;
    private BitSet m;
    private int n;
    private boolean o;
    private boolean p;
    private nn q;

    public StaggeredGridLayoutManager(int i) {
        this.a = -1;
        this.e = false;
        this.f = false;
        this.g = -1;
        this.h = Integer.MIN_VALUE;
        this.i = new nm();
        this.n = 2;
        this.H = new Rect();
        this.I = new nj(this);
        this.J = false;
        this.K = true;
        this.M = new az(this, 19);
        this.j = 1;
        H(i);
        this.l = new kv();
        ab();
    }

    private final int N(int i) {
        if (as() == 0) {
            return this.f ? 1 : -1;
        }
        return (i < g()) != this.f ? -1 : 1;
    }

    private final int O(ml mlVar) {
        if (as() == 0) {
            return 0;
        }
        return ey.b(mlVar, this.c, v(!this.K), p(!this.K), this, this.K);
    }

    private final int P(ml mlVar) {
        if (as() == 0) {
            return 0;
        }
        return ey.c(mlVar, this.c, v(!this.K), p(!this.K), this, this.K, this.f);
    }

    private final int S(ml mlVar) {
        if (as() == 0) {
            return 0;
        }
        return ey.d(mlVar, this.c, v(!this.K), p(!this.K), this, this.K);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x034e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int T(defpackage.me r20, defpackage.kv r21, defpackage.ml r22) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.T(me, kv, ml):int");
    }

    private final int W(int i) {
        int f = this.b[0].f(i);
        for (int i2 = 1; i2 < this.a; i2++) {
            int f2 = this.b[i2].f(i);
            if (f2 > f) {
                f = f2;
            }
        }
        return f;
    }

    private final int X(int i) {
        int h = this.b[0].h(i);
        for (int i2 = 1; i2 < this.a; i2++) {
            int h2 = this.b[i2].h(i);
            if (h2 < h) {
                h = h2;
            }
        }
        return h;
    }

    private final void ab() {
        this.c = lp.q(this, this.j);
        this.d = lp.q(this, 1 - this.j);
    }

    private final void ac(me meVar, ml mlVar, boolean z) {
        int f;
        int W = W(Integer.MIN_VALUE);
        if (W != Integer.MIN_VALUE && (f = this.c.f() - W) > 0) {
            int i = f - (-o(-f, meVar, mlVar));
            if (!z || i <= 0) {
                return;
            }
            this.c.n(i);
        }
    }

    private final void ad(me meVar, ml mlVar, boolean z) {
        int j;
        int X = X(Integer.MAX_VALUE);
        if (X != Integer.MAX_VALUE && (j = X - this.c.j()) > 0) {
            int o = j - o(j, meVar, mlVar);
            if (!z || o <= 0) {
                return;
            }
            this.c.n(-o);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void ah(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f
            if (r0 == 0) goto L9
            int r0 = r6.m()
            goto Ld
        L9:
            int r0 = r6.g()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            nm r4 = r6.i
            r4.i(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            nm r9 = r6.i
            r9.f(r7, r4)
            nm r7 = r6.i
            r7.e(r8, r4)
            goto L41
        L36:
            nm r9 = r6.i
            r9.f(r7, r8)
            goto L41
        L3c:
            nm r9 = r6.i
            r9.e(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.f
            if (r7 == 0) goto L4d
            int r7 = r6.g()
            goto L51
        L4d:
            int r7 = r6.m()
        L51:
            if (r3 > r7) goto L56
            r6.aW()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.ah(int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:253:0x03e9, code lost:
        if (K() != false) goto L254;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void ai(defpackage.me r12, defpackage.ml r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.ai(me, ml, boolean):void");
    }

    private final void am(me meVar, kv kvVar) {
        int min;
        int min2;
        if (!kvVar.a || kvVar.i) {
            return;
        }
        if (kvVar.b == 0) {
            if (kvVar.e == -1) {
                an(meVar, kvVar.g);
                return;
            } else {
                ap(meVar, kvVar.f);
                return;
            }
        }
        int i = 1;
        if (kvVar.e == -1) {
            int i2 = kvVar.f;
            int h = this.b[0].h(i2);
            while (i < this.a) {
                int h2 = this.b[i].h(i2);
                if (h2 > h) {
                    h = h2;
                }
                i++;
            }
            int i3 = i2 - h;
            if (i3 < 0) {
                min2 = kvVar.g;
            } else {
                min2 = kvVar.g - Math.min(i3, kvVar.b);
            }
            an(meVar, min2);
            return;
        }
        int i4 = kvVar.g;
        int f = this.b[0].f(i4);
        while (i < this.a) {
            int f2 = this.b[i].f(i4);
            if (f2 < f) {
                f = f2;
            }
            i++;
        }
        int i5 = f - kvVar.g;
        if (i5 < 0) {
            min = kvVar.f;
        } else {
            min = Math.min(i5, kvVar.b) + kvVar.f;
        }
        ap(meVar, min);
    }

    private final void an(me meVar, int i) {
        int as = as();
        while (true) {
            as--;
            if (as >= 0) {
                View aE = aE(as);
                if (this.c.d(aE) < i || this.c.m(aE) < i) {
                    return;
                }
                nk nkVar = (nk) aE.getLayoutParams();
                if (nkVar.b) {
                    for (int i2 = 0; i2 < this.a; i2++) {
                        if (this.b[i2].a.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.a; i3++) {
                        this.b[i3].o();
                    }
                } else if (nkVar.a.a.size() == 1) {
                    return;
                } else {
                    nkVar.a.o();
                }
                aT(aE, meVar);
            } else {
                return;
            }
        }
    }

    private final void ap(me meVar, int i) {
        while (as() > 0) {
            View aE = aE(0);
            if (this.c.a(aE) > i || this.c.l(aE) > i) {
                return;
            }
            nk nkVar = (nk) aE.getLayoutParams();
            if (nkVar.b) {
                for (int i2 = 0; i2 < this.a; i2++) {
                    if (this.b[i2].a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.a; i3++) {
                    this.b[i3].p();
                }
            } else if (nkVar.a.a.size() == 1) {
                return;
            } else {
                nkVar.a.p();
            }
            aT(aE, meVar);
        }
    }

    private final void bC() {
        this.f = (this.j == 1 || !L()) ? this.e : !this.e;
    }

    private final void bD(int i) {
        kv kvVar = this.l;
        kvVar.e = i;
        int i2 = 1;
        if (this.f != (i == -1)) {
            i2 = -1;
        }
        kvVar.d = i2;
    }

    private final void bE(int i, int i2) {
        for (int i3 = 0; i3 < this.a; i3++) {
            if (!this.b[i3].a.isEmpty()) {
                bG(this.b[i3], i, i2);
            }
        }
    }

    private final void bF(int i, ml mlVar) {
        int i2;
        int i3;
        RecyclerView recyclerView;
        int i4;
        kv kvVar = this.l;
        boolean z = false;
        kvVar.b = 0;
        kvVar.c = i;
        if (!bf() || (i4 = mlVar.a) == -1) {
            i2 = 0;
        } else {
            if (this.f == (i4 < i)) {
                i2 = this.c.k();
            } else {
                i3 = this.c.k();
                i2 = 0;
                recyclerView = this.s;
                if (recyclerView != null || !recyclerView.i) {
                    this.l.g = this.c.e() + i2;
                    this.l.f = -i3;
                } else {
                    this.l.f = this.c.j() - i3;
                    this.l.g = this.c.f() + i2;
                }
                kv kvVar2 = this.l;
                kvVar2.h = false;
                kvVar2.a = true;
                if (this.c.h() == 0 && this.c.e() == 0) {
                    z = true;
                }
                kvVar2.i = z;
            }
        }
        i3 = 0;
        recyclerView = this.s;
        if (recyclerView != null) {
        }
        this.l.g = this.c.e() + i2;
        this.l.f = -i3;
        kv kvVar22 = this.l;
        kvVar22.h = false;
        kvVar22.a = true;
        if (this.c.h() == 0) {
            z = true;
        }
        kvVar22.i = z;
    }

    private final void bG(no noVar, int i, int i2) {
        int i3 = noVar.d;
        if (i == -1) {
            if (noVar.g() + i3 > i2) {
                return;
            }
            this.m.set(noVar.e, false);
        } else if (noVar.e() - i3 < i2) {
        } else {
            this.m.set(noVar.e, false);
        }
    }

    private final boolean bH(int i) {
        if (this.j == 0) {
            return (i == -1) != this.f;
        }
        return ((i == -1) == this.f) == L();
    }

    private final void bI(View view, int i, int i2) {
        aK(view, this.H);
        nk nkVar = (nk) view.getLayoutParams();
        int bJ = bJ(i, nkVar.leftMargin + this.H.left, nkVar.rightMargin + this.H.right);
        int bJ2 = bJ(i2, nkVar.topMargin + this.H.top, nkVar.bottomMargin + this.H.bottom);
        if (bi(view, bJ, bJ2, nkVar)) {
            view.measure(bJ, bJ2);
        }
    }

    private static final int bJ(int i, int i2, int i3) {
        if (i2 == 0) {
            if (i3 == 0) {
                return i;
            }
            i2 = 0;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // defpackage.ly
    public final void A(int i, int i2) {
        ah(i, i2, 1);
    }

    @Override // defpackage.ly
    public final void B() {
        this.i.c();
        aW();
    }

    @Override // defpackage.ly
    public final void C(int i, int i2) {
        ah(i, i2, 8);
    }

    @Override // defpackage.ly
    public final void D(int i, int i2) {
        ah(i, i2, 2);
    }

    @Override // defpackage.ly
    public final void E(int i, int i2) {
        ah(i, i2, 4);
    }

    @Override // defpackage.ly
    public final int F(ml mlVar) {
        return O(mlVar);
    }

    public final void G(boolean z) {
        V(null);
        nn nnVar = this.q;
        if (nnVar != null && nnVar.h != z) {
            nnVar.h = z;
        }
        this.e = z;
        aW();
    }

    public final void H(int i) {
        V(null);
        if (i != this.a) {
            this.i.c();
            aW();
            this.a = i;
            this.m = new BitSet(i);
            this.b = new no[this.a];
            for (int i2 = 0; i2 < this.a; i2++) {
                this.b[i2] = new no(this, i2);
            }
            aW();
        }
    }

    @Override // defpackage.ly
    public final int I(ml mlVar) {
        return O(mlVar);
    }

    final void J(int i) {
        this.k = i / this.a;
        this.G = View.MeasureSpec.makeMeasureSpec(i, this.d.h());
    }

    public final boolean K() {
        int g;
        int m;
        if (as() == 0 || this.n == 0 || !this.v) {
            return false;
        }
        if (this.f) {
            g = m();
            m = g();
        } else {
            g = g();
            m = m();
        }
        if (g == 0) {
            if (w() != null) {
                this.i.c();
                aX();
                aW();
                return true;
            }
            g = 0;
        }
        if (!this.J) {
            return false;
        }
        int i = true != this.f ? 1 : -1;
        int i2 = m + 1;
        nl h = this.i.h(g, i2, i);
        if (h == null) {
            this.J = false;
            this.i.g(i2);
            return false;
        }
        nl h2 = this.i.h(g, h.a, -i);
        if (h2 == null) {
            this.i.g(h.a);
        } else {
            this.i.g(h2.a + 1);
        }
        aX();
        aW();
        return true;
    }

    final boolean L() {
        return av() == 1;
    }

    public final void M(int[] iArr) {
        int length = iArr.length;
        if (length < this.a) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.a + ", array size:" + length);
        }
        for (int i = 0; i < this.a; i++) {
            no noVar = this.b[i];
            iArr[i] = noVar.f.e ? noVar.d(noVar.a.size() - 1, -1, true) : noVar.d(0, noVar.a.size(), true);
        }
    }

    @Override // defpackage.mj
    public final PointF Q(int i) {
        int N = N(i);
        PointF pointF = new PointF();
        if (N == 0) {
            return null;
        }
        if (this.j == 0) {
            pointF.x = N;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = N;
        }
        return pointF;
    }

    @Override // defpackage.ly
    public final Parcelable R() {
        int g;
        View v;
        int h;
        int j;
        int[] iArr;
        nn nnVar = this.q;
        if (nnVar != null) {
            return new nn(nnVar);
        }
        nn nnVar2 = new nn();
        nnVar2.h = this.e;
        nnVar2.i = this.o;
        nnVar2.j = this.p;
        nm nmVar = this.i;
        if (nmVar == null || (iArr = nmVar.a) == null) {
            nnVar2.e = 0;
        } else {
            nnVar2.f = iArr;
            nnVar2.e = nnVar2.f.length;
            nnVar2.g = nmVar.b;
        }
        int i = -1;
        if (as() > 0) {
            if (this.o) {
                g = m();
            } else {
                g = g();
            }
            nnVar2.a = g;
            if (this.f) {
                v = p(true);
            } else {
                v = v(true);
            }
            if (v != null) {
                i = bo(v);
            }
            nnVar2.b = i;
            int i2 = this.a;
            nnVar2.c = i2;
            nnVar2.d = new int[i2];
            for (int i3 = 0; i3 < this.a; i3++) {
                if (this.o) {
                    h = this.b[i3].f(Integer.MIN_VALUE);
                    if (h != Integer.MIN_VALUE) {
                        j = this.c.f();
                        h -= j;
                        nnVar2.d[i3] = h;
                    } else {
                        nnVar2.d[i3] = h;
                    }
                } else {
                    h = this.b[i3].h(Integer.MIN_VALUE);
                    if (h != Integer.MIN_VALUE) {
                        j = this.c.j();
                        h -= j;
                        nnVar2.d[i3] = h;
                    } else {
                        nnVar2.d[i3] = h;
                    }
                }
            }
        } else {
            nnVar2.a = -1;
            nnVar2.b = -1;
            nnVar2.c = 0;
        }
        return nnVar2;
    }

    @Override // defpackage.ly
    public final void V(String str) {
        if (this.q == null) {
            super.V(str);
        }
    }

    @Override // defpackage.ly
    public final void Y(AccessibilityEvent accessibilityEvent) {
        super.Y(accessibilityEvent);
        if (as() > 0) {
            View v = v(false);
            View p = p(false);
            if (v == null || p == null) {
                return;
            }
            int bo = bo(v);
            int bo2 = bo(p);
            if (bo < bo2) {
                accessibilityEvent.setFromIndex(bo);
                accessibilityEvent.setToIndex(bo2);
                return;
            }
            accessibilityEvent.setFromIndex(bo2);
            accessibilityEvent.setToIndex(bo);
        }
    }

    @Override // defpackage.ly
    public final void Z(Parcelable parcelable) {
        if (parcelable instanceof nn) {
            nn nnVar = (nn) parcelable;
            this.q = nnVar;
            if (this.g != -1) {
                nnVar.a();
                this.q.b();
            }
            aW();
        }
    }

    @Override // defpackage.ly
    public final int a(ml mlVar) {
        return P(mlVar);
    }

    @Override // defpackage.ly
    public final void aN(int i) {
        super.aN(i);
        for (int i2 = 0; i2 < this.a; i2++) {
            this.b[i2].n(i);
        }
    }

    @Override // defpackage.ly
    public final void aO(int i) {
        super.aO(i);
        for (int i2 = 0; i2 < this.a; i2++) {
            this.b[i2].n(i);
        }
    }

    @Override // defpackage.ly
    public final void aQ(int i) {
        if (i == 0) {
            K();
        }
    }

    @Override // defpackage.ly
    public final void aa(int i) {
        nn nnVar = this.q;
        if (nnVar != null && nnVar.a != i) {
            nnVar.a();
        }
        this.g = i;
        this.h = Integer.MIN_VALUE;
        aW();
    }

    @Override // defpackage.ly
    public final boolean ae() {
        return this.j == 0;
    }

    @Override // defpackage.ly
    public final boolean af() {
        return this.j == 1;
    }

    @Override // defpackage.ly
    public final boolean ag() {
        return this.n != 0;
    }

    @Override // defpackage.ly
    public final void ak(int i, int i2, ml mlVar, kq kqVar) {
        int f;
        int i3;
        if (1 == this.j) {
            i = i2;
        }
        if (as() == 0 || i == 0) {
            return;
        }
        z(i, mlVar);
        int[] iArr = this.L;
        if (iArr == null || iArr.length < this.a) {
            this.L = new int[this.a];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.a; i5++) {
            kv kvVar = this.l;
            if (kvVar.d == -1) {
                f = kvVar.f;
                i3 = this.b[i5].h(f);
            } else {
                f = this.b[i5].f(kvVar.g);
                i3 = this.l.g;
            }
            int i6 = f - i3;
            if (i6 >= 0) {
                this.L[i4] = i6;
                i4++;
            }
        }
        Arrays.sort(this.L, 0, i4);
        for (int i7 = 0; i7 < i4 && this.l.a(mlVar); i7++) {
            kqVar.a(this.l.c, this.L[i7]);
            kv kvVar2 = this.l;
            kvVar2.c += kvVar2.d;
        }
    }

    @Override // defpackage.ly
    public final void ao(RecyclerView recyclerView) {
        bw(this.M);
        for (int i = 0; i < this.a; i++) {
            this.b[i].m();
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.ly
    public final void aq(RecyclerView recyclerView, int i) {
        mk mkVar = new mk(recyclerView.getContext());
        mkVar.b = i;
        bd(mkVar);
    }

    @Override // defpackage.ly
    public final int b(ml mlVar) {
        return S(mlVar);
    }

    @Override // defpackage.ly
    public final void bt() {
        this.i.c();
        for (int i = 0; i < this.a; i++) {
            this.b[i].m();
        }
    }

    @Override // defpackage.ly
    public final int c(ml mlVar) {
        return P(mlVar);
    }

    @Override // defpackage.ly
    public final int d(ml mlVar) {
        return S(mlVar);
    }

    final int g() {
        if (as() == 0) {
            return 0;
        }
        return bo(aE(0));
    }

    @Override // defpackage.ly
    public final int h(int i, me meVar, ml mlVar) {
        return o(i, meVar, mlVar);
    }

    @Override // defpackage.ly
    public final int i(int i, me meVar, ml mlVar) {
        return o(i, meVar, mlVar);
    }

    @Override // defpackage.ly
    public final lz j() {
        return this.j == 0 ? new nk(-2, -1) : new nk(-1, -2);
    }

    @Override // defpackage.ly
    public final lz k(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new nk((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new nk(layoutParams);
    }

    @Override // defpackage.ly
    public final lz l(Context context, AttributeSet attributeSet) {
        return new nk(context, attributeSet);
    }

    final int m() {
        int as = as();
        if (as == 0) {
            return 0;
        }
        return bo(aE(as - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x003a, code lost:
        if (r9.j == 1) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x003f, code lost:
        if (r9.j == 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x004c, code lost:
        if (L() == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0059, code lost:
        if (L() == false) goto L110;
     */
    @Override // defpackage.ly
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View n(android.view.View r10, int r11, defpackage.me r12, defpackage.ml r13) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.n(android.view.View, int, me, ml):android.view.View");
    }

    final int o(int i, me meVar, ml mlVar) {
        if (as() == 0 || i == 0) {
            return 0;
        }
        z(i, mlVar);
        int T = T(meVar, this.l, mlVar);
        if (this.l.b >= T) {
            i = i < 0 ? -T : T;
        }
        this.c.n(-i);
        this.o = this.f;
        kv kvVar = this.l;
        kvVar.b = 0;
        am(meVar, kvVar);
        return i;
    }

    final View p(boolean z) {
        int j = this.c.j();
        int f = this.c.f();
        View view = null;
        for (int as = as() - 1; as >= 0; as--) {
            View aE = aE(as);
            int d = this.c.d(aE);
            int a = this.c.a(aE);
            if (a > j && d < f) {
                if (a <= f || !z) {
                    return aE;
                }
                if (view == null) {
                    view = aE;
                }
            }
        }
        return view;
    }

    @Override // defpackage.ly
    public final void s(me meVar, ml mlVar) {
        ai(meVar, mlVar, true);
    }

    @Override // defpackage.ly
    public final void t(ml mlVar) {
        this.g = -1;
        this.h = Integer.MIN_VALUE;
        this.q = null;
        this.I.a();
    }

    @Override // defpackage.ly
    public final void u(Rect rect, int i, int i2) {
        int ar;
        int ar2;
        int az = az() + aA();
        int aB = aB() + ay();
        if (this.j == 1) {
            ar2 = ar(i2, rect.height() + aB, aw());
            ar = ar(i, (this.k * this.a) + az, ax());
        } else {
            ar = ar(i, rect.width() + az, ax());
            ar2 = ar(i2, (this.k * this.a) + aB, aw());
        }
        ba(ar, ar2);
    }

    final View v(boolean z) {
        int j = this.c.j();
        int f = this.c.f();
        int as = as();
        View view = null;
        for (int i = 0; i < as; i++) {
            View aE = aE(i);
            int d = this.c.d(aE);
            if (this.c.a(aE) > j && d < f) {
                if (d >= j || !z) {
                    return aE;
                }
                if (view == null) {
                    view = aE;
                }
            }
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final android.view.View w() {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.w():android.view.View");
    }

    @Override // defpackage.ly
    public final boolean x(lz lzVar) {
        return lzVar instanceof nk;
    }

    @Override // defpackage.ly
    public final boolean y() {
        return this.q == null;
    }

    final void z(int i, ml mlVar) {
        int g;
        int i2;
        if (i > 0) {
            g = m();
            i2 = 1;
        } else {
            g = g();
            i2 = -1;
        }
        this.l.a = true;
        bF(g, mlVar);
        bD(i2);
        kv kvVar = this.l;
        kvVar.c = g + kvVar.d;
        kvVar.b = Math.abs(i);
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.a = -1;
        this.e = false;
        this.f = false;
        this.g = -1;
        this.h = Integer.MIN_VALUE;
        this.i = new nm();
        this.n = 2;
        this.H = new Rect();
        this.I = new nj(this);
        this.J = false;
        this.K = true;
        this.M = new az(this, 19);
        lx aC = aC(context, attributeSet, i, i2);
        int i3 = aC.a;
        if (i3 == 0 || i3 == 1) {
            V(null);
            if (i3 != this.j) {
                this.j = i3;
                lp lpVar = this.c;
                this.c = this.d;
                this.d = lpVar;
                aW();
            }
            H(aC.b);
            G(aC.c);
            this.l = new kv();
            ab();
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }
}
