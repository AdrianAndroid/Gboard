package defpackage;

import android.util.Log;
import java.util.concurrent.locks.Lock;

/* compiled from: PG */
/* renamed from: flq  reason: default package */
/* loaded from: classes.dex */
public class flq {
    public final String a;
    qw b;
    final /* synthetic */ fma c;
    private final Object d;
    private int e;
    private int f;

    /* JADX INFO: Access modifiers changed from: protected */
    public flq(fma fmaVar, flq flqVar) {
        this(fmaVar, flqVar.a);
        synchronized (flqVar.d) {
            this.e = flqVar.e;
            qw qwVar = this.b;
            this.b = flqVar.b;
            flqVar.b = qwVar;
            flqVar.e = 0;
        }
    }

    private final boolean b(long j, int i) {
        synchronized (this.d) {
            qs qsVar = (qs) this.b.d(i);
            if (qsVar == null) {
                qsVar = new qs();
                this.b.h(i, qsVar);
            }
            int i2 = this.e;
            fma fmaVar = this.c;
            int i3 = fmaVar.f;
            boolean z = false;
            if (i2 >= i3 && !fmaVar.h) {
                if (i2 == i3) {
                    String str = this.a;
                    Log.i("Counters", "exceeded sample count in " + str);
                }
                return false;
            }
            this.e = i2 + 1;
            long[] jArr = (long[]) qsVar.d(j);
            if (jArr == null) {
                jArr = new long[]{0};
                qsVar.j(j, jArr);
            }
            jArr[0] = jArr[0] + 1;
            if (this.c.h && this.e >= this.f) {
                z = true;
            }
            return z;
        }
    }

    public final void a(long j, flv flvVar) {
        boolean b;
        Integer c;
        if (flvVar == null) {
            flvVar = fma.c;
        }
        this.c.g.readLock().lock();
        try {
            Integer num = flvVar == fma.d ? this.c.n : (Integer) this.c.m.get(flvVar);
            boolean z = false;
            if (num == null) {
                b = false;
                z = true;
            } else {
                b = b(j, num.intValue());
            }
            if (z) {
                Lock writeLock = this.c.g.writeLock();
                writeLock.lock();
                try {
                    if (flvVar == fma.d) {
                        fma fmaVar = this.c;
                        fmaVar.n = fmaVar.c(fmaVar.l);
                        c = this.c.n;
                    } else {
                        c = this.c.c(flvVar);
                    }
                    this.c.g.readLock().lock();
                    writeLock.unlock();
                    writeLock = this.c.g.readLock();
                    boolean b2 = b(j, c.intValue());
                    writeLock.unlock();
                    b = b2;
                } catch (Throwable th) {
                    writeLock.unlock();
                    throw th;
                }
            }
            if (b) {
                this.c.g();
            }
            int i = this.c.i;
        } finally {
            this.c.g.readLock().unlock();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AbstractCounter(");
        sb.append(this.a);
        sb.append(")[");
        synchronized (this.d) {
            for (int i = 0; i < this.b.b(); i++) {
                qs qsVar = (qs) this.b.e(i);
                sb.append(this.b.a(i));
                sb.append(" -> [");
                for (int i2 = 0; i2 < qsVar.a(); i2++) {
                    sb.append(qsVar.b(i2));
                    sb.append(" = ");
                    sb.append(((long[]) qsVar.f(i2))[0]);
                    sb.append(", ");
                }
                sb.append("], ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public flq(fma fmaVar, String str) {
        this.c = fmaVar;
        this.d = new Object();
        this.b = new qw();
        this.f = fmaVar.f;
        if (!fmaVar.k.containsKey(str)) {
            this.a = str;
            return;
        }
        throw new IllegalStateException("counter/histogram already exists: ".concat(String.valueOf(str)));
    }
}
