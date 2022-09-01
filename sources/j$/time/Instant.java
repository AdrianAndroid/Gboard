package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.r;
import j$.time.temporal.s;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class Instant implements j$.time.temporal.l, Comparable<Instant>, Serializable {
    public static final Instant EPOCH = new Instant(0, 0);
    private final long a;
    private final int b;

    static {
        m(-31557014167219200L, 0L);
        m(31556889864403199L, 999999999L);
    }

    private Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    private static Instant j(long j, int i) {
        if ((i | j) == 0) {
            return EPOCH;
        }
        if (j >= -31557014167219200L && j <= 31556889864403199L) {
            return new Instant(j, i);
        }
        throw new c("Instant exceeds minimum or maximum instant");
    }

    public static Instant m(long j, long j2) {
        return j(j$.desugar.sun.nio.fs.a.j(j, j$.desugar.sun.nio.fs.a.e(j2, 1000000000L)), (int) j$.desugar.sun.nio.fs.a.i(j2, 1000000000L));
    }

    private Instant n(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return m(j$.desugar.sun.nio.fs.a.j(j$.desugar.sun.nio.fs.a.j(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    public static Instant now() {
        a.b.getClass();
        return ofEpochMilli(System.currentTimeMillis());
    }

    public static Instant ofEpochMilli(long j) {
        long j2 = 1000;
        return j(j$.desugar.sun.nio.fs.a.e(j, j2), ((int) j$.desugar.sun.nio.fs.a.i(j, j2)) * 1000000);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r7 != r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
        if (r7 != r4) goto L22;
     */
    @Override // j$.time.temporal.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.temporal.l a(long r6, j$.time.temporal.n r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof j$.time.temporal.a
            if (r0 == 0) goto L57
            r0 = r8
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            r0.g(r6)
            int[] r1 = j$.time.e.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            long r2 = r5.a
            int r4 = r5.b
            if (r0 == r1) goto L4a
            r1 = 2
            if (r0 == r1) goto L44
            r1 = 3
            if (r0 == r1) goto L3b
            r1 = 4
            if (r0 != r1) goto L2b
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 == 0) goto L55
            j$.time.Instant r6 = j(r6, r4)
            goto L5d
        L2b:
            j$.time.temporal.r r6 = new j$.time.temporal.r
            java.lang.String r7 = java.lang.String.valueOf(r8)
            java.lang.String r8 = "Unsupported field: "
            java.lang.String r7 = j$.net.a.a(r8, r7)
            r6.<init>(r7)
            throw r6
        L3b:
            int r7 = (int) r6
            r6 = 1000000(0xf4240, float:1.401298E-39)
            int r7 = r7 * r6
            if (r7 == r4) goto L55
            goto L50
        L44:
            int r7 = (int) r6
            int r7 = r7 * 1000
            if (r7 == r4) goto L55
            goto L50
        L4a:
            long r0 = (long) r4
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 == 0) goto L55
            int r7 = (int) r6
        L50:
            j$.time.Instant r6 = j(r2, r7)
            goto L5d
        L55:
            r6 = r5
            goto L5d
        L57:
            j$.time.temporal.l r6 = r8.e(r5, r6)
            j$.time.Instant r6 = (j$.time.Instant) r6
        L5d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.Instant.a(long, j$.time.temporal.n):j$.time.temporal.l");
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.k(this, zoneOffset);
    }

    @Override // j$.time.temporal.m
    public final int b(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            int i = e.a[((j$.time.temporal.a) nVar).ordinal()];
            int i2 = this.b;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            j$.time.temporal.a.INSTANT_SECONDS.f(this.a);
                        }
                        throw new r(j$.net.a.a("Unsupported field: ", String.valueOf(nVar)));
                    }
                    return i2 / 1000000;
                }
                return i2 / 1000;
            }
            return i2;
        }
        return j$.desugar.sun.nio.fs.a.c(this, nVar).a(nVar.d(this), nVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l c(g gVar) {
        return (Instant) gVar.j(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int i = (this.a > instant2.a ? 1 : (this.a == instant2.a ? 0 : -1));
        if (i == 0) {
            return this.b - instant2.b;
        }
        return i;
    }

    @Override // j$.time.temporal.m
    public final s d(j$.time.temporal.n nVar) {
        return j$.desugar.sun.nio.fs.a.c(this, nVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.a == instant.a && this.b == instant.b;
    }

    @Override // j$.time.temporal.m
    public final boolean f(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.INSTANT_SECONDS || nVar == j$.time.temporal.a.NANO_OF_SECOND || nVar == j$.time.temporal.a.MICRO_OF_SECOND || nVar == j$.time.temporal.a.MILLI_OF_SECOND : nVar != null && nVar.a(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l g(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.m
    public final long h(j$.time.temporal.n nVar) {
        int i;
        if (nVar instanceof j$.time.temporal.a) {
            int i2 = e.a[((j$.time.temporal.a) nVar).ordinal()];
            int i3 = this.b;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            return this.a;
                        }
                        throw new r(j$.net.a.a("Unsupported field: ", String.valueOf(nVar)));
                    }
                    i = i3 / 1000000;
                } else {
                    i = i3 / 1000;
                }
                return i;
            }
            return i3;
        }
        return nVar.d(this);
    }

    public final int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    @Override // j$.time.temporal.m
    public final Object i(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.p.e()) {
            return ChronoUnit.NANOS;
        }
        if (qVar != j$.time.temporal.p.a() && qVar != j$.time.temporal.p.g() && qVar != j$.time.temporal.p.f() && qVar != j$.time.temporal.p.d() && qVar != j$.time.temporal.p.b() && qVar != j$.time.temporal.p.c()) {
            return qVar.a(this);
        }
        return null;
    }

    public boolean isAfter(Instant instant) {
        int i = (this.a > instant.a ? 1 : (this.a == instant.a ? 0 : -1));
        if (i == 0) {
            i = this.b - instant.b;
        }
        return i > 0;
    }

    public boolean isBefore(Instant instant) {
        int i = (this.a > instant.a ? 1 : (this.a == instant.a ? 0 : -1));
        if (i == 0) {
            i = this.b - instant.b;
        }
        return i < 0;
    }

    public final long k() {
        return this.a;
    }

    public final int l() {
        return this.b;
    }

    public Instant minus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.b(this);
    }

    @Override // j$.time.temporal.l
    /* renamed from: o */
    public final Instant e(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (e.b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return n(0L, j);
                case 2:
                    return n(j / 1000000, (j % 1000000) * 1000);
                case 3:
                    return n(j / 1000, (j % 1000) * 1000000);
                case 4:
                    return n(j, 0L);
                case 5:
                    return n(j$.desugar.sun.nio.fs.a.h(j, 60), 0L);
                case 6:
                    return n(j$.desugar.sun.nio.fs.a.h(j, 3600), 0L);
                case 7:
                    return n(j$.desugar.sun.nio.fs.a.h(j, 43200), 0L);
                case 8:
                    return n(j$.desugar.sun.nio.fs.a.h(j, 86400), 0L);
                default:
                    throw new r(j$.net.a.a("Unsupported unit: ", String.valueOf(temporalUnit)));
            }
        }
        return (Instant) temporalUnit.a(this, j);
    }

    public Instant plus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.a(this);
    }

    public long toEpochMilli() {
        long h;
        int i;
        int i2 = this.b;
        long j = this.a;
        if (j < 0 && i2 > 0) {
            h = j$.desugar.sun.nio.fs.a.h(j + 1, 1000);
            i = (i2 / 1000000) - 1000;
        } else {
            h = j$.desugar.sun.nio.fs.a.h(j, 1000);
            i = i2 / 1000000;
        }
        return j$.desugar.sun.nio.fs.a.j(h, i);
    }

    public final String toString() {
        return DateTimeFormatter.f.a(this);
    }

    public Instant truncatedTo(TemporalUnit temporalUnit) {
        if (temporalUnit == ChronoUnit.NANOS) {
            return this;
        }
        Duration duration = temporalUnit.getDuration();
        if (duration.getSeconds() <= 86400) {
            long f = duration.f();
            if (86400000000000L % f == 0) {
                long j = ((this.a % 86400) * 1000000000) + this.b;
                return n(0L, (j$.desugar.sun.nio.fs.a.e(j, f) * f) - j);
            }
            throw new r("Unit must divide into a standard day without remainder");
        }
        throw new r("Unit is too large to be used for truncation");
    }
}
