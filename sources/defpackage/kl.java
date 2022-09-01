package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* renamed from: kl  reason: default package */
/* loaded from: classes.dex */
final class kl extends dz {
    final /* synthetic */ kn a;

    public kl(kn knVar) {
        this.a = knVar;
    }

    @Override // defpackage.dz
    public final void c(RecyclerView recyclerView, int i, int i2) {
        kn knVar = this.a;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int computeVerticalScrollRange = knVar.l.computeVerticalScrollRange();
        int i3 = knVar.k;
        knVar.m = computeVerticalScrollRange - i3 > 0 && i3 >= knVar.a;
        int computeHorizontalScrollRange = knVar.l.computeHorizontalScrollRange();
        int i4 = knVar.j;
        boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= knVar.a;
        knVar.n = z;
        if (knVar.m) {
            float f = i3;
            knVar.e = (int) ((f * (computeVerticalScrollOffset + (f / 2.0f))) / computeVerticalScrollRange);
            knVar.d = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        } else if (!z) {
            if (knVar.o == 0) {
                return;
            }
            knVar.j(0);
            return;
        }
        if (knVar.n) {
            float f2 = i4;
            knVar.h = (int) ((f2 * (computeHorizontalScrollOffset + (f2 / 2.0f))) / computeHorizontalScrollRange);
            knVar.g = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        int i5 = knVar.o;
        if (i5 == 0 || i5 == 1) {
            knVar.j(1);
        }
    }
}
