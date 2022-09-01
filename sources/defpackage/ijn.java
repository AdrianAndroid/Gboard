package defpackage;

import android.view.inputmethod.EditorInfo;
import com.google.android.libraries.inputmethod.ondevicemetricaggregation.OnDeviceMetricAggregationProcessor;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: ijn  reason: default package */
/* loaded from: classes.dex */
public final class ijn extends idb {
    public static final ido[] a = {hry.INPUT_METHOD_ENTRY_CHANGED, hsp.IMS_INPUT_VIEW_FINISHED, hsp.IMS_ON_START_INPUT_VIEW, hxx.MAIN_LANGUAGE_MODELS_IME_ONACTIVATE, hxx.RUNTIME_PARAMETERS_IME_ONACTIVATE, idd.BEGIN_SESSION, idd.END_SESSION, ifg.COLD_STARTUP_TRACE_TIMESTAMP, iwc.CLEARCUT_LOG_EVENT};
    private static final ltg f = ltg.j("com/google/android/libraries/inputmethod/ondevicemetricaggregation/OnDeviceMetricAggregationProcessorHelper");
    private final OnDeviceMetricAggregationProcessor g;

    public ijn(OnDeviceMetricAggregationProcessor onDeviceMetricAggregationProcessor) {
        this.g = onDeviceMetricAggregationProcessor;
    }

    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        mbw mbwVar;
        if (hry.INPUT_METHOD_ENTRY_CHANGED == idoVar) {
            Object obj = objArr[3];
            if (obj == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/ondevicemetricaggregation/OnDeviceMetricAggregationProcessorHelper", "doProcessMetrics", 37, "OnDeviceMetricAggregationProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            }
            OnDeviceMetricAggregationProcessor onDeviceMetricAggregationProcessor = this.g;
            hqt hqtVar = (hqt) objArr[0];
            ((Boolean) obj).booleanValue();
            onDeviceMetricAggregationProcessor.f = (Collection) objArr[2];
            onDeviceMetricAggregationProcessor.e = (hqt) objArr[1];
        } else if (hsp.IMS_INPUT_VIEW_FINISHED == idoVar) {
            nfh nfhVar = this.g.h;
            nfhVar.b = (nfm) nfhVar.b.N(4);
        } else if (hsp.IMS_ON_START_INPUT_VIEW == idoVar) {
            Object obj2 = objArr[1];
            if (obj2 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/ondevicemetricaggregation/OnDeviceMetricAggregationProcessorHelper", "doProcessMetrics", 47, "OnDeviceMetricAggregationProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            } else if (objArr[2] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/ondevicemetricaggregation/OnDeviceMetricAggregationProcessorHelper", "doProcessMetrics", 51, "OnDeviceMetricAggregationProcessorHelper.java")).t("the 2th argument is null!");
                return false;
            } else if (objArr[3] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/ondevicemetricaggregation/OnDeviceMetricAggregationProcessorHelper", "doProcessMetrics", 55, "OnDeviceMetricAggregationProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            } else if (objArr[5] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/ondevicemetricaggregation/OnDeviceMetricAggregationProcessorHelper", "doProcessMetrics", 59, "OnDeviceMetricAggregationProcessorHelper.java")).t("the 5th argument is null!");
                return false;
            } else {
                OnDeviceMetricAggregationProcessor onDeviceMetricAggregationProcessor2 = this.g;
                EditorInfo editorInfo = (EditorInfo) objArr[0];
                ((Number) obj2).intValue();
                ((Boolean) objArr[2]).booleanValue();
                ((Boolean) objArr[3]).booleanValue();
                iau iauVar = (iau) objArr[4];
                ((Boolean) objArr[5]).booleanValue();
                mvi b = hxy.b();
                if (b != null) {
                    onDeviceMetricAggregationProcessor2.b(b, false);
                }
            }
        } else if (hxx.MAIN_LANGUAGE_MODELS_IME_ONACTIVATE == idoVar) {
            OnDeviceMetricAggregationProcessor onDeviceMetricAggregationProcessor3 = this.g;
            List<mvm> list = (List) objArr[0];
            nfh nfhVar2 = onDeviceMetricAggregationProcessor3.g;
            if (nfhVar2.c) {
                nfhVar2.cD();
                nfhVar2.c = false;
            }
            mww mwwVar = (mww) nfhVar2.b;
            mww mwwVar2 = mww.g;
            mwwVar.d = null;
            mwwVar.a &= -5;
            if (list.size() > 1) {
                nfh t = mfb.d.t();
                for (mvm mvmVar : list) {
                    t.m67do(mvmVar.g + "_" + mvmVar.h);
                }
                nfh nfhVar3 = onDeviceMetricAggregationProcessor3.g;
                mfb mfbVar = (mfb) t.cz();
                if (nfhVar3.c) {
                    nfhVar3.cD();
                    nfhVar3.c = false;
                }
                mww mwwVar3 = (mww) nfhVar3.b;
                mfbVar.getClass();
                mwwVar3.d = mfbVar;
                mwwVar3.a |= 4;
            }
        } else if (hxx.RUNTIME_PARAMETERS_IME_ONACTIVATE == idoVar) {
            OnDeviceMetricAggregationProcessor onDeviceMetricAggregationProcessor4 = this.g;
            mvi mviVar = (mvi) objArr[0];
            if (mviVar != null) {
                onDeviceMetricAggregationProcessor4.b(mviVar, true);
            }
        } else if (idd.BEGIN_SESSION == idoVar) {
            Object obj3 = objArr[1];
            if (obj3 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/ondevicemetricaggregation/OnDeviceMetricAggregationProcessorHelper", "doProcessMetrics", 72, "OnDeviceMetricAggregationProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            }
            OnDeviceMetricAggregationProcessor onDeviceMetricAggregationProcessor5 = this.g;
            idq idqVar = (idq) objArr[0];
            long longValue = ((Number) obj3).longValue();
            if (idqVar == ide.c) {
                onDeviceMetricAggregationProcessor5.c = longValue;
                onDeviceMetricAggregationProcessor5.d = onDeviceMetricAggregationProcessor5.i.c;
                nfh nfhVar4 = onDeviceMetricAggregationProcessor5.j;
                nfhVar4.b = (nfm) nfhVar4.b.N(4);
            }
        } else if (idd.END_SESSION == idoVar) {
            Object obj4 = objArr[1];
            if (obj4 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/ondevicemetricaggregation/OnDeviceMetricAggregationProcessorHelper", "doProcessMetrics", 79, "OnDeviceMetricAggregationProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            }
            OnDeviceMetricAggregationProcessor onDeviceMetricAggregationProcessor6 = this.g;
            idq idqVar2 = (idq) objArr[0];
            long longValue2 = ((Number) obj4).longValue();
            if (idqVar2 == ide.c && longValue2 == onDeviceMetricAggregationProcessor6.a()) {
                mve mveVar = (mve) onDeviceMetricAggregationProcessor6.j.cz();
                try {
                    nfh nfhVar5 = onDeviceMetricAggregationProcessor6.g;
                    hqt hqtVar2 = onDeviceMetricAggregationProcessor6.e;
                    Collection collection = onDeviceMetricAggregationProcessor6.f;
                    nfh t2 = mbw.k.t();
                    if (hqtVar2 == null) {
                        mbwVar = (mbw) t2.cz();
                    } else {
                        iav g = hqtVar2.g();
                        if (g == null || !g.e.n.equals("my") || g.A) {
                            String str = hqtVar2.i().n;
                            if (t2.c) {
                                t2.cD();
                                t2.c = false;
                            }
                            mbw mbwVar2 = (mbw) t2.b;
                            str.getClass();
                            mbwVar2.a |= 1;
                            mbwVar2.b = str;
                        } else {
                            if (t2.c) {
                                t2.cD();
                                t2.c = false;
                            }
                            mbw mbwVar3 = (mbw) t2.b;
                            mbwVar3.a |= 1;
                            mbwVar3.b = "my-Qaag";
                        }
                        if (collection != null) {
                            int size = collection.size();
                            Iterator it = collection.iterator();
                            for (int i = 0; i < size; i++) {
                                t2.di(((jav) it.next()).n);
                            }
                        }
                        mbwVar = (mbw) t2.cz();
                    }
                    if (nfhVar5.c) {
                        nfhVar5.cD();
                        nfhVar5.c = false;
                    }
                    mww mwwVar4 = (mww) nfhVar5.b;
                    mww mwwVar5 = mww.g;
                    mbwVar.getClass();
                    mwwVar4.c = mbwVar;
                    mwwVar4.a |= 2;
                    nfh t3 = mwx.e.t();
                    if (t3.c) {
                        t3.cD();
                        t3.c = false;
                    }
                    mwx mwxVar = (mwx) t3.b;
                    mveVar.getClass();
                    mwxVar.b = mveVar;
                    int i2 = mwxVar.a | 1;
                    mwxVar.a = i2;
                    long j = onDeviceMetricAggregationProcessor6.d;
                    mwxVar.a = i2 | 2;
                    mwxVar.c = j;
                    mww mwwVar6 = (mww) onDeviceMetricAggregationProcessor6.g.cz();
                    if (t3.c) {
                        t3.cD();
                        t3.c = false;
                    }
                    mwx mwxVar2 = (mwx) t3.b;
                    mwwVar6.getClass();
                    mwxVar2.d = mwwVar6;
                    mwxVar2.a |= 4;
                    mwy mwyVar = (mwy) nfm.z(mwy.c, OnDeviceMetricAggregationProcessor.getAggregatedMetrics(((mwx) t3.cz()).q()), nfb.b());
                    int u = jco.u(mwyVar.a);
                    if (u != 0 && u == 2) {
                        mux muxVar = (mux) mveVar.e.get(mveVar.e.size() - 1);
                        long j2 = muxVar.d;
                        long j3 = muxVar.e;
                        nfh t4 = mbh.aT.t();
                        lzz lzzVar = mwyVar.b;
                        if (lzzVar == null) {
                            lzzVar = lzz.a;
                        }
                        if (t4.c) {
                            t4.cD();
                            t4.c = false;
                        }
                        mbh mbhVar = (mbh) t4.b;
                        lzzVar.getClass();
                        mbhVar.aO = lzzVar;
                        mbhVar.d |= 33554432;
                        if ((mbhVar.a & 536870912) == 0) {
                            mde mdeVar = ieo.a().a;
                            if (t4.c) {
                                t4.cD();
                                t4.c = false;
                            }
                            mbh mbhVar2 = (mbh) t4.b;
                            mdeVar.getClass();
                            mbhVar2.A = mdeVar;
                            mbhVar2.a |= 536870912;
                        }
                        onDeviceMetricAggregationProcessor6.b.f((mbh) t4.cz(), 295, j2, j3);
                    }
                } catch (ngd e) {
                    ((ltd) ((ltd) ((ltd) OnDeviceMetricAggregationProcessor.a.c()).i(e)).k("com/google/android/libraries/inputmethod/ondevicemetricaggregation/OnDeviceMetricAggregationProcessor", "logOnDeviceAggregatedMetrics", (char) 225, "OnDeviceMetricAggregationProcessor.java")).t("Failed to perform get aggregated metrics.");
                }
                onDeviceMetricAggregationProcessor6.d = onDeviceMetricAggregationProcessor6.i.c;
                nfh nfhVar6 = onDeviceMetricAggregationProcessor6.j;
                nfhVar6.b = (nfm) nfhVar6.b.N(4);
            }
        } else if (ifg.COLD_STARTUP_TRACE_TIMESTAMP == idoVar) {
            Object obj5 = objArr[0];
            if (obj5 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/ondevicemetricaggregation/OnDeviceMetricAggregationProcessorHelper", "doProcessMetrics", 86, "OnDeviceMetricAggregationProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            OnDeviceMetricAggregationProcessor onDeviceMetricAggregationProcessor7 = this.g;
            long longValue3 = ((Number) obj5).longValue();
            nfh nfhVar7 = onDeviceMetricAggregationProcessor7.g;
            if (nfhVar7.c) {
                nfhVar7.cD();
                nfhVar7.c = false;
            }
            mww mwwVar7 = (mww) nfhVar7.b;
            mww mwwVar8 = mww.g;
            mwwVar7.a |= 8;
            mwwVar7.e = longValue3;
        } else if (iwc.CLEARCUT_LOG_EVENT == idoVar) {
            OnDeviceMetricAggregationProcessor onDeviceMetricAggregationProcessor8 = this.g;
            mux muxVar2 = (mux) objArr[0];
            if (onDeviceMetricAggregationProcessor8.c == onDeviceMetricAggregationProcessor8.a()) {
                onDeviceMetricAggregationProcessor8.j.dS(muxVar2);
            }
        } else {
            ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/ondevicemetricaggregation/OnDeviceMetricAggregationProcessorHelper", "doProcessMetrics", 95, "OnDeviceMetricAggregationProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
            return false;
        }
        return true;
    }
}
