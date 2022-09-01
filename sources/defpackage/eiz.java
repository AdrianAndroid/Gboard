package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.inputmethod.libs.expression.extension.IBitmojiExtension;
import com.google.android.apps.inputmethod.libs.expression.extension.IStickerExtension;
import com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard;
import com.google.android.apps.inputmethod.libs.search.keyboard.SearchKeyboard;
import com.google.android.apps.inputmethod.libs.search.universalmedia.UniversalMediaKeyboardM2;
import com.google.android.apps.inputmethod.libs.search.universalmedia.UniversalMediaKeyboardTablet;
import com.google.android.apps.inputmethod.libs.sharing.GboardSharingSetupDonePage;
import com.google.android.apps.inputmethod.libs.sharing.SharingLinkReceiveActivity;
import com.google.android.inputmethod.latin.R;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: eiz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class eiz implements View.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ eiz(UniversalMediaKeyboardM2 universalMediaKeyboardM2, cqp cqpVar, int i) {
        this.c = i;
        this.a = universalMediaKeyboardM2;
        this.b = cqpVar;
    }

    public /* synthetic */ eiz(UniversalMediaKeyboardTablet universalMediaKeyboardTablet, cqp cqpVar, int i) {
        this.c = i;
        this.a = universalMediaKeyboardTablet;
        this.b = cqpVar;
    }

    public /* synthetic */ eiz(GboardSharingSetupDonePage gboardSharingSetupDonePage, els elsVar, int i) {
        this.c = i;
        this.b = gboardSharingSetupDonePage;
        this.a = elsVar;
    }

    public /* synthetic */ eiz(SharingLinkReceiveActivity sharingLinkReceiveActivity, Dialog dialog, int i) {
        this.c = i;
        this.a = sharingLinkReceiveActivity;
        this.b = dialog;
    }

    public /* synthetic */ eiz(SharingLinkReceiveActivity sharingLinkReceiveActivity, ely elyVar, int i) {
        this.c = i;
        this.a = sharingLinkReceiveActivity;
        this.b = elyVar;
    }

    public /* synthetic */ eiz(eix eixVar, ehj ehjVar, int i) {
        this.c = i;
        this.a = eixVar;
        this.b = ehjVar;
    }

    public /* synthetic */ eiz(eja ejaVar, egu eguVar, int i) {
        this.c = i;
        this.a = ejaVar;
        this.b = eguVar;
    }

    public /* synthetic */ eiz(ejb ejbVar, egu eguVar, int i) {
        this.c = i;
        this.a = ejbVar;
        this.b = eguVar;
    }

    public /* synthetic */ eiz(ejd ejdVar, eib eibVar, int i) {
        this.c = i;
        this.a = ejdVar;
        this.b = eibVar;
    }

    public /* synthetic */ eiz(eje ejeVar, ehj ehjVar, int i) {
        this.c = i;
        this.a = ejeVar;
        this.b = ehjVar;
    }

    public /* synthetic */ eiz(ejf ejfVar, eib eibVar, int i) {
        this.c = i;
        this.a = ejfVar;
        this.b = eibVar;
    }

    public /* synthetic */ eiz(ekj ekjVar, ejv ejvVar, int i) {
        this.c = i;
        this.a = ekjVar;
        this.b = ejvVar;
    }

    public /* synthetic */ eiz(ekk ekkVar, ejv ejvVar, int i) {
        this.c = i;
        this.a = ekkVar;
        this.b = ejvVar;
    }

    public /* synthetic */ eiz(ell ellVar, String str, int i) {
        this.c = i;
        this.b = ellVar;
        this.a = str;
    }

    public /* synthetic */ eiz(emf emfVar, ely elyVar, int i) {
        this.c = i;
        this.a = emfVar;
        this.b = elyVar;
    }

    public /* synthetic */ eiz(eyq eyqVar, String str, int i) {
        this.c = i;
        this.b = eyqVar;
        this.a = str;
    }

    public /* synthetic */ eiz(fbf fbfVar, Context context, int i) {
        this.c = i;
        this.a = fbfVar;
        this.b = context;
    }

    public /* synthetic */ eiz(fbk fbkVar, hsk hskVar, int i) {
        this.c = i;
        this.b = fbkVar;
        this.a = hskVar;
    }

    /* JADX WARN: Type inference failed for: r2v53, types: [hsk, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String name;
        iap iapVar;
        String name2;
        iap iapVar2;
        switch (this.c) {
            case 0:
                Object obj = this.a;
                ((eja) obj).s.a(this.b, Integer.valueOf(((mo) obj).b()));
                return;
            case 1:
                Object obj2 = this.a;
                ((eix) obj2).s.a(this.b, Integer.valueOf(((mo) obj2).b()));
                return;
            case 2:
                Object obj3 = this.a;
                Object obj4 = this.b;
                ejb ejbVar = (ejb) obj3;
                ejbVar.u.a(obj4, false);
                ejbVar.I((egu) obj4);
                return;
            case 3:
                Object obj5 = this.a;
                Object obj6 = this.b;
                ejb ejbVar2 = (ejb) obj5;
                ejbVar2.u.a(obj6, true);
                ejbVar2.I((egu) obj6);
                return;
            case 4:
                Object obj7 = this.a;
                ((ejb) obj7).s.a(this.b, Integer.valueOf(((mo) obj7).b()));
                return;
            case 5:
                ((ejd) this.a).s.a(this.b, true);
                return;
            case 6:
                ((ejd) this.a).s.a(this.b, false);
                return;
            case 7:
                Object obj8 = this.a;
                ((eje) obj8).s.a(this.b, Integer.valueOf(((mo) obj8).b()));
                return;
            case 8:
                ((ejf) this.a).s.a(this.b, false);
                return;
            case 9:
                Object obj9 = this.a;
                if ("bitmoji".equals(((cqp) this.b).r())) {
                    name = IBitmojiExtension.class.getName();
                } else {
                    name = IStickerExtension.class.getName();
                }
                ((ltd) ((ltd) UniversalMediaKeyboardM2.a.b()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardM2", "openExtensionToMoreImages", 1090, "UniversalMediaKeyboardM2.java")).w("openExtensionToMoreImages(): Target extension %s", name);
                UniversalMediaKeyboardM2 universalMediaKeyboardM2 = (UniversalMediaKeyboardM2) obj9;
                igr.d(universalMediaKeyboardM2.u);
                igg j = igr.j(name);
                if (j == null || (iapVar = j.e) == null) {
                    ((ltd) UniversalMediaKeyboardM2.a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardM2", "openExtensionToMoreImages", 1108, "UniversalMediaKeyboardM2.java")).w("can't get the default keyboard from the extension %s to open", name);
                } else {
                    String obj10 = iapVar.c(R.id.f54800_resource_name_obfuscated_res_0x7f0b01c8, "").toString();
                    if (!TextUtils.isEmpty(obj10)) {
                        universalMediaKeyboardM2.v.z(hfd.d(new iay(-10104, null, new icz(obj10, dip.j(((AbstractSearchResultKeyboard) obj9).U(), hfl.EXTERNAL)))));
                    } else {
                        ((ltd) ((ltd) UniversalMediaKeyboardM2.a.d()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardM2", "openExtensionToMoreImages", 1105, "UniversalMediaKeyboardM2.java")).w("The default keyboard of extension %s is empty", name);
                    }
                }
                universalMediaKeyboardM2.e.e(ctd.UNIVERSAL_MEDIA_MORE_STICKER_RESULTS_CLICKED, universalMediaKeyboardM2.h, name, ((AbstractSearchResultKeyboard) obj9).U(), UniversalMediaKeyboardM2.T(), universalMediaKeyboardM2.u());
                return;
            case 10:
                Object obj11 = this.a;
                if ("bitmoji".equals(((cqp) this.b).r())) {
                    name2 = IBitmojiExtension.class.getName();
                } else {
                    name2 = IStickerExtension.class.getName();
                }
                ((ltd) ((ltd) UniversalMediaKeyboardTablet.a.b()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardTablet", "openExtensionToMoreImages", 1091, "UniversalMediaKeyboardTablet.java")).w("openExtensionToMoreImages(): Target extension %s", name2);
                UniversalMediaKeyboardTablet universalMediaKeyboardTablet = (UniversalMediaKeyboardTablet) obj11;
                igr.d(universalMediaKeyboardTablet.u);
                igg j2 = igr.j(name2);
                if (j2 == null || (iapVar2 = j2.e) == null) {
                    ((ltd) UniversalMediaKeyboardTablet.a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardTablet", "openExtensionToMoreImages", 1109, "UniversalMediaKeyboardTablet.java")).w("can't get the default keyboard from the extension %s to open", name2);
                } else {
                    String obj12 = iapVar2.c(R.id.f54800_resource_name_obfuscated_res_0x7f0b01c8, "").toString();
                    if (!TextUtils.isEmpty(obj12)) {
                        universalMediaKeyboardTablet.v.z(hfd.d(new iay(-10104, null, new icz(obj12, dip.j(((AbstractSearchResultKeyboard) obj11).U(), hfl.EXTERNAL)))));
                    } else {
                        ((ltd) ((ltd) UniversalMediaKeyboardTablet.a.d()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardTablet", "openExtensionToMoreImages", 1106, "UniversalMediaKeyboardTablet.java")).w("The default keyboard of extension %s is empty", name2);
                    }
                }
                universalMediaKeyboardTablet.e.e(ctd.UNIVERSAL_MEDIA_MORE_STICKER_RESULTS_CLICKED, universalMediaKeyboardTablet.h, name2, ((AbstractSearchResultKeyboard) obj11).U(), UniversalMediaKeyboardTablet.V(), universalMediaKeyboardTablet.u());
                return;
            case 11:
                Object obj13 = this.a;
                ((ekj) obj13).s.a(this.b, Integer.valueOf(((mo) obj13).b()));
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj14 = this.a;
                ((ekk) obj14).s.a(this.b, Integer.valueOf(((mo) obj14).b()));
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj15 = this.b;
                Object obj16 = this.a;
                opu opuVar = ((ell) obj15).t;
                if (opuVar == null) {
                    return;
                }
                ((mo) obj15).b();
                ((SearchKeyboard) opuVar.a).K((String) obj16, mba.CONTEXTUAL);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj17 = this.b;
                Object obj18 = this.a;
                GboardSharingSetupDonePage gboardSharingSetupDonePage = (GboardSharingSetupDonePage) obj17;
                ely elyVar = gboardSharingSetupDonePage.c;
                if (elyVar != null) {
                    ((els) obj18).d(elyVar, mdu.FIRSTRUN_DONE_PAGE);
                    ddc.d(gboardSharingSetupDonePage.b);
                }
                ieh.j().e(dda.SETUP_WIZARD_DONE_BUTTON_CLICKED, new Object[0]);
                ((ddi) gboardSharingSetupDonePage.b).finish();
                return;
            case 15:
                SharingLinkReceiveActivity sharingLinkReceiveActivity = (SharingLinkReceiveActivity) this.a;
                sharingLinkReceiveActivity.k.d((ely) this.b, mdu.ENABLE_PAGE);
                sharingLinkReceiveActivity.finish();
                return;
            case 16:
                Object obj19 = this.a;
                ((Dialog) this.b).dismiss();
                SharingLinkReceiveActivity.l(mdy.CANCEL_CLICKED);
                ((SharingLinkReceiveActivity) obj19).finish();
                return;
            case 17:
                Object obj20 = this.a;
                ((emf) obj20).a.d((ely) this.b, mdu.ENABLE_DIALOG);
                ((dt) obj20).dismiss();
                return;
            case 18:
                Object obj21 = this.b;
                eyq eyqVar = (eyq) obj21;
                eyqVar.e = (String) this.a;
                ((ls) obj21).fc();
                Runnable runnable = eyqVar.f;
                if (runnable == null) {
                    return;
                }
                runnable.run();
                return;
            case 19:
                Object obj22 = this.a;
                Object obj23 = this.b;
                ((fbf) obj22).e();
                fay.b((Context) obj23, true);
                return;
            default:
                Object obj24 = this.b;
                ?? r2 = this.a;
                fbk fbkVar = (fbk) obj24;
                Object obj25 = fbkVar.n.a;
                fby fbyVar = (fby) obj25;
                ((ltd) ((ltd) fby.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceInputManager", "handleClearButton", 469, "VoiceInputManager.java")).w("pauseRecognition() : %s", fbyVar.i);
                synchronized (fbyVar.j) {
                    ((fby) obj25).i(fff.OTHER);
                    ((fby) obj25).j();
                    ((fby) obj25).l.c();
                    if (fby.n()) {
                        ((fby) obj25).n.c();
                    }
                    ((fby) obj25).b.k(false);
                    ((fby) obj25).c.execute(new fal((fby) obj25, 9));
                }
                fbyVar.d.e(fbm.VOICE_INPUT_STOP, new Object[0]);
                fcb.a().b(fbm.INPUT_CHAR_WHEN_STOPPING_VOICE_IME);
                hpy b = hqj.b();
                if (b != null && !b.g()) {
                    r2.at(hfd.d(new iay(-10125, null, "")));
                }
                fby fbyVar2 = (fby) fbkVar.n.a;
                ffd ffdVar = fbyVar2.t;
                if (ffdVar != null) {
                    fbyVar2.f(ffdVar);
                }
                ieh.j().e(fbm.CLEAR_BUTTON_USAGE, 1);
                return;
        }
    }
}
