package defpackage;

import android.content.Context;
import android.util.Printer;
import com.google.android.apps.inputmethod.libs.trainingcache.maintenance.MaintenanceTaskRunner;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: ewx  reason: default package */
/* loaded from: classes.dex */
public final class ewx implements eww {
    @Override // defpackage.eww
    public final void c(isf isfVar) {
        if (MaintenanceTaskRunner.b) {
            return;
        }
        isn a = iso.a("TrainingCacheMaintenance", MaintenanceTaskRunner.class.getName());
        a.b();
        a.m = true;
        a.c(TimeUnit.HOURS.toMillis(24L), TimeUnit.HOURS.toMillis(8L));
        a.d(1, TimeUnit.MINUTES.toMillis(15L), TimeUnit.HOURS.toMillis(4L));
        MaintenanceTaskRunner.b = isfVar.c(a.a());
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
    }

    @Override // defpackage.ifw
    public final void gn() {
    }
}
