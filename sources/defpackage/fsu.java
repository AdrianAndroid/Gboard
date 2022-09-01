package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PG */
/* renamed from: fsu  reason: default package */
/* loaded from: classes.dex */
public final class fsu implements Runnable, fpb, fpw {
    private static fsu d;
    public final LinkedBlockingQueue a = new LinkedBlockingQueue();
    public int b = 0;
    public final Handler c;
    private final fra e;

    private fsu(Context context) {
        HandlerThread handlerThread = new HandlerThread("DG");
        handlerThread.start();
        gco gcoVar = new gco(handlerThread.getLooper());
        this.c = gcoVar;
        this.e = new fsq(context, gcoVar.getLooper(), this, this);
    }

    public static synchronized fsu c(Context context) {
        fsu fsuVar;
        synchronized (fsu.class) {
            if (d == null) {
                d = new fsu(context);
            }
            fsuVar = d;
        }
        return fsuVar;
    }

    private final void f(String str) {
        while (true) {
            fss fssVar = (fss) this.a.poll();
            if (fssVar == null) {
                return;
            }
            fssVar.b(new fsr(this, str, fssVar.f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:260:0x040d, code lost:
        if (r19 != null) goto L180;
     */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0230 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.Map, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void g() {
        /*
            Method dump skipped, instructions count: 1119
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fsu.g():void");
    }

    @Override // defpackage.fpb
    public final void a(int i) {
        fyb.aA(this.c);
        f("Disconnected: " + i);
    }

    @Override // defpackage.fpb
    public final void b() {
        fyb.aA(this.c);
        g();
    }

    public final void d() {
        if (!this.a.isEmpty() || this.b != 0 || !this.e.m()) {
            return;
        }
        this.e.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(Runnable runnable) {
        if (Looper.myLooper() == this.c.getLooper()) {
            runnable.run();
        } else {
            this.c.post(runnable);
        }
    }

    @Override // defpackage.fpw
    public final void i(fmt fmtVar) {
        fyb.aA(this.c);
        f("Connection failed: ".concat(fmtVar.toString()));
    }

    @Override // java.lang.Runnable
    public final void run() {
        fyb.aA(this.c);
        if (this.e.m()) {
            g();
        } else if (this.e.n() || this.a.isEmpty()) {
        } else {
            fra fraVar = this.e;
            int f = fraVar.b.f(fraVar.a, 12800000);
            if (f != 0) {
                fraVar.z(1, null);
                fraVar.f = new fqn(fraVar);
                Handler handler = fraVar.c;
                handler.sendMessage(handler.obtainMessage(3, fraVar.n.get(), f, null));
                return;
            }
            fraVar.k(new fqn(fraVar));
        }
    }
}
