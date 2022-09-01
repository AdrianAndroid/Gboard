package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

/* compiled from: PG */
/* renamed from: ahl  reason: default package */
/* loaded from: classes.dex */
public final class ahl extends aic {
    private EditText ac;
    private CharSequence ad;
    private final Runnable ae = new od(this, 14);
    private long af = -1;

    private final EditTextPreference aA() {
        return (EditTextPreference) az();
    }

    private final void aB(boolean z) {
        this.af = z ? SystemClock.currentThreadTimeMillis() : -1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aic
    public final void au(View view) {
        super.au(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.ac = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.ac.setText(this.ad);
        EditText editText2 = this.ac;
        editText2.setSelection(editText2.getText().length());
        aA();
    }

    @Override // defpackage.aic
    public final void av(boolean z) {
        if (z) {
            String obj = this.ac.getText().toString();
            EditTextPreference aA = aA();
            if (!aA.U(obj)) {
                return;
            }
            aA.i(obj);
        }
    }

    @Override // defpackage.aic
    protected final void aw() {
        aB(true);
        ax();
    }

    public final void ax() {
        long j = this.af;
        if (j == -1 || j + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = this.ac;
        if (editText == null || !editText.isFocused()) {
            aB(false);
        } else if (((InputMethodManager) this.ac.getContext().getSystemService("input_method")).showSoftInput(this.ac, 0)) {
            aB(false);
        } else {
            this.ac.removeCallbacks(this.ae);
            this.ac.postDelayed(this.ae, 50L);
        }
    }

    @Override // defpackage.aic
    protected final boolean ay() {
        return true;
    }

    @Override // defpackage.aic, defpackage.ai, defpackage.an
    public final void e(Bundle bundle) {
        super.e(bundle);
        if (bundle == null) {
            this.ad = aA().g;
        } else {
            this.ad = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // defpackage.aic, defpackage.ai, defpackage.an
    public final void h(Bundle bundle) {
        super.h(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.ad);
    }
}
