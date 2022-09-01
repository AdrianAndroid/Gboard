package com.google.android.apps.inputmethod.libs.framework.firstrun;

import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class UserMetricsStepPage extends dde {
    public UserMetricsStepPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.dde
    protected final CharSequence a() {
        return Html.fromHtml(getResources().getString(R.string.f152260_resource_name_obfuscated_res_0x7f14026b, getResources().getString(R.string.ime_name)));
    }

    @Override // defpackage.dde
    public final void b() {
    }

    @Override // defpackage.dde
    protected final boolean c() {
        return false;
    }
}
