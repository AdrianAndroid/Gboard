package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    private CharSequence c;
    private CharSequence d;
    private final aix e = new aix(this, 2);

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f17430_resource_name_obfuscated_res_0x7f0406f2, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ait.m, R.attr.f17430_resource_name_obfuscated_res_0x7f0406f2, 0);
        o(jn.j(obtainStyledAttributes, 7, 0));
        l(jn.j(obtainStyledAttributes, 6, 1));
        this.c = jn.j(obtainStyledAttributes, 9, 3);
        d();
        this.d = jn.j(obtainStyledAttributes, 8, 4);
        d();
        ((TwoStatePreference) this).b = jn.k(obtainStyledAttributes, 5, 2, false);
        obtainStyledAttributes.recycle();
    }

    private final void ag(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.e(this.c);
            switchCompat.requestLayout();
            if (switchCompat.isChecked()) {
                switchCompat.b();
            }
            switchCompat.d(this.d);
            switchCompat.requestLayout();
            if (!switchCompat.isChecked()) {
                switchCompat.a();
            }
            switchCompat.setOnCheckedChangeListener(this.e);
        }
    }

    @Override // androidx.preference.Preference
    public final void a(ais aisVar) {
        super.a(aisVar);
        ag(aisVar.F(R.id.f129260_resource_name_obfuscated_res_0x7f0b214a));
        af(aisVar);
    }

    @Override // androidx.preference.Preference
    public final void hq(View view) {
        G();
        if (!((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            return;
        }
        ag(view.findViewById(R.id.f129260_resource_name_obfuscated_res_0x7f0b214a));
        ae(view.findViewById(16908304));
    }
}
