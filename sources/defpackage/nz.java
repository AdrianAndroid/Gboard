package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nz  reason: default package */
/* loaded from: classes2.dex */
public final class nz implements View.OnClickListener {
    final ga a;
    final /* synthetic */ ob b;

    public nz(ob obVar) {
        this.b = obVar;
        this.a = new ga(obVar.a.getContext(), obVar.c);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ob obVar = this.b;
        Window.Callback callback = obVar.d;
        if (callback == null || !obVar.e) {
            return;
        }
        callback.onMenuItemSelected(0, this.a);
    }
}
