package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: dnk  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dnk implements ahv {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ dnk(Activity activity, int i) {
        this.b = i;
        this.a = activity;
    }

    public /* synthetic */ dnk(dnm dnmVar, int i) {
        this.b = i;
        this.a = dnmVar;
    }

    public /* synthetic */ dnk(dno dnoVar, int i) {
        this.b = i;
        this.a = dnoVar;
    }

    @Override // defpackage.ahv
    public final boolean a(Preference preference, Object obj) {
        dnb dnbVar;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                Object obj2 = this.a;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    dno dnoVar = (dno) obj2;
                    int size = dnoVar.d.size();
                    int i2 = dnoVar.e;
                    if (size + 1 > i2) {
                        Context context = dnoVar.b.j;
                        Toast.makeText(context, context.getString(R.string.f165270_resource_name_obfuscated_res_0x7f140856, Integer.valueOf(i2)), 0).show();
                        return false;
                    }
                }
                dno dnoVar2 = (dno) obj2;
                dnoVar2.f = true;
                jav f = jav.f(preference.t);
                if (booleanValue) {
                    dnoVar2.d.add(f);
                    return true;
                }
                dnoVar2.d.remove(f);
                return true;
            }
            Object obj3 = this.a;
            if (((Boolean) obj).booleanValue()) {
                ((ltd) ((ltd) fbf.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceDonationPromoManager", "updateVoiceDonationPreference", 438, "VoiceDonationPromoManager.java")).t("user toggles the voice donation setting");
                View decorView = ((Activity) obj3).getWindow().getDecorView();
                fbf.k((Context) obj3, decorView, decorView.getWindowToken(), false);
            } else {
                ((ltd) ((ltd) fbf.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceDonationPromoManager", "updateVoiceDonationPreference", 446, "VoiceDonationPromoManager.java")).t("user opt-out voice donation");
                hsk b = hsx.b();
                if (b != null) {
                    Context D = b.D();
                    kcu.U(fae.a(D, false), new eay(D, 11), gyc.b);
                }
            }
            return false;
        }
        Object obj4 = this.a;
        hqt hqtVar = (hqt) obj;
        if (hqtVar != null) {
            an anVar = (an) obj4;
            if (anVar.g >= 7) {
                dnm dnmVar = (dnm) obj4;
                Iterator it = dnmVar.ah.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        dnbVar = null;
                        break;
                    }
                    dnbVar = (dnb) it.next();
                    if (dnbVar.a.equals(hqtVar)) {
                        break;
                    }
                }
                if (dnbVar != null) {
                    if (dnbVar.c) {
                        if (dnmVar.ac || dnmVar.aE() != 1) {
                            dnbVar.c = false;
                        } else {
                            Toast.makeText(anVar.fT(), (int) R.string.f176580_resource_name_obfuscated_res_0x7f140ce3, 0).show();
                        }
                    } else {
                        dnbVar.c = true;
                    }
                    dnmVar.aP();
                    dnmVar.aQ();
                    int aU = ((CommonPreferenceFragment) obj4).aU() - dnmVar.ai;
                    for (int i3 = 0; i3 < aU; i3++) {
                        PreferenceScreen fL = ((aih) obj4).fL();
                        int k = fL.k();
                        if (k > 0) {
                            fL.ai(fL.o(k - 1));
                        }
                    }
                    dnmVar.aJ();
                    return true;
                }
            }
        }
        return false;
    }
}
