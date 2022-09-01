package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* compiled from: PG */
/* renamed from: frc  reason: default package */
/* loaded from: classes.dex */
public final class frc {
    public static final Object a = new Object();
    public static HandlerThread b;
    private static frc i;
    public final HashMap c;
    public final Context d;
    public volatile Handler e;
    public final long f;
    private final fre g;
    private final long h;

    public frc() {
    }

    public static frc a(Context context) {
        synchronized (a) {
            if (i == null) {
                i = new frc(context.getApplicationContext(), context.getMainLooper());
            }
        }
        return i;
    }

    public final void b(ComponentName componentName, ServiceConnection serviceConnection) {
        c(new frb(componentName), serviceConnection);
    }

    protected final void c(frb frbVar, ServiceConnection serviceConnection) {
        fyb.aH(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.c) {
            frd frdVar = (frd) this.c.get(frbVar);
            if (frdVar == null) {
                String obj = frbVar.toString();
                throw new IllegalStateException("Nonexistent connection status for service config: " + obj);
            } else if (frdVar.a(serviceConnection)) {
                frdVar.a.remove(serviceConnection);
                if (frdVar.b()) {
                    this.e.sendMessageDelayed(this.e.obtainMessage(0, frbVar), this.h);
                }
            } else {
                String obj2 = frbVar.toString();
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + obj2);
            }
        }
    }

    public final boolean d(frb frbVar, ServiceConnection serviceConnection) {
        boolean z;
        fyb.aH(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.c) {
            frd frdVar = (frd) this.c.get(frbVar);
            if (frdVar == null) {
                frdVar = new frd(this, frbVar);
                frdVar.c(serviceConnection, serviceConnection);
                frdVar.d();
                this.c.put(frbVar, frdVar);
            } else {
                this.e.removeMessages(0, frbVar);
                if (frdVar.a(serviceConnection)) {
                    String obj = frbVar.toString();
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + obj);
                }
                frdVar.c(serviceConnection, serviceConnection);
                int i2 = frdVar.b;
                if (i2 == 1) {
                    serviceConnection.onServiceConnected(frdVar.f, frdVar.d);
                } else if (i2 == 2) {
                    frdVar.d();
                }
            }
            z = frdVar.c;
        }
        return z;
    }

    public final void e(String str, ServiceConnection serviceConnection, boolean z) {
        c(new frb(str, z), serviceConnection);
    }

    public frc(Context context, Looper looper) {
        this.c = new HashMap();
        fre freVar = new fre(this, 0);
        this.g = freVar;
        this.d = context.getApplicationContext();
        this.e = new gco(looper, freVar);
        if (fsd.b == null) {
            synchronized (fsd.a) {
                if (fsd.b == null) {
                    fsd.b = new fsd();
                }
            }
        }
        fyb.ax(fsd.b);
        this.h = 5000L;
        this.f = 300000L;
    }
}
