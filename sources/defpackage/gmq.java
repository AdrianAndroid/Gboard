package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* renamed from: gmq  reason: default package */
/* loaded from: classes.dex */
final class gmq extends BroadcastReceiver {
    final /* synthetic */ gms a;

    public gmq(gms gmsVar) {
        this.a = gmsVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ltg ltgVar = gms.a;
        this.a.a();
    }
}
