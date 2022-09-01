package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.libraries.inputmethod.preferencewidgets.DialogPreferenceCompat;

/* compiled from: PG */
/* renamed from: inu  reason: default package */
/* loaded from: classes.dex */
public final class inu extends aic {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aic
    public final void au(View view) {
        super.au(view);
        ((DialogPreferenceCompat) az()).k(view);
    }

    @Override // defpackage.aic
    public final void av(boolean z) {
        DialogPreferenceCompat dialogPreferenceCompat = (DialogPreferenceCompat) az();
        dialogPreferenceCompat.l(z);
        dialogPreferenceCompat.L = null;
    }

    @Override // defpackage.aic, defpackage.ai, defpackage.an
    public final void e(Bundle bundle) {
        if (this.m == null) {
            Z(new Bundle());
        }
        super.e(bundle);
        DialogPreferenceCompat dialogPreferenceCompat = (DialogPreferenceCompat) az();
        if (dialogPreferenceCompat != null) {
            dialogPreferenceCompat.L = this;
        } else {
            dismiss();
        }
    }

    @Override // defpackage.aic
    protected final void fa(cu cuVar) {
        ((DialogPreferenceCompat) az()).o(cuVar);
    }
}
