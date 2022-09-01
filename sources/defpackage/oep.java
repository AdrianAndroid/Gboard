package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: oep  reason: default package */
/* loaded from: classes2.dex */
public final class oep implements oex {
    public final nsn a;
    private final Executor b;
    private final Executor c;
    private final oew d;
    private oex e;

    public oep(Executor executor, Executor executor2, oew oewVar, nsn nsnVar) {
        this.b = executor;
        this.c = executor2;
        this.d = oewVar;
        this.a = nsnVar;
    }

    @Override // defpackage.oex
    public final void a(nvu nvuVar) {
        int i = oiw.a;
        if (!nvuVar.k()) {
            this.c.execute(new cfy(this.a, nvuVar.q, 3));
        }
        this.b.execute(new oel(this, nvuVar));
    }

    @Override // defpackage.oex
    public final void b() {
        int i = oiw.a;
        this.b.execute(new oem(this));
    }

    public final oex c() {
        oex oexVar = this.e;
        if (oexVar != null) {
            return oexVar;
        }
        throw new IllegalStateException("listener unset");
    }

    @Override // defpackage.ofj
    public final void d(ofi ofiVar) {
        int i = oiw.a;
        this.b.execute(new oen(this, ofiVar));
    }

    @Override // defpackage.ofj
    public final void e() {
        int i = oiw.a;
        this.b.execute(new oeo(this));
    }

    public final void f(Throwable th) {
        this.d.e(nvu.d.e(th), new num());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(oex oexVar) {
        jdg.Q(oexVar, "listener must not be null");
        jdg.G(this.e == null, "Listener already set");
        this.e = oexVar;
    }
}
