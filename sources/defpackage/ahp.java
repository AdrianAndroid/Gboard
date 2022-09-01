package defpackage;

import android.os.Bundle;
import androidx.preference.ListPreference;

/* compiled from: PG */
/* renamed from: ahp  reason: default package */
/* loaded from: classes.dex */
public final class ahp extends aic {
    public int ac;
    private CharSequence[] ad;
    private CharSequence[] ae;

    private final ListPreference aA() {
        return (ListPreference) az();
    }

    @Override // defpackage.aic
    public final void av(boolean z) {
        int i;
        if (!z || (i = this.ac) < 0) {
            return;
        }
        String obj = this.ae[i].toString();
        ListPreference aA = aA();
        if (!aA.U(obj)) {
            return;
        }
        aA.o(obj);
    }

    @Override // defpackage.aic, defpackage.ai, defpackage.an
    public final void e(Bundle bundle) {
        super.e(bundle);
        if (bundle == null) {
            ListPreference aA = aA();
            if (aA.g == null || aA.h == null) {
                throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
            }
            this.ac = aA.k(aA.i);
            this.ad = aA.g;
            this.ae = aA.h;
            return;
        }
        this.ac = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.ad = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.ae = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }

    @Override // defpackage.aic
    protected final void fa(cu cuVar) {
        CharSequence[] charSequenceArr = this.ad;
        int i = this.ac;
        ees eesVar = new ees(this, 1);
        cq cqVar = cuVar.a;
        cqVar.p = charSequenceArr;
        cqVar.r = eesVar;
        cqVar.x = i;
        cqVar.w = true;
        cuVar.i(null, null);
    }

    @Override // defpackage.aic, defpackage.ai, defpackage.an
    public final void h(Bundle bundle) {
        super.h(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.ac);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.ad);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.ae);
    }
}
