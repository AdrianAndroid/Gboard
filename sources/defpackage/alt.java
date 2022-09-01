package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* renamed from: alt  reason: default package */
/* loaded from: classes.dex */
public final class alt extends dz {
    public int a;
    public int b;
    public int c;
    public boolean d;
    public wj e;
    private final ViewPager2 f;
    private final RecyclerView g;
    private final LinearLayoutManager h;
    private final als i = new als();
    private int j;
    private boolean k;
    private boolean l;

    public alt(ViewPager2 viewPager2) {
        this.f = viewPager2;
        RecyclerView recyclerView = viewPager2.f;
        this.g = recyclerView;
        this.h = (LinearLayoutManager) recyclerView.m;
        i();
    }

    private final void h(int i, float f, int i2) {
        wj wjVar = this.e;
        if (wjVar != null) {
            wjVar.f(i, f, i2);
        }
    }

    private final void i() {
        this.a = 0;
        this.b = 0;
        this.i.a();
        this.j = -1;
        this.c = -1;
        this.k = false;
        this.l = false;
        this.d = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x010f, code lost:
        if (r7[r3 - 1][1] >= r8) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0116, code lost:
        if (r1.as() <= 1) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void j() {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alt.j():void");
    }

    private final boolean k() {
        return this.a == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
        if ((r5 < 0) == r3.f.f()) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // defpackage.dz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.support.v7.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.l = r4
            r3.j()
            boolean r0 = r3.k
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L37
            r3.k = r2
            if (r6 > 0) goto L1f
            if (r6 != 0) goto L29
            if (r5 < 0) goto L16
            r5 = 0
            goto L17
        L16:
            r5 = 1
        L17:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f
            boolean r6 = r6.f()
            if (r5 != r6) goto L29
        L1f:
            als r5 = r3.i
            int r6 = r5.c
            if (r6 == 0) goto L29
            int r5 = r5.a
            int r5 = r5 + r4
            goto L2d
        L29:
            als r5 = r3.i
            int r5 = r5.a
        L2d:
            r3.c = r5
            int r6 = r3.j
            if (r6 == r5) goto L45
            r3.e(r5)
            goto L45
        L37:
            int r5 = r3.a
            if (r5 != 0) goto L45
            als r5 = r3.i
            int r5 = r5.a
            if (r5 != r1) goto L42
            r5 = 0
        L42:
            r3.e(r5)
        L45:
            als r5 = r3.i
            int r6 = r5.a
            if (r6 != r1) goto L4c
            r6 = 0
        L4c:
            float r0 = r5.b
            int r5 = r5.c
            r3.h(r6, r0, r5)
            als r5 = r3.i
            int r6 = r5.a
            int r0 = r3.c
            if (r6 == r0) goto L5d
            if (r0 != r1) goto L6b
        L5d:
            int r5 = r5.c
            if (r5 != 0) goto L6b
            int r5 = r3.b
            if (r5 == r4) goto L6b
            r3.f(r2)
            r3.i()
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alt.c(android.support.v7.widget.RecyclerView, int, int):void");
    }

    public final double d() {
        j();
        als alsVar = this.i;
        double d = alsVar.a;
        double d2 = alsVar.b;
        Double.isNaN(d);
        Double.isNaN(d2);
        return d + d2;
    }

    public final void e(int i) {
        wj wjVar = this.e;
        if (wjVar != null) {
            wjVar.g(i);
        }
    }

    public final void f(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        wj wjVar = this.e;
        if (wjVar == null) {
            return;
        }
        wjVar.e(i);
    }

    public final boolean g() {
        return this.b == 0;
    }

    @Override // defpackage.dz
    public final void b(RecyclerView recyclerView, int i) {
        if ((this.a == 1 && this.b == 1) || i != 1) {
            if (k() && i == 2) {
                if (!this.l) {
                    return;
                }
                f(2);
                this.k = true;
                return;
            }
            if (k() && i == 0) {
                j();
                if (!this.l) {
                    int i2 = this.i.a;
                    if (i2 != -1) {
                        h(i2, 0.0f, 0);
                    }
                } else {
                    als alsVar = this.i;
                    if (alsVar.c == 0) {
                        int i3 = this.j;
                        int i4 = alsVar.a;
                        if (i3 != i4) {
                            e(i4);
                        }
                    }
                }
                f(0);
                i();
            }
            if (this.a != 2 || i != 0 || !this.d) {
                return;
            }
            j();
            als alsVar2 = this.i;
            if (alsVar2.c != 0) {
                return;
            }
            int i5 = this.c;
            int i6 = alsVar2.a;
            if (i5 != i6) {
                if (i6 == -1) {
                    i6 = 0;
                }
                e(i6);
            }
            f(0);
            i();
            return;
        }
        this.a = 1;
        int i7 = this.c;
        if (i7 != -1) {
            this.j = i7;
            this.c = -1;
        } else if (this.j == -1) {
            this.j = this.h.M();
        }
        f(1);
    }
}
