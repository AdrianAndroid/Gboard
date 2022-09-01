package defpackage;

import com.google.android.libraries.inputmethod.trainingcache.maintenance.maintainer.MaintenanceTaskRunner;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ivx  reason: default package */
/* loaded from: classes.dex */
public final class ivx extends irw {
    final /* synthetic */ ivy a;

    public ivx(ivy ivyVar) {
        this.a = ivyVar;
    }

    @Override // defpackage.irw
    public final void a() {
        long currentTimeMillis = System.currentTimeMillis();
        long c = this.a.f.c("pref_maintenance_fail_safe_last_check_timestamp", 0L);
        if (c == 0) {
            this.a.f.i("pref_maintenance_fail_safe_last_check_timestamp", currentTimeMillis);
        } else if (currentTimeMillis - c < TimeUnit.HOURS.toMillis(((Long) ivy.b.c()).longValue())) {
        } else {
            this.a.f.i("pref_maintenance_fail_safe_last_check_timestamp", currentTimeMillis);
            if (currentTimeMillis - this.a.f.c("pref_training_cache_maintenance_task_last_run", 0L) < TimeUnit.DAYS.toMillis(((Long) ivy.c.c()).longValue())) {
                return;
            }
            ieh.j().e(iwc.MAINTENANCE_FAIL_SAFE_COUNT, new Object[0]);
            ivy ivyVar = this.a;
            kcu.U(MaintenanceTaskRunner.e(ivyVar.d, ivyVar.e), new ivq(3), this.a.e);
        }
    }
}
