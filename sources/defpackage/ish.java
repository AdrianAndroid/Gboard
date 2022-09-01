package defpackage;

import android.app.job.JobParameters;
import android.os.SystemClock;
import com.google.android.libraries.inputmethod.taskscheduler.JobSchedulerImpl$TaskRunnerJobService;
import j$.time.Duration;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: ish  reason: default package */
/* loaded from: classes.dex */
public final class ish implements mka {
    public final WeakReference a;
    private final isf b;
    private final JobParameters c;
    private final String d;
    private final long e = SystemClock.elapsedRealtime();

    public ish(isf isfVar, JobParameters jobParameters, JobSchedulerImpl$TaskRunnerJobService jobSchedulerImpl$TaskRunnerJobService) {
        this.b = isfVar;
        this.c = jobParameters;
        this.d = isg.a(jobParameters);
        this.a = new WeakReference(jobSchedulerImpl$TaskRunnerJobService);
    }

    private final void d(boolean z) {
        JobSchedulerImpl$TaskRunnerJobService jobSchedulerImpl$TaskRunnerJobService = (JobSchedulerImpl$TaskRunnerJobService) this.a.get();
        if (jobSchedulerImpl$TaskRunnerJobService != null) {
            JobParameters jobParameters = this.c;
            jobSchedulerImpl$TaskRunnerJobService.a.remove(jobParameters.getJobId());
            jobSchedulerImpl$TaskRunnerJobService.jobFinished(jobParameters, z);
            return;
        }
        ((ltd) ((ltd) isj.a.b()).k("com/google/android/libraries/inputmethod/taskscheduler/JobSchedulerImpl$TaskRunnerJobService$Callback", "finishTaskIfNeeded", 411, "JobSchedulerImpl.java")).w("Task: %s has already been stopped or cancelled.", this.d);
    }

    @Override // defpackage.mka
    public final void a(Throwable th) {
        JobSchedulerImpl$TaskRunnerJobService.a(this.d, c(), isa.ON_FAILURE);
        ((ltd) ((ltd) isj.a.b()).k("com/google/android/libraries/inputmethod/taskscheduler/JobSchedulerImpl$TaskRunnerJobService$Callback", "onFailure", 387, "JobSchedulerImpl.java")).w("Task: %s fails.", this.d);
        d(false);
        this.b.a(this.d, null, isd.FINISHED_FAILURE);
    }

    @Override // defpackage.mka
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        isb isbVar = (isb) obj;
        JobSchedulerImpl$TaskRunnerJobService.a(this.d, c(), isa.ON_SUCCESS);
        ((ltd) ((ltd) isj.a.b()).k("com/google/android/libraries/inputmethod/taskscheduler/JobSchedulerImpl$TaskRunnerJobService$Callback", "onSuccess", 379, "JobSchedulerImpl.java")).w("Task: %s successes.", this.d);
        d(isbVar == isb.FINISHED_NEED_RESCHEDULE);
        this.b.a(this.d, null, isd.FINISHED_SUCCESS);
    }

    public final int c() {
        return (int) Duration.ofMillis(SystemClock.elapsedRealtime() - this.e).getSeconds();
    }
}
