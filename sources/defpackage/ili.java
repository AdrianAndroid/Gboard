package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* renamed from: ili  reason: default package */
/* loaded from: classes.dex */
final class ili extends BroadcastReceiver {
    final /* synthetic */ ilk a;

    public ili(ilk ilkVar) {
        this.a = ilkVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ilk ilkVar = this.a;
        boolean booleanExtra = intent.getBooleanExtra("com.google.android.gms.phenotype.URGENT", false);
        Boolean valueOf = Boolean.valueOf(booleanExtra);
        ((ltd) ((ltd) ilk.a.b()).k("com/google/android/libraries/inputmethod/phenotype/PhenotypeModule", "receiveBroadcast", 396, "PhenotypeModule.java")).w("onReceive() urgent = %b", valueOf);
        ilkVar.e.e(hhv.RECEIVE_FLAG_UPDATE_BROADCAST, valueOf);
        ilkVar.c(true != booleanExtra ? 2 : 3);
    }
}
