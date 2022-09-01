package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hux  reason: default package */
/* loaded from: classes.dex */
public final class hux implements View.OnTouchListener {
    final /* synthetic */ hva a;
    private float b;
    private float c;
    private float d;
    private float e;
    private final int[] f = new int[2];
    private int g = -1;
    private int h;

    public hux(hva hvaVar) {
        this.a = hvaVar;
    }

    private final void a() {
        hva hvaVar = this.a;
        imn imnVar = hvaVar.n;
        if (imnVar == null || !imnVar.f(hvaVar.o)) {
            return;
        }
        this.a.p.cancel();
        hva hvaVar2 = this.a;
        hvaVar2.n.c(hvaVar2.o, null, true);
    }

    private static final boolean b(float f, float f2, float f3, float f4) {
        return Math.abs(f - f2) <= 10.0f && Math.abs(f3 - f4) <= 10.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r0 != 6) goto L13;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hux.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
