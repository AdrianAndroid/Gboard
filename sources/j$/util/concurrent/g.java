package j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class g extends l {
    final l[] e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(l[] lVarArr) {
        super(-1, null, null);
        this.e = lVarArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0029, code lost:
        if ((r0 instanceof j$.util.concurrent.g) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002b, code lost:
        r0 = ((j$.util.concurrent.g) r0).e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0034, code lost:
        return r0.a(r5, r6);
     */
    @Override // j$.util.concurrent.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.util.concurrent.l a(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            j$.util.concurrent.l[] r0 = r4.e
        L2:
            r1 = 0
            if (r6 == 0) goto L39
            if (r0 == 0) goto L39
            int r2 = r0.length
            if (r2 == 0) goto L39
            int r2 = r2 + (-1)
            r2 = r2 & r5
            j$.util.concurrent.l r0 = j$.util.concurrent.ConcurrentHashMap.l(r0, r2)
            if (r0 != 0) goto L14
            goto L39
        L14:
            int r2 = r0.a
            if (r2 != r5) goto L25
            java.lang.Object r3 = r0.b
            if (r3 == r6) goto L24
            if (r3 == 0) goto L25
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L25
        L24:
            return r0
        L25:
            if (r2 >= 0) goto L35
            boolean r1 = r0 instanceof j$.util.concurrent.g
            if (r1 == 0) goto L30
            j$.util.concurrent.g r0 = (j$.util.concurrent.g) r0
            j$.util.concurrent.l[] r0 = r0.e
            goto L2
        L30:
            j$.util.concurrent.l r5 = r0.a(r5, r6)
            return r5
        L35:
            j$.util.concurrent.l r0 = r0.d
            if (r0 != 0) goto L14
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.g.a(int, java.lang.Object):j$.util.concurrent.l");
    }
}
