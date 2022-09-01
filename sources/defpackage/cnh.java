package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: cnh  reason: default package */
/* loaded from: classes.dex */
final class cnh extends cum {
    private final Context s;
    private final ViewGroup u;
    private final LayoutInflater v;

    public cnh(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(viewGroup);
        this.s = context;
        this.v = layoutInflater;
        this.u = viewGroup;
    }

    @Override // defpackage.cum
    public final /* bridge */ /* synthetic */ void F(Object obj, int i) {
        Context context = this.s;
        ((cng) obj).c(context, this.v, context.getResources(), this.u);
    }

    @Override // defpackage.cum
    public final void G() {
        this.u.removeAllViews();
    }
}
