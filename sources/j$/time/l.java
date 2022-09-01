package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.r;
import j$.time.temporal.s;

/* loaded from: classes3.dex */
public enum l implements j$.time.temporal.m {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    
    private static final l[] a = values();

    public static l k(int i) {
        if (i < 1 || i > 12) {
            throw new c("Invalid value for MonthOfYear: " + i);
        }
        return a[i - 1];
    }

    @Override // j$.time.temporal.m
    public final int b(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return ordinal() + 1;
        }
        return j$.desugar.sun.nio.fs.a.a(this, nVar);
    }

    @Override // j$.time.temporal.m
    public final s d(j$.time.temporal.n nVar) {
        return nVar == j$.time.temporal.a.MONTH_OF_YEAR ? nVar.c() : j$.desugar.sun.nio.fs.a.c(this, nVar);
    }

    @Override // j$.time.temporal.m
    public final boolean f(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.MONTH_OF_YEAR : nVar != null && nVar.a(this);
    }

    @Override // j$.time.temporal.m
    public final long h(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return ordinal() + 1;
        }
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.d(this);
        }
        throw new r(j$.net.a.a("Unsupported field: ", String.valueOf(nVar)));
    }

    @Override // j$.time.temporal.m
    public final Object i(j$.time.temporal.q qVar) {
        return qVar == j$.time.temporal.p.a() ? j$.time.chrono.h.a : qVar == j$.time.temporal.p.e() ? ChronoUnit.MONTHS : j$.desugar.sun.nio.fs.a.b(this, qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int j(boolean z) {
        switch (k.a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 91;
            case 3:
                return z + 152;
            case 4:
                return z + 244;
            case 5:
                return z + 305;
            case 6:
                return 1;
            case 7:
                return z + 60;
            case 8:
                return z + 121;
            case 9:
                return z + 182;
            case 10:
                return z + 213;
            case 11:
                return z + 274;
            default:
                return z + 335;
        }
    }

    public final l l() {
        int i = ((int) 1) + 12;
        return a[(i + ordinal()) % 12];
    }
}
