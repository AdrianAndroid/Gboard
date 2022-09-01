package defpackage;

import com.google.android.libraries.inputmethod.userfeaturecache.metrics.InputActionsUserFeatureProcessor;
import java.util.List;

/* compiled from: PG */
/* renamed from: jae  reason: default package */
/* loaded from: classes.dex */
public final class jae extends idb {
    public static final ido[] a = {idd.BEGIN_SESSION, idd.END_SESSION, iwc.INPUT_ACTION, iwc.KEYBOARD_LAYOUT};
    private static final ltg f = ltg.j("com/google/android/libraries/inputmethod/userfeaturecache/metrics/InputActionsUserFeatureProcessorHelper");
    private final InputActionsUserFeatureProcessor g;

    public jae(InputActionsUserFeatureProcessor inputActionsUserFeatureProcessor) {
        this.g = inputActionsUserFeatureProcessor;
    }

    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        if (idd.BEGIN_SESSION == idoVar) {
            Object obj = objArr[1];
            if (obj == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/userfeaturecache/metrics/InputActionsUserFeatureProcessorHelper", "doProcessMetrics", 31, "InputActionsUserFeatureProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            }
            InputActionsUserFeatureProcessor inputActionsUserFeatureProcessor = this.g;
            idq idqVar = (idq) objArr[0];
            long longValue = ((Number) obj).longValue();
            if (idqVar == iwd.a) {
                if ((((mra) inputActionsUserFeatureProcessor.b.b).a & 1) != 0) {
                    ((ltd) ((ltd) InputActionsUserFeatureProcessor.a.d()).k("com/google/android/libraries/inputmethod/userfeaturecache/metrics/InputActionsUserFeatureProcessor", "processBeginSession", 215, "InputActionsUserFeatureProcessor.java")).t("Last session not ended.");
                }
                nfh nfhVar = inputActionsUserFeatureProcessor.b;
                nfhVar.b = (nfm) nfhVar.b.N(4);
                nfh nfhVar2 = inputActionsUserFeatureProcessor.b;
                if (nfhVar2.c) {
                    nfhVar2.cD();
                    nfhVar2.c = false;
                }
                mra mraVar = (mra) nfhVar2.b;
                mraVar.a |= 1;
                mraVar.b = longValue;
            }
        } else if (idd.END_SESSION == idoVar) {
            Object obj2 = objArr[1];
            if (obj2 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/userfeaturecache/metrics/InputActionsUserFeatureProcessorHelper", "doProcessMetrics", 38, "InputActionsUserFeatureProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            }
            InputActionsUserFeatureProcessor inputActionsUserFeatureProcessor2 = this.g;
            idq idqVar2 = (idq) objArr[0];
            long longValue2 = ((Number) obj2).longValue();
            if (idqVar2 == iwd.a) {
                nfh nfhVar3 = inputActionsUserFeatureProcessor2.b;
                mra mraVar2 = (mra) nfhVar3.b;
                if ((mraVar2.a & 1) == 0 || longValue2 != mraVar2.b) {
                    ((ltd) ((ltd) InputActionsUserFeatureProcessor.a.d()).k("com/google/android/libraries/inputmethod/userfeaturecache/metrics/InputActionsUserFeatureProcessor", "processEndSession", 228, "InputActionsUserFeatureProcessor.java")).t("Invalid session id, ignore this session.");
                    nfh nfhVar4 = inputActionsUserFeatureProcessor2.b;
                    nfhVar4.b = (nfm) nfhVar4.b.N(4);
                } else {
                    mra mraVar3 = (mra) nfhVar3.cz();
                    byte[] q = mraVar3.q();
                    int length = q.length;
                    mraVar3.c.size();
                    if (inputActionsUserFeatureProcessor2.c != null) {
                        InputActionsUserFeatureProcessor.nativeProcessRequest(q);
                    } else {
                        ((ltd) ((ltd) InputActionsUserFeatureProcessor.a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/metrics/InputActionsUserFeatureProcessor", "processEndSession", 240, "InputActionsUserFeatureProcessor.java")).t("can't find nativeDelegate.");
                    }
                    nfh nfhVar5 = inputActionsUserFeatureProcessor2.b;
                    nfhVar5.b = (nfm) nfhVar5.b.N(4);
                }
            }
        } else if (iwc.INPUT_ACTION == idoVar) {
            InputActionsUserFeatureProcessor inputActionsUserFeatureProcessor3 = this.g;
            List<muz> list = (List) objArr[0];
            if ((((mra) inputActionsUserFeatureProcessor3.b.b).a & 1) == 0) {
                ((ltd) ((ltd) InputActionsUserFeatureProcessor.a.d()).k("com/google/android/libraries/inputmethod/userfeaturecache/metrics/InputActionsUserFeatureProcessor", "processInputActions", 199, "InputActionsUserFeatureProcessor.java")).t("Session not started, ignore the input actions.");
            } else {
                for (muz muzVar : list) {
                    nfh nfhVar6 = inputActionsUserFeatureProcessor3.b;
                    nem nemVar = muzVar.a;
                    if (nfhVar6.c) {
                        nfhVar6.cD();
                        nfhVar6.c = false;
                    }
                    mra mraVar4 = (mra) nfhVar6.b;
                    nemVar.getClass();
                    mraVar4.b();
                    mraVar4.c.add(nemVar);
                }
            }
        } else if (iwc.KEYBOARD_LAYOUT == idoVar) {
            InputActionsUserFeatureProcessor.nativeUpdateKeyboardLayout(((mrm) objArr[0]).q());
        } else {
            ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/userfeaturecache/metrics/InputActionsUserFeatureProcessorHelper", "doProcessMetrics", 50, "InputActionsUserFeatureProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
            return false;
        }
        return true;
    }
}
