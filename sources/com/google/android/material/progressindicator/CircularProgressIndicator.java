package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class CircularProgressIndicator extends kvo {
    public CircularProgressIndicator(Context context) {
        this(context, null);
    }

    @Override // defpackage.kvo
    public final /* bridge */ /* synthetic */ kvp a(Context context, AttributeSet attributeSet) {
        return new kvw(context, attributeSet);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f9040_resource_name_obfuscated_res_0x7f0402ed);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.f207400_resource_name_obfuscated_res_0x7f150a29);
        Context context2 = getContext();
        kvw kvwVar = (kvw) this.a;
        setIndeterminateDrawable(new kwe(context2, kvwVar, new kvq(kvwVar), new kvv(kvwVar)));
        Context context3 = getContext();
        kvw kvwVar2 = (kvw) this.a;
        setProgressDrawable(new kvx(context3, kvwVar2, new kvq(kvwVar2)));
    }
}
