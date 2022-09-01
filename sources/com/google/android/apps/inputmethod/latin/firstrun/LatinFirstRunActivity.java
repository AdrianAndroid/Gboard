package com.google.android.apps.inputmethod.latin.firstrun;

import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LatinFirstRunActivity extends ddi {
    @Override // defpackage.ddi
    protected final int l() {
        return (!getIntent().getBooleanExtra("activation_page", false) || ddc.f(this)) ? R.array.f1410_resource_name_obfuscated_res_0x7f030028 : R.array.f1020_resource_name_obfuscated_res_0x7f030000;
    }

    @Override // defpackage.ddi
    public final String m() {
        return l() == R.array.f1410_resource_name_obfuscated_res_0x7f030028 ? "first_run_pages" : "activation_pages";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ddi, defpackage.ap, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (ddc.f(this)) {
            ieh.j().e(emm.SHARING_LINK_RECEIVED, new Object[0]);
        } else if (!ddc.e(this)) {
        } else {
            ieh.j().e(ifs.MIGRATION_LINK_RECEIVED, new Object[0]);
        }
    }
}
