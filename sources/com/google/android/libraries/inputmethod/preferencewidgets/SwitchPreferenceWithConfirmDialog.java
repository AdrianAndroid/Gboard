package com.google.android.libraries.inputmethod.preferencewidgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.SwitchPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SwitchPreferenceWithConfirmDialog extends SwitchPreference {
    private static final int[] c = {16843250};
    private static final int[] d = {16843251};
    private final CharSequence e;
    private final CharSequence f;

    public SwitchPreferenceWithConfirmDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c);
        this.e = obtainStyledAttributes.getText(0);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, d);
        this.f = obtainStyledAttributes2.getText(0);
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final boolean U(Object obj) {
        if (!super.U(obj)) {
            return false;
        }
        if (TextUtils.isEmpty(this.e) || TextUtils.isEmpty(this.f) || !((Boolean) obj).booleanValue()) {
            return true;
        }
        cu cuVar = new cu(this.j);
        cuVar.k(this.e);
        cuVar.g(this.f);
        cuVar.n(17039370, new ees(this, 11));
        cuVar.l(17039360, null);
        cv b = cuVar.b();
        b.show();
        TextView textView = (TextView) b.findViewById(16908299);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        return false;
    }
}
