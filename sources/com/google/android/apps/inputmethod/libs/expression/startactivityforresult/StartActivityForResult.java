package com.google.android.apps.inputmethod.libs.expression.startactivityforresult;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public class StartActivityForResult extends cx {
    private static final ltg k = ltg.j("com/google/android/apps/inputmethod/libs/expression/startactivityforresult/StartActivityForResult");
    private boolean l = false;

    public static boolean l(Context context, Intent intent, int i) {
        ((ltd) ((ltd) k.b()).k("com/google/android/apps/inputmethod/libs/expression/startactivityforresult/StartActivityForResult", "launch", 39, "StartActivityForResult.java")).u("Starting activity for result with requestCode=%d", i);
        Intent intent2 = new Intent(context, StartActivityForResult.class);
        intent2.addFlags(32768);
        intent2.addFlags(8388608);
        intent2.addFlags(65536);
        intent2.putExtra("intent", intent);
        intent2.putExtra("request_code", i);
        return dax.a(context, intent2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ap, defpackage.ow, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((ltd) ((ltd) k.b()).k("com/google/android/apps/inputmethod/libs/expression/startactivityforresult/StartActivityForResult", "onActivityResult", 88, "StartActivityForResult.java")).y("requestCode=%d, resultCode=%d", i, i2);
        this.l = true;
        ijl.b().g(new cvc());
    }

    @Override // defpackage.ap, defpackage.ow, defpackage.cc, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            return;
        }
        Intent intent = getIntent();
        if (intent == null) {
            throw new IllegalArgumentException("Activity intent is null");
        }
        Intent intent2 = (Intent) intent.getParcelableExtra("intent");
        if (intent2 == null) {
            throw new IllegalArgumentException("Start for result intent is missing");
        }
        if (!intent.hasExtra("request_code")) {
            throw new IllegalArgumentException("Start for result request code is missing");
        }
        startActivityForResult(intent2, intent.getIntExtra("request_code", Integer.MAX_VALUE));
        overridePendingTransition(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ap, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.l) {
            this.l = false;
            hsv.b();
            finish();
            overridePendingTransition(0, 0);
        }
    }
}
