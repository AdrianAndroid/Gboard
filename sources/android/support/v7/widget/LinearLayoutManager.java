package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LinearLayoutManager extends ly implements os, mj {
    private la a;
    private boolean b;
    private boolean c;
    private boolean d;
    private final kz e;
    private int f;
    private int[] g;
    public int j;
    lp k;
    boolean l;
    public boolean m;
    int n;
    int o;
    lb p;
    final ky q;

    public LinearLayoutManager() {
        this(1);
    }

    private final int bC(int i, me meVar, ml mlVar, boolean z) {
        int j;
        int j2 = i - this.k.j();
        if (j2 > 0) {
            int i2 = -P(j2, meVar, mlVar);
            int i3 = i + i2;
            if (!z || (j = i3 - this.k.j()) <= 0) {
                return i2;
            }
            this.k.n(-j);
            return i2 - j;
        }
        return 0;
    }

    private final View bD() {
        return S(0, as());
    }

    private final View bE() {
        return S(as() - 1, -1);
    }

    private final View bF() {
        return aE(this.l ? 0 : as() - 1);
    }

    private final View bG() {
        return aE(this.l ? as() - 1 : 0);
    }

    private final void bH(me meVar, la laVar) {
        if (!laVar.a || laVar.m) {
            return;
        }
        int i = laVar.g;
        int i2 = laVar.i;
        if (laVar.f == -1) {
            int as = as();
            if (i < 0) {
                return;
            }
            int e = (this.k.e() - i) + i2;
            if (this.l) {
                for (int i3 = 0; i3 < as; i3++) {
                    View aE = aE(i3);
                    if (this.k.d(aE) < e || this.k.m(aE) < e) {
                        bI(meVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = as - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View aE2 = aE(i5);
                if (this.k.d(aE2) < e || this.k.m(aE2) < e) {
                    bI(meVar, i4, i5);
                    return;
                }
            }
        } else if (i >= 0) {
            int i6 = i - i2;
            int as2 = as();
            if (!this.l) {
                for (int i7 = 0; i7 < as2; i7++) {
                    View aE3 = aE(i7);
                    if (this.k.a(aE3) > i6 || this.k.l(aE3) > i6) {
                        bI(meVar, 0, i7);
                        return;
                    }
                }
                return;
            }
            int i8 = as2 - 1;
            for (int i9 = i8; i9 >= 0; i9--) {
                View aE4 = aE(i9);
                if (this.k.a(aE4) > i6 || this.k.l(aE4) > i6) {
                    bI(meVar, i8, i9);
                    return;
                }
            }
        }
    }

    private final void bJ() {
        this.l = (this.j == 1 || !ah()) ? this.c : !this.c;
    }

    private final void bK(int i, int i2, boolean z, ml mlVar) {
        int j;
        this.a.m = ai();
        this.a.f = i;
        int[] iArr = this.g;
        iArr[0] = 0;
        int i3 = 1;
        iArr[1] = 0;
        W(mlVar, iArr);
        int max = Math.max(0, this.g[0]);
        int max2 = Math.max(0, this.g[1]);
        la laVar = this.a;
        int i4 = i == 1 ? max2 : max;
        laVar.h = i4;
        if (i != 1) {
            max = max2;
        }
        laVar.i = max;
        if (i == 1) {
            laVar.h = i4 + this.k.g();
            View bF = bF();
            la laVar2 = this.a;
            if (true == this.l) {
                i3 = -1;
            }
            laVar2.e = i3;
            int bo = bo(bF);
            la laVar3 = this.a;
            laVar2.d = bo + laVar3.e;
            laVar3.b = this.k.a(bF);
            j = this.k.a(bF) - this.k.f();
        } else {
            View bG = bG();
            this.a.h += this.k.j();
            la laVar4 = this.a;
            if (true != this.l) {
                i3 = -1;
            }
            laVar4.e = i3;
            int bo2 = bo(bG);
            la laVar5 = this.a;
            laVar4.d = bo2 + laVar5.e;
            laVar5.b = this.k.d(bG);
            j = (-this.k.d(bG)) + this.k.j();
        }
        la laVar6 = this.a;
        laVar6.c = i2;
        if (z) {
            laVar6.c = i2 - j;
        }
        laVar6.g = j;
    }

    private final void bL(ky kyVar) {
        bM(kyVar.b, kyVar.c);
    }

    private final void bM(int i, int i2) {
        this.a.c = this.k.f() - i2;
        la laVar = this.a;
        laVar.e = true != this.l ? 1 : -1;
        laVar.d = i;
        laVar.f = 1;
        laVar.b = i2;
        laVar.g = Integer.MIN_VALUE;
    }

    private final void bN(ky kyVar) {
        bO(kyVar.b, kyVar.c);
    }

    private final void bO(int i, int i2) {
        this.a.c = i2 - this.k.j();
        la laVar = this.a;
        laVar.d = i;
        int i3 = 1;
        if (true != this.l) {
            i3 = -1;
        }
        laVar.e = i3;
        laVar.f = -1;
        laVar.b = i2;
        laVar.g = Integer.MIN_VALUE;
    }

    private final int g(ml mlVar) {
        if (as() == 0) {
            return 0;
        }
        X();
        return ey.b(mlVar, this.k, an(!this.m), am(!this.m), this, this.m);
    }

    private final int v(int i, me meVar, ml mlVar, boolean z) {
        int f;
        int f2 = this.k.f() - i;
        if (f2 > 0) {
            int i2 = -P(-f2, meVar, mlVar);
            int i3 = i + i2;
            if (!z || (f = this.k.f() - i3) <= 0) {
                return i2;
            }
            this.k.n(f);
            return f + i2;
        }
        return 0;
    }

    @Override // defpackage.ly
    public final int F(ml mlVar) {
        return g(mlVar);
    }

    public final int G(ml mlVar) {
        if (as() == 0) {
            return 0;
        }
        X();
        return ey.c(mlVar, this.k, an(!this.m), am(!this.m), this, this.m, this.l);
    }

    public final int H(ml mlVar) {
        if (as() == 0) {
            return 0;
        }
        X();
        return ey.d(mlVar, this.k, an(!this.m), am(!this.m), this, this.m);
    }

    @Override // defpackage.ly
    public final int I(ml mlVar) {
        return g(mlVar);
    }

    final int K(me meVar, la laVar, ml mlVar, boolean z) {
        int i = laVar.c;
        int i2 = laVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                laVar.g = i2 + i;
            }
            bH(meVar, laVar);
        }
        int i3 = laVar.c + laVar.h;
        kz kzVar = this.e;
        while (true) {
            if ((!laVar.m && i3 <= 0) || !laVar.d(mlVar)) {
                break;
            }
            kzVar.a = 0;
            kzVar.b = false;
            kzVar.c = false;
            kzVar.d = false;
            o(meVar, mlVar, laVar, kzVar);
            if (!kzVar.b) {
                int i4 = laVar.b;
                int i5 = kzVar.a;
                laVar.b = i4 + (laVar.f * i5);
                if (!kzVar.c || laVar.l != null || !mlVar.g) {
                    laVar.c -= i5;
                    i3 -= i5;
                }
                int i6 = laVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    laVar.g = i7;
                    int i8 = laVar.c;
                    if (i8 < 0) {
                        laVar.g = i7 + i8;
                    }
                    bH(meVar, laVar);
                }
                if (z && kzVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - laVar.c;
    }

    public final int L() {
        View T = T(0, as(), true, false);
        if (T == null) {
            return -1;
        }
        return bo(T);
    }

    public final int M() {
        View T = T(0, as(), false, true);
        if (T == null) {
            return -1;
        }
        return bo(T);
    }

    public final int N() {
        View T = T(as() - 1, -1, true, false);
        if (T == null) {
            return -1;
        }
        return bo(T);
    }

    public final int O() {
        View T = T(as() - 1, -1, false, true);
        if (T == null) {
            return -1;
        }
        return bo(T);
    }

    final int P(int i, me meVar, ml mlVar) {
        if (as() == 0 || i == 0) {
            return 0;
        }
        X();
        this.a.a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        bK(i2, abs, true, mlVar);
        la laVar = this.a;
        int K = laVar.g + K(meVar, laVar, mlVar, false);
        if (K < 0) {
            return 0;
        }
        if (abs > K) {
            i = i2 * K;
        }
        this.k.n(-i);
        this.a.k = i;
        return i;
    }

    @Override // defpackage.mj
    public final PointF Q(int i) {
        if (as() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < bo(aE(0))) {
            z = true;
        }
        if (z != this.l) {
            i2 = -1;
        }
        if (this.j == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }

    @Override // defpackage.ly
    public final Parcelable R() {
        lb lbVar = this.p;
        if (lbVar != null) {
            return new lb(lbVar);
        }
        lb lbVar2 = new lb();
        if (as() > 0) {
            X();
            boolean z = this.b ^ this.l;
            lbVar2.c = z;
            if (z) {
                View bF = bF();
                lbVar2.b = this.k.f() - this.k.a(bF);
                lbVar2.a = bo(bF);
            } else {
                View bG = bG();
                lbVar2.a = bo(bG);
                lbVar2.b = this.k.d(bG) - this.k.j();
            }
        } else {
            lbVar2.a();
        }
        return lbVar2;
    }

    final View S(int i, int i2) {
        X();
        if (i2 > i || i2 < i) {
            int d = this.k.d(aE(i));
            int j = this.k.j();
            int i3 = d < j ? 16388 : 4097;
            int i4 = d < j ? 16644 : 4161;
            if (this.j == 0) {
                return this.E.m(i, i2, i4, i3);
            }
            return this.F.m(i, i2, i4, i3);
        }
        return aE(i);
    }

    final View T(int i, int i2, boolean z, boolean z2) {
        X();
        int i3 = 320;
        int i4 = true != z ? 320 : 24579;
        if (true != z2) {
            i3 = 0;
        }
        if (this.j == 0) {
            return this.E.m(i, i2, i4, i3);
        }
        return this.F.m(i, i2, i4, i3);
    }

    @Override // defpackage.ly
    public final View U(int i) {
        int as = as();
        if (as == 0) {
            return null;
        }
        int bo = i - bo(aE(0));
        if (bo >= 0 && bo < as) {
            View aE = aE(bo);
            if (bo(aE) == i) {
                return aE;
            }
        }
        return super.U(i);
    }

    @Override // defpackage.ly
    public final void V(String str) {
        if (this.p == null) {
            super.V(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void W(ml mlVar, int[] iArr) {
        int k = mlVar.a != -1 ? this.k.k() : 0;
        int i = this.a.f;
        int i2 = i == -1 ? 0 : k;
        if (i != -1) {
            k = 0;
        }
        iArr[0] = k;
        iArr[1] = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void X() {
        if (this.a == null) {
            this.a = new la();
        }
    }

    @Override // defpackage.ly
    public final void Y(AccessibilityEvent accessibilityEvent) {
        super.Y(accessibilityEvent);
        if (as() > 0) {
            accessibilityEvent.setFromIndex(M());
            accessibilityEvent.setToIndex(O());
        }
    }

    @Override // defpackage.ly
    public final void Z(Parcelable parcelable) {
        if (parcelable instanceof lb) {
            lb lbVar = (lb) parcelable;
            this.p = lbVar;
            if (this.n != -1) {
                lbVar.a();
            }
            aW();
        }
    }

    @Override // defpackage.ly
    public int a(ml mlVar) {
        return G(mlVar);
    }

    @Override // defpackage.ly
    public final void aa(int i) {
        this.n = i;
        this.o = Integer.MIN_VALUE;
        lb lbVar = this.p;
        if (lbVar != null) {
            lbVar.a();
        }
        aW();
    }

    public final void ab(int i, int i2) {
        this.n = i;
        this.o = i2;
        lb lbVar = this.p;
        if (lbVar != null) {
            lbVar.a();
        }
        aW();
    }

    public final void ad(boolean z) {
        V(null);
        if (z == this.c) {
            return;
        }
        this.c = z;
        aW();
    }

    @Override // defpackage.ly
    public boolean ae() {
        return this.j == 0;
    }

    @Override // defpackage.ly
    public boolean af() {
        return this.j == 1;
    }

    @Override // defpackage.ly
    public final boolean ag() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean ah() {
        return av() == 1;
    }

    final boolean ai() {
        return this.k.h() == 0 && this.k.e() == 0;
    }

    @Override // defpackage.ly
    public final boolean aj() {
        if (this.B != 1073741824 && this.A != 1073741824) {
            int as = as();
            for (int i = 0; i < as; i++) {
                ViewGroup.LayoutParams layoutParams = aE(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ly
    public final void ak(int i, int i2, ml mlVar, kq kqVar) {
        if (1 == this.j) {
            i = i2;
        }
        if (as() == 0 || i == 0) {
            return;
        }
        X();
        bK(i > 0 ? 1 : -1, Math.abs(i), true, mlVar);
        z(mlVar, this.a, kqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final View am(boolean z) {
        return this.l ? T(0, as(), z, true) : T(as() - 1, -1, z, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final View an(boolean z) {
        return this.l ? T(as() - 1, -1, z, true) : T(0, as(), z, true);
    }

    @Override // defpackage.ly
    public final void ao(RecyclerView recyclerView) {
    }

    @Override // defpackage.os
    public final void ap(View view, View view2) {
        V("Cannot drop a view during a scroll or layout calculation");
        X();
        bJ();
        int bo = bo(view);
        int bo2 = bo(view2);
        char c = bo < bo2 ? (char) 1 : (char) 65535;
        if (this.l) {
            if (c == 1) {
                ab(bo2, this.k.f() - (this.k.d(view2) + this.k.b(view)));
            } else {
                ab(bo2, this.k.f() - this.k.a(view2));
            }
        } else if (c == 65535) {
            ab(bo2, this.k.d(view2));
        } else {
            ab(bo2, this.k.a(view2) - this.k.b(view));
        }
    }

    @Override // defpackage.ly
    public final void aq(RecyclerView recyclerView, int i) {
        mk mkVar = new mk(recyclerView.getContext());
        mkVar.b = i;
        bd(mkVar);
    }

    @Override // defpackage.ly
    public int b(ml mlVar) {
        return H(mlVar);
    }

    @Override // defpackage.ly
    public int c(ml mlVar) {
        return G(mlVar);
    }

    @Override // defpackage.ly
    public int d(ml mlVar) {
        return H(mlVar);
    }

    @Override // defpackage.ly
    public int h(int i, me meVar, ml mlVar) {
        if (this.j == 1) {
            return 0;
        }
        return P(i, meVar, mlVar);
    }

    @Override // defpackage.ly
    public int i(int i, me meVar, ml mlVar) {
        if (this.j == 0) {
            return 0;
        }
        return P(i, meVar, mlVar);
    }

    @Override // defpackage.ly
    public lz j() {
        return new lz(-2, -2);
    }

    public View m(me meVar, ml mlVar, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        X();
        int as = as();
        if (z2) {
            i = -1;
            i2 = as() - 1;
            i3 = -1;
        } else {
            i = as;
            i2 = 0;
            i3 = 1;
        }
        int a = mlVar.a();
        int j = this.k.j();
        int f = this.k.f();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View aE = aE(i2);
            int bo = bo(aE);
            int d = this.k.d(aE);
            int a2 = this.k.a(aE);
            if (bo >= 0 && bo < a) {
                if (!((lz) aE.getLayoutParams()).c()) {
                    boolean z3 = a2 <= j && d < j;
                    boolean z4 = d >= f && a2 > f;
                    if (!z3 && !z4) {
                        return aE;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = aE;
                        }
                        view2 = aE;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = aE;
                        }
                        view2 = aE;
                    }
                } else if (view3 == null) {
                    view3 = aE;
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2 == null ? view3 : view2;
    }

    @Override // defpackage.ly
    public View n(View view, int i, me meVar, ml mlVar) {
        int J;
        View bE;
        View bF;
        View bD;
        bJ();
        if (as() == 0 || (J = J(i)) == Integer.MIN_VALUE) {
            return null;
        }
        X();
        bK(J, (int) (this.k.k() * 0.33333334f), false, mlVar);
        la laVar = this.a;
        laVar.g = Integer.MIN_VALUE;
        laVar.a = false;
        K(meVar, laVar, mlVar, true);
        if (J == -1) {
            if (this.l) {
                bD = bE();
            } else {
                bD = bD();
            }
            bE = bD;
            J = -1;
        } else if (this.l) {
            bE = bD();
        } else {
            bE = bE();
        }
        if (J == -1) {
            bF = bG();
        } else {
            bF = bF();
        }
        if (!bF.hasFocusable()) {
            return bE;
        }
        if (bE != null) {
            return bF;
        }
        return null;
    }

    public void o(me meVar, ml mlVar, la laVar, kz kzVar) {
        int i;
        int i2;
        int i3;
        int i4;
        View a = laVar.a(meVar);
        if (a == null) {
            kzVar.b = true;
            return;
        }
        lz lzVar = (lz) a.getLayoutParams();
        if (laVar.l == null) {
            if (this.l == (laVar.f == -1)) {
                aI(a);
            } else {
                aJ(a, 0);
            }
        } else {
            if (this.l == (laVar.f == -1)) {
                aG(a);
            } else {
                aH(a, 0);
            }
        }
        lz lzVar2 = (lz) a.getLayoutParams();
        Rect gz = this.s.gz(a);
        int i5 = gz.left;
        int i6 = gz.right;
        int i7 = gz.top;
        int i8 = gz.bottom;
        int at = ly.at(this.C, this.A, az() + aA() + lzVar2.leftMargin + lzVar2.rightMargin + i5 + i6, lzVar2.width, ae());
        int at2 = ly.at(this.D, this.B, aB() + ay() + lzVar2.topMargin + lzVar2.bottomMargin + i7 + i8, lzVar2.height, af());
        if (bi(a, at, at2, lzVar2)) {
            a.measure(at, at2);
        }
        kzVar.a = this.k.b(a);
        if (this.j == 1) {
            if (ah()) {
                i4 = this.C - aA();
                i = i4 - this.k.c(a);
            } else {
                i = az();
                i4 = this.k.c(a) + i;
            }
            if (laVar.f == -1) {
                i2 = laVar.b;
                i3 = i2 - kzVar.a;
            } else {
                i3 = laVar.b;
                i2 = kzVar.a + i3;
            }
        } else {
            int aB = aB();
            int c = this.k.c(a) + aB;
            if (laVar.f == -1) {
                int i9 = laVar.b;
                int i10 = i9 - kzVar.a;
                i4 = i9;
                i2 = c;
                i = i10;
                i3 = aB;
            } else {
                int i11 = laVar.b;
                int i12 = kzVar.a + i11;
                i = i11;
                i2 = c;
                i3 = aB;
                i4 = i12;
            }
        }
        bs(a, i, i3, i4, i2);
        if (lzVar.c() || lzVar.b()) {
            kzVar.c = true;
        }
        kzVar.d = a.hasFocusable();
    }

    public void p(me meVar, ml mlVar, ky kyVar, int i) {
    }

    @Override // defpackage.ly
    public void s(me meVar, ml mlVar) {
        View m;
        int i;
        int d;
        int i2;
        int i3;
        int i4;
        int v;
        int i5;
        View U;
        int i6 = -1;
        if ((this.p == null && this.n == -1) || mlVar.a() != 0) {
            lb lbVar = this.p;
            if (lbVar != null && lbVar.b()) {
                this.n = lbVar.a;
            }
            X();
            this.a.a = false;
            bJ();
            View aF = aF();
            ky kyVar = this.q;
            if (!kyVar.e || this.n != -1 || this.p != null) {
                kyVar.d();
                ky kyVar2 = this.q;
                kyVar2.d = this.l ^ this.d;
                if (!mlVar.g && (i = this.n) != -1) {
                    if (i < 0 || i >= mlVar.a()) {
                        this.n = -1;
                        this.o = Integer.MIN_VALUE;
                    } else {
                        int i7 = this.n;
                        kyVar2.b = i7;
                        lb lbVar2 = this.p;
                        if (lbVar2 != null && lbVar2.b()) {
                            boolean z = lbVar2.c;
                            kyVar2.d = z;
                            if (z) {
                                kyVar2.c = this.k.f() - this.p.b;
                            } else {
                                kyVar2.c = this.k.j() + this.p.b;
                            }
                        } else if (this.o == Integer.MIN_VALUE) {
                            View U2 = U(i7);
                            if (U2 != null) {
                                if (this.k.b(U2) > this.k.k()) {
                                    kyVar2.a();
                                } else if (this.k.d(U2) - this.k.j() < 0) {
                                    kyVar2.c = this.k.j();
                                    kyVar2.d = false;
                                } else if (this.k.f() - this.k.a(U2) < 0) {
                                    kyVar2.c = this.k.f();
                                    kyVar2.d = true;
                                } else {
                                    if (kyVar2.d) {
                                        d = this.k.a(U2) + this.k.o();
                                    } else {
                                        d = this.k.d(U2);
                                    }
                                    kyVar2.c = d;
                                }
                            } else {
                                if (as() > 0) {
                                    kyVar2.d = (this.n < bo(aE(0))) == this.l;
                                }
                                kyVar2.a();
                            }
                        } else {
                            boolean z2 = this.l;
                            kyVar2.d = z2;
                            if (z2) {
                                kyVar2.c = this.k.f() - this.o;
                            } else {
                                kyVar2.c = this.k.j() + this.o;
                            }
                        }
                        this.q.e = true;
                    }
                }
                if (as() != 0) {
                    View aF2 = aF();
                    if (aF2 != null) {
                        lz lzVar = (lz) aF2.getLayoutParams();
                        if (!lzVar.c() && lzVar.a() >= 0 && lzVar.a() < mlVar.a()) {
                            kyVar2.c(aF2, bo(aF2));
                            this.q.e = true;
                        }
                    }
                    boolean z3 = this.b;
                    boolean z4 = this.d;
                    if (z3 == z4 && (m = m(meVar, mlVar, kyVar2.d, z4)) != null) {
                        kyVar2.b(m, bo(m));
                        if (!mlVar.g && y()) {
                            int d2 = this.k.d(m);
                            int a = this.k.a(m);
                            int j = this.k.j();
                            int f = this.k.f();
                            boolean z5 = a <= j && d2 < j;
                            boolean z6 = d2 >= f && a > f;
                            if (z5 || z6) {
                                if (true == kyVar2.d) {
                                    j = f;
                                }
                                kyVar2.c = j;
                            }
                        }
                        this.q.e = true;
                    }
                }
                kyVar2.a();
                kyVar2.b = this.d ? mlVar.a() - 1 : 0;
                this.q.e = true;
            } else if (aF != null && (this.k.d(aF) >= this.k.f() || this.k.a(aF) <= this.k.j())) {
                this.q.c(aF, bo(aF));
            }
            la laVar = this.a;
            laVar.f = laVar.k >= 0 ? 1 : -1;
            int[] iArr = this.g;
            iArr[0] = 0;
            iArr[1] = 0;
            W(mlVar, iArr);
            int max = Math.max(0, this.g[0]) + this.k.j();
            int max2 = Math.max(0, this.g[1]) + this.k.g();
            if (mlVar.g && (i5 = this.n) != -1 && this.o != Integer.MIN_VALUE && (U = U(i5)) != null) {
                int f2 = this.l ? (this.k.f() - this.k.a(U)) - this.o : this.o - (this.k.d(U) - this.k.j());
                if (f2 > 0) {
                    max += f2;
                } else {
                    max2 -= f2;
                }
            }
            ky kyVar3 = this.q;
            if (!kyVar3.d ? true != this.l : true == this.l) {
                i6 = 1;
            }
            p(meVar, mlVar, kyVar3, i6);
            aL(meVar);
            this.a.m = ai();
            la laVar2 = this.a;
            laVar2.j = mlVar.g;
            laVar2.i = 0;
            ky kyVar4 = this.q;
            if (kyVar4.d) {
                bN(kyVar4);
                la laVar3 = this.a;
                laVar3.h = max;
                K(meVar, laVar3, mlVar, false);
                la laVar4 = this.a;
                i3 = laVar4.b;
                int i8 = laVar4.d;
                int i9 = laVar4.c;
                if (i9 > 0) {
                    max2 += i9;
                }
                bL(this.q);
                la laVar5 = this.a;
                laVar5.h = max2;
                laVar5.d += laVar5.e;
                K(meVar, laVar5, mlVar, false);
                la laVar6 = this.a;
                i2 = laVar6.b;
                int i10 = laVar6.c;
                if (i10 > 0) {
                    bO(i8, i3);
                    la laVar7 = this.a;
                    laVar7.h = i10;
                    K(meVar, laVar7, mlVar, false);
                    i3 = this.a.b;
                }
            } else {
                bL(kyVar4);
                la laVar8 = this.a;
                laVar8.h = max2;
                K(meVar, laVar8, mlVar, false);
                la laVar9 = this.a;
                i2 = laVar9.b;
                int i11 = laVar9.d;
                int i12 = laVar9.c;
                if (i12 > 0) {
                    max += i12;
                }
                bN(this.q);
                la laVar10 = this.a;
                laVar10.h = max;
                laVar10.d += laVar10.e;
                K(meVar, laVar10, mlVar, false);
                la laVar11 = this.a;
                i3 = laVar11.b;
                int i13 = laVar11.c;
                if (i13 > 0) {
                    bM(i11, i2);
                    la laVar12 = this.a;
                    laVar12.h = i13;
                    K(meVar, laVar12, mlVar, false);
                    i2 = this.a.b;
                }
            }
            if (as() > 0) {
                if (this.l ^ this.d) {
                    int v2 = v(i2, meVar, mlVar, true);
                    int i14 = i3 + v2;
                    v = bC(i14, meVar, mlVar, false);
                    i3 = i14 + v;
                    i4 = i2 + v2;
                } else {
                    int bC = bC(i3, meVar, mlVar, true);
                    i4 = i2 + bC;
                    v = v(i4, meVar, mlVar, false);
                    i3 = i3 + bC + v;
                }
                i2 = i4 + v;
            }
            if (mlVar.k && as() != 0 && !mlVar.g && y()) {
                List list = meVar.d;
                int size = list.size();
                int bo = bo(aE(0));
                int i15 = 0;
                int i16 = 0;
                for (int i17 = 0; i17 < size; i17++) {
                    mo moVar = (mo) list.get(i17);
                    if (!moVar.v()) {
                        if ((moVar.c() < bo) != this.l) {
                            i15 += this.k.b(moVar.a);
                        } else {
                            i16 += this.k.b(moVar.a);
                        }
                    }
                }
                this.a.l = list;
                if (i15 > 0) {
                    bO(bo(bG()), i3);
                    la laVar13 = this.a;
                    laVar13.h = i15;
                    laVar13.c = 0;
                    laVar13.b();
                    K(meVar, this.a, mlVar, false);
                }
                if (i16 > 0) {
                    bM(bo(bF()), i2);
                    la laVar14 = this.a;
                    laVar14.h = i16;
                    laVar14.c = 0;
                    laVar14.b();
                    K(meVar, this.a, mlVar, false);
                }
                this.a.l = null;
            }
            if (!mlVar.g) {
                lp lpVar = this.k;
                lpVar.b = lpVar.k();
            } else {
                this.q.d();
            }
            this.b = this.d;
            return;
        }
        aR(meVar);
    }

    @Override // defpackage.ly
    public void t(ml mlVar) {
        this.p = null;
        this.n = -1;
        this.o = Integer.MIN_VALUE;
        this.q.d();
    }

    public void w(boolean z) {
        V(null);
        if (this.d == z) {
            return;
        }
        this.d = z;
        aW();
    }

    @Override // defpackage.ly
    public boolean y() {
        return this.p == null && this.b == this.d;
    }

    public void z(ml mlVar, la laVar, kq kqVar) {
        int i = laVar.d;
        if (i < 0 || i >= mlVar.a()) {
            return;
        }
        kqVar.a(i, Math.max(0, laVar.g));
    }

    public LinearLayoutManager(int i) {
        this.j = 1;
        this.c = false;
        this.l = false;
        this.d = false;
        this.m = true;
        this.n = -1;
        this.o = Integer.MIN_VALUE;
        this.p = null;
        this.q = new ky();
        this.e = new kz();
        this.f = 2;
        this.g = new int[2];
        ac(i);
        ad(false);
    }

    private final void bI(me meVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                aU(i, meVar);
                i--;
            }
            return;
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            aU(i2, meVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int J(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.j == 1) ? 1 : Integer.MIN_VALUE : this.j == 0 ? 1 : Integer.MIN_VALUE : this.j == 1 ? -1 : Integer.MIN_VALUE : this.j == 0 ? -1 : Integer.MIN_VALUE : (this.j != 1 && ah()) ? -1 : 1 : (this.j != 1 && ah()) ? 1 : -1;
    }

    @Override // defpackage.ly
    public final void al(int i, kq kqVar) {
        boolean z;
        int i2;
        lb lbVar = this.p;
        int i3 = -1;
        if (lbVar == null || !lbVar.b()) {
            bJ();
            z = this.l;
            i2 = this.n;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = lbVar.c;
            i2 = lbVar.a;
        }
        if (true != z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f && i2 >= 0 && i2 < i; i4++) {
            kqVar.a(i2, 0);
            i2 += i3;
        }
    }

    public final void ac(int i) {
        if (i == 0 || i == 1) {
            V(null);
            if (i == this.j && this.k != null) {
                return;
            }
            lp q = lp.q(this, i);
            this.k = q;
            this.q.a = q;
            this.j = i;
            aW();
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.j = 1;
        this.c = false;
        this.l = false;
        this.d = false;
        this.m = true;
        this.n = -1;
        this.o = Integer.MIN_VALUE;
        this.p = null;
        this.q = new ky();
        this.e = new kz();
        this.f = 2;
        this.g = new int[2];
        lx aC = aC(context, attributeSet, i, i2);
        ac(aC.a);
        ad(aC.c);
        w(aC.d);
    }
}
