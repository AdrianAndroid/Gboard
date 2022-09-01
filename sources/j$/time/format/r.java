package j$.time.format;

import j$.time.Instant;
import j$.time.ZoneOffset;
import j$.util.Objects;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class r {
    private j$.time.temporal.m a;
    private DateTimeFormatter b;
    private int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(j$.time.temporal.m mVar, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.g gVar;
        j$.time.temporal.a[] values;
        ZoneOffset zoneOffset;
        Instant m;
        j$.time.chrono.g b = dateTimeFormatter.b();
        j$.time.n e = dateTimeFormatter.e();
        if (b != null || e != null) {
            j$.time.chrono.g gVar2 = (j$.time.chrono.g) mVar.i(j$.time.temporal.p.a());
            j$.time.n nVar = (j$.time.n) mVar.i(j$.time.temporal.p.g());
            j$.time.g gVar3 = null;
            b = Objects.equals(b, gVar2) ? null : b;
            e = Objects.equals(e, nVar) ? null : e;
            if (b != null || e != null) {
                if (b != null) {
                    gVar = b;
                } else {
                    gVar = gVar2;
                }
                if (e != null) {
                    j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
                    if (mVar.f(aVar)) {
                        j$.time.chrono.h hVar = j$.time.chrono.h.a;
                        if (gVar == null) {
                            Objects.a(hVar, "defaultObj");
                        }
                        Instant instant = Instant.EPOCH;
                        if (mVar instanceof Instant) {
                            m = (Instant) mVar;
                        } else {
                            try {
                                m = Instant.m(mVar.h(aVar), mVar.b(j$.time.temporal.a.NANO_OF_SECOND));
                            } catch (j$.time.c e2) {
                                throw new j$.time.c("Unable to obtain Instant from TemporalAccessor: " + String.valueOf(mVar) + " of type " + mVar.getClass().getName(), e2);
                            }
                        }
                        mVar = j$.time.q.l(m, e);
                    } else {
                        ZoneOffset zoneOffset2 = (ZoneOffset) e;
                        j$.time.zone.c g = j$.time.zone.c.g(zoneOffset2);
                        if (g.f()) {
                            zoneOffset = g.b(Instant.EPOCH);
                        } else {
                            zoneOffset = e;
                        }
                        if (zoneOffset instanceof ZoneOffset) {
                            j$.time.temporal.a aVar2 = j$.time.temporal.a.OFFSET_SECONDS;
                            if (mVar.f(aVar2) && mVar.b(aVar2) != j$.time.zone.c.g(zoneOffset2).b(Instant.EPOCH).k()) {
                                throw new j$.time.c("Unable to apply override zone '" + String.valueOf(e) + "' because the temporal object being formatted has a different offset but does not represent an instant: " + String.valueOf(mVar));
                            }
                        }
                    }
                }
                nVar = e != null ? e : nVar;
                if (b != null) {
                    if (mVar.f(j$.time.temporal.a.EPOCH_DAY)) {
                        ((j$.time.chrono.h) gVar).getClass();
                        gVar3 = j$.time.g.m(mVar);
                    } else if (b != j$.time.chrono.h.a || gVar2 != null) {
                        for (j$.time.temporal.a aVar3 : j$.time.temporal.a.values()) {
                            if (aVar3.isDateBased() && mVar.f(aVar3)) {
                                throw new j$.time.c("Unable to apply override chronology '" + String.valueOf(b) + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + String.valueOf(mVar));
                            }
                        }
                    }
                }
                mVar = new q(gVar3, mVar, gVar, nVar);
            }
        }
        this.a = mVar;
        this.b = dateTimeFormatter;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.c--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final u b() {
        return this.b.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Locale c() {
        return this.b.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j$.time.temporal.m d() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Long e(j$.time.temporal.n nVar) {
        if (this.c <= 0 || this.a.f(nVar)) {
            return Long.valueOf(this.a.h(nVar));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object f(j$.time.temporal.q qVar) {
        Object i = this.a.i(qVar);
        if (i == null && this.c == 0) {
            String valueOf = String.valueOf(qVar);
            String valueOf2 = String.valueOf(this.a);
            throw new j$.time.c("Unable to extract " + valueOf + " from temporal " + valueOf2);
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        this.c++;
    }

    public final String toString() {
        return this.a.toString();
    }
}
