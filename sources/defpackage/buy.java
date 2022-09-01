package defpackage;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.ImageView;

/* compiled from: PG */
/* renamed from: buy  reason: default package */
/* loaded from: classes.dex */
public final class buy extends dz {
    final /* synthetic */ ImageView a;
    final /* synthetic */ bvf b;

    public buy(bvf bvfVar, ImageView imageView) {
        this.b = bvfVar;
        this.a = imageView;
    }

    @Override // defpackage.dz
    public final void c(RecyclerView recyclerView, int i, int i2) {
        ls lsVar = recyclerView.l;
        if (lsVar == null || lsVar.ha() <= 3) {
            return;
        }
        bvf bvfVar = this.b;
        if (bvfVar.g) {
            return;
        }
        ImageView imageView = this.a;
        ly lyVar = recyclerView.m;
        int i3 = 0;
        if (lyVar != null) {
            int[] iArr = new int[bvfVar.n.a()];
            ((StaggeredGridLayoutManager) lyVar).M(iArr);
            int i4 = iArr[0];
            if (i4 == 0 || (i4 != 1 ? !(i4 != 2 || bvfVar.r || bvfVar.s) : !bvfVar.r)) {
                i3 = 8;
            }
        }
        imageView.setVisibility(i3);
    }
}
