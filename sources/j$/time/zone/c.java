package j$.time.zone;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.g;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class c implements Serializable {
    private static final long[] h = new long[0];
    private static final b[] i = new b[0];
    private static final LocalDateTime[] j = new LocalDateTime[0];
    private final long[] a;
    private final ZoneOffset[] b;
    private final long[] c;
    private final ZoneOffset[] e;
    private final transient ConcurrentHashMap g = new ConcurrentHashMap();
    private final LocalDateTime[] d = j;
    private final b[] f = i;

    private c(ZoneOffset zoneOffset) {
        this.b = r0;
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        long[] jArr = h;
        this.a = jArr;
        this.c = jArr;
        this.e = zoneOffsetArr;
    }

    private a[] a(int i2) {
        Integer valueOf = Integer.valueOf(i2);
        ConcurrentHashMap concurrentHashMap = this.g;
        a[] aVarArr = (a[]) concurrentHashMap.get(valueOf);
        if (aVarArr != null) {
            return aVarArr;
        }
        b[] bVarArr = this.f;
        a[] aVarArr2 = new a[bVarArr.length];
        if (bVarArr.length > 0) {
            b bVar = bVarArr[0];
            throw null;
        }
        if (i2 < 2100) {
            concurrentHashMap.putIfAbsent(valueOf, aVarArr2);
        }
        return aVarArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (r7.p(r3.a()) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
        if (r7.p(r3.a()) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Object c(j$.time.LocalDateTime r7) {
        /*
            r6 = this;
            long[] r0 = r6.c
            int r0 = r0.length
            r1 = 0
            if (r0 != 0) goto Lb
            j$.time.ZoneOffset[] r7 = r6.b
            r7 = r7[r1]
            return r7
        Lb:
            j$.time.zone.b[] r0 = r6.f
            int r0 = r0.length
            r2 = -1
            j$.time.LocalDateTime[] r3 = r6.d
            if (r0 <= 0) goto L73
            int r0 = r3.length
            int r0 = r0 + r2
            r0 = r3[r0]
            boolean r0 = r7.o(r0)
            if (r0 == 0) goto L73
            int r0 = r7.n()
            j$.time.zone.a[] r0 = r6.a(r0)
            int r2 = r0.length
            r3 = 0
        L27:
            if (r1 >= r2) goto L72
            r3 = r0[r1]
            j$.time.LocalDateTime r4 = r3.b()
            boolean r5 = r3.g()
            boolean r4 = r7.p(r4)
            if (r5 == 0) goto L4b
            if (r4 == 0) goto L40
        L3b:
            j$.time.ZoneOffset r4 = r3.e()
            goto L5e
        L40:
            j$.time.LocalDateTime r4 = r3.a()
            boolean r4 = r7.p(r4)
            if (r4 == 0) goto L4d
            goto L5d
        L4b:
            if (r4 != 0) goto L52
        L4d:
            j$.time.ZoneOffset r4 = r3.d()
            goto L5e
        L52:
            j$.time.LocalDateTime r4 = r3.a()
            boolean r4 = r7.p(r4)
            if (r4 == 0) goto L5d
            goto L3b
        L5d:
            r4 = r3
        L5e:
            boolean r5 = r4 instanceof j$.time.zone.a
            if (r5 != 0) goto L71
            j$.time.ZoneOffset r3 = r3.e()
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L6d
            goto L71
        L6d:
            int r1 = r1 + 1
            r3 = r4
            goto L27
        L71:
            return r4
        L72:
            return r3
        L73:
            int r7 = java.util.Arrays.binarySearch(r3, r7)
            j$.time.ZoneOffset[] r0 = r6.e
            if (r7 != r2) goto L7e
            r7 = r0[r1]
            return r7
        L7e:
            if (r7 >= 0) goto L84
            int r7 = -r7
            int r7 = r7 + (-2)
            goto L95
        L84:
            int r1 = r3.length
            int r1 = r1 + r2
            if (r7 >= r1) goto L95
            r1 = r3[r7]
            int r2 = r7 + 1
            r4 = r3[r2]
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L95
            r7 = r2
        L95:
            r1 = r7 & 1
            if (r1 != 0) goto Lbd
            r1 = r3[r7]
            int r2 = r7 + 1
            r2 = r3[r2]
            int r7 = r7 / 2
            r3 = r0[r7]
            int r7 = r7 + 1
            r7 = r0[r7]
            int r0 = r7.k()
            int r4 = r3.k()
            if (r0 <= r4) goto Lb7
            j$.time.zone.a r0 = new j$.time.zone.a
            r0.<init>(r1, r3, r7)
            return r0
        Lb7:
            j$.time.zone.a r0 = new j$.time.zone.a
            r0.<init>(r2, r3, r7)
            return r0
        Lbd:
            int r7 = r7 / 2
            int r7 = r7 + 1
            r7 = r0[r7]
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.c.c(j$.time.LocalDateTime):java.lang.Object");
    }

    public static c g(ZoneOffset zoneOffset) {
        Objects.a(zoneOffset, "offset");
        return new c(zoneOffset);
    }

    public final ZoneOffset b(Instant instant) {
        long[] jArr = this.c;
        if (jArr.length == 0) {
            return this.b[0];
        }
        long k = instant.k();
        int length = this.f.length;
        ZoneOffset[] zoneOffsetArr = this.e;
        if (length > 0 && k > jArr[jArr.length - 1]) {
            a[] a = a(g.u(j$.desugar.sun.nio.fs.a.e(zoneOffsetArr[zoneOffsetArr.length - 1].k() + k, 86400)).q());
            a aVar = null;
            for (int i2 = 0; i2 < a.length; i2++) {
                aVar = a[i2];
                if (k < aVar.h()) {
                    return aVar.e();
                }
            }
            return aVar.d();
        }
        int binarySearch = Arrays.binarySearch(jArr, k);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return zoneOffsetArr[binarySearch + 1];
    }

    public final a d(LocalDateTime localDateTime) {
        Object c = c(localDateTime);
        if (c instanceof a) {
            return (a) c;
        }
        return null;
    }

    public final List e(LocalDateTime localDateTime) {
        Object c = c(localDateTime);
        return c instanceof a ? ((a) c).f() : Collections.singletonList((ZoneOffset) c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        return Objects.equals(null, null) && Arrays.equals(this.a, cVar.a) && Arrays.equals(this.b, cVar.b) && Arrays.equals(this.c, cVar.c) && Arrays.equals(this.e, cVar.e) && Arrays.equals(this.f, cVar.f);
    }

    public final boolean f() {
        return this.c.length == 0;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(null) ^ Arrays.hashCode(this.a)) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.c)) ^ Arrays.hashCode(this.e)) ^ Arrays.hashCode(this.f);
    }

    public final String toString() {
        ZoneOffset[] zoneOffsetArr = this.b;
        String valueOf = String.valueOf(zoneOffsetArr[zoneOffsetArr.length - 1]);
        return "ZoneRules[currentStandardOffset=" + valueOf + "]";
    }
}
