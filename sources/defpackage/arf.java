package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: arf  reason: default package */
/* loaded from: classes.dex */
public final class arf {
    private static qw d;
    private static final Interpolator c = new LinearInterpolator();
    static final azp a = azp.k("t", "s", "e", "o", "i", "h", "to", "ti");
    static final azp b = azp.k("x", "y");

    arf() {
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        Interpolator linearInterpolator;
        pointF.x = asc.b(pointF.x, -1.0f, 1.0f);
        pointF.y = asc.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = asc.b(pointF2.x, -1.0f, 1.0f);
        pointF2.y = asc.b(pointF2.y, -100.0f, 100.0f);
        int d2 = ash.d(pointF.x, pointF.y, pointF2.x, pointF2.y);
        synchronized (arf.class) {
            if (d == null) {
                d = new qw();
            }
            weakReference = (WeakReference) d.d(d2);
        }
        Interpolator interpolator = weakReference != null ? (Interpolator) weakReference.get() : null;
        if (weakReference == null || interpolator == null) {
            try {
                linearInterpolator = abt.c(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                    linearInterpolator = abt.c(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    linearInterpolator = new LinearInterpolator();
                }
            }
            interpolator = linearInterpolator;
            try {
                WeakReference weakReference2 = new WeakReference(interpolator);
                synchronized (arf.class) {
                    d.h(d2, weakReference2);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.asi a(defpackage.arw r21, defpackage.amp r22, float r23, defpackage.art r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arf.a(arw, amp, float, art, boolean, boolean):asi");
    }
}
