package com.google.android.apps.inputmethod.libs.dataservice.superpacks;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.PowerManager;
import com.google.android.inputmethod.latin.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SuperpacksForegroundTaskService extends jyn {
    private static final ltg d = ltg.j("com/google/android/apps/inputmethod/libs/dataservice/superpacks/SuperpacksForegroundTaskService");

    public static uh b(Context context) {
        Resources resources = context.getResources();
        String string = resources.getString(R.string.f174650_resource_name_obfuscated_res_0x7f140c1c);
        uh uhVar = new uh(context, resources.getString(R.string.f174630_resource_name_obfuscated_res_0x7f140c1a));
        uhVar.i(R.drawable.f49030_resource_name_obfuscated_res_0x7f08028b);
        uhVar.g(resources.getText(R.string.ime_name));
        uhVar.f(string);
        uhVar.h(0, 0, true);
        return uhVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jyb
    public final Notification a() {
        bzd.a(getApplicationContext()).j();
        return b(getApplicationContext()).a();
    }

    @Override // defpackage.jyn
    protected final jzm c(Context context) {
        return bzr.l(context);
    }

    @Override // defpackage.jyn
    protected final mks d() {
        return bzr.n();
    }

    @Override // defpackage.jyn
    protected final List e() {
        jxd f = jxg.f();
        f.a = getApplicationContext();
        f.b = bzr.o();
        return llp.r(f.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jyb
    public final void f() {
        ((ltd) ((ltd) d.b()).k("com/google/android/apps/inputmethod/libs/dataservice/superpacks/SuperpacksForegroundTaskService", "finishJob", 52, "SuperpacksForegroundTaskService.java")).t("SuperpacksForegroundTaskService.finishJob()");
        stopSelf();
        PowerManager.WakeLock wakeLock = this.a;
        if (wakeLock != null) {
            try {
                wakeLock.release();
            } catch (RuntimeException e) {
                ((luc) ((luc) ((luc) jsh.a.c()).i(e)).k("com/google/android/libraries/micore/superpacks/scheduling/AbstractForegroundTaskService", "finishJob", (char) 194, "AbstractForegroundTaskService.java")).t("Error releasing wakelock");
            }
        }
    }

    @Override // defpackage.jyb, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        ltg ltgVar = d;
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/dataservice/superpacks/SuperpacksForegroundTaskService", "onStartCommand", 39, "SuperpacksForegroundTaskService.java")).u("SuperpacksForegroundTaskService.onStartCommand(): %s", i2);
        lug lugVar = jsh.a;
        if (!this.c) {
            this.c = true;
            if (this.b) {
                Notification a = a();
                jdg.u(a);
                startForeground(1, a);
            }
            super.h();
            g();
        }
        if (irv.b() || jam.B()) {
            return 2;
        }
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/dataservice/superpacks/SuperpacksForegroundTaskService", "onStartCommand", 44, "SuperpacksForegroundTaskService.java")).t("finishJob as no network");
        f();
        return 2;
    }
}
