package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: dwb  reason: default package */
/* loaded from: classes.dex */
final class dwb extends dwc {
    final /* synthetic */ hsk a;
    final /* synthetic */ imn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwb(Context context, imn imnVar, hsk hskVar, imn imnVar2) {
        super(context, imnVar);
        this.a = hskVar;
        this.b = imnVar2;
    }

    @Override // defpackage.dwc
    protected final View g() {
        ViewGroup L = this.a.L(ice.BODY);
        return (L == null || L.getChildCount() <= 0) ? L : L.getChildAt(0);
    }

    @Override // defpackage.dwc
    protected final void i(View view, View view2) {
        this.b.e(view, view2, 614, 0, 0, null);
    }
}
