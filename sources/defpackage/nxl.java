package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: nxl  reason: default package */
/* loaded from: classes2.dex */
public final class nxl implements ServiceConnection, nwj {
    private static final Logger a = Logger.getLogger(nxl.class.getName());
    private final Intent b;
    private final int c;
    private final nwi d;
    private final Executor e;
    private Context f;
    private int g;
    private int h;

    public nxl(Executor executor, Context context, Intent intent, int i, nwi nwiVar) {
        synchronized (this) {
            this.b = intent;
            this.c = i;
            this.d = nwiVar;
            this.f = context;
            this.e = executor;
            this.g = 1;
            this.h = 1;
        }
    }

    @Override // defpackage.nwj
    public final synchronized void a() {
        nvu f;
        if (this.g == 1) {
            this.g = 2;
            Context context = this.f;
            Intent intent = this.b;
            try {
                if (!context.bindService(intent, this, this.c)) {
                    nvu nvuVar = nvu.j;
                    String valueOf = String.valueOf(intent);
                    f = nvuVar.f("bindService(" + valueOf + ") returned false");
                } else {
                    f = nvu.b;
                }
            } catch (SecurityException e) {
                f = nvu.g.e(e).f("SecurityException from bindService");
            } catch (RuntimeException e2) {
                f = nvu.k.e(e2).f("RuntimeException from bindService");
            }
            if (!f.k()) {
                try {
                    this.f.unbindService(this);
                } catch (RuntimeException e3) {
                    a.logp(Level.FINE, "io.grpc.binder.internal.ServiceBinding", "handleBindServiceFailure", "Could not clean up after bindService() failure.", (Throwable) e3);
                }
                this.g = 4;
                this.e.execute(new kht(this, f, 17));
            }
        }
    }

    public final void b(nvu nvuVar) {
        Logger logger = a;
        logger.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyUnbound", "notify unbound ", nvuVar);
        this.f = null;
        if (this.h != 4) {
            this.h = 4;
            logger.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyUnbound", "notify unbound - notifying");
            this.d.b(nvuVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(nvu nvuVar) {
        Context context;
        synchronized (this) {
            int i = this.g;
            if (i != 2 && i != 3) {
                context = null;
                this.g = 4;
            }
            context = this.f;
            this.g = 4;
        }
        this.e.execute(new kht(this, nvuVar, 16));
        if (context != null) {
            context.unbindService(this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        c(nvu.l.f("onBindingDied: ".concat(String.valueOf(String.valueOf(componentName)))));
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        c(nvu.j.f("onNullBinding: ".concat(String.valueOf(String.valueOf(componentName)))));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z;
        synchronized (this) {
            if (this.g == 2) {
                this.g = 3;
                z = true;
            } else {
                z = false;
            }
        }
        if (!z || this.h != 1) {
            return;
        }
        this.h = 3;
        a.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyBound", "notify bound - notifying");
        this.d.a(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        c(nvu.l.f("onServiceDisconnected: ".concat(String.valueOf(String.valueOf(componentName)))));
    }
}
