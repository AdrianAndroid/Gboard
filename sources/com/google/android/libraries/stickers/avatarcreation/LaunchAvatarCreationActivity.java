package com.google.android.libraries.stickers.avatarcreation;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LaunchAvatarCreationActivity extends cx {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ap, defpackage.ow, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            setResult(i2, intent);
            finish();
        } else if (i == 1) {
            setResult(-1, intent);
            finish();
        } else if (i == 2) {
            try {
                byte[] byteArrayExtra = intent.getByteArrayExtra("avatar_sticker");
                intent.getBooleanExtra("is_pack_icon", false);
                setResult(-1, intent);
                String str = ((ncw) nfm.w(ncw.g, byteArrayExtra)).a;
                finish();
            } catch (ngd e) {
                Log.w("LaunchAvatarCreation", "Error parsing sticker.", e);
                setResult(-1, intent);
                finish();
            }
        } else {
            setResult(-1, intent);
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ap, defpackage.ow, defpackage.cc, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((knl) getApplicationContext()).b();
        ((knl) getApplicationContext()).e();
        throw new IllegalStateException("Missing Avatar Library in the Application Context.");
    }
}
