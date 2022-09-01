package com.google.android.libraries.inputmethod.featuresplit.metrics;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FeatureSplitMultiprocessMetricsService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        oll.e(intent, "intent");
        hgu hguVar = (hgu) jak.a(intent.getAction(), hgu.class);
        if (hguVar != null) {
            ieh.j().e(hguVar, new Object[0]);
            return null;
        }
        return null;
    }
}
