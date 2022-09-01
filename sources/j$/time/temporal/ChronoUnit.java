package j$.time.temporal;

import com.google.android.libraries.inputmethod.staticflag.AllFlags;
import j$.time.Duration;

/* loaded from: classes3.dex */
public enum ChronoUnit implements TemporalUnit {
    NANOS("Nanos", Duration.d(1)),
    MICROS("Micros", Duration.d(1000)),
    MILLIS("Millis", Duration.d(1000000)),
    SECONDS("Seconds", Duration.ofSeconds(1)),
    MINUTES("Minutes", Duration.ofSeconds(60)),
    HOURS("Hours", Duration.ofSeconds(3600)),
    HALF_DAYS("HalfDays", Duration.ofSeconds(AllFlags.CRASHRECOVERYEFFECTIVETIMEINSECONDS)),
    DAYS("Days", Duration.ofSeconds(86400)),
    WEEKS("Weeks", Duration.ofSeconds(604800)),
    MONTHS("Months", Duration.ofSeconds(2629746)),
    YEARS("Years", Duration.ofSeconds(31556952)),
    DECADES("Decades", Duration.ofSeconds(315569520)),
    CENTURIES("Centuries", Duration.ofSeconds(3155695200L)),
    MILLENNIA("Millennia", Duration.ofSeconds(31556952000L)),
    ERAS("Eras", Duration.ofSeconds(31556952000000000L)),
    FOREVER("Forever", Duration.e(Long.MAX_VALUE, 999999999));
    
    private final String a;
    private final Duration b;

    ChronoUnit(String str, Duration duration) {
        this.a = str;
        this.b = duration;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final l a(l lVar, long j) {
        return lVar.e(j, this);
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Duration getDuration() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final boolean isDateBased() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
