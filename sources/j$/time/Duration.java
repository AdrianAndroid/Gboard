package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAmount;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public final class Duration implements TemporalAmount, Comparable<Duration>, Serializable {
    public static final Duration ZERO = new Duration(0, 0);
    private static final BigInteger c = BigInteger.valueOf(1000000000);
    private final long a;
    private final int b;

    private Duration(long j, int i) {
        this.a = j;
        this.b = i;
    }

    private static Duration c(long j, int i) {
        return (((long) i) | j) == 0 ? ZERO : new Duration(j, i);
    }

    public static Duration d(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (i + 1000000000);
            j2--;
        }
        return c(j2, i);
    }

    public static Duration e(long j, long j2) {
        return c(j$.desugar.sun.nio.fs.a.j(j, j$.desugar.sun.nio.fs.a.e(j2, 1000000000L)), (int) j$.desugar.sun.nio.fs.a.i(j2, 1000000000L));
    }

    public static Duration ofDays(long j) {
        return c(j$.desugar.sun.nio.fs.a.h(j, 86400), 0);
    }

    public static Duration ofHours(long j) {
        return c(j$.desugar.sun.nio.fs.a.h(j, 3600), 0);
    }

    public static Duration ofMillis(long j) {
        long j2 = j / 1000;
        int i = (int) (j % 1000);
        if (i < 0) {
            i += 1000;
            j2--;
        }
        return c(j2, i * 1000000);
    }

    public static Duration ofMinutes(long j) {
        return c(j$.desugar.sun.nio.fs.a.h(j, 60), 0);
    }

    public static Duration ofSeconds(long j) {
        return c(j, 0);
    }

    @Override // j$.time.temporal.TemporalAmount
    public final j$.time.temporal.l a(j$.time.temporal.l lVar) {
        long j = this.a;
        if (j != 0) {
            lVar = lVar.e(j, ChronoUnit.SECONDS);
        }
        int i = this.b;
        return i != 0 ? lVar.e(i, ChronoUnit.NANOS) : lVar;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final j$.time.temporal.l b(j$.time.temporal.l lVar) {
        long j = this.a;
        if (j != 0) {
            lVar = lVar.g(j, ChronoUnit.SECONDS);
        }
        int i = this.b;
        return i != 0 ? lVar.g(i, ChronoUnit.NANOS) : lVar;
    }

    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        int i = (this.a > duration.a ? 1 : (this.a == duration.a ? 0 : -1));
        return i != 0 ? i : this.b - duration.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) obj;
        return this.a == duration.a && this.b == duration.b;
    }

    public final long f() {
        long j = this.b;
        long j2 = this.a;
        if (j2 < 0) {
            j2++;
            j -= 1000000000;
        }
        return j$.desugar.sun.nio.fs.a.j(j$.desugar.sun.nio.fs.a.h(j2, 1000000000L), j);
    }

    public long getSeconds() {
        return this.a;
    }

    public final int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public boolean isZero() {
        return (((long) this.b) | this.a) == 0;
    }

    public Duration multipliedBy(long j) {
        if (j == 0) {
            return ZERO;
        }
        if (j == 1) {
            return this;
        }
        BigInteger bigIntegerExact = BigDecimal.valueOf(this.a).add(BigDecimal.valueOf(this.b, 9)).multiply(BigDecimal.valueOf(j)).movePointRight(9).toBigIntegerExact();
        BigInteger[] divideAndRemainder = bigIntegerExact.divideAndRemainder(c);
        if (divideAndRemainder[0].bitLength() <= 63) {
            return e(divideAndRemainder[0].longValue(), divideAndRemainder[1].intValue());
        }
        throw new ArithmeticException(j$.net.a.a("Exceeds capacity of Duration: ", String.valueOf(bigIntegerExact)));
    }

    public Duration plus(Duration duration) {
        long seconds = duration.getSeconds();
        long j = duration.b;
        if ((seconds | j) == 0) {
            return this;
        }
        return e(j$.desugar.sun.nio.fs.a.j(j$.desugar.sun.nio.fs.a.j(this.a, seconds), j / 1000000000), this.b + (j % 1000000000));
    }

    public long toMillis() {
        long j = this.b;
        long j2 = this.a;
        if (j2 < 0) {
            j2++;
            j -= 1000000000;
        }
        return j$.desugar.sun.nio.fs.a.j(j$.desugar.sun.nio.fs.a.h(j2, 1000), j / 1000000);
    }

    public long toMinutes() {
        return this.a / 60;
    }

    public long toSeconds() {
        return this.a;
    }

    public final String toString() {
        if (this == ZERO) {
            return "PT0S";
        }
        long j = this.a;
        int i = this.b;
        long j2 = (j >= 0 || i <= 0) ? j : 1 + j;
        long j3 = j2 / 3600;
        int i2 = (int) ((j2 % 3600) / 60);
        int i3 = (int) (j2 % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j3 != 0) {
            sb.append(j3);
            sb.append('H');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i3 == 0 && i == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (j >= 0 || i <= 0 || i3 != 0) {
            sb.append(i3);
        } else {
            sb.append("-0");
        }
        if (i > 0) {
            int length = sb.length();
            sb.append(j < 0 ? 2000000000 - i : i + 1000000000);
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }
}
