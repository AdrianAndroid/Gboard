package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: crk  reason: default package */
/* loaded from: classes.dex */
public final class crk {
    public static final /* synthetic */ int a = 0;
    private static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/expression/image/ShareContentUtils");
    private static final lmz c = lmz.t("android.resource", "content", "file");

    public static lfb a(Context context, File file) {
        if (file.exists()) {
            try {
                return lfb.g(FileProvider.a(context, h(context), file));
            } catch (Throwable unused) {
                ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/expression/image/ShareContentUtils", "getUriForExistingFileOrAbsent", 89, "ShareContentUtils.java")).w("Couldn't get content URI for file %s", file.getAbsolutePath());
                return ldu.a;
            }
        }
        ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/expression/image/ShareContentUtils", "getUriForExistingFileOrAbsent", 83, "ShareContentUtils.java")).t("File doesn't exist");
        return ldu.a;
    }

    public static mko b(Context context, cqp cqpVar, Executor executor) {
        Uri s = cqpVar.s();
        if (!Uri.EMPTY.equals(s)) {
            return hiz.k(ce.e((ats) hjq.a(context).e(hjq.b(s, cqpVar.i())).B(!c.contains(s.getScheme())))).u(new crj(s, context, cqpVar, 0), executor);
        }
        return kcu.J(new IllegalArgumentException("the image url is empty"));
    }

    public static File c(Context context, String str, String str2) {
        File canonicalFile = g(str, f(context)).getCanonicalFile();
        if (!jan.b.h(canonicalFile)) {
            ((ltd) ((ltd) b.c()).k("com/google/android/apps/inputmethod/libs/expression/image/ShareContentUtils", "createCanonicalFile", 184, "ShareContentUtils.java")).w("Failed to mkdirs for %s", canonicalFile.getAbsolutePath());
        }
        return File.createTempFile(str, ".".concat(String.valueOf(str2)), canonicalFile).getCanonicalFile();
    }

    public static File d(Context context) {
        return new File(new File(context.getApplicationContext().getCacheDir(), "share_content"), "contentsuggestion");
    }

    public static File e(Context context) {
        return new File(f(context), "contentsuggestion");
    }

    public static File f(Context context) {
        return new File(context.getApplicationContext().getFilesDir(), "share_content");
    }

    public static File g(String str, File file) {
        return !TextUtils.isEmpty(str) ? new File(file, str) : file;
    }

    public static String h(Context context) {
        return jbt.w(context, ".fileprovider");
    }
}
