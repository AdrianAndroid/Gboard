package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: rq  reason: default package */
/* loaded from: classes2.dex */
public class rq {
    ru a = null;
    public float b = 0.0f;
    final ArrayList c = new ArrayList();
    boolean d = false;
    public rp e;

    public rq() {
    }

    public static final boolean l(ru ruVar) {
        return ruVar.l <= 1;
    }

    public final ru a(boolean[] zArr, ru ruVar) {
        int i;
        int i2 = this.e.a;
        ru ruVar2 = null;
        float f = 0.0f;
        for (int i3 = 0; i3 < i2; i3++) {
            float b = this.e.b(i3);
            if (b < 0.0f) {
                ru d = this.e.d(i3);
                if ((zArr == null || !zArr[d.c]) && d != ruVar && (((i = d.n) == 3 || i == 4) && b < f)) {
                    f = b;
                    ruVar2 = d;
                }
            }
        }
        return ruVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ru ruVar) {
        ru ruVar2 = this.a;
        if (ruVar2 != null) {
            this.e.g(ruVar2, -1.0f);
            this.a.d = -1;
            this.a = null;
        }
        float f = -this.e.c(ruVar, true);
        this.a = ruVar;
        if (f == 1.0f) {
            return;
        }
        this.b /= f;
        rp rpVar = this.e;
        int i = rpVar.e;
        for (int i2 = 0; i != -1 && i2 < rpVar.a; i2++) {
            float[] fArr = rpVar.d;
            fArr[i] = fArr[i] / f;
            i = rpVar.c[i];
        }
    }

    public final void c(rr rrVar, ru ruVar, boolean z) {
        if (ruVar == null || !ruVar.g) {
            return;
        }
        this.b += ruVar.f * this.e.a(ruVar);
        this.e.c(ruVar, z);
        if (z) {
            ruVar.b(this);
        }
        if (this.e.a != 0) {
            return;
        }
        this.d = true;
        rrVar.c = true;
    }

    public void d(rr rrVar, rq rqVar, boolean z) {
        rp rpVar = this.e;
        float a = rpVar.a(rqVar.a);
        rpVar.c(rqVar.a, z);
        rp rpVar2 = rqVar.e;
        int i = rpVar2.a;
        for (int i2 = 0; i2 < i; i2++) {
            ru d = rpVar2.d(i2);
            rpVar.e(d, rpVar2.a(d) * a, z);
        }
        this.b += rqVar.b * a;
        if (z) {
            rqVar.a.b(this);
        }
        if (this.a == null || this.e.a != 0) {
            return;
        }
        this.d = true;
        rrVar.c = true;
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.e.a == 0;
    }

    public final void f(rr rrVar, int i) {
        this.e.g(rrVar.p(i), 1.0f);
        this.e.g(rrVar.p(i), -1.0f);
    }

    public final void g(ru ruVar, ru ruVar2, ru ruVar3, ru ruVar4, float f) {
        this.e.g(ruVar, -1.0f);
        this.e.g(ruVar2, 1.0f);
        this.e.g(ruVar3, f);
        this.e.g(ruVar4, -f);
    }

    public final void h(ru ruVar, ru ruVar2, ru ruVar3, int i) {
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
                this.e.g(ruVar, 1.0f);
                this.e.g(ruVar2, -1.0f);
                this.e.g(ruVar3, -1.0f);
                return;
            }
        }
        this.e.g(ruVar, -1.0f);
        this.e.g(ruVar2, 1.0f);
        this.e.g(ruVar3, 1.0f);
    }

    public final void i(ru ruVar, ru ruVar2, ru ruVar3, int i) {
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
                this.e.g(ruVar, 1.0f);
                this.e.g(ruVar2, -1.0f);
                this.e.g(ruVar3, 1.0f);
                return;
            }
        }
        this.e.g(ruVar, -1.0f);
        this.e.g(ruVar2, 1.0f);
        this.e.g(ruVar3, -1.0f);
    }

    public final void j(ru ruVar, ru ruVar2, ru ruVar3, ru ruVar4, float f) {
        this.e.g(ruVar3, 0.5f);
        this.e.g(ruVar4, 0.5f);
        this.e.g(ruVar, -0.5f);
        this.e.g(ruVar2, -0.5f);
        this.b = -f;
    }

    public ru k(boolean[] zArr) {
        return a(zArr, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r9 = this;
            ru r0 = r9.a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L11
        L7:
            java.lang.String r1 = ""
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r1.concat(r0)
        L11:
            java.lang.String r1 = " = "
            java.lang.String r0 = r0.concat(r1)
            float r1 = r9.b
            r2 = 0
            r3 = 1
            r4 = 0
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 == 0) goto L31
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = r5.toString()
            r1 = 1
            goto L32
        L31:
            r1 = 0
        L32:
            rp r5 = r9.e
            int r5 = r5.a
        L36:
            if (r2 >= r5) goto L95
            rp r6 = r9.e
            ru r6 = r6.d(r2)
            if (r6 != 0) goto L41
            goto L92
        L41:
            rp r7 = r9.e
            float r7 = r7.b(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L4c
            goto L92
        L4c:
            java.lang.String r6 = r6.toString()
            if (r1 != 0) goto L5d
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L6f
            java.lang.String r1 = "- "
            java.lang.String r0 = r0.concat(r1)
            goto L6e
        L5d:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 <= 0) goto L68
            java.lang.String r1 = " + "
            java.lang.String r0 = r0.concat(r1)
            goto L6f
        L68:
            java.lang.String r1 = " - "
            java.lang.String r0 = r0.concat(r1)
        L6e:
            float r7 = -r7
        L6f:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L7a
            java.lang.String r0 = r0.concat(r6)
            goto L91
        L7a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L91:
            r1 = 1
        L92:
            int r2 = r2 + 1
            goto L36
        L95:
            if (r1 != 0) goto L9d
            java.lang.String r1 = "0.0"
            java.lang.String r0 = r0.concat(r1)
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rq.toString():java.lang.String");
    }

    public rq(gkn gknVar, byte[] bArr, byte[] bArr2) {
        this.e = new rp(this, gknVar, null, null);
    }
}
