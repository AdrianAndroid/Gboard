package defpackage;

import android.net.ConnectivityManager;
import android.util.Log;

/* compiled from: PG */
/* renamed from: bdv  reason: default package */
/* loaded from: classes.dex */
final class bdv implements bdt {
    boolean a;
    final bcz b;
    private final bgd c;
    private final ConnectivityManager.NetworkCallback d = new bdu(this);

    public bdv(bgd bgdVar, bcz bczVar) {
        this.c = bgdVar;
        this.b = bczVar;
    }

    @Override // defpackage.bdt
    public final void a() {
        ((ConnectivityManager) this.c.a()).unregisterNetworkCallback(this.d);
    }

    @Override // defpackage.bdt
    public final boolean b() {
        this.a = ((ConnectivityManager) this.c.a()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) this.c.a()).registerDefaultNetworkCallback(this.d);
            return true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e);
            }
            return false;
        }
    }
}
