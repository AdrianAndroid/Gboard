package com.google.android.apps.inputmethod.libs.crash;

import android.app.Activity;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public class UserFeedbackActivity extends Activity {
    static {
        lug lugVar = hin.a;
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fuj fujVar = new fuj();
        fujVar.b(new byp(this), false);
        fujVar.b = String.valueOf(getPackageName()).concat(".USER_INITIATED_FEEDBACK_REPORT");
        fui.a(this).j(fujVar.a());
        finish();
    }
}
