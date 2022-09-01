package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* renamed from: dl  reason: default package */
/* loaded from: classes.dex */
final class dl extends BroadcastReceiver {
    final /* synthetic */ dm a;

    public dl(dm dmVar) {
        this.a = dmVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.b();
    }
}
