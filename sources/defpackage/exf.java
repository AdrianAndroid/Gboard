package defpackage;

/* compiled from: PG */
/* renamed from: exf  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class exf implements gek {
    private final /* synthetic */ int d;
    public static final /* synthetic */ exf c = new exf(2);
    public static final /* synthetic */ exf b = new exf(1);
    public static final /* synthetic */ exf a = new exf(0);

    private /* synthetic */ exf(int i) {
        this.d = i;
    }

    @Override // defpackage.gek
    public final void d(Exception exc) {
        int i = this.d;
        if (i == 0) {
            ((ltd) ((ltd) ((ltd) exg.a.c()).i(exc)).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationTrainerManager", "lambda$getInAppTrainerTask$5", (char) 199, "LanguageModelPersonalizationTrainerManager.java")).t("Failed to get in-app trainer for language model personalization.");
        } else if (i != 1) {
            ((ltd) ((ltd) ((ltd) exl.a.c()).i(exc)).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationTrainerManager", "lambda$getInAppTrainerTask$2", (char) 311, "LmForSpeechPersonalizationTrainerManager.java")).t("Failed to get in-app trainer for language model personalization.");
        } else {
            ((ltd) ((ltd) ((ltd) dpq.a.c()).i(exc)).k("com/google/android/apps/inputmethod/libs/lstm/LstmTrainer", "lambda$configureOrCancelBrellaFederatedTraining$1", 'k', "LstmTrainer.java")).t("Failed to create in-app trainer.");
        }
    }
}
