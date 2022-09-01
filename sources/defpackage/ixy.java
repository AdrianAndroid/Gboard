package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.util.Printer;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: ixy  reason: default package */
/* loaded from: classes.dex */
public final class ixy implements ixu {
    static final hhl a = hhq.f("training_process_termination_strategy", 0);
    static final hhl b = hhq.f("training_process_termination_interval_millis", TimeUnit.HOURS.toMillis(2));
    private final Context c;
    private final Executor d;
    private final idk e;
    private final String f;
    private long g = 0;
    private long h = 0;
    private final hzr i = new ixw(this);
    private final irw j = new ixx(this);

    public ixy(Context context) {
        mks a2 = gxo.a(19);
        ieh j = ieh.j();
        this.c = context;
        this.d = a2;
        this.e = j;
        this.f = String.valueOf(context.getPackageName()).concat(":train");
    }

    public final synchronized void c(int i) {
        int i2;
        boolean z;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        long j = i;
        if ((((Long) a.c()).longValue() & j) == j && (this.g == 0 || System.currentTimeMillis() - this.g >= ((Long) b.c()).longValue())) {
            this.g = System.currentTimeMillis();
            String str = this.f;
            long currentTimeMillis = System.currentTimeMillis();
            ActivityManager activityManager = (ActivityManager) this.c.getSystemService("activity");
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.processName.equals(str)) {
                        i2 = runningAppProcessInfo.pid;
                        break;
                    }
                }
            }
            i2 = 0;
            int i3 = 1;
            if (i2 != 0) {
                Process.killProcess(i2);
                z = true;
            } else {
                z = false;
            }
            this.e.g(iya.a, System.currentTimeMillis() - currentTimeMillis);
            if (z) {
                this.h = System.currentTimeMillis();
                idk idkVar = this.e;
                ixv ixvVar = ixv.a;
                Object[] objArr = new Object[1];
                if (i == 1) {
                    i3 = 0;
                }
                objArr[0] = Integer.valueOf(i3);
                idkVar.e(ixvVar, objArr);
            }
        }
    }

    @Override // defpackage.gzv
    public final synchronized void dump(Printer printer, boolean z) {
        gzu.a(printer, "training process last try to kill time: %d, last kill time: %d", Long.valueOf(this.g), Long.valueOf(this.h));
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "TrainingProcessTerminatorModule";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        this.i.d(this.d);
        this.j.e(this.d);
    }

    @Override // defpackage.ifw
    public final void gn() {
        this.i.e();
        this.j.g();
    }
}
