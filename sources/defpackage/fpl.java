package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: fpl  reason: default package */
/* loaded from: classes.dex */
public final class fpl extends BroadcastReceiver {
    public Context a;
    private final gsd b;

    public fpl(gsd gsdVar, byte[] bArr, byte[] bArr2) {
        this.b = gsdVar;
    }

    public final synchronized void a() {
        Context context = this.a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.a = null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.b.c();
            a();
        }
    }
}
