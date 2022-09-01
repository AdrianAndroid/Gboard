package defpackage;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;
import com.google.android.libraries.inputmethod.widgets.PreferenceCheckBox;

/* compiled from: PG */
/* renamed from: aix  reason: default package */
/* loaded from: classes.dex */
public final class aix implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public aix(CheckBoxPreference checkBoxPreference, int i) {
        this.b = i;
        this.a = checkBoxPreference;
    }

    public aix(SwitchPreference switchPreference, int i) {
        this.b = i;
        this.a = switchPreference;
    }

    public aix(SwitchPreferenceCompat switchPreferenceCompat, int i) {
        this.b = i;
        this.a = switchPreferenceCompat;
    }

    public aix(PreferenceCheckBox preferenceCheckBox, int i) {
        this.b = i;
        this.a = preferenceCheckBox;
    }

    public aix(dmv dmvVar, int i) {
        this.b = i;
        this.a = dmvVar;
    }

    public /* synthetic */ aix(etl etlVar, int i) {
        this.b = i;
        this.a = etlVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.b;
        if (i == 0) {
            if (!((Preference) this.a).U(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                ((TwoStatePreference) this.a).k(z);
            }
        } else if (i == 1) {
            if (!((Preference) this.a).U(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                ((TwoStatePreference) this.a).k(z);
            }
        } else if (i == 2) {
            if (!((Preference) this.a).U(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                ((TwoStatePreference) this.a).k(z);
            }
        } else if (i == 3) {
            ((dmv) this.a).b = z;
        } else if (i == 4) {
            etl etlVar = (etl) this.a;
            etlVar.d.e(erh.KEY_BORDER_OPTION_CHANGED, Boolean.valueOf(z));
            etlVar.i = z;
            etq etqVar = etlVar.h;
            etqVar.d = z;
            etqVar.g();
            etlVar.b();
        } else {
            ino.M(((PreferenceCheckBox) this.a).getContext()).f(((PreferenceCheckBox) this.a).a, z);
        }
    }
}
