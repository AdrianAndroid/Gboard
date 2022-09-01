package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.assistant.soda.Soda;
import java.io.File;

/* compiled from: PG */
/* renamed from: fee  reason: default package */
/* loaded from: classes.dex */
public final class fee {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/PerformanceEvaluationRecognitionRunner");

    public static final void a(File file, boolean z, Soda soda, fed fedVar) {
        fedVar.a = System.currentTimeMillis();
        String path = file.getPath();
        nfj nfjVar = (nfj) nmn.h.t();
        if (nfjVar.c) {
            nfjVar.cD();
            nfjVar.c = false;
        }
        nmn nmnVar = (nmn) nfjVar.b;
        nmnVar.a |= 1;
        nmnVar.b = false;
        if (!TextUtils.isEmpty(path)) {
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/PerformanceEvaluationRecognitionRunner", "createSodaClientConfig", 66, "PerformanceEvaluationRecognitionRunner.java")).w("Updating config for wav file: %s", path);
            nfh t = nml.c.t();
            nfh t2 = nmm.h.t();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            nmm nmmVar = (nmm) t2.b;
            nmmVar.d = 1;
            nmmVar.a |= 1;
            nmm nmmVar2 = (nmm) t2.b;
            nmmVar2.e = 0;
            int i = nmmVar2.a | 2;
            nmmVar2.a = i;
            nmmVar2.a = i | 32;
            nmmVar2.g = z;
            path.getClass();
            nmmVar2.b = 3;
            nmmVar2.c = path;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            nml nmlVar = (nml) t.b;
            nmm nmmVar3 = (nmm) t2.cz();
            nmmVar3.getClass();
            nmlVar.b = nmmVar3;
            nmlVar.a = 1;
            if (nfjVar.c) {
                nfjVar.cD();
                nfjVar.c = false;
            }
            nmn nmnVar2 = (nmn) nfjVar.b;
            nml nmlVar2 = (nml) t.cz();
            nmlVar2.getClass();
            nmnVar2.c = nmlVar2;
            nmnVar2.a |= 8;
        }
        soda.a((nmn) nfjVar.cz());
        fedVar.d = (System.currentTimeMillis() - fedVar.a) * 1000;
    }
}
