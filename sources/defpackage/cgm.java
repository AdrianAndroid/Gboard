package defpackage;

import com.google.android.apps.inputmethod.latin.keyboard.widget.LatinFixedCountCandidatesHolderView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;

/* compiled from: PG */
/* renamed from: cgm  reason: default package */
/* loaded from: classes.dex */
public final class cgm implements jdp {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public cgm(cgn cgnVar, int i) {
        this.b = i;
        this.a = cgnVar;
    }

    public cgm(cmv cmvVar, int i) {
        this.b = i;
        this.a = cmvVar;
    }

    public cgm(LatinFixedCountCandidatesHolderView latinFixedCountCandidatesHolderView, int i) {
        this.b = i;
        this.a = latinFixedCountCandidatesHolderView;
    }

    @Override // defpackage.jdp
    public final void a(SoftKeyView softKeyView) {
    }

    @Override // defpackage.jdp
    public final void b(SoftKeyView softKeyView) {
    }

    @Override // defpackage.jdp
    public final void c(SoftKeyView softKeyView) {
        int i = this.b;
        if (i == 0) {
            ((cgn) this.a).d();
            return;
        }
        boolean z = true;
        if (i != 1) {
            if (softKeyView.getVisibility() != 8 || !((cmv) this.a).a.get()) {
                return;
            }
            ((cmv) this.a).f();
            ((cmv) this.a).g();
            return;
        }
        LatinFixedCountCandidatesHolderView latinFixedCountCandidatesHolderView = (LatinFixedCountCandidatesHolderView) this.a;
        if (latinFixedCountCandidatesHolderView.a.getVisibility() != 0) {
            z = false;
        }
        latinFixedCountCandidatesHolderView.b = z;
        ((LatinFixedCountCandidatesHolderView) this.a).C();
    }
}
