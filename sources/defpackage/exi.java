package defpackage;

/* compiled from: PG */
/* renamed from: exi  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class exi implements gel {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ exi(exg exgVar, exn exnVar, int i) {
        this.c = i;
        this.a = exgVar;
        this.b = exnVar;
    }

    public /* synthetic */ exi(exl exlVar, nfh nfhVar, int i) {
        this.c = i;
        this.a = exlVar;
        this.b = nfhVar;
    }

    public /* synthetic */ exi(exv exvVar, nfh nfhVar, int i) {
        this.c = i;
        this.a = exvVar;
        this.b = nfhVar;
    }

    public /* synthetic */ exi(String str, gdh gdhVar, int i) {
        this.c = i;
        this.b = str;
        this.a = gdhVar;
    }

    @Override // defpackage.gel
    public final void e(Object obj) {
        int i = this.c;
        if (i == 0) {
            Object obj2 = this.a;
            Object obj3 = this.b;
            gen b = ((fwk) obj).b();
            exl exlVar = (exl) obj2;
            nfh nfhVar = (nfh) obj3;
            b.l(exlVar.e, new exi(exlVar, nfhVar, 2));
            b.h(exlVar.e, new exj(exlVar, nfhVar, 0));
        } else if (i == 1) {
            Object obj4 = this.a;
            Object obj5 = this.b;
            gen b2 = ((fwk) obj).b();
            exg exgVar = (exg) obj4;
            exn exnVar = (exn) obj5;
            b2.l(exgVar.e, new dop(exnVar, 5));
            b2.h(exgVar.e, new doq(exnVar, 7));
        } else if (i == 2) {
            Object obj6 = this.a;
            Object obj7 = this.b;
            Void r10 = (Void) obj;
            ((ltd) ((ltd) exl.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LmForSpeechPersonalizationTrainerManager", "lambda$scheduleBrellaTask$3", 326, "LmForSpeechPersonalizationTrainerManager.java")).t("Successfully scheduled Brella task.");
            nfh nfhVar2 = (nfh) obj7;
            if (nfhVar2.c) {
                nfhVar2.cD();
                nfhVar2.c = false;
            }
            nji njiVar = (nji) nfhVar2.b;
            nji njiVar2 = nji.n;
            njiVar.a |= 512;
            njiVar.k = true;
            ((exl) obj6).g.a((nji) nfhVar2.cz());
        } else if (i == 3) {
            Object obj8 = this.a;
            Object obj9 = this.b;
            Void r102 = (Void) obj;
            ((ltd) ((ltd) exv.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/speech/SpeechPersonalizationTrainerManager", "lambda$scheduleBrellaTask$4", 553, "SpeechPersonalizationTrainerManager.java")).t("Successfully scheduled Brella task.");
            nfh nfhVar3 = (nfh) obj9;
            if (nfhVar3.c) {
                nfhVar3.cD();
                nfhVar3.c = false;
            }
            nji njiVar3 = (nji) nfhVar3.b;
            nji njiVar4 = nji.n;
            njiVar3.a |= 512;
            njiVar3.k = true;
            exv exvVar = (exv) obj8;
            exvVar.d(exx.TRAINING_SCHEDULED);
            exvVar.d.a((nji) nfhVar3.cz());
        } else if (i == 4) {
            Object obj10 = this.a;
            Object obj11 = this.b;
            gen b3 = ((fwk) obj).b();
            exv exvVar2 = (exv) obj10;
            nfh nfhVar4 = (nfh) obj11;
            b3.l(exvVar2.c, new exi(exvVar2, nfhVar4, 3));
            b3.h(exvVar2.c, new exj(exvVar2, nfhVar4, 2));
        } else {
            Object obj12 = this.b;
            Object obj13 = this.a;
            Void r103 = (Void) obj;
            jns jnsVar = fxh.a;
            String str = (String) obj12;
            gen d = ((gdh) obj13).d(str);
            d.k(new ewr(5));
            d.j(new doq(str, 9));
        }
    }
}
