package j$.time;

import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class ZoneOffset extends n implements j$.time.temporal.m, Comparable<ZoneOffset> {
    private final int a;
    private final transient String b;
    private static final ConcurrentHashMap c = new ConcurrentHashMap(16, 0.75f, 4);
    private static final ConcurrentHashMap d = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = l(0);
    public static final ZoneOffset e = l(-64800);
    public static final ZoneOffset f = l(64800);

    private ZoneOffset(int i) {
        String str;
        String str2;
        String str3;
        String sb;
        this.a = i;
        if (i == 0) {
            sb = "Z";
        } else {
            int abs = Math.abs(i);
            StringBuilder sb2 = new StringBuilder();
            int i2 = abs / 3600;
            int i3 = (abs / 60) % 60;
            if (i < 0) {
                str = "-";
            } else {
                str = "+";
            }
            sb2.append(str);
            if (i2 < 10) {
                str2 = "0";
            } else {
                str2 = "";
            }
            sb2.append(str2);
            sb2.append(i2);
            String str4 = ":0";
            if (i3 >= 10) {
                str3 = ":";
            } else {
                str3 = str4;
            }
            sb2.append(str3);
            sb2.append(i3);
            int i4 = abs % 60;
            if (i4 != 0) {
                sb2.append(i4 >= 10 ? ":" : str4);
                sb2.append(i4);
            }
            sb = sb2.toString();
        }
        this.b = sb;
    }

    public static ZoneOffset l(int i) {
        if (i >= -64800 && i <= 64800) {
            if (i % 900 == 0) {
                Integer valueOf = Integer.valueOf(i);
                ConcurrentHashMap concurrentHashMap = c;
                ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(valueOf);
                if (zoneOffset == null) {
                    concurrentHashMap.putIfAbsent(valueOf, new ZoneOffset(i));
                    ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(valueOf);
                    d.putIfAbsent(zoneOffset2.b, zoneOffset2);
                    return zoneOffset2;
                }
                return zoneOffset;
            }
            return new ZoneOffset(i);
        }
        throw new c("Zone offset not in valid range: -18:00 to +18:00");
    }

    @Override // j$.time.temporal.m
    public final int b(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.a;
        }
        if (!(nVar instanceof j$.time.temporal.a)) {
            return j$.desugar.sun.nio.fs.a.c(this, nVar).a(h(nVar), nVar);
        }
        throw new r(j$.net.a.a("Unsupported field: ", String.valueOf(nVar)));
    }

    @Override // java.lang.Comparable
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.a - this.a;
    }

    @Override // j$.time.temporal.m
    public final s d(j$.time.temporal.n nVar) {
        return j$.desugar.sun.nio.fs.a.c(this, nVar);
    }

    @Override // j$.time.n
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneOffset)) {
            return false;
        }
        return this.a == ((ZoneOffset) obj).a;
    }

    @Override // j$.time.temporal.m
    public final boolean f(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.OFFSET_SECONDS : nVar != null && nVar.a(this);
    }

    @Override // j$.time.temporal.m
    public final long h(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.a;
        }
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.d(this);
        }
        throw new r(j$.net.a.a("Unsupported field: ", String.valueOf(nVar)));
    }

    @Override // j$.time.n
    public final int hashCode() {
        return this.a;
    }

    @Override // j$.time.temporal.m
    public final Object i(j$.time.temporal.q qVar) {
        return (qVar == j$.time.temporal.p.d() || qVar == j$.time.temporal.p.f()) ? this : j$.desugar.sun.nio.fs.a.b(this, qVar);
    }

    @Override // j$.time.n
    public final String j() {
        return this.b;
    }

    public final int k() {
        return this.a;
    }

    @Override // j$.time.n
    public final String toString() {
        return this.b;
    }
}
