package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: i  reason: default package */
/* loaded from: classes.dex */
public final class i {
    private static int h = 1000;
    public g[] c;
    int a = 0;
    public final h b = new h();
    private int i = 32;
    private int j = 32;
    public boolean[] d = new boolean[32];
    public int e = 1;
    public int f = 0;
    private int k = 32;
    private j[] l = new j[h];
    private int m = 0;
    private g[] n = new g[32];
    public final gkn g = new gkn((byte[]) null);

    public i() {
        this.c = null;
        this.c = new g[32];
        r();
    }

    public static g b(i iVar, j jVar, j jVar2, int i, float f, j jVar3, j jVar4, int i2, boolean z) {
        g a = iVar.a();
        a.d(jVar, jVar2, i, f, jVar3, jVar4, i2);
        if (z) {
            j d = iVar.d();
            j d2 = iVar.d();
            d.c = 4;
            d2.c = 4;
            a.c(d, d2);
        }
        return a;
    }

    public static g c(i iVar, j jVar, j jVar2, int i, boolean z) {
        g a = iVar.a();
        a.h(jVar, jVar2, i);
        if (z) {
            iVar.k(a, 1);
        }
        return a;
    }

    public static final int p(Object obj) {
        j jVar = ((k) obj).f;
        if (jVar != null) {
            return (int) (jVar.d + 0.5f);
        }
        return 0;
    }

    private final void q() {
        int i = this.i;
        int i2 = i + i;
        this.i = i2;
        this.c = (g[]) Arrays.copyOf(this.c, i2);
        gkn gknVar = this.g;
        gknVar.c = (j[]) Arrays.copyOf((Object[]) gknVar.c, this.i);
        int i3 = this.i;
        this.d = new boolean[i3];
        this.j = i3;
        this.k = i3;
        this.b.a.clear();
    }

    private final void r() {
        int i = 0;
        while (true) {
            g[] gVarArr = this.c;
            if (i < gVarArr.length) {
                g gVar = gVarArr[i];
                if (gVar != null) {
                    ((ohq) this.g.b).o(gVar);
                }
                this.c[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    private final j s(int i) {
        j jVar = (j) ((ohq) this.g.a).n();
        if (jVar == null) {
            jVar = new j(i);
        } else {
            jVar.b();
            jVar.h = i;
        }
        int i2 = this.m;
        int i3 = h;
        if (i2 >= i3) {
            int i4 = i3 + i3;
            h = i4;
            this.l = (j[]) Arrays.copyOf(this.l, i4);
        }
        j[] jVarArr = this.l;
        int i5 = this.m;
        this.m = i5 + 1;
        jVarArr[i5] = jVar;
        return jVar;
    }

    public final g a() {
        g gVar = (g) ((ohq) this.g.b).n();
        if (gVar == null) {
            return new g(this.g, null, null, null);
        }
        gVar.a = null;
        f fVar = gVar.d;
        fVar.e = -1;
        fVar.f = -1;
        fVar.g = false;
        fVar.a = 0;
        gVar.b = 0.0f;
        gVar.e = false;
        return gVar;
    }

    public final j d() {
        if (this.e + 1 >= this.j) {
            q();
        }
        j s = s(4);
        int i = this.a + 1;
        this.a = i;
        this.e++;
        s.a = i;
        ((j[]) this.g.c)[i] = s;
        return s;
    }

    public final j e(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.e + 1 >= this.j) {
            q();
        }
        k kVar = (k) obj;
        j jVar = kVar.f;
        if (jVar == null) {
            kVar.e();
            jVar = kVar.f;
        }
        int i = jVar.a;
        if (i != -1) {
            if (i > this.a || ((j[]) this.g.c)[i] == null) {
                if (i != -1) {
                    jVar.b();
                }
            }
            return jVar;
        }
        int i2 = this.a + 1;
        this.a = i2;
        this.e++;
        jVar.a = i2;
        jVar.h = 1;
        ((j[]) this.g.c)[i2] = jVar;
        return jVar;
    }

    public final j f() {
        if (this.e + 1 >= this.j) {
            q();
        }
        j s = s(3);
        int i = this.a + 1;
        this.a = i;
        this.e++;
        s.a = i;
        ((j[]) this.g.c)[i] = s;
        return s;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0106 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(defpackage.g r13) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i.g(g):void");
    }

    public final void h(j jVar, int i) {
        int i2 = jVar.b;
        if (i2 != -1) {
            g gVar = this.c[i2];
            if (gVar.e) {
                gVar.b = i;
                return;
            }
            g a = a();
            a.g(jVar, i);
            g(a);
            return;
        }
        g a2 = a();
        a2.a = jVar;
        float f = i;
        jVar.d = f;
        a2.b = f;
        a2.e = true;
        g(a2);
    }

    public final void i(j jVar, j jVar2, int i, int i2) {
        g a = a();
        j f = f();
        f.c = i2;
        a.i(jVar, jVar2, f, i);
        g(a);
    }

    public final void j(j jVar, j jVar2, int i, int i2) {
        g a = a();
        j f = f();
        f.c = i2;
        a.j(jVar, jVar2, f, i);
        g(a);
    }

    public final void k(g gVar, int i) {
        gVar.d.f(d(), i);
    }

    public final void l() {
        gkn gknVar;
        int i = 0;
        while (true) {
            gknVar = this.g;
            j[] jVarArr = (j[]) gknVar.c;
            if (i >= jVarArr.length) {
                break;
            }
            j jVar = jVarArr[i];
            if (jVar != null) {
                jVar.b();
            }
            i++;
        }
        Object obj = gknVar.a;
        j[] jVarArr2 = this.l;
        int i2 = this.m;
        int length = jVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            j jVar2 = jVarArr2[i3];
            ohq ohqVar = (ohq) obj;
            int i4 = ohqVar.a;
            if (i4 < 256) {
                ((Object[]) ohqVar.b)[i4] = jVar2;
                ohqVar.a = i4 + 1;
            }
        }
        this.m = 0;
        Arrays.fill((Object[]) this.g.c, (Object) null);
        this.a = 0;
        this.b.a.clear();
        this.e = 1;
        for (int i5 = 0; i5 < this.f; i5++) {
            this.c[i5].c = false;
        }
        r();
        this.f = 0;
    }

    public final void m(j jVar, j jVar2, int i, float f, j jVar3, j jVar4, int i2) {
        g a = a();
        a.d(jVar, jVar2, i, f, jVar3, jVar4, i2);
        j d = d();
        j d2 = d();
        d.c = 4;
        d2.c = 4;
        a.c(d, d2);
        g(a);
    }

    public final void n(j jVar, j jVar2, int i, int i2) {
        g a = a();
        a.h(jVar, jVar2, i);
        j d = d();
        j d2 = d();
        d.c = i2;
        d2.c = i2;
        a.c(d, d2);
        g(a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        r6 = 0;
        r7 = -1;
        r8 = -1;
        r9 = 0;
        r10 = Float.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r6 >= r17.f) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        r11 = r17.c[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
        if (r11.a.h != 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (r11.b >= 0.0f) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
        r12 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
        if (r12 >= r17.e) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
        r13 = ((defpackage.j[]) r17.g.c)[r12];
        r14 = r11.d.a(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
        if (r14 > 0.0f) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
        if (r15 >= 6) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
        r1 = r13.e[r15] / r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
        if (r1 >= r10) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
        if (r15 == r9) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
        r10 = r1;
        r7 = r6;
        r8 = r12;
        r9 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
        if (r15 <= r9) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0073, code lost:
        if (r7 == (-1)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0075, code lost:
        r1 = r17.c[r7];
        r1.a.b = -1;
        r1.a(((defpackage.j[]) r17.g.c)[r8]);
        r1.a.b = r7;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008f, code lost:
        if (r6 >= r17.f) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0091, code lost:
        r17.c[r6].k(r1);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009b, code lost:
        r18.a(r17);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(defpackage.h r18) {
        /*
            Method dump skipped, instructions count: 192
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i.o(h):void");
    }
}
