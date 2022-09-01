package defpackage;

/* compiled from: PG */
/* renamed from: lft  reason: default package */
/* loaded from: classes.dex */
final class lft extends ldv {
    final /* synthetic */ lfu g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lft(lfu lfuVar, lfy lfyVar, CharSequence charSequence) {
        super(lfyVar, charSequence);
        this.g = lfuVar;
    }

    @Override // defpackage.ldv
    public final int a(int i) {
        return i + ((String) this.g.a).length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
        r6 = r6 + 1;
     */
    @Override // defpackage.ldv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(int r6) {
        /*
            r5 = this;
            lfu r0 = r5.g
            java.lang.Object r0 = r0.a
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            java.lang.CharSequence r1 = r5.b
            int r1 = r1.length()
            int r1 = r1 - r0
        L11:
            if (r6 > r1) goto L31
            r2 = 0
        L14:
            if (r2 >= r0) goto L30
            java.lang.CharSequence r3 = r5.b
            int r4 = r2 + r6
            char r3 = r3.charAt(r4)
            lfu r4 = r5.g
            java.lang.Object r4 = r4.a
            java.lang.String r4 = (java.lang.String) r4
            char r4 = r4.charAt(r2)
            if (r3 == r4) goto L2d
            int r6 = r6 + 1
            goto L11
        L2d:
            int r2 = r2 + 1
            goto L14
        L30:
            return r6
        L31:
            r6 = -1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lft.b(int):int");
    }
}
