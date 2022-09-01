package defpackage;

import com.google.android.apps.inputmethod.libs.voiceime.backend.ondevice.PerformanceEvaluationTaskRunner;

/* compiled from: PG */
/* renamed from: fdp  reason: default package */
/* loaded from: classes.dex */
final class fdp extends irw {
    final /* synthetic */ fdq a;

    public fdp(fdq fdqVar) {
        this.a = fdqVar;
    }

    @Override // defpackage.irw
    public final void a() {
        long c = this.a.d.c("last_schedule_perf_eval_time", 0L);
        if (c == 0 || System.currentTimeMillis() - c > fdq.b) {
            this.a.d.i("last_schedule_perf_eval_time", System.currentTimeMillis());
            isf a = ism.a(this.a.c);
            ((ltd) ((ltd) PerformanceEvaluationTaskRunner.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/PerformanceEvaluationTaskRunner", "schedulePerformanceEvaluationTask", 75, "PerformanceEvaluationTaskRunner.java")).t("schedule on-device dictation performance evaluation task.");
            ieh.j().e(fbm.ONDEVICE_DICTATION_PERFORMANCE_EVALUATION_SCHEDULE, new Object[0]);
            a.c(PerformanceEvaluationTaskRunner.c);
        }
    }
}
