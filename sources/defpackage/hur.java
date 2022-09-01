package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* renamed from: hur  reason: default package */
/* loaded from: classes.dex */
final class hur implements View.OnTouchListener {
    final /* synthetic */ hus a;
    private float b;
    private float c;
    private final int f;
    private final int g;
    private int i;
    private int j;
    private float k;
    private int l;
    private int m;
    private int n;
    private float q;
    private float d = 1.0f;
    private float e = 1.0f;
    private final Rect h = new Rect();
    private final float[] o = new float[2];
    private final float[] p = new float[2];
    private int r = -1;

    public hur(hus husVar, int i, int i2) {
        this.a = husVar;
        this.f = i;
        this.g = i2;
    }

    private final void a(boolean z) {
        for (View view : this.a.o) {
            if (view != null) {
                view.setPressed(z);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r8 != 6) goto L10;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hur.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
