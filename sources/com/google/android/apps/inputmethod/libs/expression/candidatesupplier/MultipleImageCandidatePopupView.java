package com.google.android.apps.inputmethod.libs.expression.candidatesupplier;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.inputmethod.libs.expression.recyclerview.BindingRecyclerView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MultipleImageCandidatePopupView extends cin {
    public static final /* synthetic */ int e = 0;
    public final Context c;
    public final BindingRecyclerView d;

    public MultipleImageCandidatePopupView(Context context) {
        this(context, null);
    }

    @Override // defpackage.cin
    public final void a() {
        cuj a = this.d.a();
        if (a != null) {
            a.B();
        }
        this.d.aa(null);
    }

    public MultipleImageCandidatePopupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = context;
        View inflate = dbf.a(context).inflate(R.layout.f143590_resource_name_obfuscated_res_0x7f0e0477, (ViewGroup) this, true);
        aad.q(inflate, R.id.f54720_resource_name_obfuscated_res_0x7f0b01bf).setOutlineProvider(b);
        this.d = (BindingRecyclerView) aad.q(inflate, R.id.f54710_resource_name_obfuscated_res_0x7f0b01be);
    }
}
