package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: PG */
/* renamed from: hgv  reason: default package */
/* loaded from: classes.dex */
public final class hgv implements ServiceConnection {
    final /* synthetic */ Context a;

    public hgv(Context context) {
        this.a = context;
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        hgw.a(this.a, this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
