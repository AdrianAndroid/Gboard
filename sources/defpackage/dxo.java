package defpackage;

/* compiled from: PG */
/* renamed from: dxo  reason: default package */
/* loaded from: classes.dex */
public final class dxo extends idb {
    public static final ido[] a = {dxp.a};
    private static final ltg f = ltg.j("com/google/android/apps/inputmethod/libs/onboardingflow/OnboardingFlowMetricsProcessorHelper");
    private final dxn g;

    public dxo(dxn dxnVar) {
        this.g = dxnVar;
    }

    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, idi] */
    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        if (dxp.a == idoVar) {
            Object obj = objArr[0];
            if (obj == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/onboardingflow/OnboardingFlowMetricsProcessorHelper", "doProcessMetrics", 27, "OnboardingFlowMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            dxn dxnVar = this.g;
            dxnVar.a.d("OnboardingFlow.JapaneseLayoutSetup", ((Number) obj).intValue());
            return true;
        }
        ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/onboardingflow/OnboardingFlowMetricsProcessorHelper", "doProcessMetrics", 33, "OnboardingFlowMetricsProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
        return false;
    }
}
