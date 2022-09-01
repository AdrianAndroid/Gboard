package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard;
import com.google.android.apps.inputmethod.libs.search.keyboard.SearchKeyboard;
import com.google.android.apps.inputmethod.libs.search.widget.SearchCandidateListHolderView;
import com.google.android.apps.inputmethod.libs.sharing.SharingLinkReceiveActivity;
import com.google.android.apps.inputmethod.libs.theme.builder.ThemeEditorActivity;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.EditTextOnKeyboard;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: edc  reason: default package */
/* loaded from: classes.dex */
public final class edc implements View.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ edc(EditableKeyboard editableKeyboard, int i) {
        this.b = i;
        this.a = editableKeyboard;
    }

    public edc(EditableKeyboard editableKeyboard, int i, byte[] bArr) {
        this.b = i;
        this.a = editableKeyboard;
    }

    public /* synthetic */ edc(SearchCandidateListHolderView searchCandidateListHolderView, int i) {
        this.b = i;
        this.a = searchCandidateListHolderView;
    }

    public /* synthetic */ edc(SharingLinkReceiveActivity sharingLinkReceiveActivity, int i) {
        this.b = i;
        this.a = sharingLinkReceiveActivity;
    }

    public edc(ede edeVar, int i) {
        this.b = i;
        this.a = edeVar;
    }

    public /* synthetic */ edc(ede edeVar, int i, byte[] bArr) {
        this.b = i;
        this.a = edeVar;
    }

    public /* synthetic */ edc(eji ejiVar, int i) {
        this.b = i;
        this.a = ejiVar;
    }

    public edc(ekp ekpVar, int i) {
        this.b = i;
        this.a = ekpVar;
    }

    public /* synthetic */ edc(emf emfVar, int i) {
        this.b = i;
        this.a = emfVar;
    }

    public /* synthetic */ edc(emj emjVar, int i) {
        this.b = i;
        this.a = emjVar;
    }

    public /* synthetic */ edc(eoo eooVar, int i) {
        this.b = i;
        this.a = eooVar;
    }

    public /* synthetic */ edc(eov eovVar, int i) {
        this.b = i;
        this.a = eovVar;
    }

    public edc(epr eprVar, int i) {
        this.b = i;
        this.a = eprVar;
    }

    public /* synthetic */ edc(eps epsVar, int i) {
        this.b = i;
        this.a = epsVar;
    }

    public /* synthetic */ edc(etl etlVar, int i) {
        this.b = i;
        this.a = etlVar;
    }

    public /* synthetic */ edc(Runnable runnable, int i) {
        this.b = i;
        this.a = runnable;
    }

    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r10v94, types: [eps, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                ede edeVar = (ede) this.a;
                ecu ecuVar = edeVar.i;
                if (ecuVar != null) {
                    edeVar.j = new eas(this, 13);
                    ecuVar.close();
                    return;
                }
                ecw ecwVar = edeVar.k;
                if (ecwVar != null) {
                    edeVar.l = new eas(this, 14);
                    ecwVar.close();
                    return;
                }
                edeVar.k();
                return;
            case 1:
                ede edeVar2 = (ede) this.a;
                edeVar2.q(20);
                edeVar2.j = new eas(edeVar2, 11);
                ecu ecuVar2 = edeVar2.i;
                if (ecuVar2 == null) {
                    return;
                }
                ecuVar2.close();
                return;
            case 2:
                ((EditableKeyboard) this.a).v.z(hfd.d(new iay(-30008, null, null)));
                return;
            case 3:
                ((EditableKeyboard) this.a).v.z(hfd.d(new iay(-10060, null, null)));
                return;
            case 4:
                ?? r10 = this.a;
                ltg ltgVar = ehi.a;
                r10.run();
                return;
            case 5:
                ((eji) this.a).u.run();
                return;
            case 6:
                if (!((ekp) this.a).C.isEnabled()) {
                    ((ltd) ((ltd) ekt.S.b()).k("com/google/android/apps/inputmethod/libs/search/widget/AnimatedImageHolderView$ImageAdapterViewHolder$ImageHolderOnClickListener", "onClick", 664, "AnimatedImageHolderView.java")).t("Dropped click event since image holder view is disabled.");
                    return;
                }
                Object obj = this.a;
                ekp ekpVar = (ekp) obj;
                ekt ektVar = ekpVar.C;
                eku ekuVar = ektVar.W;
                cqp cqpVar = ekpVar.z;
                if (ekuVar == null || cqpVar == null) {
                    return;
                }
                if (view != ekpVar.s) {
                    if (view != ekpVar.v) {
                        return;
                    }
                    ((mo) obj).b();
                    String uri = cqpVar.d().toString();
                    ((mo) this.a).b();
                    ekuVar.b(uri);
                    return;
                }
                if (cqpVar.j().e()) {
                    dxs dxsVar = ektVar.ae;
                    cyo f = cyp.f();
                    f.c = 2;
                    f.b(cqpVar.o());
                    dxsVar.i(f.a());
                    llp llpVar = ((crn) cqpVar.j().a()).c;
                    int i = ((lrl) llpVar).c;
                    for (int i2 = 0; i2 < i; i2++) {
                        ((ekp) this.a).C.ae.l((Uri) llpVar.get(i2));
                    }
                }
                ekp ekpVar2 = (ekp) this.a;
                if (ekpVar2.C.ab && ekpVar2.t != null && ekpVar2.u != null && !TextUtils.isEmpty(cqpVar.p())) {
                    ekp ekpVar3 = (ekp) this.a;
                    ekpVar3.C.aI(ekpVar3.u);
                }
                Object obj2 = this.a;
                ((ekp) obj2).C.ac = ((mo) obj2).b();
                ekuVar.a(cqpVar, ((ekp) this.a).C.ac);
                ((mo) this.a).b();
                return;
            case 7:
                SearchCandidateListHolderView searchCandidateListHolderView = (SearchCandidateListHolderView) this.a;
                if (searchCandidateListHolderView.e == null) {
                    return;
                }
                int indexOf = searchCandidateListHolderView.d.indexOf(view);
                String str = "";
                if (indexOf >= 0) {
                    eep eepVar = (eep) searchCandidateListHolderView.e;
                    if (eepVar.c == null || indexOf >= eepVar.b.size()) {
                        ((ltd) eep.a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/keyboard/SearchCandidateListController", "onAutoFillText", 269, "SearchCandidateListController.java")).y("Tried to autofill a candidate at position %d [size=%d]", indexOf, eepVar.b.size());
                        return;
                    }
                    gsd gsdVar = eepVar.c;
                    CharSequence charSequence = ((hln) eepVar.b.get(indexOf)).a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    EditTextOnKeyboard editTextOnKeyboard = ((SearchKeyboard) gsdVar.b).e;
                    if (editTextOnKeyboard == null) {
                        return;
                    }
                    editTextOnKeyboard.setText(str);
                    Editable mo22getText = ((SearchKeyboard) gsdVar.b).e.mo22getText();
                    if (mo22getText == null) {
                        return;
                    }
                    ((SearchKeyboard) gsdVar.b).e.setSelection(mo22getText.length());
                    return;
                }
                int indexOf2 = searchCandidateListHolderView.b.indexOf(view);
                if (indexOf2 < 0) {
                    return;
                }
                eep eepVar2 = (eep) searchCandidateListHolderView.e;
                if (eepVar2.c == null || indexOf2 >= eepVar2.b.size()) {
                    ((ltd) eep.a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/keyboard/SearchCandidateListController", "onSelectCandidate", 249, "SearchCandidateListController.java")).y("Tried to select a candidate at position %d [size=%d]", indexOf2, eepVar2.b.size());
                    return;
                }
                gsd gsdVar2 = eepVar2.c;
                hln hlnVar = (hln) eepVar2.b.get(indexOf2);
                ((SearchKeyboard) gsdVar2.b).N(hlnVar);
                CharSequence charSequence2 = hlnVar.a;
                if (charSequence2 != null) {
                    str = charSequence2.toString();
                }
                EditTextOnKeyboard editTextOnKeyboard2 = ((SearchKeyboard) gsdVar2.b).e;
                if (editTextOnKeyboard2 != null) {
                    editTextOnKeyboard2.setText(str);
                    Editable mo22getText2 = ((SearchKeyboard) gsdVar2.b).e.mo22getText();
                    if (mo22getText2 != null) {
                        ((SearchKeyboard) gsdVar2.b).e.setSelection(mo22getText2.length());
                    }
                }
                ((SearchKeyboard) gsdVar2.b).K(str, hlnVar.e == hlm.CONTEXTUAL ? mba.CONTEXTUAL : mba.UNKNOWN);
                return;
            case 8:
                ((SharingLinkReceiveActivity) this.a).finish();
                return;
            case 9:
                Object obj3 = this.a;
                ely elyVar = new ely(llp.o(hqr.b()));
                Context context = (Context) obj3;
                View inflate = LayoutInflater.from(context).inflate(R.layout.f134840_resource_name_obfuscated_res_0x7f0e00ca, (ViewGroup) null);
                Dialog dialog = new Dialog(context);
                dialog.requestWindowFeature(1);
                dialog.setContentView(inflate);
                SharingLinkReceiveActivity sharingLinkReceiveActivity = (SharingLinkReceiveActivity) obj3;
                Display defaultDisplay = sharingLinkReceiveActivity.getWindow().getWindowManager().getDefaultDisplay();
                View findViewById = inflate.findViewById(R.id.f55820_resource_name_obfuscated_res_0x7f0b0234);
                double width = defaultDisplay.getWidth();
                Double.isNaN(width);
                findViewById.setMinimumWidth((int) (width * 0.78d));
                els.g((RecyclerView) inflate.findViewById(R.id.f55840_resource_name_obfuscated_res_0x7f0b0236), elyVar);
                inflate.findViewById(R.id.f55860_resource_name_obfuscated_res_0x7f0b0238).setOnClickListener(new buw(sharingLinkReceiveActivity, elyVar, dialog, 7));
                inflate.findViewById(R.id.f55850_resource_name_obfuscated_res_0x7f0b0237).setOnClickListener(new eiz(sharingLinkReceiveActivity, dialog, 16));
                dialog.show();
                SharingLinkReceiveActivity.l(mdy.ENTRYPOINT_CLICKED);
                return;
            case 10:
                Object obj4 = this.a;
                emf.a(mdt.CANCEL_CLICKED);
                ((dt) obj4).dismiss();
                return;
            case 11:
                Object obj5 = this.a;
                emj.h(view);
                ((emj) obj5).b();
                ((dt) obj5).dismiss();
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj6 = this.a;
                emj.h(view);
                ((emj) obj6).a();
                ((dt) obj6).dismiss();
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj7 = this.a;
                ieh.j().e(eoq.TOAST_SETTING_CLICKED, new Object[0]);
                hsk b = hsx.b();
                if (b == null) {
                    ((ltd) ((ltd) eoo.a.d()).k("com/google/android/apps/inputmethod/libs/splitprompt/SplitPromptConfirmationToast", "lambda$getOnClickListener$2", 79, "SplitPromptConfirmationToast.java")).t("No service. Cannot show split prompt confirmation toast.");
                    return;
                }
                ins insVar = new ins(20);
                insVar.b(((eoo) obj7).b, R.string.f162420_resource_name_obfuscated_res_0x7f140713, R.string.f162580_resource_name_obfuscated_res_0x7f140723);
                b.aC(insVar);
                hkp.b("split_prompt_confirmation_toast", false);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                eov eovVar = (eov) this.a;
                ino M = ino.M(eovVar.b);
                if (M.aj(R.string.f162580_resource_name_obfuscated_res_0x7f140723)) {
                    M.q(R.string.f162580_resource_name_obfuscated_res_0x7f140723, false);
                    M.f("show_split_confirmation_toast", true);
                }
                eovVar.a(eoq.TOOLTIP_SAVE);
                return;
            case 15:
                ((eov) this.a).a(eoq.TOOLTIP_CLICK_TO_DISMISS);
                return;
            case 16:
                ?? r102 = this.a;
                ltg ltgVar2 = epo.a;
                r102.p();
                return;
            case 17:
                ((epr) this.a).d();
                ((epr) this.a).b.p();
                return;
            case 18:
                etl etlVar = (etl) this.a;
                if (!etlVar.g.equals(eul.e(etlVar.b))) {
                    etlVar.d.e(erh.SELECTED, etlVar.g.c(etlVar.b));
                    etlVar.d.e(erh.CATEGORY_SELECT_THEME, Integer.valueOf(etlVar.f));
                }
                Context context2 = etlVar.b;
                eul eulVar = etlVar.g;
                if (eti.d(context2, eulVar)) {
                    ArrayList arrayList = new ArrayList(eti.a(context2));
                    arrayList.remove(eulVar);
                    arrayList.add(0, eulVar);
                    while (arrayList.size() > 10) {
                        arrayList.remove(arrayList.size() - 1);
                    }
                    eti.c(context2, arrayList);
                }
                etlVar.g.l();
                etlVar.c.q(R.string.f160900_resource_name_obfuscated_res_0x7f14067a, etlVar.i);
                etk etkVar = etlVar.j;
                if (etkVar != null) {
                    String str2 = etlVar.e;
                    eul eulVar2 = etlVar.g;
                    etw etwVar = (etw) etkVar;
                    if (etwVar.n != null) {
                        etwVar.n = null;
                        euf x = etwVar.h.x(etwVar.i);
                        x.f.add(1, new eub(str2, eulVar2));
                        x.g.add(1, etz.NONE);
                        int i3 = x.i;
                        if (i3 > 1) {
                            int i4 = x.j;
                            if (i4 == i3) {
                                x.j = i4 - 1;
                                x.m(i3 - 1);
                            }
                            x.j++;
                            x.hi(1);
                        }
                        etwVar.k = etwVar.i;
                    }
                    etwVar.m(etwVar.k, eulVar2);
                    if (etwVar.f) {
                        ewj ewjVar = etwVar.q;
                        gyc gycVar = gyc.b;
                        Object obj8 = ewjVar.b;
                        Objects.requireNonNull(obj8);
                        gycVar.hP(new emq((inx) obj8, 10));
                    }
                }
                etlVar.m.c();
                return;
            case 19:
                guc.a.a(((etl) this.a).b, "DeleteTheme");
                return;
            default:
                etl etlVar2 = (etl) this.a;
                etlVar2.d.e(erh.EDITOR_ACTIVITY_CREATED, new Object[0]);
                String k = etlVar2.g.k();
                if (k == null || !erj.j(k)) {
                    ((ltd) etl.a.a(hip.a).k("com/google/android/apps/inputmethod/libs/theme/listing/ThemeDetailsFragmentPeer", "onEditThemeButtonClicked", 345, "ThemeDetailsFragmentPeer.java")).t("'Edit theme' button should be visible only for custom themes.");
                    return;
                }
                File e = erj.e(etlVar2.b, k);
                Intent intent = new Intent(etlVar2.b, ThemeEditorActivity.class);
                intent.setAction("android.intent.action.MAIN");
                intent.putExtra("target_user_image_theme_file_name", e.getAbsolutePath());
                etlVar2.m.d(intent, 101, new Bundle());
                return;
        }
    }
}
