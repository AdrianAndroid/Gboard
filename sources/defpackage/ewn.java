package defpackage;

import android.content.Context;
import android.net.Uri;
import j$.time.Duration;
import java.io.File;

/* compiled from: PG */
/* renamed from: ewn  reason: default package */
/* loaded from: classes.dex */
public final class ewn {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/trainingcache/federation/InAppTrainingUtils");
    private static final long b = Duration.ofHours(24).toMillis();
    private static final long c = Duration.ofSeconds(5).toMillis();

    public static Uri a(Context context, File file) {
        String absolutePath = file.getAbsolutePath();
        String absolutePath2 = context.getFilesDir().getAbsolutePath();
        String absolutePath3 = context.getCacheDir().getAbsolutePath();
        if (absolutePath.startsWith(absolutePath2)) {
            return Uri.parse("appfiles:".concat(String.valueOf(absolutePath.substring(absolutePath2.length()))));
        }
        if (absolutePath.startsWith(absolutePath3)) {
            return Uri.parse("appcache:".concat(String.valueOf(absolutePath.substring(absolutePath3.length()))));
        }
        throw new IllegalArgumentException("File path must be path of app files or cache");
    }

    public static fwm b(Context context, String str, File file, File file2, File file3, evg evgVar, nnl nnlVar) {
        fwl a2 = fwm.a();
        long millis = Duration.ofMinutes(((Long) evs.g.c()).longValue()).toMillis();
        a2.e(str);
        a2.a = str.hashCode();
        if (nnlVar != null) {
            a2.b(nnlVar.q());
        }
        a2.d(a(context, file), a(context, file2), a(context, file3));
        a2.c = fyb.d(0, millis);
        if (evgVar.a) {
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/federation/InAppTrainingUtils", "createFeaturePrecomputationTaskOptions", 93, "InAppTrainingUtils.java")).t("Using debug configuration.");
            a2.b = c;
        }
        return a2.a();
    }

    public static fwm c(String str, String str2, evg evgVar) {
        fwl a2 = fwm.a();
        a2.e(str2);
        a2.a = str2.hashCode();
        a2.c(str);
        a2.c = fyb.d(0, b);
        if (evgVar.a) {
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/federation/InAppTrainingUtils", "createFederatedTrainingTaskOptions", 136, "InAppTrainingUtils.java")).t("Using debug configuration.");
            a2.b = c;
        }
        return a2.a();
    }

    public static File d(Context context, Uri uri) {
        String scheme = uri.getScheme();
        String path = uri.getPath();
        if (lfd.e(scheme) || lfd.e(path)) {
            throw new IllegalArgumentException("Uri is not valid");
        }
        if ("appfiles".equals(scheme)) {
            return new File(context.getFilesDir(), path);
        }
        if ("appcache".equals(scheme)) {
            return new File(context.getCacheDir(), path);
        }
        throw new IllegalArgumentException("File path must be path of app files or cache");
    }

    public static void e(File file) {
        jan janVar = jan.b;
        if (!janVar.g(file) || janVar.e(file)) {
            return;
        }
        ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/federation/InAppTrainingUtils", "deleteOutputDirIfExists", 148, "InAppTrainingUtils.java")).t("Unable to delete output directory");
    }
}
