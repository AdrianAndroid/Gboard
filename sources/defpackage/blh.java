package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: blh  reason: default package */
/* loaded from: classes.dex */
public final class blh implements blo {
    public final int b;
    final AtomicReference c;
    public volatile long d;
    public volatile long e;
    public volatile long f;
    public volatile long g;
    protected lzv h;
    final bmi m;
    public volatile nwo n;
    private volatile blb s;
    private final AtomicInteger o = new AtomicInteger(0);
    private volatile long p = -1;
    public volatile long i = -1;
    private volatile long q = -1;
    private volatile long r = -1;
    protected final AtomicReference j = new AtomicReference(lzt.PENDING);
    public volatile int k = -1;
    public volatile int l = -1;
    public final long a = SystemClock.elapsedRealtime();

    public blh(bmi bmiVar, lfb lfbVar) {
        int i = bmiVar.l;
        this.b = i;
        this.c = new AtomicReference(lfbVar);
        this.m = bmiVar;
    }

    /* JADX WARN: Type inference failed for: r1v35, types: [java.util.List, java.lang.Object] */
    private final void h() {
        if (this.o.incrementAndGet() == 2) {
            lfb lfbVar = (lfb) this.c.get();
            if (!lfbVar.e()) {
                return;
            }
            bml bmlVar = (bml) lfbVar.a();
            nfh t = lzu.q.t();
            long a = giw.a(this.a);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            lzu lzuVar = (lzu) t.b;
            lzuVar.a |= 1;
            lzuVar.b = a;
            long j = 0;
            if (this.i >= 0) {
                long a2 = giw.a(this.i);
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                lzu lzuVar2 = (lzu) t.b;
                lzuVar2.a |= 8;
                lzuVar2.e = a2;
            }
            if (this.p >= 0) {
                long a3 = giw.a(this.p);
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                lzu lzuVar3 = (lzu) t.b;
                lzuVar3.a = 2 | lzuVar3.a;
                lzuVar3.c = a3;
            }
            if (this.r >= 0) {
                long a4 = giw.a(this.r);
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                lzu lzuVar4 = (lzu) t.b;
                lzuVar4.a |= 4;
                lzuVar4.d = a4;
            }
            if (this.n != null) {
                int i = this.n.a;
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                lzu lzuVar5 = (lzu) t.b;
                lzuVar5.a |= 1024;
                lzuVar5.m = i;
            }
            for (Throwable th = this.s; th instanceof blb; th = th.getCause()) {
                int i2 = ((blb) th).a;
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                lzu lzuVar6 = (lzu) t.b;
                nfs nfsVar = lzuVar6.l;
                if (!nfsVar.c()) {
                    lzuVar6.l = nfm.D(nfsVar);
                }
                lzuVar6.l.g(i2);
            }
            if (this.l != -1) {
                int i3 = this.l;
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                lzu lzuVar7 = (lzu) t.b;
                lzuVar7.a |= 512;
                lzuVar7.k = i3;
            }
            long j2 = this.d;
            if (this.n != null) {
                j = bmf.a(this.n.b);
            }
            int i4 = (int) (j2 + j);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            lzu lzuVar8 = (lzu) t.b;
            lzuVar8.a |= 16;
            lzuVar8.f = i4;
            int f = (int) (this.e + f());
            if (t.c) {
                t.cD();
                t.c = false;
            }
            lzu lzuVar9 = (lzu) t.b;
            int i5 = lzuVar9.a | 32;
            lzuVar9.a = i5;
            lzuVar9.g = f;
            int i6 = this.b;
            lzuVar9.a = i5 | 64;
            lzuVar9.h = i6;
            long j3 = this.f;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            lzu lzuVar10 = (lzu) t.b;
            lzuVar10.a |= 4096;
            lzuVar10.o = j3;
            long j4 = this.g;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            lzu lzuVar11 = (lzu) t.b;
            lzuVar11.a |= 2048;
            lzuVar11.n = j4;
            lzt lztVar = (lzt) this.j.get();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            lzu lzuVar12 = (lzu) t.b;
            lzuVar12.j = lztVar.f;
            lzuVar12.a |= 256;
            Object obj = this.n != null ? this.n.c : null;
            if (obj != null) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                lzu lzuVar13 = (lzu) t.b;
                lzuVar13.a |= 128;
                lzuVar13.i = (String) obj;
            }
            lzv lzvVar = this.h;
            if (lzvVar != null) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                lzu lzuVar14 = (lzu) t.b;
                lzuVar14.p = lzvVar;
                lzuVar14.a |= 8192;
            }
            lzu lzuVar15 = (lzu) t.cz();
            bmlVar.a();
            this.c.set(ldu.a);
        }
    }

    private final void i(lzt lztVar, long j) {
        AtomicReference atomicReference = this.j;
        lzt lztVar2 = lzt.PENDING;
        while (!atomicReference.compareAndSet(lztVar2, lztVar)) {
            if (atomicReference.get() != lztVar2) {
                return;
            }
        }
        this.r = j;
        if (((lfb) this.c.get()).e()) {
            h();
        }
    }

    @Override // defpackage.blo
    public final long a() {
        return SystemClock.elapsedRealtime() - (this.i == -1 ? this.a : this.i);
    }

    @Override // defpackage.blo
    public final void b() {
        i(lzt.COMPLETE, SystemClock.elapsedRealtime());
    }

    @Override // defpackage.blo
    public final void c(blb blbVar) {
        lzt lztVar;
        if (this.s == null) {
            this.q = SystemClock.elapsedRealtime();
            this.s = blbVar;
            Integer num = (Integer) bmv.a.get(Integer.valueOf(blbVar.a));
            if (num == null || num.intValue() != 10) {
                lztVar = lzt.ERROR;
            } else {
                lztVar = lzt.CANCELLED;
            }
            i(lztVar, this.q);
        }
    }

    @Override // defpackage.blo
    public final void d(long j, long j2, lzv lzvVar) {
        jdg.G(this.h == null, "reportFinished should be called only once.");
        this.g = j;
        this.f = j2;
        this.h = lzvVar;
        h();
    }

    @Override // defpackage.blo
    public final void e() {
        this.i = SystemClock.elapsedRealtime();
    }

    public final long f() {
        bmi bmiVar = this.m;
        String str = bmiVar.f;
        return bmf.a(bmiVar.g) + bmiVar.e.toString().length() + str.length() + 4;
    }

    @Override // defpackage.blo
    public final void g(nwo nwoVar) {
        this.p = SystemClock.elapsedRealtime();
        this.n = nwoVar;
    }
}
