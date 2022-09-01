package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* renamed from: evf  reason: default package */
/* loaded from: classes.dex */
public final class evf {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/theme/utils/ThemePackageUtils");
    private static final File[] b = new File[0];

    public static File[] a(Context context) {
        File filesDir = context.getFilesDir();
        File[] listFiles = filesDir.listFiles(exs.b);
        if (listFiles == null) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/theme/utils/ThemePackageUtils", "getUserThemeFiles", 26, "ThemePackageUtils.java")).w("Cannot read a directory: %s", filesDir.getAbsolutePath());
            return b;
        }
        return listFiles;
    }
}
