package defpackage;

/* compiled from: PG */
/* renamed from: edf  reason: default package */
/* loaded from: classes.dex */
public final class edf extends di {
    private static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/search/fastaccessbar/HorizontalSpacingItemDecoration");
    public int a = -1;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
        if (r11.getLayoutDirection() == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
        r11 = r0;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a0, code lost:
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a8, code lost:
        if (r11.getLayoutDirection() == 0) goto L32;
     */
    @Override // defpackage.di
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(android.graphics.Rect r9, android.view.View r10, android.support.v7.widget.RecyclerView r11, defpackage.ml r12) {
        /*
            r8 = this;
            int r0 = r8.a
            r1 = -1
            if (r0 == r1) goto L10
            int r12 = r12.a()
            int r0 = r8.a
            int r12 = java.lang.Math.min(r12, r0)
            goto L14
        L10:
            int r12 = r12.a()
        L14:
            java.lang.String r0 = "HorizontalSpacingItemDecoration.java"
            java.lang.String r2 = "getItemOffsets"
            java.lang.String r3 = "com/google/android/apps/inputmethod/libs/search/fastaccessbar/HorizontalSpacingItemDecoration"
            if (r12 != 0) goto L35
            ltg r10 = defpackage.edf.b
            ltv r10 = r10.d()
            ltd r10 = (defpackage.ltd) r10
            r11 = 55
            ltv r10 = r10.k(r3, r2, r11, r0)
            ltd r10 = (defpackage.ltd) r10
            java.lang.String r11 = "Item count is zero"
            r10.t(r11)
            r9.setEmpty()
            return
        L35:
            int r4 = r11.c(r10)
            if (r4 < r12) goto L3f
            r9.setEmpty()
            return
        L3f:
            android.view.ViewGroup$LayoutParams r5 = r10.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            int r6 = r5.width
            if (r6 == r1) goto Lb0
            int r6 = r5.width
            r7 = -2
            if (r6 != r7) goto L4f
            goto Lb0
        L4f:
            int r0 = r11.getWidth()
            int r2 = r11.getPaddingLeft()
            int r0 = r0 - r2
            int r2 = r11.getPaddingRight()
            int r0 = r0 - r2
            int r2 = r5.width
            int r3 = r10.getPaddingLeft()
            int r2 = r2 + r3
            int r10 = r10.getPaddingRight()
            int r2 = r2 + r10
            int r10 = r5.leftMargin
            int r2 = r2 + r10
            int r10 = r5.rightMargin
            int r2 = r2 + r10
            int r2 = r2 * r12
            int r0 = r0 - r2
            r10 = 0
            if (r0 < 0) goto L7c
            int r0 = r0 / r12
            int r0 = r0 / 2
            r9.set(r0, r10, r0, r10)
            return
        L7c:
            r2 = 1
            if (r12 > r2) goto L83
            r9.setEmpty()
            return
        L83:
            double r2 = (double) r0
            int r12 = r12 + r1
            double r0 = (double) r12
            java.lang.Double.isNaN(r2)
            java.lang.Double.isNaN(r0)
            double r2 = r2 / r0
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = r2 / r0
            double r0 = java.lang.Math.floor(r2)
            int r0 = (int) r0
            if (r4 != 0) goto La2
            int r11 = r11.getLayoutDirection()
            if (r11 != 0) goto La0
        L9d:
            r11 = r0
            r0 = 0
            goto Lac
        La0:
            r11 = 0
            goto Lac
        La2:
            if (r4 != r12) goto Lab
            int r11 = r11.getLayoutDirection()
            if (r11 != 0) goto L9d
            goto La0
        Lab:
            r11 = r0
        Lac:
            r9.set(r0, r10, r11, r10)
            return
        Lb0:
            ltg r10 = defpackage.edf.b
            ltv r10 = r10.d()
            ltd r10 = (defpackage.ltd) r10
            r11 = 69
            ltv r10 = r10.k(r3, r2, r11, r0)
            ltd r10 = (defpackage.ltd) r10
            java.lang.String r11 = "Layout param width of child element cannot be MATCH_PARENT or WRAP_CONTENT"
            r10.t(r11)
            r9.setEmpty()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edf.e(android.graphics.Rect, android.view.View, android.support.v7.widget.RecyclerView, ml):void");
    }
}
