package defpackage;

import android.content.Context;
import android.support.v7.app.AlertController$RecycleListView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: PG */
/* renamed from: cn  reason: default package */
/* loaded from: classes.dex */
final class cn extends ArrayAdapter {
    final /* synthetic */ AlertController$RecycleListView a;
    final /* synthetic */ cq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn(cq cqVar, Context context, int i, CharSequence[] charSequenceArr, AlertController$RecycleListView alertController$RecycleListView) {
        super(context, i, 16908308, charSequenceArr);
        this.b = cqVar;
        this.a = alertController$RecycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.b.u;
        if (zArr != null && zArr[i]) {
            this.a.setItemChecked(i, true);
        }
        return view2;
    }
}
