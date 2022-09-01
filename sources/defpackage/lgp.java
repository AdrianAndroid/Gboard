package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: lgp  reason: default package */
/* loaded from: classes.dex */
public final class lgp {
    private final long a = 0;
    private final long b = 0;
    private final long c = 0;
    private final long d = 0;
    private final long e = 0;
    private final long f = 0;

    public lgp() {
        jdg.v(true);
        jdg.v(true);
        jdg.v(true);
        jdg.v(true);
        jdg.v(true);
        jdg.v(true);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lgp) {
            lgp lgpVar = (lgp) obj;
            long j = lgpVar.a;
            long j2 = lgpVar.b;
            long j3 = lgpVar.c;
            long j4 = lgpVar.d;
            long j5 = lgpVar.e;
            long j6 = lgpVar.f;
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0L, 0L, 0L, 0L, 0L, 0L});
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.g("hitCount", 0L);
        S.g("missCount", 0L);
        S.g("loadSuccessCount", 0L);
        S.g("loadExceptionCount", 0L);
        S.g("totalLoadTime", 0L);
        S.g("evictionCount", 0L);
        return S.toString();
    }
}
