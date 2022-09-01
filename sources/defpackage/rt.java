package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: rt  reason: default package */
/* loaded from: classes2.dex */
public final class rt extends rq {
    private ru[] h = new ru[128];
    private ru[] i = new ru[128];
    public int f = 0;
    final rs g = new rs(this);

    public rt(gkn gknVar, byte[] bArr, byte[] bArr2) {
        super(gknVar, null, null);
    }

    @Override // defpackage.rq
    public final void d(rr rrVar, rq rqVar, boolean z) {
        ru ruVar = rqVar.a;
        if (ruVar == null) {
            return;
        }
        rp rpVar = rqVar.e;
        int i = rpVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            ru d = rpVar.d(i2);
            float b = rpVar.b(i2);
            rs rsVar = this.g;
            rsVar.a = d;
            if (rsVar.a.b) {
                boolean z2 = true;
                for (int i3 = 0; i3 < 9; i3++) {
                    float[] fArr = rsVar.a.i;
                    float f = fArr[i3] + (ruVar.i[i3] * b);
                    fArr[i3] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        rsVar.a.i[i3] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    rsVar.b.n(rsVar.a);
                }
            } else {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f2 = ruVar.i[i4];
                    if (f2 != 0.0f) {
                        float f3 = f2 * b;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        rsVar.a.i[i4] = f3;
                    } else {
                        rsVar.a.i[i4] = 0.0f;
                    }
                }
                m(d);
            }
            this.b += rqVar.b * b;
        }
        n(ruVar);
    }

    @Override // defpackage.rq
    public final boolean e() {
        return this.f == 0;
    }

    @Override // defpackage.rq
    public final ru k(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f; i2++) {
            ru[] ruVarArr = this.h;
            ru ruVar = ruVarArr[i2];
            if (!zArr[ruVar.c]) {
                rs rsVar = this.g;
                rsVar.a = ruVar;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = rsVar.a.i[i3];
                        if (f > 0.0f) {
                            break;
                        } else if (f < 0.0f) {
                            i = i2;
                            break;
                        } else {
                            i3--;
                        }
                    }
                } else {
                    ru ruVar2 = ruVarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = ruVar2.i[i3];
                            float f3 = rsVar.a.i[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 >= f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.h[i];
    }

    public final void m(ru ruVar) {
        int i;
        int i2 = this.f;
        ru[] ruVarArr = this.h;
        int length = ruVarArr.length;
        if (i2 + 1 > length) {
            ru[] ruVarArr2 = (ru[]) Arrays.copyOf(ruVarArr, length + length);
            this.h = ruVarArr2;
            int length2 = ruVarArr2.length;
            this.i = (ru[]) Arrays.copyOf(ruVarArr2, length2 + length2);
        }
        ru[] ruVarArr3 = this.h;
        int i3 = this.f;
        ruVarArr3[i3] = ruVar;
        int i4 = i3 + 1;
        this.f = i4;
        if (i4 > 1 && ruVarArr3[i4 - 1].c > ruVar.c) {
            int i5 = 0;
            while (true) {
                i = this.f;
                if (i5 >= i) {
                    break;
                }
                this.i[i5] = this.h[i5];
                i5++;
            }
            Arrays.sort(this.i, 0, i, new kp(2));
            for (int i6 = 0; i6 < this.f; i6++) {
                this.h[i6] = this.i[i6];
            }
        }
        ruVar.b = true;
        ruVar.a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0012, code lost:
        r2 = r5.h;
        r3 = r1 + 1;
        r2[r1] = r2[r3];
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
        r5.f = r2;
        r6.b = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000c, code lost:
        r2 = r5.f - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
        if (r1 >= r2) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(defpackage.ru r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r5.f
            if (r1 >= r2) goto L24
            ru[] r2 = r5.h
            r2 = r2[r1]
            if (r2 != r6) goto L21
        Lc:
            int r2 = r5.f
            int r2 = r2 + (-1)
            if (r1 >= r2) goto L1c
            ru[] r2 = r5.h
            int r3 = r1 + 1
            r4 = r2[r3]
            r2[r1] = r4
            r1 = r3
            goto Lc
        L1c:
            r5.f = r2
            r6.b = r0
            return
        L21:
            int r1 = r1 + 1
            goto L2
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rt.n(ru):void");
    }

    @Override // defpackage.rq
    public final String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.f; i++) {
            ru ruVar = this.h[i];
            rs rsVar = this.g;
            rsVar.a = ruVar;
            str = str + String.valueOf(rsVar) + " ";
        }
        return str;
    }
}
