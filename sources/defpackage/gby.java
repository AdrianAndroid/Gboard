package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.Build;

/* compiled from: PG */
/* renamed from: gby  reason: default package */
/* loaded from: classes.dex */
public final class gby implements gbl {
    private static final jns a = jnl.b("brella", "JobSchdlrDlgt");
    private final JobScheduler b;
    private final gbz c;
    private final fwo d;

    public gby(JobScheduler jobScheduler, gbz gbzVar, fwo fwoVar) {
        this.b = jobScheduler;
        this.c = gbzVar;
        this.d = fwoVar;
    }

    @Override // defpackage.gbl
    public final void a(joe joeVar) {
        this.b.cancel(joeVar.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0167 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0103  */
    @Override // defpackage.gbl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(defpackage.joe r20, long r21) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gby.b(joe, long):boolean");
    }

    public final JobInfo c(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.b.getPendingJob(i);
        }
        try {
            for (JobInfo jobInfo : this.b.getAllPendingJobs()) {
                if (jobInfo.getId() == i) {
                    return jobInfo;
                }
            }
            return null;
        } catch (IllegalArgumentException | IllegalStateException | NullPointerException e) {
            a.f(e, "Buggy getAllPendingJobs() implementation!");
            return null;
        }
    }
}
