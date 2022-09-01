package defpackage;

/* compiled from: PG */
/* renamed from: itg  reason: default package */
/* loaded from: classes.dex */
public final class itg extends idb {
    public static final ido[] a = {hfe.EVENT_HANDLED};
    private static final ltg f = ltg.j("com/google/android/libraries/inputmethod/touchonnavigation/TouchOnNavigationMetricsProcessorHelper");
    private final itf g;

    public itg(itf itfVar) {
        this.g = itfVar;
    }

    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        iay[] iayVarArr;
        iay iayVar;
        int i = 0;
        if (hfe.EVENT_HANDLED == idoVar) {
            itf itfVar = this.g;
            hfd hfdVar = (hfd) objArr[0];
            if (hfdVar != null && (iayVarArr = hfdVar.b) != null && iayVarArr.length != 0 && (iayVar = iayVarArr[0]) != null) {
                int i2 = iayVar.c;
                float f2 = -1.0f;
                if (i2 == -10044) {
                    mrm mrmVar = (mrm) iayVar.e;
                    itfVar.b = mrmVar != null ? mrmVar.e : -1.0f;
                    if (mrmVar != null) {
                        f2 = mrmVar.n;
                    }
                    itfVar.c = f2;
                } else if (i2 == 62) {
                    float f3 = itfVar.b;
                    if (f3 != -1.0f) {
                        float f4 = hfdVar.m;
                        if (f3 < f4) {
                            i = f3 + itfVar.c >= f4 ? 2 : 1;
                        }
                        itfVar.a.d("Input.Space.Count", i);
                    }
                }
            }
            return true;
        }
        ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/touchonnavigation/TouchOnNavigationMetricsProcessorHelper", "doProcessMetrics", 30, "TouchOnNavigationMetricsProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
        return false;
    }
}
