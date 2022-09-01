package defpackage;

/* compiled from: PG */
/* renamed from: idb  reason: default package */
/* loaded from: classes.dex */
public class idb {
    private static final ltg a = ltg.j("com/google/android/libraries/inputmethod/metrics/AbstractMetricsProcessorHelper");
    public ido b;
    public long c;
    public long d;
    public idu e;

    protected boolean a(ido idoVar, Object[] objArr) {
        throw null;
    }

    public final void b(ido idoVar, idu iduVar, long j, long j2, Object[] objArr) {
        if (idoVar != null) {
            this.b = idoVar;
            this.e = iduVar;
            this.c = j;
            this.d = j2;
            if (!a(idoVar, objArr)) {
                ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/metrics/AbstractMetricsProcessorHelper", "processMetrics", 34, "AbstractMetricsProcessorHelper.java")).w("Failed to handle metricsType: %s", idoVar);
            }
            this.b = null;
            this.e = new idu();
            this.c = 0L;
            this.d = 0L;
            return;
        }
        throw new IllegalArgumentException("metricsType is null!");
    }
}
