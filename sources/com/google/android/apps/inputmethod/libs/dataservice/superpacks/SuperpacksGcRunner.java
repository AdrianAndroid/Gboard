package com.google.android.apps.inputmethod.libs.dataservice.superpacks;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SuperpacksGcRunner implements isc {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/dataservice/superpacks/SuperpacksGcRunner");
    public static final hhl b = hhq.f("superpacks_gc_trigger_period_millis", TimeUnit.DAYS.toMillis(7));
    public final Context c;
    public final mkr d;
    public final bze e;

    public SuperpacksGcRunner(Context context) {
        mks a2 = gxo.a(11);
        bze a3 = bzd.a(context);
        this.c = context;
        this.d = a2;
        this.e = a3;
    }

    @Override // defpackage.isc
    public final isb a(jls jlsVar) {
        return isb.FINISHED;
    }

    @Override // defpackage.isc
    public final mko b(jls jlsVar) {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/dataservice/superpacks/SuperpacksGcRunner", "onRunTask", 66, "SuperpacksGcRunner.java")).t("onRunTask()");
        return mio.h(kcu.P(new clc(this, 1), this.d), new bza(), this.d);
    }
}
