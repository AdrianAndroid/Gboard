package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.inputmethod.libs.theme.listing.preference.ThemeListingFragment;
import com.google.android.inputmethod.latin.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: euo  reason: default package */
/* loaded from: classes.dex */
public final class euo extends ktc {
    private static final ltg af = ltg.j("com/google/android/apps/inputmethod/libs/theme/listing/preference/ThemeDetailsFragment");
    public etl ac;
    public etk ad;
    public Drawable ae;

    @Override // defpackage.an
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        boolean z;
        View findViewById;
        etl etlVar = this.ac;
        if (etlVar != null) {
            etlVar.l.e();
            LayoutInflater from = LayoutInflater.from(etlVar.b);
            boolean z2 = true;
            if (etlVar.g.p()) {
                inflate = from.inflate(R.layout.f146680_resource_name_obfuscated_res_0x7f0e05dd, viewGroup, false);
                etlVar.h.f((ImageView) inflate.findViewById(R.id.f129760_resource_name_obfuscated_res_0x7f0b218f), (ImageView) inflate.findViewById(R.id.f129770_resource_name_obfuscated_res_0x7f0b2190));
            } else {
                inflate = from.inflate(R.layout.f146670_resource_name_obfuscated_res_0x7f0e05dc, viewGroup, false);
                etlVar.h.f((ImageView) inflate.findViewById(R.id.f129760_resource_name_obfuscated_res_0x7f0b218f));
            }
            etlVar.k = inflate;
            inflate.findViewById(R.id.f129720_resource_name_obfuscated_res_0x7f0b218b).setOnClickListener(new edc(etlVar, 18));
            String k = etlVar.g.k();
            int i = etlVar.f;
            if (i == 6 || i == 3 || i == 1) {
                View findViewById2 = inflate.findViewById(R.id.f129730_resource_name_obfuscated_res_0x7f0b218c);
                findViewById2.setOnClickListener(new edc(etlVar, 19));
                findViewById2.setVisibility(0);
                z = true;
            } else {
                z = false;
            }
            if (k == null || !erj.k(k)) {
                z2 = z;
            } else {
                View findViewById3 = inflate.findViewById(R.id.f129740_resource_name_obfuscated_res_0x7f0b218d);
                findViewById3.setOnClickListener(new edc(etlVar, 20));
                findViewById3.setVisibility(0);
            }
            if (etlVar.b() && z2 && (findViewById = inflate.findViewById(R.id.f129750_resource_name_obfuscated_res_0x7f0b218e)) != null) {
                findViewById.setVisibility(0);
            }
            return inflate;
        }
        return null;
    }

    @Override // defpackage.an
    public final void P(int i, int i2, Intent intent) {
        Bundle extras;
        etl etlVar = this.ac;
        if (etlVar == null || i != 101 || i2 != -1 || intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        String string = extras.getString("intent_extra_key_deleted_theme_file_name");
        if (TextUtils.isEmpty(string)) {
            ((ltd) etl.a.a(hip.a).k("com/google/android/apps/inputmethod/libs/theme/listing/ThemeDetailsFragmentPeer", "onActivityResult", 232, "ThemeDetailsFragmentPeer.java")).w("ThemeEditorActivity should set result data for key: %s", "intent_extra_key_deleted_theme_file_name");
            return;
        }
        String string2 = extras.getString("intent_extra_key_new_theme_file_name");
        if (!TextUtils.isEmpty(string2)) {
            etlVar.d.e(erh.EDITED, new Object[0]);
            etlVar.g = eul.g(etlVar.b, new eqg(erj.g(string2)));
            etq etqVar = etlVar.h;
            eul eulVar = etlVar.g;
            if (etqVar.e.p() != eulVar.p()) {
                ((ltd) etq.a.a(hip.a).k("com/google/android/apps/inputmethod/libs/theme/listing/ThemeDetailsPreviewManager", "setThemeListingItemSpec", 165, "ThemeDetailsPreviewManager.java")).t("themeListingItemSpec.supportDarkModePreview() must be same");
            } else {
                etqVar.e = eulVar;
                etp etpVar = etqVar.f[0];
                Objects.requireNonNull(eulVar);
                etpVar.a = new etm(eulVar, 1);
                if (eulVar.p()) {
                    etp etpVar2 = etqVar.f[1];
                    Objects.requireNonNull(eulVar);
                    etpVar2.a = new etm(eulVar, 0);
                }
                etqVar.g();
            }
            eul f = eul.f(etlVar.b, string);
            if (etl.a(etlVar.b, f)) {
                etlVar.g.l();
            }
            Context context = etlVar.b;
            eul eulVar2 = etlVar.g;
            ArrayList arrayList = new ArrayList(eti.a(context));
            boolean z = false;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (jdg.W(arrayList.get(i3), f)) {
                    arrayList.set(i3, eulVar2);
                    z = true;
                }
            }
            if (z) {
                eti.c(context, arrayList);
            }
            etk etkVar = etlVar.j;
            if (etkVar == null) {
                return;
            }
            etw etwVar = (etw) etkVar;
            File file = etwVar.n;
            if (file != null && jdg.W(file.getName(), string)) {
                etwVar.n = new File(etwVar.b.getFilesDir(), string2);
            }
            etwVar.l(string);
            etwVar.o();
            return;
        }
        etlVar.d.e(erh.DELETED, new Object[0]);
        eul f2 = eul.f(etlVar.b, string);
        if (etl.a(etlVar.b, f2)) {
            etlVar.c.v(R.string.f161570_resource_name_obfuscated_res_0x7f1406be);
        }
        eti.b(etlVar.b, f2);
        etk etkVar2 = etlVar.j;
        if (etkVar2 != null) {
            etkVar2.c(string);
            etlVar.j.d(f2);
        }
        etlVar.m.c();
    }

    @Override // defpackage.an
    public final void R() {
        this.ac = null;
        super.R();
    }

    @Override // defpackage.ktc, defpackage.du, defpackage.ai
    public final Dialog a(Bundle bundle) {
        Dialog a = super.a(bundle);
        BottomSheetBehavior a2 = ((ktb) a).a();
        a2.v = false;
        a2.B(3);
        a2.d = -1;
        return a;
    }

    @Override // defpackage.ai, defpackage.an
    public final void e(Bundle bundle) {
        super.e(bundle);
        Bundle bundle2 = this.m;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        Bundle bundle3 = bundle2;
        if (this.ad == null && bundle != null) {
            an z = z();
            if (z instanceof ThemeListingFragment) {
                this.ad = ((ThemeListingFragment) z).a;
            } else {
                ((ltd) af.a(hip.a).k("com/google/android/apps/inputmethod/libs/theme/listing/preference/ThemeDetailsFragment", "onCreate", 49, "ThemeDetailsFragment.java")).w("Target fragment is not ThemeListingFragment: %s", z);
            }
        }
        inx inxVar = (inx) C();
        etl etlVar = new etl(inxVar, new ewj(inxVar, this), ieh.j(), bundle3, this.ae, null);
        this.ac = etlVar;
        etlVar.j = this.ad;
    }

    @Override // defpackage.ai, defpackage.an
    public final void f() {
        etp[] etpVarArr;
        etl etlVar = this.ac;
        if (etlVar != null) {
            etlVar.l.f();
            for (etp etpVar : etlVar.h.f) {
                etpVar.a();
                etpVar.b = null;
            }
        }
        super.f();
    }

    @Override // defpackage.ai, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        etk etkVar;
        super.onDismiss(dialogInterface);
        etl etlVar = this.ac;
        if (etlVar == null || (etkVar = etlVar.j) == null) {
            return;
        }
        etw etwVar = (etw) etkVar;
        File file = etwVar.n;
        if (file != null) {
            if (!file.delete()) {
                ((ltd) ((ltd) etw.a.d()).k("com/google/android/apps/inputmethod/libs/theme/listing/ThemeListingFragmentPeer", "onDismiss", 616, "ThemeListingFragmentPeer.java")).w("Failed to delete unapplied theme file: %s", etwVar.n);
            }
            etwVar.n = null;
        }
        etwVar.m = false;
    }
}
