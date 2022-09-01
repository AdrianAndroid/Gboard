package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.r;
import j$.time.temporal.s;
import java.io.Serializable;
import org.chromium.net.UrlRequest;

/* loaded from: classes3.dex */
public final class j implements j$.time.temporal.l, Comparable, Serializable {
    public static final j e;
    public static final j f;
    private static final j[] g = new j[24];
    private final byte a;
    private final byte b;
    private final byte c;
    private final int d;

    static {
        int i = 0;
        while (true) {
            j[] jVarArr = g;
            if (i >= jVarArr.length) {
                j jVar = jVarArr[0];
                j jVar2 = jVarArr[12];
                e = jVar;
                f = new j(23, 59, 59, 999999999);
                return;
            }
            jVarArr[i] = new j(i, 0, 0, 0);
            i++;
        }
    }

    private j(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    private static j k(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? g[i] : new j(i, i2, i3, i4);
    }

    private int l(j$.time.temporal.n nVar) {
        int i = i.a[((j$.time.temporal.a) nVar).ordinal()];
        byte b = this.b;
        int i2 = this.d;
        byte b2 = this.a;
        switch (i) {
            case 1:
                return i2;
            case 2:
                throw new r("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i2 / 1000;
            case 4:
                throw new r("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i2 / 1000000;
            case 6:
                return (int) (u() / 1000000);
            case 7:
                return this.c;
            case 8:
                return v();
            case 9:
                return b;
            case 10:
                return (b2 * 60) + b;
            case 11:
                return b2 % 12;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                int i3 = b2 % 12;
                if (i3 % 12 == 0) {
                    return 12;
                }
                return i3;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return b2;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                if (b2 == 0) {
                    return 24;
                }
                return b2;
            case 15:
                return b2 / 12;
            default:
                throw new r(j$.net.a.a("Unsupported field: ", String.valueOf(nVar)));
        }
    }

    public static j o(long j) {
        j$.time.temporal.a.NANO_OF_DAY.g(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (i * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (i2 * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return k(i, i2, i3, (int) (j3 - (i3 * 1000000000)));
    }

    @Override // j$.time.temporal.m
    public final int b(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? l(nVar) : j$.desugar.sun.nio.fs.a.a(this, nVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l c(g gVar) {
        boolean z = gVar instanceof j;
        j$.time.temporal.l lVar = gVar;
        if (!z) {
            lVar = gVar.j(this);
        }
        return (j) lVar;
    }

    @Override // j$.time.temporal.m
    public final s d(j$.time.temporal.n nVar) {
        return j$.desugar.sun.nio.fs.a.c(this, nVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && this.b == jVar.b && this.c == jVar.c && this.d == jVar.d;
    }

    @Override // j$.time.temporal.m
    public final boolean f(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar.isTimeBased() : nVar != null && nVar.a(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l g(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.m
    public final long h(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.NANO_OF_DAY ? u() : nVar == j$.time.temporal.a.MICRO_OF_DAY ? u() / 1000 : l(nVar) : nVar.d(this);
    }

    public final int hashCode() {
        long u = u();
        return (int) (u ^ (u >>> 32));
    }

    @Override // j$.time.temporal.m
    public final Object i(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.p.a() || qVar == j$.time.temporal.p.g() || qVar == j$.time.temporal.p.f() || qVar == j$.time.temporal.p.d()) {
            return null;
        }
        if (qVar == j$.time.temporal.p.c()) {
            return this;
        }
        if (qVar == j$.time.temporal.p.b()) {
            return null;
        }
        return qVar == j$.time.temporal.p.e() ? ChronoUnit.NANOS : qVar.a(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: j */
    public final int compareTo(j jVar) {
        int i;
        int i2;
        int i3;
        byte b = jVar.a;
        int i4 = -1;
        byte b2 = this.a;
        if (b2 == b) {
            i = 0;
        } else if (b2 < b) {
            i = -1;
        } else {
            i = 1;
        }
        if (i == 0) {
            byte b3 = this.b;
            byte b4 = jVar.b;
            if (b3 == b4) {
                i2 = 0;
            } else if (b3 < b4) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            if (i2 == 0) {
                byte b5 = this.c;
                byte b6 = jVar.c;
                if (b5 == b6) {
                    i3 = 0;
                } else if (b5 < b6) {
                    i3 = -1;
                } else {
                    i3 = 1;
                }
                if (i3 == 0) {
                    int i5 = this.d;
                    int i6 = jVar.d;
                    if (i5 == i6) {
                        i4 = 0;
                    } else if (i5 >= i6) {
                        i4 = 1;
                    }
                    return i4;
                }
                return i3;
            }
            return i2;
        }
        return i;
    }

    public final int m() {
        return this.d;
    }

    public final int n() {
        return this.c;
    }

    @Override // j$.time.temporal.l
    /* renamed from: p */
    public final j e(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (i.b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return s(j);
                case 2:
                    return s((j % 86400000000L) * 1000);
                case 3:
                    return s((j % 86400000) * 1000000);
                case 4:
                    return t(j);
                case 5:
                    return r(j);
                case 6:
                    return q(j);
                case 7:
                    return q((j % 2) * 12);
                default:
                    throw new r(j$.net.a.a("Unsupported unit: ", String.valueOf(temporalUnit)));
            }
        }
        return (j) temporalUnit.a(this, j);
    }

    public final j q(long j) {
        if (j == 0) {
            return this;
        }
        return k(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final j r(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.a * 60) + this.b;
        int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
        return i == i2 ? this : k(i2 / 60, i2 % 60, this.c, this.d);
    }

    public final j s(long j) {
        if (j == 0) {
            return this;
        }
        long u = u();
        long j2 = (((j % 86400000000000L) + u) + 86400000000000L) % 86400000000000L;
        return u == j2 ? this : k((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
    }

    public final j t(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.b * 60) + (this.a * 3600) + this.c;
        int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
        return i == i2 ? this : k(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder(18);
        byte b = this.a;
        sb.append(b < 10 ? "0" : "");
        sb.append((int) b);
        String str = ":0";
        byte b2 = this.b;
        sb.append(b2 < 10 ? str : ":");
        sb.append((int) b2);
        byte b3 = this.c;
        int i2 = this.d;
        if (b3 > 0 || i2 > 0) {
            if (b3 >= 10) {
                str = ":";
            }
            sb.append(str);
            sb.append((int) b3);
            if (i2 > 0) {
                sb.append('.');
                int i3 = 1000000;
                if (i2 % 1000000 == 0) {
                    i = (i2 / 1000000) + 1000;
                } else {
                    if (i2 % 1000 == 0) {
                        i2 /= 1000;
                    } else {
                        i3 = 1000000000;
                    }
                    i = i2 + i3;
                }
                sb.append(Integer.toString(i).substring(1));
            }
        }
        return sb.toString();
    }

    public final long u() {
        return (this.c * 1000000000) + (this.b * 60000000000L) + (this.a * 3600000000000L) + this.d;
    }

    public final int v() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    @Override // j$.time.temporal.l
    /* renamed from: w */
    public final j a(long j, j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
            aVar.g(j);
            int i = i.a[aVar.ordinal()];
            byte b = this.b;
            byte b2 = this.c;
            int i2 = this.d;
            byte b3 = this.a;
            switch (i) {
                case 1:
                    return x((int) j);
                case 2:
                    return o(j);
                case 3:
                    return x(((int) j) * 1000);
                case 4:
                    return o(j * 1000);
                case 5:
                    return x(((int) j) * 1000000);
                case 6:
                    return o(j * 1000000);
                case 7:
                    int i3 = (int) j;
                    if (b2 == i3) {
                        return this;
                    }
                    j$.time.temporal.a.SECOND_OF_MINUTE.g(i3);
                    return k(b3, b, i3, i2);
                case 8:
                    return t(j - v());
                case 9:
                    int i4 = (int) j;
                    if (b == i4) {
                        return this;
                    }
                    j$.time.temporal.a.MINUTE_OF_HOUR.g(i4);
                    return k(b3, i4, b2, i2);
                case 10:
                    return r(j - ((b3 * 60) + b));
                case 11:
                    return q(j - (b3 % 12));
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    if (j == 12) {
                        j = 0;
                    }
                    return q(j - (b3 % 12));
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    int i5 = (int) j;
                    if (b3 == i5) {
                        return this;
                    }
                    j$.time.temporal.a.HOUR_OF_DAY.g(i5);
                    return k(i5, b, b2, i2);
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    if (j == 24) {
                        j = 0;
                    }
                    int i6 = (int) j;
                    if (b3 == i6) {
                        return this;
                    }
                    j$.time.temporal.a.HOUR_OF_DAY.g(i6);
                    return k(i6, b, b2, i2);
                case 15:
                    return q((j - (b3 / 12)) * 12);
                default:
                    throw new r(j$.net.a.a("Unsupported field: ", String.valueOf(nVar)));
            }
        }
        return (j) nVar.e(this, j);
    }

    public final j x(int i) {
        if (this.d == i) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.g(i);
        return k(this.a, this.b, this.c, i);
    }
}
