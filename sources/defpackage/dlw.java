package defpackage;

import android.view.inputmethod.EditorInfo;
import java.util.List;

/* compiled from: PG */
/* renamed from: dlw  reason: default package */
/* loaded from: classes.dex */
public final class dlw extends idb {
    public static final ido[] a = {dmb.a, hpb.IME_ACTIVATED, idd.BEGIN_SESSION, idd.END_SESSION, iwc.INPUT_ACTION};
    private static final ltg f = ltg.j("com/google/android/apps/inputmethod/libs/keyhound/InputActionMetricsProcessorHelper");
    private final dlv g;

    public dlw(dlv dlvVar) {
        this.g = dlvVar;
    }

    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        if (dmb.a == idoVar) {
            dlv dlvVar = this.g;
            hpl hplVar = (hpl) objArr[2];
            byte[] q = ((mpy) dlvVar.f.cz()).q();
            nfh nfhVar = dlvVar.f;
            nfhVar.b = (nfm) nfhVar.b.N(4);
            kcu.U(mio.g(kcu.O(new dlu(dlvVar, q, (String) objArr[0], 0), dlvVar.c), new cjq(hplVar, (String) objArr[1], 7), gyc.b), new cbx(5), mjl.a);
        } else if (hpb.IME_ACTIVATED == idoVar) {
            dlv dlvVar2 = this.g;
            EditorInfo editorInfo = (EditorInfo) objArr[0];
            dlvVar2.e = true;
            if (!dmc.a(dlvVar2.b, editorInfo) || editorInfo.privateImeOptions == null || !editorInfo.privateImeOptions.endsWith("GET_INPUT_ACTION")) {
                dlvVar2.d = false;
                nfh nfhVar2 = dlvVar2.g;
                if (nfhVar2.c) {
                    nfhVar2.cD();
                    nfhVar2.c = false;
                }
                mpx mpxVar = mpx.e;
                ((mpx) nfhVar2.b).d = mpx.G();
            } else {
                String str = editorInfo.packageName;
                dlvVar2.d = true;
            }
        } else if (idd.BEGIN_SESSION == idoVar) {
            Object obj = objArr[1];
            if (obj == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/keyhound/InputActionMetricsProcessorHelper", "doProcessMetrics", 38, "InputActionMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            }
            dlv dlvVar3 = this.g;
            idq idqVar = (idq) objArr[0];
            ((Number) obj).longValue();
            if (idqVar == iwd.a) {
                nfh nfhVar3 = dlvVar3.g;
                long j = dlvVar3.h.c;
                if (nfhVar3.c) {
                    nfhVar3.cD();
                    nfhVar3.c = false;
                }
                mpx mpxVar2 = (mpx) nfhVar3.b;
                mpx mpxVar3 = mpx.e;
                mpxVar2.a |= 2;
                mpxVar2.c = j;
                nfh nfhVar4 = dlvVar3.g;
                long a2 = dlvVar3.a();
                if (nfhVar4.c) {
                    nfhVar4.cD();
                    nfhVar4.c = false;
                }
                mpx mpxVar4 = (mpx) nfhVar4.b;
                mpxVar4.a |= 1;
                mpxVar4.b = a2;
                dlvVar3.d = true;
                dlvVar3.e = false;
            }
        } else if (idd.END_SESSION == idoVar) {
            Object obj2 = objArr[1];
            if (obj2 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/keyhound/InputActionMetricsProcessorHelper", "doProcessMetrics", 45, "InputActionMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            }
            dlv dlvVar4 = this.g;
            idq idqVar2 = (idq) objArr[0];
            long longValue = ((Number) obj2).longValue();
            if (idqVar2 == iwd.a) {
                if (dlvVar4.e && dlvVar4.d) {
                    nfh nfhVar5 = dlvVar4.g;
                    if (((mpx) nfhVar5.b).b == longValue) {
                        nfh nfhVar6 = dlvVar4.f;
                        mpx mpxVar5 = (mpx) nfhVar5.cz();
                        if (nfhVar6.c) {
                            nfhVar6.cD();
                            nfhVar6.c = false;
                        }
                        mpy mpyVar = (mpy) nfhVar6.b;
                        mpy mpyVar2 = mpy.b;
                        mpxVar5.getClass();
                        nga ngaVar = mpyVar.a;
                        if (!ngaVar.c()) {
                            mpyVar.a = nfm.H(ngaVar);
                        }
                        mpyVar.a.add(mpxVar5);
                    }
                }
                dlvVar4.d = false;
                dlvVar4.e = false;
                nfh nfhVar7 = dlvVar4.g;
                nfhVar7.b = (nfm) nfhVar7.b.N(4);
            }
        } else if (iwc.INPUT_ACTION == idoVar) {
            dlv dlvVar5 = this.g;
            List<muz> list = (List) objArr[0];
            if (dlvVar5.d && dlvVar5.a() == ((mpx) dlvVar5.g.b).b) {
                list.size();
                for (muz muzVar : list) {
                    nfh nfhVar8 = dlvVar5.g;
                    nem nemVar = muzVar.a;
                    if (nfhVar8.c) {
                        nfhVar8.cD();
                        nfhVar8.c = false;
                    }
                    mpx mpxVar6 = (mpx) nfhVar8.b;
                    nemVar.getClass();
                    nga ngaVar2 = mpxVar6.d;
                    if (!ngaVar2.c()) {
                        mpxVar6.d = nfm.H(ngaVar2);
                    }
                    mpxVar6.d.add(nemVar);
                }
            }
        } else {
            ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/keyhound/InputActionMetricsProcessorHelper", "doProcessMetrics", 54, "InputActionMetricsProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
            return false;
        }
        return true;
    }
}
