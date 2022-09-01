package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes3.dex */
enum h implements TemporalUnit {
    WEEK_BASED_YEARS("WeekBasedYears", Duration.ofSeconds(31556952)),
    QUARTER_YEARS("QuarterYears", Duration.ofSeconds(7889238));
    
    private final String a;
    private final Duration b;

    h(String str, Duration duration) {
        this.a = str;
        this.b = duration;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final l a(l lVar, long j) {
        int i = b.a[ordinal()];
        if (i == 1) {
            n nVar = i.c;
            return lVar.a(j$.desugar.sun.nio.fs.a.j(lVar.b(nVar), j), nVar);
        } else if (i != 2) {
            throw new IllegalStateException("Unreachable");
        } else {
            return lVar.e(j / 4, ChronoUnit.YEARS).e((j % 4) * 3, ChronoUnit.MONTHS);
        }
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Duration getDuration() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final boolean isDateBased() {
        return true;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
