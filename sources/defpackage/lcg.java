package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: lcg  reason: default package */
/* loaded from: classes.dex */
public final class lcg {
    public final mld c;
    public final mkc d;
    public final AtomicLong a = new AtomicLong(b(Integer.MIN_VALUE, Integer.MIN_VALUE));
    public final AtomicReference b = new AtomicReference(null);
    private final AtomicReference e = new AtomicReference(null);
    private final Executor f = kcu.E(mjl.a);

    public lcg(mix mixVar, Executor executor) {
        mld e = mld.e();
        this.c = e;
        mkc mkcVar = new mkc(mixVar, executor, 1);
        this.d = mkcVar;
        e.d(mkcVar, mjl.a);
    }

    public static int a(long j) {
        return (int) (j >>> 32);
    }

    public static long b(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public final mko c() {
        long j;
        final int a;
        mko h;
        if (!this.c.isDone()) {
            do {
                j = this.a.get();
                a = a(j);
            } while (!this.a.compareAndSet(j, b(a, ((int) j) + 1)));
            final mld e = mld.e();
            mko mkoVar = (mko) this.e.getAndSet(e);
            if (mkoVar == null) {
                h = kcu.P(ldd.b(new lcc(this, a, 0)), mjl.a);
            } else {
                h = mhu.h(mkoVar, Throwable.class, ldd.c(new miy() { // from class: lcd
                    @Override // defpackage.miy
                    public final mko a(Object obj) {
                        Throwable th = (Throwable) obj;
                        return lcg.this.d(a);
                    }
                }), this.f);
            }
            e.p(h);
            final lce lceVar = new lce(this, a);
            e.d(new Runnable() { // from class: lcb
                @Override // java.lang.Runnable
                public final void run() {
                    lcg lcgVar = lcg.this;
                    mld mldVar = e;
                    lce lceVar2 = lceVar;
                    try {
                        lcgVar.c.c(kcu.S(mldVar));
                        lceVar2.p(lcgVar.c);
                    } catch (Throwable unused) {
                        lceVar2.p(mldVar);
                    }
                }
            }, mjl.a);
            return lceVar;
        }
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, mix] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final mko d(int i) {
        lcf lcfVar;
        if (a(this.a.get()) > i) {
            return kcu.I();
        }
        lcf lcfVar2 = new lcf(i);
        do {
            lcfVar = (lcf) this.b.get();
            if (lcfVar != null && lcfVar.a > i) {
                return kcu.I();
            }
        } while (!jco.m(this.b, lcfVar, lcfVar2));
        if (a(this.a.get()) > i) {
            lcfVar2.cancel(true);
            jco.m(this.b, lcfVar2, null);
            return lcfVar2;
        }
        mkc mkcVar = this.d;
        ?? r1 = mkcVar.a;
        ?? r4 = mkcVar.b;
        if (r1 == 0 || r4 == 0) {
            lcfVar2.p(this.c);
        } else {
            lcfVar2.p(kcu.P(ldd.b(r1), r4));
        }
        return lcfVar2;
    }
}
