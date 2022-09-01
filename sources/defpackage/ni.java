package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* renamed from: ni  reason: default package */
/* loaded from: classes2.dex */
final class ni extends dz {
    boolean a = false;
    final /* synthetic */ mb b;

    public ni(mb mbVar) {
        this.b = mbVar;
    }

    @Override // defpackage.dz
    public final void b(RecyclerView recyclerView, int i) {
        if (i != 0 || !this.a) {
            return;
        }
        this.a = false;
        this.b.f();
    }

    @Override // defpackage.dz
    public final void c(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.a = true;
    }
}
