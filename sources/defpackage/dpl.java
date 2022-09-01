package defpackage;

/* compiled from: PG */
/* renamed from: dpl  reason: default package */
/* loaded from: classes.dex */
public final class dpl extends idb {
    public static final ido[] a = {dpn.LSTM_IN_APP_TRAINING_SCHEDULED, dpn.LSTM_TRAINING_ENABLED};
    private static final ltg f = ltg.j("com/google/android/apps/inputmethod/libs/lstm/LstmMetricsProcessorHelper");
    private final dpk g;

    public dpl(dpk dpkVar) {
        this.g = dpkVar;
    }

    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        if (dpn.LSTM_IN_APP_TRAINING_SCHEDULED == idoVar) {
            this.g.a.c("LstmExtension.inAppTrainingScheduled");
            return true;
        } else if (dpn.LSTM_TRAINING_ENABLED == idoVar) {
            Object obj = objArr[0];
            if (obj == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/lstm/LstmMetricsProcessorHelper", "doProcessMetrics", 30, "LstmMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            dpk dpkVar = this.g;
            dpkVar.a.b("LstmExtension.trainingEnabled", ((Boolean) obj).booleanValue());
            return true;
        } else {
            ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/lstm/LstmMetricsProcessorHelper", "doProcessMetrics", 36, "LstmMetricsProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
            return false;
        }
    }
}
