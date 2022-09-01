package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: iye  reason: default package */
/* loaded from: classes.dex */
public abstract class iye implements ijj {
    public abstract void a();

    public final void d(Executor executor) {
        ijl.b().h(this, iyf.class, executor);
    }

    public final void e() {
        ijl.b().d(this, iyf.class);
    }

    @Override // defpackage.ijj
    public final /* synthetic */ void fd(ijg ijgVar) {
        iyf iyfVar = (iyf) ijgVar;
        a();
    }

    @Override // defpackage.ijj
    public final /* synthetic */ void fe(Class cls) {
    }
}
