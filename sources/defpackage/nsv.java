package defpackage;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: nsv  reason: default package */
/* loaded from: classes2.dex */
public final class nsv implements Comparable {
    private static final long d;
    private static final long e;
    public final long a;
    public final nxp b;
    private volatile boolean g;
    public static final nxp c = new nxp();
    private static final long f = TimeUnit.SECONDS.toNanos(1);

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        d = nanos;
        e = -nanos;
    }

    private nsv(nxp nxpVar, long j, long j2, byte[] bArr, byte[] bArr2) {
        this.b = nxpVar;
        long min = Math.min(d, Math.max(e, j2));
        this.a = j + min;
        this.g = min <= 0;
    }

    public static void e(Object obj, Object obj2) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException((String) obj2);
    }

    public static nsv f(long j, TimeUnit timeUnit, nxp nxpVar) {
        e(timeUnit, "units");
        return new nsv(nxpVar, System.nanoTime(), timeUnit.toNanos(j), null, null);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(nsv nsvVar) {
        c(nsvVar);
        long j = this.a - nsvVar.a;
        if (j < 0) {
            return -1;
        }
        return j > 0 ? 1 : 0;
    }

    public final long b(TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        if (!this.g && this.a - nanoTime <= 0) {
            this.g = true;
        }
        return timeUnit.convert(this.a - nanoTime, TimeUnit.NANOSECONDS);
    }

    public final void c(nsv nsvVar) {
        if (this.b == nsvVar.b) {
            return;
        }
        throw new AssertionError("Tickers (" + this.b + " and " + nsvVar.b + ") don't match. Custom Ticker should only be used in tests!");
    }

    public final boolean d() {
        if (!this.g) {
            if (this.a - System.nanoTime() > 0) {
                return false;
            }
            this.g = true;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nsv)) {
            return false;
        }
        nsv nsvVar = (nsv) obj;
        return this.b == nsvVar.b && this.a == nsvVar.a;
    }

    public final int hashCode() {
        return Arrays.asList(this.b, Long.valueOf(this.a)).hashCode();
    }

    public final String toString() {
        long b = b(TimeUnit.NANOSECONDS);
        long abs = Math.abs(b);
        long j = f;
        long j2 = abs / j;
        long abs2 = Math.abs(b) % j;
        StringBuilder sb = new StringBuilder();
        if (b < 0) {
            sb.append('-');
        }
        sb.append(j2);
        if (abs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        }
        sb.append("s from now");
        if (this.b != c) {
            sb.append(" (ticker=" + this.b + ")");
        }
        return sb.toString();
    }
}
