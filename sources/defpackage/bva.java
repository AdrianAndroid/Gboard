package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* renamed from: bva  reason: default package */
/* loaded from: classes.dex */
final class bva extends dz {
    final /* synthetic */ buk a;
    final /* synthetic */ int b;
    final /* synthetic */ bvf c;

    public bva(bvf bvfVar, buk bukVar, int i) {
        this.c = bvfVar;
        this.a = bukVar;
        this.b = i;
    }

    @Override // defpackage.dz
    public final void b(RecyclerView recyclerView, int i) {
        if (i == 0) {
            this.c.A(this.a, this.b);
            recyclerView.aC(this);
        }
    }
}
