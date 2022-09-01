package com.google.android.libraries.inputmethod.trainingcache.trainer.dynamictrainer;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FederatedResultHandlingService extends fwp {
    @Override // defpackage.fwp
    public final void a(fwm fwmVar, boolean z, fxa fxaVar) {
        String str = fwmVar.e;
        String str2 = fwmVar.b;
        if (z) {
            ino.M(getApplicationContext()).V("last_federated_task_completed_timestamp", Long.valueOf(System.currentTimeMillis()));
        }
        fxaVar.b(Status.a);
    }
}
