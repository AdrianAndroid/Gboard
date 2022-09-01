package com.google.android.apps.inputmethod.libs.sharing;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.LinkableTextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GboardSharingSetupDonePage extends ddk {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/sharing/GboardSharingSetupDonePage");
    public final Context b;
    public ely c;

    public GboardSharingSetupDonePage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ddk, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        els elsVar = new els(this.b);
        if (ddc.f(this.b)) {
            String a2 = ddc.a(this.b);
            kcu.U(elsVar.l(a2), new cvt(this, elsVar, a2, 4), gyc.b);
        }
        View findViewById = findViewById(R.id.f55420_resource_name_obfuscated_res_0x7f0b0207);
        if (findViewById != null) {
            findViewById.setOnClickListener(new eiz(this, elsVar, 14));
        }
        LinkableTextView linkableTextView = (LinkableTextView) findViewById(R.id.f55430_resource_name_obfuscated_res_0x7f0b0208);
        if (linkableTextView != null) {
            linkableTextView.a = new bwd(this, 4);
        }
    }
}
