package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* renamed from: irq  reason: default package */
/* loaded from: classes.dex */
public final class irq extends BroadcastReceiver {
    public final /* synthetic */ irr a;

    public irq(irr irrVar) {
        this.a = irrVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            ((ltd) ((ltd) irr.a.b()).k("com/google/android/libraries/inputmethod/statusmonitors/DeviceStatusMonitor$1", "onReceive", 58, "DeviceStatusMonitor.java")).t("onReceive() : Intent is null");
            return;
        }
        this.a.c.hP(new epv(this, context.getApplicationContext(), intent, 14));
    }
}
