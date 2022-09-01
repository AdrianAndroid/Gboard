package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: lvy  reason: default package */
/* loaded from: classes.dex */
public final class lvy extends lvp {
    public static final AtomicReference a = new AtomicReference();
    private static final AtomicLong b = new AtomicLong();
    private static final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    private volatile lun d;

    public lvy(String str) {
        super(str);
        boolean z = true;
        boolean z2 = Build.FINGERPRINT == null || "robolectric".equals(Build.FINGERPRINT);
        boolean z3 = "goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE);
        if (!"eng".equals(Build.TYPE) && !"userdebug".equals(Build.TYPE)) {
            z = false;
        }
        if (z2 || z3) {
            this.d = new lvq(0).a(d());
        } else if (!z) {
            this.d = null;
        } else {
            lwa lwaVar = new lwa();
            this.d = new lwa(Level.OFF, lwaVar.a, lwaVar.b).a(d());
        }
    }

    public static void a() {
        while (true) {
            lvy lvyVar = (lvy) lvx.a.poll();
            if (lvyVar != null) {
                lvyVar.d = ((lvr) a.get()).a(lvyVar.d());
            } else {
                f();
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [lum, java.lang.Object] */
    private static void f() {
        while (true) {
            oqv oqvVar = (oqv) c.poll();
            if (oqvVar != null) {
                b.getAndDecrement();
                Object obj = oqvVar.a;
                ?? r0 = oqvVar.b;
                if (!r0.Q()) {
                    if (((lun) obj).c(r0.q())) {
                    }
                }
                ((lun) obj).b(r0);
            } else {
                return;
            }
        }
    }

    @Override // defpackage.lun
    public final void b(lum lumVar) {
        if (this.d != null) {
            this.d.b(lumVar);
            return;
        }
        if (b.incrementAndGet() > 20) {
            c.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        c.offer(new oqv(this, lumVar));
        if (this.d == null) {
            return;
        }
        f();
    }

    @Override // defpackage.lun
    public final boolean c(Level level) {
        if (this.d != null) {
            return this.d.c(level);
        }
        return true;
    }

    @Override // defpackage.lvp, defpackage.lun
    public final void e(RuntimeException runtimeException, lum lumVar) {
        if (this.d != null) {
            this.d.e(runtimeException, lumVar);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }
}
