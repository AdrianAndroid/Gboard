package defpackage;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: edb  reason: default package */
/* loaded from: classes.dex */
public final class edb extends dz {
    final /* synthetic */ ede a;

    public edb(ede edeVar) {
        this.a = edeVar;
    }

    @Override // defpackage.dz
    public final void b(RecyclerView recyclerView, int i) {
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.a.h = true;
            return;
        }
        ede edeVar = this.a;
        if (!edeVar.h) {
            return;
        }
        edeVar.h = false;
        if (edeVar.b.M() == 0) {
            this.a.j();
        } else {
            this.a.o(50);
        }
    }
}
