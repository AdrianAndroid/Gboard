package defpackage;

import android.content.Context;
import android.util.Printer;
import com.google.android.libraries.inputmethod.trainingcache.maintenance.maintainer.MaintenanceTaskRunner;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ivy  reason: default package */
/* loaded from: classes.dex */
public final class ivy implements ivw, hhk {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/trainingcache/maintenance/maintainer/MaintainerModule");
    static final hhl b = hhq.f("training_cache_maintenance_fail_safe_check_interval_hours", 12);
    static final hhl c = hhq.f("training_cache_maintenance_fail_safe_trigger_baseline_days", 3);
    public final Context d;
    public final Executor e;
    public final ino f;
    public final gjz g;
    private final isf h;
    private final irw i = new ivx(this);

    static {
        hhq.a("enable_training_cache_maintenance_fail_safe_check", true);
    }

    public ivy(Context context) {
        isf a2 = ism.a(context);
        gjz gjzVar = gvs.a;
        mks c2 = gxo.c(11);
        this.d = context;
        this.h = a2;
        this.g = gjzVar;
        this.e = c2;
        this.f = ino.K(context, null);
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        this.h.c(MaintenanceTaskRunner.c());
        this.i.e(this.e);
    }

    @Override // defpackage.ifw
    public final void gn() {
        this.i.g();
        this.h.b(MaintenanceTaskRunner.c());
        kcu.U(MaintenanceTaskRunner.e(this.d, this.e), new ivq(4), this.e);
    }

    @Override // defpackage.hhk
    public final void ib(hhl hhlVar) {
        if (((Boolean) hhlVar.c()).booleanValue()) {
            this.i.e(this.e);
        } else {
            this.i.g();
        }
    }
}
