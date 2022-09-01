package defpackage;

import android.util.Log;
import com.google.android.apps.inputmethod.libs.framework.core.LauncherActivity;
import com.google.android.apps.inputmethod.libs.latin5.PeriodicStatsRunner;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: doq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class doq implements gek {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ doq(int i) {
        this.b = i;
        this.a = "BrellaLstmTrainingClientFederation";
    }

    public /* synthetic */ doq(LauncherActivity launcherActivity, int i) {
        this.b = i;
        this.a = launcherActivity;
    }

    public /* synthetic */ doq(PeriodicStatsRunner periodicStatsRunner, int i) {
        this.b = i;
        this.a = periodicStatsRunner;
    }

    public /* synthetic */ doq(dqn dqnVar, int i) {
        this.b = i;
        this.a = dqnVar;
    }

    public /* synthetic */ doq(emh emhVar, int i) {
        this.b = i;
        this.a = emhVar;
    }

    public /* synthetic */ doq(ewt ewtVar, int i) {
        this.b = i;
        this.a = ewtVar;
    }

    public /* synthetic */ doq(exn exnVar, int i) {
        this.b = i;
        this.a = exnVar;
    }

    public /* synthetic */ doq(exv exvVar, int i) {
        this.b = i;
        this.a = exvVar;
    }

    public /* synthetic */ doq(idz idzVar, int i) {
        this.b = i;
        this.a = idzVar;
    }

    public /* synthetic */ doq(String str, int i) {
        this.b = i;
        this.a = str;
    }

    public /* synthetic */ doq(rj rjVar, int i) {
        this.b = i;
        this.a = rjVar;
    }

    @Override // defpackage.gek
    public final void d(Exception exc) {
        switch (this.b) {
            case 0:
                Object obj = this.a;
                ((ltd) ((ltd) ((ltd) PeriodicStatsRunner.a.c()).i(exc)).k("com/google/android/apps/inputmethod/libs/latin5/PeriodicStatsRunner", "lambda$call$1", (char) 236, "PeriodicStatsRunner.java")).t("ULP getLanguagePreferences failed.");
                PeriodicStatsRunner periodicStatsRunner = (PeriodicStatsRunner) obj;
                periodicStatsRunner.c(periodicStatsRunner.d);
                return;
            case 1:
                Object obj2 = this.a;
                ((ltd) ((ltd) ((ltd) LauncherActivity.a.b()).i(exc)).k("com/google/android/apps/inputmethod/libs/framework/core/LauncherActivity", "lambda$onResume$1", 'B', "LauncherActivity.java")).t("Failed to get dynamic link");
                ((LauncherActivity) obj2).a(false);
                return;
            case 2:
                ((ltd) ((ltd) ((ltd) dpq.a.c()).i(exc)).k("com/google/android/apps/inputmethod/libs/lstm/LstmTrainer", "lambda$cancelBrellaTraining$5", 171, "LstmTrainer.java")).w("Failed to cancel in-app training for %s.", this.a);
                return;
            case 3:
                ((ltd) ((ltd) ((ltd) dpq.a.c()).i(exc)).k("com/google/android/apps/inputmethod/libs/lstm/LstmTrainer", "lambda$scheduleBrellaTraining$3", 159, "LstmTrainer.java")).w("Failed to schedule in-app training for %s.", this.a);
                return;
            case 4:
                Object obj3 = this.a;
                ((ltd) ((ltd) ((ltd) dqn.a.b()).i(exc)).k("com/google/android/apps/inputmethod/libs/migration/MigrationModule", "lambda$getPendingDynamicLinkAndMaybeShowDialog$1", 'Y', "MigrationModule.java")).t("Failed to get dynamic link");
                ((dqn) obj3).d();
                return;
            case 5:
                Object obj4 = this.a;
                ((ltd) ((ltd) ((ltd) emh.a.b()).i(exc)).k("com/google/android/apps/inputmethod/libs/sharing/SharingLinkReceiveModule", "lambda$getPendingDynamicLinkAndMaybeShowDialog$1", 'e', "SharingLinkReceiveModule.java")).t("Failed to get dynamic link");
                ((emh) obj4).e();
                return;
            case 6:
                Object obj5 = this.a;
                ((ltd) ((ltd) ((ltd) ewt.a.c()).i(exc)).k("com/google/android/apps/inputmethod/libs/trainingcache/federation/speech/SpeechFederationTrainerManager", "lambda$getInAppTrainerTask$6", (char) 451, "SpeechFederationTrainerManager.java")).t("Failed to get in-app trainer for speech federation.");
                ((ewt) obj5).d(ewv.CANNOT_CREATE_TRAINER);
                return;
            case 7:
                ((ltd) ((ltd) ((ltd) exg.a.c()).i(exc)).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationTrainerManager", "lambda$registerTrainer$2", 183, "LanguageModelPersonalizationTrainerManager.java")).w("Failed to schedule language model personalization training for %s.", ((exn) this.a).a);
                return;
            case 8:
                Object obj6 = this.a;
                ((ltd) ((ltd) ((ltd) exv.a.c()).i(exc)).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/speech/SpeechPersonalizationTrainerManager", "lambda$getInAppTrainerTask$3", (char) 536, "SpeechPersonalizationTrainerManager.java")).t("Failed to get in-app trainer for speech personalization.");
                ((exv) obj6).d(exx.CANNOT_CREATE_TRAINER);
                return;
            case 9:
                fxh.a.k(exc, "Initial commit for '%s' failed", this.a);
                return;
            case 10:
                fxh.a.k(exc, "Registration for '%s' failed", this.a);
                return;
            case 11:
                fxh.a.k(exc, "Update commit for '%s' failed", this.a);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj7 = this.a;
                boolean z = gkb.a;
                Log.w("CBVerifier", String.format("Committing phenotypeflags for %s failed. %s", obj7, exc));
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj8 = this.a;
                boolean z2 = gkb.a;
                Log.w("CBVerifier", String.format("Fail to register phenotypeflags for %s. %s", obj8, exc));
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj9 = this.a;
                ltg ltgVar = hrx.a;
                ((rj) obj9).c(llp.q());
                return;
            default:
                ((idz) this.a).h.set(Boolean.FALSE);
                ((ltd) ((ltd) ((ltd) idz.a.c()).i(exc)).k("com/google/android/libraries/inputmethod/metrics/clearcut/BaseClearcutAdapter", "lambda$queryAndUpdateUserCheckboxOptIn$2", (char) 248, "BaseClearcutAdapter.java")).t("Failed to check checkbox status.");
                return;
        }
    }
}
