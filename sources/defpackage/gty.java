package defpackage;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* renamed from: gty  reason: default package */
/* loaded from: classes.dex */
final class gty extends BroadcastReceiver {
    final /* synthetic */ Dialog a;

    public gty(Dialog dialog) {
        this.a = dialog;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
