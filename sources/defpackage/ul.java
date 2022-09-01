package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ul  reason: default package */
/* loaded from: classes2.dex */
public final class ul implements Handler.Callback, ServiceConnection {
    public final Handler a;
    private final Context b;
    private final HandlerThread c;
    private final Map d = new HashMap();
    private Set e = new HashSet();

    public ul(Context context) {
        this.b = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        this.c = handlerThread;
        handlerThread.start();
        this.a = new Handler(handlerThread.getLooper(), this);
    }

    private final void a(uk ukVar) {
        if (ukVar.b) {
            this.b.unbindService(this);
            ukVar.b = false;
        }
        ukVar.e = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004a, code lost:
        if (r10.b != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b(defpackage.uk r10) {
        /*
            r9 = this;
            java.util.ArrayDeque r0 = r10.c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lc1
            boolean r0 = r10.b
            java.lang.String r1 = "NotifManCompat"
            r2 = 0
            if (r0 == 0) goto L10
            goto L4c
        L10:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r3 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
            r0.<init>(r3)
            android.content.ComponentName r3 = r10.a
            android.content.Intent r0 = r0.setComponent(r3)
            android.content.Context r3 = r9.b
            r4 = 33
            boolean r0 = r3.bindService(r0, r9, r4)
            r10.b = r0
            if (r0 == 0) goto L2c
            r10.d = r2
            goto L48
        L2c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to bind to listener "
            r0.<init>(r3)
            android.content.ComponentName r4 = r10.a
            r0.append(r4)
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r0 = r3.concat(r0)
            android.util.Log.w(r1, r0)
            android.content.Context r0 = r9.b
            r0.unbindService(r9)
        L48:
            boolean r0 = r10.b
            if (r0 == 0) goto Lbe
        L4c:
            bu r0 = r10.e
            if (r0 == 0) goto Lbe
        L50:
            java.util.ArrayDeque r0 = r10.c
            java.lang.Object r0 = r0.peek()
            uj r0 = (defpackage.uj) r0
            if (r0 != 0) goto L5b
            goto Lb2
        L5b:
            bu r3 = r10.e     // Catch: android.os.RemoteException -> L98 android.os.DeadObjectException -> Lb1
            java.lang.String r4 = r0.a     // Catch: android.os.RemoteException -> L98 android.os.DeadObjectException -> Lb1
            int r5 = r0.b     // Catch: android.os.RemoteException -> L98 android.os.DeadObjectException -> Lb1
            java.lang.String r6 = r0.c     // Catch: android.os.RemoteException -> L98 android.os.DeadObjectException -> Lb1
            android.app.Notification r0 = r0.d     // Catch: android.os.RemoteException -> L98 android.os.DeadObjectException -> Lb1
            android.os.Parcel r7 = android.os.Parcel.obtain()     // Catch: android.os.RemoteException -> L98 android.os.DeadObjectException -> Lb1
            java.lang.String r8 = "android.support.v4.app.INotificationSideChannel"
            r7.writeInterfaceToken(r8)     // Catch: java.lang.Throwable -> L93
            r7.writeString(r4)     // Catch: java.lang.Throwable -> L93
            r7.writeInt(r5)     // Catch: java.lang.Throwable -> L93
            r7.writeString(r6)     // Catch: java.lang.Throwable -> L93
            r4 = 1
            if (r0 == 0) goto L81
            r7.writeInt(r4)     // Catch: java.lang.Throwable -> L93
            r0.writeToParcel(r7, r2)     // Catch: java.lang.Throwable -> L93
            goto L84
        L81:
            r7.writeInt(r2)     // Catch: java.lang.Throwable -> L93
        L84:
            android.os.IBinder r0 = r3.a     // Catch: java.lang.Throwable -> L93
            r3 = 0
            r0.transact(r4, r7, r3, r4)     // Catch: java.lang.Throwable -> L93
            r7.recycle()     // Catch: android.os.RemoteException -> L98 android.os.DeadObjectException -> Lb1
            java.util.ArrayDeque r0 = r10.c     // Catch: android.os.RemoteException -> L98 android.os.DeadObjectException -> Lb1
            r0.remove()     // Catch: android.os.RemoteException -> L98 android.os.DeadObjectException -> Lb1
            goto L50
        L93:
            r0 = move-exception
            r7.recycle()     // Catch: android.os.RemoteException -> L98 android.os.DeadObjectException -> Lb1
            throw r0     // Catch: android.os.RemoteException -> L98 android.os.DeadObjectException -> Lb1
        L98:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "RemoteException communicating with "
            r2.<init>(r3)
            android.content.ComponentName r4 = r10.a
            r2.append(r4)
            java.lang.String r2 = java.lang.String.valueOf(r4)
            java.lang.String r2 = r3.concat(r2)
            android.util.Log.w(r1, r2, r0)
            goto Lb2
        Lb1:
        Lb2:
            java.util.ArrayDeque r0 = r10.c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lbd
            r9.c(r10)
        Lbd:
            return
        Lbe:
            r9.c(r10)
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ul.b(uk):void");
    }

    private final void c(uk ukVar) {
        if (this.a.hasMessages(3, ukVar.a)) {
            return;
        }
        int i = ukVar.d + 1;
        ukVar.d = i;
        if (i > 6) {
            Log.w("NotifManCompat", "Giving up on delivering " + ukVar.c.size() + " tasks to " + ukVar.a + " after " + ukVar.d + " retries");
            ukVar.c.clear();
            return;
        }
        this.a.sendMessageDelayed(this.a.obtainMessage(3, ukVar.a), (1 << (i - 1)) * 1000);
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, android.os.IBinder] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        bu buVar;
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    uk ukVar = (uk) this.d.get((ComponentName) message.obj);
                    if (ukVar != null) {
                        a(ukVar);
                    }
                    return true;
                } else if (i != 3) {
                    return false;
                } else {
                    uk ukVar2 = (uk) this.d.get((ComponentName) message.obj);
                    if (ukVar2 != null) {
                        b(ukVar2);
                    }
                    return true;
                }
            }
            azp azpVar = (azp) message.obj;
            Object obj = azpVar.b;
            ?? r9 = azpVar.a;
            uk ukVar3 = (uk) this.d.get(obj);
            if (ukVar3 != null) {
                if (r9 == 0) {
                    buVar = null;
                } else {
                    IInterface queryLocalInterface = r9.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                    buVar = (queryLocalInterface == null || !(queryLocalInterface instanceof bu)) ? new bu(r9) : (bu) queryLocalInterface;
                }
                ukVar3.e = buVar;
                ukVar3.d = 0;
                b(ukVar3);
            }
            return true;
        }
        uj ujVar = (uj) message.obj;
        Set a = um.a(this.b);
        if (!a.equals(this.e)) {
            this.e = a;
            List<ResolveInfo> queryIntentServices = this.b.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (a.contains(resolveInfo.serviceInfo.packageName)) {
                    ComponentName componentName = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.d.containsKey(componentName2)) {
                    this.d.put(componentName2, new uk(componentName2));
                }
            }
            Iterator it = this.d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains(entry.getKey())) {
                    a((uk) entry.getValue());
                    it.remove();
                }
            }
        }
        for (uk ukVar4 : this.d.values()) {
            ukVar4.c.add(ujVar);
            b(ukVar4);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.obtainMessage(1, new azp(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.obtainMessage(2, componentName).sendToTarget();
    }
}
