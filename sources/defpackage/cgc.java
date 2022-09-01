package defpackage;

/* compiled from: PG */
/* renamed from: cgc  reason: default package */
/* loaded from: classes.dex */
public final class cgc extends idb {
    public static final ido[] a = {cgd.PINNED_ACTION_CLICKED, cgd.PINNED_ACTION_DISPLAYED, cgd.SUGGESTION_CLICKED, cgd.SUGGESTION_DISPLAYED, cgd.SUGGESTION_LONG_PRESSED};
    private static final ltg f = ltg.j("com/google/android/apps/inputmethod/libs/deviceintelligence/impl/DeviceIntelligenceMetricsProcessorHelper");
    private final cgb g;

    public cgc(cgb cgbVar) {
        this.g = cgbVar;
    }

    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        if (cgd.PINNED_ACTION_CLICKED == idoVar) {
            cgb cgbVar = this.g;
            cgbVar.a((String) objArr[0]);
            cgbVar.c(cgbVar.a, 245);
        } else if (cgd.PINNED_ACTION_DISPLAYED == idoVar) {
            cgb cgbVar2 = this.g;
            cgbVar2.a((String) objArr[0]);
            cgbVar2.c(cgbVar2.a, 244);
        } else if (cgd.SUGGESTION_CLICKED == idoVar) {
            this.g.b(243, (String) objArr[0], (String) objArr[1], (String) objArr[2]);
        } else if (cgd.SUGGESTION_DISPLAYED == idoVar) {
            this.g.b(242, (String) objArr[0], (String) objArr[1], (String) objArr[2]);
        } else if (cgd.SUGGESTION_LONG_PRESSED == idoVar) {
            this.g.b(274, (String) objArr[0], (String) objArr[1], (String) objArr[2]);
        } else {
            ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/deviceintelligence/impl/DeviceIntelligenceMetricsProcessorHelper", "doProcessMetrics", 41, "DeviceIntelligenceMetricsProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
            return false;
        }
        return true;
    }
}
