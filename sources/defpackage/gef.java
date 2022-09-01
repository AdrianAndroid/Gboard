package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gef  reason: default package */
/* loaded from: classes.dex */
public final class gef implements geo, gel, gek, geh {
    public final ged a;
    public final ger b;
    private final Executor c;

    public gef(Executor executor, ged gedVar, ger gerVar) {
        this.c = executor;
        this.a = gedVar;
        this.b = gerVar;
    }

    @Override // defpackage.geo
    public final void a() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.geo
    public final void b(gen genVar) {
        this.c.execute(new fso(this, genVar, 12));
    }

    @Override // defpackage.geh
    public final void c() {
        this.b.p();
    }

    @Override // defpackage.gek
    public final void d(Exception exc) {
        this.b.n(exc);
    }

    @Override // defpackage.gel
    public final void e(Object obj) {
        this.b.o(obj);
    }
}
