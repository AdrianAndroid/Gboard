package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: l  reason: default package */
/* loaded from: classes.dex */
public class l {
    protected int D;
    protected int E;
    public int F;
    public int G;
    public Object J;
    int L;
    int M;
    int N;
    int O;
    boolean P;
    boolean Q;
    boolean R;
    boolean S;
    boolean T;
    boolean U;
    boolean X;
    boolean Y;
    final k i;
    final k j;
    final k k;
    final k l;
    final k m;
    final k n;
    final k o;
    protected final ArrayList q;
    public int a = -1;
    public int b = -1;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    final k p = new k(this, 7);
    public l r = null;
    int s = 0;
    int t = 0;
    public float u = 0.0f;
    public int v = -1;
    public int w = 0;
    public int x = 0;
    private int af = 0;
    private int ag = 0;
    public int y = 0;
    public int z = 0;
    protected int A = 0;
    protected int B = 0;
    public int C = 0;
    public float H = 0.5f;
    public float I = 0.5f;
    public int ad = 1;
    public int ae = 1;
    public int K = 0;
    public int V = 0;
    public int W = 0;
    public float Z = 0.0f;
    public float aa = 0.0f;
    l ab = null;
    l ac = null;

    public l() {
        k kVar = new k(this, 2);
        this.i = kVar;
        k kVar2 = new k(this, 3);
        this.j = kVar2;
        k kVar3 = new k(this, 4);
        this.k = kVar3;
        k kVar4 = new k(this, 5);
        this.l = kVar4;
        k kVar5 = new k(this, 6);
        this.m = kVar5;
        k kVar6 = new k(this, 8);
        this.n = kVar6;
        k kVar7 = new k(this, 9);
        this.o = kVar7;
        ArrayList arrayList = new ArrayList();
        this.q = arrayList;
        arrayList.add(kVar);
        arrayList.add(kVar2);
        arrayList.add(kVar3);
        arrayList.add(kVar4);
        arrayList.add(kVar6);
        arrayList.add(kVar7);
        arrayList.add(kVar5);
    }

    private final void A(i iVar, boolean z, boolean z2, k kVar, k kVar2, int i, int i2, int i3, int i4, float f, boolean z3, boolean z4, int i5, int i6, int i7) {
        int i8 = i6;
        j e = iVar.e(kVar);
        j e2 = iVar.e(kVar2);
        j e3 = iVar.e(kVar.b);
        j e4 = iVar.e(kVar2.b);
        int a = kVar.a();
        int a2 = kVar2.a();
        int i9 = this.K;
        boolean z5 = i9 != 8;
        int i10 = i9 == 8 ? 0 : i3;
        boolean z6 = (!z5) | z2;
        if (e3 == null && e4 == null) {
            g a3 = iVar.a();
            a3.g(e, i);
            iVar.g(a3);
            if (z3) {
                return;
            }
            if (z) {
                iVar.g(i.c(iVar, e2, e, i4, true));
            } else if (z6) {
                iVar.g(i.c(iVar, e2, e, i10, false));
            } else {
                g a4 = iVar.a();
                a4.g(e2, i2);
                iVar.g(a4);
            }
        } else if (e3 != null && e4 == null) {
            g a5 = iVar.a();
            a5.h(e, e3, a);
            iVar.g(a5);
            if (z) {
                iVar.g(i.c(iVar, e2, e, i4, true));
            } else if (z3) {
            } else {
                if (z6) {
                    g a6 = iVar.a();
                    a6.h(e2, e, i10);
                    iVar.g(a6);
                    return;
                }
                g a7 = iVar.a();
                a7.g(e2, i2);
                iVar.g(a7);
            }
        } else if (e3 == null) {
            g a8 = iVar.a();
            a8.h(e2, e4, -a2);
            iVar.g(a8);
            if (z) {
                iVar.g(i.c(iVar, e2, e, i4, true));
            } else if (z3) {
            } else {
                if (z6) {
                    g a9 = iVar.a();
                    a9.h(e2, e, i10);
                    iVar.g(a9);
                    return;
                }
                g a10 = iVar.a();
                a10.g(e, i);
                iVar.g(a10);
            }
        } else if (!z6) {
            if (z3) {
                iVar.i(e, e3, a, 3);
                iVar.j(e2, e4, -a2, 3);
                iVar.g(i.b(iVar, e, e3, a, f, e4, e2, a2, true));
            } else if (z4) {
            } else {
                if (i5 == 1) {
                    if (i8 <= i10) {
                        i8 = i10;
                    }
                    if (i7 > 0) {
                        if (i7 < i8) {
                            i8 = i7;
                        } else {
                            iVar.j(e2, e, i7, 3);
                        }
                    }
                    iVar.n(e2, e, i8, 3);
                    iVar.i(e, e3, a, 2);
                    iVar.j(e2, e4, -a2, 2);
                    iVar.m(e, e3, a, f, e4, e2, a2);
                } else if (i8 != 0 || i7 != 0) {
                    if (i7 > 0) {
                        iVar.j(e2, e, i7, 3);
                    }
                    iVar.i(e, e3, a, 2);
                    iVar.j(e2, e4, -a2, 2);
                    iVar.m(e, e3, a, f, e4, e2, a2);
                } else {
                    g a11 = iVar.a();
                    a11.h(e, e3, a);
                    iVar.g(a11);
                    g a12 = iVar.a();
                    a12.h(e2, e4, -a2);
                    iVar.g(a12);
                }
            }
        } else {
            if (z) {
                iVar.g(i.c(iVar, e2, e, i4, true));
            } else {
                g a13 = iVar.a();
                a13.h(e2, e, i10);
                iVar.g(a13);
            }
            int i11 = kVar.h;
            if (i11 != kVar2.h) {
                if (i11 == 2) {
                    g a14 = iVar.a();
                    a14.h(e, e3, a);
                    iVar.g(a14);
                    j f2 = iVar.f();
                    g a15 = iVar.a();
                    a15.j(e2, e4, f2, -a2);
                    iVar.g(a15);
                    return;
                }
                j f3 = iVar.f();
                g a16 = iVar.a();
                a16.i(e, e3, f3, a);
                iVar.g(a16);
                g a17 = iVar.a();
                a17.h(e2, e4, -a2);
                iVar.g(a17);
            } else if (e3 == e4) {
                iVar.g(i.b(iVar, e, e3, 0, 0.5f, e4, e2, 0, true));
            } else if (z4) {
            } else {
                int i12 = kVar.i;
                j f4 = iVar.f();
                g a18 = iVar.a();
                a18.i(e, e3, f4, a);
                if (i12 != 2) {
                    iVar.k(a18, (int) (-a18.d.a(f4)));
                }
                iVar.g(a18);
                int i13 = kVar2.i;
                j f5 = iVar.f();
                g a19 = iVar.a();
                a19.j(e2, e4, f5, -a2);
                if (i13 != 2) {
                    iVar.k(a19, (int) (-a19.d.a(f5)));
                }
                iVar.g(a19);
                iVar.g(i.b(iVar, e, e3, a, f, e4, e2, a2, false));
            }
        }
    }

    public final int a() {
        return this.x + this.t;
    }

    public final int b() {
        return this.af + this.A;
    }

    public final int c() {
        return this.ag + this.B;
    }

    public final int d() {
        if (this.K == 8) {
            return 0;
        }
        return this.t;
    }

    public final int e() {
        int i = this.t;
        if (this.ae == 3) {
            if (this.d == 1) {
                i = Math.max(this.g, i);
            } else {
                i = this.g;
                if (i > 0) {
                    this.t = i;
                } else {
                    i = 0;
                }
            }
            int i2 = this.h;
            if (i2 > 0 && i2 < i) {
                return i2;
            }
        }
        return i;
    }

    public final int f() {
        int i = this.s;
        if (this.ad == 3) {
            if (this.c == 1) {
                i = Math.max(this.e, i);
            } else {
                i = this.e;
                if (i > 0) {
                    this.s = i;
                } else {
                    i = 0;
                }
            }
            int i2 = this.f;
            if (i2 > 0 && i2 < i) {
                return i2;
            }
        }
        return i;
    }

    public final int g() {
        return this.w + this.s;
    }

    public final int h() {
        if (this.K == 8) {
            return 0;
        }
        return this.s;
    }

    public void i() {
        this.i.b();
        this.j.b();
        this.k.b();
        this.l.b();
        this.m.b();
        this.n.b();
        this.o.b();
        this.p.b();
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.af = 0;
        this.ag = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0.5f;
        this.I = 0.5f;
        this.ad = 1;
        this.ae = 1;
        this.J = null;
        this.K = 0;
        this.T = false;
        this.U = false;
        this.V = 0;
        this.W = 0;
        this.X = false;
        this.Y = false;
        this.Z = 0.0f;
        this.aa = 0.0f;
        this.a = -1;
        this.b = -1;
    }

    public final void j(int i) {
        this.t = i;
        int i2 = this.E;
        if (i < i2) {
            this.t = i2;
        }
    }

    public final void k(int i, int i2) {
        this.w = i;
        int i3 = i2 - i;
        this.s = i3;
        int i4 = this.D;
        if (i3 < i4) {
            this.s = i4;
        }
    }

    public final void l(int i) {
        if (i < 0) {
            this.E = 0;
        } else {
            this.E = i;
        }
    }

    public final void m(int i) {
        if (i < 0) {
            this.D = 0;
        } else {
            this.D = i;
        }
    }

    public void n(int i, int i2) {
        this.A = i;
        this.B = i2;
    }

    public final void o(int i, int i2) {
        this.x = i;
        int i3 = i2 - i;
        this.t = i3;
        int i4 = this.E;
        if (i3 < i4) {
            this.t = i4;
        }
    }

    public final void p(int i) {
        this.s = i;
        int i2 = this.D;
        if (i < i2) {
            this.s = i2;
        }
    }

    public void q() {
        int i = this.w;
        int i2 = this.x;
        int i3 = this.s;
        int i4 = this.t;
        this.af = i;
        this.ag = i2;
        this.y = (i3 + i) - i;
        this.z = (i4 + i2) - i2;
    }

    public final boolean r() {
        return this.C > 0;
    }

    public final boolean s() {
        return this.r == null;
    }

    public k t(int i) {
        switch (i - 1) {
            case 1:
                return this.i;
            case 2:
                return this.j;
            case 3:
                return this.k;
            case 4:
                return this.l;
            case 5:
                return this.m;
            case 6:
            default:
                return this.p;
            case 7:
                return this.n;
            case 8:
                return this.o;
        }
    }

    public final String toString() {
        return "(" + this.w + ", " + this.x + ") - (" + this.s + " x " + this.t + ") wrap: (" + this.F + " x " + this.G + ")";
    }

    public final void u(int i, l lVar, int i2, int i3, int i4) {
        t(i).d(lVar.t(i2), i3, i4, 2, 0, true);
    }

    public final void v(int i) {
        this.ad = i;
        if (i == 2) {
            p(this.F);
        }
    }

    public final void w(int i) {
        this.ae = i;
        if (i == 2) {
            j(this.G);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ea, code lost:
        if (r13 != (-1)) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void x(defpackage.i r42) {
        /*
            Method dump skipped, instructions count: 1205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l.x(i):void");
    }

    public void y() {
        int i;
        int i2;
        int p = i.p(this.i);
        int p2 = i.p(this.j);
        int p3 = i.p(this.k) - p;
        int p4 = i.p(this.l) - p2;
        this.w = p;
        this.x = p2;
        if (this.K == 8) {
            this.s = 0;
            this.t = 0;
            return;
        }
        if (this.ad == 1 && p3 < (i2 = this.s)) {
            p3 = i2;
        }
        if (this.ae == 1 && p4 < (i = this.t)) {
            p4 = i;
        }
        this.s = p3;
        this.t = p4;
        int i3 = this.E;
        if (p4 < i3) {
            this.t = i3;
        }
        int i4 = this.D;
        if (p3 >= i4) {
            return;
        }
        this.s = i4;
    }

    public void z(gkn gknVar) {
        this.i.e();
        this.j.e();
        this.k.e();
        this.l.e();
        this.m.e();
        this.p.e();
        this.n.e();
        this.o.e();
    }
}
