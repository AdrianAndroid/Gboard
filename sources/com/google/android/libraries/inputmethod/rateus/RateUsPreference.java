package com.google.android.libraries.inputmethod.rateus;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.preferencewidgets.ExtendedPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RateUsPreference extends ExtendedPreference {
    private final kon a;

    public RateUsPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new kon(context, new iqa());
    }

    @Override // androidx.preference.Preference
    public final void B() {
        super.H();
        kon konVar = this.a;
        ((guh) konVar.d).e();
        ((guh) konVar.a).e();
    }

    @Override // androidx.preference.Preference
    public final void E() {
        kon konVar = this.a;
        ((guh) konVar.d).f();
        ((guh) konVar.a).f();
        super.T();
    }

    @Override // androidx.preference.Preference
    protected final void c() {
        kon konVar = this.a;
        ieh.j().e(iqb.a, 2, konVar.f);
        ino.L().q(R.string.f161430_resource_name_obfuscated_res_0x7f1406b0, true);
        guc.a.a((Context) konVar.e, (String) konVar.c);
    }
}
