package defpackage;

import android.app.Dialog;
import android.widget.ListView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.preferencewidgets.list.ListPreference;

/* compiled from: PG */
/* renamed from: ioe  reason: default package */
/* loaded from: classes.dex */
public final class ioe extends guh {
    public final /* synthetic */ ListPreference a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ioe(ListPreference listPreference, String str) {
        super(str);
        this.a = listPreference;
    }

    @Override // defpackage.guh
    protected final void a(gub gubVar) {
        gubVar.n(true);
        gubVar.E(this.a.q);
        gubVar.u(new jdz(gubVar.r(), R.layout.f143330_resource_name_obfuscated_res_0x7f0e0455, ((androidx.preference.ListPreference) this.a).g), new ees(this, 12));
    }

    @Override // defpackage.guh
    protected final void b(Dialog dialog) {
        ListPreference listPreference = this.a;
        listPreference.K = listPreference.k(((androidx.preference.ListPreference) listPreference).i);
        ListView d = guw.d(dialog);
        d.setChoiceMode(1);
        d.setItemChecked(this.a.K, true);
        d.setSelection(this.a.K);
    }
}
