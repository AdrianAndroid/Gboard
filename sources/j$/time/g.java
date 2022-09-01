package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.util.Objects;
import java.io.Serializable;
import org.chromium.net.UrlRequest;

/* loaded from: classes3.dex */
public final class g implements j$.time.temporal.l, j$.time.chrono.b, Serializable {
    public static final g d = t(-999999999, 1, 1);
    public static final g e = t(999999999, 12, 31);
    private final int a;
    private final short b;
    private final short c;

    static {
        t(1970, 1, 1);
    }

    private g(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    public static g m(j$.time.temporal.m mVar) {
        Objects.a(mVar, "temporal");
        g gVar = (g) mVar.i(j$.time.temporal.p.b());
        if (gVar != null) {
            return gVar;
        }
        String valueOf = String.valueOf(mVar);
        String name = mVar.getClass().getName();
        throw new c("Unable to obtain LocalDate from TemporalAccessor: " + valueOf + " of type " + name);
    }

    private int n(j$.time.temporal.n nVar) {
        int i;
        int p;
        int i2 = f.a[((j$.time.temporal.a) nVar).ordinal()];
        int i3 = this.a;
        short s = this.c;
        switch (i2) {
            case 1:
                return s;
            case 2:
                return p();
            case 3:
                i = (s - 1) / 7;
                return i + 1;
            case 4:
                if (i3 < 1) {
                    return 1 - i3;
                }
                return i3;
            case 5:
                return o().ordinal() + 1;
            case 6:
                i = (s - 1) % 7;
                return i + 1;
            case 7:
                p = (p() - 1) % 7;
                return p + 1;
            case 8:
                throw new r("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                p = (p() - 1) / 7;
                return p + 1;
            case 10:
                return this.b;
            case 11:
                throw new r("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return i3;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                if (i3 >= 1) {
                    return 1;
                }
                return 0;
            default:
                throw new r(j$.net.a.a("Unsupported field: ", String.valueOf(nVar)));
        }
    }

    public static g t(int i, int i2, int i3) {
        long j = i;
        j$.time.temporal.a.YEAR.g(j);
        j$.time.temporal.a.MONTH_OF_YEAR.g(i2);
        j$.time.temporal.a.DAY_OF_MONTH.g(i3);
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                if (i2 != 4 && i2 != 6 && i2 != 9 && i2 != 11) {
                    i4 = 31;
                } else {
                    i4 = 30;
                }
            } else {
                j$.time.chrono.h.a.getClass();
                if (j$.time.chrono.h.a(j)) {
                    i4 = 29;
                }
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new c("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new c("Invalid date '" + l.k(i2).name() + " " + i3 + "'");
            }
        }
        return new g(i, i2, i3);
    }

    public static g u(long j) {
        long j2;
        j$.time.temporal.a.EPOCH_DAY.g(j);
        long j3 = (j + 719528) - 60;
        if (j3 < 0) {
            long j4 = ((j3 + 1) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        return new g(j$.time.temporal.a.YEAR.f(j5 + j2 + (i2 / 10)), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    private static g z(int i, int i2, int i3) {
        int i4;
        if (i2 != 2) {
            if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
                i4 = 30;
            }
            return new g(i, i2, i3);
        }
        j$.time.chrono.h.a.getClass();
        i4 = j$.time.chrono.h.a((long) i) ? 29 : 28;
        i3 = Math.min(i3, i4);
        return new g(i, i2, i3);
    }

    public final long A() {
        long j;
        long j2 = this.a;
        long j3 = this.b;
        long j4 = (365 * j2) + 0;
        if (j2 >= 0) {
            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4;
        } else {
            j = j4 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
        }
        long j5 = (((367 * j3) - 362) / 12) + j + (this.c - 1);
        if (j3 > 2) {
            j5--;
            if (!r()) {
                j5--;
            }
        }
        return j5 - 719528;
    }

    @Override // j$.time.temporal.l
    /* renamed from: B */
    public final g a(long j, j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
            aVar.g(j);
            int i = f.a[aVar.ordinal()];
            short s = this.b;
            short s2 = this.c;
            int i2 = this.a;
            switch (i) {
                case 1:
                    int i3 = (int) j;
                    if (s2 == i3) {
                        return this;
                    }
                    return t(i2, s, i3);
                case 2:
                    return C((int) j);
                case 3:
                    return w(j$.desugar.sun.nio.fs.a.h(j - h(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH), 7));
                case 4:
                    if (i2 < 1) {
                        j = 1 - j;
                    }
                    return D((int) j);
                case 5:
                    return w(j - (o().ordinal() + 1));
                case 6:
                    return w(j - h(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                case 7:
                    return w(j - h(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                case 8:
                    return u(j);
                case 9:
                    return w(j$.desugar.sun.nio.fs.a.h(j - h(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR), 7));
                case 10:
                    int i4 = (int) j;
                    if (s == i4) {
                        return this;
                    }
                    j$.time.temporal.a.MONTH_OF_YEAR.g(i4);
                    return z(i2, i4, s2);
                case 11:
                    return x(j - (((i2 * 12) + s) - 1));
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    return D((int) j);
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    if (h(j$.time.temporal.a.ERA) == j) {
                        return this;
                    }
                    return D(1 - i2);
                default:
                    throw new r(j$.net.a.a("Unsupported field: ", String.valueOf(nVar)));
            }
        }
        return (g) nVar.e(this, j);
    }

    public final g C(int i) {
        if (p() == i) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int i2 = this.a;
        long j = i2;
        aVar.g(j);
        j$.time.temporal.a.DAY_OF_YEAR.g(i);
        j$.time.chrono.h.a.getClass();
        boolean a = j$.time.chrono.h.a(j);
        if (i == 366 && !a) {
            throw new c("Invalid date 'DayOfYear 366' as '" + i2 + "' is not a leap year");
        }
        int i3 = 31;
        l k = l.k(((i - 1) / 31) + 1);
        int j2 = k.j(a);
        int i4 = k.a[k.ordinal()];
        if (i4 != 1) {
            if (i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5) {
                i3 = 30;
            }
        } else if (a) {
            i3 = 29;
        } else {
            i3 = 28;
        }
        if (i > (j2 + i3) - 1) {
            k = k.l();
        }
        return new g(i2, k.ordinal() + 1, (i - k.j(a)) + 1);
    }

    public final g D(int i) {
        if (this.a == i) {
            return this;
        }
        j$.time.temporal.a.YEAR.g(i);
        return z(i, this.b, this.c);
    }

    @Override // j$.time.temporal.m
    public final int b(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? n(nVar) : j$.desugar.sun.nio.fs.a.a(this, nVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l c(g gVar) {
        return gVar;
    }

    @Override // j$.time.temporal.m
    public final s d(j$.time.temporal.n nVar) {
        int s;
        long j;
        long j2;
        if (nVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
            if (aVar.isDateBased()) {
                int i = f.a[aVar.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return nVar.c();
                            }
                            if (this.a <= 0) {
                                j2 = 1000000000;
                            } else {
                                j2 = 999999999;
                            }
                            return s.i(1L, j2);
                        }
                        if (l.k(this.b) == l.FEBRUARY && !r()) {
                            j = 4;
                        } else {
                            j = 5;
                        }
                        return s.i(1L, j);
                    } else if (r()) {
                        s = 366;
                    } else {
                        s = 365;
                    }
                } else {
                    s = s();
                }
                return s.i(1L, s);
            }
            throw new r(j$.net.a.a("Unsupported field: ", String.valueOf(nVar)));
        }
        return nVar.b(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && l((g) obj) == 0;
    }

    @Override // j$.time.temporal.m
    public final boolean f(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar.isDateBased() : nVar != null && nVar.a(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l g(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.m
    public final long h(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            if (nVar == j$.time.temporal.a.EPOCH_DAY) {
                return A();
            }
            if (nVar == j$.time.temporal.a.PROLEPTIC_MONTH) {
                return ((this.a * 12) + this.b) - 1;
            }
            return n(nVar);
        }
        return nVar.d(this);
    }

    public final int hashCode() {
        int i = this.a;
        return (((i << 11) + (this.b << 6)) + this.c) ^ (i & (-2048));
    }

    @Override // j$.time.temporal.m
    public final Object i(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.p.b()) {
            return this;
        }
        if (qVar == j$.time.temporal.p.g() || qVar == j$.time.temporal.p.f() || qVar == j$.time.temporal.p.d() || qVar == j$.time.temporal.p.c()) {
            return null;
        }
        if (qVar == j$.time.temporal.p.a()) {
            return j$.time.chrono.h.a;
        }
        if (qVar == j$.time.temporal.p.e()) {
            return ChronoUnit.DAYS;
        }
        return qVar.a(this);
    }

    public final j$.time.temporal.l j(j$.time.temporal.l lVar) {
        return lVar.a(A(), j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // java.lang.Comparable
    /* renamed from: k */
    public final int compareTo(j$.time.chrono.b bVar) {
        if (bVar instanceof g) {
            return l((g) bVar);
        }
        int i = (A() > ((g) bVar).A() ? 1 : (A() == ((g) bVar).A() ? 0 : -1));
        if (i == 0) {
            j$.time.chrono.h.a.getClass();
            return 0;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int l(g gVar) {
        int i = this.a - gVar.a;
        if (i == 0) {
            int i2 = this.b - gVar.b;
            return i2 == 0 ? this.c - gVar.c : i2;
        }
        return i;
    }

    public final d o() {
        return d.j(((int) j$.desugar.sun.nio.fs.a.i(A() + 3, 7)) + 1);
    }

    public final int p() {
        return (l.k(this.b).j(r()) + this.c) - 1;
    }

    public final int q() {
        return this.a;
    }

    public final boolean r() {
        j$.time.chrono.h.a.getClass();
        return j$.time.chrono.h.a(this.a);
    }

    public final int s() {
        short s = this.b;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : r() ? 29 : 28;
    }

    public final String toString() {
        int i;
        int i2 = this.a;
        int abs = Math.abs(i2);
        StringBuilder sb = new StringBuilder(10);
        if (abs < 1000) {
            if (i2 < 0) {
                sb.append(i2 - 10000);
                i = 1;
            } else {
                sb.append(i2 + 10000);
                i = 0;
            }
            sb.deleteCharAt(i);
        } else {
            if (i2 > 9999) {
                sb.append('+');
            }
            sb.append(i2);
        }
        String str = "-0";
        short s = this.b;
        sb.append(s < 10 ? str : "-");
        sb.append((int) s);
        short s2 = this.c;
        if (s2 >= 10) {
            str = "-";
        }
        sb.append(str);
        sb.append((int) s2);
        return sb.toString();
    }

    @Override // j$.time.temporal.l
    /* renamed from: v */
    public final g e(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (f.b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return w(j);
                case 2:
                    return w(j$.desugar.sun.nio.fs.a.h(j, 7));
                case 3:
                    return x(j);
                case 4:
                    return y(j);
                case 5:
                    return y(j$.desugar.sun.nio.fs.a.h(j, 10));
                case 6:
                    return y(j$.desugar.sun.nio.fs.a.h(j, 100));
                case 7:
                    return y(j$.desugar.sun.nio.fs.a.h(j, 1000));
                case 8:
                    j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                    return a(j$.desugar.sun.nio.fs.a.j(h(aVar), j), aVar);
                default:
                    throw new r(j$.net.a.a("Unsupported unit: ", String.valueOf(temporalUnit)));
            }
        }
        return (g) temporalUnit.a(this, j);
    }

    public final g w(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.c + j;
        if (j2 > 0) {
            short s = this.b;
            int i = this.a;
            if (j2 <= 28) {
                return new g(i, s, (int) j2);
            }
            if (j2 <= 59) {
                long s2 = s();
                if (j2 <= s2) {
                    return new g(i, s, (int) j2);
                }
                if (s < 12) {
                    return new g(i, s + 1, (int) (j2 - s2));
                }
                int i2 = i + 1;
                j$.time.temporal.a.YEAR.g(i2);
                return new g(i2, 1, (int) (j2 - s2));
            }
        }
        return u(j$.desugar.sun.nio.fs.a.j(A(), j));
    }

    public final g x(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        long j3 = 12;
        return z(j$.time.temporal.a.YEAR.f(j$.desugar.sun.nio.fs.a.e(j2, j3)), ((int) j$.desugar.sun.nio.fs.a.i(j2, j3)) + 1, this.c);
    }

    public final g y(long j) {
        return j == 0 ? this : z(j$.time.temporal.a.YEAR.f(this.a + j), this.b, this.c);
    }
}
