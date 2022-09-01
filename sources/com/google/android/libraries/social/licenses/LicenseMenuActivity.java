package com.google.android.libraries.social.licenses;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LicenseMenuActivity extends cx {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ap, defpackage.ow, defpackage.cc, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f143300_resource_name_obfuscated_res_0x7f0e0452);
        if (g() != null) {
            g().g(true);
        }
        bi hB = hB();
        if (!(hB.d(R.id.f65590_resource_name_obfuscated_res_0x7f0b0778) instanceof knb)) {
            knb knbVar = new knb();
            bq i = hB.i();
            i.f(R.id.f65590_resource_name_obfuscated_res_0x7f0b0778, knbVar, null, 1);
            i.d();
        }
    }

    @Override // defpackage.ow, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
