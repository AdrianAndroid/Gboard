package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dld  reason: default package */
/* loaded from: classes.dex */
public final class dld extends dz {
    final /* synthetic */ dlg a;

    public dld(dlg dlgVar) {
        this.a = dlgVar;
    }

    @Override // defpackage.dz
    public final void c(RecyclerView recyclerView, int i, int i2) {
        View U;
        dlb dlbVar = this.a.d;
        if (dlbVar != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.m;
            boolean z = false;
            if (linearLayoutManager != null && linearLayoutManager.au() != 0 && (linearLayoutManager.M() > 0 || ((U = linearLayoutManager.U(0)) != null && (-U.getTop()) > U.getHeight() / 2))) {
                z = true;
            }
            dlbVar.t(z);
        }
    }
}
