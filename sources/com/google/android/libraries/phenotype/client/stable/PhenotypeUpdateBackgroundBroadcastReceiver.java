package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PhenotypeUpdateBackgroundBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra != null) {
            kjj b = kjj.b(context);
            Map a = kkm.a(context);
            if (a.isEmpty()) {
                return;
            }
            kkm kkmVar = (kkm) a.get(stringExtra);
            if (kkmVar == null || kkmVar.e != 7) {
                Log.i("PhenotypeBackgroundRecv", "Skipping " + stringExtra + " which doesn't use ProcessStable flags.");
                return;
            }
            BroadcastReceiver.PendingResult goAsync = goAsync();
            mkh mkhVar = (mkh) kcu.R(mio.h(mkh.q(mio.g(mkh.q(kko.b(b).a()), new kdw(stringExtra, 2), b.e())), new kks(kkmVar, stringExtra, b, 0), b.e()), 50L, TimeUnit.SECONDS, b.e());
            mkhVar.d(new epv(mkhVar, stringExtra, goAsync, 20), b.e());
        }
    }
}
