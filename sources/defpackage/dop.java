package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.inputmethod.libs.framework.core.LauncherActivity;
import com.google.android.apps.inputmethod.libs.latin5.PeriodicStatsRunner;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: dop  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dop implements gel {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ dop(LauncherActivity launcherActivity, int i) {
        this.b = i;
        this.a = launcherActivity;
    }

    public /* synthetic */ dop(PeriodicStatsRunner periodicStatsRunner, int i) {
        this.b = i;
        this.a = periodicStatsRunner;
    }

    public /* synthetic */ dop(dpq dpqVar, int i) {
        this.b = i;
        this.a = dpqVar;
    }

    public /* synthetic */ dop(dqn dqnVar, int i) {
        this.b = i;
        this.a = dqnVar;
    }

    public /* synthetic */ dop(emh emhVar, int i) {
        this.b = i;
        this.a = emhVar;
    }

    public /* synthetic */ dop(exn exnVar, int i) {
        this.b = i;
        this.a = exnVar;
    }

    public /* synthetic */ dop(idz idzVar, int i) {
        this.b = i;
        this.a = idzVar;
    }

    public /* synthetic */ dop(rj rjVar, int i) {
        this.b = i;
        this.a = rjVar;
    }

    @Override // defpackage.gel
    public final void e(Object obj) {
        Uri c;
        Uri c2;
        Uri c3;
        boolean z = false;
        switch (this.b) {
            case 0:
                Object obj2 = this.a;
                List list = (List) obj;
                PeriodicStatsRunner periodicStatsRunner = (PeriodicStatsRunner) obj2;
                periodicStatsRunner.d.clear();
                if (list != null && !list.isEmpty()) {
                    for (int i = 0; i < list.size(); i++) {
                        fvt fvtVar = (fvt) list.get(i);
                        try {
                            ((PeriodicStatsRunner) obj2).d.add(jav.d(fvtVar.a).n);
                        } catch (IllegalArgumentException e) {
                            ((ltd) ((ltd) ((ltd) PeriodicStatsRunner.a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/latin5/PeriodicStatsRunner", "lambda$call$0", 227, "PeriodicStatsRunner.java")).w("Failed to parse locale %s", fvtVar.a);
                        }
                    }
                }
                periodicStatsRunner.c(periodicStatsRunner.d);
                return;
            case 1:
                Object obj3 = this.a;
                mlu mluVar = (mlu) obj;
                if (mluVar != null && (c = mluVar.c()) != null) {
                    ddc.b((Context) obj3, c);
                }
                ((LauncherActivity) obj3).a(true);
                return;
            case 2:
                Void r10 = (Void) obj;
                ((dpq) this.a).c.e(dpn.LSTM_IN_APP_TRAINING_SCHEDULED, new Object[0]);
                return;
            case 3:
                Object obj4 = this.a;
                mlu mluVar2 = (mlu) obj;
                if (mluVar2 != null && (c2 = mluVar2.c()) != null) {
                    ddc.b(((dqn) obj4).b, c2);
                }
                ((dqn) obj4).d();
                return;
            case 4:
                Object obj5 = this.a;
                mlu mluVar3 = (mlu) obj;
                if (mluVar3 != null && (c3 = mluVar3.c()) != null) {
                    ddc.b(((emh) obj5).c, c3);
                }
                ((emh) obj5).e();
                return;
            case 5:
                Void r102 = (Void) obj;
                ((ltd) ((ltd) exg.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationTrainerManager", "lambda$registerTrainer$1", 177, "LanguageModelPersonalizationTrainerManager.java")).w("Scheduled language model personalization training for %s.", ((exn) this.a).a);
                return;
            case 6:
                ((rj) this.a).c((List) obj);
                return;
            default:
                Object obj6 = this.a;
                gfk gfkVar = (gfk) ((oir) obj).a;
                fyb.ax(gfkVar.a);
                if (gfkVar.a.a == 1) {
                    z = true;
                }
                AtomicReference atomicReference = ((idz) obj6).h;
                Boolean valueOf = Boolean.valueOf(z);
                atomicReference.set(valueOf);
                ((ltd) ((ltd) idz.a.b()).k("com/google/android/libraries/inputmethod/metrics/clearcut/BaseClearcutAdapter", "lambda$queryAndUpdateUserCheckboxOptIn$1", 243, "BaseClearcutAdapter.java")).w("Checkbox = %b", valueOf);
                return;
        }
    }
}
