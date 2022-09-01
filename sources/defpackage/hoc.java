package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: hoc  reason: default package */
/* loaded from: classes.dex */
final class hoc implements View.OnTouchListener {
    final /* synthetic */ hoe a;
    private float b;
    private float c;
    private int d = -1;

    public hoc(hoe hoeVar) {
        this.a = hoeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r0 != 6) goto L13;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            int r0 = r8.getActionMasked()
            int r1 = r8.getActionIndex()
            int r1 = r8.getPointerId(r1)
            r2 = 1
            r3 = -1
            if (r0 == 0) goto L76
            r4 = 1092616192(0x41200000, float:10.0)
            if (r0 == r2) goto L4e
            r5 = 2
            if (r0 == r5) goto L24
            r5 = 3
            if (r0 == r5) goto L21
            r5 = 5
            if (r0 == r5) goto L76
            r5 = 6
            if (r0 == r5) goto L4e
            goto L88
        L21:
            r6.d = r3
            goto L88
        L24:
            int r7 = r6.d
            if (r1 != r7) goto L88
            float r7 = r8.getRawX()
            float r8 = r8.getRawY()
            float r0 = r6.b
            float r7 = r7 - r0
            float r0 = r6.c
            float r8 = r8 - r0
            float r8 = java.lang.Math.abs(r8)
            float r0 = java.lang.Math.abs(r7)
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 >= 0) goto L88
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 <= 0) goto L88
            hoe r7 = r6.a
            hod r8 = defpackage.hod.SWIPE
            r7.p(r8)
            goto L88
        L4e:
            int r0 = r6.d
            if (r1 != r0) goto L88
            r6.d = r3
            float r0 = r8.getRawX()
            float r8 = r8.getRawY()
            float r1 = r6.b
            float r3 = r6.c
            float r1 = r1 - r0
            float r0 = java.lang.Math.abs(r1)
            float r3 = r3 - r8
            float r8 = java.lang.Math.abs(r3)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L88
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 > 0) goto L88
            r7.performClick()
            goto L88
        L76:
            int r7 = r6.d
            if (r7 != r3) goto L88
            r6.d = r1
            float r7 = r8.getRawX()
            r6.b = r7
            float r7 = r8.getRawY()
            r6.c = r7
        L88:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hoc.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
