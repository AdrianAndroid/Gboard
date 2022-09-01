package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: g  reason: default package */
/* loaded from: classes.dex */
public final class g {
    public final f d;
    public j a = null;
    public float b = 0.0f;
    boolean c = false;
    boolean e = false;

    public g(gkn gknVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.d = new f(this, gknVar, null, null, null);
    }

    public final void a(j jVar) {
        j jVar2 = this.a;
        if (jVar2 != null) {
            this.d.f(jVar2, -1.0f);
            this.a = null;
        }
        float f = -this.d.c(jVar);
        this.a = jVar;
        if (f == 1.0f) {
            return;
        }
        this.b /= f;
        f fVar = this.d;
        int i = fVar.e;
        for (int i2 = 0; i != -1 && i2 < fVar.a; i2++) {
            float[] fArr = fVar.d;
            fArr[i] = fArr[i] / f;
            i = fVar.c[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        f fVar = this.d;
        int i = fVar.e;
        for (int i2 = 0; i != -1 && i2 < fVar.a; i2++) {
            j jVar = ((j[]) fVar.h.c)[fVar.b[i]];
            int i3 = 0;
            while (true) {
                int i4 = jVar.g;
                if (i3 < i4) {
                    if (jVar.f[i3] == this) {
                        break;
                    }
                    i3++;
                } else {
                    g[] gVarArr = jVar.f;
                    int length = gVarArr.length;
                    if (i4 >= length) {
                        jVar.f = (g[]) Arrays.copyOf(gVarArr, length + length);
                    }
                    g[] gVarArr2 = jVar.f;
                    int i5 = jVar.g;
                    gVarArr2[i5] = this;
                    jVar.g = i5 + 1;
                }
            }
            i = fVar.c[i];
        }
    }

    public final void c(j jVar, j jVar2) {
        this.d.f(jVar, 1.0f);
        this.d.f(jVar2, -1.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(j jVar, j jVar2, int i, float f, j jVar3, j jVar4, int i2) {
        if (jVar2 == jVar3) {
            this.d.f(jVar, 1.0f);
            this.d.f(jVar4, 1.0f);
            this.d.f(jVar2, -2.0f);
        } else if (f == 0.5f) {
            this.d.f(jVar, 1.0f);
            this.d.f(jVar2, -1.0f);
            this.d.f(jVar3, -1.0f);
            this.d.f(jVar4, 1.0f);
            if (i <= 0 && i2 <= 0) {
                return;
            }
            this.b = (-i) + i2;
        } else if (f <= 0.0f) {
            this.d.f(jVar, -1.0f);
            this.d.f(jVar2, 1.0f);
            this.b = i;
        } else if (f >= 1.0f) {
            this.d.f(jVar3, -1.0f);
            this.d.f(jVar4, 1.0f);
            this.b = i2;
        } else {
            float f2 = 1.0f - f;
            this.d.f(jVar, f2);
            this.d.f(jVar2, -f2);
            this.d.f(jVar3, -f);
            this.d.f(jVar4, f);
            if (i <= 0 && i2 <= 0) {
                return;
            }
            this.b = ((-i) * f2) + (i2 * f);
        }
    }

    public final void e(j jVar, j jVar2, j jVar3, j jVar4, float f) {
        this.d.f(jVar, -1.0f);
        this.d.f(jVar2, 1.0f);
        this.d.f(jVar3, f);
        this.d.f(jVar4, -f);
    }

    public final void g(j jVar, int i) {
        if (i < 0) {
            this.b = -i;
            this.d.f(jVar, 1.0f);
            return;
        }
        this.b = i;
        this.d.f(jVar, -1.0f);
    }

    public final void h(j jVar, j jVar2, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.d.f(jVar, 1.0f);
                this.d.f(jVar2, -1.0f);
                return;
            }
        }
        this.d.f(jVar, -1.0f);
        this.d.f(jVar2, 1.0f);
    }

    public final void i(j jVar, j jVar2, j jVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.d.f(jVar, 1.0f);
                this.d.f(jVar2, -1.0f);
                this.d.f(jVar3, -1.0f);
                return;
            }
        }
        this.d.f(jVar, -1.0f);
        this.d.f(jVar2, 1.0f);
        this.d.f(jVar3, 1.0f);
    }

    public final void j(j jVar, j jVar2, j jVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.d.f(jVar, 1.0f);
                this.d.f(jVar2, -1.0f);
                this.d.f(jVar3, 1.0f);
                return;
            }
        }
        this.d.f(jVar, -1.0f);
        this.d.f(jVar2, 1.0f);
        this.d.f(jVar3, -1.0f);
    }

    public final void k(g gVar) {
        this.d.g(this, gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r7 = this;
            j r0 = r7.a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L1b
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            j r2 = r7.a
            r0.append(r2)
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r0 = r1.concat(r0)
        L1b:
            java.lang.String r1 = " = "
            java.lang.String r0 = r0.concat(r1)
            float r1 = r7.b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L3d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r7.b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L3e
        L3d:
            r1 = 0
        L3e:
            f r5 = r7.d
            int r5 = r5.a
        L42:
            if (r2 >= r5) goto L97
            f r6 = r7.d
            j r6 = r6.d(r2)
            if (r6 != 0) goto L4d
            goto L94
        L4d:
            f r6 = r7.d
            float r6 = r6.b(r2)
            if (r1 != 0) goto L60
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 >= 0) goto L72
            java.lang.String r1 = "- "
            java.lang.String r0 = r0.concat(r1)
            goto L71
        L60:
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 <= 0) goto L6b
            java.lang.String r1 = " + "
            java.lang.String r0 = r0.concat(r1)
            goto L72
        L6b:
            java.lang.String r1 = " - "
            java.lang.String r0 = r0.concat(r1)
        L71:
            float r6 = -r6
        L72:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto L7f
            java.lang.String r1 = "null"
            java.lang.String r0 = r0.concat(r1)
            goto L93
        L7f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " null"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L93:
            r1 = 1
        L94:
            int r2 = r2 + 1
            goto L42
        L97:
            if (r1 != 0) goto L9f
            java.lang.String r1 = "0.0"
            java.lang.String r0 = r0.concat(r1)
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g.toString():java.lang.String");
    }

    public final void f(float f, float f2, float f3, j jVar, int i, j jVar2, int i2, j jVar3, int i3, j jVar4, int i4) {
        if (f2 == 0.0f || f == f3) {
            this.b = ((-i) - i2) + i3 + i4;
            this.d.f(jVar, 1.0f);
            this.d.f(jVar2, -1.0f);
            this.d.f(jVar4, 1.0f);
            this.d.f(jVar3, -1.0f);
            return;
        }
        float f4 = (f / f2) / (f3 / f2);
        this.b = ((-i) - i2) + (i3 * f4) + (i4 * f4);
        this.d.f(jVar, 1.0f);
        this.d.f(jVar2, -1.0f);
        this.d.f(jVar4, f4);
        this.d.f(jVar3, -f4);
    }
}
