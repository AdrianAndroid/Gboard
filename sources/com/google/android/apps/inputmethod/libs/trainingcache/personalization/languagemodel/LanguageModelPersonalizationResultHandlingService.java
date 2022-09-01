package com.google.android.apps.inputmethod.libs.trainingcache.personalization.languagemodel;

import android.content.Context;
import android.content.LocusId;
import android.net.Uri;
import android.view.contentcapture.ContentCaptureManager;
import android.view.contentcapture.DataShareRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.inputmethod.nativelib.NativeLibHelper;
import j$.nio.charset.StandardCharsets;
import j$.util.Optional;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LanguageModelPersonalizationResultHandlingService extends fwp {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationResultHandlingService");
    private Context b;
    private jan c;
    private idk d;
    private ino e;

    private static List b() {
        return lfy.c(',').k((String) exd.c.c());
    }

    private final void c(nfh nfhVar, boolean z) {
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mdc mdcVar = (mdc) nfhVar.b;
        mdc mdcVar2 = mdc.e;
        mdcVar.a |= 2;
        mdcVar.c = z;
        this.d.e(exq.PERSONALIZATION_JOB_COMPLETED, nfhVar.cz());
    }

    @Override // defpackage.fwp
    public final void a(fwm fwmVar, boolean z, fxa fxaVar) {
        nnq nnqVar;
        boolean z2;
        List list;
        String str;
        String str2;
        fxa fxaVar2 = fxaVar;
        Uri uri = fwmVar.j;
        if (uri == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationResultHandlingService", "handleResult", 145, "LanguageModelPersonalizationResultHandlingService.java")).t("outputDirectory is null");
            fxaVar2.b(Status.c);
            return;
        }
        String str3 = fwmVar.b;
        String substring = !str3.startsWith("LMPersonalization-") ? "" : str3.substring(18);
        if (substring.isEmpty()) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationResultHandlingService", "handleResult", 152, "LanguageModelPersonalizationResultHandlingService.java")).w("Session name is in the wrong format: %s", fwmVar.b);
            fxaVar2.b(Status.c);
            return;
        }
        nfh t = mdc.e.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mdc mdcVar = (mdc) t.b;
        substring.getClass();
        mdcVar.a |= 1;
        mdcVar.b = substring;
        File d = exc.d(this.b, uri);
        File file = new File(this.b.getFilesDir(), "personalization/lm" + File.separator + substring);
        if (!this.c.h(file)) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationResultHandlingService", "handleResult", 168, "LanguageModelPersonalizationResultHandlingService.java")).w("Cannot create modelOutputDir %s", file);
            c(t, false);
            fxaVar2.b(Status.c);
            return;
        }
        String str4 = "latest_metrics.pb";
        File file2 = new File(d, str4);
        File file3 = new File(file, str4);
        if (!this.c.i(file2, file3)) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationResultHandlingService", "handleResult", 179, "LanguageModelPersonalizationResultHandlingService.java")).G("Failed moving metrics file from %s to the output directory %s", file2, file3);
            c(t, false);
            fxaVar2.b(Status.c);
            return;
        }
        try {
            llw c = exc.c(file3);
            exc.f(t, c);
            Float f = (Float) c.get("acceptance_decision");
            if (f == null) {
                ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationResultHandlingService", "checkAcceptModel", 493, "LanguageModelPersonalizationResultHandlingService.java")).w("Training metrics do not contain %s", "acceptance_decision");
            } else if (f.floatValue() > 0.0f) {
                File[] listFiles = d.listFiles();
                if (listFiles != null) {
                    int length = listFiles.length;
                    List b = b();
                    int i = 0;
                    while (i < length) {
                        File file4 = listFiles[i];
                        String name = file4.getName();
                        File[] fileArr = listFiles;
                        if (!b.contains(lwm.g(name)) || this.c.i(file4, new File(file, name))) {
                            i++;
                            listFiles = fileArr;
                        }
                    }
                    try {
                        nnq nnqVar2 = (nnq) nfm.z(nnq.i, fwmVar.c(), nfb.b());
                        try {
                            exm a2 = exm.a(nnqVar2.d);
                            try {
                                jav f2 = jav.f(nnqVar2.b);
                                int ordinal = a2.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        long currentTimeMillis = System.currentTimeMillis();
                                        File file5 = new File(file, "nrm.int8.mmap.tflite");
                                        nfh t2 = mvu.f.t();
                                        if (t2.c) {
                                            t2.cD();
                                            t2.c = false;
                                        }
                                        mvu mvuVar = (mvu) t2.b;
                                        int i2 = mvuVar.a | 1;
                                        mvuVar.a = i2;
                                        mvuVar.b = "input0";
                                        int i3 = i2 | 2;
                                        mvuVar.a = i3;
                                        mvuVar.c = "output26";
                                        int i4 = i3 | 4;
                                        mvuVar.a = i4;
                                        mvuVar.d = "<S>";
                                        mvuVar.a = i4 | 16;
                                        mvuVar.e = "</S>";
                                        mvu mvuVar2 = (mvu) t2.cz();
                                        File file6 = new File(file, "nrm.csym");
                                        File file7 = new File(file, "p13n.nrm");
                                        Optional of = (NativeLibHelper.a("neural_rescoring_model_packager_jni", false) && NeuralRescoringModelPackager.packageFilesNative(file5.getAbsolutePath().getBytes(StandardCharsets.UTF_8), mvuVar2.q(), file6.getAbsolutePath().getBytes(StandardCharsets.UTF_8), file7.getAbsolutePath().getBytes(StandardCharsets.UTF_8))) ? Optional.of(file7) : Optional.empty();
                                        if (of.isEmpty()) {
                                            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationResultHandlingService", "deployNRMModel", 355, "LanguageModelPersonalizationResultHandlingService.java")).w("Failed packaging personalized nrm files in %s", file);
                                            z2 = false;
                                        } else {
                                            ijl.b().g(new exp(new ijk(f2, ((File) of.get()).getAbsolutePath()), null, null, null, null));
                                            nfh t3 = mdd.f.t();
                                            if (t3.c) {
                                                t3.cD();
                                                t3.c = false;
                                            }
                                            mdd mddVar = (mdd) t3.b;
                                            substring.getClass();
                                            int i5 = mddVar.a | 2;
                                            mddVar.a = i5;
                                            mddVar.c = substring;
                                            String str5 = f2.n;
                                            str5.getClass();
                                            int i6 = i5 | 4;
                                            mddVar.a = i6;
                                            mddVar.d = str5;
                                            mddVar.a = i6 | 8;
                                            mddVar.e = currentTimeMillis;
                                            this.d.e(exq.PERSONALIZED_NEURAL_RESCORING_MODEL_NOTIFICATION_SENT, (mdd) t3.cz());
                                            z2 = true;
                                        }
                                    } else {
                                        if (ordinal == 2) {
                                            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationResultHandlingService", "deployModel", 284, "LanguageModelPersonalizationResultHandlingService.java")).t("Fusion use case is now handled by LmForSpeechPersonalizationResultHandlingService.");
                                        } else if (ordinal == 3) {
                                            ContentCaptureManager contentCaptureManager = (ContentCaptureManager) this.b.getSystemService(ContentCaptureManager.class);
                                            String str6 = "deployFusionModelInAiAi";
                                            if (contentCaptureManager == null) {
                                                ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationResultHandlingService", str6, 416, "LanguageModelPersonalizationResultHandlingService.java")).t("ContentCaptureManager is null");
                                            } else if (!contentCaptureManager.isContentCaptureEnabled()) {
                                                ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationResultHandlingService", str6, 420, "LanguageModelPersonalizationResultHandlingService.java")).t("ContentCaptureManager is not enabled");
                                            } else {
                                                LocusId locusId = new LocusId("Gboard_InputContext");
                                                File[] listFiles2 = file.listFiles();
                                                if (listFiles2 != null) {
                                                    int length2 = listFiles2.length;
                                                    List b2 = b();
                                                    int i7 = 0;
                                                    while (i7 < length2) {
                                                        File file8 = listFiles2[i7];
                                                        File[] fileArr2 = listFiles2;
                                                        String name2 = file8.getName();
                                                        int i8 = length2;
                                                        if (b2.contains(lwm.g(name2)) || file8.getName().equals(str4)) {
                                                            ltg ltgVar = a;
                                                            list = b2;
                                                            str = str4;
                                                            str2 = str6;
                                                            ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationResultHandlingService", str6, 439, "LanguageModelPersonalizationResultHandlingService.java")).F("Pushing file to AiAi: %s (%d)", name2, file8.length());
                                                            ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationResultHandlingService", "pushPersonalizedFileToAiAi", 448, "LanguageModelPersonalizationResultHandlingService.java")).t("pushPersonalizedFileToAiAi()");
                                                            contentCaptureManager.shareData(new DataShareRequest(locusId, "application/lm-".concat(String.valueOf(file8.getName()))), gxp.a().b, new fdf(file8, 1));
                                                        } else {
                                                            str2 = str6;
                                                            list = b2;
                                                            str = str4;
                                                        }
                                                        i7++;
                                                        listFiles2 = fileArr2;
                                                        length2 = i8;
                                                        str4 = str;
                                                        b2 = list;
                                                        str6 = str2;
                                                    }
                                                    z2 = true;
                                                }
                                            }
                                            z2 = false;
                                        }
                                        ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationResultHandlingService", "handleResult", 261, "LanguageModelPersonalizationResultHandlingService.java")).w("Failed to deploy model %s", substring);
                                        c(t, false);
                                        fxaVar.b(Status.c);
                                        return;
                                    }
                                    if (z2) {
                                        fxaVar2 = fxaVar;
                                    }
                                    ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationResultHandlingService", "handleResult", 261, "LanguageModelPersonalizationResultHandlingService.java")).w("Failed to deploy model %s", substring);
                                    c(t, false);
                                    fxaVar.b(Status.c);
                                    return;
                                }
                                mqc mqcVar = mqc.TFLITE_NWP;
                                long currentTimeMillis2 = System.currentTimeMillis();
                                ijl.b().g(new exo(new ijk(f2, file.getAbsolutePath()), null, null, null, null, null));
                                nfh t4 = mdd.f.t();
                                String name3 = mqcVar.name();
                                if (t4.c) {
                                    t4.cD();
                                    t4.c = false;
                                }
                                mdd mddVar2 = (mdd) t4.b;
                                name3.getClass();
                                int i9 = mddVar2.a | 1;
                                mddVar2.a = i9;
                                mddVar2.b = name3;
                                substring.getClass();
                                int i10 = 2 | i9;
                                mddVar2.a = i10;
                                mddVar2.c = substring;
                                String str7 = f2.n;
                                str7.getClass();
                                int i11 = i10 | 4;
                                mddVar2.a = i11;
                                mddVar2.d = str7;
                                mddVar2.a = i11 | 8;
                                mddVar2.e = currentTimeMillis2;
                                this.d.e(exq.PERSONALIZED_NWP_NOTIFICATION_SENT, (mdd) t4.cz());
                                ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationResultHandlingService", "handleResult", 267, "LanguageModelPersonalizationResultHandlingService.java")).w("Accepted and deployed model %s", substring);
                                c(t, true);
                                fxaVar2.b(Status.a);
                                return;
                            } catch (IllegalArgumentException e) {
                                ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationResultHandlingService", "handleResult", 252, "LanguageModelPersonalizationResultHandlingService.java")).w("Cannot parse model locale %s.", nnqVar.b);
                                c(t, false);
                                fxaVar2.b(Status.c);
                                return;
                            }
                        } catch (IllegalArgumentException e2) {
                            ((ltd) ((ltd) ((ltd) a.d()).i(e2)).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationResultHandlingService", "handleResult", 241, "LanguageModelPersonalizationResultHandlingService.java")).w("Cannot parse model deployment type %s.", nnqVar2.d);
                            c(t, false);
                            fxaVar2.b(Status.c);
                            return;
                        }
                    } catch (ngd e3) {
                        ((ltd) ((ltd) ((ltd) a.d()).i(e3)).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationResultHandlingService", "handleResult", (char) 231, "LanguageModelPersonalizationResultHandlingService.java")).t("PersonalizationContextData proto parsing error.");
                        c(t, false);
                        fxaVar2.b(Status.c);
                        return;
                    }
                }
                ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationResultHandlingService", "handleResult", 216, "LanguageModelPersonalizationResultHandlingService.java")).G("Failed moving personalized files from %s to the model output directory %s", d, file);
                c(t, false);
                fxaVar2.b(Status.c);
                return;
            }
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationResultHandlingService", "handleResult", 204, "LanguageModelPersonalizationResultHandlingService.java")).t("Reject the trained model.");
            c(t, false);
            fxaVar2.b(Status.a);
        } catch (IOException e4) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e4)).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationResultHandlingService", "handleResult", 192, "LanguageModelPersonalizationResultHandlingService.java")).w("Failed to read local compute metrics file: %s", file3.getAbsolutePath());
            c(t, false);
            fxaVar2.b(Status.c);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationResultHandlingService", "onCreate", 107, "LanguageModelPersonalizationResultHandlingService.java")).t("Initializing.");
        super.onCreate();
        if (this.b == null) {
            this.b = getApplicationContext();
        }
        if (this.c == null) {
            this.c = jan.b;
        }
        if (this.d == null) {
            this.d = ieh.j();
        }
        if (this.e == null) {
            this.e = ino.K(this.b, null);
        }
    }
}
