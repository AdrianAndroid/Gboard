package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context) {
        this(context, null);
    }

    @Override // androidx.preference.Preference
    public final boolean X() {
        return false;
    }

    @Override // androidx.preference.Preference
    public void a(ais aisVar) {
        super.a(aisVar);
        if (Build.VERSION.SDK_INT >= 28) {
            ahz.a(aisVar.a, true);
        }
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        return !super.X();
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, jn.d(context, R.attr.f16040_resource_name_obfuscated_res_0x7f040626, 16842892));
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
