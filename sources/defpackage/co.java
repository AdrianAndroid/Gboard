package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: co  reason: default package */
/* loaded from: classes.dex */
public final class co implements AdapterView.OnItemClickListener {
    final /* synthetic */ ct a;
    final /* synthetic */ cq b;

    public co(cq cqVar, ct ctVar) {
        this.b = cqVar;
        this.a = ctVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.r.onClick(this.a.b, i);
        if (!this.b.w) {
            this.a.b.dismiss();
        }
    }
}
