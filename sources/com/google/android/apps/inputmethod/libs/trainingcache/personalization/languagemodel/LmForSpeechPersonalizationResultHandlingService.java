package com.google.android.apps.inputmethod.libs.trainingcache.personalization.languagemodel;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import j$.time.Instant;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LmForSpeechPersonalizationResultHandlingService extends fwp {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationResultHandlingService");
    private Context b;
    private jan c;
    private idk d;
    private mhp e;
    private ewj f;

    private final boolean b(File file, File file2) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        List k = lfy.c(',').k((String) exd.c.c());
        for (File file3 : listFiles) {
            String name = file3.getName();
            if (k.contains(lwm.g(name))) {
                if (!this.c.i(file3, new File(file2, name))) {
                    return false;
                }
            }
        }
        return true;
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
        Uri uri = fwmVar.j;
        if (uri == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationResultHandlingService", "handleResult", 120, "LmForSpeechPersonalizationResultHandlingService.java")).t("outputDirectory is null");
            fxaVar.b(Status.c);
            return;
        }
        String str = fwmVar.b;
        String substring = !str.startsWith("LmForSpeechPersonalization-") ? "" : str.substring(27);
        if (substring.isEmpty()) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationResultHandlingService", "handleResult", 127, "LmForSpeechPersonalizationResultHandlingService.java")).w("Session name is in the wrong format: %s", fwmVar.b);
            fxaVar.b(Status.c);
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
        try {
            nnq nnqVar = (nnq) nfm.z(nnq.i, fwmVar.c(), nfb.b());
            try {
                exm a2 = exm.a(nnqVar.d);
                if (a2 != exm.FUSION) {
                    ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationResultHandlingService", "handleResult", 163, "LmForSpeechPersonalizationResultHandlingService.java")).w("Unexpected deployment type, expected FUSION. Actual: %s", a2);
                    fxaVar.b(Status.c);
                    return;
                }
                File d = exc.d(this.b, uri);
                File file = new File(this.b.getFilesDir(), "personalization/lm" + File.separator + substring);
                if (!this.c.h(file)) {
                    ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationResultHandlingService", "handleResult", 176, "LmForSpeechPersonalizationResultHandlingService.java")).w("Cannot create modelOutputDir %s", file);
                    c(t, false);
                    fxaVar.b(Status.c);
                    return;
                }
                File file2 = new File(d, "latest_metrics.pb");
                File file3 = new File(file, "latest_metrics.pb");
                int ah = ndb.ah(nnqVar.e);
                if (ah == 0) {
                    ah = 1;
                }
                int ag = ndb.ag(nnqVar.f);
                if (ag == 0) {
                    ag = 1;
                }
                nfh b = gim.b(ah, ag, new File(nnqVar.g), new File(nnqVar.h), file2, z, Instant.now());
                if (!this.c.i(file2, file3)) {
                    ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationResultHandlingService", "handleResult", 189, "LmForSpeechPersonalizationResultHandlingService.java")).G("Failed moving metrics file from %s to the output directory %s", file2, file3);
                    c(t, false);
                    ewj ewjVar = this.f;
                    evi a3 = evj.a();
                    a3.d(z);
                    a3.b(false);
                    a3.c(false);
                    ewjVar.b(b, a3.a());
                    fxaVar.b(Status.c);
                    return;
                }
                try {
                    llw c = exc.c(file3);
                    exc.f(t, c);
                    Float f = (Float) c.get("acceptance_decision");
                    if (f == null) {
                        ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationResultHandlingService", "checkAcceptModel", 404, "LmForSpeechPersonalizationResultHandlingService.java")).w("Training metrics do not contain %s", "acceptance_decision");
                    } else if (f.floatValue() > 0.0f) {
                        if (b(d, file)) {
                            try {
                                File e = exr.e(this.b, jav.f(nnqVar.b));
                                if (!this.c.h(e)) {
                                    ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationResultHandlingService", "deployFusionModel", 359, "LmForSpeechPersonalizationResultHandlingService.java")).w("Cannot create LM fine tuning output directory %s", e);
                                } else if (b(file, e)) {
                                    File file4 = new File(file, "latest_metrics.pb");
                                    if (!file4.exists()) {
                                        ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationResultHandlingService", "moveMetricFileToOutputDir", 385, "LmForSpeechPersonalizationResultHandlingService.java")).w("Failed to find metrics file in %s.", file);
                                    } else {
                                        File file5 = new File(e, "latest_metrics.pb");
                                        if (!this.c.i(file4, file5)) {
                                            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationResultHandlingService", "moveMetricFileToOutputDir", 392, "LmForSpeechPersonalizationResultHandlingService.java")).G("Failed moving metrics file from %s to the output directory %s", file4, file5);
                                        } else {
                                            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationResultHandlingService", "handleResult", 294, "LmForSpeechPersonalizationResultHandlingService.java")).w("Accepted and deployed model %s", substring);
                                            c(t, true);
                                            ewj ewjVar2 = this.f;
                                            evi a4 = evj.a();
                                            a4.d(z);
                                            a4.b(true);
                                            a4.c(true);
                                            ewjVar2.b(b, a4.a());
                                            fxaVar.b(Status.a);
                                            return;
                                        }
                                    }
                                    ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationResultHandlingService", "deployFusionModel", 371, "LmForSpeechPersonalizationResultHandlingService.java")).w("Cannot move metrics file to speech personalization output directory %s", e);
                                } else {
                                    ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationResultHandlingService", "deployFusionModel", 365, "LmForSpeechPersonalizationResultHandlingService.java")).w("Cannot move fusion model to LM fine tuning output directory %s", e);
                                }
                                ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationResultHandlingService", "handleResult", 281, "LmForSpeechPersonalizationResultHandlingService.java")).w("Failed to deploy model %s", substring);
                                c(t, false);
                                ewj ewjVar3 = this.f;
                                evi a5 = evj.a();
                                a5.d(z);
                                a5.b(false);
                                a5.c(false);
                                ewjVar3.b(b, a5.a());
                                fxaVar.b(Status.c);
                                return;
                            } catch (IllegalArgumentException e2) {
                                ((ltd) ((ltd) ((ltd) a.d()).i(e2)).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationResultHandlingService", "handleResult", 265, "LmForSpeechPersonalizationResultHandlingService.java")).w("Cannot parse model locale %s.", nnqVar.b);
                                c(t, false);
                                ewj ewjVar4 = this.f;
                                evi a6 = evj.a();
                                a6.d(z);
                                a6.b(false);
                                a6.c(false);
                                ewjVar4.b(b, a6.a());
                                fxaVar.b(Status.c);
                                return;
                            }
                        }
                        ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationResultHandlingService", "handleResult", 246, "LmForSpeechPersonalizationResultHandlingService.java")).G("Failed moving personalized files from %s to the model output directory %s", d, file);
                        c(t, false);
                        ewj ewjVar5 = this.f;
                        evi a7 = evj.a();
                        a7.d(z);
                        a7.b(false);
                        a7.c(false);
                        ewjVar5.b(b, a7.a());
                        fxaVar.b(Status.c);
                        return;
                    }
                    ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationResultHandlingService", "handleResult", 228, "LmForSpeechPersonalizationResultHandlingService.java")).t("Reject the trained model.");
                    c(t, false);
                    ewj ewjVar6 = this.f;
                    evi a8 = evj.a();
                    a8.d(z);
                    a8.b(false);
                    a8.c(false);
                    ewjVar6.b(b, a8.a());
                    fxaVar.b(Status.a);
                } catch (IOException e3) {
                    ((ltd) ((ltd) ((ltd) a.d()).i(e3)).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationResultHandlingService", "handleResult", 209, "LmForSpeechPersonalizationResultHandlingService.java")).w("Failed to read local compute metrics file: %s", file3.getAbsolutePath());
                    c(t, false);
                    ewj ewjVar7 = this.f;
                    evi a9 = evj.a();
                    a9.d(z);
                    a9.b(false);
                    a9.c(false);
                    ewjVar7.b(b, a9.a());
                    fxaVar.b(Status.c);
                }
            } catch (IllegalArgumentException e4) {
                ((ltd) ((ltd) ((ltd) a.d()).i(e4)).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationResultHandlingService", "handleResult", 153, "LmForSpeechPersonalizationResultHandlingService.java")).w("Cannot parse model deployment type %s.", nnqVar.d);
                c(t, false);
                fxaVar.b(Status.c);
            }
        } catch (ngd e5) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e5)).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationResultHandlingService", "handleResult", (char) 143, "LmForSpeechPersonalizationResultHandlingService.java")).t("PersonalizationContextData proto parsing error.");
            c(t, false);
            fxaVar.b(Status.c);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationResultHandlingService", "onCreate", 80, "LmForSpeechPersonalizationResultHandlingService.java")).t("Initializing.");
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
            this.e = mho.a;
        }
        if (this.f == null) {
            this.f = new ewj(this.b);
        }
    }
}
