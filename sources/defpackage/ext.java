package defpackage;

/* compiled from: PG */
/* renamed from: ext  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ext implements ged {
    private final /* synthetic */ int c;
    public static final /* synthetic */ ext b = new ext(1);
    public static final /* synthetic */ ext a = new ext(0);

    private /* synthetic */ ext(int i) {
        this.c = i;
    }

    @Override // defpackage.ged
    public final Object a(gen genVar) {
        int i = this.c;
        if (i == 0) {
            ltg ltgVar = exv.a;
            if (!genVar.e()) {
                ((ltd) ((ltd) exv.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/speech/SpeechPersonalizationTrainerManager", "cancelTask", 515, "SpeechPersonalizationTrainerManager.java")).t("Failed to get InAppTrainer.");
                return gni.e(null);
            }
            fwk fwkVar = (fwk) genVar.c();
            if (fwkVar == null) {
                ((ltd) ((ltd) exv.a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/speech/SpeechPersonalizationTrainerManager", "cancelTask", 521, "SpeechPersonalizationTrainerManager.java")).t("InAppTrainer is null.");
                return gni.e(null);
            }
            return fwkVar.a();
        } else if (i == 1) {
            if (!genVar.e()) {
                ((ltd) ((ltd) ewt.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/federation/speech/SpeechFederationTrainerManager", "cancelTask", 430, "SpeechFederationTrainerManager.java")).t("Failed to get InAppTrainer.");
                return gni.e(null);
            }
            fwk fwkVar2 = (fwk) genVar.c();
            if (fwkVar2 == null) {
                ((ltd) ((ltd) ewt.a.d()).k("com/google/android/apps/inputmethod/libs/trainingcache/federation/speech/SpeechFederationTrainerManager", "cancelTask", 436, "SpeechFederationTrainerManager.java")).t("InAppTrainer is null.");
                return gni.e(null);
            }
            return fwkVar2.a();
        } else {
            return kkb.c(genVar);
        }
    }
}
