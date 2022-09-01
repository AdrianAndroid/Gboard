package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* renamed from: fqm  reason: default package */
/* loaded from: classes.dex */
public final class fqm implements ServiceConnection {
    final /* synthetic */ fqq a;
    private final int b;

    public fqm(fqq fqqVar, int i) {
        this.a = fqqVar;
        this.b = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        frl frlVar;
        int i;
        int i2;
        if (iBinder == null) {
            fqq fqqVar = this.a;
            synchronized (fqqVar.d) {
                i = fqqVar.h;
            }
            if (i == 3) {
                fqqVar.l = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            Handler handler = fqqVar.c;
            handler.sendMessage(handler.obtainMessage(i2, fqqVar.n.get(), 16));
            return;
        }
        synchronized (this.a.e) {
            fqq fqqVar2 = this.a;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface != null && (queryLocalInterface instanceof frl)) {
                frlVar = (frl) queryLocalInterface;
            } else {
                frlVar = new frl(iBinder);
            }
            fqqVar2.o = frlVar;
        }
        this.a.F(0, this.b);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.a.e) {
            this.a.o = null;
        }
        Handler handler = this.a.c;
        handler.sendMessage(handler.obtainMessage(6, this.b, 1));
    }
}
