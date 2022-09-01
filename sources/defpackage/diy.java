package defpackage;

import com.google.android.apps.inputmethod.libs.hmm.HmmEngineInterfaceImpl;
import java.util.List;

/* compiled from: PG */
/* renamed from: diy  reason: default package */
/* loaded from: classes.dex */
public final class diy extends dik {
    public diy(HmmEngineInterfaceImpl hmmEngineInterfaceImpl) {
        super(hmmEngineInterfaceImpl);
    }

    @Override // defpackage.dik
    protected final void n(boolean z) {
        ieh.j().e(dja.TEXT_COMPOSING_DELETED, Boolean.valueOf(z));
    }

    @Override // defpackage.dik
    protected final void o(int i) {
        ieh.j().e(dja.DEFAULT_CANDIDATE_SELECTED, Integer.valueOf(i));
    }

    @Override // defpackage.dik
    protected final void p(List list) {
        ieh.j().e(dja.ENGINE_PREDICTION_IMPRESSION, list);
    }

    @Override // defpackage.dik
    protected final void q() {
        ieh.j().e(dja.TOKEN_CANDIDATE_UNSELECTED, new Object[0]);
    }

    @Override // defpackage.dik
    public final void r(ids idsVar, long j) {
        ieh.j().g(idsVar, j);
    }
}
