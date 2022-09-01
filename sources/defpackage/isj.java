package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.util.Printer;
import com.google.android.libraries.inputmethod.taskscheduler.JobSchedulerImpl$TaskRunnerJobService;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: isj  reason: default package */
/* loaded from: classes.dex */
public final class isj implements isf, gzv {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/taskscheduler/JobSchedulerImpl");
    private final Context b;
    private final JobScheduler c;
    private final Map d = new HashMap();
    private final Map e = new HashMap();

    public isj(Context context) {
        this.b = context;
        this.c = (JobScheduler) context.getSystemService("jobscheduler");
        gzt.a.a(this);
    }

    @Override // defpackage.isf
    public final synchronized void a(String str, iso isoVar, isd isdVar) {
        if (isoVar != null) {
            this.d.put(str, isoVar);
        }
        this.e.put(str, isdVar);
    }

    @Override // defpackage.isf
    public final boolean b(iso isoVar) {
        Object obj = isoVar.x.b;
        String str = (String) obj;
        int hashCode = str.hashCode();
        if (Build.VERSION.SDK_INT >= 24) {
            if (this.c.getPendingJob(hashCode) != null) {
                ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/taskscheduler/JobSchedulerImpl", "cancel", 109, "JobSchedulerImpl.java")).w("Cancel task: %s. Success.", obj);
                this.c.cancel(hashCode);
            }
            ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/taskscheduler/JobSchedulerImpl", "cancel", 125, "JobSchedulerImpl.java")).w("Cancel task: %s. Not pending.", obj);
        } else {
            for (JobInfo jobInfo : this.c.getAllPendingJobs()) {
                if (jobInfo.getId() == hashCode) {
                    this.c.cancel(hashCode);
                    break;
                }
            }
            ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/taskscheduler/JobSchedulerImpl", "cancel", 125, "JobSchedulerImpl.java")).w("Cancel task: %s. Not pending.", obj);
        }
        a(str, isoVar, isd.CANCELLED);
        return true;
    }

    @Override // defpackage.isf
    public final boolean c(iso isoVar) {
        int i;
        String str;
        Object obj = isoVar.x.b;
        String str2 = (String) obj;
        int hashCode = str2.hashCode();
        if (Build.VERSION.SDK_INT < 24 || this.c.getPendingJob(hashCode) == null) {
            if (Build.VERSION.SDK_INT < 24 && !isoVar.w) {
                ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/taskscheduler/JobSchedulerImpl", "schedule", 83, "JobSchedulerImpl.java")).w("replaceCurrent = false is not supported in current version, task: \"%s\" willupdate the pre-existing one (if any) with the same tag.", obj);
            }
        } else if (isoVar.w) {
            ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/taskscheduler/JobSchedulerImpl", "schedule", 73, "JobSchedulerImpl.java")).w("Schedule task: %s. Cancel the pre-existing task.", obj);
            this.c.cancel(hashCode);
        } else {
            ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/taskscheduler/JobSchedulerImpl", "schedule", 76, "JobSchedulerImpl.java")).w("Schedule task: %s. Already pending.", obj);
            return true;
        }
        JobInfo.Builder builder = new JobInfo.Builder(hashCode, new ComponentName(this.b, JobSchedulerImpl$TaskRunnerJobService.class));
        jls jlsVar = isoVar.x;
        PersistableBundle persistableBundle = (PersistableBundle) jlsVar.a;
        persistableBundle.putString("task_tag", (String) jlsVar.b);
        persistableBundle.putString("task_runner_class", isoVar.j);
        JobInfo.Builder requiresDeviceIdle = builder.setExtras(persistableBundle).setPersisted(isoVar.q).setRequiresCharging(isoVar.s).setRequiresDeviceIdle(isoVar.t);
        int i2 = isoVar.r;
        if (i2 == 0) {
            i = 0;
        } else if (i2 != 1) {
            i = 2;
            if (i2 == 2) {
                i = 3;
            }
        } else {
            i = 1;
        }
        requiresDeviceIdle.setRequiredNetworkType(i);
        if (isoVar.k == 0) {
            str = "setJobInfo";
        } else if (!isoVar.t) {
            builder.setBackoffCriteria(isoVar.l, 1);
            str = "setJobInfo";
        } else {
            str = "setJobInfo";
            ((ltd) ((ltd) isg.a.d()).k("com/google/android/libraries/inputmethod/taskscheduler/JobInfoUtil", str, 45, "JobInfoUtil.java")).w("The retry policy will be ignored for idle task: %s.", isoVar.x.b);
        }
        if (isoVar.n) {
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setPeriodic(isoVar.o, isoVar.p);
            } else {
                builder.setPeriodic(isoVar.o);
            }
            if (isoVar.m != -1) {
                ((ltd) ((ltd) isg.a.d()).k("com/google/android/libraries/inputmethod/taskscheduler/JobInfoUtil", str, 56, "JobInfoUtil.java")).w("The max execution delay will be ignored for periodic task: %s", isoVar.x.b);
            }
        } else {
            long j = isoVar.u;
            if (j != -1) {
                builder.setOverrideDeadline(j);
            }
            long j2 = isoVar.v;
            if (j2 != -1) {
                builder.setMinimumLatency(j2);
            }
        }
        int schedule = this.c.schedule(builder.build());
        if (schedule == 1) {
            ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/taskscheduler/JobSchedulerImpl", "schedule", 91, "JobSchedulerImpl.java")).E("Schedule task: %s (id=%d). Success.", obj, hashCode);
            a(str2, isoVar, isd.SCHEDULED_SUCCESS);
            return true;
        }
        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/taskscheduler/JobSchedulerImpl", "schedule", 95, "JobSchedulerImpl.java")).E("Schedule task: %s. Fail with error: %d.", obj, schedule);
        a(str2, isoVar, isd.SCHEDULED_FAILURE);
        return false;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        synchronized (this) {
            lsz it = ((lrz) lvw.j(this.e.keySet(), this.d.keySet())).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                int hashCode = str.hashCode();
                printer.println("### Task tag: [" + str + "], task Id: [" + hashCode + "]");
                String valueOf = String.valueOf((isd) this.e.get(str));
                StringBuilder sb = new StringBuilder();
                sb.append("    Task status: ");
                sb.append(valueOf);
                printer.println(sb.toString());
                printer.println(String.valueOf((iso) this.d.get(str)));
            }
        }
        printer.println("");
        printer.println("All pending jobs:");
        printer.println(this.c.getAllPendingJobs().toString());
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "JobSchedulerImpl";
    }
}
