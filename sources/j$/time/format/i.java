package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class i implements g {
    @Override // j$.time.format.g
    public final boolean a(r rVar, StringBuilder sb) {
        Long e = rVar.e(j$.time.temporal.a.INSTANT_SECONDS);
        j$.time.temporal.m d = rVar.d();
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long valueOf = d.f(aVar) ? Long.valueOf(rVar.d().h(aVar)) : null;
        int i = 0;
        if (e == null) {
            return false;
        }
        long longValue = e.longValue();
        int f = aVar.f(valueOf != null ? valueOf.longValue() : 0L);
        if (longValue >= -62167219200L) {
            long j = (longValue - 315569520000L) + 62167219200L;
            long e2 = j$.desugar.sun.nio.fs.a.e(j, 315569520000L) + 1;
            LocalDateTime r = LocalDateTime.r(j$.desugar.sun.nio.fs.a.i(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (e2 > 0) {
                sb.append('+');
                sb.append(e2);
            }
            sb.append(r);
            if (r.m() == 0) {
                sb.append(":00");
            }
        } else {
            long j2 = longValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            LocalDateTime r2 = LocalDateTime.r(j4 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(r2);
            if (r2.m() == 0) {
                sb.append(":00");
            }
            if (j3 < 0) {
                if (r2.n() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb.insert(length, j3);
                } else {
                    sb.insert(length + 1, Math.abs(j3));
                }
            }
        }
        if (f > 0) {
            sb.append('.');
            int i2 = 100000000;
            while (true) {
                if (f <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = f / i2;
                sb.append((char) (i3 + 48));
                f -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        sb.append('Z');
        return true;
    }

    public final String toString() {
        return "Instant()";
    }
}
