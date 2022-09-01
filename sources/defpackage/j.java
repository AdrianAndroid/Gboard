package defpackage;

/* compiled from: PG */
/* renamed from: j  reason: default package */
/* loaded from: classes.dex */
public final class j {
    public float d;
    public int h;
    public int a = -1;
    public int b = -1;
    public int c = 0;
    public final float[] e = new float[6];
    g[] f = new g[8];
    int g = 0;

    public j(int i) {
        this.h = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
        r5 = r4.f;
        r2 = r1 + r0;
        r5[r2] = r5[r2 + 1];
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        r4.g = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000c, code lost:
        r5 = r4.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0 >= ((r5 - r1) - 1)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.g r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r4.g
            if (r1 >= r2) goto L29
            g[] r2 = r4.f
            r2 = r2[r1]
            if (r2 != r5) goto L26
        Lc:
            int r5 = r4.g
            int r2 = r5 - r1
            int r2 = r2 + (-1)
            if (r0 >= r2) goto L21
            g[] r5 = r4.f
            int r2 = r1 + r0
            int r3 = r2 + 1
            r3 = r5[r3]
            r5[r2] = r3
            int r0 = r0 + 1
            goto Lc
        L21:
            int r5 = r5 + (-1)
            r4.g = r5
            return
        L26:
            int r1 = r1 + 1
            goto L2
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j.a(g):void");
    }

    public final void b() {
        this.h = 5;
        this.c = 0;
        this.a = -1;
        this.b = -1;
        this.d = 0.0f;
        this.g = 0;
    }

    public final String toString() {
        return "null";
    }
}
