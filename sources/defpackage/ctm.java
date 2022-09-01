package defpackage;

/* compiled from: PG */
/* renamed from: ctm  reason: default package */
/* loaded from: classes.dex */
public final class ctm implements idm {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessor");
    public final idi b;
    private final idb c = new ctn(this);

    public ctm(idi idiVar) {
        this.b = idiVar;
    }

    public final void a(boolean z) {
        ido idoVar = this.c.b;
        if (idoVar != null) {
            String str = (String) ctl.a.get(idoVar);
            if (str != null) {
                this.b.b(str, z);
            } else {
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessor", "processBoolHistogramMetrics", 235, "ExpressionSimpleCountersMetricsProcessor.java")).w("Failed to find counter name for metrics type: %s.", idoVar);
            }
        }
    }

    public final void b(ctc ctcVar) {
        ido idoVar = this.c.b;
        if (idoVar != null) {
            String str = (String) ctl.b.get(idoVar);
            if (str != null) {
                this.b.d(str, ctcVar.a());
            } else {
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessor", "processExpressionIntegerHistogramMetrics", 306, "ExpressionSimpleCountersMetricsProcessor.java")).w("Failed to find counter name for metrics type: %s.", idoVar);
            }
        }
    }

    public final void c(int i) {
        ido idoVar = this.c.b;
        if (idoVar != null) {
            String str = (String) ctl.b.get(idoVar);
            if (str != null) {
                this.b.d(str, i);
            } else {
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessor", "processIntegerHistogramMetrics", 282, "ExpressionSimpleCountersMetricsProcessor.java")).w("Failed to find counter name for metrics type: %s.", idoVar);
            }
        }
    }

    @Override // defpackage.idj
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.idj
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        this.c.b(idoVar, iduVar, j, j2, objArr);
    }

    @Override // defpackage.idm
    public final /* synthetic */ void r(idl idlVar) {
    }

    @Override // defpackage.idj
    public final /* synthetic */ boolean s() {
        return true;
    }

    @Override // defpackage.idm
    public final ido[] t() {
        return ctn.a;
    }
}
