package com.google.android.apps.inputmethod.libs.trainingcache.personalization.speech;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import j$.time.Instant;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SpeechPersonalizationResultHandlingService extends fwp {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/trainingcache/personalization/speech/SpeechPersonalizationResultHandlingService");
    private Context b;
    private exv c;
    private jan d;
    private idk e;
    private exz f;
    private mhp g;
    private ewj h;

    private final void b(nfh nfhVar, boolean z) {
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mdc mdcVar = (mdc) nfhVar.b;
        mdc mdcVar2 = mdc.e;
        mdcVar.a |= 2;
        mdcVar.c = z;
        this.e.e(exw.b, nfhVar.cz());
    }

    @Override // defpackage.fwp
    public final void a(fwm fwmVar, boolean z, fxa fxaVar) {
        File file;
        boolean z2;
        Uri uri = fwmVar.j;
        if (uri == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/speech/SpeechPersonalizationResultHandlingService", "handleResult", 155, "SpeechPersonalizationResultHandlingService.java")).t("outputDirectory is null");
            fxaVar.b(Status.c);
        } else if (fwmVar.c() == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/speech/SpeechPersonalizationResultHandlingService", "handleResult", 162, "SpeechPersonalizationResultHandlingService.java")).t("The contextData field is not set.");
            fxaVar.b(Status.c);
        } else {
            try {
                nnq nnqVar = (nnq) nfm.z(nnq.i, fwmVar.c(), nfb.b());
                try {
                    jav f = jav.f(nnqVar.b);
                    nfh t = mdc.e.t();
                    String str = fwmVar.b;
                    String substring = !str.startsWith("SpeechPersonalization-") ? "" : str.substring(22);
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    mdc mdcVar = (mdc) t.b;
                    substring.getClass();
                    mdcVar.a |= 1;
                    mdcVar.b = substring;
                    ltg ltgVar = a;
                    ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/speech/SpeechPersonalizationResultHandlingService", "handleResult", 191, "SpeechPersonalizationResultHandlingService.java")).J("Handling result of local computation task %s (model name: %s, locale: %s)", str, substring, f);
                    File d = exc.d(this.b, uri);
                    File file2 = new File(d, "latest_metrics.pb");
                    int ah = ndb.ah(nnqVar.e);
                    if (ah == 0) {
                        ah = 1;
                    }
                    int ag = ndb.ag(nnqVar.f);
                    if (ag == 0) {
                        ag = 1;
                    }
                    nfh b = gim.b(ah, ag, new File(nnqVar.g), new File(nnqVar.h), file2, z, Instant.now());
                    try {
                        llw c = exc.c(file2);
                        exc.f(t, c);
                        Float f2 = (Float) c.get("acceptance_decision");
                        if (f2 == null || f2.floatValue() > 0.0f) {
                            File b2 = exr.b(this.b, f);
                            if (!this.d.h(b2)) {
                                ((ltd) ((ltd) ltgVar.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/speech/SpeechPersonalizationResultHandlingService", "handleResult", 252, "SpeechPersonalizationResultHandlingService.java")).w("Cannot create directory for accepted model %s", b2);
                                b(t, false);
                                ewj ewjVar = this.h;
                                evi a2 = evj.a();
                                a2.d(z);
                                a2.b(false);
                                a2.c(false);
                                ewjVar.b(b, a2.a());
                                fxaVar.b(Status.c);
                                return;
                            }
                            if (str.endsWith("-precompute")) {
                                file = d;
                                this.f.c(file, Arrays.asList(".cache.features.p13n.train", ".cache.features.p13n.test"), "personalization");
                                haz a3 = evg.a();
                                a3.e(nnqVar.c);
                                evg d2 = a3.d();
                                exv exvVar = this.c;
                                kcu.U(kcu.O(new cak(exvVar, f, d2, 9), exvVar.c), new cbx(12), exvVar.c);
                                z2 = false;
                            } else {
                                file = d;
                                z2 = true;
                            }
                            ArrayList arrayList = new ArrayList();
                            File[] listFiles = file.listFiles(exs.a);
                            if (listFiles == null) {
                                ((ltd) ((ltd) ltgVar.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/speech/SpeechPersonalizationResultHandlingService", "movePersonalizedFilesToOutputDir", 345, "SpeechPersonalizationResultHandlingService.java")).w("Failed to list resumption point files in the Brella outputs directory: %s.", file);
                            } else {
                                Collections.addAll(arrayList, listFiles);
                                File file3 = new File(file, "latest_metrics.pb");
                                if (!file3.exists()) {
                                    ((ltd) ((ltd) ltgVar.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/speech/SpeechPersonalizationResultHandlingService", "movePersonalizedFilesToOutputDir", 355, "SpeechPersonalizationResultHandlingService.java")).w("Failed to find metrics file in %s.", file);
                                }
                                arrayList.add(file3);
                                if (z2) {
                                    File[] listFiles2 = file.listFiles(exs.c);
                                    if (listFiles2 == null) {
                                        ((ltd) ((ltd) ltgVar.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/speech/SpeechPersonalizationResultHandlingService", "movePersonalizedFilesToOutputDir", 365, "SpeechPersonalizationResultHandlingService.java")).w("Failed to list personalized model files in the Brella outputs directory: %s.", file);
                                    } else if (listFiles2.length == 0) {
                                        ((ltd) ((ltd) ltgVar.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/speech/SpeechPersonalizationResultHandlingService", "movePersonalizedFilesToOutputDir", 371, "SpeechPersonalizationResultHandlingService.java")).w("No personalized model files found in the Brella outputs directory: %s.", file);
                                    } else {
                                        Collections.addAll(arrayList, listFiles2);
                                    }
                                }
                                int size = arrayList.size();
                                int i = 0;
                                while (i < size) {
                                    File file4 = (File) arrayList.get(i);
                                    file4.getName();
                                    i++;
                                    if (!this.d.i(file4, new File(b2, file4.getName()))) {
                                    }
                                }
                                b(t, true);
                                ewj ewjVar2 = this.h;
                                evi a4 = evj.a();
                                a4.d(z);
                                a4.b(true);
                                a4.c(true);
                                ewjVar2.b(b, a4.a());
                                fxaVar.b(Status.a);
                                return;
                            }
                            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/speech/SpeechPersonalizationResultHandlingService", "handleResult", 287, "SpeechPersonalizationResultHandlingService.java")).G("Failed moving personalized files from %s to the accepted model directory %s", file, b2);
                            b(t, false);
                            ewj ewjVar3 = this.h;
                            evi a5 = evj.a();
                            a5.d(z);
                            a5.b(false);
                            a5.c(false);
                            ewjVar3.b(b, a5.a());
                            fxaVar.b(Status.c);
                            return;
                        }
                        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/speech/SpeechPersonalizationResultHandlingService", "handleResult", 231, "SpeechPersonalizationResultHandlingService.java")).t("Reject the trained model.");
                        b(t, false);
                        ewj ewjVar4 = this.h;
                        evi a6 = evj.a();
                        a6.d(z);
                        a6.b(false);
                        a6.c(false);
                        ewjVar4.b(b, a6.a());
                        fxaVar.b(Status.a);
                    } catch (IOException e) {
                        ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/speech/SpeechPersonalizationResultHandlingService", "handleResult", 209, "SpeechPersonalizationResultHandlingService.java")).w("Failed to read local compute metrics file: %s", file2.getAbsolutePath());
                        b(t, false);
                        ewj ewjVar5 = this.h;
                        evi a7 = evj.a();
                        a7.d(z);
                        a7.b(false);
                        a7.c(false);
                        ewjVar5.b(b, a7.a());
                        fxaVar.b(Status.c);
                    }
                } catch (IllegalArgumentException e2) {
                    ((ltd) ((ltd) ((ltd) a.d()).i(e2)).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/speech/SpeechPersonalizationResultHandlingService", "handleResult", (char) 181, "SpeechPersonalizationResultHandlingService.java")).t("Cannot parse model locale.");
                    fxaVar.b(Status.c);
                }
            } catch (ngd e3) {
                ((ltd) ((ltd) ((ltd) a.d()).i(e3)).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/speech/SpeechPersonalizationResultHandlingService", "handleResult", (char) 172, "SpeechPersonalizationResultHandlingService.java")).t("PersonalizationContextData proto parsing error.");
                fxaVar.b(Status.c);
            }
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/speech/SpeechPersonalizationResultHandlingService", "onCreate", 92, "SpeechPersonalizationResultHandlingService.java")).t("Initializing.");
        super.onCreate();
        if (this.b == null) {
            this.b = getApplicationContext();
        }
        if (this.c == null) {
            this.c = exv.a(this.b);
        }
        if (this.d == null) {
            this.d = jan.b;
        }
        if (this.e == null) {
            this.e = ieh.j();
        }
        if (this.f == null) {
            this.f = exz.a(this.b);
        }
        if (this.g == null) {
            this.g = mho.a;
        }
        if (this.h == null) {
            this.h = new ewj(this.b);
        }
    }
}
