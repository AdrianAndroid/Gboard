package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: kss  reason: default package */
/* loaded from: classes.dex */
public final class kss extends acz {
    final /* synthetic */ BottomSheetBehavior a;

    public kss(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // defpackage.acz
    public final void c(int i) {
        if (i == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.a;
            if (!bottomSheetBehavior.v) {
                return;
            }
            bottomSheetBehavior.C(1);
        }
    }

    @Override // defpackage.acz
    public final boolean e(View view, int i) {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        int i2 = bottomSheetBehavior.w;
        if (i2 != 1 && !bottomSheetBehavior.E) {
            if (i2 == 3 && bottomSheetBehavior.D == i) {
                WeakReference weakReference = bottomSheetBehavior.B;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            System.currentTimeMillis();
            WeakReference weakReference2 = this.a.A;
            return weakReference2 != null && weakReference2.get() == view;
        }
        return false;
    }

    @Override // defpackage.acz
    public final int f(View view, int i) {
        return view.getLeft();
    }

    @Override // defpackage.acz
    public final int g(View view, int i) {
        int t = this.a.t();
        BottomSheetBehavior bottomSheetBehavior = this.a;
        return ld.c(i, t, bottomSheetBehavior.t ? bottomSheetBehavior.z : bottomSheetBehavior.r);
    }

    @Override // defpackage.acz
    public final int h() {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        return bottomSheetBehavior.t ? bottomSheetBehavior.z : bottomSheetBehavior.r;
    }

    @Override // defpackage.acz
    public final void i(View view, int i, int i2) {
        this.a.x(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r7 > r5.a.p) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
        if (java.lang.Math.abs(r6.getTop() - r5.a.t()) < java.lang.Math.abs(r6.getTop() - r5.a.p)) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a8, code lost:
        if (java.lang.Math.abs(r7 - r5.a.p) < java.lang.Math.abs(r7 - r5.a.r)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
        if (java.lang.Math.abs(r7 - r8.o) < java.lang.Math.abs(r7 - r5.a.r)) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
        if (r7 < java.lang.Math.abs(r7 - r8.r)) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00eb, code lost:
        if (java.lang.Math.abs(r7 - r2) < java.lang.Math.abs(r7 - r5.a.r)) goto L6;
     */
    @Override // defpackage.acz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kss.d(android.view.View, float, float):void");
    }
}
