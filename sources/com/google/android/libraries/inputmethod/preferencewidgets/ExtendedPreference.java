package com.google.android.libraries.inputmethod.preferencewidgets;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ExtendedPreference extends Preference {
    private final hek a;

    public ExtendedPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = attributeSet != null ? new hek(context, attributeSet) : null;
    }

    @Override // androidx.preference.Preference
    public final void a(ais aisVar) {
        int i;
        super.a(aisVar);
        hek hekVar = this.a;
        if (hekVar != null) {
            TextView textView = (TextView) aisVar.F(16908304);
            Object obj = hekVar.b;
            if (obj != null) {
                textView.setMaxLines(((Integer) obj).intValue());
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            if (this.s == null && (i = this.r) != 0) {
                this.s = ej.a(this.j, i);
            }
            if (this.s == null) {
                return;
            }
            View F = aisVar.F(16908294);
            View F2 = aisVar.F(R.id.f56240_resource_name_obfuscated_res_0x7f0b0268);
            if (F2 == null || F == null) {
                return;
            }
            if (F2.getMeasuredWidth() == 0) {
                aisVar.a.measure(-2, -2);
            }
            F2.setPadding(((F2.getMeasuredWidth() - F.getMeasuredWidth()) - aisVar.a.getPaddingLeft()) / 2, F2.getPaddingTop(), 0, F2.getPaddingBottom());
        }
    }
}
