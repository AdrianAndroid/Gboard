package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

/* compiled from: PG */
/* renamed from: gim  reason: default package */
/* loaded from: classes.dex */
public final class gim {
    static final llw a;
    private static final ltg b = ltg.j("com/google/android/libraries/assistant/trainingcache/speechlearning/SpeechLearningMetricsUtils");
    private static final String[] c = {"num_epochs", "acceptance_decision"};

    static {
        lls h = llw.h();
        h.a("baseline_eval", njh.EXEC_NAME_BASELINE_EVAL);
        h.a("p13n_train", njh.EXEC_NAME_P13N_TRAIN);
        h.a("p13n_train_per_epoch", njh.EXEC_NAME_P13N_TRAIN_PER_EPOCH);
        h.a("p13n_eval", njh.EXEC_NAME_P13N_EVAL);
        h.a("regression_eval", njh.EXEC_NAME_REGRESSION_EVAL);
        h.a("extra_evals.p13n_train_data", njh.EXEC_NAME_EXTRA_EVALS_P13N_TRAIN_DATA);
        h.a("extra_evals.baseline_train_data", njh.EXEC_NAME_EXTRA_EVALS_BASELINE_TRAIN_DATA);
        h.a("extra_evals.baseline_unedited_eval", njh.EXEC_NAME_EXTRA_EVALS_BASELINE_UNEDITED_EVAL);
        h.a("extra_evals.p13n_unedited_eval", njh.EXEC_NAME_EXTRA_EVALS_P13N_UNEDITED_EVAL);
        h.a("extra_evals.baseline_speech_eval", njh.EXEC_NAME_EXTRA_EVALS_BASELINE_SPEECH_EVAL);
        h.a("extra_evals.p13n_speech_eval", njh.EXEC_NAME_EXTRA_EVALS_P13N_SPEECH_EVAL);
        h.a("extra_evals.regression_speech_eval", njh.EXEC_NAME_EXTRA_EVALS_REGRESSION_SPEECH_EVAL);
        a = h.l();
    }

    public static nfh a(int i, int i2, File file, File file2) {
        nfh t = njj.g.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        njj njjVar = (njj) t.b;
        njjVar.e = i - 1;
        int i3 = njjVar.a | 8;
        njjVar.a = i3;
        njjVar.f = i2 - 1;
        njjVar.a = i3 | 16;
        if (file != null) {
            try {
            } catch (IOException e) {
                ((ltd) ((ltd) ((ltd) b.c()).i(e)).k("com/google/android/libraries/assistant/trainingcache/speechlearning/SpeechLearningMetricsUtils", "generateTaskInfo", (char) 388, "SpeechLearningMetricsUtils.java")).t("Failed to fully populate task info.");
            }
            if (file.exists()) {
                String absolutePath = file.getAbsolutePath();
                Path path = Paths.get(absolutePath, "metadata");
                moz mozVar = null;
                if (!Files.exists(path, new LinkOption[0])) {
                    ((ltd) ((ltd) gig.a.d()).k("com/google/android/libraries/assistant/soda/SodaUtils", "getLanguagePackProto", 521, "SodaUtils.java")).w("LP directory '%s' does not have a metadata file.", absolutePath);
                } else {
                    try {
                        mozVar = (moz) nfm.w(moz.c, Files.readAllBytes(path));
                    } catch (Exception unused) {
                        ((ltd) ((ltd) gig.a.d()).k("com/google/android/libraries/assistant/soda/SodaUtils", "getLanguagePackProto", 530, "SodaUtils.java")).w("LP directory '%s' has an invalid metadata file.", absolutePath);
                    }
                }
                if (mozVar != null) {
                    String str = mozVar.a;
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    njj njjVar2 = (njj) t.b;
                    str.getClass();
                    int i4 = 1 | njjVar2.a;
                    njjVar2.a = i4;
                    njjVar2.b = str;
                    int i5 = mozVar.b;
                    njjVar2.a = i4 | 2;
                    njjVar2.c = i5;
                } else {
                    ((ltd) ((ltd) b.d()).k("com/google/android/libraries/assistant/trainingcache/speechlearning/SpeechLearningMetricsUtils", "populateTaskInfoUnsafe", 406, "SpeechLearningMetricsUtils.java")).w("Could not extract language pack proto from %s!", file);
                }
                if (file2 != null || !file2.exists()) {
                    ((ltd) ((ltd) b.d()).k("com/google/android/libraries/assistant/trainingcache/speechlearning/SpeechLearningMetricsUtils", "populateTaskInfoUnsafe", 417, "SpeechLearningMetricsUtils.java")).w("Task plan file %s does not exist.", file2);
                } else {
                    lxu a2 = lxy.a();
                    byte[] readAllBytes = Files.readAllBytes(file2.toPath());
                    int length = readAllBytes.length;
                    jdg.E(0, length, length);
                    lxv a3 = ((lxm) a2).a(length);
                    a3.d(readAllBytes, length);
                    int a4 = a3.k().a();
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    njj njjVar3 = (njj) t.b;
                    njjVar3.a |= 4;
                    njjVar3.d = a4;
                }
                return t;
            }
        }
        ((ltd) ((ltd) b.d()).k("com/google/android/libraries/assistant/trainingcache/speechlearning/SpeechLearningMetricsUtils", "populateTaskInfoUnsafe", 409, "SpeechLearningMetricsUtils.java")).w("Language pack directory %s does not exist.", file);
        if (file2 != null) {
        }
        ((ltd) ((ltd) b.d()).k("com/google/android/libraries/assistant/trainingcache/speechlearning/SpeechLearningMetricsUtils", "populateTaskInfoUnsafe", 417, "SpeechLearningMetricsUtils.java")).w("Task plan file %s does not exist.", file2);
        return t;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0056, code lost:
        ((defpackage.ltd) ((defpackage.ltd) defpackage.gim.b.d()).k("com/google/android/libraries/assistant/trainingcache/speechlearning/SpeechLearningMetricsUtils", "convertMetricsToMap", 201, "SpeechLearningMetricsUtils.java")).w("Missing serialized metric value for %s.", r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02b5 A[LOOP:0: B:29:0x02b2->B:31:0x02b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0362 A[EDGE_INSN: B:49:0x0362->B:50:0x0362 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.nfh b(int r24, int r25, java.io.File r26, java.io.File r27, java.io.File r28, boolean r29, j$.time.Instant r30) {
        /*
            Method dump skipped, instructions count: 2414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gim.b(int, int, java.io.File, java.io.File, java.io.File, boolean, j$.time.Instant):nfh");
    }
}
