package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kzo  reason: default package */
/* loaded from: classes.dex */
public final class kzo implements ServiceConnection {
    final /* synthetic */ kzp a;

    public kzo(kzp kzpVar) {
        this.a = kzpVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.l.g("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.a.c(new kzm(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.l.g("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.a.c(new kzn(this));
    }
}
