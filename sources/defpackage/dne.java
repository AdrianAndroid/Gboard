package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.preference.Preference;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.preferencewidgets.PreferenceCategoryHeader;

/* compiled from: PG */
/* renamed from: dne  reason: default package */
/* loaded from: classes.dex */
public final class dne extends dnn implements ne {
    public SearchView ac;
    public mko ad;
    public mko ae;
    public ija ah;
    public dng ai;
    private PreferenceCategoryHeader ao;
    private PreferenceCategoryHeader ap;
    public MenuItem e;
    public static final ltg c = ltg.j("com/google/android/apps/inputmethod/libs/languageselection/preference/AddLanguagePreferenceFragment");
    private static final llw an = llw.l("tl", "fil");
    public final dnc d = new dnc();
    public llp af = llp.q();
    public llp ag = llp.q();

    public static String aA(jav javVar) {
        String str = javVar.g;
        return (String) an.getOrDefault(str, str);
    }

    public static Preference az(aih aihVar, jav javVar) {
        Preference preference = new Preference(aihVar.fT());
        preference.K(false);
        preference.Q(javVar.m(aihVar.fT()));
        preference.L(javVar.n);
        preference.v = dnm.class.getName();
        Bundle r = preference.r();
        if (aihVar.m != null) {
            r.putAll(aihVar.fV());
        }
        r.putBoolean("ADDING_NEW_LANGUAGE", true);
        r.putParcelable("LANGUAGE_TAG", javVar);
        return preference;
    }

    @Override // defpackage.dnn, defpackage.an
    public final void P(int i, int i2, Intent intent) {
        inx aE;
        if (i2 != -1 || (aE = aE()) == null) {
            return;
        }
        aE.y(this, -1, new Intent());
    }

    @Override // defpackage.an
    public final void Q(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        menuInflater.inflate(R.menu.f147120_resource_name_obfuscated_res_0x7f100002, menu);
        jbt.z(fT(), menu);
        MenuItem findItem = menu.findItem(R.id.f67970_resource_name_obfuscated_res_0x7f0b08ae);
        this.e = findItem;
        findItem.setOnActionExpandListener(aE());
        SearchView searchView = (SearchView) findItem.getActionView();
        this.ac = searchView;
        searchView.k = this;
        searchView.k(Integer.MAX_VALUE);
        SearchView searchView2 = this.ac;
        searchView2.j(searchView2.a.getImeOptions() | 268435456);
        hz hzVar = (hz) this.ac.findViewById(R.id.search_src_text);
        if (hzVar != null) {
            ham.q(hzVar);
        } else {
            ((ltd) ((ltd) c.c()).k("com/google/android/apps/inputmethod/libs/languageselection/preference/AddLanguagePreferenceFragment", "onCreateOptionsMenu", 122, "AddLanguagePreferenceFragment.java")).t("can't find the searchTextView");
        }
        mko mkoVar = this.ae;
        if (mkoVar == null || !mkoVar.isDone()) {
            findItem.setVisible(false);
        }
    }

    @Override // defpackage.an
    public final void R() {
        ija ijaVar = this.ah;
        if (ijaVar != null) {
            ijaVar.f();
            this.ah = null;
        }
        mko mkoVar = this.ae;
        if (mkoVar != null) {
            mkoVar.cancel(true);
            this.ae = null;
        }
        mko mkoVar2 = this.ad;
        if (mkoVar2 != null) {
            mkoVar2.cancel(true);
            this.ad = null;
        }
        super.R();
    }

    @Override // defpackage.an
    public final void S() {
        this.e = null;
    }

    @Override // defpackage.dnn, defpackage.an
    public final void T() {
        super.T();
        aB();
    }

    public final void aB() {
        SearchView searchView = this.ac;
        if (searchView != null) {
            searchView.clearFocus();
        }
    }

    public final void aC() {
        llp llpVar = this.ag;
        if (llpVar.isEmpty()) {
            ((ltd) ((ltd) c.d()).k("com/google/android/apps/inputmethod/libs/languageselection/preference/AddLanguagePreferenceFragment", "updateSuggestedLanguagePreferences", 255, "AddLanguagePreferenceFragment.java")).t("No suggested language is available");
            PreferenceCategoryHeader preferenceCategoryHeader = this.ap;
            if (preferenceCategoryHeader != null) {
                preferenceCategoryHeader.ae();
                this.am.ai(this.ap);
            }
        } else {
            PreferenceCategoryHeader preferenceCategoryHeader2 = this.ap;
            if (preferenceCategoryHeader2 == null) {
                PreferenceCategoryHeader preferenceCategoryHeader3 = new PreferenceCategoryHeader(fT(), null);
                this.ap = preferenceCategoryHeader3;
                preferenceCategoryHeader3.P(R.string.f153600_resource_name_obfuscated_res_0x7f140303);
                this.ap.M(1);
            } else {
                preferenceCategoryHeader2.ae();
            }
            this.am.ah(this.ap);
            lta listIterator = llpVar.listIterator();
            while (listIterator.hasNext()) {
                Preference preference = (Preference) listIterator.next();
                preference.M(Integer.MAX_VALUE);
                this.ap.ah(preference);
            }
        }
        llp<Preference> llpVar2 = this.af;
        if (llpVar2.isEmpty()) {
            ((ltd) ((ltd) c.d()).k("com/google/android/apps/inputmethod/libs/languageselection/preference/AddLanguagePreferenceFragment", "updateAllLanguagePreferences", 279, "AddLanguagePreferenceFragment.java")).t("The all language preference list is empty.");
            PreferenceCategoryHeader preferenceCategoryHeader4 = this.ao;
            if (preferenceCategoryHeader4 == null) {
                return;
            }
            preferenceCategoryHeader4.ae();
            this.am.ai(this.ao);
            return;
        }
        PreferenceCategoryHeader preferenceCategoryHeader5 = this.ao;
        if (preferenceCategoryHeader5 == null) {
            PreferenceCategoryHeader preferenceCategoryHeader6 = new PreferenceCategoryHeader(fT(), null);
            this.ao = preferenceCategoryHeader6;
            preferenceCategoryHeader6.P(R.string.f153590_resource_name_obfuscated_res_0x7f140302);
            this.ao.M(2);
        } else {
            preferenceCategoryHeader5.ae();
        }
        this.am.ah(this.ao);
        for (Preference preference2 : llpVar2) {
            preference2.M(Integer.MAX_VALUE);
            this.ao.ah(preference2);
        }
    }

    @Override // defpackage.dnn
    public final void aD(Preference preference) {
        MenuItem menuItem = this.e;
        if (menuItem != null) {
            menuItem.collapseActionView();
        }
        super.aD(preference);
    }

    @Override // defpackage.dnn, defpackage.aih, defpackage.an
    public final void e(Bundle bundle) {
        super.e(bundle);
        as();
        ija a = ijf.a(new dgd(this, 9), hrx.c);
        this.ah = a;
        a.e(gyc.b);
        aE().v(true);
    }
}
