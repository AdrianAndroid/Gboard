package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: av  reason: default package */
/* loaded from: classes.dex */
public final class av implements View.OnAttachStateChangeListener {
    final /* synthetic */ bn a;
    final /* synthetic */ aw b;

    public av(aw awVar, bn bnVar) {
        this.b = awVar;
        this.a = bnVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        bn bnVar = this.a;
        an anVar = bnVar.b;
        bnVar.d();
        ca.b((ViewGroup) anVar.O.getParent(), this.b.a).c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
