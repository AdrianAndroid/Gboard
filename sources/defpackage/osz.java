package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: osz  reason: default package */
/* loaded from: classes2.dex */
public final class osz implements Closeable {
    public static final ExecutorService a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), oqs.o("OkHttp Http2Connection", true));
    final ost c;
    final String e;
    int f;
    boolean h;
    public final ScheduledExecutorService i;
    long k;
    public final otj l;
    final otj m;
    final Socket o;
    public final otg p;
    public final osy q;
    private final ExecutorService s;
    final Map d = new LinkedHashMap();
    long j = 0;
    boolean n = false;
    final Set r = new LinkedHashSet();
    final boolean b = true;
    int g = 3;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, out] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, ous] */
    public osz(osr osrVar) {
        otj otjVar = new otj();
        this.l = otjVar;
        otj otjVar2 = new otj();
        this.m = otjVar2;
        this.c = (ost) osrVar.d;
        otjVar.e(7, 16777216);
        String str = (String) osrVar.e;
        this.e = str;
        this.i = new ScheduledThreadPoolExecutor(1, oqs.o(oqs.i("OkHttp %s Writer", str), false));
        this.s = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), oqs.o(oqs.i("OkHttp %s Push Observer", str), true));
        otjVar2.e(7, 65535);
        otjVar2.e(5, 16384);
        this.k = otjVar2.c();
        this.o = (Socket) osrVar.a;
        this.p = new otg(osrVar.c);
        this.q = new osy(this, new otb(osrVar.b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean o(int i) {
        return (i & 1) == 0;
    }

    public final synchronized int a() {
        otj otjVar = this.m;
        if ((otjVar.a & 16) != 0) {
            return ((int[]) otjVar.b)[4];
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized otf b(int i) {
        return (otf) this.d.get(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized otf c(int i) {
        otf otfVar;
        otfVar = (otf) this.d.remove(Integer.valueOf(i));
        notifyAll();
        return otfVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        k(1, 9);
    }

    public final void d() {
        try {
            k(2, 2);
        } catch (IOException unused) {
        }
    }

    public final void e() {
        this.p.d();
    }

    public final synchronized void f(oqq oqqVar) {
        if (!j()) {
            this.s.execute(oqqVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void g(long j) {
        long j2 = this.j + j;
        this.j = j2;
        if (j2 >= this.l.c() / 2) {
            i(0, j2);
            this.j = 0L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.p.a);
        r6 = r3;
        r8.k -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r9, boolean r10, defpackage.our r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 == 0) goto L60
        L7:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L5f
            monitor-enter(r8)
        Lc:
            long r3 = r8.k     // Catch: java.lang.Throwable -> L4e java.lang.InterruptedException -> L50
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L2a
            java.util.Map r3 = r8.d     // Catch: java.lang.Throwable -> L4e java.lang.InterruptedException -> L50
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L4e java.lang.InterruptedException -> L50
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L4e java.lang.InterruptedException -> L50
            if (r3 == 0) goto L22
            r8.wait()     // Catch: java.lang.Throwable -> L4e java.lang.InterruptedException -> L50
            goto Lc
        L22:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L4e java.lang.InterruptedException -> L50
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L4e java.lang.InterruptedException -> L50
            throw r9     // Catch: java.lang.Throwable -> L4e java.lang.InterruptedException -> L50
        L2a:
            long r3 = java.lang.Math.min(r12, r3)     // Catch: java.lang.Throwable -> L4e
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L4e
            otg r3 = r8.p     // Catch: java.lang.Throwable -> L4e
            int r3 = r3.a     // Catch: java.lang.Throwable -> L4e
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L4e
            long r4 = r8.k     // Catch: java.lang.Throwable -> L4e
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L4e
            long r4 = r4 - r6
            r8.k = r4     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L4e
            long r12 = r12 - r6
            otg r4 = r8.p
            if (r10 == 0) goto L49
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L49
            r5 = 1
            goto L4a
        L49:
            r5 = 0
        L4a:
            r4.c(r5, r9, r11, r3)
            goto L7
        L4e:
            r9 = move-exception
            goto L5d
        L50:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L4e
            r9.interrupt()     // Catch: java.lang.Throwable -> L4e
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L4e
            r9.<init>()     // Catch: java.lang.Throwable -> L4e
            throw r9     // Catch: java.lang.Throwable -> L4e
        L5d:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L4e
            throw r9
        L5f:
            return
        L60:
            otg r12 = r8.p
            r12.c(r10, r9, r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.osz.h(int, boolean, our, long):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(int i, long j) {
        try {
            this.i.execute(new osm(this, new Object[]{this.e, Integer.valueOf(i)}, i, j));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final synchronized boolean j() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(int i, int i2) {
        otf[] otfVarArr;
        try {
            l(i);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            if (!this.d.isEmpty()) {
                otfVarArr = (otf[]) this.d.values().toArray(new otf[this.d.size()]);
                this.d.clear();
            } else {
                otfVarArr = null;
            }
        }
        if (otfVarArr != null) {
            for (otf otfVar : otfVarArr) {
                try {
                    otfVar.j(i2);
                } catch (IOException e2) {
                    e = e != null ? e2 : null;
                }
            }
        }
        try {
            this.p.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.o.close();
        } catch (IOException e4) {
            e = e4;
        }
        this.i.shutdown();
        this.s.shutdown();
        if (e == null) {
            return;
        }
        throw e;
    }

    public final void l(int i) {
        synchronized (this.p) {
            synchronized (this) {
                if (this.h) {
                    return;
                }
                this.h = true;
                int i2 = this.f;
                otg otgVar = this.p;
                byte[] bArr = oqs.a;
                otgVar.i(i2, i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(int i, int i2) {
        this.p.h(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(int i, int i2) {
        try {
            this.i.execute(new osl(this, new Object[]{this.e, Integer.valueOf(i)}, i, i2));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(int i) {
        try {
            f(new oso(this, new Object[]{this.e, Integer.valueOf(i)}, i));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(int i) {
        synchronized (this) {
            Set set = this.r;
            Integer valueOf = Integer.valueOf(i);
            if (set.contains(valueOf)) {
                n(i, 2);
                return;
            }
            this.r.add(valueOf);
            try {
                f(new osn(this, new Object[]{this.e, valueOf}, i));
            } catch (RejectedExecutionException unused) {
            }
        }
    }
}
