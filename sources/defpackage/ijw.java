package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: ijw  reason: default package */
/* loaded from: classes.dex */
public final class ijw {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/permissions/PermissionsUtil");
    public static volatile ijv b;

    public static String a() {
        return true != li.f() ? "android.permission.READ_EXTERNAL_STORAGE" : "android.permission.READ_MEDIA_IMAGES";
    }

    public static void b(Activity activity, int i, List list) {
        String[] strArr = (String[]) list.toArray(new String[0]);
        try {
            gcl.i(activity, strArr, i);
        } catch (RuntimeException e) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/libraries/inputmethod/permissions/PermissionsUtil", "requestPermissions", '^', "PermissionsUtil.java")).t("Error when requesting permission");
            if (!(activity instanceof ty)) {
                return;
            }
            int[] iArr = new int[strArr.length];
            Arrays.fill(iArr, 0);
            ((ty) activity).onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public static boolean c(Context context, String... strArr) {
        for (int i = 0; i <= 0; i++) {
            if (f(context, strArr[i]) != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(Context context, String[] strArr, List list) {
        boolean z = false;
        for (int i = 0; i <= 0; i++) {
            String str = strArr[i];
            if (f(context, str) != 0) {
                if (!list.contains(str)) {
                    list.add(str);
                }
                z = true;
            }
        }
        return z;
    }

    public static void e(String[] strArr, int[] iArr) {
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            ieh.j().e(iju.RUNTIME_PERMISSION_REQUESTED, str);
            if (iArr.length > i && iArr[i] == 0) {
                ieh.j().e(iju.RUNTIME_PERMISSION_ACCEPTED, str);
            }
        }
    }

    private static int f(Context context, String str) {
        try {
            return uv.a(context, str);
        } catch (RuntimeException e) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/libraries/inputmethod/permissions/PermissionsUtil", "checkSelfPermission", (char) 178, "PermissionsUtil.java")).t("Error when checking permission");
            return 0;
        }
    }
}
