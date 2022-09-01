package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: PG */
/* renamed from: fwp  reason: default package */
/* loaded from: classes.dex */
public abstract class fwp extends Service {
    private final IBinder a = new gaq(this);

    public abstract void a(fwm fwmVar, boolean z, fxa fxaVar);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return !intent.getAction().equals("com.google.android.gms.learning.COMPUTATION_RESULT") ? new fzy("Unknown action is found while trying to bind InAppResultHandlingService") : this.a;
    }
}
