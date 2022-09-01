package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gee  reason: default package */
/* loaded from: classes.dex */
public final class gee implements geo {
    public final ger a;
    private final Executor b;

    public gee(Executor executor, ger gerVar) {
        this.b = executor;
        this.a = gerVar;
    }

    @Override // defpackage.geo
    public final void a() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.geo
    public final void b(gen genVar) {
        this.b.execute(new fso(this, genVar, 11));
    }
}
