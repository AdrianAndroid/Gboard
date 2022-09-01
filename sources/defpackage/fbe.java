package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fbe  reason: default package */
/* loaded from: classes.dex */
public final class fbe extends BroadcastReceiver {
    private final fax a;

    public fbe(fax faxVar) {
        this.a = faxVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
