package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LinearProgressIndicator extends kvo {
    public LinearProgressIndicator(Context context) {
        this(context, null);
    }

    @Override // defpackage.kvo
    public final /* bridge */ /* synthetic */ kvp a(Context context, AttributeSet attributeSet) {
        return new kwn(context, attributeSet);
    }

    @Override // defpackage.kvo
    public final void g(int i) {
        kvp kvpVar = this.a;
        if (kvpVar == null || ((kwn) kvpVar).g != 0 || !isIndeterminate()) {
            super.g(i);
        }
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        kwn kwnVar = (kwn) this.a;
        boolean z2 = true;
        if (kwnVar.h != 1 && ((aad.f(this) != 1 || ((kwn) this.a).h != 2) && (aad.f(this) != 0 || ((kwn) this.a).h != 3))) {
            z2 = false;
        }
        kwnVar.i = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
        kwe indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        kvx progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f14020_resource_name_obfuscated_res_0x7f040529);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.f207490_resource_name_obfuscated_res_0x7f150a35);
        kwd kwmVar;
        Context context2 = getContext();
        kwn kwnVar = (kwn) this.a;
        kwf kwfVar = new kwf(kwnVar);
        if (kwnVar.g == 0) {
            kwmVar = new kwi(kwnVar);
        } else {
            kwmVar = new kwm(context2, kwnVar);
        }
        setIndeterminateDrawable(new kwe(context2, kwnVar, kwfVar, kwmVar));
        Context context3 = getContext();
        kwn kwnVar2 = (kwn) this.a;
        setProgressDrawable(new kvx(context3, kwnVar2, new kwf(kwnVar2)));
    }
}
