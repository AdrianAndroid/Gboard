package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: PG */
/* renamed from: fwj  reason: default package */
/* loaded from: classes.dex */
public abstract class fwj extends Service {
    private final fzu a = new fzt(this);
    private final Object b = new Object();
    private fzx c;

    private final fzx b() {
        fzx fzxVar;
        synchronized (this.b) {
            fzxVar = this.c;
        }
        return fzxVar;
    }

    public abstract void a(String str, byte[] bArr, byte[] bArr2, fwi fwiVar, mzg mzgVar);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        fzx fzxVar;
        if (!"com.google.android.gms.learning.EXAMPLE_STORE_V2".equals(intent.getAction())) {
            return new fzy("Received connection with unexpected action ".concat(String.valueOf(intent.getAction())));
        }
        synchronized (this.b) {
            fzxVar = this.c;
            if (fzxVar == null) {
                try {
                    fzxVar = (fzx) gaf.a(this, "com.google.android.gms.learning.dynamite.proxy.InAppExampleStoreProxyImpl", gbb.b);
                    try {
                        fzxVar.init(ftl.b(this), this.a);
                        this.c = fzxVar;
                    } catch (RemoteException e) {
                        if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                            Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.init", e);
                        }
                        return new fzy("No IInAppExampleStoreProxy implementation found");
                    }
                } catch (gad e2) {
                    if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                        Log.w("brella.InAppExStProxy", "LoadingException during onBind", e2);
                    }
                    return new fzy("No IInAppExampleStoreProxy implementation found");
                }
            }
        }
        try {
            return fzxVar.onBind(intent);
        } catch (RemoteException e3) {
            if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onBind", e3);
            }
            return new fzy("No IInAppExampleStoreProxy implementation found");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        fzx b = b();
        if (b != null) {
            try {
                b.onDestroy();
            } catch (RemoteException e) {
                if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                    Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onCreate", e);
                }
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        fzx b = b();
        if (b != null) {
            try {
                b.onRebind(intent);
                return;
            } catch (RemoteException e) {
                if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                    Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onRebind", e);
                }
            }
        }
        super.onRebind(intent);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        fzx b = b();
        if (b != null) {
            try {
                b.onTrimMemory(i);
            } catch (RemoteException e) {
                if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                    Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onTrimMemory", e);
                }
            }
        }
        super.onTrimMemory(i);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        fzx b = b();
        if (b != null) {
            try {
                return b.onUnbind(intent);
            } catch (RemoteException e) {
                if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                    Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onUnbind", e);
                }
            }
        }
        return super.onUnbind(intent);
    }
}
