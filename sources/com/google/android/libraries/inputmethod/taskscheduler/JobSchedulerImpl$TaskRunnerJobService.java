package com.google.android.libraries.inputmethod.taskscheduler;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class JobSchedulerImpl$TaskRunnerJobService extends JobService {
    public final SparseArray a = new SparseArray();

    public static void a(String str, int i, isa isaVar) {
        ieh.j().e(isk.a, str, Integer.valueOf(i), isaVar, ise.JOB_SCHEDULER);
    }

    static final int b(long j) {
        return (int) TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - j);
    }

    private final isb c(JobParameters jobParameters) {
        int jobId = jobParameters.getJobId();
        isi isiVar = (isi) this.a.get(jobId);
        isb isbVar = null;
        if (isiVar != null) {
            isiVar.b.a.clear();
            jls b = isg.b(jobParameters);
            String a = isg.a(jobParameters);
            if (b != null) {
                isbVar = isiVar.a.a(b);
            }
            this.a.remove(jobId);
            if (!TextUtils.isEmpty(a)) {
                a(a, isiVar.b.c(), isa.ON_STOP);
            }
        }
        return isbVar;
    }

    private final isf d() {
        return ism.a(getApplicationContext());
    }

    private final void e(String str, isd isdVar) {
        d().a(str, null, isdVar);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        isa isaVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String a = isg.a(jobParameters);
        if (!TextUtils.isEmpty(a)) {
            ((ltd) ((ltd) isj.a.b()).k("com/google/android/libraries/inputmethod/taskscheduler/JobSchedulerImpl$TaskRunnerJobService", "onStartJob", 204, "JobSchedulerImpl.java")).w("onStartJob(): %s.", a);
            if (c(jobParameters) != null) {
                ((ltd) ((ltd) isj.a.b()).k("com/google/android/libraries/inputmethod/taskscheduler/JobSchedulerImpl$TaskRunnerJobService", "onStartJob", 209, "JobSchedulerImpl.java")).w("onStartJob(): stops the existing task: %s.", a);
            }
            PersistableBundle extras = jobParameters.getExtras();
            isc iscVar = null;
            String string = (extras == null || extras.isEmpty()) ? null : extras.getString("task_runner_class", "");
            if (string == null || TextUtils.isEmpty(string)) {
                ((ltd) isj.a.a(hip.a).k("com/google/android/libraries/inputmethod/taskscheduler/JobSchedulerImpl$TaskRunnerJobService", "createTaskRunner", 307, "JobSchedulerImpl.java")).w("Failed to run task: %s.", isg.a(jobParameters));
            } else {
                try {
                    Context applicationContext = getApplicationContext();
                    iscVar = (isc) jbt.v(applicationContext.getClassLoader(), isc.class, string, new Class[]{Context.class}, applicationContext);
                } catch (RuntimeException e) {
                    ((ltd) ((ltd) ((ltd) isj.a.d()).i(e)).k("com/google/android/libraries/inputmethod/taskscheduler/JobSchedulerImpl$TaskRunnerJobService", "createTaskRunner", 319, "JobSchedulerImpl.java")).w("Failed to create instance from: %s", string);
                }
            }
            if (iscVar != null) {
                e(a, isd.STARTED);
                jls b = isg.b(jobParameters);
                if (b == null) {
                    return false;
                }
                mko b2 = iscVar.b(b);
                if (b2 == isc.o || b2 == isc.q) {
                    int b3 = b(elapsedRealtime);
                    if (b2 == isc.o) {
                        isaVar = isa.ON_SUCCESS;
                    } else {
                        isaVar = isa.ON_SKIP_TO_RUN;
                    }
                    a(a, b3, isaVar);
                    jobFinished(jobParameters, false);
                    e(a, isd.FINISHED_SUCCESS);
                    return false;
                } else if (b2 == isc.p) {
                    a(a, b(elapsedRealtime), isa.ON_SKIP_TO_RUN);
                    jobFinished(jobParameters, true);
                    e(a, isd.FINISHED_SUCCESS);
                    return false;
                } else {
                    ish ishVar = new ish(d(), jobParameters, this);
                    this.a.put(jobParameters.getJobId(), new isi(iscVar, ishVar));
                    kcu.U(b2, ishVar, gyc.a);
                    return true;
                }
            }
            a(a, b(elapsedRealtime), isa.ON_FAILURE_TO_CREATE_TASK_RUNNER);
            jobFinished(jobParameters, false);
            e(a, isd.STARTED_FAILURE);
        }
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        String a = isg.a(jobParameters);
        ((ltd) ((ltd) isj.a.b()).k("com/google/android/libraries/inputmethod/taskscheduler/JobSchedulerImpl$TaskRunnerJobService", "onStopJob", 263, "JobSchedulerImpl.java")).w("onStopJob(): %s.", isg.a(jobParameters));
        isb c = c(jobParameters);
        if (c == null) {
            ((ltd) ((ltd) isj.a.d()).k("com/google/android/libraries/inputmethod/taskscheduler/JobSchedulerImpl$TaskRunnerJobService", "onStopJob", 267, "JobSchedulerImpl.java")).w("Task: %s is not running.", a);
        }
        e(a, isd.STOPPED);
        return c == isb.FINISHED_NEED_RESCHEDULE;
    }
}
