package defpackage;

/* compiled from: PG */
/* renamed from: ccw  reason: default package */
/* loaded from: classes.dex */
public final class ccw extends idb {
    public static final ido[] a = {cap.INPUT_CONTEXT_REVERT_AUTO_CORRECT, cap.INPUT_CONTEXT_WORD_AUTO_CORRECTION};
    private static final ltg f = ltg.j("com/google/android/apps/inputmethod/libs/delight5/dlam/DlamMetricsProcessorHelper");
    private final dxn g;

    public ccw(dxn dxnVar, byte[] bArr) {
        this.g = dxnVar;
    }

    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        if (cap.INPUT_CONTEXT_REVERT_AUTO_CORRECT == idoVar) {
            ccx ccxVar = (ccx) this.g.b;
            if (ccxVar.d.get()) {
                ccxVar.c.h.incrementAndGet();
                return true;
            }
            ccxVar.f.incrementAndGet();
            return true;
        } else if (cap.INPUT_CONTEXT_WORD_AUTO_CORRECTION == idoVar) {
            ccx ccxVar2 = (ccx) this.g.b;
            if (ccxVar2.d.get()) {
                ccxVar2.c.g.incrementAndGet();
                return true;
            }
            ccxVar2.e.incrementAndGet();
            return true;
        } else {
            ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/delight5/dlam/DlamMetricsProcessorHelper", "doProcessMetrics", 32, "DlamMetricsProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
            return false;
        }
    }
}
