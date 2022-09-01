package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: PG */
/* renamed from: kso  reason: default package */
/* loaded from: classes.dex */
public final class kso extends acz {
    final /* synthetic */ SwipeDismissBehavior a;
    private int b;
    private int c = -1;

    public kso(SwipeDismissBehavior swipeDismissBehavior) {
        this.a = swipeDismissBehavior;
    }

    @Override // defpackage.acz
    public final int a(View view) {
        return view.getWidth();
    }

    @Override // defpackage.acz
    public final void b(View view, int i) {
        this.c = i;
        this.b = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // defpackage.acz
    public final void c(int i) {
        opu opuVar = this.a.f;
        if (opuVar != null) {
            if (i != 0) {
                kyj.a().e(((kye) opuVar.a).m);
            } else {
                kyj.a().f(((kye) opuVar.a).m);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x004d, code lost:
        if (java.lang.Math.abs(r7.getLeft() - r6.b) >= java.lang.Math.round(r7.getWidth() * r6.a.c)) goto L29;
     */
    @Override // defpackage.acz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.view.View r7, float r8, float r9) {
        /*
            r6 = this;
            r9 = -1
            r6.c = r9
            int r9 = r7.getWidth()
            r0 = 1
            r1 = 0
            int r2 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r2 == 0) goto L33
            int r2 = defpackage.aad.f(r7)
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r6.a
            int r3 = r3.b
            r4 = 2
            if (r3 != r4) goto L19
            goto L4f
        L19:
            if (r3 != 0) goto L27
            if (r2 != r0) goto L22
            int r2 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r2 < 0) goto L4f
            goto L63
        L22:
            int r2 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r2 <= 0) goto L63
            goto L4f
        L27:
            if (r2 != r0) goto L2e
            int r2 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r2 <= 0) goto L63
            goto L4f
        L2e:
            int r2 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r2 >= 0) goto L63
            goto L4f
        L33:
            int r2 = r7.getLeft()
            int r3 = r6.b
            int r4 = r7.getWidth()
            com.google.android.material.behavior.SwipeDismissBehavior r5 = r6.a
            float r5 = r5.c
            float r4 = (float) r4
            float r4 = r4 * r5
            int r4 = java.lang.Math.round(r4)
            int r2 = r2 - r3
            int r2 = java.lang.Math.abs(r2)
            if (r2 < r4) goto L63
        L4f:
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 < 0) goto L5e
            int r8 = r7.getLeft()
            int r1 = r6.b
            if (r8 >= r1) goto L5c
            goto L5e
        L5c:
            int r1 = r1 + r9
            goto L66
        L5e:
            int r8 = r6.b
            int r1 = r8 - r9
            goto L66
        L63:
            int r1 = r6.b
            r0 = 0
        L66:
            com.google.android.material.behavior.SwipeDismissBehavior r8 = r6.a
            ada r8 = r8.a
            int r9 = r7.getTop()
            boolean r8 = r8.i(r1, r9)
            if (r8 == 0) goto L7f
            ksp r8 = new ksp
            com.google.android.material.behavior.SwipeDismissBehavior r9 = r6.a
            r8.<init>(r9, r7, r0)
            defpackage.aad.H(r7, r8)
            return
        L7f:
            if (r0 == 0) goto L8a
            com.google.android.material.behavior.SwipeDismissBehavior r8 = r6.a
            opu r8 = r8.f
            if (r8 == 0) goto L8a
            r8.c(r7)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kso.d(android.view.View, float, float):void");
    }

    @Override // defpackage.acz
    public final boolean e(View view, int i) {
        int i2 = this.c;
        return (i2 == -1 || i2 == i) && this.a.t(view);
    }

    @Override // defpackage.acz
    public final int f(View view, int i) {
        int width;
        int width2;
        int width3;
        int f = aad.f(view);
        int i2 = this.a.b;
        if (i2 == 0) {
            if (f == 1) {
                width = this.b - view.getWidth();
                width2 = this.b;
            } else {
                width = this.b;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.b - view.getWidth();
            width2 = view.getWidth() + this.b;
        } else if (f == 1) {
            width = this.b;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.b - view.getWidth();
            width2 = this.b;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.acz
    public final int g(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.acz
    public final void i(View view, int i, int i2) {
        float width = this.b + (view.getWidth() * this.a.d);
        float width2 = this.b + (view.getWidth() * this.a.e);
        float f = i;
        if (f <= width) {
            view.setAlpha(1.0f);
        } else if (f >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(SwipeDismissBehavior.u(1.0f - ((f - width) / (width2 - width))));
        }
    }
}
