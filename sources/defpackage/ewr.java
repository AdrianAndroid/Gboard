package defpackage;

/* compiled from: PG */
/* renamed from: ewr  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ewr implements gel {
    private final /* synthetic */ int e;
    public static final /* synthetic */ ewr d = new ewr(4);
    public static final /* synthetic */ ewr c = new ewr(3);
    public static final /* synthetic */ ewr b = new ewr(2);
    public static final /* synthetic */ ewr a = new ewr(0);

    public /* synthetic */ ewr(int i) {
        this.e = i;
    }

    @Override // defpackage.gel
    public final void e(Object obj) {
        int i = this.e;
        if (i == 0) {
            fwk fwkVar = (fwk) obj;
            ((ltd) ((ltd) ewt.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/federation/speech/SpeechFederationTrainerManager", "lambda$getInAppTrainerTask$5", 447, "SpeechFederationTrainerManager.java")).t("Created in-app trainer for speech federation.");
        } else if (i == 1) {
            Void r6 = (Void) obj;
            ltg ltgVar = dpq.a;
        } else if (i == 2) {
            fwk fwkVar2 = (fwk) obj;
            ((ltd) ((ltd) exg.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationTrainerManager", "lambda$getInAppTrainerTask$4", 195, "LanguageModelPersonalizationTrainerManager.java")).t("Created in-app trainer for language model personalization.");
        } else if (i == 3) {
            fwk fwkVar3 = (fwk) obj;
            ((ltd) ((ltd) exl.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationTrainerManager", "lambda$getInAppTrainerTask$1", 307, "LmForSpeechPersonalizationTrainerManager.java")).t("Created in-app trainer for language model personalization.");
        } else if (i == 4) {
            fwk fwkVar4 = (fwk) obj;
            ((ltd) ((ltd) exv.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/speech/SpeechPersonalizationTrainerManager", "lambda$getInAppTrainerTask$2", 532, "SpeechPersonalizationTrainerManager.java")).t("Created in-app trainer for speech personalization.");
        } else if (i == 5) {
            Void r62 = (Void) obj;
            jns jnsVar = fxh.a;
        } else {
            Void r63 = (Void) obj;
            jns jnsVar2 = fxh.a;
        }
    }
}
