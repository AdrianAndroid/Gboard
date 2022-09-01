package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;

/* compiled from: PG */
/* renamed from: ey  reason: default package */
/* loaded from: classes.dex */
public final class ey {
    public static void a(ObjectAnimator objectAnimator, boolean z) {
        objectAnimator.setAutoCancel(z);
    }

    public static int b(ml mlVar, lp lpVar, View view, View view2, ly lyVar, boolean z) {
        if (lyVar.as() == 0 || mlVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(ly.bo(view) - ly.bo(view2)) + 1;
        }
        return Math.min(lpVar.k(), lpVar.a(view2) - lpVar.d(view));
    }

    public static int c(ml mlVar, lp lpVar, View view, View view2, ly lyVar, boolean z, boolean z2) {
        int max;
        if (lyVar.as() == 0 || mlVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(ly.bo(view), ly.bo(view2));
        int max2 = Math.max(ly.bo(view), ly.bo(view2));
        if (z2) {
            max = Math.max(0, (mlVar.a() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        return !z ? max : Math.round((max * (Math.abs(lpVar.a(view2) - lpVar.d(view)) / (Math.abs(ly.bo(view) - ly.bo(view2)) + 1))) + (lpVar.j() - lpVar.d(view)));
    }

    public static int d(ml mlVar, lp lpVar, View view, View view2, ly lyVar, boolean z) {
        if (lyVar.as() == 0 || mlVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return mlVar.a();
        }
        return (int) (((lpVar.a(view2) - lpVar.d(view)) / (Math.abs(ly.bo(view) - ly.bo(view2)) + 1)) * mlVar.a());
    }
}
