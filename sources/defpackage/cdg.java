package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.delight5.dlam.training.DlamTrainer;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: cdg  reason: default package */
/* loaded from: classes.dex */
public final class cdg implements isc {
    static final hhl a = hhq.f("dlam_training_period_days", 1);
    static final hhl b = hhq.a("dlam_require_unmetered_network", true);
    static final hhl c = hhq.a("dlam_require_charging", true);
    static final hhl d = hhq.a("dlam_require_idle", true);
    private final mkr e;
    private final DlamTrainer f;

    public cdg(Context context) {
        mks a2 = gxo.a(9);
        DlamTrainer dlamTrainer = new DlamTrainer(context);
        this.e = a2;
        this.f = dlamTrainer;
    }

    public static iso c() {
        isn a2 = iso.a("DlamTrainingTask", cdg.class.getName());
        long millis = TimeUnit.DAYS.toMillis(((Long) a.c()).longValue());
        if (millis < 0) {
            ((ltd) iso.a.a(hip.a).k("com/google/android/libraries/inputmethod/taskscheduler/TaskSpec$Builder", "setMinDelayMillis", 516, "TaskSpec.java")).v("Min execution delay %d must be non negative.", millis);
        } else if (millis > iso.i) {
            ((ltd) iso.a.a(hip.a).k("com/google/android/libraries/inputmethod/taskscheduler/TaskSpec$Builder", "setMinDelayMillis", 521, "TaskSpec.java")).v("Min execution delay %d is too long.", millis);
        } else {
            a2.o = millis;
        }
        int i = 1;
        if (true == ((Boolean) b.c()).booleanValue()) {
            i = 3;
        }
        a2.k = i;
        a2.l = ((Boolean) c.c()).booleanValue();
        a2.m = ((Boolean) d.c()).booleanValue();
        a2.b();
        return a2.a();
    }

    @Override // defpackage.isc
    public final isb a(jls jlsVar) {
        return isb.FINISHED_NEED_RESCHEDULE;
    }

    @Override // defpackage.isc
    public final mko b(jls jlsVar) {
        return this.e.hQ(this.f);
    }
}
