package com.google.android.gms.learning.internal.training;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class InAppTrainingService extends Service {
    private static final String TAG = "brella.InAppTrngSvc";
    gba dynamiteImpl;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        gba gbaVar = this.dynamiteImpl;
        if (gbaVar != null) {
            try {
                return gbaVar.onBind(intent);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onBind", e);
                }
            }
        }
        return new fzy("No IInAppTrainingService implementation found");
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            gba gbaVar = (gba) gaf.a(this, "com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl", gbb.d);
            try {
                gbaVar.onCreate(ftl.b(this));
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException during onCreate", e);
                }
            }
            try {
                gbaVar.addHttpUrlConnectionFactory("cronet", new gah(getApplicationContext()));
            } catch (RemoteException e2) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException during addHttpUrlConnectionFactory", e2);
                }
            }
            this.dynamiteImpl = gbaVar;
        } catch (gad e3) {
            if (!Log.isLoggable(TAG, 5)) {
                return;
            }
            Log.w(TAG, "LoadingException during onCreate", e3);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        gba gbaVar = this.dynamiteImpl;
        if (gbaVar != null) {
            try {
                gbaVar.onDestroy();
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onDestroy", e);
                }
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        gba gbaVar = this.dynamiteImpl;
        if (gbaVar != null) {
            try {
                gbaVar.onRebind(intent);
                return;
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onRebind", e);
                }
            }
        }
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        gba gbaVar = this.dynamiteImpl;
        if (gbaVar != null) {
            try {
                return gbaVar.onStartCommand(intent, i, i2);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onStartCommand", e);
                }
            }
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        gba gbaVar = this.dynamiteImpl;
        if (gbaVar != null) {
            try {
                gbaVar.onTrimMemory(i);
            } catch (RemoteException e) {
                if (!Log.isLoggable(TAG, 5)) {
                    return;
                }
                Log.w(TAG, "RemoteException in IInAppTrainingService.onTrimMemory", e);
            }
        }
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        gba gbaVar = this.dynamiteImpl;
        if (gbaVar != null) {
            try {
                return gbaVar.onUnbind(intent);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onUnbind", e);
                }
            }
        }
        return super.onUnbind(intent);
    }
}
