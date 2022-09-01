package com.google.android.gms.learning.dynamite.training;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InAppJobServiceImpl extends gan {
    private fze a;

    @Override // defpackage.gao
    public boolean init(ftm ftmVar, ftm ftmVar2) {
        fxf.a();
        this.a = new fze(new fyp((JobService) ftl.c(ftmVar)), kcu.B((ExecutorService) ftl.c(ftmVar2)));
        return true;
    }

    @Override // defpackage.gao
    public void onDestroy() {
        fze fzeVar = this.a;
        try {
            fzeVar.h.e(job.IN_APP_TRAINING_JOB_SERVICE_DESTROY);
            synchronized (fze.b) {
                fzd fzdVar = fzeVar.c;
                if (fzdVar != null) {
                    fzeVar.d(fzdVar, true);
                }
            }
            fzeVar.e.close();
            fzeVar.e = null;
        } catch (RuntimeException e) {
            fzeVar.h.e(job.IN_APP_TRAINING_JOB_SERVICE_DESTROY_ERROR);
            fyb.y(fzeVar.j.a.getApplicationContext(), e);
            throw e;
        }
    }

    @Override // defpackage.gao
    public void onRebind(Intent intent) {
    }

    @Override // defpackage.gao
    public int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (r5.e.isEmpty() != false) goto L18;
     */
    @Override // defpackage.gao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onStartJob(android.app.job.JobParameters r17) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.dynamite.training.InAppJobServiceImpl.onStartJob(android.app.job.JobParameters):boolean");
    }

    @Override // defpackage.gao
    public boolean onStopJob(JobParameters jobParameters) {
        fze fzeVar = this.a;
        try {
            fzeVar.h.e(job.IN_APP_TRAINING_JOB_SERVICE_STOP_JOB);
            synchronized (fze.b) {
                if (fzeVar.c == null) {
                    return false;
                }
                fzeVar.h.e(job.IN_APP_TRAINING_JOB_SERVICE_INTERRUPT_ON_STOP_JOB);
                fzeVar.d(fzeVar.c, true);
                return false;
            }
        } catch (Throwable th) {
            fzeVar.h.e(job.IN_APP_TRAINING_JOB_SERVICE_STOP_JOB_ERROR);
            fyb.y(fzeVar.j.a.getApplicationContext(), th);
            throw th;
        }
    }

    @Override // defpackage.gao
    public void onTrimMemory(int i) {
    }

    @Override // defpackage.gao
    public boolean onUnbind(Intent intent) {
        return false;
    }
}
