package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mmj  reason: default package */
/* loaded from: classes2.dex */
public final class mmj extends BroadcastReceiver {
    public static final AtomicReference a = new AtomicReference();
    private final Context b;

    public mmj(Context context) {
        this.b = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (mmk.a) {
            for (mmk mmkVar : mmk.b.values()) {
                mmkVar.f();
            }
        }
        this.b.unregisterReceiver(this);
    }
}
