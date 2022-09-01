package defpackage;

import android.content.Context;
import android.view.inputmethod.EditorInfo;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: dmc  reason: default package */
/* loaded from: classes.dex */
public final class dmc {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/keyhound/TouchDataCollector");
    private static final lmz b = lmz.t("com.google.android.apps.inputmethod.datahound.app", "com.google.android.inputmethod.keyboarddevutils", "com.google.android.apps.village.boond");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Context context, EditorInfo editorInfo) {
        byte[] b2;
        if (b.contains(editorInfo.packageName)) {
            String str = editorInfo.packageName;
            boolean z = fno.b(context).a(str).b;
            ((ltd) ((ltd) hjk.a.b()).k("com/google/android/libraries/inputmethod/gcore/GCoreUtils", "isPackageGoogleSigned", 106, "GCoreUtils.java")).G("Package %s is %s as a first-party app.", str, true != z ? "not allowed" : "allowed");
            return z || (str.equals("com.google.android.apps.inputmethod.datahound.app") && (b2 = jbj.b(context, "com.google.android.apps.inputmethod.datahound.app")) != null && Arrays.equals(b2, jbj.d));
        }
        return false;
    }
}
