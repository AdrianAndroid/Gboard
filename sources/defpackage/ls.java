package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: PG */
/* renamed from: ls  reason: default package */
/* loaded from: classes.dex */
public abstract class ls {
    public final lt a = new lt();
    public boolean b = false;
    public final int c = 1;

    public abstract mo d(ViewGroup viewGroup, int i);

    public final void fc() {
        this.a.a();
    }

    public abstract int ha();

    public void hb(RecyclerView recyclerView) {
    }

    public void hc(RecyclerView recyclerView) {
    }

    public int he(int i) {
        return 0;
    }

    public long hf(int i) {
        return -1L;
    }

    public final void hg(int i) {
        this.a.c(i, 1);
    }

    public final void hh(int i, Object obj) {
        this.a.d(i, 1, obj);
    }

    public final void hi(int i) {
        this.a.e(i, 1);
    }

    public final void hj(int i, int i2) {
        this.a.b(i, i2);
    }

    public final void hk(int i, int i2) {
        this.a.e(i, i2);
    }

    public final void hl(int i, int i2) {
        this.a.f(i, i2);
    }

    public final void hm(dg dgVar) {
        this.a.registerObserver(dgVar);
    }

    public final void hn(dg dgVar) {
        this.a.unregisterObserver(dgVar);
    }

    public final void j(int i, int i2) {
        this.a.c(i, i2);
    }

    public final void m(int i) {
        this.a.f(i, 1);
    }

    public abstract void o(mo moVar, int i);

    public void p(mo moVar, int i, List list) {
        o(moVar, i);
    }

    public void r(mo moVar) {
    }

    public void s(mo moVar) {
    }

    public void t(mo moVar) {
    }

    public final void u(boolean z) {
        if (!this.a.g()) {
            this.b = z;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }
}
