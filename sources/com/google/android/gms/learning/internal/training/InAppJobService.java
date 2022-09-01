package com.google.android.gms.learning.internal.training;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.PowerManager;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InAppJobService extends JobService {
    static final String TAG = "brella.InAppJobSvc";
    gao dynamiteImpl;

    private boolean isIdleConstraintMet(JobParameters jobParameters) {
        return !((PowerManager) getSystemService("power")).isInteractive() || jobParameters.getExtras().getInt("waive_idle_requirement", 0) == 1;
    }

    private boolean tryLoadDynamiteImpl() {
        if (this.dynamiteImpl != null) {
            return true;
        }
        try {
            gao gaoVar = (gao) gaf.a(this, "com.google.android.gms.learning.dynamite.training.InAppJobServiceImpl", gbb.a);
            try {
                if (gaoVar.init(ftl.b(this), ftl.b(getBgExecutor()))) {
                    this.dynamiteImpl = gaoVar;
                    return true;
                }
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "IInAppJobService.init failed");
                }
                return false;
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.init", e);
                }
                return false;
            }
        } catch (gad e2) {
            if (Log.isLoggable(TAG, 5)) {
                Log.w(TAG, "LoadingException during tryLoadDynamiteImpl", e2);
            }
            return false;
        }
    }

    public ExecutorService getBgExecutor() {
        return gbc.a;
    }

    @Override // android.app.Service
    public void onDestroy() {
        gao gaoVar = this.dynamiteImpl;
        if (gaoVar != null) {
            try {
                gaoVar.onDestroy();
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onDestroy", e);
                }
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        gao gaoVar = this.dynamiteImpl;
        if (gaoVar != null) {
            try {
                gaoVar.onRebind(intent);
                return;
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onRebind", e);
                }
            }
        }
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        gao gaoVar = this.dynamiteImpl;
        if (gaoVar != null) {
            try {
                return gaoVar.onStartCommand(intent, i, i2);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onStartCommand", e);
                }
            }
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.job.JobService
    public synchronized boolean onStartJob(JobParameters jobParameters) {
        if (!isIdleConstraintMet(jobParameters)) {
            gai.b(this, jobParameters);
            return false;
        } else if (!tryLoadDynamiteImpl()) {
            gai.b(this, jobParameters);
            return false;
        } else {
            try {
                return this.dynamiteImpl.onStartJob(jobParameters);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onStartJob", e);
                }
                gai.b(this, jobParameters);
                return false;
            }
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        gao gaoVar = this.dynamiteImpl;
        if (gaoVar != null) {
            try {
                return gaoVar.onStopJob(jobParameters);
            } catch (RemoteException e) {
                if (!Log.isLoggable(TAG, 5)) {
                    return false;
                }
                Log.w(TAG, "RemoteException in IInAppJobService.onStopJob", e);
                return false;
            }
        }
        return false;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        gao gaoVar = this.dynamiteImpl;
        if (gaoVar != null) {
            try {
                gaoVar.onTrimMemory(i);
            } catch (RemoteException e) {
                if (!Log.isLoggable(TAG, 5)) {
                    return;
                }
                Log.w(TAG, "RemoteException in IInAppJobService.onTrimMemory", e);
            }
        }
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        gao gaoVar = this.dynamiteImpl;
        if (gaoVar != null) {
            try {
                return gaoVar.onUnbind(intent);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onUnbind", e);
                }
            }
        }
        return super.onUnbind(intent);
    }
}
