package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.util.Objects;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class OffsetDateTime implements j$.time.temporal.l, Comparable<OffsetDateTime>, Serializable {
    private final LocalDateTime a;
    private final ZoneOffset b;

    static {
        LocalDateTime localDateTime = LocalDateTime.c;
        ZoneOffset zoneOffset = ZoneOffset.f;
        localDateTime.getClass();
        j(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.d;
        ZoneOffset zoneOffset2 = ZoneOffset.e;
        localDateTime2.getClass();
        j(localDateTime2, zoneOffset2);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.a(localDateTime, "dateTime");
        this.a = localDateTime;
        Objects.a(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    public static OffsetDateTime j(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime k(Instant instant, n nVar) {
        Objects.a(instant, "instant");
        Objects.a(nVar, "zone");
        ZoneOffset b = j$.time.zone.c.g((ZoneOffset) nVar).b(instant);
        return new OffsetDateTime(LocalDateTime.r(instant.k(), instant.l(), b), b);
    }

    private OffsetDateTime m(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.a != localDateTime || !this.b.equals(zoneOffset)) ? new OffsetDateTime(localDateTime, zoneOffset) : this;
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l a(long j, j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
            int i = m.a[aVar.ordinal()];
            ZoneOffset zoneOffset = this.b;
            LocalDateTime localDateTime = this.a;
            if (i != 1) {
                if (i != 2) {
                    return m(localDateTime.a(j, nVar), zoneOffset);
                }
                return m(localDateTime, ZoneOffset.l(aVar.f(j)));
            }
            return k(Instant.m(j, localDateTime.l()), zoneOffset);
        }
        return (OffsetDateTime) nVar.e(this, j);
    }

    @Override // j$.time.temporal.m
    public final int b(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            int i = m.a[((j$.time.temporal.a) nVar).ordinal()];
            if (i == 1) {
                throw new r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            return i != 2 ? this.a.b(nVar) : this.b.k();
        }
        return j$.desugar.sun.nio.fs.a.a(this, nVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l c(g gVar) {
        return m(this.a.c(gVar), this.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int i;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        ZoneOffset zoneOffset = offsetDateTime2.b;
        ZoneOffset zoneOffset2 = this.b;
        if (zoneOffset2.equals(zoneOffset)) {
            i = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.a;
            long v = localDateTime.v(zoneOffset2);
            ZoneOffset zoneOffset3 = offsetDateTime2.b;
            LocalDateTime localDateTime2 = offsetDateTime2.a;
            int i2 = (v > localDateTime2.v(zoneOffset3) ? 1 : (v == localDateTime2.v(zoneOffset3) ? 0 : -1));
            if (i2 == 0) {
                i = localDateTime.y().m() - localDateTime2.y().m();
            } else {
                i = i2;
            }
        }
        if (i == 0) {
            return toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        }
        return i;
    }

    @Override // j$.time.temporal.m
    public final s d(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? (nVar == j$.time.temporal.a.INSTANT_SECONDS || nVar == j$.time.temporal.a.OFFSET_SECONDS) ? nVar.c() : this.a.d(nVar) : nVar.b(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetDateTime)) {
            return false;
        }
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        return this.a.equals(offsetDateTime.a) && this.b.equals(offsetDateTime.b);
    }

    @Override // j$.time.temporal.m
    public final boolean f(j$.time.temporal.n nVar) {
        return (nVar instanceof j$.time.temporal.a) || (nVar != null && nVar.a(this));
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l g(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.m
    public final long h(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            int i = m.a[((j$.time.temporal.a) nVar).ordinal()];
            ZoneOffset zoneOffset = this.b;
            LocalDateTime localDateTime = this.a;
            if (i != 1) {
                if (i != 2) {
                    return localDateTime.h(nVar);
                }
                return zoneOffset.k();
            }
            return localDateTime.v(zoneOffset);
        }
        return nVar.d(this);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.m
    public final Object i(j$.time.temporal.q qVar) {
        if (qVar != j$.time.temporal.p.d() && qVar != j$.time.temporal.p.f()) {
            if (qVar == j$.time.temporal.p.g()) {
                return null;
            }
            j$.time.temporal.q b = j$.time.temporal.p.b();
            LocalDateTime localDateTime = this.a;
            if (qVar == b) {
                return localDateTime.w();
            }
            if (qVar == j$.time.temporal.p.c()) {
                return localDateTime.y();
            }
            if (qVar == j$.time.temporal.p.a()) {
                return j$.time.chrono.h.a;
            }
            if (qVar == j$.time.temporal.p.e()) {
                return ChronoUnit.NANOS;
            }
            return qVar.a(this);
        }
        return this.b;
    }

    @Override // j$.time.temporal.l
    /* renamed from: l */
    public final OffsetDateTime e(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? m(this.a.e(j, temporalUnit), this.b) : (OffsetDateTime) temporalUnit.a(this, j);
    }

    public LocalDateTime toLocalDateTime() {
        return this.a;
    }

    public final String toString() {
        String localDateTime = this.a.toString();
        String zoneOffset = this.b.toString();
        return localDateTime + zoneOffset;
    }
}
