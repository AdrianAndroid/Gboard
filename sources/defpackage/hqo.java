package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: hqo  reason: default package */
/* loaded from: classes.dex */
public abstract class hqo implements ijj {
    public abstract void a(hqt hqtVar);

    public final void d(Executor executor) {
        ijl.b().h(this, hqp.class, executor);
    }

    public final void e(Executor executor) {
        ijl.b().c(this, hqp.class, executor);
    }

    public final void f() {
        ijl.b().d(this, hqp.class);
    }

    @Override // defpackage.ijj
    public final /* bridge */ /* synthetic */ void fd(ijg ijgVar) {
        a(((hqp) ijgVar).a);
    }

    @Override // defpackage.ijj
    public final /* synthetic */ void fe(Class cls) {
    }
}
