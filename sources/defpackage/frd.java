package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: frd  reason: default package */
/* loaded from: classes.dex */
public final class frd implements ServiceConnection {
    public final Map a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final frb e;
    public ComponentName f;
    final /* synthetic */ frc g;

    public frd(frc frcVar, frb frbVar) {
        this.g = frcVar;
        this.e = frbVar;
    }

    public final boolean a(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final boolean b() {
        return this.a.isEmpty();
    }

    public final void c(ServiceConnection serviceConnection, ServiceConnection serviceConnection2) {
        this.a.put(serviceConnection, serviceConnection2);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0 A[Catch: all -> 0x00e5, TryCatch #1 {all -> 0x00e5, blocks: (B:5:0x001f, B:7:0x0029, B:9:0x002e, B:11:0x003a, B:15:0x0064, B:16:0x0059, B:19:0x0048, B:21:0x0075, B:22:0x008e, B:25:0x00b6, B:26:0x00bc, B:28:0x00c0, B:32:0x00d7, B:34:0x00da, B:37:0x0095, B:39:0x009e, B:42:0x00ae, B:45:0x0083), top: B:4:0x001f, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7 A[Catch: all -> 0x00e5, TRY_LEAVE, TryCatch #1 {all -> 0x00e5, blocks: (B:5:0x001f, B:7:0x0029, B:9:0x002e, B:11:0x003a, B:15:0x0064, B:16:0x0059, B:19:0x0048, B:21:0x0075, B:22:0x008e, B:25:0x00b6, B:26:0x00bc, B:28:0x00c0, B:32:0x00d7, B:34:0x00da, B:37:0x0095, B:39:0x009e, B:42:0x00ae, B:45:0x0083), top: B:4:0x001f, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.frd.d():void");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.g.c) {
            this.g.e.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            for (ServiceConnection serviceConnection : this.a.values()) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.g.c) {
            this.g.e.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            for (ServiceConnection serviceConnection : this.a.values()) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }
}
