package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.inputmethod.libs.framework.keyboard.widget.ScrollableCandidatesHolderView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;

/* compiled from: PG */
/* renamed from: dfi  reason: default package */
/* loaded from: classes.dex */
public final class dfi extends ls {
    final /* synthetic */ ScrollableCandidatesHolderView d;

    public dfi(ScrollableCandidatesHolderView scrollableCandidatesHolderView) {
        this.d = scrollableCandidatesHolderView;
    }

    @Override // defpackage.ls
    public final mo d(ViewGroup viewGroup, int i) {
        hcr hcrVar = new hcr(this.d.T.f(), null);
        ((SoftKeyView) hcrVar.s).j(this.d.V);
        ((SoftKeyView) hcrVar.s).i(this.d.W);
        ((SoftKeyView) hcrVar.s).k(this.d.ab);
        return hcrVar;
    }

    @Override // defpackage.ls
    public final int ha() {
        return this.d.S.size();
    }

    @Override // defpackage.ls
    public final void o(mo moVar, int i) {
        ScrollableCandidatesHolderView scrollableCandidatesHolderView = this.d;
        scrollableCandidatesHolderView.ad = (hcr) moVar;
        hcr hcrVar = scrollableCandidatesHolderView.ad;
        int i2 = hcr.t;
        View view = hcrVar.s;
        ScrollableCandidatesHolderView scrollableCandidatesHolderView2 = this.d;
        SoftKeyView softKeyView = (SoftKeyView) view;
        softKeyView.n(scrollableCandidatesHolderView2.T.d(i, (hln) scrollableCandidatesHolderView2.S.get(i)));
        int layoutDirection = this.d.getLayoutDirection();
        int size = this.d.S.size() - 1;
        softKeyView.setPadding(((layoutDirection == 1 || i != 0) && !(layoutDirection == 1 && i == size)) ? 0 : this.d.ac, 0, ((layoutDirection == 1 || i != size) && !(layoutDirection == 1 && i == 0)) ? 0 : this.d.ac, 0);
    }
}
