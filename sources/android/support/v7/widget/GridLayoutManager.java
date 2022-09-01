package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    int[] c;
    View[] d;
    public boolean i;
    boolean a = false;
    public int b = -1;
    final SparseIntArray e = new SparseIntArray();
    final SparseIntArray f = new SparseIntArray();
    public ku g = new ks();
    final Rect h = new Rect();

    public GridLayoutManager(int i) {
        v(i);
    }

    private final int bC(ml mlVar) {
        int max;
        if (as() != 0 && mlVar.a() != 0) {
            X();
            boolean z = this.m;
            boolean z2 = !z;
            View an = an(z2);
            View am = am(z2);
            if (an != null && am != null) {
                int c = this.g.c(bo(an), this.b);
                int c2 = this.g.c(bo(am), this.b);
                int min = Math.min(c, c2);
                int max2 = Math.max(c, c2);
                int c3 = this.g.c(mlVar.a() - 1, this.b) + 1;
                if (this.l) {
                    max = Math.max(0, (c3 - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (!z) {
                    return max;
                }
                return Math.round((max * (Math.abs(this.k.a(am) - this.k.d(an)) / ((this.g.c(bo(am), this.b) - this.g.c(bo(an), this.b)) + 1))) + (this.k.j() - this.k.d(an)));
            }
        }
        return 0;
    }

    private final int bD(ml mlVar) {
        if (as() != 0 && mlVar.a() != 0) {
            X();
            View an = an(!this.m);
            View am = am(!this.m);
            if (an != null && am != null) {
                if (!this.m) {
                    return this.g.c(mlVar.a() - 1, this.b) + 1;
                }
                return (int) (((this.k.a(am) - this.k.d(an)) / ((this.g.c(bo(am), this.b) - this.g.c(bo(an), this.b)) + 1)) * (this.g.c(mlVar.a() - 1, this.b) + 1));
            }
        }
        return 0;
    }

    private final int bE(me meVar, ml mlVar, int i) {
        if (!mlVar.g) {
            return this.g.c(i, this.b);
        }
        int a = meVar.a(i);
        if (a == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
            return 0;
        }
        return this.g.c(a, this.b);
    }

    private final int bF(me meVar, ml mlVar, int i) {
        if (!mlVar.g) {
            return this.g.a(i, this.b);
        }
        int i2 = this.f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = meVar.a(i);
        if (a == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 0;
        }
        return this.g.a(a, this.b);
    }

    private final int bG(me meVar, ml mlVar, int i) {
        if (!mlVar.g) {
            return this.g.b(i);
        }
        int i2 = this.e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = meVar.a(i);
        if (a == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 1;
        }
        return this.g.b(a);
    }

    private final void bH(int i) {
        int i2;
        int length;
        int[] iArr = this.c;
        int i3 = this.b;
        if (iArr == null || (length = iArr.length) != i3 + 1 || iArr[length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.c = iArr;
    }

    private final void bI() {
        View[] viewArr = this.d;
        if (viewArr == null || viewArr.length != this.b) {
            this.d = new View[this.b];
        }
    }

    private final void bJ(View view, int i, boolean z) {
        int i2;
        int i3;
        kt ktVar = (kt) view.getLayoutParams();
        Rect rect = ktVar.d;
        int i4 = rect.top + rect.bottom + ktVar.topMargin + ktVar.bottomMargin;
        int i5 = rect.left + rect.right + ktVar.leftMargin + ktVar.rightMargin;
        int g = g(ktVar.a, ktVar.b);
        if (this.j == 1) {
            i3 = at(g, i, i5, ktVar.width, false);
            i2 = at(this.k.k(), this.B, i4, ktVar.height, true);
        } else {
            int at = at(g, i, i4, ktVar.height, false);
            int at2 = at(this.k.k(), this.A, i5, ktVar.width, true);
            i2 = at;
            i3 = at2;
        }
        bK(view, i3, i2, z);
    }

    private final void bK(View view, int i, int i2, boolean z) {
        boolean bi;
        lz lzVar = (lz) view.getLayoutParams();
        if (z) {
            bi = true;
            if (this.w && ly.be(view.getMeasuredWidth(), i, lzVar.width) && ly.be(view.getMeasuredHeight(), i2, lzVar.height)) {
                bi = false;
            }
        } else {
            bi = bi(view, i, i2, lzVar);
        }
        if (bi) {
            view.measure(i, i2);
        }
    }

    @Override // defpackage.ly
    public final void A(int i, int i2) {
        this.g.e();
        this.g.d();
    }

    @Override // defpackage.ly
    public final void B() {
        this.g.e();
        this.g.d();
    }

    @Override // defpackage.ly
    public final void C(int i, int i2) {
        this.g.e();
        this.g.d();
    }

    @Override // defpackage.ly
    public final void D(int i, int i2) {
        this.g.e();
        this.g.d();
    }

    @Override // defpackage.ly
    public final void E(int i, int i2) {
        this.g.e();
        this.g.d();
    }

    @Override // defpackage.ly
    public final int e(me meVar, ml mlVar) {
        if (this.j == 1) {
            return this.b;
        }
        if (mlVar.a() > 0) {
            return bE(meVar, mlVar, mlVar.a() - 1) + 1;
        }
        return 0;
    }

    @Override // defpackage.ly
    public final int f(me meVar, ml mlVar) {
        if (this.j == 0) {
            return this.b;
        }
        if (mlVar.a() > 0) {
            return bE(meVar, mlVar, mlVar.a() - 1) + 1;
        }
        return 0;
    }

    final int g(int i, int i2) {
        if (this.j != 1 || !ah()) {
            int[] iArr = this.c;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.c;
        int i3 = this.b - i;
        return iArr2[i3] - iArr2[i3 - i2];
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.ly
    public final int h(int i, me meVar, ml mlVar) {
        bL();
        bI();
        return super.h(i, meVar, mlVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.ly
    public final int i(int i, me meVar, ml mlVar) {
        bL();
        bI();
        return super.i(i, meVar, mlVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.ly
    public final lz j() {
        return this.j == 0 ? new kt(-2, -1) : new kt(-1, -2);
    }

    @Override // defpackage.ly
    public final lz k(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new kt((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new kt(layoutParams);
    }

    @Override // defpackage.ly
    public final lz l(Context context, AttributeSet attributeSet) {
        return new kt(context, attributeSet);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final View m(me meVar, ml mlVar, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int as = as();
        if (z2) {
            i2 = -1;
            i3 = as() - 1;
            i = -1;
        } else {
            i = 1;
            i2 = as;
            i3 = 0;
        }
        int a = mlVar.a();
        X();
        int j = this.k.j();
        int f = this.k.f();
        View view = null;
        View view2 = null;
        while (i3 != i2) {
            View aE = aE(i3);
            int bo = bo(aE);
            if (bo >= 0 && bo < a && bF(meVar, mlVar, bo) == 0) {
                if (((lz) aE.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = aE;
                    }
                } else if (this.k.d(aE) < f && this.k.a(aE) >= j) {
                    return aE;
                } else {
                    if (view == null) {
                        view = aE;
                    }
                }
            }
            i3 += i;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c6, code lost:
        if (r13 != (r2 > r15)) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00ea, code lost:
        if (r13 != (r2 > r8)) goto L28;
     */
    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.ly
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View n(android.view.View r23, int r24, defpackage.me r25, defpackage.ml r26) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.n(android.view.View, int, me, ml):android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0238, code lost:
        java.util.Arrays.fill(r17.d, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x023e, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a7, code lost:
        r10 = r20.b;
        r2 = r10 + r7;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b3, code lost:
        if (r20.f != (-1)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01b5, code lost:
        r10 = r20.b;
        r3 = r10 - r7;
        r1 = 0;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bd, code lost:
        r10 = r20.b;
        r3 = r10;
        r2 = 0;
        r10 = r10 + r7;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0094, code lost:
        r13 = r12 - 1;
        r14 = -1;
        r15 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
        if (r9 != 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0090, code lost:
        r14 = r12;
        r13 = 0;
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
        if (r13 == r14) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
        r8 = r17.d[r13];
        r7 = (defpackage.kt) r8.getLayoutParams();
        r8 = bG(r18, r19, bo(r8));
        r7.b = r8;
        r7.a = r10;
        r10 = r10 + r8;
        r13 = r13 + r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b8, code lost:
        r1 = 0.0f;
        r2 = 0;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
        if (r2 >= r12) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
        r8 = r17.d[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c3, code lost:
        if (r20.l != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c5, code lost:
        if (r9 != 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c7, code lost:
        aI(r8);
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00db, code lost:
        aK(r8, r17.h);
        bJ(r8, r5, r10);
        r10 = r17.k.b(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e9, code lost:
        if (r10 <= r7) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00eb, code lost:
        r7 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ec, code lost:
        r8 = r17.k.c(r8) / ((defpackage.kt) r8.getLayoutParams()).b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ff, code lost:
        if (r8 <= r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0101, code lost:
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0102, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cc, code lost:
        r10 = false;
        aJ(r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d1, code lost:
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d2, code lost:
        if (r9 != 1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d4, code lost:
        aG(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d8, code lost:
        aH(r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0105, code lost:
        r2 = 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0107, code lost:
        if (r5 == 1073741824) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0109, code lost:
        bH(java.lang.Math.max(java.lang.Math.round(r1 * r17.b), r6));
        r7 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011b, code lost:
        if (r10 >= r12) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011d, code lost:
        r1 = r17.d[r10];
        bJ(r1, r2, true);
        r1 = r17.k.b(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012a, code lost:
        if (r1 <= r7) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012c, code lost:
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012d, code lost:
        r10 = r10 + 1;
        r2 = 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0132, code lost:
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0133, code lost:
        if (r10 >= r12) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0135, code lost:
        r1 = r17.d[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013f, code lost:
        if (r17.k.b(r1) == r7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0141, code lost:
        r2 = (defpackage.kt) r1.getLayoutParams();
        r5 = r2.d;
        r6 = ((r5.top + r5.bottom) + r2.topMargin) + r2.bottomMargin;
        r8 = ((r5.left + r5.right) + r2.leftMargin) + r2.rightMargin;
        r5 = g(r2.a, r2.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0169, code lost:
        if (r17.j != 1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016b, code lost:
        r2 = at(r5, 1073741824, r8, r2.width, false);
        r5 = android.view.View.MeasureSpec.makeMeasureSpec(r7 - r6, 1073741824);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018b, code lost:
        bK(r1, r2, r5, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0192, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017b, code lost:
        r8 = android.view.View.MeasureSpec.makeMeasureSpec(r7 - r8, 1073741824);
        r5 = at(r5, 1073741824, r6, r2.height, false);
        r2 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0195, code lost:
        r21.a = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019a, code lost:
        if (r17.j != 1) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019f, code lost:
        if (r20.f != (-1)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a1, code lost:
        r10 = r20.b;
        r1 = r10 - r7;
        r2 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ad, code lost:
        r3 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c5, code lost:
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c6, code lost:
        if (r7 >= r12) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c8, code lost:
        r5 = r17.d[r7];
        r6 = (defpackage.kt) r5.getLayoutParams();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d4, code lost:
        if (r17.j != 1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01da, code lost:
        if (ah() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01dc, code lost:
        r3 = az() + r17.c[r17.b - r6.a];
        r10 = r3;
        r3 = r3 - r17.k.c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x021b, code lost:
        bs(r5, r3, r1, r10, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0222, code lost:
        if (r6.c() != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0228, code lost:
        if (r6.b() == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x022c, code lost:
        r21.d = r5.hasFocusable() | r21.d;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x022a, code lost:
        r21.c = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01f5, code lost:
        r3 = az() + r17.c[r6.a];
        r10 = r17.k.c(r5) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0209, code lost:
        r1 = aB() + r17.c[r6.a];
        r2 = r17.k.c(r5) + r1;
     */
    @Override // android.support.v7.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(defpackage.me r18, defpackage.ml r19, defpackage.la r20, defpackage.kz r21) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.o(me, ml, la, kz):void");
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void p(me meVar, ml mlVar, ky kyVar, int i) {
        bL();
        if (mlVar.a() > 0 && !mlVar.g) {
            int bF = bF(meVar, mlVar, kyVar.b);
            if (i == 1) {
                while (bF > 0) {
                    int i2 = kyVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    kyVar.b = i3;
                    bF = bF(meVar, mlVar, i3);
                }
            } else {
                int a = mlVar.a() - 1;
                int i4 = kyVar.b;
                while (i4 < a) {
                    int i5 = i4 + 1;
                    int bF2 = bF(meVar, mlVar, i5);
                    if (bF2 <= bF) {
                        break;
                    }
                    i4 = i5;
                    bF = bF2;
                }
                kyVar.b = i4;
            }
        }
        bI();
    }

    @Override // defpackage.ly
    public final void q(me meVar, ml mlVar, abj abjVar) {
        super.q(meVar, mlVar, abjVar);
        abjVar.h(GridView.class.getName());
    }

    @Override // defpackage.ly
    public final void r(me meVar, ml mlVar, View view, abj abjVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof kt)) {
            super.aP(view, abjVar);
            return;
        }
        kt ktVar = (kt) layoutParams;
        int bE = bE(meVar, mlVar, ktVar.a());
        if (this.j != 0) {
            abjVar.j(aqq.D(bE, 1, ktVar.a, ktVar.b, false));
        } else {
            abjVar.j(aqq.D(ktVar.a, ktVar.b, bE, 1, false));
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.ly
    public final void s(me meVar, ml mlVar) {
        if (mlVar.g) {
            int as = as();
            for (int i = 0; i < as; i++) {
                kt ktVar = (kt) aE(i).getLayoutParams();
                int a = ktVar.a();
                this.e.put(a, ktVar.b);
                this.f.put(a, ktVar.a);
            }
        }
        super.s(meVar, mlVar);
        this.e.clear();
        this.f.clear();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.ly
    public final void t(ml mlVar) {
        super.t(mlVar);
        this.a = false;
    }

    @Override // defpackage.ly
    public final void u(Rect rect, int i, int i2) {
        int ar;
        int ar2;
        if (this.c == null) {
            super.u(rect, i, i2);
        }
        int az = az() + aA();
        int aB = aB() + ay();
        if (this.j == 1) {
            ar2 = ar(i2, rect.height() + aB, aw());
            int[] iArr = this.c;
            ar = ar(i, iArr[iArr.length - 1] + az, ax());
        } else {
            ar = ar(i, rect.width() + az, ax());
            int[] iArr2 = this.c;
            ar2 = ar(i2, iArr2[iArr2.length - 1] + aB, aw());
        }
        ba(ar, ar2);
    }

    public final void v(int i) {
        if (i == this.b) {
            return;
        }
        this.a = true;
        if (i <= 0) {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
        this.b = i;
        this.g.e();
        aW();
    }

    @Override // defpackage.ly
    public final boolean x(lz lzVar) {
        return lzVar instanceof kt;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.ly
    public final boolean y() {
        return this.p == null && !this.a;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void z(ml mlVar, la laVar, kq kqVar) {
        int i = this.b;
        for (int i2 = 0; i2 < this.b && laVar.d(mlVar) && i > 0; i2++) {
            int i3 = laVar.d;
            kqVar.a(i3, Math.max(0, laVar.g));
            i -= this.g.b(i3);
            laVar.d += laVar.e;
        }
    }

    private final void bL() {
        int ay;
        int aB;
        if (this.j == 1) {
            ay = this.C - aA();
            aB = az();
        } else {
            ay = this.D - ay();
            aB = aB();
        }
        bH(ay - aB);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.ly
    public final int a(ml mlVar) {
        return this.i ? bC(mlVar) : super.G(mlVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.ly
    public final int b(ml mlVar) {
        return this.i ? bD(mlVar) : super.H(mlVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.ly
    public final int c(ml mlVar) {
        return this.i ? bC(mlVar) : super.G(mlVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.ly
    public final int d(ml mlVar) {
        return this.i ? bD(mlVar) : super.H(mlVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void w(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.w(false);
    }

    public GridLayoutManager(int i, int i2) {
        super(i2);
        v(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        v(aC(context, attributeSet, i, i2).b);
    }
}
