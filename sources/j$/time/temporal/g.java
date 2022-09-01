package j$.time.temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes3.dex */
abstract class g extends Enum implements n {
    public static final g DAY_OF_QUARTER;
    public static final g QUARTER_OF_YEAR;
    public static final g WEEK_BASED_YEAR;
    public static final g WEEK_OF_WEEK_BASED_YEAR;
    private static final int[] a = {0, 90, 181, 273, 0, 91, 182, 274};
    private static final /* synthetic */ g[] b;

    static {
        g gVar = new g() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.n
            public final boolean a(m mVar) {
                return mVar.f(a.DAY_OF_YEAR) && mVar.f(a.MONTH_OF_YEAR) && mVar.f(a.YEAR) && i.a(mVar);
            }

            @Override // j$.time.temporal.n
            public final s b(m mVar) {
                if (a(mVar)) {
                    long h = mVar.h(g.QUARTER_OF_YEAR);
                    if (h != 1) {
                        return h == 2 ? s.i(1L, 91L) : (h == 3 || h == 4) ? s.i(1L, 92L) : c();
                    }
                    long h2 = mVar.h(a.YEAR);
                    j$.time.chrono.h.a.getClass();
                    return j$.time.chrono.h.a(h2) ? s.i(1L, 91L) : s.i(1L, 90L);
                }
                throw new r("Unsupported field: DayOfQuarter");
            }

            @Override // j$.time.temporal.n
            public final s c() {
                return s.j(90L, 92L);
            }

            @Override // j$.time.temporal.n
            public final long d(m mVar) {
                int[] iArr;
                if (a(mVar)) {
                    int b2 = mVar.b(a.DAY_OF_YEAR);
                    int b3 = mVar.b(a.MONTH_OF_YEAR);
                    long h = mVar.h(a.YEAR);
                    iArr = g.a;
                    int i = (b3 - 1) / 3;
                    j$.time.chrono.h.a.getClass();
                    return b2 - iArr[i + (j$.time.chrono.h.a(h) ? 4 : 0)];
                }
                throw new r("Unsupported field: DayOfQuarter");
            }

            @Override // j$.time.temporal.n
            public final l e(l lVar, long j) {
                long d = d(lVar);
                c().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return lVar.a((j - d) + lVar.h(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = gVar;
        g gVar2 = new g() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.n
            public final boolean a(m mVar) {
                return mVar.f(a.MONTH_OF_YEAR) && i.a(mVar);
            }

            @Override // j$.time.temporal.n
            public final s b(m mVar) {
                if (a(mVar)) {
                    return c();
                }
                throw new r("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.n
            public final s c() {
                return s.i(1L, 4L);
            }

            @Override // j$.time.temporal.n
            public final long d(m mVar) {
                if (a(mVar)) {
                    return (mVar.h(a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new r("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.n
            public final l e(l lVar, long j) {
                long d = d(lVar);
                c().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return lVar.a(((j - d) * 3) + lVar.h(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = gVar2;
        g gVar3 = new g() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.n
            public final boolean a(m mVar) {
                return mVar.f(a.EPOCH_DAY) && i.a(mVar);
            }

            @Override // j$.time.temporal.n
            public final s b(m mVar) {
                if (a(mVar)) {
                    return g.j(j$.time.g.m(mVar));
                }
                throw new r("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.n
            public final s c() {
                return s.j(52L, 53L);
            }

            @Override // j$.time.temporal.n
            public final long d(m mVar) {
                if (a(mVar)) {
                    return g.g(j$.time.g.m(mVar));
                }
                throw new r("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.n
            public final l e(l lVar, long j) {
                c().b(j, this);
                return lVar.e(j$.desugar.sun.nio.fs.a.k(j, d(lVar)), ChronoUnit.WEEKS);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = gVar3;
        g gVar4 = new g() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.n
            public final boolean a(m mVar) {
                return mVar.f(a.EPOCH_DAY) && i.a(mVar);
            }

            @Override // j$.time.temporal.n
            public final s b(m mVar) {
                if (a(mVar)) {
                    return c();
                }
                throw new r("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.n
            public final s c() {
                return a.YEAR.c();
            }

            @Override // j$.time.temporal.n
            public final long d(m mVar) {
                int k;
                if (a(mVar)) {
                    k = g.k(j$.time.g.m(mVar));
                    return k;
                }
                throw new r("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.n
            public final l e(l lVar, long j) {
                int l;
                if (a(lVar)) {
                    int a2 = c().a(j, g.WEEK_BASED_YEAR);
                    j$.time.g m = j$.time.g.m(lVar);
                    a aVar = a.DAY_OF_WEEK;
                    int b2 = m.b(aVar);
                    int g = g.g(m);
                    if (g == 53) {
                        l = g.l(a2);
                        if (l == 52) {
                            g = 52;
                        }
                    }
                    j$.time.g t = j$.time.g.t(a2, 1, 4);
                    return lVar.c(t.w(((g - 1) * 7) + (b2 - t.b(aVar))));
                }
                throw new r("Unsupported field: WeekBasedYear");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = gVar4;
        b = new g[]{gVar, gVar2, gVar3, gVar4};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
        if (r5 == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int g(j$.time.g r5) {
        /*
            j$.time.d r0 = r5.o()
            int r0 = r0.ordinal()
            int r1 = r5.p()
            r2 = 1
            int r1 = r1 - r2
            int r0 = 3 - r0
            int r0 = r0 + r1
            int r3 = r0 / 7
            int r3 = r3 * 7
            int r0 = r0 - r3
            r3 = -3
            int r0 = r0 + r3
            if (r0 >= r3) goto L1c
            int r0 = r0 + 7
        L1c:
            if (r1 >= r0) goto L3f
            r0 = 180(0xb4, float:2.52E-43)
            j$.time.g r5 = r5.C(r0)
            r0 = -1
            j$.time.g r5 = r5.y(r0)
            int r5 = k(r5)
            int r5 = l(r5)
            long r0 = (long) r5
            r2 = 1
            j$.time.temporal.s r5 = j$.time.temporal.s.i(r2, r0)
            long r0 = r5.d()
            int r5 = (int) r0
            goto L5b
        L3f:
            int r1 = r1 - r0
            int r1 = r1 / 7
            int r1 = r1 + r2
            r4 = 53
            if (r1 != r4) goto L59
            if (r0 == r3) goto L55
            r3 = -2
            if (r0 != r3) goto L53
            boolean r5 = r5.r()
            if (r5 == 0) goto L53
            goto L55
        L53:
            r5 = 0
            goto L56
        L55:
            r5 = 1
        L56:
            if (r5 != 0) goto L59
            goto L5a
        L59:
            r2 = r1
        L5a:
            r5 = r2
        L5b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.temporal.g.g(j$.time.g):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s j(j$.time.g gVar) {
        return s.i(1L, l(k(gVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(j$.time.g gVar) {
        int q = gVar.q();
        int p = gVar.p();
        if (p <= 3) {
            return p - gVar.o().ordinal() < -2 ? q - 1 : q;
        } else if (p < 363) {
            return q;
        } else {
            return ((p - 363) - (gVar.r() ? 1 : 0)) - gVar.o().ordinal() >= 0 ? q + 1 : q;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(int i) {
        j$.time.g t = j$.time.g.t(i, 1, 1);
        if (t.o() != j$.time.d.THURSDAY) {
            return (t.o() != j$.time.d.WEDNESDAY || !t.r()) ? 52 : 53;
        }
        return 53;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) b.clone();
    }

    @Override // j$.time.temporal.n
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.n
    public final boolean isTimeBased() {
        return false;
    }
}
