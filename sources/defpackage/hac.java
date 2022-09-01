package defpackage;

import android.text.TextUtils;
import java.util.Deque;

/* compiled from: PG */
/* renamed from: hac  reason: default package */
/* loaded from: classes.dex */
public final class hac extends idb {
    public static final ido[] a = {gzz.LOG_FOR_DUMP, gzz.LOG_FOR_DUMP_ABANDON_DUPLICATE_LOGS, gzz.LOG_FOR_DUMP_ARG1, gzz.LOG_FOR_DUMP_ARG2, gzz.LOG_FOR_DUMP_ARGS};
    private static final ltg f = ltg.j("com/google/android/libraries/inputmethod/dumplogger/metricsprocessor/DumpableMetricsProcessorHelper");
    private final hab g;

    public hac(hab habVar) {
        this.g = habVar;
    }

    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        if (gzz.LOG_FOR_DUMP == idoVar) {
            Object obj = objArr[0];
            if (obj == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/dumplogger/metricsprocessor/DumpableMetricsProcessorHelper", "doProcessMetrics", 27, "DumpableMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            hab habVar = this.g;
            int intValue = ((Number) obj).intValue();
            String str = (String) objArr[1];
            String str2 = (String) objArr[2];
            synchronized (habVar) {
                habVar.b(intValue, str, str2);
            }
        } else if (gzz.LOG_FOR_DUMP_ABANDON_DUPLICATE_LOGS == idoVar) {
            Object obj2 = objArr[0];
            if (obj2 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/dumplogger/metricsprocessor/DumpableMetricsProcessorHelper", "doProcessMetrics", 34, "DumpableMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            hab habVar2 = this.g;
            int intValue2 = ((Number) obj2).intValue();
            String str3 = (String) objArr[1];
            String str4 = (String) objArr[2];
            synchronized (habVar2) {
                Deque a2 = habVar2.a(str3);
                haa haaVar = (haa) a2.peekLast();
                if (haaVar != null) {
                    long j = intValue2;
                    if (haaVar.b == j && TextUtils.equals(haaVar.c, str4)) {
                        a2.removeLast();
                        a2.add(haa.a(habVar2.a.c, j, str4, haaVar.d + 1));
                    }
                }
                habVar2.b(intValue2, str3, str4);
            }
        } else if (gzz.LOG_FOR_DUMP_ARG1 == idoVar) {
            Object obj3 = objArr[0];
            if (obj3 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/dumplogger/metricsprocessor/DumpableMetricsProcessorHelper", "doProcessMetrics", 41, "DumpableMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            hab habVar3 = this.g;
            int intValue3 = ((Number) obj3).intValue();
            String str5 = (String) objArr[1];
            String format = String.format((String) objArr[2], objArr[3]);
            synchronized (habVar3) {
                habVar3.b(intValue3, str5, format);
            }
        } else if (gzz.LOG_FOR_DUMP_ARG2 == idoVar) {
            Object obj4 = objArr[0];
            if (obj4 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/dumplogger/metricsprocessor/DumpableMetricsProcessorHelper", "doProcessMetrics", 48, "DumpableMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            hab habVar4 = this.g;
            int intValue4 = ((Number) obj4).intValue();
            String str6 = (String) objArr[1];
            String format2 = String.format((String) objArr[2], objArr[3], objArr[4]);
            synchronized (habVar4) {
                habVar4.b(intValue4, str6, format2);
            }
        } else if (gzz.LOG_FOR_DUMP_ARGS == idoVar) {
            Object obj5 = objArr[0];
            if (obj5 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/dumplogger/metricsprocessor/DumpableMetricsProcessorHelper", "doProcessMetrics", 55, "DumpableMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            hab habVar5 = this.g;
            int intValue5 = ((Number) obj5).intValue();
            String str7 = (String) objArr[1];
            Object obj6 = objArr[3];
            Object obj7 = objArr[4];
            Object[] objArr2 = (Object[]) objArr[5];
            int length = objArr2.length;
            Object[] objArr3 = new Object[length + 2];
            objArr3[0] = obj6;
            objArr3[1] = obj7;
            System.arraycopy(objArr2, 0, objArr3, 2, length);
            String format3 = String.format((String) objArr[2], objArr3);
            synchronized (habVar5) {
                habVar5.b(intValue5, str7, format3);
            }
        } else {
            ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/dumplogger/metricsprocessor/DumpableMetricsProcessorHelper", "doProcessMetrics", 61, "DumpableMetricsProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
            return false;
        }
        return true;
    }
}
