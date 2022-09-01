package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* renamed from: cuo  reason: default package */
/* loaded from: classes.dex */
public final class cuo extends cuk {
    public hja a = null;
    public RecyclerView b;
    private mko c;

    private cuo() {
    }

    public static cuo f(Class cls) {
        return new cuo();
    }

    @Override // defpackage.dz
    public final void c(RecyclerView recyclerView, int i, int i2) {
        if (!(i == 0 && i2 == 0) && !hji.e(this.c) && hjg.h(this.a) && cur.b(recyclerView.m)) {
            hiz b = hjg.b(this.a);
            afp afpVar = afp.STARTED;
            boolean z = jam.b;
            llk e = llp.e();
            llk e2 = llp.e();
            llk e3 = llp.e();
            e.h(new bxj(this, 16));
            b.E(hjg.a(gyc.b, null, afpVar, z, e, e2, e3));
            this.c = b;
        }
    }

    @Override // defpackage.cuk
    public final void d(RecyclerView recyclerView) {
        if (this.b == null) {
            this.b = recyclerView;
            return;
        }
        throw new IllegalStateException("InfiniteScrollFetcher is already attached to a recycler view");
    }

    @Override // defpackage.cuk
    public final void e() {
        this.b = null;
        hji.h(this.c);
        this.c = null;
    }
}
