package com.google.android.libraries.avatar.customizer;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CustomizeAvatarActivity extends cx {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ap, defpackage.ow, defpackage.cc, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            giw.b();
            Bundle extras = getIntent().getExtras();
            if (extras == null || !extras.containsKey("styleId")) {
                throw new IllegalStateException("Missing extras. Did you launch the activity using CreateAvatarActivity#launchActivity()?");
            }
            extras.getInt("styleId");
            giw.b();
            throw null;
        } catch (gin e) {
            Log.w("CustomizeAvatarActivity", "Unable to start activity.", e);
            finish();
        }
    }

    @Override // defpackage.ow, android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    @Override // defpackage.ow, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return false;
    }
}
