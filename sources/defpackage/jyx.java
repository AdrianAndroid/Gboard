package defpackage;

import android.app.job.JobScheduler;
import android.content.Context;

/* compiled from: PG */
/* renamed from: jyx  reason: default package */
/* loaded from: classes.dex */
public final class jyx {
    public JobScheduler a;
    public Context b;
    public Class c = jyk.class;
    public final int d = jyy.a;
    public final int e = jyy.b;

    public final jyy a() {
        if (this.a == null) {
            Context context = this.b;
            jdg.u(context);
            this.a = (JobScheduler) context.getSystemService("jobscheduler");
        }
        return new jyy(this);
    }
}
