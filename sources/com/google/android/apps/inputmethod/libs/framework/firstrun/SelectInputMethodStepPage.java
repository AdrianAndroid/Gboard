package com.google.android.apps.inputmethod.libs.framework.firstrun;

import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SelectInputMethodStepPage extends dde {
    private jaq c;

    public SelectInputMethodStepPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new jaq(context);
    }

    @Override // defpackage.dde
    protected final CharSequence a() {
        return Html.fromHtml(getResources().getString(R.string.f152270_resource_name_obfuscated_res_0x7f14026c, getResources().getString(R.string.ime_name)));
    }

    @Override // defpackage.dde
    public final void b() {
        this.c.c.showInputMethodPicker();
    }

    @Override // defpackage.dde
    protected final boolean c() {
        jaq.e();
        boolean j = this.c.j();
        if (j) {
            ieh.j().e(ddj.a, new Object[0]);
        }
        return j;
    }
}
