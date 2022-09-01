package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bdu  reason: default package */
/* loaded from: classes.dex */
public final class bdu extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ bdv a;

    public bdu(bdv bdvVar) {
        this.a = bdvVar;
    }

    private final void a(boolean z) {
        bgj.k(new bdx(this, z, 1));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        a(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        a(false);
    }
}
