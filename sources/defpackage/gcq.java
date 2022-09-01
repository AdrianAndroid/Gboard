package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: PG */
/* renamed from: gcq  reason: default package */
/* loaded from: classes.dex */
public abstract class gcq implements ServiceConnection {
    public gcq() {
        gcp gcpVar = gcp.a;
    }

    public abstract void a(ComponentName componentName);

    public abstract void b(IBinder iBinder);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        a(componentName);
    }
}
