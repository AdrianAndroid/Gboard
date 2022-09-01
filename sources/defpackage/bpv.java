package defpackage;

import com.google.android.apps.inputmethod.latin.keyboard.widget.LatinFixedCountCandidatesHolderView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;

/* compiled from: PG */
/* renamed from: bpv  reason: default package */
/* loaded from: classes.dex */
public final class bpv extends bpf {
    public bpv(ddq ddqVar) {
        super(ddqVar);
    }

    @Override // defpackage.bpf, defpackage.ddr
    public final boolean k(hfd hfdVar) {
        hln f;
        iay f2 = hfdVar.f();
        if (f2 == null || f2.c != -10099) {
            super.k(hfdVar);
            return false;
        }
        LatinFixedCountCandidatesHolderView latinFixedCountCandidatesHolderView = this.c;
        if (latinFixedCountCandidatesHolderView == null || (f = latinFixedCountCandidatesHolderView.f(f2)) == null) {
            return true;
        }
        ddq ddqVar = this.b;
        hfd d = hfd.d(new iay(-10002, null, f));
        d.k = this;
        ddqVar.t(d);
        return true;
    }

    public final hln q(int i) {
        SoftKeyView j;
        LatinFixedCountCandidatesHolderView latinFixedCountCandidatesHolderView = this.c;
        if (latinFixedCountCandidatesHolderView == null || (j = latinFixedCountCandidatesHolderView.j(i)) == null || j.getVisibility() != 0) {
            return null;
        }
        return LatinFixedCountCandidatesHolderView.e(j);
    }
}
