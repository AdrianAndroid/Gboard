package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: irw  reason: default package */
/* loaded from: classes.dex */
public class irw implements ijj {
    public void a() {
    }

    public void d() {
    }

    public final void e(Executor executor) {
        ijl.b().h(this, irx.class, executor);
    }

    public final void f(Executor executor) {
        ijl.b().c(this, irx.class, executor);
    }

    @Override // defpackage.ijj
    public final /* bridge */ /* synthetic */ void fd(ijg ijgVar) {
        if (((irx) ijgVar).a) {
            d();
        } else {
            a();
        }
    }

    @Override // defpackage.ijj
    public final /* synthetic */ void fe(Class cls) {
    }

    public final void g() {
        ijl.b().d(this, irx.class);
    }
}
