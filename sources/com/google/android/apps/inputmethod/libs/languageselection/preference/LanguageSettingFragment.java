package com.google.android.apps.inputmethod.libs.languageselection.preference;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.preference.Preference;
import com.google.android.apps.inputmethod.libs.languageselection.LanguageDraggableView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LanguageSettingFragment extends CommonPreferenceFragment implements ine, dmr, imz {
    private RecyclerView ac;
    private boolean ad;
    private final hqq ae = new dni(this);
    public dms c;
    private Menu d;
    private View e;

    public static void aD(int i) {
        ieh.j().e(hxs.a, Integer.valueOf(i));
    }

    private final void aI(boolean z) {
        dms dmsVar = this.c;
        if (dmsVar != null) {
            dmsVar.k = z;
            dmsVar.B();
            for (dmv dmvVar : dmsVar.j) {
                dmvVar.b = false;
            }
            dmsVar.j(0, dmsVar.j.size());
        }
        aF();
    }

    @Override // com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment, defpackage.aih, defpackage.an
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View G = super.G(layoutInflater, viewGroup, bundle);
        RecyclerView recyclerView = (RecyclerView) G.findViewById(R.id.f65340_resource_name_obfuscated_res_0x7f0b0754);
        this.ac = recyclerView;
        dms dmsVar = this.c;
        dmsVar.e = recyclerView;
        recyclerView.aa(dmsVar);
        Context context = dmsVar.d;
        dmsVar.h = new ot(new dmp(dmsVar, context, (int) context.getResources().getDimension(R.dimen.f41720_resource_name_obfuscated_res_0x7f07063f), TypedValue.applyDimension(1, 8.0f, context.getResources().getDisplayMetrics())));
        dmsVar.h.i(recyclerView);
        recyclerView.ab(new dna(dmsVar.d, dmsVar));
        dmsVar.B();
        this.c.i = this;
        View aV = aV(R.id.f65350_resource_name_obfuscated_res_0x7f0b0756);
        this.e = aV;
        aV.findViewById(R.id.add_language_button).setOnClickListener(new cjr(this, 13));
        return G;
    }

    @Override // com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment, defpackage.an
    public final void Q(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        menuInflater.inflate(R.menu.f147140_resource_name_obfuscated_res_0x7f100004, menu);
        jbt.z(C(), menu);
        this.d = menu;
        aF();
    }

    @Override // defpackage.an
    public final void T() {
        super.T();
        ((dxz) C()).l = null;
        this.ae.e();
    }

    @Override // com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment, defpackage.an
    public final void U() {
        super.U();
        this.ad = false;
        ((dxz) C()).l = this;
        this.ae.d(mjl.a);
    }

    @Override // defpackage.dmr
    public final void a(View view) {
        LanguageDraggableView languageDraggableView = (LanguageDraggableView) view;
        dms dmsVar = this.c;
        if (dmsVar != null && dmsVar.k) {
            CheckBox checkBox = languageDraggableView.b;
            if (!checkBox.isChecked()) {
                int i = 0;
                for (dmv dmvVar : this.c.j) {
                    if (dmvVar.b) {
                        i++;
                    }
                }
                if (i + 1 == this.c.ha()) {
                    Toast.makeText(fT(), (int) R.string.f176570_resource_name_obfuscated_res_0x7f140ce2, 0).show();
                    return;
                }
            }
            checkBox.toggle();
        } else if (!this.ad) {
            Bundle bundle = new Bundle();
            dmv dmvVar2 = languageDraggableView.e;
            if (dmvVar2 != null) {
                hqt hqtVar = dmvVar2.a;
                bundle.putParcelable("LANGUAGE_TAG", hqtVar.i());
                bundle.putString("VARIANT", hqtVar.p());
                aX().x(dnm.class.getName(), bundle, 0, languageDraggableView.a.getText().toString(), this);
                this.ad = true;
                aD(3);
                return;
            }
            throw new IllegalStateException("Language item is not set");
        }
    }

    @Override // com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment
    protected final int aB() {
        return 0;
    }

    @Override // com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment
    protected final int aC() {
        return R.style.f194570_resource_name_obfuscated_res_0x7f150324;
    }

    public final void aE() {
        if (this.ad) {
            return;
        }
        this.ad = true;
        aX().x(dne.class.getName(), C().getIntent().getExtras(), R.string.f164900_resource_name_obfuscated_res_0x7f140831, "", this);
    }

    public final void aF() {
        dms dmsVar;
        if (this.d == null || (dmsVar = this.c) == null) {
            return;
        }
        boolean z = dmsVar.k;
        int ha = dmsVar.ha();
        MenuItem findItem = this.d.findItem(R.id.action_edit_language);
        int i = 0;
        if (findItem != null) {
            findItem.setVisible(ha > 1 && !z);
        }
        MenuItem findItem2 = this.d.findItem(R.id.action_remove_language);
        if (findItem2 != null) {
            findItem2.setVisible(ha > 1 && z);
        }
        View view = this.e;
        if (true == z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    @Override // defpackage.ine
    public final boolean aG() {
        dms dmsVar = this.c;
        if (dmsVar == null || !dmsVar.k) {
            return false;
        }
        aI(false);
        return true;
    }

    @Override // defpackage.imz
    public final boolean aH(Object obj) {
        return !TextUtils.equals(K(R.string.f165010_resource_name_obfuscated_res_0x7f14083c), ((Preference) obj).q);
    }

    @Override // defpackage.an
    public final boolean al(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_edit_language) {
            aI(true);
            return true;
        } else if (itemId != R.id.action_remove_language) {
            return false;
        } else {
            dms dmsVar = this.c;
            if (dmsVar != null) {
                boolean z = false;
                for (int size = dmsVar.j.size() - 1; size >= 0; size--) {
                    if (((dmv) dmsVar.j.get(size)).b) {
                        dmsVar.j.remove(size);
                        z = true;
                    }
                }
                if (z) {
                    dmsVar.C();
                    dmsVar.B();
                    dmsVar.fc();
                    dms.z(4);
                }
                aI(false);
                gqa.a(fT()).g(R.string.f164980_resource_name_obfuscated_res_0x7f140839, new Object[0]);
            }
            return true;
        }
    }

    @Override // defpackage.dmr
    public final void b() {
        aF();
    }

    @Override // com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment, defpackage.aih, defpackage.an
    public final void e(Bundle bundle) {
        super.e(bundle);
        ap C = C();
        dms dmsVar = new dms(C, hrx.y(C));
        this.c = dmsVar;
        if (bundle != null) {
            dmsVar.k = bundle.getBoolean("languageRemoveMode", false);
            ArrayList<String> stringArrayList = bundle.getStringArrayList("selectedLanguages");
            if (stringArrayList != null && !stringArrayList.isEmpty()) {
                qq qqVar = new qq(stringArrayList.size());
                qqVar.addAll(stringArrayList);
                hqy hqyVar = dmsVar.l;
                dmsVar.A(hqr.b());
                for (dmv dmvVar : dmsVar.j) {
                    dmvVar.b = qqVar.contains(dmvVar.a());
                }
                dmsVar.j(0, dmsVar.j.size());
            }
        }
        if (C.getIntent().getIntExtra("entry", -1) == 6) {
            aE();
        }
        aD(1);
    }

    @Override // defpackage.aih, defpackage.an
    public final void f() {
        super.f();
        this.ac.aa(null);
    }

    @Override // com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment
    protected final int gc() {
        return R.layout.f145010_resource_name_obfuscated_res_0x7f0e051f;
    }

    @Override // defpackage.aih, defpackage.an
    public final void h(Bundle bundle) {
        super.h(bundle);
        dms dmsVar = this.c;
        if (dmsVar != null) {
            bundle.putBoolean("languageRemoveMode", dmsVar.k);
            ArrayList<String> arrayList = new ArrayList<>();
            for (dmv dmvVar : dmsVar.j) {
                if (dmvVar.b) {
                    arrayList.add(dmvVar.a());
                }
            }
            bundle.putStringArrayList("selectedLanguages", arrayList);
        }
    }
}
