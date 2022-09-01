package j$.time.temporal;

/* JADX WARN: Init of enum JULIAN_DAY can be incorrect */
/* JADX WARN: Init of enum MODIFIED_JULIAN_DAY can be incorrect */
/* JADX WARN: Init of enum RATA_DIE can be incorrect */
/* loaded from: classes3.dex */
enum j implements n {
    JULIAN_DAY("JulianDay", r17, r18, 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", r17, r18, 40587),
    RATA_DIE("RataDie", r17, r18, 719163);
    
    private final transient String a;
    private final transient TemporalUnit b;
    private final transient TemporalUnit c;
    private final transient s d;
    private final transient long e;

    static {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
    }

    j(String str, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, long j) {
        this.a = str;
        this.b = chronoUnit;
        this.c = chronoUnit2;
        this.d = s.i((-365243219162L) + j, 365241780471L + j);
        this.e = j;
    }

    @Override // j$.time.temporal.n
    public final boolean a(m mVar) {
        return mVar.f(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.n
    public final s b(m mVar) {
        if (a(mVar)) {
            return this.d;
        }
        throw new j$.time.c(j$.net.a.a("Unsupported field: ", String.valueOf(this)));
    }

    @Override // j$.time.temporal.n
    public final s c() {
        return this.d;
    }

    @Override // j$.time.temporal.n
    public final long d(m mVar) {
        return mVar.h(a.EPOCH_DAY) + this.e;
    }

    @Override // j$.time.temporal.n
    public final l e(l lVar, long j) {
        if (this.d.h(j)) {
            return lVar.a(j$.desugar.sun.nio.fs.a.k(j, this.e), a.EPOCH_DAY);
        }
        throw new j$.time.c("Invalid value: " + this.a + " " + j);
    }

    @Override // j$.time.temporal.n
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.n
    public final boolean isTimeBased() {
        return false;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
