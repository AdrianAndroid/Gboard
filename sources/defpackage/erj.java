package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import com.google.android.inputmethod.latin.R;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: erj  reason: default package */
/* loaded from: classes.dex */
public final class erj {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/theme/core/ThemePackageManager");

    public static eqg a(String str) {
        return new eqg("system:".concat(String.valueOf(str)));
    }

    public static eri b(Context context, eqg eqgVar) {
        String str = eqgVar.a;
        eqi eqiVar = null;
        eqd a2 = null;
        eqi eqiVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("assets:")) {
            String substring = str.substring(7);
            if (!TextUtils.isEmpty(substring) && substring.startsWith("theme_package_metadata_")) {
                return epy.b(context, substring, str);
            }
            return null;
        } else if (str.startsWith("files:")) {
            return erv.b(context, e(context, str));
        } else {
            if (str.startsWith("system:")) {
                String substring2 = str.substring(7);
                File b = isw.b(context);
                if (b == null) {
                    return null;
                }
                return erv.b(context, new File(b, substring2));
            } else if (!str.startsWith("silk:")) {
                return null;
            } else {
                if (!itb.j() || !context.getString(R.string.f160020_resource_name_obfuscated_res_0x7f14061f).equals(str)) {
                    if (!itb.l()) {
                        return null;
                    }
                    if (context.getString(R.string.f160080_resource_name_obfuscated_res_0x7f140625).equals(str)) {
                        if (Build.VERSION.SDK_INT >= 31) {
                            eqiVar2 = new eqi(new ContextThemeWrapper(context, (int) R.style.f202100_resource_name_obfuscated_res_0x7f15074e), true);
                        }
                        return erg.c(context, eqiVar2, R.string.f176510_resource_name_obfuscated_res_0x7f140cdc, "Material3 Light");
                    } else if (!context.getString(R.string.f160070_resource_name_obfuscated_res_0x7f140624).equals(str)) {
                        return null;
                    } else {
                        if (Build.VERSION.SDK_INT >= 31) {
                            eqiVar = new eqi(new ContextThemeWrapper(context, (int) R.style.f202020_resource_name_obfuscated_res_0x7f150744), false);
                        }
                        return erg.c(context, eqiVar, R.string.f176500_resource_name_obfuscated_res_0x7f140cdb, "Material3 Dark");
                    }
                }
                if (eqg.g(context)) {
                    a2 = eqd.a(context, 16974120);
                } else if (Build.VERSION.SDK_INT >= 31) {
                    a2 = eqd.a(context, 16974563);
                }
                return erg.c(context, a2, (a2 == null || !a2.a) ? R.string.f176480_resource_name_obfuscated_res_0x7f140cd9 : R.string.f176490_resource_name_obfuscated_res_0x7f140cda, "Silk");
            }
        }
    }

    public static File c(Context context) {
        return m(context, "user_theme_");
    }

    public static File d(File file, String str) {
        return new File(new File(new File(file, "superpacks"), "themes"), str);
    }

    public static File e(Context context, String str) {
        if (!str.startsWith("files:")) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/theme/core/ThemePackageManager", "getFileThemePackageFile", 95, "ThemePackageManager.java")).G("Invalid prefix for: %s, expected prefix: %s", str, "files:");
            return new File("");
        }
        String substring = str.substring(6);
        if (i(str)) {
            return d(context.getFilesDir(), substring);
        }
        return new File(context.getFilesDir(), substring);
    }

    public static String f(String str) {
        String a2 = jbs.a(str);
        return "downloaded_theme_" + a2 + ".zip";
    }

    public static String g(String str) {
        return "files:".concat(String.valueOf(str));
    }

    public static String h(Context context, String str) {
        String absolutePath = e(context, str).getAbsolutePath();
        String absolutePath2 = context.getFilesDir().getAbsolutePath();
        if (!absolutePath2.endsWith(File.separator)) {
            absolutePath2 = String.valueOf(absolutePath2).concat(String.valueOf(File.separator));
        }
        if (absolutePath.startsWith(absolutePath2)) {
            return absolutePath.substring(absolutePath2.length());
        }
        return null;
    }

    public static boolean i(String str) {
        return str.startsWith("files:downloaded_theme_");
    }

    public static boolean j(String str) {
        return i(str) || k(str);
    }

    public static boolean k(String str) {
        return str.startsWith("files:user_theme_");
    }

    public static boolean l(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (str.startsWith("assets:")) {
            String substring = str.substring(7);
            if (TextUtils.isEmpty(substring) || !substring.startsWith("theme_package_metadata_")) {
                return false;
            }
            AssetManager assets = context.getAssets();
            if (substring.startsWith("theme_package_metadata_")) {
                try {
                    InputStream open = assets.open("theme/" + substring);
                    if (open == null) {
                        return true;
                    }
                    open.close();
                    return true;
                } catch (IOException unused) {
                }
            }
            return false;
        } else if (str.startsWith("files:")) {
            return ijf.i(jai.a) && erv.g(e(context, str));
        } else if (str.startsWith("system:")) {
            String substring2 = str.substring(7);
            File b = isw.b(context);
            if (b == null) {
                ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/theme/core/ThemePackageManager", "isValidThemePackageName", 201, "ThemePackageManager.java")).t("System theme directory is not available.");
                return false;
            }
            return erv.g(new File(b, substring2));
        } else if (!str.startsWith("silk:")) {
            return false;
        } else {
            if (itb.j() && context.getString(R.string.f160020_resource_name_obfuscated_res_0x7f14061f).equals(str)) {
                return true;
            }
            if (!itb.l()) {
                return false;
            }
            return context.getString(R.string.f160080_resource_name_obfuscated_res_0x7f140625).equals(str) || context.getString(R.string.f160070_resource_name_obfuscated_res_0x7f140624).equals(str);
        }
    }

    public static File m(Context context, String str) {
        for (int i = 0; i < 100; i++) {
            File file = new File(context.getFilesDir(), String.format(Locale.US, "%spackage_%015d_%02d.zip", str, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i)));
            if (!file.exists()) {
                return file;
            }
        }
        ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/theme/core/ThemePackageManager", "generateNewUserThemeFile", 256, "ThemePackageManager.java")).t("Failed to generate new user theme file.");
        return null;
    }
}
