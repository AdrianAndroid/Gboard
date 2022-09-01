package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* renamed from: exr  reason: default package */
/* loaded from: classes.dex */
public final class exr {
    public static final jav a = jav.e;

    public static File a(Context context, jav javVar) {
        return f(c(context), javVar.n, "accepted");
    }

    public static File b(Context context, jav javVar) {
        return f(a(context, javVar), "asr_fine_tuning");
    }

    public static File c(Context context) {
        return f(context.getFilesDir(), "personalization/speech_p13n");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File d(Context context, jav javVar, String str) {
        return f(c(context), javVar.n, "brella_outputs".concat(str));
    }

    public static File e(Context context, jav javVar) {
        return f(a(context, javVar), "lm_fine_tuning");
    }

    private static File f(File file, String... strArr) {
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            i++;
            file = new File(file, strArr[i]);
        }
        return file;
    }
}
