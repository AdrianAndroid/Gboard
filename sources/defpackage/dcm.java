package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcm  reason: default package */
/* loaded from: classes.dex */
public final class dcm extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        ltg ltgVar = dcu.g;
        if ("android.intent.action.ACTION_SHUTDOWN".equals(action)) {
            ieh.j().e(hpb.IME_COMPOSING_STOPPED, new Object[0]);
        }
    }
}
