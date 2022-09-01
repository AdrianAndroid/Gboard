package defpackage;

import java.util.HashSet;

/* compiled from: PG */
/* renamed from: k  reason: default package */
/* loaded from: classes.dex */
public final class k {
    final l a;
    k b;
    public j f;
    final int g;
    public int c = 0;
    int d = -1;
    public int h = 1;
    public int i = 1;
    public int e = 0;

    public k(l lVar, int i) {
        this.a = lVar;
        this.g = i;
    }

    private final String f(HashSet hashSet) {
        if (hashSet.add(this)) {
            StringBuilder sb = new StringBuilder("null:");
            sb.append(cd.y(this.g));
            k kVar = this.b;
            sb.append(kVar != null ? " connected to ".concat(kVar.f(hashSet)) : "");
            return sb.toString();
        }
        return "<-";
    }

    public final int a() {
        k kVar;
        if (this.a.K == 8) {
            return 0;
        }
        int i = this.d;
        return (i < 0 || (kVar = this.b) == null || kVar.a.K != 8) ? this.c : i;
    }

    public final void b() {
        this.b = null;
        this.c = 0;
        this.d = -1;
        this.h = 2;
        this.e = 0;
        this.i = 1;
    }

    public final boolean c() {
        return this.b != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x005e, code lost:
        if (r15 != 9) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0077, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0074, code lost:
        if (r15 != 8) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.k r10, int r11, int r12, int r13, int r14, boolean r15) {
        /*
            r9 = this;
            r0 = -1
            r1 = 2
            r2 = 0
            r3 = 1
            if (r10 != 0) goto L12
            r10 = 0
            r9.b = r10
            r9.c = r2
            r9.d = r0
            r9.h = r3
            r9.e = r1
            return
        L12:
            if (r15 != 0) goto L7d
            int r15 = r10.g
            int r4 = r9.g
            r5 = 6
            if (r15 != r4) goto L33
            r15 = 7
            if (r4 != r15) goto L20
            goto L7c
        L20:
            if (r4 != r5) goto L7d
            l r15 = r10.a
            boolean r15 = r15.r()
            if (r15 == 0) goto L7c
            l r15 = r9.a
            boolean r15 = r15.r()
            if (r15 == 0) goto L7c
            goto L7d
        L33:
            int r4 = r4 + r0
            r0 = 8
            r6 = 4
            if (r4 == r3) goto L63
            r7 = 9
            r8 = 3
            if (r4 == r1) goto L4c
            if (r4 == r8) goto L63
            if (r4 == r6) goto L4c
            if (r4 == r5) goto L45
            goto L7c
        L45:
            if (r15 == r5) goto L7c
            if (r15 == r0) goto L7c
            if (r15 == r7) goto L7c
            goto L7d
        L4c:
            if (r15 == r8) goto L55
            r0 = 5
            if (r15 != r0) goto L53
            r15 = 5
            goto L55
        L53:
            r0 = 0
            goto L56
        L55:
            r0 = 1
        L56:
            l r1 = r10.a
            boolean r1 = r1 instanceof defpackage.n
            if (r1 == 0) goto L61
            if (r0 != 0) goto L7a
            if (r15 != r7) goto L77
            goto L7a
        L61:
            r3 = r0
            goto L7a
        L63:
            if (r15 == r1) goto L6b
            if (r15 != r6) goto L69
            r15 = 4
            goto L6b
        L69:
            r1 = 0
            goto L6c
        L6b:
            r1 = 1
        L6c:
            l r4 = r10.a
            boolean r4 = r4 instanceof defpackage.n
            if (r4 == 0) goto L79
            if (r1 != 0) goto L7a
            if (r15 != r0) goto L77
            goto L7a
        L77:
            r3 = 0
            goto L7a
        L79:
            r3 = r1
        L7a:
            if (r3 != 0) goto L7d
        L7c:
            return
        L7d:
            r9.b = r10
            if (r11 <= 0) goto L84
            r9.c = r11
            goto L86
        L84:
            r9.c = r2
        L86:
            r9.d = r12
            r9.h = r13
            r9.e = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k.d(k, int, int, int, int, boolean):void");
    }

    public final void e() {
        j jVar = this.f;
        if (jVar == null) {
            this.f = new j(1);
        } else {
            jVar.b();
        }
    }

    public final String toString() {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder("null:");
        sb.append(cd.y(this.g));
        k kVar = this.b;
        sb.append(kVar != null ? " connected to ".concat(kVar.f(hashSet)) : "");
        return sb.toString();
    }
}
