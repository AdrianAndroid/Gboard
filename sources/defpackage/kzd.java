package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* renamed from: kzd  reason: default package */
/* loaded from: classes.dex */
final class kzd extends BroadcastReceiver {
    final /* synthetic */ kze a;

    public kzd(kze kzeVar) {
        this.a = kzeVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.a(context, intent);
    }
}
