package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: gnp  reason: default package */
/* loaded from: classes.dex */
public abstract class gnp implements gnn {
    public final Class a;

    public gnp(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.gnn
    public final void a(mko mkoVar, gnl gnlVar) {
        kcu.U(mkoVar, new gnr(this.a, gnlVar, 0), new glh(this, 6));
    }

    @Override // defpackage.gnn
    public final mko b(gnk gnkVar) {
        return f(new gnq(this.a, gnkVar, 0));
    }

    @Override // defpackage.gnn
    public final mko c(gnk gnkVar) {
        return kcu.P(gqn.f(this.a, gnkVar), new glh(this, 7));
    }

    @Override // defpackage.gnn
    public final void d(gnm gnmVar) {
        h(gqn.g(this.a, gnmVar));
    }

    @Override // defpackage.gnn
    public final void e(long j, gnm gnmVar) {
        g(j, gqn.g(this.a, gnmVar));
    }

    protected abstract mko f(Callable callable);

    public abstract void g(long j, Runnable runnable);

    public abstract void h(Runnable runnable);
}
