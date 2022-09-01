package com.google.android.libraries.inputmethod.preferencewidgets;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.SwitchPreference;
import androidx.preference.TwoStatePreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AutoSyncedSwitchPreference extends SwitchPreference implements inm {
    public AutoSyncedSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.preference.Preference
    public final void C(aip aipVar) {
        super.C(aipVar);
        ino.L().Y(this, this.t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void F() {
        ino.L().af(this, this.t);
        super.T();
    }

    @Override // defpackage.inm
    public final void go(ino inoVar, String str) {
        boolean z = ((TwoStatePreference) this).a;
        k(inoVar.al(str, z, z));
    }
}
