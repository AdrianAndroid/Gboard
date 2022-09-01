package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: kpk  reason: default package */
/* loaded from: classes.dex */
public final class kpk implements kpw {
    public final kpj a;
    private final kpi b;
    private final long c;
    private long d;

    public kpk(kpj kpjVar, kpi kpiVar, long j, TimeUnit timeUnit) {
        this.a = kpjVar;
        this.b = kpiVar;
        this.c = timeUnit.toMillis(j);
        this.d = kpiVar.a();
    }

    @Override // defpackage.kpw
    public final void a(int i) {
        this.a.a(i);
        if (this.b.a() - this.d >= this.c) {
            this.a.b();
            this.d = this.b.a();
        }
    }

    @Override // defpackage.kpw, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.b();
    }
}
