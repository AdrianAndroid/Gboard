package defpackage;

import j$.util.Optional;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: cbx  reason: default package */
/* loaded from: classes.dex */
public final class cbx implements mka {
    private final /* synthetic */ int a;

    public cbx(int i) {
        this.a = i;
    }

    @Override // defpackage.mka
    public final void a(Throwable th) {
        switch (this.a) {
            case 0:
                ((ltd) ((ltd) ((ltd) cby.a.b()).i(th)).k("com/google/android/apps/inputmethod/libs/delight5/LmManager$1", "onFailure", 'P', "LmManager.java")).t("Bundled delight sync failed");
                return;
            case 1:
                ((ltd) ((ltd) ((ltd) brw.a.c()).i(th)).k("com/google/android/apps/inputmethod/latin/preference/dictionary/LatinSyncDictionarySettings$2", "onFailure", (char) 178, "LatinSyncDictionarySettings.java")).t("Failed to clear user dict cross profile");
                return;
            case 2:
                ((ltd) ((ltd) ((ltd) cdv.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/delight5/langid/LanguageIdentifierWrapper$4", "onFailure", (char) 270, "LanguageIdentifierWrapper.java")).t("asyncDetectLanguage(): Error while detecting language.");
                return;
            case 3:
                ((ltd) ((ltd) ((ltd) czt.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/expression/tenoranimation/DynamicArtSuperpacksManager$1", "onFailure", (char) 176, "DynamicArtSuperpacksManager.java")).t("Failed to load dynamic art pack");
                return;
            case 4:
                return;
            case 5:
                ((ltd) ((ltd) ((ltd) dlv.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/keyhound/InputActionMetricsProcessor$2", "onFailure", (char) 199, "InputActionMetricsProcessor.java")).t("Failed to handle private command.");
                return;
            case 6:
                ((ltd) ((ltd) ((ltd) ewb.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/trainingcache/ekho/EkhoWriterController$3", "onFailure", 'q', "EkhoWriterController.java")).s();
                return;
            case 7:
                ((ltd) ((ltd) ((ltd) ewb.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/trainingcache/ekho/EkhoWriterController$4", "onFailure", (char) 230, "EkhoWriterController.java")).t("clear() failed.");
                return;
            case 8:
                ((ltd) ((ltd) ((ltd) ewt.a.d()).i(th)).k("com/google/android/apps/inputmethod/libs/trainingcache/federation/speech/SpeechFederationTrainerManager$1", "onFailure", (char) 370, "SpeechFederationTrainerManager.java")).t("Error while scheduling federated training job");
                return;
            case 9:
                ((ltd) ((ltd) ((ltd) exa.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/trainingcache/maintenance/PersonalizedModelFileCleaner$2", "onFailure", (char) 194, "PersonalizedModelFileCleaner.java")).t("Cleanup unsuccessful.");
                return;
            case 10:
                ((ltd) ((ltd) ((ltd) exa.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/trainingcache/maintenance/PersonalizedModelFileCleaner$3", "onFailure", (char) 225, "PersonalizedModelFileCleaner.java")).t("Cleanup unsuccessful.");
                return;
            case 11:
                ((ltd) ((ltd) ((ltd) exa.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/trainingcache/maintenance/PersonalizedModelFileCleaner$4", "onFailure", (char) 261, "PersonalizedModelFileCleaner.java")).t("Cleanup unsuccessful.");
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((ltd) ((ltd) ((ltd) exv.a.d()).i(th)).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/speech/SpeechPersonalizationTrainerManager$1", "onFailure", (char) 407, "SpeechPersonalizationTrainerManager.java")).t("Error while scheduling training-only job");
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((ltd) ((ltd) ((ltd) exz.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/trainingcache/precomputedfeatures/speech/SpeechPrecomputedFeatureManager$1$1", "onFailure", 'X', "SpeechPrecomputedFeatureManager.java")).t("Cleanup failed.");
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return;
            case 15:
                ijf.k(gto.a);
                ((ltd) ((ltd) ((ltd) gtq.a.d()).i(th)).k("com/google/android/libraries/inputmethod/accounts/checker/ManagedDeviceCheckModule$1", "onFailure", 'I', "ManagedDeviceCheckModule.java")).t("Failed to check the managed account presence");
                return;
            case 16:
                ((ltd) ((ltd) ((ltd) hhu.a.c()).i(th)).k("com/google/android/libraries/inputmethod/flag/FlagManager$1", "onFailure", (char) 583, "FlagManager.java")).t("Failed to persist flags to disk.");
                return;
            case 17:
                ((ltd) ((ltd) ((ltd) ifn.a.c()).i(th)).k("com/google/android/libraries/inputmethod/metricstracker/TypingMetricsTracker$1", "onFailure", (char) 482, "TypingMetricsTracker.java")).t("Failed to track health metrics.");
                return;
            case 18:
                ((ltd) ((ltd) ((ltd) itp.a.c()).i(th)).k("com/google/android/libraries/inputmethod/trainingcache/consumer/materializermanager/MaterializerIterator$2", "onFailure", 'k', "MaterializerIterator.java")).t("Failed to call request for examples.");
                return;
            case 19:
                ((ltd) ((ltd) ((ltd) its.a.c()).i(th)).k("com/google/android/libraries/inputmethod/trainingcache/consumer/materializermanager/MaterializerManager$1", "onFailure", (char) 154, "MaterializerManager.java")).t("Failed to close storage adapter");
                return;
            default:
                ((ltd) ((ltd) ((ltd) itx.a.c()).i(th)).k("com/google/android/libraries/inputmethod/trainingcache/guarder/DeviceIntegrityMonitor$1$1", "onFailure", 'o', "DeviceIntegrityMonitor.java")).t("Failed to create storage adapter.");
                return;
        }
    }

    @Override // defpackage.mka
    public final /* synthetic */ void b(Object obj) {
        boolean j;
        switch (this.a) {
            case 0:
                jre jreVar = (jre) obj;
                ((ltd) ((ltd) cby.a.b()).k("com/google/android/apps/inputmethod/libs/delight5/LmManager$1", "onSuccess", 75, "LmManager.java")).t("Bundled delight sync success");
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                return;
            case 2:
                Void r6 = (Void) obj;
                return;
            case 3:
                ltg ltgVar = czt.a;
                ((czo) obj).a();
                return;
            case 4:
                Boolean bool2 = (Boolean) obj;
                return;
            case 5:
                Void r62 = (Void) obj;
                return;
            case 6:
                Void r63 = (Void) obj;
                return;
            case 7:
                Void r64 = (Void) obj;
                ((ltd) ((ltd) ewb.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/ekho/EkhoWriterController$4", "onSuccess", 225, "EkhoWriterController.java")).t("clear() done.");
                return;
            case 8:
                ((Boolean) obj).booleanValue();
                return;
            case 9:
                Boolean bool3 = (Boolean) obj;
                if (bool3 == null) {
                    return;
                }
                if (bool3.booleanValue()) {
                    ((ltd) ((ltd) exa.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/maintenance/PersonalizedModelFileCleaner$2", "onSuccess", 185, "PersonalizedModelFileCleaner.java")).t("Cleanup successful.");
                    return;
                } else {
                    ((ltd) ((ltd) exa.a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/maintenance/PersonalizedModelFileCleaner$2", "onSuccess", 187, "PersonalizedModelFileCleaner.java")).t("Cleanup unsuccessful.");
                    return;
                }
            case 10:
                Boolean bool4 = (Boolean) obj;
                if (bool4 == null) {
                    return;
                }
                if (bool4.booleanValue()) {
                    ((ltd) ((ltd) exa.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/maintenance/PersonalizedModelFileCleaner$3", "onSuccess", 216, "PersonalizedModelFileCleaner.java")).t("Cleanup successful.");
                    return;
                } else {
                    ((ltd) ((ltd) exa.a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/maintenance/PersonalizedModelFileCleaner$3", "onSuccess", 218, "PersonalizedModelFileCleaner.java")).t("Cleanup unsuccessful.");
                    return;
                }
            case 11:
                if (((Boolean) Optional.ofNullable((Boolean) obj).orElse(false)).booleanValue()) {
                    ((ltd) ((ltd) exa.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/maintenance/PersonalizedModelFileCleaner$4", "onSuccess", 253, "PersonalizedModelFileCleaner.java")).t("Cleanup successful.");
                    return;
                } else {
                    ((ltd) ((ltd) exa.a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/maintenance/PersonalizedModelFileCleaner$4", "onSuccess", 255, "PersonalizedModelFileCleaner.java")).t("Cleanup unsuccessful.");
                    return;
                }
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                if (((Boolean) obj).booleanValue()) {
                    ltg ltgVar2 = exv.a;
                    return;
                } else {
                    ltg ltgVar3 = exv.a;
                    return;
                }
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Void r65 = (Void) obj;
                ((ltd) ((ltd) exz.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/precomputedfeatures/speech/SpeechPrecomputedFeatureManager$1$1", "onSuccess", 83, "SpeechPrecomputedFeatureManager.java")).t("Cleanup completed.");
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((blj) obj).b();
                return;
            case 15:
                Boolean bool5 = (Boolean) obj;
                if (bool5.booleanValue()) {
                    j = ijf.k(gto.a);
                } else {
                    j = ijf.j(gto.a);
                }
                if (!j) {
                    return;
                }
                ((ltd) ((ltd) gtq.a.b()).k("com/google/android/libraries/inputmethod/accounts/checker/ManagedDeviceCheckModule$1", "onSuccess", 64, "ManagedDeviceCheckModule.java")).w("notifyUnmanagedDeviceStatusChanged(): unmanagedDevice=%b", bool5);
                return;
            case 16:
                idn idnVar = (idn) obj;
                if (idnVar == null) {
                    return;
                }
                idnVar.a();
                return;
            case 17:
                Void r66 = (Void) obj;
                ((ltd) ((ltd) ifn.a.b()).k("com/google/android/libraries/inputmethod/metricstracker/TypingMetricsTracker$1", "onSuccess", 477, "TypingMetricsTracker.java")).t("Track health metrics succeed.");
                return;
            case 18:
                Void r67 = (Void) obj;
                return;
            case 19:
                Void r68 = (Void) obj;
                ltg ltgVar4 = its.a;
                return;
            default:
                ixe ixeVar = (ixe) obj;
                if (ixeVar == null) {
                    return;
                }
                ixeVar.k();
                gvt.a(ixeVar);
                ltg ltgVar5 = itx.a;
                return;
        }
    }
}
