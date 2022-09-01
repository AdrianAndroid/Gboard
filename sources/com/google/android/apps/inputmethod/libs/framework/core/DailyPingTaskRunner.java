package com.google.android.apps.inputmethod.libs.framework.core;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DailyPingTaskRunner implements isc {
    static final long a;
    static final long b;
    public static final iso c;
    private static final ltg d = ltg.j("com/google/android/apps/inputmethod/libs/framework/core/DailyPingTaskRunner");
    private final idk e = ieh.j();

    static {
        long millis = TimeUnit.HOURS.toMillis(8L);
        a = millis;
        long millis2 = TimeUnit.HOURS.toMillis(1L);
        b = millis2;
        isn a2 = iso.a("daily_ping_task", DailyPingTaskRunner.class.getName());
        a2.e(millis);
        a2.b();
        a2.d(1, millis2, millis);
        c = a2.a();
    }

    public DailyPingTaskRunner(Context context) {
    }

    @Override // defpackage.isc
    public final isb a(jls jlsVar) {
        return isb.FINISHED;
    }

    @Override // defpackage.isc
    public final mko b(jls jlsVar) {
        ((ltd) ((ltd) d.b()).k("com/google/android/apps/inputmethod/libs/framework/core/DailyPingTaskRunner", "onRunTask", 64, "DailyPingTaskRunner.java")).w("onRunTask() : Tag = %s", jlsVar.b);
        this.e.e(dda.DAILY_PING, new Object[0]);
        return isc.o;
    }
}
