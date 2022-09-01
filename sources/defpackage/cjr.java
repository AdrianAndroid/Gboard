package defpackage;

import android.view.View;
import androidx.preference.Preference;
import com.google.android.apps.inputmethod.libs.framework.keyboard.widget.BidiViewPager;
import com.google.android.apps.inputmethod.libs.languageselection.preference.LanguageSettingFragment;
import com.google.android.apps.inputmethod.libs.languageselection.preference.MorseKeyComboPreference;
import com.google.android.inputmethod.latin.R;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: cjr  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cjr implements View.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cjr(cjt cjtVar, int i) {
        this.b = i;
        this.a = cjtVar;
    }

    public /* synthetic */ cjr(cmn cmnVar, int i) {
        this.b = i;
        this.a = cmnVar;
    }

    public /* synthetic */ cjr(cny cnyVar, int i) {
        this.b = i;
        this.a = cnyVar;
    }

    public /* synthetic */ cjr(LanguageSettingFragment languageSettingFragment, int i) {
        this.b = i;
        this.a = languageSettingFragment;
    }

    public /* synthetic */ cjr(MorseKeyComboPreference morseKeyComboPreference, int i) {
        this.b = i;
        this.a = morseKeyComboPreference;
    }

    public /* synthetic */ cjr(cpa cpaVar, int i) {
        this.b = i;
        this.a = cpaVar;
    }

    public /* synthetic */ cjr(dde ddeVar, int i) {
        this.b = i;
        this.a = ddeVar;
    }

    public /* synthetic */ cjr(ddi ddiVar, int i) {
        this.b = i;
        this.a = ddiVar;
    }

    public /* synthetic */ cjr(ddk ddkVar, int i) {
        this.b = i;
        this.a = ddkVar;
    }

    public /* synthetic */ cjr(dnm dnmVar, int i) {
        this.b = i;
        this.a = dnmVar;
    }

    public /* synthetic */ cjr(dqg dqgVar, int i) {
        this.b = i;
        this.a = dqgVar;
    }

    public /* synthetic */ cjr(dvv dvvVar, int i) {
        this.b = i;
        this.a = dvvVar;
    }

    public /* synthetic */ cjr(dvx dvxVar, int i) {
        this.b = i;
        this.a = dvxVar;
    }

    public /* synthetic */ cjr(dvz dvzVar, int i) {
        this.b = i;
        this.a = dvzVar;
    }

    public /* synthetic */ cjr(Runnable runnable, int i) {
        this.b = i;
        this.a = runnable;
    }

    public /* synthetic */ cjr(String str, int i) {
        this.b = i;
        this.a = str;
    }

    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        boolean z2 = false;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                fgy.j(view);
                cjt cjtVar = (cjt) obj;
                hso hsoVar = cjtVar.d;
                ins insVar = new ins(14);
                insVar.b(cjtVar.b, R.string.f162390_resource_name_obfuscated_res_0x7f140710, R.string.f161060_resource_name_obfuscated_res_0x7f14068a);
                hsk hskVar = hsoVar.a;
                if (hskVar == null) {
                    z = false;
                } else {
                    hskVar.aC(insVar);
                    z = true;
                }
                dau.i(z, "Failed to launch sticker predictions settings activity");
                cjtVar.d();
                cjtVar.g.e(ciu.IMAGE_CANDIDATE_USAGE, 10);
                return;
            case 1:
                cjt cjtVar2 = (cjt) this.a;
                dau.i(cjtVar2.d.a(hfd.d(new iay(-10104, null, new icz(cjtVar2.b.getString(R.string.f154910_resource_name_obfuscated_res_0x7f14039d), dip.j("", hfl.EXTERNAL))))), "Failed to dispatch open Customoji event.");
                return;
            case 2:
                Object obj2 = this.a;
                fgy.j(view);
                ((cjt) obj2).g.e(ciu.IMAGE_CANDIDATE_USAGE, 7);
                return;
            case 3:
                ((cmn) this.a).f();
                return;
            case 4:
                this.a.run();
                return;
            case 5:
                Object obj3 = this.a;
                fgy.j(view);
                kki.j(new cbq((cny) obj3, 16));
                return;
            case 6:
                cpa cpaVar = (cpa) this.a;
                int indexOfChild = cpaVar.e.indexOfChild(view);
                coq a = cpaVar.c.a(cox.a(indexOfChild));
                if (a == null) {
                    ((ltd) cpa.a.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/header/EndAdapter", "onElementClicked", 109, "EndAdapter.java")).t("Element is null");
                    return;
                }
                if (cpa.c(a) == 2) {
                    z2 = cpaVar.d.x(cox.a(indexOfChild));
                }
                cpaVar.d.n(a, z2);
                return;
            case 7:
                dde ddeVar = (dde) this.a;
                ddeVar.b = true;
                ddeVar.b();
                return;
            case 8:
                ((ddi) this.a).finish();
                return;
            case 9:
                ddi ddiVar = (ddi) this.a;
                BidiViewPager bidiViewPager = ddiVar.m;
                if (bidiViewPager == null) {
                    return;
                }
                int a2 = bidiViewPager.a();
                int length = ddiVar.r.length - 1;
                BidiViewPager bidiViewPager2 = ddiVar.m;
                if (a2 != length) {
                    length = a2 + 1;
                }
                bidiViewPager2.l(length);
                return;
            case 10:
                ((ddi) this.a).finish();
                return;
            case 11:
                Object obj4 = this.a;
                ieh.j().e(dda.SETUP_WIZARD_DONE_BUTTON_CLICKED, new Object[0]);
                ((ddi) ((ddk) obj4).getContext()).finish();
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                hkp.b((String) this.a, true);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((LanguageSettingFragment) this.a).aE();
                LanguageSettingFragment.aD(2);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((dnm) this.a).aK(0);
                return;
            case 15:
                Object obj5 = this.a;
                MorseKeyComboPreference morseKeyComboPreference = (MorseKeyComboPreference) obj5;
                morseKeyComboPreference.i.clear();
                dmt.e(morseKeyComboPreference.g, morseKeyComboPreference.i, ((Preference) obj5).j);
                morseKeyComboPreference.h.setEnabled(morseKeyComboPreference.af());
                return;
            case 16:
                ((dt) this.a).dismiss();
                return;
            case 17:
                dvv dvvVar = (dvv) this.a;
                dwk dwkVar = dvvVar.b;
                if (dwkVar != null) {
                    dwkVar.j();
                }
                dvvVar.a.n(7);
                return;
            case 18:
                dwk dwkVar2 = ((dvx) this.a).b;
                if (dwkVar2 == null) {
                    return;
                }
                dwkVar2.j();
                return;
            case 19:
                dtc dtcVar = (dtc) ((dvx) this.a).a;
                dtcVar.g.b();
                hjg.k(dtcVar.e, "com.google.android.inputmethod.latin.SMART_DICTATION");
                return;
            default:
                dwh dwhVar = ((dvz) this.a).c;
                ((ltd) ((ltd) dtc.a.b()).k("com/google/android/apps/inputmethod/libs/nga/impl/NgaExtension", "onOnboardingActivated", 576, "NgaExtension.java")).t("Onboarding.");
                ((dtc) dwhVar).c().z(hfd.d(new iay(-10042, null, "onboarding")));
                return;
        }
    }
}
