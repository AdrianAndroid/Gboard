package defpackage;

import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: PG */
/* renamed from: amb  reason: default package */
/* loaded from: classes.dex */
public final class amb implements abs {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public amb(amd amdVar, int i) {
        this.b = i;
        this.a = amdVar;
    }

    public amb(SwipeDismissBehavior swipeDismissBehavior, int i) {
        this.b = i;
        this.a = swipeDismissBehavior;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r0 == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.abs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(android.view.View r5) {
        /*
            r4 = this;
            int r0 = r4.b
            r1 = 1
            if (r0 == 0) goto L58
            if (r0 == r1) goto L4b
            java.lang.Object r0 = r4.a
            com.google.android.material.behavior.SwipeDismissBehavior r0 = (com.google.android.material.behavior.SwipeDismissBehavior) r0
            boolean r0 = r0.t(r5)
            r2 = 0
            if (r0 == 0) goto L49
            int r0 = defpackage.aad.f(r5)
            if (r0 != r1) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            java.lang.Object r3 = r4.a
            com.google.android.material.behavior.SwipeDismissBehavior r3 = (com.google.android.material.behavior.SwipeDismissBehavior) r3
            int r3 = r3.b
            if (r3 != 0) goto L26
            if (r0 != 0) goto L2b
            goto L27
        L26:
            r2 = r0
        L27:
            if (r3 != r1) goto L31
            if (r2 != 0) goto L31
        L2b:
            int r0 = r5.getWidth()
            int r0 = -r0
            goto L35
        L31:
            int r0 = r5.getWidth()
        L35:
            defpackage.aad.E(r5, r0)
            r0 = 0
            r5.setAlpha(r0)
            java.lang.Object r0 = r4.a
            com.google.android.material.behavior.SwipeDismissBehavior r0 = (com.google.android.material.behavior.SwipeDismissBehavior) r0
            opu r0 = r0.f
            if (r0 != 0) goto L45
            goto L4a
        L45:
            r0.c(r5)
            return r1
        L49:
            r1 = 0
        L4a:
            return r1
        L4b:
            androidx.viewpager2.widget.ViewPager2 r5 = (androidx.viewpager2.widget.ViewPager2) r5
            java.lang.Object r0 = r4.a
            int r5 = r5.c
            amd r0 = (defpackage.amd) r0
            int r5 = r5 + r1
            r0.w(r5)
            return r1
        L58:
            androidx.viewpager2.widget.ViewPager2 r5 = (androidx.viewpager2.widget.ViewPager2) r5
            java.lang.Object r0 = r4.a
            int r5 = r5.c
            amd r0 = (defpackage.amd) r0
            int r5 = r5 + (-1)
            r0.w(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amb.a(android.view.View):boolean");
    }
}
