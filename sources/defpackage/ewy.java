package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: ewy  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ewy implements hhk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ewy(exa exaVar, Context context, int i) {
        this.c = i;
        this.a = exaVar;
        this.b = context;
    }

    public /* synthetic */ ewy(gru gruVar, String str, int i) {
        this.c = i;
        this.b = gruVar;
        this.a = str;
    }

    public /* synthetic */ ewy(hze hzeVar, hzd hzdVar, int i) {
        this.c = i;
        this.a = hzeVar;
        this.b = hzdVar;
    }

    @Override // defpackage.hhk
    public final void ib(hhl hhlVar) {
        int i = this.c;
        if (i == 0) {
            Object obj = this.a;
            Object obj2 = this.b;
            ((ltd) ((ltd) exa.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/maintenance/PersonalizedModelFileCleaner", "updateVersionAndRemoveOldLmFineTunedModel", 148, "PersonalizedModelFileCleaner.java")).t("updateVersionAndRemoveOldLmFineTunedModel()");
            ino K = ino.K((Context) obj2, null);
            if (K.c("lm_fine_tuning_version", 0L) >= ((Long) ffa.w.c()).longValue()) {
                return;
            }
            K.i("lm_fine_tuning_version", ((Long) ffa.w.c()).longValue());
            ((exa) obj).c("lm_fine_tuning");
        } else if (i != 1) {
            if (i != 2) {
                ((hze) this.a).b((hzd) this.b);
                return;
            }
            ((gru) this.b).d(hhlVar, (String) this.a);
        } else {
            Object obj3 = this.a;
            Object obj4 = this.b;
            ((ltd) ((ltd) exa.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/maintenance/PersonalizedModelFileCleaner", "updateVersionAndRemoveOldAsrFineTunedModel", 125, "PersonalizedModelFileCleaner.java")).t("updateVersionAndRemoveOldAsrFineTunedModel()");
            ino K2 = ino.K((Context) obj4, null);
            if (K2.c("asr_fine_tuning_version", 0L) >= ((Long) ffa.v.c()).longValue()) {
                return;
            }
            K2.i("asr_fine_tuning_version", ((Long) ffa.v.c()).longValue());
            ((exa) obj3).c("asr_fine_tuning");
        }
    }
}
