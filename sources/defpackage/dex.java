package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.inputmethod.libs.framework.keyboard.widget.PageableCandidatesHolderView;

/* compiled from: PG */
/* renamed from: dex  reason: default package */
/* loaded from: classes.dex */
public final class dex extends akt {
    final /* synthetic */ PageableCandidatesHolderView a;

    public dex(PageableCandidatesHolderView pageableCandidatesHolderView) {
        this.a = pageableCandidatesHolderView;
    }

    @Override // defpackage.ald
    public final int a() {
        return this.a.p.b();
    }

    @Override // defpackage.ald
    public final Object b(ViewGroup viewGroup, int i) {
        dee a = this.a.o.a(i);
        PageableCandidatesHolderView pageableCandidatesHolderView = this.a;
        dee deeVar = pageableCandidatesHolderView.l;
        if (deeVar == null || deeVar.a < a.a) {
            pageableCandidatesHolderView.l = a;
        }
        a.h(pageableCandidatesHolderView.m);
        viewGroup.addView(a, 0);
        PageableCandidatesHolderView pageableCandidatesHolderView2 = this.a;
        if (pageableCandidatesHolderView2.m > 0) {
            a.f(pageableCandidatesHolderView2.j, pageableCandidatesHolderView2.s(a));
            this.a.z(a);
        }
        return a;
    }

    @Override // defpackage.ald
    public final void c(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
        ((dee) obj).g();
        PageableCandidatesHolderView pageableCandidatesHolderView = this.a;
        if (obj == pageableCandidatesHolderView.l) {
            pageableCandidatesHolderView.l = null;
        }
    }

    @Override // defpackage.ald
    public final boolean h(View view, Object obj) {
        return view == obj;
    }

    @Override // defpackage.ald
    public final int j() {
        return this.a.p.b() == 0 ? -2 : -1;
    }

    @Override // defpackage.ald
    public final void k(int i, Object obj) {
        dee deeVar = (dee) obj;
        PageableCandidatesHolderView pageableCandidatesHolderView = this.a;
        if (deeVar != pageableCandidatesHolderView.k) {
            pageableCandidatesHolderView.k = deeVar;
            pageableCandidatesHolderView.C(pageableCandidatesHolderView.n ? pageableCandidatesHolderView.k.c() : null);
            PageableCandidatesHolderView pageableCandidatesHolderView2 = this.a;
            pageableCandidatesHolderView2.i.gs(pageableCandidatesHolderView2, i);
        }
    }
}
