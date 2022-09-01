package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.inputmethod.latin.keyboard.widget.LatinPageableCandidatesHolderView;

/* compiled from: PG */
/* renamed from: bqm  reason: default package */
/* loaded from: classes.dex */
public final class bqm extends akt {
    final /* synthetic */ LatinPageableCandidatesHolderView a;

    public bqm(LatinPageableCandidatesHolderView latinPageableCandidatesHolderView) {
        this.a = latinPageableCandidatesHolderView;
    }

    @Override // defpackage.ald
    public final int a() {
        return this.a.p.b();
    }

    @Override // defpackage.ald
    public final Object b(ViewGroup viewGroup, int i) {
        dee a = this.a.o.a(i);
        LatinPageableCandidatesHolderView latinPageableCandidatesHolderView = this.a;
        dee deeVar = latinPageableCandidatesHolderView.l;
        if (deeVar == null || deeVar.a < a.a) {
            latinPageableCandidatesHolderView.l = a;
        }
        a.h(latinPageableCandidatesHolderView.m);
        viewGroup.addView(a, 0);
        LatinPageableCandidatesHolderView latinPageableCandidatesHolderView2 = this.a;
        if (latinPageableCandidatesHolderView2.m > 0) {
            a.f(latinPageableCandidatesHolderView2.j, latinPageableCandidatesHolderView2.s(a));
            this.a.z(a);
        }
        return a;
    }

    @Override // defpackage.ald
    public final void c(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
        ((dee) obj).g();
        LatinPageableCandidatesHolderView latinPageableCandidatesHolderView = this.a;
        if (obj == latinPageableCandidatesHolderView.l) {
            latinPageableCandidatesHolderView.l = null;
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
        LatinPageableCandidatesHolderView latinPageableCandidatesHolderView = this.a;
        if (deeVar != latinPageableCandidatesHolderView.k) {
            latinPageableCandidatesHolderView.k = deeVar;
            latinPageableCandidatesHolderView.C(latinPageableCandidatesHolderView.n ? latinPageableCandidatesHolderView.k.c() : null);
            LatinPageableCandidatesHolderView latinPageableCandidatesHolderView2 = this.a;
            latinPageableCandidatesHolderView2.i.gs(latinPageableCandidatesHolderView2, i);
        }
    }
}
