package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.inputmethod.libs.search.keyboard.SearchKeyboard;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.preferencewidgets.SwitchPreferenceWithConfirmDialog;
import com.google.android.libraries.inputmethod.preferencewidgets.list.ListPreference;
import java.io.File;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: ees  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ees implements DialogInterface.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ees(ahp ahpVar, int i) {
        this.b = i;
        this.a = ahpVar;
    }

    public /* synthetic */ ees(SwitchPreferenceWithConfirmDialog switchPreferenceWithConfirmDialog, int i) {
        this.b = i;
        this.a = switchPreferenceWithConfirmDialog;
    }

    public /* synthetic */ ees(eet eetVar, int i) {
        this.b = i;
        this.a = eetVar;
    }

    public /* synthetic */ ees(eme emeVar, int i) {
        this.b = i;
        this.a = emeVar;
    }

    public /* synthetic */ ees(emi emiVar, int i) {
        this.b = i;
        this.a = emiVar;
    }

    public /* synthetic */ ees(etj etjVar, int i) {
        this.b = i;
        this.a = etjVar;
    }

    public /* synthetic */ ees(eyv eyvVar, int i) {
        this.b = i;
        this.a = eyvVar;
    }

    public /* synthetic */ ees(fav favVar, int i) {
        this.b = i;
        this.a = favVar;
    }

    public /* synthetic */ ees(faw fawVar, int i) {
        this.b = i;
        this.a = fawVar;
    }

    public /* synthetic */ ees(ioe ioeVar, int i) {
        this.b = i;
        this.a = ioeVar;
    }

    public /* synthetic */ ees(iqc iqcVar, int i) {
        this.b = i;
        this.a = iqcVar;
    }

    public /* synthetic */ ees(iqd iqdVar, int i) {
        this.b = i;
        this.a = iqdVar;
    }

    public /* synthetic */ ees(njs njsVar, int i) {
        this.b = i;
        this.a = njsVar;
    }

    public /* synthetic */ ees(Runnable[] runnableArr, int i) {
        this.b = i;
        this.a = runnableArr;
    }

    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        File file = null;
        switch (this.b) {
            case 0:
                SearchKeyboard searchKeyboard = ((eet) this.a).b;
                searchKeyboard.b.e(ctd.RECENT_SEARCH_CANDIDATE_DELETE_CANCELLED, Integer.valueOf(searchKeyboard.l()));
                return;
            case 1:
                Object obj = this.a;
                ((ahp) obj).ac = i;
                ((aic) obj).ag = -1;
                dialogInterface.dismiss();
                return;
            case 2:
                emf emfVar = ((eme) this.a).a;
                ely elyVar = emfVar.b;
                if (elyVar == null) {
                    return;
                }
                emfVar.a.d(elyVar, mdu.ENABLE_DIALOG);
                return;
            case 3:
                emi emiVar = (emi) this.a;
                emj.c(emiVar.a);
                emiVar.b.b();
                return;
            case 4:
                emi emiVar2 = (emi) this.a;
                emj.c(emiVar2.a);
                emiVar2.b.a();
                return;
            case 5:
                etl etlVar = ((etj) this.a).a;
                etlVar.d.e(erh.DELETED, new Object[0]);
                String k = etlVar.g.k();
                if (k != null && erj.j(k)) {
                    file = erj.e(etlVar.b, k);
                }
                if (file != null && !file.delete()) {
                    ((ltd) ((ltd) etl.a.d()).k("com/google/android/apps/inputmethod/libs/theme/listing/ThemeDetailsFragmentPeer", "onDeleteThemeConfirmed", 326, "ThemeDetailsFragmentPeer.java")).w("Could not delete file: %s", file.getAbsolutePath());
                }
                if (etl.a(etlVar.b, etlVar.g)) {
                    etlVar.c.v(R.string.f161570_resource_name_obfuscated_res_0x7f1406be);
                }
                eti.b(etlVar.b, etlVar.g);
                etk etkVar = etlVar.j;
                if (etkVar != null) {
                    if (file != null) {
                        etkVar.c(file.getName());
                    }
                    etlVar.j.d(etlVar.g);
                }
                etlVar.m.c();
                return;
            case 6:
                Object obj2 = this.a;
                if (i != -1) {
                    ieh.j().e(ezo.OPEN, 0);
                    return;
                }
                ino.M(((Dialog) dialogInterface).getContext()).q(R.string.f162630_resource_name_obfuscated_res_0x7f140728, true);
                eyv eyvVar = (eyv) obj2;
                ?? r7 = eyvVar.a.b;
                if (r7 != 0) {
                    r7.run();
                }
                eyvVar.a.b = null;
                return;
            case 7:
                fav favVar = (fav) this.a;
                fax.h(favVar.a);
                favVar.b.c(fbm.VOICE_DONATION_INTRO_DIALOG_NEGATIVE_BUTTON_CLICKED);
                if (favVar.b.f == null) {
                    return;
                }
                fbf.d();
                return;
            case 8:
                faw fawVar = (faw) this.a;
                fax.h(fawVar.a);
                fawVar.b.c(fbm.VOICE_DONATION_CONSENT_DIALOG_NEGATIVE_BUTTON_CLICKED);
                return;
            case 9:
                Object obj3 = this.a;
                dialogInterface.dismiss();
                ((Runnable[]) obj3)[i].run();
                return;
            case 10:
                Object obj4 = this.a;
                dialogInterface.dismiss();
                ((Runnable[]) obj4)[i].run();
                return;
            case 11:
                ((TwoStatePreference) this.a).k(true);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj5 = this.a;
                if (i >= 0) {
                    ioe ioeVar = (ioe) obj5;
                    ListPreference listPreference = ioeVar.a;
                    if (i != listPreference.K) {
                        String obj6 = ((androidx.preference.ListPreference) listPreference).h[i].toString();
                        if (ioeVar.a.U(obj6)) {
                            ioeVar.a.o(obj6);
                        }
                    }
                }
                dialogInterface.dismiss();
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                kon konVar = ((iqc) this.a).a;
                ieh.j().e(iqb.a, 5, konVar.f);
                guc.a.a((Context) konVar.e, (String) konVar.b);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                kon konVar2 = ((iqc) this.a).a;
                ieh.j().e(iqb.a, 4, konVar2.f);
                hjg.k((Context) konVar2.e, null);
                return;
            case 15:
                ((iqd) this.a).a.d();
                return;
            default:
                int i2 = ((njs) this.a).a;
                throw null;
        }
    }
}
