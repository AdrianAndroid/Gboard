package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: nzt  reason: default package */
/* loaded from: classes2.dex */
public class nzt implements nyu {
    private nvu a;
    private nzs b;
    private long c;
    public volatile boolean d;
    public nyw e;
    public nyu f;
    private long h;
    public List g = new ArrayList();
    private List i = new ArrayList();

    private final void p(Runnable runnable) {
        jdg.G(this.e != null, "May only be called after start");
        synchronized (this) {
            if (!this.d) {
                this.g.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    @Override // defpackage.nyu
    public final nry a() {
        throw null;
    }

    @Override // defpackage.nyu
    public void b(oau oauVar) {
        synchronized (this) {
            if (this.e == null) {
                return;
            }
            if (this.f != null) {
                oauVar.b("buffered_nanos", Long.valueOf(this.h - this.c));
                this.f.b(oauVar);
            } else {
                oauVar.b("buffered_nanos", Long.valueOf(System.nanoTime() - this.c));
                oauVar.a("waiting_for_connection");
            }
        }
    }

    @Override // defpackage.nyu
    public void c(nvu nvuVar) {
        boolean z = true;
        jdg.G(this.e != null, "May only be called after start");
        jdg.Q(nvuVar, "reason");
        synchronized (this) {
            if (this.f == null) {
                t(ocz.a);
                this.a = nvuVar;
                z = false;
            }
        }
        if (z) {
            p(new nzm(this, nvuVar, 6));
            return;
        }
        r();
        q(nvuVar);
        this.e.a(nvuVar, nyv.PROCESSED, new num());
    }

    @Override // defpackage.ofh
    public final void d() {
        jdg.G(this.e != null, "May only be called after start");
        if (this.d) {
            this.f.d();
        } else {
            p(new nzp(this, 6));
        }
    }

    @Override // defpackage.nyu
    public final void e() {
        jdg.G(this.e != null, "May only be called after start");
        p(new nzp(this, 7));
    }

    @Override // defpackage.ofh
    public final void f() {
        jdg.G(this.e == null, "May only be called before start");
        this.i.add(new nzp(this, 4));
    }

    @Override // defpackage.ofh
    public final void g(int i) {
        jdg.G(this.e != null, "May only be called after start");
        if (this.d) {
            this.f.g(i);
        } else {
            p(new dob(this, i, 15));
        }
    }

    @Override // defpackage.ofh
    public final void h(nsj nsjVar) {
        jdg.G(this.e == null, "May only be called before start");
        this.i.add(new nzm(this, nsjVar, 2));
    }

    @Override // defpackage.nyu
    public final void i(nsv nsvVar) {
        jdg.G(this.e == null, "May only be called before start");
        this.i.add(new nzm(this, nsvVar, 4));
    }

    @Override // defpackage.nyu
    public final void j(nsy nsyVar) {
        jdg.G(this.e == null, "May only be called before start");
        jdg.Q(nsyVar, "decompressorRegistry");
        this.i.add(new nzm(this, nsyVar, 3));
    }

    @Override // defpackage.nyu
    public final void k(int i) {
        jdg.G(this.e == null, "May only be called before start");
        this.i.add(new dob(this, i, 16));
    }

    @Override // defpackage.nyu
    public final void l(int i) {
        jdg.G(this.e == null, "May only be called before start");
        this.i.add(new dob(this, i, 17));
    }

    @Override // defpackage.nyu
    public final void m(nyw nywVar) {
        nvu nvuVar;
        boolean z;
        jdg.G(this.e == null, "already started");
        synchronized (this) {
            nvuVar = this.a;
            z = this.d;
            if (!z) {
                nzs nzsVar = new nzs(nywVar);
                this.b = nzsVar;
                nywVar = nzsVar;
            }
            this.e = nywVar;
            this.c = System.nanoTime();
        }
        if (nvuVar != null) {
            nywVar.a(nvuVar, nyv.PROCESSED, new num());
        } else if (!z) {
        } else {
            s(nywVar);
        }
    }

    @Override // defpackage.ofh
    public final void n(InputStream inputStream) {
        jdg.G(this.e != null, "May only be called after start");
        if (this.d) {
            this.f.n(inputStream);
        } else {
            p(new nzm(this, inputStream, 5));
        }
    }

    @Override // defpackage.ofh
    public final boolean o() {
        if (this.d) {
            return this.f.o();
        }
        return false;
    }

    protected void q(nvu nvuVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005c, code lost:
        if (r0.hasNext() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0054, code lost:
        r0 = r1.iterator();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r6)
            java.util.List r1 = r6.g     // Catch: java.lang.Throwable -> L6d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L4f
            r0 = 0
            r6.g = r0     // Catch: java.lang.Throwable -> L6d
            r1 = 1
            r6.d = r1     // Catch: java.lang.Throwable -> L6d
            nzs r2 = r6.b     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L4e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L1e:
            monitor-enter(r2)
            java.util.List r4 = r2.c     // Catch: java.lang.Throwable -> L4b
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L2d
            r2.c = r0     // Catch: java.lang.Throwable -> L4b
            r2.b = r1     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            return
        L2d:
            java.util.List r4 = r2.c     // Catch: java.lang.Throwable -> L4b
            r2.c = r3     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            java.util.Iterator r3 = r4.iterator()
        L36:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L46
            java.lang.Object r5 = r3.next()
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r5.run()
            goto L36
        L46:
            r4.clear()
            r3 = r4
            goto L1e
        L4b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            throw r0
        L4e:
            return
        L4f:
            java.util.List r1 = r6.g     // Catch: java.lang.Throwable -> L6d
            r6.g = r0     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            java.util.Iterator r0 = r1.iterator()
        L58:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L68
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L58
        L68:
            r1.clear()
            r0 = r1
            goto L5
        L6d:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            goto L71
        L70:
            throw r0
        L71:
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nzt.r():void");
    }

    public final void s(nyw nywVar) {
        for (Runnable runnable : this.i) {
            runnable.run();
        }
        this.i = null;
        this.f.m(nywVar);
    }

    public final void t(nyu nyuVar) {
        nyu nyuVar2 = this.f;
        jdg.J(nyuVar2 == null, "realStream already set to %s", nyuVar2);
        this.f = nyuVar;
        this.h = System.nanoTime();
    }
}
