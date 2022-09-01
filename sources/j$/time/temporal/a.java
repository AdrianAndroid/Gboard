package j$.time.temporal;

/* JADX WARN: Init of enum ALIGNED_DAY_OF_WEEK_IN_MONTH can be incorrect */
/* JADX WARN: Init of enum ALIGNED_DAY_OF_WEEK_IN_YEAR can be incorrect */
/* JADX WARN: Init of enum ALIGNED_WEEK_OF_MONTH can be incorrect */
/* JADX WARN: Init of enum ALIGNED_WEEK_OF_YEAR can be incorrect */
/* JADX WARN: Init of enum AMPM_OF_DAY can be incorrect */
/* JADX WARN: Init of enum CLOCK_HOUR_OF_AMPM can be incorrect */
/* JADX WARN: Init of enum CLOCK_HOUR_OF_DAY can be incorrect */
/* JADX WARN: Init of enum DAY_OF_MONTH can be incorrect */
/* JADX WARN: Init of enum DAY_OF_WEEK can be incorrect */
/* JADX WARN: Init of enum DAY_OF_YEAR can be incorrect */
/* JADX WARN: Init of enum EPOCH_DAY can be incorrect */
/* JADX WARN: Init of enum ERA can be incorrect */
/* JADX WARN: Init of enum HOUR_OF_AMPM can be incorrect */
/* JADX WARN: Init of enum HOUR_OF_DAY can be incorrect */
/* JADX WARN: Init of enum INSTANT_SECONDS can be incorrect */
/* JADX WARN: Init of enum MICRO_OF_DAY can be incorrect */
/* JADX WARN: Init of enum MICRO_OF_SECOND can be incorrect */
/* JADX WARN: Init of enum MILLI_OF_DAY can be incorrect */
/* JADX WARN: Init of enum MILLI_OF_SECOND can be incorrect */
/* JADX WARN: Init of enum MINUTE_OF_DAY can be incorrect */
/* JADX WARN: Init of enum MINUTE_OF_HOUR can be incorrect */
/* JADX WARN: Init of enum MONTH_OF_YEAR can be incorrect */
/* JADX WARN: Init of enum NANO_OF_DAY can be incorrect */
/* JADX WARN: Init of enum NANO_OF_SECOND can be incorrect */
/* JADX WARN: Init of enum OFFSET_SECONDS can be incorrect */
/* JADX WARN: Init of enum PROLEPTIC_MONTH can be incorrect */
/* JADX WARN: Init of enum SECOND_OF_DAY can be incorrect */
/* JADX WARN: Init of enum SECOND_OF_MINUTE can be incorrect */
/* JADX WARN: Init of enum YEAR can be incorrect */
/* JADX WARN: Init of enum YEAR_OF_ERA can be incorrect */
/* loaded from: classes3.dex */
public enum a implements n {
    NANO_OF_SECOND("NanoOfSecond", r12, r21, s.i(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", r12, r3, s.i(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", r26, r21, s.i(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", r26, r3, s.i(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", r26, r21, s.i(0, 999)),
    MILLI_OF_DAY("MilliOfDay", r26, r3, s.i(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", r21, r12, s.i(0, 59), 0),
    SECOND_OF_DAY("SecondOfDay", r21, r3, s.i(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", r12, r30, s.i(0, 59), 0),
    MINUTE_OF_DAY("MinuteOfDay", r12, r3, s.i(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", r30, r31, s.i(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", r30, r31, s.i(1, 12)),
    HOUR_OF_DAY("HourOfDay", r30, r3, s.i(0, 23), 0),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", r30, r3, s.i(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", r31, r3, s.i(0, 1), 0),
    DAY_OF_WEEK("DayOfWeek", r3, r13, s.i(1, 7), 0),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", r3, r13, s.i(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", r3, r13, s.i(1, 7)),
    DAY_OF_MONTH("DayOfMonth", r3, r14, s.j(28, 31), 0),
    DAY_OF_YEAR("DayOfYear", r3, r2, s.j(365, 366)),
    EPOCH_DAY("EpochDay", r3, r6, s.i(-365243219162L, 365241780471L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", r13, r14, s.j(4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", r13, r2, s.i(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", r14, r2, s.i(1, 12), 0),
    PROLEPTIC_MONTH("ProlepticMonth", r14, r6, s.i(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", r2, r6, s.j(999999999, 1000000000)),
    YEAR("Year", r2, r6, s.i(-999999999, 999999999), 0),
    ERA("Era", ChronoUnit.ERAS, r6, s.i(0, 1), 0),
    INSTANT_SECONDS("InstantSeconds", r21, r6, s.i(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", r21, r6, s.i(-64800, 64800));
    
    private final String a;
    private final TemporalUnit b;
    private final TemporalUnit c;
    private final s d;

    static {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
        ChronoUnit chronoUnit2 = ChronoUnit.SECONDS;
        ChronoUnit chronoUnit3 = ChronoUnit.DAYS;
        ChronoUnit chronoUnit4 = ChronoUnit.MICROS;
        ChronoUnit chronoUnit5 = ChronoUnit.MILLIS;
        ChronoUnit chronoUnit6 = ChronoUnit.MINUTES;
        ChronoUnit chronoUnit7 = ChronoUnit.HOURS;
        ChronoUnit chronoUnit8 = ChronoUnit.HALF_DAYS;
        ChronoUnit chronoUnit9 = ChronoUnit.WEEKS;
        ChronoUnit chronoUnit10 = ChronoUnit.MONTHS;
        ChronoUnit chronoUnit11 = ChronoUnit.YEARS;
        ChronoUnit chronoUnit12 = ChronoUnit.FOREVER;
    }

    a(String str, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, s sVar) {
        this.a = str;
        this.b = chronoUnit;
        this.c = chronoUnit2;
        this.d = sVar;
    }

    a(String str, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, s sVar, int i) {
        this.a = str;
        this.b = chronoUnit;
        this.c = chronoUnit2;
        this.d = sVar;
    }

    @Override // j$.time.temporal.n
    public final boolean a(m mVar) {
        return mVar.f(this);
    }

    @Override // j$.time.temporal.n
    public final s b(m mVar) {
        return mVar.d(this);
    }

    @Override // j$.time.temporal.n
    public final s c() {
        return this.d;
    }

    @Override // j$.time.temporal.n
    public final long d(m mVar) {
        return mVar.h(this);
    }

    @Override // j$.time.temporal.n
    public final l e(l lVar, long j) {
        return lVar.a(j, this);
    }

    public final int f(long j) {
        return this.d.a(j, this);
    }

    public final void g(long j) {
        this.d.b(j, this);
    }

    @Override // j$.time.temporal.n
    public final boolean isDateBased() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    @Override // j$.time.temporal.n
    public final boolean isTimeBased() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
