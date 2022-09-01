package com.google.android.libraries.avatar.creation;

import android.os.Bundle;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class CreateAvatarActivity extends cx {
    private ArrayList k;
    private boolean l;
    private boolean m;
    private int n;

    @Override // defpackage.ow, android.app.Activity
    public final void onBackPressed() {
        gir girVar = (gir) hB().d(R.id.f53540_resource_name_obfuscated_res_0x7f0b0128);
        if (girVar == null || !girVar.a()) {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ap, defpackage.ow, defpackage.cc, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z = false;
        this.n = getIntent().getIntExtra("theme_mode", 0);
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            throw new IllegalStateException("Missing extras. Did you launch the activity using CreateAvatarActivity#launchActivity()?");
        }
        ArrayList<Integer> integerArrayList = extras.getIntegerArrayList("styleIds");
        this.k = integerArrayList;
        if (integerArrayList == null) {
            this.k = new ArrayList();
        }
        this.l = !this.k.isEmpty() && extras.getBoolean("createNeverCreated", false);
        if (this.k.size() != 1 || this.l) {
            z = true;
        }
        this.m = extras.getBoolean("showPreview", z);
        setContentView(R.layout.f133890_resource_name_obfuscated_res_0x7f0e0058);
        if (bundle != null) {
            return;
        }
        ArrayList<Integer> arrayList = this.k;
        boolean z2 = this.m;
        boolean z3 = this.l;
        int i = this.n;
        Bundle bundle2 = new Bundle();
        bundle2.putIntegerArrayList("styleIds", arrayList);
        bundle2.putBoolean("showPreview", z2);
        bundle2.putBoolean("createNeverCreated", z3);
        bundle2.putInt("stickerThemeMode", i);
        giq giqVar = new giq();
        giqVar.Z(bundle2);
        bq i2 = hB().i();
        i2.t(R.id.f53540_resource_name_obfuscated_res_0x7f0b0128, giqVar);
        i2.j();
    }
}
