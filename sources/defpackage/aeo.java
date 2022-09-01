package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* compiled from: PG */
/* renamed from: aeo  reason: default package */
/* loaded from: classes.dex */
public final class aeo implements TextWatcher {
    public boolean a = true;
    private final EditText b;

    public aeo(EditText editText) {
        this.b = editText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.b.isInEditMode() || !this.a) {
            return;
        }
        aef aefVar = aef.a;
    }
}
