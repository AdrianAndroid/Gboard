package defpackage;

import android.support.v7.app.AlertController$RecycleListView;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cp  reason: default package */
/* loaded from: classes.dex */
public final class cp implements AdapterView.OnItemClickListener {
    final /* synthetic */ AlertController$RecycleListView a;
    final /* synthetic */ ct b;
    final /* synthetic */ cq c;

    public cp(cq cqVar, AlertController$RecycleListView alertController$RecycleListView, ct ctVar) {
        this.c = cqVar;
        this.a = alertController$RecycleListView;
        this.b = ctVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        boolean[] zArr = this.c.u;
        if (zArr != null) {
            zArr[i] = this.a.isItemChecked(i);
        }
        this.c.y.onClick(this.b.b, i, this.a.isItemChecked(i));
    }
}
