package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.util.Objects;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes3.dex */
public final class q implements j$.time.temporal.l, j$.time.chrono.f, Serializable {
    private final LocalDateTime a;
    private final ZoneOffset b;
    private final n c;

    private q(LocalDateTime localDateTime, n nVar, ZoneOffset zoneOffset) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = nVar;
    }

    private static q j(long j, int i, n nVar) {
        ZoneOffset zoneOffset = (ZoneOffset) nVar;
        zoneOffset.getClass();
        ZoneOffset b = j$.time.zone.c.g(zoneOffset).b(Instant.m(j, i));
        return new q(LocalDateTime.r(j, i, b), nVar, b);
    }

    public static q l(Instant instant, n nVar) {
        Objects.a(instant, "instant");
        return j(instant.k(), instant.l(), nVar);
    }

    public static q m(LocalDateTime localDateTime, n nVar, ZoneOffset zoneOffset) {
        Objects.a(localDateTime, "localDateTime");
        Objects.a(nVar, "zone");
        if (nVar instanceof ZoneOffset) {
            return new q(localDateTime, nVar, (ZoneOffset) nVar);
        }
        j$.time.zone.c g = j$.time.zone.c.g((ZoneOffset) nVar);
        List e = g.e(localDateTime);
        if (e.size() == 1) {
            zoneOffset = (ZoneOffset) e.get(0);
        } else if (e.size() == 0) {
            j$.time.zone.a d = g.d(localDateTime);
            localDateTime = localDateTime.t(d.c().getSeconds());
            zoneOffset = d.d();
        } else if (zoneOffset == null || !e.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) e.get(0);
            Objects.a(zoneOffset, "offset");
        }
        return new q(localDateTime, nVar, zoneOffset);
    }

    private q o(LocalDateTime localDateTime) {
        return m(localDateTime, this.c, this.b);
    }

    private q p(ZoneOffset zoneOffset) {
        if (!zoneOffset.equals(this.b)) {
            n nVar = this.c;
            ZoneOffset zoneOffset2 = (ZoneOffset) nVar;
            zoneOffset2.getClass();
            j$.time.zone.c g = j$.time.zone.c.g(zoneOffset2);
            LocalDateTime localDateTime = this.a;
            if (g.e(localDateTime).contains(zoneOffset)) {
                return new q(localDateTime, nVar, zoneOffset);
            }
        }
        return this;
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l a(long j, j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
            int i = p.a[aVar.ordinal()];
            LocalDateTime localDateTime = this.a;
            if (i != 1) {
                if (i != 2) {
                    return o(localDateTime.a(j, nVar));
                }
                return p(ZoneOffset.l(aVar.f(j)));
            }
            return j(j, localDateTime.l(), this.c);
        }
        return (q) nVar.e(this, j);
    }

    @Override // j$.time.temporal.m
    public final int b(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            int i = p.a[((j$.time.temporal.a) nVar).ordinal()];
            if (i == 1) {
                throw new r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            return i != 2 ? this.a.b(nVar) : this.b.k();
        }
        return j$.time.chrono.d.a(this, nVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l c(g gVar) {
        return o(LocalDateTime.q(gVar, this.a.y()));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        q qVar = (q) ((j$.time.chrono.f) obj);
        int i = (q() > qVar.q() ? 1 : (q() == qVar.q() ? 0 : -1));
        if (i == 0) {
            int m = t().m() - qVar.t().m();
            if (m == 0) {
                int compareTo = this.a.compareTo(qVar.a);
                if (compareTo == 0) {
                    int compareTo2 = this.c.j().compareTo(qVar.c.j());
                    if (compareTo2 == 0) {
                        r().getClass();
                        j$.time.chrono.h hVar = j$.time.chrono.h.a;
                        qVar.r().getClass();
                        hVar.getClass();
                        hVar.getClass();
                        return 0;
                    }
                    return compareTo2;
                }
                return compareTo;
            }
            return m;
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
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.a.equals(qVar.a) && this.b.equals(qVar.b) && this.c.equals(qVar.c);
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
            int i = p.a[((j$.time.temporal.a) nVar).ordinal()];
            return i != 1 ? i != 2 ? this.a.h(nVar) : this.b.k() : q();
        }
        return nVar.d(this);
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // j$.time.temporal.m
    public final Object i(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.p.b()) {
            return r();
        }
        if (qVar != j$.time.temporal.p.f() && qVar != j$.time.temporal.p.g()) {
            if (qVar == j$.time.temporal.p.d()) {
                return this.b;
            }
            if (qVar == j$.time.temporal.p.c()) {
                return t();
            }
            if (qVar == j$.time.temporal.p.a()) {
                r().getClass();
                return j$.time.chrono.h.a;
            } else if (qVar == j$.time.temporal.p.e()) {
                return ChronoUnit.NANOS;
            } else {
                return qVar.a(this);
            }
        }
        return this.c;
    }

    public final ZoneOffset k() {
        return this.b;
    }

    @Override // j$.time.temporal.l
    /* renamed from: n */
    public final q e(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            boolean isDateBased = temporalUnit.isDateBased();
            LocalDateTime e = this.a.e(j, temporalUnit);
            if (isDateBased) {
                return o(e);
            }
            Objects.a(e, "localDateTime");
            ZoneOffset zoneOffset = this.b;
            Objects.a(zoneOffset, "offset");
            n nVar = this.c;
            Objects.a(nVar, "zone");
            if (j$.time.zone.c.g((ZoneOffset) nVar).e(e).contains(zoneOffset)) {
                return new q(e, nVar, zoneOffset);
            }
            return j(e.v(zoneOffset), e.l(), nVar);
        }
        return (q) temporalUnit.a(this, j);
    }

    public final long q() {
        return ((r().A() * 86400) + t().v()) - k().k();
    }

    public final g r() {
        return this.a.w();
    }

    public final LocalDateTime s() {
        return this.a;
    }

    public final j t() {
        return this.a.y();
    }

    public final String toString() {
        String localDateTime = this.a.toString();
        ZoneOffset zoneOffset = this.b;
        String str = localDateTime + zoneOffset.toString();
        n nVar = this.c;
        if (zoneOffset != nVar) {
            return str + "[" + nVar.toString() + "]";
        }
        return str;
    }
}
