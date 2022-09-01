package defpackage;

import java.io.File;

/* compiled from: PG */
/* renamed from: jvn  reason: default package */
/* loaded from: classes.dex */
public final class jvn {
    public final jsr a;
    public final File b;
    private final jrp c;
    private final jru d;
    private final jup e;
    private final juq f;
    private long g = -1;
    private jup h;

    /* JADX WARN: Type inference failed for: r4v7, types: [juq, java.lang.Object] */
    public jvn(kom komVar, byte[] bArr) {
        this.a = (jsr) komVar.a;
        this.b = (File) komVar.c;
        this.e = (jup) komVar.b;
        this.f = komVar.d;
        this.c = (jrp) komVar.f;
        Object obj = komVar.e;
        this.d = (jru) (obj == null ? jru.a : obj);
    }

    public static kom d() {
        return new kom();
    }

    public final int a() {
        return this.c.c(c().a());
    }

    public final long b() {
        long j = this.g;
        if (j < 0) {
            long a = this.d.a(this.b);
            this.g = a;
            return a;
        }
        return j;
    }

    public final jup c() {
        if (this.h == null) {
            jup jupVar = this.e;
            if (jupVar == null) {
                juq juqVar = this.f;
                jdg.u(juqVar);
                jupVar = juqVar.a(this.a);
            }
            jdg.u(jupVar);
            this.h = jupVar;
        }
        return this.h;
    }

    public final String toString() {
        return this.a.toString();
    }
}
