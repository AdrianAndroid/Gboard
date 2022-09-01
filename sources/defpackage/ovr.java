package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: ovr  reason: default package */
/* loaded from: classes2.dex */
public class ovr {
    public static final ovr h = new ovq();
    private boolean a;
    private long b;
    private long c;

    public ovr f(long j, TimeUnit timeUnit) {
        oll.e(timeUnit, "unit");
        if (j >= 0) {
            this.c = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException("timeout < 0: " + j);
    }

    public void g() {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.a && this.b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public boolean h() {
        return this.a;
    }

    public final void i(Object obj) {
        try {
            boolean h2 = h();
            long n = n();
            long j = 0;
            if (!h2 && n == 0) {
                obj.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (h2 && n != 0) {
                n = Math.min(n, j() - nanoTime);
            } else if (h2) {
                n = j() - nanoTime;
            }
            if (n > 0) {
                long j2 = n / 1000000;
                Long.signum(j2);
                obj.wait(j2, (int) (n - (1000000 * j2)));
                j = System.nanoTime() - nanoTime;
            }
            if (j >= n) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public long j() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public ovr k() {
        this.a = false;
        return this;
    }

    public ovr l() {
        this.c = 0L;
        return this;
    }

    public ovr m(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public long n() {
        return this.c;
    }
}
