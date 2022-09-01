package defpackage;

import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* renamed from: oed  reason: default package */
/* loaded from: classes2.dex */
final class oed {
    final int a;
    final long b;
    final long c;
    final double d;
    final Long e;
    final Set f;

    public oed(int i, long j, long j2, double d, Long l, Set set) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = d;
        this.e = l;
        this.f = lmz.p(set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oed)) {
            return false;
        }
        oed oedVar = (oed) obj;
        return this.a == oedVar.a && this.b == oedVar.b && this.c == oedVar.c && Double.compare(this.d, oedVar.d) == 0 && jdg.W(this.e, oedVar.e) && jdg.W(this.f, oedVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Double.valueOf(this.d), this.e, this.f});
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.f("maxAttempts", this.a);
        S.g("initialBackoffNanos", this.b);
        S.g("maxBackoffNanos", this.c);
        S.c("backoffMultiplier", String.valueOf(this.d));
        S.b("perAttemptRecvTimeoutNanos", this.e);
        S.b("retryableStatusCodes", this.f);
        return S.toString();
    }
}
