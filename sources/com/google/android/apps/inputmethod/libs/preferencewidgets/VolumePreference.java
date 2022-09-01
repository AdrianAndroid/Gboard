package com.google.android.apps.inputmethod.libs.preferencewidgets;

import android.content.Context;
import android.content.DialogInterface;
import android.media.AudioManager;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import java.text.NumberFormat;

/* compiled from: PG */
/* loaded from: classes.dex */
public class VolumePreference extends SeekBarDialogWithDefaultButtonPreference {
    private final lgb K;

    public VolumePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = jdg.n(new drf(context, 3));
    }

    private final float al() {
        return p(-1.0f);
    }

    private final int am(Object obj) {
        return Math.round(((Float) obj).floatValue() * ((SeekBarDialogPreference) this).g);
    }

    @Override // com.google.android.apps.inputmethod.libs.preferencewidgets.SeekBarDialogPreference
    protected final Object af(int i) {
        return Float.valueOf(i / ((SeekBarDialogPreference) this).g);
    }

    @Override // com.google.android.apps.inputmethod.libs.preferencewidgets.SeekBarDialogPreference
    public final String ag(int i) {
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        double d = i;
        double d2 = ((SeekBarDialogPreference) this).g;
        Double.isNaN(d);
        Double.isNaN(d2);
        return percentInstance.format(d / d2);
    }

    public final String ah(float f) {
        if (f < 0.0f) {
            return this.j.getString(R.string.f166110_resource_name_obfuscated_res_0x7f1408b7);
        }
        return ag(am(Float.valueOf(f)));
    }

    @Override // com.google.android.apps.inputmethod.libs.preferencewidgets.SeekBarDialogPreference
    public final void aj(int i) {
        ((AudioManager) this.K.a()).playSoundEffect(5, ((Float) af(i)).floatValue());
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        n(ah(al()));
    }

    @Override // com.google.android.apps.inputmethod.libs.preferencewidgets.SeekBarDialogPreference, com.google.android.libraries.inputmethod.preferencewidgets.DialogPreferenceCompat
    public final void k(View view) {
        super.k(view);
        ak(am(Float.valueOf(al())));
    }

    @Override // com.google.android.libraries.inputmethod.preferencewidgets.DialogPreferenceCompat, android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        super.onClick(dialogInterface, i);
        if (i == -3) {
            t().w(this.t);
            n(ah(-1.0f));
        } else if (i != -1) {
        } else {
            float floatValue = ((Float) af(ai())).floatValue();
            if (!U(Float.valueOf(floatValue))) {
                return;
            }
            aa(floatValue);
            n(ah(floatValue));
        }
    }
}
