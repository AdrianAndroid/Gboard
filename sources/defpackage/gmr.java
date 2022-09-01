package defpackage;

import android.net.Network;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gmr  reason: default package */
/* loaded from: classes.dex */
public final class gmr implements gnl {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public gmr(gmg gmgVar, int i) {
        this.b = i;
        this.a = gmgVar;
    }

    public gmr(gms gmsVar, int i) {
        this.b = i;
        this.a = gmsVar;
    }

    @Override // defpackage.gnl
    public final void a(Throwable th) {
        if (this.b == 0) {
            ((ltd) ((ltd) gms.a.c()).k("com/google/android/libraries/gsa/io/impl/networkmonitor/PlatformMonitor$2", "onFailure", 334, "PlatformMonitor.java")).t("Connectivity check failed");
            ((gms) this.a).c.lock();
            try {
                Object obj = this.a;
                ((gms) obj).i = true;
                ((gms) obj).j = gmm.a;
                ((gms) this.a).n = null;
                return;
            } finally {
                ((gms) this.a).c.unlock();
            }
        }
        ((ltd) ((ltd) ((ltd) gmg.a.d()).i(th)).k("com/google/android/libraries/gsa/io/impl/networkmonitor/CellRequester$1", "onFailure", 'R', "CellRequester.java")).t("Getting connectivity info failed.");
        bnh.b(th);
    }

    @Override // defpackage.gnl
    public final /* synthetic */ void b(Object obj) {
        if (this.b == 0) {
            gmm gmmVar = (gmm) obj;
            ((gms) this.a).c.lock();
            try {
                ((gms) this.a).n = null;
                return;
            } finally {
                ((gms) this.a).c.unlock();
            }
        }
        gmm gmmVar2 = (gmm) obj;
        if (gmmVar2.b.e != 1) {
            return;
        }
        ((gmg) this.a).a();
        Network network = gmmVar2.d;
        if (network == null) {
            return;
        }
        ((gmg) this.a).c.reportNetworkConnectivity(network, false);
    }
}
