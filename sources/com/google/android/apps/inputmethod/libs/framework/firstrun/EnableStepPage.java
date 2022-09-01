package com.google.android.apps.inputmethod.libs.framework.firstrun;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.provider.Settings;
import android.text.Html;
import android.util.AttributeSet;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EnableStepPage extends dde {
    public jaq c;

    public EnableStepPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new jaq(context);
    }

    @Override // defpackage.dde
    protected final CharSequence a() {
        return Html.fromHtml(getResources().getString(R.string.f152200_resource_name_obfuscated_res_0x7f140265, getResources().getString(R.string.ime_name)));
    }

    @Override // defpackage.dde
    public final void b() {
        jbt.H(getContext(), Settings.Secure.getUriFor("enabled_input_methods"), false, new ddf(this, new Handler()));
        this.c.b.startActivity(new Intent("android.settings.INPUT_METHOD_SETTINGS"));
    }

    @Override // defpackage.dde
    protected final boolean c() {
        jaq.e();
        return this.c.h();
    }
}
