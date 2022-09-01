package defpackage;

import android.util.Printer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: gxp  reason: default package */
/* loaded from: classes.dex */
public final class gxp implements gzv {
    private static final ltg d = ltg.j("com/google/android/libraries/inputmethod/concurrent/Executors");
    private static volatile gxp e;
    public final mks a;
    public final mks b;
    public final mks c;
    private final List f = new ArrayList();
    private final mks g;
    private volatile mks h;
    private volatile mks i;
    private volatile mks j;
    private volatile mks k;
    private volatile mks l;
    private volatile mks m;
    private volatile mks n;

    private gxp() {
        nzv nzvVar = new nzv((byte[]) null);
        nzvVar.c("ImeScheduler-%d");
        nzvVar.b();
        mks D = kcu.D(Executors.newScheduledThreadPool(1, nzv.d(nzvVar)));
        this.g = D;
        this.a = new gxm(e("Light-P0", 0, Math.max(2, Runtime.getRuntime().availableProcessors() - 2)), D);
        this.b = new gxm(e("Back-P10", 10, 4), D);
        this.c = new gxm(i("Block-P11", 11, 0, Integer.MAX_VALUE, new SynchronousQueue()), D);
        gzt.a.a(this);
    }

    public static gxp a() {
        gxp gxpVar = e;
        if (gxpVar == null) {
            synchronized (gxp.class) {
                gxpVar = e;
                if (gxpVar == null) {
                    gxpVar = new gxp();
                    e = gxpVar;
                }
            }
        }
        return gxpVar;
    }

    public static boolean d(Executor executor) {
        mjl mjlVar;
        return executor == gyc.b || executor == (mjlVar = mjl.a) || executor == gyc.a || executor == mjlVar || (executor instanceof gxn) || (executor instanceof gxr);
    }

    private final mks g(int i) {
        return f("ExeSeq-P" + i, i);
    }

    private static gxf h() {
        return new gxf();
    }

    private final mkr i(String str, int i, int i2, int i3, BlockingQueue blockingQueue) {
        if (str.length() > 16) {
            ((ltd) ((ltd) d.d()).k("com/google/android/libraries/inputmethod/concurrent/Executors", "createThreadPoolExecutor", 538, "Executors.java")).w("createThreadPoolExecutor(): name[%s] exceeds limit", str);
            str = str.substring(0, 16);
        }
        String str2 = str;
        gxf h = h();
        gya gyaVar = new gya(str2, i2, i3, TimeUnit.MINUTES, blockingQueue, new kbs(str2, i, 1));
        if (i2 > 0) {
            gyaVar.allowCoreThreadTimeOut(true);
        }
        synchronized (this.f) {
            this.f.add(h);
            this.f.add(gyaVar);
        }
        return kcu.B(gyaVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final mks c(ExecutorService executorService) {
        return d(executorService) ? executorService : new gxn(executorService, this.g);
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        synchronized (this.f) {
            gzw gzwVar = new gzw(printer);
            for (gzv gzvVar : this.f) {
                gzu.b(printer, gzwVar, gzvVar, z);
            }
        }
    }

    final mkr e(String str, int i, int i2) {
        return i(str, i, i2, i2, new LinkedBlockingQueue());
    }

    public final mks f(String str, int i) {
        if (str.length() > 16) {
            str = str.substring(0, 16);
        }
        gxf h = h();
        gxs gxsVar = new gxs(new kbs(str, i, 1), null);
        synchronized (this.f) {
            this.f.add(h);
        }
        return new gxr(kcu.D(gxsVar));
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "Executors";
    }

    public final mks b(int i) {
        if (i == 1) {
            if (this.h == null) {
                this.h = g(0);
            }
            return this.h;
        } else if (i == 2) {
            if (this.i == null) {
                this.i = g(0);
            }
            return this.i;
        } else if (i == 5) {
            if (this.j == null) {
                this.j = g(0);
            }
            return this.j;
        } else if (i == 6) {
            if (this.k == null) {
                this.k = g(11);
            }
            return this.k;
        } else {
            if (i != 19) {
                switch (i) {
                    case 9:
                        if (this.l == null) {
                            this.l = g(10);
                        }
                        return this.l;
                    case 10:
                        if (this.m == null) {
                            this.m = g(11);
                        }
                        return this.m;
                    case 11:
                        break;
                    default:
                        ((ltd) d.a(hip.a).k("com/google/android/libraries/inputmethod/concurrent/Executors", "getSharedSingleThreadExecutor", 380, "Executors.java")).t("Runnable priority should be one of ThreadPriorities.");
                        if (this.m == null) {
                            this.m = g(11);
                        }
                        return this.m;
                }
            }
            if (this.n == null) {
                this.n = g(10);
            }
            return this.n;
        }
    }
}
