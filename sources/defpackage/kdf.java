package defpackage;

/* compiled from: PG */
/* renamed from: kdf  reason: default package */
/* loaded from: classes.dex */
public final class kdf {
    public final onl a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final onb f;
    public final String g;
    public final onm h;

    public kdf(onl onlVar, Long l, Long l2, Long l3, Long l4, onb onbVar, String str, onm onmVar) {
        this.a = onlVar;
        this.b = l;
        this.c = l2;
        this.d = l3;
        this.e = l4;
        this.f = onbVar;
        this.g = str;
        this.h = onmVar;
    }

    public final String toString() {
        return String.format("StatsRecord:\n  elapsed: %d\n  current: %d\n  Primes version: %d\n  version name #: %d\n  customName: %s\n", this.b, this.c, this.d, this.e, this.g);
    }
}
