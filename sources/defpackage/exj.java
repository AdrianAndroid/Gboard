package defpackage;

/* compiled from: PG */
/* renamed from: exj  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class exj implements gek {
    public final /* synthetic */ nfh a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ exj(exl exlVar, nfh nfhVar, int i) {
        this.c = i;
        this.b = exlVar;
        this.a = nfhVar;
    }

    public /* synthetic */ exj(exv exvVar, nfh nfhVar, int i) {
        this.c = i;
        this.b = exvVar;
        this.a = nfhVar;
    }

    @Override // defpackage.gek
    public final void d(Exception exc) {
        int i = this.c;
        if (i == 0) {
            Object obj = this.b;
            nfh nfhVar = this.a;
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            nji njiVar = (nji) nfhVar.b;
            nji njiVar2 = nji.n;
            njiVar.l = 2;
            njiVar.a |= 1024;
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            nji njiVar3 = (nji) nfhVar.b;
            njiVar3.a |= 512;
            njiVar3.k = false;
            ((ltd) ((ltd) ((ltd) exl.a.c()).i(exc)).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationTrainerManager", "lambda$scheduleBrellaTask$4", (char) 336, "LmForSpeechPersonalizationTrainerManager.java")).t("Failed to schedule Brella task.");
            ((exl) obj).g.a((nji) nfhVar.cz());
        } else if (i == 1) {
            Object obj2 = this.b;
            nfh nfhVar2 = this.a;
            if (nfhVar2.c) {
                nfhVar2.cD();
                nfhVar2.c = false;
            }
            nji njiVar4 = (nji) nfhVar2.b;
            nji njiVar5 = nji.n;
            njiVar4.l = 1;
            njiVar4.a |= 1024;
            if (nfhVar2.c) {
                nfhVar2.cD();
                nfhVar2.c = false;
            }
            nji njiVar6 = (nji) nfhVar2.b;
            njiVar6.a |= 512;
            njiVar6.k = false;
            ((ltd) ((ltd) ((ltd) exl.a.c()).i(exc)).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationTrainerManager", "lambda$scheduleBrellaTask$6", (char) 345, "LmForSpeechPersonalizationTrainerManager.java")).t("Failed to create in-app trainer for lm for speech personalization.");
            ((exl) obj2).g.a((nji) nfhVar2.cz());
        } else if (i == 2) {
            Object obj3 = this.b;
            nfh nfhVar3 = this.a;
            if (nfhVar3.c) {
                nfhVar3.cD();
                nfhVar3.c = false;
            }
            nji njiVar7 = (nji) nfhVar3.b;
            nji njiVar8 = nji.n;
            njiVar7.l = 2;
            njiVar7.a |= 1024;
            if (nfhVar3.c) {
                nfhVar3.cD();
                nfhVar3.c = false;
            }
            nji njiVar9 = (nji) nfhVar3.b;
            njiVar9.a |= 512;
            njiVar9.k = false;
            ((ltd) ((ltd) ((ltd) exv.a.c()).i(exc)).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/speech/SpeechPersonalizationTrainerManager", "lambda$scheduleBrellaTask$5", (char) 564, "SpeechPersonalizationTrainerManager.java")).t("Failed to schedule Brella task.");
            exv exvVar = (exv) obj3;
            exvVar.d(exx.CANNOT_SCHEDULE_TRAINING);
            exvVar.d.a((nji) nfhVar3.cz());
        } else {
            Object obj4 = this.b;
            nfh nfhVar4 = this.a;
            if (nfhVar4.c) {
                nfhVar4.cD();
                nfhVar4.c = false;
            }
            nji njiVar10 = (nji) nfhVar4.b;
            nji njiVar11 = nji.n;
            njiVar10.l = 1;
            njiVar10.a |= 1024;
            if (nfhVar4.c) {
                nfhVar4.cD();
                nfhVar4.c = false;
            }
            nji njiVar12 = (nji) nfhVar4.b;
            njiVar12.a |= 512;
            njiVar12.k = false;
            ((ltd) ((ltd) ((ltd) exv.a.c()).i(exc)).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/speech/SpeechPersonalizationTrainerManager", "lambda$scheduleBrellaTask$7", (char) 574, "SpeechPersonalizationTrainerManager.java")).t("Failed to create in-app trainer for personalization.");
            ((exv) obj4).d.a((nji) nfhVar4.cz());
        }
    }
}
