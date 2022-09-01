package com.google.android.apps.inputmethod.libs.trainingcache.federation.speech;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SpeechFederationResultHandlingService extends fwp {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/trainingcache/federation/speech/SpeechFederationResultHandlingService");
    private Context b;
    private exz c;
    private ewt d;

    @Override // defpackage.fwp
    public final void a(fwm fwmVar, boolean z, fxa fxaVar) {
        Uri uri = fwmVar.j;
        if (uri == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/federation/speech/SpeechFederationResultHandlingService", "handleResult", 79, "SpeechFederationResultHandlingService.java")).t("outputDirectory is null");
            fxaVar.b(Status.c);
            return;
        }
        try {
            nnl nnlVar = (nnl) nfm.z(nnl.e, fwmVar.c(), nfb.b());
            File d = ewn.d(this.b, uri);
            if (fwmVar.b.endsWith("-FeaturePrecomputation")) {
                this.c.c(d, Arrays.asList(".asr"), "federation");
                haz a2 = evg.a();
                a2.e(nnlVar.b);
                evg d2 = a2.d();
                ewt ewtVar = this.d;
                kcu.U(kcu.O(new eid(ewtVar, d2, nnlVar.c, nnlVar.d, 3), ewtVar.d), new cbx(8), ewtVar.d);
            }
            fxaVar.b(Status.a);
        } catch (ngd e) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/trainingcache/federation/speech/SpeechFederationResultHandlingService", "handleResult", 'Z', "SpeechFederationResultHandlingService.java")).t("FederationContextData proto parsing error.");
            fxaVar.b(Status.c);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/federation/speech/SpeechFederationResultHandlingService", "onCreate", 50, "SpeechFederationResultHandlingService.java")).t("Initializing.");
        super.onCreate();
        if (this.b == null) {
            this.b = getApplicationContext();
        }
        if (this.c == null) {
            this.c = exz.a(this.b);
        }
        if (this.d == null) {
            this.d = ewt.a(this.b);
        }
    }
}
