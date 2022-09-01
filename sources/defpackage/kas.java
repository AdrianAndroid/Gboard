package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* renamed from: kas  reason: default package */
/* loaded from: classes.dex */
final class kas extends BroadcastReceiver {
    final /* synthetic */ kaw a;

    public kas(kaw kawVar) {
        this.a = kawVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            this.a.h();
        }
    }
}
