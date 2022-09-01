package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.r;
import j$.time.temporal.s;

/* loaded from: classes3.dex */
public enum d implements j$.time.temporal.m {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    
    private static final d[] a = values();

    public static d j(int i) {
        if (i < 1 || i > 7) {
            throw new c("Invalid value for DayOfWeek: " + i);
        }
        return a[i - 1];
    }

    @Override // j$.time.temporal.m
    public final int b(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return ordinal() + 1;
        }
        return j$.desugar.sun.nio.fs.a.a(this, nVar);
    }

    @Override // j$.time.temporal.m
    public final s d(j$.time.temporal.n nVar) {
        return nVar == j$.time.temporal.a.DAY_OF_WEEK ? nVar.c() : j$.desugar.sun.nio.fs.a.c(this, nVar);
    }

    @Override // j$.time.temporal.m
    public final boolean f(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.DAY_OF_WEEK : nVar != null && nVar.a(this);
    }

    @Override // j$.time.temporal.m
    public final long h(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return ordinal() + 1;
        }
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.d(this);
        }
        throw new r(j$.net.a.a("Unsupported field: ", String.valueOf(nVar)));
    }

    @Override // j$.time.temporal.m
    public final Object i(j$.time.temporal.q qVar) {
        return qVar == j$.time.temporal.p.e() ? ChronoUnit.DAYS : j$.desugar.sun.nio.fs.a.b(this, qVar);
    }
}
