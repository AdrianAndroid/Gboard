package com.google.android.libraries.inputmethod.trainingcache.localcomputation;

import com.google.android.gms.common.api.Status;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LocalComputationResultHandlingService extends fwp {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/trainingcache/localcomputation/LocalComputationResultHandlingService");
    public final idk b = ieh.j();

    @Override // defpackage.fwp
    public final void a(fwm fwmVar, boolean z, fxa fxaVar) {
        iwc iwcVar;
        ivu ivuVar;
        String str = fwmVar.b;
        if (fwmVar.c().length == 0) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/trainingcache/localcomputation/LocalComputationResultHandlingService", "handleResult", 52, "LocalComputationResultHandlingService.java")).w("Task config not set in the context data for %s.", fwmVar.b);
            fxaVar.b(Status.c);
            return;
        }
        try {
            mxc mxcVar = (mxc) nfm.z(mxc.h, fwmVar.c(), nfb.b());
            idk idkVar = this.b;
            if (z) {
                iwcVar = iwc.LC_TASK_SUCCESS;
            } else {
                iwcVar = iwc.LC_TASK_FAILURE;
            }
            idkVar.e(iwcVar, mxcVar.b);
            String str2 = mxcVar.e;
            Iterator it = igr.d(getApplicationContext()).e(ivv.class).iterator();
            loop0: while (true) {
                ivv ivvVar = null;
                if (!it.hasNext()) {
                    ivuVar = null;
                    break;
                }
                ifw b = igr.d(getApplicationContext()).b((Class) it.next());
                if (b instanceof ivv) {
                    ivvVar = (ivv) b;
                }
                if (ivvVar != null) {
                    llp c = ivvVar.c();
                    int i = ((lrl) c).c;
                    int i2 = 0;
                    while (i2 < i) {
                        ivuVar = (ivu) c.get(i2);
                        i2++;
                        if (ivuVar.a().equals(str2)) {
                            break loop0;
                        }
                    }
                    continue;
                }
            }
            if (ivuVar == null) {
                ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/trainingcache/localcomputation/LocalComputationResultHandlingService", "handleResult", 79, "LocalComputationResultHandlingService.java")).G("Target result handler with id %s not found for session name %s", mxcVar.e, fwmVar.b);
                this.b.e(iwc.LC_HANDLER_IMPL, "");
                fxaVar.b(Status.c);
                return;
            }
            this.b.e(iwc.LC_HANDLER_IMPL, ivuVar.a());
            kcu.U(ivuVar.b(fwmVar, mxcVar), new cvt(this, ivuVar, fxaVar, 10, null), mjl.a);
        } catch (ngd e) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/libraries/inputmethod/trainingcache/localcomputation/LocalComputationResultHandlingService", "handleResult", '@', "LocalComputationResultHandlingService.java")).t("Failed to parse local computation task config from context data of trainer options.");
            fxaVar.b(Status.c);
        }
    }
}
