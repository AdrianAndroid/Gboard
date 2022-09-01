package defpackage;

import j$.util.Objects;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: klc  reason: default package */
/* loaded from: classes.dex */
public final class klc {
    private final String a;
    private final Set b;
    private final boolean c;
    private final boolean d;

    public klc(String str) {
        this(str, lrr.a, false, false);
    }

    private klc(String str, Set set, boolean z, boolean z2) {
        this.a = str;
        this.b = set;
        this.c = z;
        this.d = z2;
    }

    public final kky a(String str, long j) {
        String str2 = this.a;
        Long valueOf = Long.valueOf(j);
        boolean z = this.c;
        boolean z2 = this.d;
        lmz p = lmz.p(this.b);
        kla klaVar = kla.a;
        Objects.requireNonNull(Long.class);
        return new kky(str2, str, valueOf, new kkh(z, z2, p, klaVar, new kkz(Long.class, 3)));
    }

    public final kky b(String str, boolean z) {
        String str2 = this.a;
        Boolean valueOf = Boolean.valueOf(z);
        boolean z2 = this.c;
        boolean z3 = this.d;
        lmz p = lmz.p(this.b);
        kla klaVar = kla.b;
        Objects.requireNonNull(Boolean.class);
        return new kky(str2, str, valueOf, new kkh(z2, z3, p, klaVar, new kkz(Boolean.class, 2)));
    }

    public final kky c(String str, Object obj, klb klbVar) {
        return new kky(this.a, str, obj, new kkh(this.c, this.d, lmz.p(this.b), new kkz(klbVar, 1), new kkz(klbVar, 0)));
    }

    public final klc d() {
        return new klc(this.a, this.b, true, this.d);
    }

    public final klc e() {
        return new klc(this.a, this.b, this.c, true);
    }

    public final klc f(List list) {
        return new klc(this.a, lmz.p(list), this.c, this.d);
    }
}
