package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.s;
import j$.util.Objects;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class LocalDateTime implements j$.time.temporal.l, j$.time.chrono.c, Serializable {
    public static final LocalDateTime c = q(g.d, j.e);
    public static final LocalDateTime d = q(g.e, j.f);
    private final g a;
    private final j b;

    private LocalDateTime(g gVar, j jVar) {
        this.a = gVar;
        this.b = jVar;
    }

    private LocalDateTime B(g gVar, j jVar) {
        return (this.a == gVar && this.b == jVar) ? this : new LocalDateTime(gVar, jVar);
    }

    private int k(LocalDateTime localDateTime) {
        int l = this.a.l(localDateTime.a);
        if (l == 0) {
            return this.b.compareTo(localDateTime.b);
        }
        return l;
    }

    public static LocalDateTime q(g gVar, j jVar) {
        Objects.a(gVar, "date");
        Objects.a(jVar, "time");
        return new LocalDateTime(gVar, jVar);
    }

    public static LocalDateTime r(long j, int i, ZoneOffset zoneOffset) {
        long k;
        long j2;
        Objects.a(zoneOffset, "offset");
        long j3 = i;
        j$.time.temporal.a.NANO_OF_SECOND.g(j3);
        return new LocalDateTime(g.u(j$.desugar.sun.nio.fs.a.e(j + zoneOffset.k(), 86400)), j.o((((int) j$.desugar.sun.nio.fs.a.i(k, j2)) * 1000000000) + j3));
    }

    private LocalDateTime u(g gVar, long j, long j2, long j3, long j4) {
        j jVar = this.b;
        if ((j | j2 | j3 | j4) == 0) {
            return B(gVar, jVar);
        }
        long j5 = j / 24;
        long j6 = j5 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long j7 = 1;
        long j8 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long u = jVar.u();
        long j9 = (j8 * j7) + u;
        long e = j$.desugar.sun.nio.fs.a.e(j9, 86400000000000L) + (j6 * j7);
        long i = j$.desugar.sun.nio.fs.a.i(j9, 86400000000000L);
        if (i != u) {
            jVar = j.o(i);
        }
        return B(gVar.w(e), jVar);
    }

    @Override // j$.time.temporal.l
    /* renamed from: A */
    public final LocalDateTime c(g gVar) {
        return B(gVar, this.b);
    }

    @Override // j$.time.temporal.m
    public final int b(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).isTimeBased() ? this.b.b(nVar) : this.a.b(nVar) : j$.desugar.sun.nio.fs.a.a(this, nVar);
    }

    @Override // j$.time.temporal.m
    public final s d(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) nVar).isTimeBased()) {
                j jVar = this.b;
                jVar.getClass();
                return j$.desugar.sun.nio.fs.a.c(jVar, nVar);
            }
            return this.a.d(nVar);
        }
        return nVar.b(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDateTime)) {
            return false;
        }
        LocalDateTime localDateTime = (LocalDateTime) obj;
        return this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b);
    }

    @Override // j$.time.temporal.m
    public final boolean f(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar != null && nVar.a(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        return aVar.isDateBased() || aVar.isTimeBased();
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.a(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l g(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.m
    public final long h(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).isTimeBased() ? this.b.h(nVar) : this.a.h(nVar) : nVar.d(this);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.m
    public final Object i(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.p.b()) {
            return this.a;
        }
        if (qVar != j$.time.temporal.p.g() && qVar != j$.time.temporal.p.f() && qVar != j$.time.temporal.p.d()) {
            if (qVar == j$.time.temporal.p.c()) {
                return this.b;
            }
            if (qVar == j$.time.temporal.p.a()) {
                ((g) x()).getClass();
                return j$.time.chrono.h.a;
            } else if (qVar == j$.time.temporal.p.e()) {
                return ChronoUnit.NANOS;
            } else {
                return qVar.a(this);
            }
        }
        return null;
    }

    @Override // java.lang.Comparable
    /* renamed from: j */
    public final int compareTo(j$.time.chrono.c cVar) {
        if (cVar instanceof LocalDateTime) {
            return k((LocalDateTime) cVar);
        }
        LocalDateTime localDateTime = (LocalDateTime) cVar;
        int compareTo = this.a.compareTo(localDateTime.a);
        if (compareTo == 0) {
            int compareTo2 = this.b.compareTo(localDateTime.b);
            if (compareTo2 == 0) {
                ((g) x()).getClass();
                j$.time.chrono.h hVar = j$.time.chrono.h.a;
                ((g) localDateTime.x()).getClass();
                hVar.getClass();
                hVar.getClass();
                return 0;
            }
            return compareTo2;
        }
        return compareTo;
    }

    public final int l() {
        return this.b.m();
    }

    public final int m() {
        return this.b.n();
    }

    public final int n() {
        return this.a.q();
    }

    public final boolean o(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            if (k(localDateTime) > 0) {
                return true;
            }
            return false;
        }
        long A = this.a.A();
        long A2 = localDateTime.a.A();
        if (A > A2) {
            return true;
        }
        if (A == A2 && this.b.u() > localDateTime.b.u()) {
            return true;
        }
        return false;
    }

    public final boolean p(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            if (k(localDateTime) < 0) {
                return true;
            }
            return false;
        }
        long A = this.a.A();
        long A2 = localDateTime.a.A();
        if (A < A2) {
            return true;
        }
        if (A == A2 && this.b.u() < localDateTime.b.u()) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.l
    /* renamed from: s */
    public final LocalDateTime e(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            int i = h.a[((ChronoUnit) temporalUnit).ordinal()];
            j jVar = this.b;
            g gVar = this.a;
            switch (i) {
                case 1:
                    return u(this.a, 0L, 0L, 0L, j);
                case 2:
                    LocalDateTime B = B(gVar.w(j / 86400000000L), jVar);
                    return B.u(B.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
                case 3:
                    LocalDateTime B2 = B(gVar.w(j / 86400000), jVar);
                    return B2.u(B2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
                case 4:
                    return t(j);
                case 5:
                    return u(this.a, 0L, j, 0L, 0L);
                case 6:
                    return u(this.a, j, 0L, 0L, 0L);
                case 7:
                    LocalDateTime B3 = B(gVar.w(j / 256), jVar);
                    return B3.u(B3.a, (j % 256) * 12, 0L, 0L, 0L);
                default:
                    return B(gVar.e(j, temporalUnit), jVar);
            }
        }
        return (LocalDateTime) temporalUnit.a(this, j);
    }

    public final LocalDateTime t(long j) {
        return u(this.a, 0L, 0L, j, 0L);
    }

    public final String toString() {
        String gVar = this.a.toString();
        String jVar = this.b.toString();
        return gVar + "T" + jVar;
    }

    public final long v(ZoneOffset zoneOffset) {
        Objects.a(zoneOffset, "offset");
        return ((this.a.A() * 86400) + this.b.v()) - zoneOffset.k();
    }

    public final g w() {
        return this.a;
    }

    public final j$.time.chrono.b x() {
        return this.a;
    }

    public final j y() {
        return this.b;
    }

    @Override // j$.time.temporal.l
    /* renamed from: z */
    public final LocalDateTime a(long j, j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            boolean isTimeBased = ((j$.time.temporal.a) nVar).isTimeBased();
            j jVar = this.b;
            g gVar = this.a;
            return isTimeBased ? B(gVar, jVar.a(j, nVar)) : B(gVar.a(j, nVar), jVar);
        }
        return (LocalDateTime) nVar.e(this, j);
    }
}
