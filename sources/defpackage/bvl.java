package defpackage;

import android.content.Context;
import com.android.inputmethod.latin.spellcheck.AndroidSpellCheckerService;
import com.google.android.apps.inputmethod.libs.framework.core.InputView;
import com.google.android.apps.inputmethod.libs.japanese.keyboard.widget.MonolithicCandidatesHolderView;
import com.google.android.apps.inputmethod.libs.search.expressiveconcepts.BlocklistManager;
import com.google.android.apps.inputmethod.libs.search.widget.VariableHeightSoftKeyboardView;
import com.google.android.apps.inputmethod.libs.translate.TranslateKeyboard;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: bvl  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bvl implements hhk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bvl(bvp bvpVar, int i) {
        this.b = i;
        this.a = bvpVar;
    }

    public /* synthetic */ bvl(bzr bzrVar, int i) {
        this.b = i;
        this.a = bzrVar;
    }

    public /* synthetic */ bvl(cfp cfpVar, int i) {
        this.b = i;
        this.a = cfpVar;
    }

    public /* synthetic */ bvl(cik cikVar, int i) {
        this.b = i;
        this.a = cikVar;
    }

    public /* synthetic */ bvl(cjt cjtVar, int i) {
        this.b = i;
        this.a = cjtVar;
    }

    public /* synthetic */ bvl(cly clyVar, int i) {
        this.b = i;
        this.a = clyVar;
    }

    public bvl(AndroidSpellCheckerService androidSpellCheckerService, int i) {
        this.b = i;
        this.a = androidSpellCheckerService;
    }

    public bvl(InputView inputView, int i) {
        this.b = i;
        this.a = inputView;
    }

    public /* synthetic */ bvl(MonolithicCandidatesHolderView monolithicCandidatesHolderView, int i) {
        this.b = i;
        this.a = monolithicCandidatesHolderView;
    }

    public /* synthetic */ bvl(BlocklistManager blocklistManager, int i) {
        this.b = i;
        this.a = blocklistManager;
    }

    public /* synthetic */ bvl(VariableHeightSoftKeyboardView variableHeightSoftKeyboardView, int i) {
        this.b = i;
        this.a = variableHeightSoftKeyboardView;
    }

    public /* synthetic */ bvl(TranslateKeyboard translateKeyboard, int i) {
        this.b = i;
        this.a = translateKeyboard;
    }

    public /* synthetic */ bvl(dbt dbtVar, int i) {
        this.b = i;
        this.a = dbtVar;
    }

    public /* synthetic */ bvl(dcu dcuVar, int i) {
        this.b = i;
        this.a = dcuVar;
    }

    public /* synthetic */ bvl(dvo dvoVar, int i) {
        this.b = i;
        this.a = dvoVar;
    }

    public /* synthetic */ bvl(eck eckVar, int i) {
        this.b = i;
        this.a = eckVar;
    }

    public /* synthetic */ bvl(fcs fcsVar, int i) {
        this.b = i;
        this.a = fcsVar;
    }

    public /* synthetic */ bvl(fdq fdqVar, int i) {
        this.b = i;
        this.a = fdqVar;
    }

    public /* synthetic */ bvl(feb febVar, int i) {
        this.b = i;
        this.a = febVar;
    }

    @Override // defpackage.hhk
    public final void ib(hhl hhlVar) {
        switch (this.b) {
            case 0:
                ((bvp) this.a).p(hhlVar);
                return;
            case 1:
                if (((Boolean) iqt.b.c()).booleanValue()) {
                    asp aspVar = ((AndroidSpellCheckerService) this.a).a;
                    if (aspVar == null) {
                        return;
                    }
                    aspVar.b();
                    return;
                }
                asp aspVar2 = ((AndroidSpellCheckerService) this.a).a;
                if (aspVar2 == null) {
                    return;
                }
                aspVar2.c();
                return;
            case 2:
                ((bvp) this.a).q(hhlVar);
                return;
            case 3:
                Object obj = this.a;
                if (!((Boolean) hhlVar.c()).booleanValue()) {
                    return;
                }
                ((bzr) obj).r();
                return;
            case 4:
                ((cfp) this.a).c(hqr.b());
                return;
            case 5:
                ((cik) this.a).d.e(cik.a());
                return;
            case 6:
                float f = ((cjt) this.a).m;
                if (f < 0.0f) {
                    return;
                }
                cjt.h(f);
                return;
            case 7:
                ((cly) this.a).b();
                return;
            case 8:
                ((cly) this.a).b();
                return;
            case 9:
                ((dbt) this.a).a();
                return;
            case 10:
                irn.g((Context) this.a);
                return;
            case 11:
                ((InputView) this.a).setFilterTouchesWhenObscured(((Boolean) InputView.a.c()).booleanValue());
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((MonolithicCandidatesHolderView) this.a).requestLayout();
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj2 = this.a;
                SoftKeyView o = dvo.o();
                if (o == null) {
                    ((ltd) ((ltd) dvo.a.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/ui/MicRing", "updateMicButton", 89, "MicRing.java")).t("The voice button is null");
                    return;
                } else {
                    ((dvo) obj2).b.i(o);
                    return;
                }
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((BlocklistManager) this.a).e.set(null);
                return;
            case 15:
                Object obj3 = this.a;
                hhlVar.c();
                ((eck) obj3).e();
                return;
            case 16:
                Object obj4 = this.a;
                VariableHeightSoftKeyboardView variableHeightSoftKeyboardView = (VariableHeightSoftKeyboardView) obj4;
                if (variableHeightSoftKeyboardView.getContext() == null) {
                    return;
                }
                elo eloVar = variableHeightSoftKeyboardView.b;
                variableHeightSoftKeyboardView.b = new kfp(eloVar).i();
                if (eloVar.equals(variableHeightSoftKeyboardView.b)) {
                    return;
                }
                ((SoftKeyboardView) obj4).g();
                return;
            case 17:
                ((TranslateKeyboard) this.a).g = true;
                return;
            case 18:
                ((fcs) this.a).c(hhlVar);
                return;
            case 19:
                Object obj5 = this.a;
                ((ltd) ((ltd) fdq.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/OnDeviceDictationPerformanceEvaluationModule", "updateVersion", 143, "OnDeviceDictationPerformanceEvaluationModule.java")).t("updateVersion()");
                fdq fdqVar = (fdq) obj5;
                if (fdqVar.d.c("perf_eval_version_number", 0L) >= ((Long) ffa.t.c()).longValue()) {
                    return;
                }
                fdqVar.d.i("perf_eval_version_number", ((Long) ffa.t.c()).longValue());
                fdqVar.d.h("number_of_perf_eval_completed_times", 0);
                fdqVar.d.i("last_schedule_perf_eval_time", 0L);
                if (!fdqVar.e.x(R.string.f161110_resource_name_obfuscated_res_0x7f14068f, false)) {
                    return;
                }
                fdqVar.f.f(gxo.a(10));
                return;
            default:
                ((feb) this.a).h(hhlVar);
                return;
        }
    }
}
