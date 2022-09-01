package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    private final aix c;
    private CharSequence d;
    private CharSequence e;

    public SwitchPreference(Context context) {
        this(context, null);
    }

    private final void ag(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.d);
            r4.setTextOff(this.e);
            r4.setOnCheckedChangeListener(this.c);
        }
    }

    @Override // androidx.preference.Preference
    public void a(ais aisVar) {
        super.a(aisVar);
        ag(aisVar.F(16908352));
        af(aisVar);
    }

    @Override // androidx.preference.Preference
    public final void hq(View view) {
        G();
        if (!((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            return;
        }
        ag(view.findViewById(16908352));
        ae(view.findViewById(16908304));
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, jn.d(context, R.attr.f17440_resource_name_obfuscated_res_0x7f0406f3, 16843629));
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = new aix(this, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ait.l, i, i2);
        o(jn.j(obtainStyledAttributes, 7, 0));
        l(jn.j(obtainStyledAttributes, 6, 1));
        this.d = jn.j(obtainStyledAttributes, 9, 3);
        d();
        this.e = jn.j(obtainStyledAttributes, 8, 4);
        d();
        ((TwoStatePreference) this).b = jn.k(obtainStyledAttributes, 5, 2, false);
        obtainStyledAttributes.recycle();
    }
}
