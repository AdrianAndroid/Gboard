package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: gkl  reason: default package */
/* loaded from: classes.dex */
final class gkl extends BroadcastReceiver {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ rj c;

    public gkl(AtomicBoolean atomicBoolean, Runnable runnable, rj rjVar) {
        this.a = atomicBoolean;
        this.b = runnable;
        this.c = rjVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.a.compareAndSet(false, true)) {
            context.unregisterReceiver(this);
            this.b.run();
            this.c.c(null);
        }
    }
}
