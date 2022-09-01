package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: gmg  reason: default package */
/* loaded from: classes.dex */
public final class gmg {
    public static final ltg a = ltg.j("com/google/android/libraries/gsa/io/impl/networkmonitor/CellRequester");
    public final gnn b;
    public final ConnectivityManager c;
    public final gms d;
    private ConnectivityManager.NetworkCallback f = null;
    public long e = 0;

    public gmg(gnn gnnVar, ConnectivityManager connectivityManager, gms gmsVar) {
        this.b = gnnVar;
        this.c = connectivityManager;
        this.d = gmsVar;
    }

    public final synchronized void a() {
        if (this.f != null) {
            this.e = SystemClock.elapsedRealtime() + 40000;
            return;
        }
        this.f = new gmf();
        try {
            this.c.requestNetwork(new NetworkRequest.Builder().addCapability(12).addTransportType(0).build(), this.f);
            this.b.e(40000L, new gky(this, 6));
        } catch (SecurityException e) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/libraries/gsa/io/impl/networkmonitor/CellRequester", "requestCellRadio", 'p', "CellRequester.java")).t("SecurityException during requestNetwork()");
            this.f = null;
        } catch (RuntimeException e2) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e2)).k("com/google/android/libraries/gsa/io/impl/networkmonitor/CellRequester", "requestCellRadio", 't', "CellRequester.java")).t("Unexpected exception");
            bnh.b(e2);
            this.f = null;
        }
    }

    public final synchronized void b() {
        try {
            this.c.unregisterNetworkCallback(this.f);
        } catch (IllegalArgumentException e) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/libraries/gsa/io/impl/networkmonitor/CellRequester", "unrequestCellRadio", (char) 154, "CellRequester.java")).t("IllegalArgumentException during unregisterNetworkCallback()");
        } catch (RuntimeException e2) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e2)).k("com/google/android/libraries/gsa/io/impl/networkmonitor/CellRequester", "unrequestCellRadio", (char) 157, "CellRequester.java")).t("Unexpected exception");
            bnh.b(e2);
        }
        this.f = null;
    }
}
