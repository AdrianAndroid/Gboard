package com.google.android.apps.inputmethod.libs.voiceime.backend.ondevice;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PerformanceEvaluationTaskRunner implements isc {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/PerformanceEvaluationTaskRunner");
    public static Boolean b = false;
    public static final iso c;
    private static final long h;
    private static final long i;
    public final Context d;
    public final feo e;
    public final feo f;
    public final fed g;

    static {
        long millis = TimeUnit.MINUTES.toMillis(1L);
        h = millis;
        long millis2 = TimeUnit.HOURS.toMillis(2L);
        i = millis2;
        isn a2 = iso.a("ondevice_dictation_performance_evaluation_task", PerformanceEvaluationTaskRunner.class.getName());
        a2.m = true;
        a2.k = 3;
        a2.l = true;
        a2.b();
        a2.d(1, millis, millis2);
        c = a2.a();
    }

    public PerformanceEvaluationTaskRunner(Context context) {
        feo c2 = feo.c(context, "gboard-small-speech-packs");
        feo c3 = feo.c(context, "ondevice-eval-audio-packs");
        fed fedVar = new fed();
        this.d = context;
        this.e = c2;
        this.f = c3;
        this.g = fedVar;
    }

    @Override // defpackage.isc
    public final isb a(jls jlsVar) {
        ieh.j().e(fbm.ONDEVICE_DICTATION_PERFORMANCE_EVALUATION_STOP, new Object[0]);
        return isb.FINISHED;
    }

    @Override // defpackage.isc
    public final mko b(jls jlsVar) {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/PerformanceEvaluationTaskRunner", "onRunTask", 126, "PerformanceEvaluationTaskRunner.java")).w("onRunTask() : Tag = %s", jlsVar.b);
        return gxo.a(2).hQ(new Callable() { // from class: fef
            /* JADX WARN: Removed duplicated region for block: B:28:0x0173  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 553
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.fef.call():java.lang.Object");
            }
        });
    }
}
