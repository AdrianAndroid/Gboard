package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.preference.Preference;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment;

/* compiled from: PG */
/* renamed from: brr  reason: default package */
/* loaded from: classes.dex */
public class brr extends CommonPreferenceFragment {
    private final brw c = new brw();

    @Override // defpackage.an
    public final void R() {
        brw brwVar = this.c;
        brwVar.h = true;
        brwVar.b.f();
        super.R();
    }

    @Override // com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment, defpackage.an
    public void U() {
        super.U();
        brw brwVar = this.c;
        brwVar.e = (Preference) g(R.string.f165920_resource_name_obfuscated_res_0x7f14089c);
        if (brwVar.e != null) {
            if (TextUtils.isEmpty(brwVar.f)) {
                brwVar.f = brwVar.e.m();
            }
            brwVar.e.o = brwVar;
        }
        brwVar.c();
    }

    @Override // com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment, defpackage.aih, defpackage.an
    public final void e(Bundle bundle) {
        super.e(bundle);
        brw brwVar = this.c;
        Context fT = fT();
        brwVar.c = fT;
        brwVar.h = false;
        ino.M(fT);
        brwVar.d = bundle != null ? bundle.getInt("CAPTCHA_NUMBER") : brw.b();
        brwVar.b.e();
    }

    @Override // defpackage.aih, defpackage.an
    public final void h(Bundle bundle) {
        super.h(bundle);
        bundle.putInt("CAPTCHA_NUMBER", this.c.d);
    }
}
