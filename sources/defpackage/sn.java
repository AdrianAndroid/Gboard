package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: sn  reason: default package */
/* loaded from: classes2.dex */
public final class sn {
    public static final sh a = new sh();
    public static int b = 0;
    public static int c = 0;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
        if (r8.F(0) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
        if (r8.F(1) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0079, code lost:
        if (r8.G(1, r8.h()) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0069, code lost:
        if (r1 != 3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0049, code lost:
        if (r8.G(0, r8.j()) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0039, code lost:
        if (r0 != 3) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(defpackage.rz r8) {
        /*
            int r0 = r8.M()
            int r1 = r8.N()
            rz r2 = r8.U
            if (r2 != 0) goto Ld
            r2 = 0
        Ld:
            if (r2 == 0) goto L12
            r2.M()
        L12:
            if (r2 == 0) goto L17
            r2.N()
        L17:
            r2 = 2
            r3 = 0
            r4 = 3
            r5 = 0
            r6 = 1
            if (r0 == r6) goto L4b
            boolean r7 = r8.e()
            if (r7 != 0) goto L4b
            if (r0 == r2) goto L4b
            if (r0 != r4) goto L39
            int r0 = r8.s
            if (r0 != 0) goto L3d
            float r0 = r8.X
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L3d
            boolean r0 = r8.F(r5)
            if (r0 != 0) goto L4b
            goto L3d
        L39:
            if (r0 == r4) goto L3d
        L3b:
            r0 = 0
            goto L4c
        L3d:
            int r0 = r8.s
            if (r0 != r6) goto L3b
            int r0 = r8.j()
            boolean r0 = r8.G(r5, r0)
            if (r0 == 0) goto L3b
        L4b:
            r0 = 1
        L4c:
            if (r1 == r6) goto L7b
            boolean r7 = r8.f()
            if (r7 != 0) goto L7b
            if (r1 == r2) goto L7b
            if (r1 != r4) goto L69
            int r1 = r8.t
            if (r1 != 0) goto L6d
            float r1 = r8.X
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L6d
            boolean r1 = r8.F(r6)
            if (r1 != 0) goto L7b
            goto L6d
        L69:
            if (r1 == r4) goto L6d
        L6b:
            r1 = 0
            goto L7c
        L6d:
            int r1 = r8.t
            if (r1 != r6) goto L6b
            int r1 = r8.h()
            boolean r1 = r8.G(r6, r1)
            if (r1 == 0) goto L6b
        L7b:
            r1 = 1
        L7c:
            float r8 = r8.X
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 <= 0) goto L8a
            if (r0 != 0) goto L89
            if (r1 != 0) goto L89
            r0 = 0
            r1 = 0
            goto L8a
        L89:
            return r6
        L8a:
            if (r0 == 0) goto L8f
            if (r1 == 0) goto L8f
            return r6
        L8f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sn.a(rz):boolean");
    }

    public static void b(int i, rz rzVar, sz szVar, boolean z) {
        ry ryVar;
        ry ryVar2;
        ry ryVar3;
        ry ryVar4;
        if (rzVar.n) {
            return;
        }
        b++;
        if (!(rzVar instanceof sa) && rzVar.J() && a(rzVar)) {
            sa.X(rzVar, szVar, new sh());
        }
        ry K = rzVar.K(2);
        ry K2 = rzVar.K(4);
        int a2 = K.a();
        int a3 = K2.a();
        HashSet hashSet = K.a;
        if (hashSet != null && K.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ry ryVar5 = (ry) it.next();
                rz rzVar2 = ryVar5.d;
                int i2 = i + 1;
                boolean a4 = a(rzVar2);
                if (rzVar2.J() && a4) {
                    sa.X(rzVar2, szVar, new sh());
                }
                ry ryVar6 = rzVar2.J;
                boolean z2 = (ryVar5 == ryVar6 && (ryVar4 = rzVar2.L.e) != null && ryVar4.c) || (ryVar5 == rzVar2.L && (ryVar3 = ryVar6.e) != null && ryVar3.c);
                if (rzVar2.M() != 3 || a4) {
                    if (!rzVar2.J()) {
                        ry ryVar7 = rzVar2.J;
                        if (ryVar5 != ryVar7 || rzVar2.L.e != null) {
                            ry ryVar8 = rzVar2.L;
                            if (ryVar5 != ryVar8 || ryVar7.e != null) {
                                if (z2 && !rzVar2.H()) {
                                    e(i2, szVar, rzVar2, z);
                                }
                            } else {
                                int b2 = a2 - ryVar8.b();
                                rzVar2.v(b2 - rzVar2.j(), b2);
                                b(i2, rzVar2, szVar, z);
                            }
                        } else {
                            int b3 = ryVar7.b() + a2;
                            rzVar2.v(b3, rzVar2.j() + b3);
                            b(i2, rzVar2, szVar, z);
                        }
                    }
                } else if (rzVar2.M() == 3 && rzVar2.w >= 0 && rzVar2.v >= 0 && ((rzVar2.ah == 8 || (rzVar2.s == 0 && rzVar2.X == 0.0f)) && !rzVar2.H() && z2 && !rzVar2.H())) {
                    f(i2, rzVar, szVar, rzVar2, z);
                }
            }
        }
        if (rzVar instanceof sc) {
            return;
        }
        HashSet hashSet2 = K2.a;
        if (hashSet2 != null && K2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ry ryVar9 = (ry) it2.next();
                rz rzVar3 = ryVar9.d;
                int i3 = i + 1;
                boolean a5 = a(rzVar3);
                if (rzVar3.J() && a5) {
                    sa.X(rzVar3, szVar, new sh());
                }
                ry ryVar10 = rzVar3.J;
                boolean z3 = (ryVar9 == ryVar10 && (ryVar2 = rzVar3.L.e) != null && ryVar2.c) || (ryVar9 == rzVar3.L && (ryVar = ryVar10.e) != null && ryVar.c);
                if (rzVar3.M() != 3 || a5) {
                    if (!rzVar3.J()) {
                        ry ryVar11 = rzVar3.J;
                        if (ryVar9 != ryVar11 || rzVar3.L.e != null) {
                            ry ryVar12 = rzVar3.L;
                            if (ryVar9 != ryVar12 || ryVar11.e != null) {
                                if (z3 && !rzVar3.H()) {
                                    e(i3, szVar, rzVar3, z);
                                }
                            } else {
                                int b4 = a3 - ryVar12.b();
                                rzVar3.v(b4 - rzVar3.j(), b4);
                                b(i3, rzVar3, szVar, z);
                            }
                        } else {
                            int b5 = ryVar11.b() + a3;
                            rzVar3.v(b5, rzVar3.j() + b5);
                            b(i3, rzVar3, szVar, z);
                        }
                    }
                } else if (rzVar3.M() == 3 && rzVar3.w >= 0 && rzVar3.v >= 0 && (rzVar3.ah == 8 || (rzVar3.s == 0 && rzVar3.X == 0.0f))) {
                    if (!rzVar3.H() && z3 && !rzVar3.H()) {
                        f(i3, rzVar, szVar, rzVar3, z);
                    }
                }
            }
        }
        rzVar.n = true;
    }

    public static void c(int i, rz rzVar, sz szVar) {
        ry ryVar;
        ry ryVar2;
        ry ryVar3;
        ry ryVar4;
        if (rzVar.o) {
            return;
        }
        c++;
        if (!(rzVar instanceof sa) && rzVar.J() && a(rzVar)) {
            sa.X(rzVar, szVar, new sh());
        }
        ry K = rzVar.K(3);
        ry K2 = rzVar.K(5);
        int a2 = K.a();
        int a3 = K2.a();
        HashSet hashSet = K.a;
        if (hashSet != null && K.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ry ryVar5 = (ry) it.next();
                rz rzVar2 = ryVar5.d;
                int i2 = i + 1;
                boolean a4 = a(rzVar2);
                if (rzVar2.J() && a4) {
                    sa.X(rzVar2, szVar, new sh());
                }
                ry ryVar6 = rzVar2.K;
                boolean z = (ryVar5 == ryVar6 && (ryVar4 = rzVar2.M.e) != null && ryVar4.c) || (ryVar5 == rzVar2.M && (ryVar3 = ryVar6.e) != null && ryVar3.c);
                if (rzVar2.N() != 3 || a4) {
                    if (!rzVar2.J()) {
                        ry ryVar7 = rzVar2.K;
                        if (ryVar5 != ryVar7 || rzVar2.M.e != null) {
                            ry ryVar8 = rzVar2.M;
                            if (ryVar5 != ryVar8 || ryVar7.e != null) {
                                if (z && !rzVar2.I()) {
                                    g(i2, szVar, rzVar2);
                                }
                            } else {
                                int b2 = a2 - ryVar8.b();
                                rzVar2.w(b2 - rzVar2.h(), b2);
                                c(i2, rzVar2, szVar);
                            }
                        } else {
                            int b3 = ryVar7.b() + a2;
                            rzVar2.w(b3, rzVar2.h() + b3);
                            c(i2, rzVar2, szVar);
                        }
                    }
                } else if (rzVar2.N() == 3 && rzVar2.z >= 0 && rzVar2.y >= 0 && (rzVar2.ah == 8 || (rzVar2.t == 0 && rzVar2.X == 0.0f))) {
                    if (!rzVar2.I() && z && !rzVar2.I()) {
                        h(i2, rzVar, szVar, rzVar2);
                    }
                }
            }
        }
        if (rzVar instanceof sc) {
            return;
        }
        HashSet hashSet2 = K2.a;
        if (hashSet2 != null && K2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ry ryVar9 = (ry) it2.next();
                rz rzVar3 = ryVar9.d;
                int i3 = i + 1;
                boolean a5 = a(rzVar3);
                if (rzVar3.J() && a5) {
                    sa.X(rzVar3, szVar, new sh());
                }
                ry ryVar10 = rzVar3.K;
                boolean z2 = (ryVar9 == ryVar10 && (ryVar2 = rzVar3.M.e) != null && ryVar2.c) || (ryVar9 == rzVar3.M && (ryVar = ryVar10.e) != null && ryVar.c);
                if (rzVar3.N() != 3 || a5) {
                    if (!rzVar3.J()) {
                        ry ryVar11 = rzVar3.K;
                        if (ryVar9 != ryVar11 || rzVar3.M.e != null) {
                            ry ryVar12 = rzVar3.M;
                            if (ryVar9 != ryVar12 || ryVar11.e != null) {
                                if (z2 && !rzVar3.I()) {
                                    g(i3, szVar, rzVar3);
                                }
                            } else {
                                int b4 = a3 - ryVar12.b();
                                rzVar3.w(b4 - rzVar3.h(), b4);
                                c(i3, rzVar3, szVar);
                            }
                        } else {
                            int b5 = ryVar11.b() + a3;
                            rzVar3.w(b5, rzVar3.h() + b5);
                            c(i3, rzVar3, szVar);
                        }
                    }
                } else if (rzVar3.N() == 3 && rzVar3.z >= 0 && rzVar3.y >= 0 && (rzVar3.ah == 8 || (rzVar3.t == 0 && rzVar3.X == 0.0f))) {
                    if (!rzVar3.I() && z2 && !rzVar3.I()) {
                        h(i3, rzVar, szVar, rzVar3);
                    }
                }
            }
        }
        ry K3 = rzVar.K(6);
        if (K3.a != null && K3.c) {
            int a6 = K3.a();
            Iterator it3 = K3.a.iterator();
            while (it3.hasNext()) {
                ry ryVar13 = (ry) it3.next();
                rz rzVar4 = ryVar13.d;
                int i4 = i + 1;
                boolean a7 = a(rzVar4);
                if (rzVar4.J() && a7) {
                    sa.X(rzVar4, szVar, new sh());
                }
                if (rzVar4.N() != 3 || a7) {
                    if (!rzVar4.J() && ryVar13 == rzVar4.N) {
                        int b6 = ryVar13.b() + a6;
                        if (rzVar4.F) {
                            int i5 = b6 - rzVar4.ab;
                            int i6 = rzVar4.W;
                            rzVar4.aa = i5;
                            rzVar4.K.e(i5);
                            rzVar4.M.e(i5 + i6);
                            rzVar4.N.e(b6);
                            rzVar4.m = true;
                        }
                        c(i4, rzVar4, szVar);
                    }
                }
            }
        }
        rzVar.o = true;
    }

    public static void d(rw rwVar, sz szVar, int i, boolean z) {
        if (rwVar.c()) {
            if (i == 0) {
                b(1, rwVar, szVar, z);
            } else {
                c(1, rwVar, szVar);
            }
        }
    }

    private static void e(int i, sz szVar, rz rzVar, boolean z) {
        float f = rzVar.ae;
        int a2 = rzVar.J.e.a();
        int a3 = rzVar.L.e.a();
        int b2 = rzVar.J.b() + a2;
        int b3 = a3 - rzVar.L.b();
        if (a2 == a3) {
            b3 = a3;
        }
        if (a2 == a3) {
            b2 = a2;
        }
        if (a2 == a3) {
            f = 0.5f;
        }
        int j = rzVar.j();
        int i2 = (b3 - b2) - j;
        if (b2 > b3) {
            i2 = (b2 - b3) - j;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + b2;
        int i4 = i3 + j;
        if (b2 > b3) {
            i4 = i3 - j;
        }
        rzVar.v(i3, i4);
        b(i + 1, rzVar, szVar, z);
    }

    private static void f(int i, rz rzVar, sz szVar, rz rzVar2, boolean z) {
        int j;
        float f = rzVar2.ae;
        int a2 = rzVar2.J.e.a() + rzVar2.J.b();
        int a3 = rzVar2.L.e.a() - rzVar2.L.b();
        if (a3 >= a2) {
            int j2 = rzVar2.j();
            if (rzVar2.ah != 8) {
                int i2 = rzVar2.s;
                if (i2 == 2) {
                    if (!(rzVar instanceof sa)) {
                        j = rzVar.U.j();
                    } else {
                        j = rzVar.j();
                    }
                    j2 = (int) (rzVar2.ae * 0.5f * j);
                } else if (i2 == 0) {
                    j2 = a3 - a2;
                }
                j2 = Math.max(rzVar2.v, j2);
                int i3 = rzVar2.w;
                if (i3 > 0) {
                    j2 = Math.min(i3, j2);
                }
            }
            int i4 = a2 + ((int) ((f * ((a3 - a2) - j2)) + 0.5f));
            rzVar2.v(i4, j2 + i4);
            b(i + 1, rzVar2, szVar, z);
        }
    }

    private static void g(int i, sz szVar, rz rzVar) {
        float f = rzVar.af;
        int a2 = rzVar.K.e.a();
        int a3 = rzVar.M.e.a();
        int b2 = rzVar.K.b() + a2;
        int b3 = a3 - rzVar.M.b();
        if (a2 == a3) {
            b3 = a3;
        }
        if (a2 == a3) {
            b2 = a2;
        }
        if (a2 == a3) {
            f = 0.5f;
        }
        int h = rzVar.h();
        int i2 = (b3 - b2) - h;
        if (b2 > b3) {
            i2 = (b2 - b3) - h;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = b2 + i3;
        int i5 = i4 + h;
        if (b2 > b3) {
            i4 = b2 - i3;
            i5 = i4 - h;
        }
        rzVar.w(i4, i5);
        c(i + 1, rzVar, szVar);
    }

    private static void h(int i, rz rzVar, sz szVar, rz rzVar2) {
        int h;
        float f = rzVar2.af;
        int a2 = rzVar2.K.e.a() + rzVar2.K.b();
        int a3 = rzVar2.M.e.a() - rzVar2.M.b();
        if (a3 >= a2) {
            int h2 = rzVar2.h();
            if (rzVar2.ah != 8) {
                int i2 = rzVar2.t;
                if (i2 == 2) {
                    if (!(rzVar instanceof sa)) {
                        h = rzVar.U.h();
                    } else {
                        h = rzVar.h();
                    }
                    h2 = (int) (f * 0.5f * h);
                } else if (i2 == 0) {
                    h2 = a3 - a2;
                }
                h2 = Math.max(rzVar2.y, h2);
                int i3 = rzVar2.z;
                if (i3 > 0) {
                    h2 = Math.min(i3, h2);
                }
            }
            int i4 = a2 + ((int) ((f * ((a3 - a2) - h2)) + 0.5f));
            rzVar2.w(i4, h2 + i4);
            c(i + 1, rzVar2, szVar);
        }
    }
}
