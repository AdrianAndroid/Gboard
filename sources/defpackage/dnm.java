package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.preference.CheckBoxPreference;
import androidx.preference.PreferenceGroup;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.inputmethod.libs.languageselection.preference.KeyboardLayoutListPreference;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: dnm */
/* loaded from: classes.dex */
public final class dnm extends CommonPreferenceFragment implements hqv {
    public static final ltg c = ltg.j("com/google/android/apps/inputmethod/libs/languageselection/preference/LanguageSpecificSettingFragment");
    public boolean ac;
    public hqy ad;
    dno ae;
    public KeyboardLayoutListPreference af;
    public PreferenceGroup ag;
    public int ai;
    public mko aj;
    public mko ak;
    public ija am;
    private String an;
    private ViewGroup ao;
    private AppCompatTextView ap;
    public String d;
    public jav e = jav.d;
    public final List ah = new ArrayList();
    public boolean al = false;

    public static void aM(int i) {
        ieh.j().e(hxs.a, Integer.valueOf(i));
    }

    private final Collection bc() {
        List list = this.ah;
        bzg bzgVar = bzg.r;
        jdg.u(list);
        return new ljs(list, bzgVar);
    }

    @Override // com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment, defpackage.aih, defpackage.an
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View G = super.G(layoutInflater, viewGroup, bundle);
        ViewGroup viewGroup2 = ((gut) C()).o;
        this.ao = viewGroup2;
        ((Button) viewGroup2.findViewById(R.id.language_specific_setting_done_button)).setOnClickListener(new View.OnClickListener() { // from class: dnj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dnm dnmVar = dnm.this;
                if (!dnmVar.al) {
                    return;
                }
                if (dnmVar.ac) {
                    dnmVar.ad.i(dnmVar.aG());
                    ino M = ino.M(dnmVar.fT());
                    if (M.x(R.string.f162080_resource_name_obfuscated_res_0x7f1406f1, false)) {
                        ieh j = ieh.j();
                        dda ddaVar = dda.NATIVE_LANGUAGE_HINT_ADDED_LAYOUT;
                        Object[] objArr = new Object[2];
                        objArr[0] = dnmVar.e;
                        qq qqVar = new qq();
                        for (dnb dnbVar : dnmVar.ah) {
                            if (dnbVar.c && dnbVar.a()) {
                                qqVar.add(dnbVar.a);
                            }
                        }
                        objArr[1] = qqVar;
                        j.e(ddaVar, objArr);
                    }
                    if (M.x(R.string.f162150_resource_name_obfuscated_res_0x7f1406f8, false)) {
                        M.q(R.string.f160280_resource_name_obfuscated_res_0x7f140639, true);
                    }
                    dnm.aM(6);
                } else {
                    hqy hqyVar = dnmVar.ad;
                    jav javVar = dnmVar.e;
                    ArrayList<hqt> B = lre.B(dnmVar.aG());
                    hrx hrxVar = (hrx) hqyVar;
                    if (!hrxVar.n) {
                        throw new IllegalStateException("changeEnabledInputMethodEntries is called before initialized");
                    }
                    qq qqVar2 = new qq();
                    ArrayList arrayList = new ArrayList(hqr.b());
                    Iterator it = arrayList.iterator();
                    hqt x = hrxVar.x();
                    boolean z = false;
                    boolean z2 = false;
                    while (it.hasNext()) {
                        hqt hqtVar = (hqt) it.next();
                        if (hqtVar.i().equals(javVar)) {
                            if (B.contains(hqtVar)) {
                                qqVar2.add(hqtVar.p());
                            } else {
                                z |= hqtVar.equals(x);
                                it.remove();
                                z2 = true;
                            }
                        }
                    }
                    for (hqt hqtVar2 : B) {
                        if (qqVar2.add(hqtVar2.p())) {
                            arrayList.add(hqtVar2);
                            z2 = true;
                        }
                    }
                    if (z2) {
                        hrxVar.Z();
                        hrxVar.K(llp.o(arrayList));
                    }
                    if (z) {
                        hrxVar.W((hqt) arrayList.get(0));
                    }
                    dnm.aM(7);
                }
                lmz a = dnmVar.aR() ? dnmVar.ae.a() : null;
                for (dnb dnbVar2 : dnmVar.ah) {
                    if (dnbVar2.c) {
                        iin.p(dnmVar.fT(), dnbVar2.a, 2);
                        if (a != null) {
                            dnbVar2.a.r(a);
                        }
                    }
                }
                if (dnmVar.aR()) {
                    dnmVar.ae.f = false;
                    dnm.aM(9);
                }
                gqa.a(dnmVar.fT()).g(R.string.f165000_resource_name_obfuscated_res_0x7f14083b, new Object[0]);
                dnmVar.aK(-1);
            }
        });
        ((Button) this.ao.findViewById(R.id.f65410_resource_name_obfuscated_res_0x7f0b075c)).setOnClickListener(new cjr(this, 14));
        this.ap = (AppCompatTextView) this.ao.findViewById(R.id.f65420_resource_name_obfuscated_res_0x7f0b075e);
        aP();
        return G;
    }

    @Override // defpackage.an
    public final void R() {
        super.R();
        ija ijaVar = this.am;
        if (ijaVar != null) {
            ijaVar.f();
            this.am = null;
        }
        aH();
        aI();
        hqy hqyVar = this.ad;
        jav javVar = this.e;
        hrx hrxVar = (hrx) hqyVar;
        qq qqVar = (qq) hrxVar.D.get(javVar);
        if (qqVar != null) {
            qqVar.remove(this);
            if (qqVar.isEmpty()) {
                hrxVar.D.remove(javVar);
            }
        }
        KeyboardLayoutListPreference keyboardLayoutListPreference = this.af;
        if (keyboardLayoutListPreference != null) {
            keyboardLayoutListPreference.n = null;
            this.af = null;
        }
    }

    @Override // defpackage.an
    public final void T() {
        super.T();
        if (this.al && !this.ac && aR()) {
            lmz a = this.ae.a();
            for (dnb dnbVar : this.ah) {
                if (dnbVar.c && this.ad.q(dnbVar.a)) {
                    dnbVar.a.r(a);
                }
            }
            aM(9);
        }
    }

    @Override // com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment
    protected final int aB() {
        return 2;
    }

    public final int aE() {
        return bc().size();
    }

    public final Collection aF() {
        return jez.S(this.ah, dar.d);
    }

    public final Collection aG() {
        return jez.S(bc(), dar.c);
    }

    public final void aH() {
        mko mkoVar = this.aj;
        if (mkoVar != null) {
            mkoVar.cancel(true);
            this.aj = null;
        }
    }

    public final void aI() {
        mko mkoVar = this.ak;
        if (mkoVar != null) {
            mkoVar.cancel(true);
            this.ak = null;
        }
    }

    public final void aJ() {
        int[] iArr;
        ArrayList arrayList = new ArrayList();
        for (hqt hqtVar : aG()) {
            iav g = hqtVar.g();
            for (int i : g == null ? gvw.b : g.f.e) {
                Integer valueOf = Integer.valueOf(i);
                if (!arrayList.contains(valueOf)) {
                    aY(i);
                    arrayList.add(valueOf);
                }
            }
        }
        ba();
    }

    public final void aK(int i) {
        inx inxVar = (inx) B();
        if (inxVar != null) {
            inxVar.y(this, i, new Intent());
        }
    }

    @Override // com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment
    protected final void aL() {
        hqs.f(this.b, C());
    }

    @Override // defpackage.hqv
    public final void aN(jav javVar) {
        if (!javVar.equals(this.e)) {
            return;
        }
        mko mkoVar = this.aj;
        if (mkoVar != null) {
            mkoVar.d(new dgd(this, 11), gyc.b);
        } else {
            aO();
        }
    }

    public final void aO() {
        aI();
        ArrayList arrayList = new ArrayList();
        for (dnb dnbVar : this.ah) {
            hqt hqtVar = dnbVar.a;
            arrayList.add(this.ad.e(hqtVar.i(), hqtVar.p()));
        }
        mko G = kcu.G(arrayList);
        this.ak = G;
        kcu.U(G, new bvo(this, G, 13), gyc.a);
    }

    public final void aP() {
        int i;
        AppCompatTextView appCompatTextView = this.ap;
        boolean z = true;
        if (appCompatTextView != null) {
            appCompatTextView.setText(fT().getString(R.string.f164960_resource_name_obfuscated_res_0x7f140837, Integer.valueOf(aE())));
        }
        Iterator it = this.ah.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = 8;
                break;
            } else if (((dnb) it.next()).a()) {
                i = 0;
                break;
            }
        }
        this.ao.setVisibility(i);
        RecyclerView recyclerView = this.b;
        if (i != 8) {
            z = false;
        }
        hqs.e(recyclerView, z);
    }

    public final void aQ() {
        boolean z;
        PreferenceGroup preferenceGroup = this.ag;
        if (preferenceGroup == null) {
            return;
        }
        preferenceGroup.ae();
        dno dnoVar = this.ae;
        if (dnoVar != null) {
            Collection<hqt> aG = aG();
            int i = dnoVar.e;
            dnoVar.e = 0;
            for (hqt hqtVar : aG) {
                int e = hqtVar.e();
                dnoVar.e = e;
                if (e > 0) {
                    break;
                }
            }
            HashSet hashSet = new HashSet();
            for (hqt hqtVar2 : aG) {
                hashSet.addAll(hqtVar2.l());
            }
            HashSet hashSet2 = new HashSet();
            if (i != -1) {
                hashSet2.addAll(dnoVar.d);
            } else {
                for (hqt hqtVar3 : aG) {
                    lmz k = hqtVar3.k();
                    if (!k.isEmpty()) {
                        if (hashSet2.isEmpty()) {
                            hashSet2.addAll(k);
                        } else if (hashSet2.addAll(k)) {
                            ((ltd) ((ltd) dno.a.d()).k("com/google/android/apps/inputmethod/libs/languageselection/preference/MultilingualSettings", "initializeMultilingualList", 126, "MultilingualSettings.java")).G("The multilingual setting of entry(%s, %s) is not the same as previous entries.", hqtVar3.i(), hqtVar3.p());
                        }
                    }
                }
            }
            hashSet2.retainAll(jez.S(hashSet, dar.e));
            dnoVar.d.clear();
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                jav javVar = (jav) it.next();
                if (dnoVar.d.size() >= dnoVar.e) {
                    break;
                }
                dnoVar.d.add(javVar);
            }
            if (i != -1 && !hashSet.isEmpty()) {
                HashSet hashSet3 = new HashSet();
                hashSet3.addAll(jez.S(hashSet, dar.e));
                if (!hashSet2.equals(hashSet3)) {
                    dnoVar.f = true;
                }
            }
            Boolean bool = dnoVar.g;
            if (bool != null) {
                z = bool.booleanValue();
                dnoVar.g = null;
            } else {
                z = i != -1 ? ((TwoStatePreference) dnoVar.c).a : !dnoVar.d.isEmpty();
            }
            dnoVar.c.M(0);
            dnoVar.b.ah(dnoVar.c);
            dnoVar.c.k(z);
            dnoVar.c.J(!hashSet.isEmpty());
            dnoVar.b(hashSet.size(), z);
            dnk dnkVar = new dnk(dnoVar, 2);
            Iterator it2 = hashSet.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                hqt hqtVar4 = (hqt) it2.next();
                CheckBoxPreference checkBoxPreference = new CheckBoxPreference(dnoVar.b.j, null);
                i2++;
                checkBoxPreference.M(i2);
                dnoVar.b.ah(checkBoxPreference);
                checkBoxPreference.Q(hqtVar4.o(1));
                checkBoxPreference.L(hqtVar4.h().n);
                checkBoxPreference.n = dnkVar;
                checkBoxPreference.K(false);
                checkBoxPreference.R(z);
                checkBoxPreference.k(dnoVar.d.contains(hqtVar4.h()));
            }
        }
        PreferenceGroup preferenceGroup2 = this.ag;
        iav g = ((dnb) this.ah.get(0)).a.g();
        int i3 = g != null ? g.t : 0;
        if (i3 != 0) {
            aZ(i3, preferenceGroup2);
        }
        aJ();
        if (this.ag.k() != 0) {
            return;
        }
        this.ag.R(false);
    }

    public final boolean aR() {
        dno dnoVar = this.ae;
        return dnoVar != null && dnoVar.f;
    }

    @Override // com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment, defpackage.aih, defpackage.an
    public final void e(Bundle bundle) {
        super.e(bundle);
        Context fT = fT();
        if (this.ad == null) {
            this.ad = hrx.y(fT);
        }
        Bundle fV = bundle != null ? bundle : fV();
        this.e = (jav) fV.getParcelable("LANGUAGE_TAG");
        this.d = fV.getString("VARIANT");
        this.ac = fV.getBoolean("ADDING_NEW_LANGUAGE", false);
        this.an = fV.getString("hint_country");
        if (bundle != null) {
            gyc.b.hP(new bwt(this, fT, 20));
        }
        ija a = ijf.a(new dod(this, bundle, 1), hrx.c);
        this.am = a;
        a.e(mjl.a);
    }

    @Override // com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment
    protected final int gc() {
        return R.layout.f145030_resource_name_obfuscated_res_0x7f0e0521;
    }

    @Override // defpackage.aih, defpackage.an
    public final void h(Bundle bundle) {
        super.h(bundle);
        bundle.putParcelable("LANGUAGE_TAG", this.e);
        bundle.putString("VARIANT", this.d);
        bundle.putBoolean("ADDING_NEW_LANGUAGE", this.ac);
        bundle.putString("hint_country", this.an);
        ArrayList<String> arrayList = new ArrayList<>();
        for (dnb dnbVar : this.ah) {
            if (dnbVar.c) {
                arrayList.add(dnbVar.a.p());
            }
        }
        bundle.putStringArrayList("SELECTED_VARIANT_LIST", arrayList);
        if (aR()) {
            dno dnoVar = this.ae;
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("switch_preference_checked", ((TwoStatePreference) dnoVar.c).a);
            bundle2.putParcelableArrayList("enabled_languages", new ArrayList<>(dnoVar.d));
            bundle2.putInt("max_multilingual_count", dnoVar.e);
            bundle2.putBoolean("changed_by_user", dnoVar.f);
            bundle.putParcelable("MULTILINGUAL_SETTINGS", bundle2);
        }
    }

    @Override // com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment
    public final int hr() {
        return R.xml.setting_language_specific;
    }

    @Override // defpackage.aih, defpackage.an
    public final void j() {
        ibu.a(fT()).b();
        super.j();
    }
}
