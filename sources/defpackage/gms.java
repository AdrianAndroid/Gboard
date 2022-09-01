package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* renamed from: gms  reason: default package */
/* loaded from: classes.dex */
public final class gms {
    public static final ltg a = ltg.j("com/google/android/libraries/gsa/io/impl/networkmonitor/PlatformMonitor");
    public static final NetworkInfo.State[] b = {NetworkInfo.State.CONNECTED, NetworkInfo.State.CONNECTING, NetworkInfo.State.DISCONNECTED, NetworkInfo.State.DISCONNECTING};
    public final Context d;
    public final ConnectivityManager e;
    public final TelephonyManager f;
    public final WifiManager g;
    public final lfb h;
    public boolean i;
    public volatile gni k;
    private final gnn l;
    private final gnn m;
    private mko n;
    public final Lock c = new ReentrantLock();
    public gmm j = gmm.a;

    public gms(Context context, ConnectivityManager connectivityManager, TelephonyManager telephonyManager, WifiManager wifiManager, gnn gnnVar, gnn gnnVar2, lfb lfbVar) {
        new gmq(this);
        this.d = context;
        this.e = connectivityManager;
        this.f = telephonyManager;
        this.g = wifiManager;
        this.l = gnnVar;
        this.m = gnnVar2;
        kcu.E(new glh(gnnVar2, 5));
        this.h = lfbVar;
    }

    public final mko a() {
        if (!b()) {
            return kcu.K(gmm.a);
        }
        try {
            if (this.i) {
                return kcu.K(this.j);
            }
            mko mkoVar = this.n;
            if (mkoVar == null) {
                mkoVar = mhu.h(bvq.f(this.l.b(new gnk() { // from class: gmp
                    /* JADX WARN: Code restructure failed: missing block: B:135:0x01f5, code lost:
                        if (defpackage.jdg.W(r2.j.i, true) != false) goto L136;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:106:0x02ad A[ADDED_TO_REGION] */
                    /* JADX WARN: Removed duplicated region for block: B:119:0x028b  */
                    /* JADX WARN: Removed duplicated region for block: B:73:0x0219 A[Catch: all -> 0x02d4, TryCatch #1 {all -> 0x02d4, blocks: (B:63:0x0199, B:69:0x01b7, B:73:0x0219, B:74:0x0225, B:76:0x022b, B:86:0x0256, B:121:0x01c3, B:125:0x01cc, B:129:0x01d5, B:132:0x01dc, B:134:0x01e7, B:138:0x01fa, B:140:0x0205, B:142:0x020b), top: B:62:0x0199 }] */
                    @Override // defpackage.gnk
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object a() {
                        /*
                            Method dump skipped, instructions count: 830
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.gmp.a():java.lang.Object");
                    }
                }), 5000L, TimeUnit.MILLISECONDS, this.m), TimeoutException.class, cex.e, mjl.a);
                this.n = mkoVar;
                this.m.a(mkoVar, new gmr(this, 0));
            }
            return kcu.L(mkoVar);
        } finally {
            this.c.unlock();
        }
    }

    public final boolean b() {
        boolean z;
        try {
            z = this.c.tryLock(4000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            z = false;
        }
        if (!z) {
            ((ltd) ((ltd) a.d()).k("com/google/android/libraries/gsa/io/impl/networkmonitor/PlatformMonitor", "tryConnectivityLockCatchingInterrupt", 363, "PlatformMonitor.java")).u("Failed to get connectivityLock in %d ms", 4000);
        }
        return z;
    }
}
