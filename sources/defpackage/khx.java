package defpackage;

import android.os.SystemClock;
import java.util.Random;

/* compiled from: PG */
/* renamed from: khx  reason: default package */
/* loaded from: classes.dex */
final class khx extends khz {
    private final Random a;
    private final long b;
    private final khl c;

    public khx(oor oorVar, Random random, khl khlVar) {
        super(oorVar);
        this.a = random;
        this.b = oorVar.b;
        this.c = khlVar;
    }

    @Override // defpackage.khz
    public final long a(String str) {
        long j;
        if (lfd.e(str)) {
            j = this.b;
        } else {
            khl khlVar = this.c;
            long elapsedRealtime = SystemClock.elapsedRealtime() - khlVar.d;
            char c = 0;
            if (elapsedRealtime >= 14400000) {
                long j2 = elapsedRealtime / 14400000;
                long max = Math.max(j2, 15L);
                for (int i = 0; i < 256; i++) {
                    short[] sArr = khlVar.a;
                    int i2 = (int) max;
                    int i3 = sArr[i] >> i2;
                    sArr[i] = (short) i3;
                    khlVar.b[i] = (short) (i3 >> i2);
                }
                khlVar.d += j2 * 14400000;
            }
            int hashCode = str.hashCode() * khlVar.c;
            if (!str.isEmpty()) {
                c = str.charAt(0);
            }
            int i4 = ((hashCode >>> 24) + c) & 255;
            int length = ((hashCode >>> 16) + str.length()) & 255;
            int min = Math.min((int) khlVar.a[i4], (int) khlVar.b[length]);
            int i5 = min + 1;
            short min2 = (short) Math.min(32767, i5);
            short[] sArr2 = khlVar.a;
            if (sArr2[i4] == min) {
                sArr2[i4] = min2;
            }
            short[] sArr3 = khlVar.b;
            if (sArr3[length] == min) {
                sArr3[length] = min2;
            }
            double sqrt = i5 < 50 ? Math.sqrt(i5) : i5;
            double d = this.b;
            Double.isNaN(d);
            j = (int) (d / sqrt);
        }
        if (this.a.nextDouble() * 1000.0d < j) {
            return j;
        }
        return -1L;
    }

    @Override // defpackage.khz
    public final oor b(Long l) {
        return c() ? e(l) : d();
    }

    @Override // defpackage.khz
    public final boolean c() {
        return this.b > 0;
    }
}
