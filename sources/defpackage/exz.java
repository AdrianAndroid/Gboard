package defpackage;

import android.content.Context;
import java.io.File;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: exz  reason: default package */
/* loaded from: classes.dex */
public final class exz {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/trainingcache/precomputedfeatures/speech/SpeechPrecomputedFeatureManager");
    private static volatile exz e;
    public final jan b = jan.b;
    public final File c;
    public final idk d;
    private final Executor f;
    private final iye g;

    private exz(Context context, Executor executor, idk idkVar) {
        this.f = executor;
        this.c = new File(context.getCacheDir(), "/ekho/speech/precomputed_features/");
        this.d = idkVar;
        exy exyVar = new exy(this, executor);
        this.g = exyVar;
        exyVar.d(executor);
    }

    public static exz a(Context context) {
        exz exzVar = e;
        if (exzVar == null) {
            synchronized (exz.class) {
                exzVar = e;
                if (exzVar == null) {
                    exzVar = new exz(context, gxp.a().b, ieh.j());
                    e = exzVar;
                }
            }
        }
        return exzVar;
    }

    public final mko b() {
        return kcu.N(new emq(this, 11), this.f);
    }

    public final void c(File file, List list, String str) {
        if (!file.exists()) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/precomputedfeatures/speech/SpeechPrecomputedFeatureManager", "maybeMoveFilesToPrecomputedFeaturesDir", 158, "SpeechPrecomputedFeatureManager.java")).t("Input directory is does not exist.");
        } else if (list == null || list.isEmpty()) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/precomputedfeatures/speech/SpeechPrecomputedFeatureManager", "maybeMoveFilesToPrecomputedFeaturesDir", 163, "SpeechPrecomputedFeatureManager.java")).t("File extensions are not provided, unable to complete move.");
        } else {
            File file2 = lfd.e(str) ? this.c : new File(this.c, str);
            if (file2.exists() || file2.mkdirs()) {
                File[] listFiles = file.listFiles(new cbb(list, 4));
                if (listFiles == null) {
                    ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/precomputedfeatures/speech/SpeechPrecomputedFeatureManager", "maybeMoveFilesToPrecomputedFeaturesDir", 191, "SpeechPrecomputedFeatureManager.java")).w("Could not list files in directory %s", file.getAbsolutePath());
                    return;
                }
                long j = 0;
                int i = 0;
                int i2 = 0;
                for (File file3 : listFiles) {
                    File file4 = new File(file2, file3.getName());
                    long length = file3.length();
                    if (!this.b.i(file3, file4)) {
                        ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/precomputedfeatures/speech/SpeechPrecomputedFeatureManager", "maybeMoveFilesToPrecomputedFeaturesDir", 204, "SpeechPrecomputedFeatureManager.java")).w("Failed to move %s.", file3);
                        i2++;
                    } else {
                        i++;
                        j += length;
                    }
                }
                this.d.e(evk.PRECOMPUTED_FEATURES_NUM_FILES_MOVED, Integer.valueOf(i));
                this.d.e(evk.PRECOMPUTED_FEATURES_NUM_BYTES_MOVED, Long.valueOf(j));
                this.d.e(evk.PRECOMPUTED_FEATURES_NUM_FAILED_MOVE, Integer.valueOf(i2));
                return;
            }
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/precomputedfeatures/speech/SpeechPrecomputedFeatureManager", "maybeMoveFilesToPrecomputedFeaturesDir", 174, "SpeechPrecomputedFeatureManager.java")).w("Failed to make output directory %s.", file2);
        }
    }
}
