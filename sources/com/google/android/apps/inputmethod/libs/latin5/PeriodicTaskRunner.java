package com.google.android.apps.inputmethod.libs.latin5;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PeriodicTaskRunner implements Callable, isc {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/latin5/PeriodicTaskRunner");
    public static final long b = TimeUnit.HOURS.toMillis(24);
    public static final long c = TimeUnit.MINUTES.toMillis(15);
    public static final long d = TimeUnit.HOURS.toMillis(2);
    public static boolean e = false;
    public final idk f;
    private final Context g;
    private final Delight5Facilitator h;
    private final mkr i;
    private final jan j;
    private final iff k;

    public PeriodicTaskRunner(Context context) {
        ieh j = ieh.j();
        Delight5Facilitator h = Delight5Facilitator.h(context);
        mks c2 = gxo.c(11);
        jan janVar = jan.b;
        iff iffVar = new iff(context, ieh.j());
        this.g = context;
        this.f = j;
        this.h = h;
        this.i = c2;
        this.j = janVar;
        this.k = iffVar;
    }

    public static void c(isa isaVar, long j) {
        ieh.j().e(isk.a, "PeriodicTasks", Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - j)), isaVar, ise.MANUAL_RUN);
    }

    public static boolean d(Context context) {
        long c2 = ino.M(context).c("periodic_task_last_run", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        return c2 != 0 && currentTimeMillis >= c2 && TimeUnit.MILLISECONDS.toHours(currentTimeMillis - c2) < 24;
    }

    private final isb e(boolean z, long j) {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/latin5/PeriodicTaskRunner", "reportResult", 270, "PeriodicTaskRunner.java")).F("call() : %s in %d ms", true != z ? "Failure" : "Success", System.currentTimeMillis() - j);
        this.f.e(dda.PERIODIC_TASK_SERVICE_SUCCESS, Boolean.valueOf(z));
        return z ? isb.FINISHED : isb.FINISHED_NEED_RESCHEDULE;
    }

    @Override // defpackage.isc
    public final isb a(jls jlsVar) {
        return isb.FINISHED_NEED_RESCHEDULE;
    }

    @Override // defpackage.isc
    public final mko b(jls jlsVar) {
        if (d(this.g)) {
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/latin5/PeriodicTaskRunner", "onRunTask", 213, "PeriodicTaskRunner.java")).t("Skip to run PeriodicTask since the task has already run once within 24 hours.");
            return isc.q;
        } else if (irx.b()) {
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/latin5/PeriodicTaskRunner", "onRunTask", 220, "PeriodicTaskRunner.java")).t("Skip to run PeriodicTask since screen is on.");
            return isc.q;
        } else {
            return this.i.hQ(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0094, code lost:
        ((defpackage.ltd) ((defpackage.ltd) com.google.android.apps.inputmethod.libs.latin5.PeriodicTaskRunner.a.d()).k("com/google/android/apps/inputmethod/libs/latin5/PeriodicTaskRunner", "call", 247, "PeriodicTaskRunner.java")).t("call() : Failed to prune dynamic LM's");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
        return e(false, r0);
     */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.inputmethod.libs.latin5.PeriodicTaskRunner.call():java.lang.Object");
    }
}
