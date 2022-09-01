package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: ddc  reason: default package */
/* loaded from: classes.dex */
public final class ddc {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/framework/core/SharingLinkUtil");

    public static String a(Context context) {
        return ino.M(context).Q("sharing_info");
    }

    public static void b(Context context, Uri uri) {
        String queryParameter = uri.getQueryParameter("deeplinkInfo");
        gzh a2 = gzp.a(queryParameter);
        d(context);
        c(context);
        ino.M(context).w("link_type");
        if (a2 == null) {
            return;
        }
        int i = a2.a & 2;
        String str = i == 0 ? "sharing_info" : "migration_info";
        String str2 = a2.e;
        if (i == 0 || iqe.g("com.google.android.apps.handwriting.ime,com.google.android.apps.inputmethod.hindi*,com.google.android.inputmethod.japanese*").j(str2)) {
            ino.M(context).j(str, queryParameter);
            ino M = ino.M(context);
            int j = hqs.j(a2.f);
            if (j == 0) {
                j = 1;
            }
            M.h("link_type", j - 1);
            return;
        }
        ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/framework/core/SharingLinkUtil", "putDeeplinkInfo", 99, "SharingLinkUtil.java")).G("%s is not allowed (%s)", str2, "com.google.android.apps.handwriting.ime,com.google.android.apps.inputmethod.hindi*,com.google.android.inputmethod.japanese*");
    }

    public static void c(Context context) {
        ino.M(context).w("migration_info");
    }

    public static void d(Context context) {
        ino.M(context).w("sharing_info");
    }

    public static boolean e(Context context) {
        return ino.M(context).ai("migration_info");
    }

    public static boolean f(Context context) {
        return ino.M(context).ai("sharing_info");
    }
}
