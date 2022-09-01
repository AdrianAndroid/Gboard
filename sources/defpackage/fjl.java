package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import j$.util.Objects;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* renamed from: fjl  reason: default package */
/* loaded from: classes.dex */
final class fjl extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        for (fjn fjnVar : fjn.a) {
            ScheduledExecutorService scheduledExecutorService = fjnVar.b;
            Objects.requireNonNull(fjnVar);
            scheduledExecutorService.execute(new fci(fjnVar, 17));
        }
    }
}
