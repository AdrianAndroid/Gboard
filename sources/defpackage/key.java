package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: key  reason: default package */
/* loaded from: classes.dex */
public final class key implements kcd, kcc {
    private static final ltg a = ltg.j("com/google/android/libraries/performance/primes/metrics/jank/ActivityLevelJankMonitor");
    private final nox b;
    private boolean c = false;
    private Activity d;

    public key(nox noxVar, final oiy oiyVar, final lfb lfbVar, Executor executor) {
        this.b = noxVar;
        executor.execute(new Runnable() { // from class: kex
            @Override // java.lang.Runnable
            public final void run() {
                key.this.c(oiyVar, lfbVar);
            }
        });
    }

    @Override // defpackage.kcd
    public synchronized void a(Activity activity) {
        this.d = activity;
        if (this.c) {
            ((kff) this.b.a()).d(activity);
        }
    }

    @Override // defpackage.kcc
    public synchronized void b(Activity activity) {
        if (!activity.equals(this.d)) {
            ((ltd) ((ltd) a.d()).k("com/google/android/libraries/performance/primes/metrics/jank/ActivityLevelJankMonitor", "onActivityPaused", 90, "ActivityLevelJankMonitor.java")).G("Activity mismatch (currentActivity=%s, activity=%s)", this.d, activity);
        }
        if (this.c) {
            ((kff) this.b.a()).a(activity);
        }
        this.d = null;
    }

    public /* synthetic */ void c(oiy oiyVar, lfb lfbVar) {
        if (((Boolean) oiyVar.a()).booleanValue()) {
            if (lfbVar.e() && !((Boolean) ((oiy) lfbVar.a()).a()).booleanValue()) {
                return;
            }
        } else if (!lfbVar.e() || !((Boolean) ((oiy) lfbVar.a()).a()).booleanValue()) {
            return;
        }
        synchronized (this) {
            this.c = true;
            Activity activity = this.d;
            if (activity != null) {
                a(activity);
            }
        }
    }
}
