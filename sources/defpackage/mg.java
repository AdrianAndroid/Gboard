package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* renamed from: mg  reason: default package */
/* loaded from: classes.dex */
public final class mg extends dg {
    final /* synthetic */ RecyclerView a;

    public mg(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.dg
    public final void c() {
        this.a.gG(null);
        RecyclerView recyclerView = this.a;
        recyclerView.J.f = true;
        recyclerView.T(true);
        if (!this.a.g.l()) {
            this.a.requestLayout();
        }
    }

    @Override // defpackage.dg
    public final void d(int i, int i2, Object obj) {
        this.a.gG(null);
        hy hyVar = this.a.g;
        if (i2 <= 0) {
            return;
        }
        hyVar.a.add(hyVar.c(4, i, i2, obj));
        hyVar.c |= 4;
        if (hyVar.a.size() != 1) {
            return;
        }
        j();
    }

    @Override // defpackage.dg
    public final void e(int i, int i2) {
        this.a.gG(null);
        hy hyVar = this.a.g;
        if (i2 <= 0) {
            return;
        }
        hyVar.a.add(hyVar.c(1, i, i2, null));
        hyVar.c |= 1;
        if (hyVar.a.size() != 1) {
            return;
        }
        j();
    }

    @Override // defpackage.dg
    public final void f(int i, int i2) {
        this.a.gG(null);
        hy hyVar = this.a.g;
        if (i2 <= 0) {
            return;
        }
        hyVar.a.add(hyVar.c(2, i, i2, null));
        hyVar.c |= 2;
        if (hyVar.a.size() != 1) {
            return;
        }
        j();
    }

    @Override // defpackage.dg
    public final void h(int i, int i2) {
        this.a.gG(null);
        hy hyVar = this.a.g;
        if (i == i2) {
            return;
        }
        hyVar.a.add(hyVar.c(8, i, i2, null));
        hyVar.c |= 8;
        if (hyVar.a.size() != 1) {
            return;
        }
        j();
    }

    final void j() {
        int i = RecyclerView.R;
        RecyclerView recyclerView = this.a;
        recyclerView.t = true;
        recyclerView.requestLayout();
    }
}
