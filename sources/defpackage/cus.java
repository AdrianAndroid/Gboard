package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import com.google.android.apps.inputmethod.libs.search.contentsuggestion.ContentSuggestionKeyboard;
import com.google.android.inputmethod.latin.R;
import com.google.android.keyboard.client.delight5.ConceptPredictionApi;
import com.google.android.libraries.inputmethod.ime.DummyIme;
import com.google.android.libraries.inputmethod.preferencewidgets.CustomContentDescriptionPreference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: cus  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cus implements leq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cus(ContentSuggestionKeyboard contentSuggestionKeyboard, int i) {
        this.b = i;
        this.a = contentSuggestionKeyboard;
    }

    public /* synthetic */ cus(cws cwsVar, int i) {
        this.b = i;
        this.a = cwsVar;
    }

    public /* synthetic */ cus(cwu cwuVar, int i) {
        this.b = i;
        this.a = cwuVar;
    }

    public /* synthetic */ cus(dbn dbnVar, int i) {
        this.b = i;
        this.a = dbnVar;
    }

    public /* synthetic */ cus(dhn dhnVar, int i) {
        this.b = i;
        this.a = dhnVar;
    }

    public /* synthetic */ cus(dne dneVar, int i) {
        this.b = i;
        this.a = dneVar;
    }

    public /* synthetic */ cus(duk dukVar, int i) {
        this.b = i;
        this.a = dukVar;
    }

    public /* synthetic */ cus(dur durVar, int i) {
        this.b = i;
        this.a = durVar;
    }

    public /* synthetic */ cus(dzl dzlVar, int i) {
        this.b = i;
        this.a = dzlVar;
    }

    public /* synthetic */ cus(fhf fhfVar, int i) {
        this.b = i;
        this.a = fhfVar;
    }

    public /* synthetic */ cus(fhg fhgVar, int i) {
        this.b = i;
        this.a = fhgVar;
    }

    public /* synthetic */ cus(fik fikVar, int i) {
        this.b = i;
        this.a = fikVar;
    }

    public /* synthetic */ cus(fio fioVar, int i) {
        this.b = i;
        this.a = fioVar;
    }

    public /* synthetic */ cus(his hisVar, int i) {
        this.b = i;
        this.a = hisVar;
    }

    public /* synthetic */ cus(String str, int i) {
        this.b = i;
        this.a = str;
    }

    public /* synthetic */ cus(llp llpVar, int i) {
        this.b = i;
        this.a = llpVar;
    }

    public /* synthetic */ cus(nfh nfhVar, int i) {
        this.b = i;
        this.a = nfhVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [his, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, dcy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [his, java.lang.Object] */
    @Override // defpackage.leq
    public final Object a(Object obj) {
        ArrayList<? extends Parcelable> arrayList;
        mwb mwbVar;
        mwd mwdVar;
        String c;
        dcz dczVar = null;
        boolean z = false;
        switch (this.b) {
            case 0:
                return new cut((View) obj, this.a, false);
            case 1:
                return new cut((View) obj, this.a, true);
            case 2:
                Object obj2 = this.a;
                hhl hhlVar = cwc.a;
                cxb a = cxc.a();
                a.b = 2;
                String str = (String) obj2;
                a.e(str);
                a.d(str);
                a.a = str;
                a.g(iil.o);
                a.h((llp) obj);
                return a.a();
            case 3:
                cwt cwtVar = (cwt) obj;
                ((cws) this.a).g = cwtVar;
                return cwtVar;
            case 4:
                return ((cwu) this.a).a(((cwx) obj).k(2));
            case 5:
                ?? r0 = this.a;
                ibw ibwVar = (ibw) obj;
                r0.getClass().getSimpleName();
                if (ibwVar != null) {
                    Context context = ((dbn) r0).c;
                    iat a2 = iav.a();
                    a2.b = String.valueOf(dbn.class.getName()).concat("_dummy");
                    a2.c = DummyIme.class.getName();
                    jav c2 = hqp.c();
                    if (c2 != null) {
                        a2.j(c2.g);
                    } else {
                        a2.j(Locale.getDefault().getLanguage());
                    }
                    dczVar = new dcz(context, r0, ibwVar, a2.d());
                } else {
                    ((ltd) ((ltd) dbn.b.c()).k("com/google/android/apps/inputmethod/libs/extension/AbstractOpenableExtension", "lambda$createKeyboardGroupManagerListenableFuture$0", 168, "AbstractOpenableExtension.java")).t(" keyboardGroupDef is null");
                }
                return dczVar;
            case 6:
                Object obj3 = this.a;
                byy byyVar = (byy) obj;
                synchronized (((dhn) obj3).m) {
                    lyu a3 = lyu.a();
                    a3.d(byyVar);
                    String b = dhr.b(byyVar.h());
                    if (b == null) {
                        ((ltd) ((ltd) dhn.i.b()).k("com/google/android/apps/inputmethod/libs/handwriting/superpacks/HandwritingSuperpacks", "lambda$reloadCache$0", 205, "HandwritingSuperpacks.java")).w("updatePackMappingsCache(): pack mapping pack unavailable [%s]", ((dhn) obj3).c());
                        try {
                            a3.close();
                        } catch (IOException e) {
                            ((ltd) ((ltd) ((ltd) dhn.i.c()).i(e)).k("com/google/android/apps/inputmethod/libs/handwriting/superpacks/HandwritingSuperpacks", "lambda$reloadCache$0", 227, "HandwritingSuperpacks.java")).w("updatePackMappingsCache() [%s]", ((dhn) obj3).c());
                        }
                    } else {
                        byz c3 = byyVar.c(b);
                        a3.d(c3);
                        dhv dhvVar = (dhv) jan.b.a(c3.b(), (nhf) dhv.b.N(7));
                        if (dhvVar == null) {
                            ((ltd) ((ltd) dhn.i.c()).k("com/google/android/apps/inputmethod/libs/handwriting/superpacks/HandwritingSuperpacks", "lambda$reloadCache$0", 213, "HandwritingSuperpacks.java")).G("updatePackMappingsCache(): unable to parse %s [%s]", c3, ((dhn) obj3).c());
                            try {
                                a3.close();
                            } catch (IOException e2) {
                                ((ltd) ((ltd) ((ltd) dhn.i.c()).i(e2)).k("com/google/android/apps/inputmethod/libs/handwriting/superpacks/HandwritingSuperpacks", "lambda$reloadCache$0", 227, "HandwritingSuperpacks.java")).w("updatePackMappingsCache() [%s]", ((dhn) obj3).c());
                            }
                        } else {
                            HashMap hashMap = new HashMap();
                            for (dhu dhuVar : dhvVar.a) {
                                hashMap.put(jav.f(dhuVar.a), dhuVar);
                            }
                            ((dhn) obj3).n = hashMap;
                            z = true;
                            try {
                                a3.close();
                            } catch (IOException e3) {
                                ((ltd) ((ltd) ((ltd) dhn.i.c()).i(e3)).k("com/google/android/apps/inputmethod/libs/handwriting/superpacks/HandwritingSuperpacks", "lambda$reloadCache$0", 227, "HandwritingSuperpacks.java")).w("updatePackMappingsCache() [%s]", ((dhn) obj3).c());
                            }
                        }
                    }
                }
                return z;
            case 7:
                Object obj4 = this.a;
                ArrayList arrayList2 = new ArrayList();
                for (jav javVar : (Set) obj) {
                    arrayList2.add(dne.az((aih) obj4, javVar));
                }
                Collections.sort(arrayList2, ((dne) obj4).d);
                return llp.o(arrayList2);
            case 8:
                Object obj5 = this.a;
                List list = (List) obj;
                llp llpVar = (llp) list.get(0);
                if (llpVar != null) {
                    llk e4 = llp.e();
                    int size = llpVar.size();
                    for (int i = 0; i < size; i++) {
                        jav javVar2 = (jav) llpVar.get(i);
                        if (!TextUtils.isEmpty(javVar2.g)) {
                            e4.h(dne.az((aih) obj5, javVar2));
                        }
                    }
                    ((dne) obj5).ag = e4.g();
                } else {
                    ((ltd) ((ltd) dne.c.c()).k("com/google/android/apps/inputmethod/libs/languageselection/preference/AddLanguagePreferenceFragment", "onGetSuggestedLanguages", 234, "AddLanguagePreferenceFragment.java")).t("fail to get suggested languages");
                }
                llp<jav> llpVar2 = (llp) list.get(1);
                if (llpVar2 != null) {
                    qo qoVar = new qo();
                    for (jav javVar3 : llpVar2) {
                        String aA = dne.aA(javVar3);
                        if (!TextUtils.isEmpty(aA)) {
                            ArrayList arrayList3 = (ArrayList) qoVar.get(aA);
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                                qoVar.put(aA, arrayList3);
                            }
                            arrayList3.add(javVar3);
                        }
                    }
                    qq qqVar = new qq();
                    ArrayList arrayList4 = new ArrayList();
                    for (jav javVar4 : llpVar2) {
                        String aA2 = dne.aA(javVar4);
                        if (!TextUtils.isEmpty(aA2) && qqVar.add(aA2) && (arrayList = (ArrayList) qoVar.get(aA2)) != null) {
                            if (arrayList.size() == 1) {
                                arrayList4.add(dne.az((aih) obj5, (jav) arrayList.get(0)));
                            } else {
                                an anVar = (an) obj5;
                                Context fT = anVar.fT();
                                CustomContentDescriptionPreference customContentDescriptionPreference = new CustomContentDescriptionPreference(fT, null);
                                String m = jav.f(aA2).m(fT);
                                customContentDescriptionPreference.K(false);
                                customContentDescriptionPreference.G = R.layout.f144610_resource_name_obfuscated_res_0x7f0e04f0;
                                customContentDescriptionPreference.Q(m);
                                customContentDescriptionPreference.L(aA2);
                                customContentDescriptionPreference.v = dnd.class.getName();
                                customContentDescriptionPreference.a = anVar.L(R.string.f147910_resource_name_obfuscated_res_0x7f140044, m, Integer.valueOf(arrayList.size()));
                                Bundle r = customContentDescriptionPreference.r();
                                Bundle bundle = anVar.m;
                                if (bundle != null) {
                                    r.putAll(bundle);
                                }
                                r.putParcelableArrayList("sub_menu_language_list_key", arrayList);
                                arrayList4.add(customContentDescriptionPreference);
                            }
                        }
                    }
                    dne dneVar = (dne) obj5;
                    Collections.sort(arrayList4, dneVar.d);
                    dneVar.af = llp.o(arrayList4);
                } else {
                    ((ltd) ((ltd) dne.c.c()).k("com/google/android/apps/inputmethod/libs/languageselection/preference/AddLanguagePreferenceFragment", "onGetAvailableLanguages", 244, "AddLanguagePreferenceFragment.java")).t("fail to get available languages");
                }
                ((dnn) obj5).aE().v(false);
                dne dneVar2 = (dne) obj5;
                MenuItem menuItem = dneVar2.e;
                if (menuItem != null) {
                    menuItem.setVisible(true);
                }
                dneVar2.aC();
                return null;
            case 9:
                kcq kcqVar = (kcq) obj;
                String str2 = ((fhg) this.a).a;
                if (!kcqVar.F() || (mwbVar = (mwb) ((iov) kcqVar.a).a((nhf) mwb.b.N(7), ((ConceptPredictionApi) kcqVar.b).conceptPredictionEmojiFromConcept(str2))) == null) {
                    return mwb.b;
                }
                nfh t = mwb.b.t();
                for (String str3 : mwbVar.a) {
                    String c4 = ((hbd) kcqVar.c).c(str3);
                    if (c4 != null) {
                        str3 = c4;
                    }
                    t.dT(str3);
                }
                return (mwb) t.cz();
            case 10:
                kcq kcqVar2 = (kcq) obj;
                ((duk) this.a).f.set(kcqVar2);
                return kcqVar2;
            case 11:
                kcq kcqVar3 = (kcq) obj;
                fhf fhfVar = (fhf) this.a;
                String str4 = fhfVar.a;
                String str5 = fhfVar.b;
                if (kcqVar3.F()) {
                    ((ConceptPredictionApi) kcqVar3.b).conceptPredictionSetUserPreferenceForConcept(str4, str5);
                }
                return null;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                String str6 = ((fio) this.a).a;
                nfh t2 = mwb.b.t();
                llp E = ((kcq) obj).E(str6, 5, true);
                int i2 = ((lrl) E).c;
                for (int i3 = 0; i3 < i2; i3++) {
                    t2.dT((String) E.get(i3));
                }
                return (mwb) t2.cz();
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                kcq kcqVar4 = (kcq) obj;
                String str7 = ((fik) this.a).a;
                if (!kcqVar4.F() || (mwdVar = (mwd) ((iov) kcqVar4.a).a((nhf) mwd.b.N(7), ((ConceptPredictionApi) kcqVar4.b).conceptPredictionRankedEmojiPrediction(str7))) == null) {
                    return mwd.b;
                }
                nfh t3 = mwd.b.t();
                for (mwc mwcVar : mwdVar.a) {
                    nfh u = mwc.f.u(mwcVar);
                    if ((mwcVar.a & 2) != 0 && (c = ((hbd) kcqVar4.c).c(mwcVar.c)) != null) {
                        if (u.c) {
                            u.cD();
                            u.c = false;
                        }
                        mwc mwcVar2 = (mwc) u.b;
                        mwcVar2.a |= 2;
                        mwcVar2.c = c;
                    }
                    mwc mwcVar3 = (mwc) u.cz();
                    if (t3.c) {
                        t3.cD();
                        t3.c = false;
                    }
                    mwd mwdVar2 = (mwd) t3.b;
                    mwcVar3.getClass();
                    nga ngaVar = mwdVar2.a;
                    if (!ngaVar.c()) {
                        mwdVar2.a = nfm.H(ngaVar);
                    }
                    mwdVar2.a.add(mwcVar3);
                }
                return (mwd) t3.cz();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj6 = this.a;
                ((ltd) ((ltd) dur.a.c()).k("com/google/android/apps/inputmethod/libs/nga/impl/service/NgaContextHelper", "lambda$buildOrationContext$1", 146, "NgaContextHelper.java")).w("Failed to get supported emoji concepts due to error: %s.", ((Throwable) obj).getMessage());
                return (bkq) ((nfh) obj6).cz();
            case 15:
                kcq kcqVar5 = (kcq) obj;
                ((dur) this.a).f.set(kcqVar5);
                return kcqVar5;
            case 16:
                llp llpVar3 = (llp) obj;
                llp n = fgy.n(llpVar3, new cjm((llp) this.a, 16));
                if (n.size() != llpVar3.size()) {
                    n.size();
                }
                return n;
            case 17:
                dzl dzlVar = (dzl) this.a;
                return new eai(dzlVar.o, (View) obj, dar.k, new dzk(dzlVar, 2), dzlVar.p, null, null, null);
            case 18:
                Object obj7 = this.a;
                osr K = chc.K();
                K.e = (View) obj;
                K.b = dar.m;
                dzl dzlVar2 = (dzl) obj7;
                K.c = new dzk(dzlVar2, 0);
                K.d = dzlVar2.p;
                K.w(atk.HIGH);
                return K.v();
            case 19:
                ContentSuggestionKeyboard contentSuggestionKeyboard = (ContentSuggestionKeyboard) this.a;
                return new eai(contentSuggestionKeyboard.j, (View) obj, dzr.a, new dzk(contentSuggestionKeyboard, 3), contentSuggestionKeyboard.k, null, null, null);
            default:
                Object obj8 = this.a;
                osr K2 = chc.K();
                K2.e = (View) obj;
                K2.b = dzr.g;
                ContentSuggestionKeyboard contentSuggestionKeyboard2 = (ContentSuggestionKeyboard) obj8;
                K2.c = new dzk(contentSuggestionKeyboard2, 5);
                K2.d = contentSuggestionKeyboard2.k;
                K2.w(atk.HIGH);
                return K2.v();
        }
    }
}
