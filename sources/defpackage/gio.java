package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: PG */
/* renamed from: gio  reason: default package */
/* loaded from: classes.dex */
public final class gio extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ fws a;

    public gio(fws fwsVar, byte[] bArr) {
        this.a = fwsVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        ((kye) this.a.b).d();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        ((kye) this.a.b).g();
    }
}
