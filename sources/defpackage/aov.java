package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: ru  reason: default package */
/* loaded from: classes2.dex */
public final class ru implements Comparable {
    public static int a = 1;
    public boolean b;
    public float f;
    int n;
    public int c = -1;
    int d = -1;
    public int e = 0;
    public boolean g = false;
    final float[] h = new float[9];
    final float[] i = new float[9];
    rq[] j = new rq[16];
    int k = 0;
    public int l = 0;
    boolean m = false;

    public ru(int i) {
        this.n = i;
    }

    public final void a(rq rqVar) {
        int i = 0;
        while (true) {
            int i2 = this.k;
            if (i >= i2) {
                rq[] rqVarArr = this.j;
                int length = rqVarArr.length;
                if (i2 >= length) {
                    this.j = (rq[]) Arrays.copyOf(rqVarArr, length + length);
                }
                rq[] rqVarArr2 = this.j;
                int i3 = this.k;
                rqVarArr2[i3] = rqVar;
                this.k = i3 + 1;
                return;
            } else if (this.j[i] == rqVar) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
        r4.k--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000d, code lost:
        if (r1 >= (r0 - 1)) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x000f, code lost:
        r5 = r4.j;
        r2 = r1 + 1;
        r5[r1] = r5[r2];
        r1 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.rq r5) {
        /*
            r4 = this;
            int r0 = r4.k
            r1 = 0
        L3:
            if (r1 >= r0) goto L23
            rq[] r2 = r4.j
            r2 = r2[r1]
            if (r2 != r5) goto L20
        Lb:
            int r5 = r0 + (-1)
            if (r1 >= r5) goto L19
            rq[] r5 = r4.j
            int r2 = r1 + 1
            r3 = r5[r2]
            r5[r1] = r3
            r1 = r2
            goto Lb
        L19:
            int r5 = r4.k
            int r5 = r5 + (-1)
            r4.k = r5
            return
        L20:
            int r1 = r1 + 1
            goto L3
        L23:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ru.b(rq):void");
    }

    public final void c() {
        this.n = 5;
        this.e = 0;
        this.c = -1;
        this.d = -1;
        this.f = 0.0f;
        this.g = false;
        this.m = false;
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2] = null;
        }
        this.k = 0;
        this.l = 0;
        this.b = false;
        Arrays.fill(this.i, 0.0f);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.c - ((ru) obj).c;
    }

    public final void d(rr rrVar, float f) {
        this.f = f;
        this.g = true;
        this.m = false;
        int i = this.k;
        this.d = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].c(rrVar, this, false);
        }
        this.k = 0;
    }

    public final void e(rr rrVar, rq rqVar) {
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].d(rrVar, rqVar, false);
        }
        this.k = 0;
    }

    public final String toString() {
        int i = this.c;
        return "" + i;
    }
}
