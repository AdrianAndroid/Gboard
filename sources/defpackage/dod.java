package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.preference.PreferenceGroup;
import com.google.android.apps.inputmethod.libs.languageselection.preference.KeyboardLayoutListPreference;
import com.google.android.apps.inputmethod.libs.latin5.LatinIme;
import com.google.android.apps.inputmethod.libs.mozc.ime.SimpleJapaneseIme;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.ime.AbstractIme;
import j$.util.function.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: dod  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dod implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ dod(LatinIme latinIme, hln hlnVar, int i) {
        this.c = i;
        this.a = latinIme;
        this.b = hlnVar;
    }

    public /* synthetic */ dod(LatinIme latinIme, icn icnVar, int i) {
        this.c = i;
        this.a = latinIme;
        this.b = icnVar;
    }

    public /* synthetic */ dod(LatinIme latinIme, oiy oiyVar, int i) {
        this.c = i;
        this.a = latinIme;
        this.b = oiyVar;
    }

    public /* synthetic */ dod(SimpleJapaneseIme simpleJapaneseIme, hln hlnVar, int i) {
        this.c = i;
        this.a = simpleJapaneseIme;
        this.b = hlnVar;
    }

    public /* synthetic */ dod(SimpleJapaneseIme simpleJapaneseIme, iay iayVar, int i) {
        this.c = i;
        this.a = simpleJapaneseIme;
        this.b = iayVar;
    }

    public /* synthetic */ dod(SimpleJapaneseIme simpleJapaneseIme, ibz ibzVar, int i) {
        this.c = i;
        this.a = simpleJapaneseIme;
        this.b = ibzVar;
    }

    public /* synthetic */ dod(SimpleJapaneseIme simpleJapaneseIme, oiy oiyVar, int i) {
        this.c = i;
        this.a = simpleJapaneseIme;
        this.b = oiyVar;
    }

    public /* synthetic */ dod(dnm dnmVar, Bundle bundle, int i) {
        this.c = i;
        this.b = dnmVar;
        this.a = bundle;
    }

    public /* synthetic */ dod(drj drjVar, List list, int i) {
        this.c = i;
        this.a = drjVar;
        this.b = list;
    }

    public /* synthetic */ dod(dtc dtcVar, dtp dtpVar, int i) {
        this.c = i;
        this.a = dtcVar;
        this.b = dtpVar;
    }

    public /* synthetic */ dod(duh duhVar, fgz fgzVar, int i) {
        this.c = i;
        this.a = duhVar;
        this.b = fgzVar;
    }

    public /* synthetic */ dod(duk dukVar, oin oinVar, int i) {
        this.c = i;
        this.a = dukVar;
        this.b = oinVar;
    }

    public /* synthetic */ dod(duo duoVar, dun dunVar, int i) {
        this.c = i;
        this.b = duoVar;
        this.a = dunVar;
    }

    public /* synthetic */ dod(duz duzVar, bkl bklVar, int i) {
        this.c = i;
        this.b = duzVar;
        this.a = bklVar;
    }

    public /* synthetic */ dod(duz duzVar, duy duyVar, int i) {
        this.c = i;
        this.b = duzVar;
        this.a = duyVar;
    }

    public /* synthetic */ dod(dvf dvfVar, fii fiiVar, int i) {
        this.c = i;
        this.a = dvfVar;
        this.b = fiiVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r1v81, types: [oin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v90, types: [duy, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        fgu fguVar;
        fgw fgwVar;
        bko bkoVar;
        bkn bknVar;
        fhk fhkVar;
        fhj fhjVar;
        fhq fhqVar;
        dui duiVar = null;
        switch (this.c) {
            case 0:
                Object obj = this.a;
                hnd hndVar = (hnd) this.b.a();
                LatinIme latinIme = (LatinIme) obj;
                latinIme.E.x();
                latinIme.E.hW();
                latinIme.E.hu(hndVar.b, hndVar.c, "", "", "", "", "");
                latinIme.E.D();
                latinIme.H();
                latinIme.k(true, true, 9);
                CharSequence charSequence = hndVar.a;
                if (charSequence == null || !((Boolean) hnb.a.c()).booleanValue()) {
                    latinIme.A.c();
                    return;
                } else {
                    latinIme.A.b(charSequence, ((AbstractIme) obj).J);
                    return;
                }
            case 1:
                Object obj2 = this.b;
                Object obj3 = this.a;
                final dnm dnmVar = (dnm) obj2;
                dnmVar.am = null;
                dnmVar.aH();
                dnmVar.aI();
                final Bundle bundle = (Bundle) obj3;
                mko g = mio.g(dnmVar.ad.d(dnmVar.e), new leq() { // from class: dnl
                    @Override // defpackage.leq
                    public final Object a(Object obj4) {
                        boolean z;
                        boolean z2;
                        dnm dnmVar2 = dnm.this;
                        Bundle bundle2 = bundle;
                        llp llpVar = (llp) obj4;
                        ArrayList arrayList = new ArrayList(llpVar.size());
                        Iterator it = llpVar.iterator();
                        while (true) {
                            z = false;
                            if (!it.hasNext()) {
                                break;
                            }
                            hqt hqtVar = (hqt) it.next();
                            if (dnmVar2.ac || !dnmVar2.ad.q(hqtVar)) {
                                hrx hrxVar = (hrx) dnmVar2.ad;
                                if (!hrxVar.q(hqtVar)) {
                                    jav i = hqtVar.i();
                                    if (hrxVar.P != null) {
                                        hrxVar.P.e(i);
                                        if (hrxVar.ad(0)) {
                                            if (hrxVar.ad(hqtVar.f())) {
                                                boe boeVar = hrxVar.N;
                                                if (boeVar != null && !boeVar.b(hqtVar.i().n, false)) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                hqy hqyVar = dnmVar2.ad;
                                jav javVar = dnmVar2.e;
                                hrx hrxVar2 = (hrx) hqyVar;
                                if (hrxVar2.P == null) {
                                    ((ltd) ((ltd) hrx.a.d()).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager", "isDefaultInputMethodEntry", 1519, "InputMethodEntryManager.java")).t("imeListDef is null.");
                                } else if (TextUtils.equals(hrxVar2.P.d(javVar), hqtVar.p())) {
                                    arrayList.add(0, hqtVar);
                                }
                            }
                            arrayList.add(hqtVar);
                        }
                        dnmVar2.ah.clear();
                        if (arrayList.isEmpty()) {
                            ((ltd) dnm.c.a(hip.a).k("com/google/android/apps/inputmethod/libs/languageselection/preference/LanguageSpecificSettingFragment", "initializeInputMethodEntryAndVariant", 460, "LanguageSpecificSettingFragment.java")).w("Couldn't get InputMethodEntries from LanguageTag %s", dnmVar2.e);
                        } else {
                            ArrayList<String> stringArrayList = bundle2 != null ? bundle2.getStringArrayList("SELECTED_VARIANT_LIST") : null;
                            int i2 = 0;
                            boolean z3 = false;
                            while (i2 < arrayList.size()) {
                                hqt hqtVar2 = (hqt) arrayList.get(i2);
                                boolean q = dnmVar2.ad.q(hqtVar2);
                                if (stringArrayList != null) {
                                    z2 = stringArrayList.contains(hqtVar2.p());
                                } else {
                                    if (!q) {
                                        if (!dnmVar2.ac || i2 != 0) {
                                            z2 = false;
                                        } else {
                                            i2 = 0;
                                        }
                                    }
                                    z2 = true;
                                }
                                z3 |= z2;
                                dnb dnbVar = new dnb(hqtVar2, q);
                                dnbVar.c = z2;
                                dnmVar2.ah.add(dnbVar);
                                i2++;
                            }
                            if (stringArrayList == null && dnmVar2.ac) {
                                dnmVar2.d = ((hqt) arrayList.get(0)).p();
                            }
                            if (bundle2 != null || z3) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= dnmVar2.ah.size()) {
                                        i3 = -1;
                                        break;
                                    } else if (TextUtils.equals(((dnb) dnmVar2.ah.get(i3)).a.p(), dnmVar2.d)) {
                                        break;
                                    } else {
                                        i3++;
                                    }
                                }
                                dnmVar2.bb();
                                dnmVar2.af = (KeyboardLayoutListPreference) dnmVar2.aW(R.string.f164950_resource_name_obfuscated_res_0x7f140836);
                                KeyboardLayoutListPreference keyboardLayoutListPreference = dnmVar2.af;
                                Collection aF = dnmVar2.aF();
                                Collection aG = dnmVar2.aG();
                                keyboardLayoutListPreference.b = i3;
                                keyboardLayoutListPreference.k(aF, aG);
                                dnmVar2.af.n = new dnk(dnmVar2, 0);
                                Iterator it2 = dnmVar2.ah.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (((dnb) it2.next()).a.x()) {
                                            z = true;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                dnmVar2.ag = (PreferenceGroup) dnmVar2.aW(R.string.f156500_resource_name_obfuscated_res_0x7f14043f);
                                if (z) {
                                    dnmVar2.ae = new dno(dnmVar2.ag);
                                    if (bundle2 != null) {
                                        dno dnoVar = dnmVar2.ae;
                                        Parcelable parcelable = bundle2.getParcelable("MULTILINGUAL_SETTINGS");
                                        if (parcelable != null) {
                                            Bundle bundle3 = (Bundle) parcelable;
                                            dnoVar.g = Boolean.valueOf(bundle3.getBoolean("switch_preference_checked"));
                                            ArrayList parcelableArrayList = bundle3.getParcelableArrayList("enabled_languages");
                                            if (parcelableArrayList != null) {
                                                dnoVar.d.addAll(parcelableArrayList);
                                            }
                                            dnoVar.e = bundle3.getInt("max_multilingual_count", -1);
                                            dnoVar.f = bundle3.getBoolean("changed_by_user");
                                        }
                                    }
                                }
                                dnmVar2.ai = dnmVar2.aU();
                                dnmVar2.aQ();
                                dnmVar2.aP();
                                z = true;
                            } else {
                                ((ltd) dnm.c.a(hip.a).k("com/google/android/apps/inputmethod/libs/languageselection/preference/LanguageSpecificSettingFragment", "initializeInputMethodEntryAndVariant", 492, "LanguageSpecificSettingFragment.java")).G("No enabled entries from LanguageTag %s and Variant %s", dnmVar2.e, dnmVar2.d);
                            }
                        }
                        return Boolean.valueOf(z);
                    }
                }, gyc.b);
                dnmVar.aj = g;
                kcu.U(g, new bvo(dnmVar, g, 12), gyc.a);
                hqy hqyVar = dnmVar.ad;
                jav javVar = dnmVar.e;
                hrx hrxVar = (hrx) hqyVar;
                qq qqVar = (qq) hrxVar.D.get(javVar);
                if (qqVar == null) {
                    qqVar = new qq();
                    hrxVar.D.put(javVar, qqVar);
                }
                qqVar.add(obj2);
                return;
            case 2:
                Object obj4 = this.a;
                Object obj5 = this.b;
                LatinIme latinIme2 = (LatinIme) obj4;
                latinIme2.A.c();
                latinIme2.E.x();
                latinIme2.E.hW();
                latinIme2.E.hV(((hln) obj5).a, false, 1);
                latinIme2.k(true, true, 4);
                latinIme2.E.D();
                latinIme2.D(hlw.SCRUB_DELETE_RESTORE, new Object[0]);
                return;
            case 3:
                Object obj6 = this.a;
                Object obj7 = this.b;
                LatinIme latinIme3 = (LatinIme) obj6;
                latinIme3.A.c();
                icn icnVar = (icn) obj7;
                latinIme3.E.hX(icnVar.a, icnVar.b, icnVar.c, false);
                latinIme3.k(false, false, 10);
                latinIme3.H();
                return;
            case 4:
                Object obj8 = this.a;
                ?? r1 = this.b;
                synchronized (((drj) obj8).c) {
                    Collections.sort(r1);
                    List b = drl.b(r1);
                    byte[] e = drl.e(b);
                    if (Arrays.equals(e, ((drj) obj8).d)) {
                        return;
                    }
                    ((drj) obj8).d = e;
                    ((drj) obj8).c.a("__auto_imported_android_shortcuts_dictionary", drl.a(b, "サジェストのみ"));
                    return;
                }
            case 5:
                Object obj9 = this.a;
                hnd hndVar2 = (hnd) this.b.a();
                SimpleJapaneseIme simpleJapaneseIme = (SimpleJapaneseIme) obj9;
                hls hlsVar = simpleJapaneseIme.E;
                int i = hndVar2.b;
                int i2 = hndVar2.c;
                hlsVar.x();
                hlsVar.hW();
                hlsVar.hu(i, i2, "", "", "", "", "");
                hlsVar.D();
                simpleJapaneseIme.gX();
                CharSequence charSequence2 = hndVar2.a;
                if (charSequence2 != null) {
                    simpleJapaneseIme.g.b(charSequence2, ((AbstractIme) obj9).J);
                    return;
                } else {
                    simpleJapaneseIme.g.c();
                    return;
                }
            case 6:
                Object obj10 = this.a;
                Object obj11 = this.b;
                SimpleJapaneseIme simpleJapaneseIme2 = (SimpleJapaneseIme) obj10;
                simpleJapaneseIme2.g.c();
                simpleJapaneseIme2.E.x();
                simpleJapaneseIme2.E.hW();
                simpleJapaneseIme2.E.hV(((hln) obj11).a, false, 1);
                simpleJapaneseIme2.E.D();
                return;
            case 7:
                Object obj12 = this.a;
                icn icnVar2 = (icn) ((iay) this.b).e;
                if (icnVar2 == null) {
                    return;
                }
                ((SimpleJapaneseIme) obj12).E.hX(icnVar2.a, icnVar2.b, icnVar2.c, false);
                return;
            case 8:
                ((SimpleJapaneseIme) this.a).E.O(hfd.d(new iay(-10004, null, ((ibz) this.b).l)));
                return;
            case 9:
                Object obj13 = this.a;
                Object obj14 = this.b;
                dtc dtcVar = (dtc) obj13;
                if (!dtcVar.c.k.d()) {
                    return;
                }
                dtcVar.h.d();
                dtp dtpVar = (dtp) obj14;
                dtpVar.e();
                dtpVar.l = false;
                dtcVar.h.f();
                dtcVar.g.d(fhz.CANDIDATE_SELECTED);
                return;
            case 10:
                Object obj15 = this.a;
                Object obj16 = this.b;
                dun dunVar = ((duh) obj15).a.d;
                fgz fgzVar = (fgz) obj16;
                if (fgzVar.a == 1) {
                    fguVar = (fgu) fgzVar.b;
                } else {
                    fguVar = fgu.e;
                }
                dunVar.g(dzg.h(fguVar));
                return;
            case 11:
                Object obj17 = this.a;
                Object obj18 = this.b;
                dun dunVar2 = ((duh) obj17).a.d;
                fgz fgzVar2 = (fgz) obj18;
                if (fgzVar2.a == 6) {
                    fgwVar = (fgw) fgzVar2.b;
                } else {
                    fgwVar = fgw.f;
                }
                dunVar2.g(fgwVar);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj19 = this.a;
                Object obj20 = this.b;
                dun dunVar3 = ((duh) obj19).a.d;
                fgz fgzVar3 = (fgz) obj20;
                if (fgzVar3.a == 2) {
                    bkoVar = (bko) fgzVar3.b;
                } else {
                    bkoVar = bko.i;
                }
                dunVar3.k(bkoVar);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj21 = this.a;
                Object obj22 = this.b;
                dun dunVar4 = ((duh) obj21).a.d;
                fgz fgzVar4 = (fgz) obj22;
                if (fgzVar4.a == 4) {
                    bknVar = (bkn) fgzVar4.b;
                } else {
                    bknVar = bkn.c;
                }
                dtc dtcVar2 = (dtc) dunVar4;
                dsx dsxVar = dtcVar2.c.k;
                if ((!dsxVar.g || !dsxVar.d || bknVar.a != 12) && !dsxVar.b()) {
                    ((ltd) ((ltd) dtc.a.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/NgaExtension", "handleUiCommand", 541, "NgaExtension.java")).w("cannot update UI in state %s", dtcVar2.c.k);
                    return;
                } else {
                    dtcVar2.h.g(bknVar);
                    return;
                }
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj23 = this.a;
                Object obj24 = this.b;
                dun dunVar5 = ((duh) obj23).a.d;
                fgz fgzVar5 = (fgz) obj24;
                if (fgzVar5.a == 3) {
                    fhkVar = (fhk) fgzVar5.b;
                } else {
                    fhkVar = fhk.b;
                }
                dunVar5.f(fhkVar.a);
                return;
            case 15:
                Object obj25 = this.b;
                Object obj26 = this.a;
                duj dujVar = (duj) obj25;
                Function function = dujVar.a;
                oin oinVar = dujVar.b;
                oinVar.c(function.apply(obj26));
                oinVar.a();
                return;
            case 16:
                Object obj27 = this.a;
                ?? r12 = this.b;
                nfh t = fhm.c.t();
                duk dukVar = (duk) obj27;
                bkl a = dukVar.c.a();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                a.getClass();
                ((fhm) t.b).a = a;
                boolean c = dukVar.c();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                ((fhm) t.b).b = c;
                r12.c((fhm) t.cz());
                r12.a();
                return;
            case 17:
                Object obj28 = this.b;
                Object obj29 = this.a;
                ((ltd) ((ltd) duz.a.b()).k("com/google/android/apps/inputmethod/libs/nga/impl/service/NgaGrpcClient", "connectInternal", 112, "NgaGrpcClient.java")).t("Attempting to connect");
                duz duzVar = (duz) obj28;
                if (duzVar.d == null) {
                    return;
                }
                oqv k = duzVar.k();
                nfh t2 = fir.c.t();
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                obj29.getClass();
                bkl bklVar = (bkl) obj29;
                ((fir) t2.b).a = bklVar;
                fhs fhsVar = bklVar.s;
                if (fhsVar == null) {
                    fhsVar = fhs.c;
                }
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                fhsVar.getClass();
                ((fir) t2.b).b = fhsVar;
                fir firVar = (fir) t2.cz();
                Object obj30 = k.b;
                nuq nuqVar = fgy.a;
                if (nuqVar == null) {
                    synchronized (fgy.class) {
                        nuqVar = fgy.a;
                        if (nuqVar == null) {
                            nun a2 = nuq.a();
                            a2.c = nup.UNARY;
                            a2.d = nuq.c("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.AssistantDictationService", "SetConnectionConfiguration");
                            a2.b();
                            a2.a = ohw.b(fir.c);
                            a2.b = ohw.b(fis.c);
                            nuqVar = a2.a();
                            fgy.a = nuqVar;
                        }
                    }
                }
                kcu.U(oig.a(((nsb) obj30).a(nuqVar, (nsa) k.a), firVar), new eay(duzVar, 1), gyc.b);
                return;
            case 18:
                Object obj31 = this.b;
                ?? r13 = this.a;
                duz duzVar2 = (duz) obj31;
                dui duiVar2 = duzVar2.e;
                if (duiVar2 != null) {
                    duiVar = duiVar2;
                } else if (duzVar2.d == null) {
                    ((ltd) ((ltd) duz.a.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/service/NgaGrpcClient", "getStreamManager", 415, "NgaGrpcClient.java")).t("using client without callback");
                } else {
                    synchronized (obj31) {
                        if (((duz) obj31).e == null) {
                            ((duz) obj31).e = new dui((duz) obj31, ((duz) obj31).d, new fgx(1).a(((duz) obj31).g(), nsa.a.d(oig.b, oid.ASYNC)), null);
                        }
                        duiVar = ((duz) obj31).e;
                    }
                }
                if (duiVar == null) {
                    return;
                }
                r13.a(duiVar);
                return;
            case 19:
                Object obj32 = this.a;
                Object obj33 = this.b;
                dun dunVar6 = ((dvf) obj32).d;
                fii fiiVar = (fii) obj33;
                if (fiiVar.a == 1) {
                    fhjVar = (fhj) fiiVar.b;
                } else {
                    fhjVar = fhj.b;
                }
                dunVar6.j(fhjVar);
                return;
            default:
                Object obj34 = this.a;
                fii fiiVar2 = (fii) this.b;
                if (fiiVar2.a == 2) {
                    fhqVar = (fhq) fiiVar2.b;
                } else {
                    fhqVar = fhq.c;
                }
                dvf dvfVar = (dvf) obj34;
                dvfVar.d.i(fhqVar, new dve(dvfVar, 0));
                return;
        }
    }
}
