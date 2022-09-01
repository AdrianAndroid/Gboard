package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* renamed from: hsf  reason: default package */
/* loaded from: classes.dex */
public final class hsf extends idb {
    public static final ido[] a = {hry.INPUT_METHOD_ENTRY_CHANGED};
    private static final ltg f = ltg.j("com/google/android/libraries/inputmethod/inputmethodentry/metricsprocessor/InputMethodEntryMetricsProcessorHelper");
    private final hse g;

    public hsf(hse hseVar) {
        this.g = hseVar;
    }

    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        if (hry.INPUT_METHOD_ENTRY_CHANGED == idoVar) {
            Object obj = objArr[3];
            if (obj == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/inputmethodentry/metricsprocessor/InputMethodEntryMetricsProcessorHelper", "doProcessMetrics", 30, "InputMethodEntryMetricsProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            }
            hse hseVar = this.g;
            hqt hqtVar = (hqt) objArr[0];
            hqt hqtVar2 = (hqt) objArr[1];
            Collection collection = (Collection) objArr[2];
            boolean booleanValue = ((Boolean) obj).booleanValue();
            mde mdeVar = ieo.a().b;
            nfh nfhVar = (nfh) mdeVar.N(5);
            nfhVar.cG(mdeVar);
            if (hqtVar2 == null) {
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                mde mdeVar2 = (mde) nfhVar.b;
                mde mdeVar3 = mde.i;
                mdeVar2.a |= 4;
                mdeVar2.d = "";
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                mde mdeVar4 = (mde) nfhVar.b;
                int i = mdeVar4.a | 8;
                mdeVar4.a = i;
                mdeVar4.e = "";
                mdeVar4.a = i | 64;
                mdeVar4.h = false;
            } else {
                String str = hqtVar2.i().n;
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                mde mdeVar5 = (mde) nfhVar.b;
                mde mdeVar6 = mde.i;
                str.getClass();
                mdeVar5.a |= 4;
                mdeVar5.d = str;
                boolean z = collection != null && !collection.isEmpty();
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                mde mdeVar7 = (mde) nfhVar.b;
                mdeVar7.a |= 64;
                mdeVar7.h = z;
                String p = hqtVar2.p();
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                mde mdeVar8 = (mde) nfhVar.b;
                mdeVar8.a |= 8;
                mdeVar8.e = p;
            }
            hseVar.a.g(((mde) nfhVar.cz()).q());
            if (booleanValue) {
                hseVar.a.c("InputMethodEntryChange.Temporary");
            }
            return true;
        }
        ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/inputmethodentry/metricsprocessor/InputMethodEntryMetricsProcessorHelper", "doProcessMetrics", 36, "InputMethodEntryMetricsProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
        return false;
    }
}
