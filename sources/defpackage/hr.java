package defpackage;

import android.content.Context;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hr  reason: default package */
/* loaded from: classes.dex */
public final class hr extends gx {
    final /* synthetic */ hs d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr(hs hsVar, Context context, gm gmVar, View view) {
        super(context, gmVar, view, true);
        this.d = hsVar;
        this.b = 8388613;
        e(hsVar.l);
    }

    @Override // defpackage.gx
    public final void c() {
        gm gmVar = this.d.c;
        if (gmVar != null) {
            gmVar.close();
        }
        this.d.i = null;
        super.c();
    }
}
