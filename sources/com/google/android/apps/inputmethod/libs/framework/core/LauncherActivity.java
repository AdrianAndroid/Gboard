package com.google.android.apps.inputmethod.libs.framework.core;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.inputmethod.InputMethodInfo;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LauncherActivity extends Activity {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/framework/core/LauncherActivity");
    boolean b = false;
    private boolean c;

    public final void a(boolean z) {
        if (this.b || !dcd.f(this, z)) {
            if (this.b || this.c || !ddc.f(this)) {
                InputMethodInfo b = new jaq(this).b();
                String settingsActivity = b != null ? b.getSettingsActivity() : null;
                if (settingsActivity != null) {
                    Intent intent = new Intent();
                    intent.setClassName(this, settingsActivity);
                    intent.setFlags(268468224);
                    intent.putExtra("entry", 2);
                    startActivity(intent);
                }
                finishAndRemoveTask();
                return;
            }
            Intent intent2 = new Intent();
            intent2.setClassName(getPackageName(), getString(R.string.f166220_resource_name_obfuscated_res_0x7f1408c2));
            intent2.setFlags(335544320);
            startActivity(intent2);
            this.c = true;
            return;
        }
        this.b = true;
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c = false;
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        if (!getResources().getBoolean(R.bool.f19350_resource_name_obfuscated_res_0x7f05000b) || this.b || this.c) {
            a(false);
            return;
        }
        try {
            gen c = mnl.a().c(getIntent());
            gei geiVar = new gei(gep.a, new dop(this, 1), 3);
            ((ger) c).f.e(geiVar);
            geq.a(this).b(geiVar);
            ((ger) c).m();
            gei geiVar2 = new gei(gep.a, new doq(this, 1), 2);
            ((ger) c).f.e(geiVar2);
            geq.a(this).b(geiVar2);
            ((ger) c).m();
        } catch (IncompatibleClassChangeError | NullPointerException e) {
            ((ltd) ((ltd) ((ltd) a.b()).i(e)).k("com/google/android/apps/inputmethod/libs/framework/core/LauncherActivity", "onResume", 'F', "LauncherActivity.java")).t("Failed to handle Firebase related method");
            a(false);
        }
    }
}
