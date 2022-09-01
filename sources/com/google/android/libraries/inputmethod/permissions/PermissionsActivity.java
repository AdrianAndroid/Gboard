package com.google.android.libraries.inputmethod.permissions;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PermissionsActivity extends Activity implements ty {
    private int a = -1;

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if ((getIntent().getFlags() & 1048576) != 0) {
            finish();
            return;
        }
        int i = -1;
        if (bundle != null) {
            i = bundle.getInt("request_code", -1);
        }
        this.a = i;
        getWindow().addFlags(8);
    }

    @Override // android.app.Activity, defpackage.ty
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.a == i) {
            ijt.e(this).j(i, strArr, iArr);
        }
        if (Build.VERSION.SDK_INT < 31 && getBaseContext() != null) {
            hsv.b();
        }
        finish();
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        if (Build.VERSION.SDK_INT < 31) {
            sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
        Bundle extras = getIntent().getExtras();
        if (this.a != -1 || extras == null) {
            return;
        }
        this.a = extras.getInt("request_code");
        String[] stringArray = extras.getStringArray("requested_permissions");
        String string = extras.getString("feature_key");
        if (this.a == -1 || stringArray == null || stringArray.length <= 0) {
            finish();
        } else {
            ijt.e(this).r(this.a, string, Arrays.asList(stringArray));
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("request_code", this.a);
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        ijt.e(this).h(this);
    }

    @Override // android.app.Activity
    protected final void onStop() {
        super.onStop();
        ijt.e(this).i(this);
    }
}
