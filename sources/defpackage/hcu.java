package defpackage;

/* compiled from: PG */
/* renamed from: hcu  reason: default package */
/* loaded from: classes.dex */
public final class hcu extends di {
    private static final ltg c = ltg.j("com/google/android/libraries/inputmethod/emoji/picker/HorizontalSpacingItemDecoration");
    public int a = -1;
    public int b = -1;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a8, code lost:
        if (r12.getLayoutDirection() == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:
        r11 = r0;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b5, code lost:
        if (r12.getLayoutDirection() == 0) goto L31;
     */
    @Override // defpackage.di
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(android.graphics.Rect r10, android.view.View r11, android.support.v7.widget.RecyclerView r12, defpackage.ml r13) {
        /*
            r9 = this;
            int r13 = r13.a()
            java.lang.String r0 = "HorizontalSpacingItemDecoration.java"
            java.lang.String r1 = "getItemOffsets"
            java.lang.String r2 = "com/google/android/libraries/inputmethod/emoji/picker/HorizontalSpacingItemDecoration"
            if (r13 != 0) goto L25
            ltg r11 = defpackage.hcu.c
            ltv r11 = r11.c()
            ltd r11 = (defpackage.ltd) r11
            r12 = 66
            ltv r11 = r11.k(r2, r1, r12, r0)
            ltd r11 = (defpackage.ltd) r11
            java.lang.String r12 = "Item count is zero"
            r11.t(r12)
            r10.setEmpty()
            return
        L25:
            android.view.ViewGroup$LayoutParams r3 = r11.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            int r4 = r3.width
            r5 = -1
            if (r4 == r5) goto Lbd
            int r4 = r3.width
            r6 = -2
            if (r4 != r6) goto L37
            goto Lbd
        L37:
            int r4 = r9.a
            if (r4 != r5) goto L49
            int r4 = r12.getWidth()
            int r6 = r12.getPaddingLeft()
            int r4 = r4 - r6
            int r6 = r12.getPaddingRight()
            int r4 = r4 - r6
        L49:
            int r6 = r9.b
            r7 = 0
            if (r6 == r5) goto L52
            int r4 = java.lang.Math.max(r4, r7)
        L52:
            int r6 = r3.width
            int r8 = r11.getPaddingLeft()
            int r6 = r6 + r8
            int r8 = r11.getPaddingRight()
            int r6 = r6 + r8
            int r8 = r3.leftMargin
            int r6 = r6 + r8
            int r3 = r3.rightMargin
            int r6 = r6 + r3
            int r6 = r6 * r13
            int r4 = r4 - r6
            if (r4 < 0) goto L70
            int r4 = r4 / r13
            int r4 = r4 / 2
            r10.set(r4, r7, r4, r7)
            return
        L70:
            ltg r3 = defpackage.hcu.c
            ltv r3 = r3.d()
            ltd r3 = (defpackage.ltd) r3
            r6 = 86
            ltv r0 = r3.k(r2, r1, r6, r0)
            ltd r0 = (defpackage.ltd) r0
            java.lang.String r1 = "Child views will not fit in the view. Prepare the jankinator."
            r0.t(r1)
            r0 = 1
            if (r13 > r0) goto L8c
            r10.setEmpty()
            return
        L8c:
            int r11 = r12.c(r11)
            double r0 = (double) r4
            int r13 = r13 + r5
            double r2 = (double) r13
            java.lang.Double.isNaN(r0)
            java.lang.Double.isNaN(r2)
            double r0 = r0 / r2
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r0 / r2
            double r0 = java.lang.Math.floor(r0)
            int r0 = (int) r0
            if (r11 != 0) goto Laf
            int r11 = r12.getLayoutDirection()
            if (r11 != 0) goto Lad
        Laa:
            r11 = r0
            r0 = 0
            goto Lb9
        Lad:
            r11 = 0
            goto Lb9
        Laf:
            if (r11 != r13) goto Lb8
            int r11 = r12.getLayoutDirection()
            if (r11 != 0) goto Laa
            goto Lad
        Lb8:
            r11 = r0
        Lb9:
            r10.set(r0, r7, r11, r7)
            return
        Lbd:
            ltg r11 = defpackage.hcu.c
            ltv r11 = r11.d()
            ltd r11 = (defpackage.ltd) r11
            r12 = 74
            ltv r11 = r11.k(r2, r1, r12, r0)
            ltd r11 = (defpackage.ltd) r11
            java.lang.String r12 = "Layout param width of child element cannot be MATCH_PARENT or WRAP_CONTENT"
            r11.t(r12)
            r10.setEmpty()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hcu.e(android.graphics.Rect, android.view.View, android.support.v7.widget.RecyclerView, ml):void");
    }
}
