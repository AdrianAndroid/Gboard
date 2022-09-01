package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;
import java.io.File;

/* compiled from: PG */
/* renamed from: isw  reason: default package */
/* loaded from: classes.dex */
public final class isw {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/theme/SystemThemeFileUtils");
    public static final File[] b = new File[0];

    public static File a(File file, String str) {
        if (file == null || str == null) {
            return null;
        }
        File file2 = new File(file, str);
        if (file2.canRead()) {
            return file2;
        }
        ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/theme/SystemThemeFileUtils", "getDefaultThemeFile", 90, "SystemThemeFileUtils.java")).w("Cannot read default system theme file: %s", file2.getAbsolutePath());
        return null;
    }

    public static File b(Context context) {
        String x = jbt.x(context, R.string.f175130_resource_name_obfuscated_res_0x7f140c4f);
        if (TextUtils.isEmpty(x)) {
            return null;
        }
        File file = new File(x);
        if (!file.isDirectory()) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/theme/SystemThemeFileUtils", "getThemesDir", 61, "SystemThemeFileUtils.java")).w("No directory found: %s", file.getAbsolutePath());
            return null;
        } else if (!file.canRead()) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/theme/SystemThemeFileUtils", "getThemesDir", 65, "SystemThemeFileUtils.java")).w("Cannot read a directory: %s", file.getAbsolutePath());
            return null;
        } else {
            file.getAbsolutePath();
            return file;
        }
    }
}
