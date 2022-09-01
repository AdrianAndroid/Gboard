package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: dsy  reason: default package */
/* loaded from: classes.dex */
public abstract class dsy implements ijj {
    private dsx a = dsx.a;

    public abstract void a(dsx dsxVar, dsx dsxVar2);

    public final void d(Executor executor) {
        ijl.b().c(this, dsz.class, executor);
    }

    public final void e() {
        ijl.b().d(this, dsz.class);
    }

    @Override // defpackage.ijj
    public final /* bridge */ /* synthetic */ void fd(ijg ijgVar) {
        dsz dszVar = (dsz) ijgVar;
        a(this.a, dszVar.a);
        this.a = dszVar.a;
    }

    @Override // defpackage.ijj
    public final /* synthetic */ void fe(Class cls) {
    }
}
