package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public boolean d = true;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, jn.d(context, R.attr.f16100_resource_name_obfuscated_res_0x7f04062d, 16842891));
    }

    @Override // androidx.preference.PreferenceGroup
    public final boolean ag() {
        return false;
    }

    @Override // androidx.preference.Preference
    protected final void c() {
        ain ainVar;
        if (this.u != null || this.v != null || k() == 0 || (ainVar = this.k.f) == null) {
            return;
        }
        ainVar.ay();
    }
}
