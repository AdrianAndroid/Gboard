package defpackage;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ahs  reason: default package */
/* loaded from: classes.dex */
public final class ahs extends aic {
    final Set ac = new HashSet();
    boolean ad;
    CharSequence[] ae;
    CharSequence[] af;

    private final MultiSelectListPreference aA() {
        return (MultiSelectListPreference) az();
    }

    @Override // defpackage.aic
    public final void av(boolean z) {
        if (z && this.ad) {
            MultiSelectListPreference aA = aA();
            if (aA.U(this.ac)) {
                aA.k(this.ac);
            }
        }
        this.ad = false;
    }

    @Override // defpackage.aic, defpackage.ai, defpackage.an
    public final void e(Bundle bundle) {
        super.e(bundle);
        if (bundle == null) {
            MultiSelectListPreference aA = aA();
            if (aA.g == null || aA.h == null) {
                throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
            }
            this.ac.clear();
            this.ac.addAll(aA.i);
            this.ad = false;
            this.ae = aA.g;
            this.af = aA.h;
            return;
        }
        this.ac.clear();
        this.ac.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
        this.ad = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
        this.ae = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
        this.af = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
    }

    @Override // defpackage.aic
    protected final void fa(cu cuVar) {
        int length = this.af.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.ac.contains(this.af[i].toString());
        }
        CharSequence[] charSequenceArr = this.ae;
        ahr ahrVar = new ahr(this);
        cq cqVar = cuVar.a;
        cqVar.p = charSequenceArr;
        cqVar.y = ahrVar;
        cqVar.u = zArr;
        cqVar.v = true;
    }

    @Override // defpackage.aic, defpackage.ai, defpackage.an
    public final void h(Bundle bundle) {
        super.h(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.ac));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.ad);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.ae);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.af);
    }
}
