package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;

/* compiled from: PG */
/* renamed from: gzq  reason: default package */
/* loaded from: classes.dex */
public final class gzq {
    public static final hhl a = hhq.a("enable_tablet_large", false);
    public static final hhl b = hhq.a("enable_foldable", false);
    public static final hhl c = hhq.e("smallest_tablet_large_diagnonal_inches_min", 9.3d);
    public static final hhl d = hhq.e("foldable_smallest_width_inches_min", 3.6d);
    public static final hhl e = hhq.e("foldable_smallest_width_inches_max", 5.5d);
    public static final hhl f = hhq.e("foldable_aspect_ratio_max", 1.5d);
    private static final ltg h = ltg.j("com/google/android/libraries/inputmethod/devicemode/DeviceModeUtil");
    public static final llp g = llp.t("tablet", "tablet_large", "tablet_huge");

    public static String a(Context context) {
        return b(context, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
        if (r7 < ((java.lang.Double) defpackage.gzq.f.c()).doubleValue()) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00af, code lost:
        if (r7 < ((java.lang.Double) defpackage.gzq.f.c()).doubleValue()) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(android.content.Context r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gzq.b(android.content.Context, boolean):java.lang.String");
    }

    public static boolean c(Context context) {
        return ino.M(context).ak("is_foldable_device");
    }

    public static boolean d(Context context, boolean z) {
        DisplayMetrics j = gvv.j(context, z);
        return Math.hypot((double) (((float) j.widthPixels) / j.xdpi), (double) (((float) j.heightPixels) / j.ydpi)) > ((Double) c.c()).doubleValue();
    }

    public static boolean e(Context context) {
        return g.contains(a(context));
    }
}
