package defpackage;

import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.AdapterView;
import androidx.preference.DropDownPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;

/* compiled from: PG */
/* renamed from: nc  reason: default package */
/* loaded from: classes2.dex */
public final class nc implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public nc(SearchView searchView, int i) {
        this.b = i;
        this.a = searchView;
    }

    public nc(DropDownPreference dropDownPreference, int i) {
        this.b = i;
        this.a = dropDownPreference;
    }

    public nc(lg lgVar, int i) {
        this.b = i;
        this.a = lgVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        kk kkVar;
        int i2 = this.b;
        if (i2 == 0) {
            ((SearchView) this.a).a.getText();
            throw null;
        } else if (i2 == 1) {
            if (i == -1 || (kkVar = ((lg) this.a).e) == null) {
                return;
            }
            kkVar.a = false;
        } else if (i < 0) {
        } else {
            String obj = ((ListPreference) this.a).h[i].toString();
            if (obj.equals(((ListPreference) this.a).i) || !((Preference) this.a).U(obj)) {
                return;
            }
            ((ListPreference) this.a).o(obj);
        }
    }
}
