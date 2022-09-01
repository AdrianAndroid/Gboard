package defpackage;

import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IInterface;

/* compiled from: PG */
/* renamed from: gao  reason: default package */
/* loaded from: classes.dex */
public interface gao extends IInterface {
    boolean init(ftm ftmVar, ftm ftmVar2);

    void onDestroy();

    void onRebind(Intent intent);

    int onStartCommand(Intent intent, int i, int i2);

    boolean onStartJob(JobParameters jobParameters);

    boolean onStopJob(JobParameters jobParameters);

    void onTrimMemory(int i);

    boolean onUnbind(Intent intent);
}
