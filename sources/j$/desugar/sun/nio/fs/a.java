package j$.desugar.sun.nio.fs;

import j$.time.c;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.util.Objects;
import java.util.AbstractMap;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static int a(m mVar, n nVar) {
        s d = mVar.d(nVar);
        if (!d.g()) {
            String valueOf = String.valueOf(nVar);
            throw new r("Invalid field " + valueOf + " for get() method, use getLong() instead");
        }
        long h = mVar.h(nVar);
        if (d.h(h)) {
            return (int) h;
        }
        String valueOf2 = String.valueOf(nVar);
        String valueOf3 = String.valueOf(d);
        throw new c("Invalid value for " + valueOf2 + " (valid values " + valueOf3 + "): " + h);
    }

    public static Object b(m mVar, q qVar) {
        if (qVar == p.g() || qVar == p.a() || qVar == p.e()) {
            return null;
        }
        return qVar.a(mVar);
    }

    public static s c(m mVar, n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            if (mVar.f(nVar)) {
                return nVar.c();
            }
            throw new r(j$.net.a.a("Unsupported field: ", String.valueOf(nVar)));
        }
        Objects.a(nVar, "field");
        return nVar.b(mVar);
    }

    public static boolean d(char c) {
        return c >= 55296 && c < 57344;
    }

    public static /* synthetic */ long e(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) != 0 && (((j ^ j2) >> 63) | 1) < 0) ? j3 - 1 : j3;
    }

    public static /* synthetic */ AbstractMap.SimpleImmutableEntry f(String str, String str2) {
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(str), Objects.requireNonNull(str2));
    }

    public static /* synthetic */ long h(long j, long j2) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros((-1) ^ j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(j ^ (-1)) + Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (numberOfLeadingZeros >= 64) {
            boolean z = true;
            boolean z2 = j >= 0;
            if (j2 == Long.MIN_VALUE) {
                z = false;
            }
            if (z | z2) {
                long j3 = j * j2;
                if (j == 0 || j3 / j == j2) {
                    return j3;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long i(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        return (((j ^ j2) >> 63) | 1) > 0 ? j3 : j3 + j2;
    }

    public static /* synthetic */ long j(long j, long j2) {
        long j3 = j + j2;
        boolean z = true;
        boolean z2 = (j2 ^ j) < 0;
        if ((j ^ j3) < 0) {
            z = false;
        }
        if (z2 || z) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long k(long j, long j2) {
        long j3 = j - j2;
        boolean z = true;
        boolean z2 = (j2 ^ j) >= 0;
        if ((j ^ j3) < 0) {
            z = false;
        }
        if (z2 || z) {
            return j3;
        }
        throw new ArithmeticException();
    }
}
