package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bdw  reason: default package */
/* loaded from: classes.dex */
public final class bdw extends BroadcastReceiver {
    final /* synthetic */ bdy a;

    public bdw(bdy bdyVar) {
        this.a = bdyVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        bdy.a.execute(new att(this.a, 8));
    }
}
