package com.google.android.apps.inputmethod.libs.dataservice.superpacks;

import android.app.job.JobParameters;
import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SuperpacksBackgroundJobService extends jyk {
    private static final lug a = lug.i("SpBackgroundTask");

    @Override // defpackage.jyk
    protected final jzm a(Context context) {
        return bzr.l(context);
    }

    @Override // defpackage.jyk
    protected final mks b() {
        return bzr.n();
    }

    @Override // defpackage.jyk
    protected final List c() {
        jxd f = jxg.f();
        f.a = getApplicationContext();
        f.b = bzr.o();
        return llp.r(f.a());
    }

    @Override // defpackage.jyk, android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        ((luc) ((luc) a.b()).k("com/google/android/apps/inputmethod/libs/dataservice/superpacks/SuperpacksBackgroundJobService", "onStartJob", 23, "SuperpacksBackgroundJobService.java")).w("onStartJob: %s", jobParameters);
        super.onStartJob(jobParameters);
        return true;
    }
}
