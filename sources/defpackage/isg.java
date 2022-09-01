package defpackage;

import android.app.job.JobParameters;
import android.os.PersistableBundle;
import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: isg  reason: default package */
/* loaded from: classes.dex */
public final class isg {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/taskscheduler/JobInfoUtil");

    public static String a(JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        return (extras == null || extras.isEmpty()) ? "" : extras.getString("task_tag", "");
    }

    public static jls b(JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        if (extras != null && !extras.isEmpty()) {
            String string = extras.getString("task_tag", "");
            if (string == null || TextUtils.isEmpty(string)) {
                ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/taskscheduler/JobInfoUtil", "getTaskParameters", 87, "JobInfoUtil.java")).u("Fail to get task tag: %d.", jobParameters.getJobId());
            } else {
                return new jls(string, jobParameters.getExtras());
            }
        }
        return null;
    }
}
