package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* renamed from: jya  reason: default package */
/* loaded from: classes.dex */
final class jya extends BroadcastReceiver {
    final /* synthetic */ jyb a;

    public jya(jyb jybVar) {
        this.a = jybVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.libraries.micore.superpacks.scheduling.fg_cancel".equals(action)) {
            this.a.j();
        } else if (!"com.google.android.libraries.micore.superpacks.scheduling.fg_reset_timeout".equals(action)) {
        } else {
            jyb jybVar = this.a;
            if (!jybVar.c) {
                return;
            }
            jybVar.h();
        }
    }
}
