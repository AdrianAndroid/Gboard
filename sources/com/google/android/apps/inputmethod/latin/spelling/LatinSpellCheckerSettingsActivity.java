package com.google.android.apps.inputmethod.latin.spelling;

import android.view.Menu;
import com.google.android.inputmethod.latin.R;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LatinSpellCheckerSettingsActivity extends dxz {
    @Override // defpackage.gut, defpackage.guu
    public final int l() {
        return R.xml.settings_spell_checker;
    }

    @Override // defpackage.dxz, defpackage.ow, android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    @Override // defpackage.dxz
    public final void p(Collection collection) {
        collection.add(new imy());
    }
}
