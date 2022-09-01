package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: rr  reason: default package */
/* loaded from: classes2.dex */
public final class rr {
    public static boolean a = false;
    public static long b = 0;
    private static int k = 1000;
    rq[] e;
    public final gkn j;
    private final rq r;
    private rq s;
    public boolean c = false;
    int d = 0;
    private int l = 32;
    private int m = 32;
    public boolean f = false;
    public boolean g = false;
    private boolean[] n = new boolean[32];
    int h = 1;
    int i = 0;
    private int o = 32;
    private ru[] p = new ru[k];
    private int q = 0;

    public rr() {
        this.e = null;
        this.e = new rq[32];
        t();
        gkn gknVar = new gkn();
        this.j = gknVar;
        this.r = new rt(gknVar, null, null);
        this.s = new rq(gknVar, null, null);
    }

    public static final int o(Object obj) {
        ru ruVar = ((ry) obj).h;
        if (ruVar != null) {
            return (int) (ruVar.f + 0.5f);
        }
        return 0;
    }

    private final void r() {
        for (int i = 0; i < this.i; i++) {
            rq rqVar = this.e[i];
            rqVar.a.f = rqVar.b;
        }
    }

    private final void s() {
        int i = this.l;
        int i2 = i + i;
        this.l = i2;
        this.e = (rq[]) Arrays.copyOf(this.e, i2);
        gkn gknVar = this.j;
        gknVar.c = (ru[]) Arrays.copyOf((Object[]) gknVar.c, this.l);
        int i3 = this.l;
        this.n = new boolean[i3];
        this.m = i3;
        this.o = i3;
    }

    private final void t() {
        for (int i = 0; i < this.i; i++) {
            rq rqVar = this.e[i];
            if (rqVar != null) {
                ((otj) this.j.b).h(rqVar);
            }
            this.e[i] = null;
        }
    }

    private final void u(rq rqVar) {
        rp rpVar;
        int i;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.n[i2] = false;
        }
        boolean z = false;
        int i3 = 0;
        while (!z) {
            i3++;
            int i4 = this.h;
            if (i3 >= i4 + i4) {
                return;
            }
            ru ruVar = rqVar.a;
            if (ruVar != null) {
                this.n[ruVar.c] = true;
            }
            ru k2 = rqVar.k(this.n);
            if (k2 != null) {
                boolean[] zArr = this.n;
                int i5 = k2.c;
                if (zArr[i5]) {
                    return;
                }
                zArr[i5] = true;
            }
            if (k2 != null) {
                float f = Float.MAX_VALUE;
                int i6 = -1;
                for (int i7 = 0; i7 < this.i; i7++) {
                    rq rqVar2 = this.e[i7];
                    if (rqVar2.a.n != 1 && !rqVar2.d && (i = (rpVar = rqVar2.e).e) != -1) {
                        int i8 = 0;
                        while (true) {
                            if (i != -1 && i8 < rpVar.a) {
                                if (rpVar.b[i] != k2.c) {
                                    i = rpVar.c[i];
                                    i8++;
                                } else {
                                    float a2 = rqVar2.e.a(k2);
                                    if (a2 < 0.0f) {
                                        float f2 = (-rqVar2.b) / a2;
                                        if (f2 < f) {
                                            i6 = i7;
                                            f = f2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (i6 >= 0) {
                    rq rqVar3 = this.e[i6];
                    rqVar3.a.d = -1;
                    rqVar3.b(k2);
                    ru ruVar2 = rqVar3.a;
                    ruVar2.d = i6;
                    ruVar2.e(this, rqVar3);
                }
            } else {
                z = true;
            }
        }
    }

    private final ru v(int i) {
        ru ruVar = (ru) ((otj) this.j.a).g();
        if (ruVar == null) {
            ruVar = new ru(i);
            ruVar.n = i;
        } else {
            ruVar.c();
            ruVar.n = i;
        }
        int i2 = this.q;
        int i3 = k;
        if (i2 >= i3) {
            int i4 = i3 + i3;
            k = i4;
            this.p = (ru[]) Arrays.copyOf(this.p, i4);
        }
        ru[] ruVarArr = this.p;
        int i5 = this.q;
        this.q = i5 + 1;
        ruVarArr[i5] = ruVar;
        return ruVar;
    }

    public final rq a() {
        rq rqVar = (rq) ((otj) this.j.b).g();
        if (rqVar == null) {
            rqVar = new rq(this.j, null, null);
            b++;
        } else {
            rqVar.a = null;
            rqVar.e.f();
            rqVar.b = 0.0f;
            rqVar.d = false;
        }
        ru.a++;
        return rqVar;
    }

    public final ru b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.h + 1 >= this.m) {
            s();
        }
        ry ryVar = (ry) obj;
        ru ruVar = ryVar.h;
        if (ruVar == null) {
            ryVar.i();
            ruVar = ryVar.h;
        }
        int i = ruVar.c;
        if (i != -1) {
            if (i > this.d || ((ru[]) this.j.c)[i] == null) {
                if (i != -1) {
                    ruVar.c();
                }
            }
            return ruVar;
        }
        int i2 = this.d + 1;
        this.d = i2;
        this.h++;
        ruVar.c = i2;
        ruVar.n = 1;
        ((ru[]) this.j.c)[i2] = ruVar;
        return ruVar;
    }

    public final ru c() {
        if (this.h + 1 >= this.m) {
            s();
        }
        ru v = v(3);
        int i = this.d + 1;
        this.d = i;
        this.h++;
        v.c = i;
        ((ru[]) this.j.c)[i] = v;
        return v;
    }

    public final void d(ru ruVar, ru ruVar2, int i, float f, ru ruVar3, ru ruVar4, int i2, int i3) {
        rq a2 = a();
        if (ruVar2 == ruVar3) {
            a2.e.g(ruVar, 1.0f);
            a2.e.g(ruVar4, 1.0f);
            a2.e.g(ruVar2, -2.0f);
        } else if (f == 0.5f) {
            a2.e.g(ruVar, 1.0f);
            a2.e.g(ruVar2, -1.0f);
            a2.e.g(ruVar3, -1.0f);
            a2.e.g(ruVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                a2.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            a2.e.g(ruVar, -1.0f);
            a2.e.g(ruVar2, 1.0f);
            a2.b = i;
        } else if (f >= 1.0f) {
            a2.e.g(ruVar4, -1.0f);
            a2.e.g(ruVar3, 1.0f);
            a2.b = -i2;
        } else {
            float f2 = 1.0f - f;
            a2.e.g(ruVar, f2);
            a2.e.g(ruVar2, -f2);
            a2.e.g(ruVar3, -f);
            a2.e.g(ruVar4, f);
            if (i > 0 || i2 > 0) {
                a2.b = ((-i) * f2) + (i2 * f);
            }
        }
        if (i3 != 8) {
            a2.f(this, i3);
        }
        e(a2);
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(defpackage.rq r17) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr.e(rq):void");
    }

    public final void f(ru ruVar, int i) {
        int i2 = ruVar.d;
        if (i2 == -1) {
            ruVar.d(this, i);
            for (int i3 = 0; i3 < this.d + 1; i3++) {
                ru ruVar2 = ((ru[]) this.j.c)[i3];
            }
        } else if (i2 != -1) {
            rq rqVar = this.e[i2];
            if (rqVar.d) {
                rqVar.b = i;
            } else if (rqVar.e.a == 0) {
                rqVar.d = true;
                rqVar.b = i;
            } else {
                rq a2 = a();
                if (i < 0) {
                    a2.b = -i;
                    a2.e.g(ruVar, 1.0f);
                } else {
                    a2.b = i;
                    a2.e.g(ruVar, -1.0f);
                }
                e(a2);
            }
        } else {
            rq a3 = a();
            a3.a = ruVar;
            float f = i;
            ruVar.f = f;
            a3.b = f;
            a3.d = true;
            e(a3);
        }
    }

    public final void g(ru ruVar, ru ruVar2, int i, int i2) {
        rq a2 = a();
        ru c = c();
        c.e = 0;
        a2.h(ruVar, ruVar2, c, i);
        if (i2 != 8) {
            i(a2, (int) (-a2.e.a(c)), i2);
        }
        e(a2);
    }

    public final void h(ru ruVar, ru ruVar2, int i, int i2) {
        rq a2 = a();
        ru c = c();
        c.e = 0;
        a2.i(ruVar, ruVar2, c, i);
        if (i2 != 8) {
            i(a2, (int) (-a2.e.a(c)), i2);
        }
        e(a2);
    }

    final void i(rq rqVar, int i, int i2) {
        rqVar.e.g(p(i2), i);
    }

    public final void j() {
        rq rqVar = this.r;
        if (rqVar.e()) {
            r();
        } else if (this.g) {
            for (int i = 0; i < this.i; i++) {
                if (!this.e[i].d) {
                    l(this.r);
                    return;
                }
            }
            r();
        } else {
            l(rqVar);
        }
    }

    public final void k() {
        gkn gknVar;
        int i = 0;
        while (true) {
            gknVar = this.j;
            ru[] ruVarArr = (ru[]) gknVar.c;
            if (i >= ruVarArr.length) {
                break;
            }
            ru ruVar = ruVarArr[i];
            if (ruVar != null) {
                ruVar.c();
            }
            i++;
        }
        Object obj = gknVar.a;
        ru[] ruVarArr2 = this.p;
        int i2 = this.q;
        int length = ruVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            ru ruVar2 = ruVarArr2[i3];
            otj otjVar = (otj) obj;
            int i4 = otjVar.a;
            if (i4 < 256) {
                ((Object[]) otjVar.b)[i4] = ruVar2;
                otjVar.a = i4 + 1;
            }
        }
        this.q = 0;
        Arrays.fill((Object[]) this.j.c, (Object) null);
        this.d = 0;
        rt rtVar = (rt) this.r;
        rtVar.f = 0;
        rtVar.b = 0.0f;
        this.h = 1;
        for (int i5 = 0; i5 < this.i; i5++) {
            rq rqVar = this.e[i5];
        }
        t();
        this.i = 0;
        this.s = new rq(this.j, null, null);
    }

    final void l(rq rqVar) {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.i) {
                break;
            }
            rq rqVar2 = this.e[i];
            if (rqVar2.a.n != 1) {
                float f = 0.0f;
                if (rqVar2.b < 0.0f) {
                    boolean z2 = false;
                    int i2 = 0;
                    while (!z2) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = 0;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        while (i3 < this.i) {
                            rq rqVar3 = this.e[i3];
                            if (rqVar3.a.n != 1 && !rqVar3.d && rqVar3.b < f) {
                                int i7 = rqVar3.e.a;
                                int i8 = 0;
                                while (i8 < i7) {
                                    ru d = rqVar3.e.d(i8);
                                    float a2 = rqVar3.e.a(d);
                                    if (a2 > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = d.h[i9] / a2;
                                            if ((f3 < f2 && i9 == i6) || i9 > i6) {
                                                i5 = d.c;
                                                i6 = i9;
                                                f2 = f3;
                                                i4 = i3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i3++;
                            f = 0.0f;
                        }
                        if (i4 != -1) {
                            rq rqVar4 = this.e[i4];
                            rqVar4.a.d = -1;
                            rqVar4.b(((ru[]) this.j.c)[i5]);
                            ru ruVar = rqVar4.a;
                            ruVar.d = i4;
                            ruVar.e(this, rqVar4);
                            z = false;
                        } else {
                            z = true;
                        }
                        z2 = (!(i2 <= this.h / 2)) | z;
                        f = 0.0f;
                    }
                }
            }
            i++;
        }
        u(rqVar);
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(defpackage.ru r6, defpackage.ru r7, int r8, int r9) {
        /*
            r5 = this;
            r0 = 8
            if (r9 != r0) goto L18
            boolean r9 = r7.g
            if (r9 == 0) goto L16
            int r9 = r6.d
            r1 = -1
            if (r9 == r1) goto Le
            goto L16
        Le:
            float r7 = r7.f
            float r8 = (float) r8
            float r7 = r7 + r8
            r6.d(r5, r7)
            return
        L16:
            r9 = 8
        L18:
            rq r1 = r5.a()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r8 == 0) goto L39
            if (r8 >= 0) goto L27
            int r8 = -r8
            r4 = 1
            goto L28
        L27:
            r4 = 0
        L28:
            float r8 = (float) r8
            r1.b = r8
            if (r4 != 0) goto L2e
            goto L39
        L2e:
            rp r8 = r1.e
            r8.g(r6, r2)
            rp r6 = r1.e
            r6.g(r7, r3)
            goto L43
        L39:
            rp r8 = r1.e
            r8.g(r6, r3)
            rp r6 = r1.e
            r6.g(r7, r2)
        L43:
            if (r9 == r0) goto L48
            r1.f(r5, r9)
        L48:
            r5.e(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr.m(ru, ru, int, int):void");
    }

    public final void n(ru ruVar, ru ruVar2, ru ruVar3, ru ruVar4, float f) {
        rq a2 = a();
        a2.g(ruVar, ruVar2, ruVar3, ruVar4, f);
        e(a2);
    }

    public final ru p(int i) {
        if (this.h + 1 >= this.m) {
            s();
        }
        ru v = v(4);
        int i2 = this.d + 1;
        this.d = i2;
        this.h++;
        v.c = i2;
        v.e = i;
        ((ru[]) this.j.c)[i2] = v;
        rt rtVar = (rt) this.r;
        rs rsVar = rtVar.g;
        rsVar.a = v;
        Arrays.fill(rsVar.a.i, 0.0f);
        v.i[v.e] = 1.0f;
        rtVar.m(v);
        return v;
    }

    private final void q(rq rqVar) {
        int i;
        if (rqVar.d) {
            rqVar.a.d(this, rqVar.b);
        } else {
            rq[] rqVarArr = this.e;
            int i2 = this.i;
            rqVarArr[i2] = rqVar;
            ru ruVar = rqVar.a;
            ruVar.d = i2;
            this.i = i2 + 1;
            ruVar.e(this, rqVar);
        }
        if (this.c) {
            int i3 = 0;
            while (i3 < this.i) {
                if (this.e[i3] == null) {
                    System.out.println("WTF");
                }
                rq rqVar2 = this.e[i3];
                if (rqVar2 != null && rqVar2.d) {
                    rqVar2.a.d(this, rqVar2.b);
                    ((otj) this.j.b).h(rqVar2);
                    this.e[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.i;
                        if (i4 >= i) {
                            break;
                        }
                        rq[] rqVarArr2 = this.e;
                        int i6 = i4 - 1;
                        rq rqVar3 = rqVarArr2[i4];
                        rqVarArr2[i6] = rqVar3;
                        ru ruVar2 = rqVar3.a;
                        if (ruVar2.d == i4) {
                            ruVar2.d = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.e[i5] = null;
                    }
                    this.i = i - 1;
                    i3--;
                }
                i3++;
            }
            this.c = false;
        }
    }
}
