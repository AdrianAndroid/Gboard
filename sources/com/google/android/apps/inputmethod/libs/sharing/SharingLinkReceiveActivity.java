package com.google.android.apps.inputmethod.libs.sharing;

import android.os.Bundle;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SharingLinkReceiveActivity extends cx {
    public els k;

    public static void l(mdy mdyVar) {
        ieh.j().e(emm.SHARING_USAGE, mdx.RECEIVE_PAGE, mdyVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ap, defpackage.ow, defpackage.cc, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setTitle("");
        setContentView(R.layout.f134790_resource_name_obfuscated_res_0x7f0e00c5);
        els elsVar = new els(this);
        this.k = elsVar;
        elsVar.e(new emc(this, 1));
    }
}
