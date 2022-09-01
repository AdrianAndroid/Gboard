package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* renamed from: ho  reason: default package */
/* loaded from: classes.dex */
public final class ho extends gx {
    final /* synthetic */ hs d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho(hs hsVar, Context context, hg hgVar, View view) {
        super(context, hgVar, view, false);
        this.d = hsVar;
        if (!hgVar.k.o()) {
            View view2 = hsVar.g;
            this.a = view2 == null ? (View) hsVar.f : view2;
        }
        e(hsVar.l);
    }

    @Override // defpackage.gx
    public final void c() {
        this.d.j = null;
        super.c();
    }
}
